import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class179 {

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2 = "Select";

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "Lg;")
    public class177 field7;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "Lrm;")
    public static class268 field9;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "[B")
    public byte[] field12;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1(int arg0, int arg1, int arg2) {
        field8++;
        if (arg0 != -1) {
            field2 = (String) null;
        }
        for (int var3 = 0; var3 < class184.field3118; var3++) {
            class354 var4 = class300.method2076(var3, -54);
            if (var4 != null) {
                int var5 = var4.field5593;
                if (var5 >= 0 && !class62.field953.method1226(var5, true)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field5597 >= 0) {
                    int var10 = var4.field5597;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class62.field955[class24.method231(96, -3, var12)];
                } else if (var5 >= 0) {
                    var6 = class62.field955[class24.method231(96, arg0 ^ 0x2, class62.field953.method1220(var5, -110))];
                } else if (var4.field5588 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field5588;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class62.field955[class24.method231(96, arg0 ^ 0x2, var9)];
                }
                class282.field4470[var3 + 1] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 81)
    public static void method2(byte arg0) {
        if (arg0 != 111) {
            field3 = -122;
        }
        field9 = null;
        field2 = null;
        field6 = null;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I", line = 100)
    public final int method3(int arg0) {
        field1++;
        if (this.field3029) {
            return 0;
        } else if (arg0 == 0) {
            return 100;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)[B", line = 119)
    public final byte[] method4(int arg0) {
        field5++;
        if (this.field3029) {
            throw new RuntimeException();
        }
        if (arg0 != 0) {
            this.method4(-114);
        }
        return this.field12;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)Lhk;", line = 137)
    public static final class330 method5(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class330 var4 = var3.field4140;
            var3.field4140 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V", line = 150)
    public static final void method6(int arg0) {
        field11++;
        class248.field4032 = null;
        class113.method964((byte) 123, 0, class313.field4973, -1, 0, 0, 0, class188.field3152, class311.field4933);
        if (class248.field4032 != null) {
            class33.method298(class313.field4973, class276.field4399, true, class248.field4032, -1412584499, class28.field387, 0, class272.field4343.field2391, class188.field3152, 0);
            class248.field4032 = null;
        }
        if (arg0 != -24489) {
            method1(-26, 30, -69);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V", line = 172)
    public static final void method7(boolean arg0, byte arg1) {
        field4++;
        if (class258.field4175 == arg0) {
            return;
        }
        class258.field4175 = arg0;
        if (arg1 != 35) {
            method5(-61, 4, 84);
        }
        class224.method1633(false);
    }
}
