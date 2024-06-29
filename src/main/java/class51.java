import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class51 extends class221 {

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field697 = "Loading config - ";

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
    public static boolean field696 = false;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 9)
    public static final void method349(int arg0, int arg1) {
        class206.field3363 = -1;
        class242.field3841 = arg1;
        class138.field2069 = -1;
        class319.method2235((byte) -107);
        field700++;
        if (arg0 != 100) {
            method352(-47);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)I", line = 23)
    public static final int method350(int arg0) {
        if (arg0 == 64) {
            field698++;
            return class42.field586;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 35)
    public static void method351(int arg0) {
        field697 = null;
        if (arg0 <= 80) {
            method352(75);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 47)
    public static final void method352(int arg0) {
        for (int var1 = 0; var1 < class126.field1879; var1++) {
            int var10002 = class228.field3618[var1]--;
            if (class228.field3618[var1] >= -10) {
                class108 var2 = class343.field5353[var1];
                if (var2 == null) {
                    var2 = class108.method746(class35.field469, class315.field4900[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class228.field3618[var1] += var2.method744();
                    class343.field5353[var1] = var2;
                }
                if (class228.field3618[var1] < 0) {
                    int var9;
                    if (class336.field5218[var1] == 0) {
                        var9 = class152.field2328[var1] * class337.field5229 >> 8;
                    } else {
                        int var3 = class336.field5218[var1] >> 16 & 0xFF;
                        int var4 = (class336.field5218[var1] & 0xFF) * 128;
                        int var5 = var3 * 128 + 64 - class13.field159.field1980;
                        int var6 = class336.field5218[var1] >> 8 & 0xFF;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var7 = var6 * 128 + 64 - class13.field159.field1944;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var4 < var8) {
                            class228.field3618[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var4 - var8) * class139.field2076 * class152.field2328[var1] / var4 >> 8;
                    }
                    if (var9 > 0) {
                        class267 var10 = var2.method745().method1892(class200.field3287);
                        class141 var11 = class141.method944(var10, 100, var9);
                        var11.method979(class66.field855[var1] - 1);
                        class107.field1622.method741(var11);
                    }
                    class228.field3618[var1] = -100;
                }
            } else {
                class126.field1879--;
                for (int var12 = var1; var12 < class126.field1879; var12++) {
                    class315.field4900[var12] = class315.field4900[var12 + 1];
                    class343.field5353[var12] = class343.field5353[var12 + 1];
                    class66.field855[var12] = class66.field855[var12 + 1];
                    class228.field3618[var12] = class228.field3618[var12 + 1];
                    class336.field5218[var12] = class336.field5218[var12 + 1];
                    class152.field2328[var12] = class152.field2328[var12 + 1];
                }
                var1--;
            }
        }
        if (class334.field5181 && !class36.method232(-100)) {
            if (class13.field164 != 0 && class59.field771 != -1) {
                class12.method69(class139.field2077, 127, 0, class13.field164, false, class59.field771);
            }
            class334.field5181 = false;
        } else if (class13.field164 != 0 && class59.field771 != -1 && !class36.method232(-126)) {
            class21.field313.method1541(arg0 ^ 0xFFFFF00A, 187);
            class284.field4476++;
            class21.field313.method1350(class59.field771, -103);
            class59.field771 = -1;
        }
        field699++;
        if (arg0 != 3989) {
            method351(-93);
        }
    }
}
