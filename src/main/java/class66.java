import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class66 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
    public static int[] field938 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "[S")
    public static short[] field940 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
    public static int[] field944 = new int[14];

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Z")
    public static boolean field945 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lic;")
    public static class319 field939 = class306.method2119(true);

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[[[B")
    public static byte[][][] field943;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 11)
    public static void method523(int arg0) {
        field939 = null;
        field938 = null;
        field943 = (byte[][][]) null;
        field940 = null;
        field944 = null;
        if (arg0 != -1) {
            method527(-49);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I", line = 26)
    public static final int method525(int arg0, int arg1) {
        if (arg0 == 1023) {
            field941++;
            return arg1 & 0x3FF;
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 40)
    public static final void method527(int arg0) {
        field946++;
        int var1 = 0;
        if (arg0 != 19468) {
            method523(-78);
        }
        while (var1 < class43.field600) {
            int var10002 = class86.field1161[var1]--;
            if (class86.field1161[var1] >= -10) {
                label92: {
                    class324 var3 = class121.field1715[var1];
                    if (var3 == null) {
                        var3 = class324.method2279(class18.field301, class237.field3725[var1], 0);
                        if (var3 == null) {
                            break label92;
                        }
                        class86.field1161[var1] += var3.method2280();
                        class121.field1715[var1] = var3;
                    }
                    if (class86.field1161[var1] < 0) {
                        label95: {
                            int var10;
                            if (class22.field347[var1] == 0) {
                                var10 = class161.field2556[var1] * class144.field2277 >> 8;
                            } else {
                                int var4 = (class22.field347[var1] & 0xFF) * 128;
                                int var5 = class22.field347[var1] >> 16 & 0xFF;
                                int var6 = var5 * 128 + 64 - class146.field2310.field4698;
                                if (var6 < 0) {
                                    var6 = -var6;
                                }
                                int var7 = class22.field347[var1] >> 8 & 0xFF;
                                int var8 = var7 * 128 + 64 - class146.field2310.field4731;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var6 + var8 - 128;
                                if (var4 < var9) {
                                    class86.field1161[var1] = -100;
                                    break label95;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class10.field183 * class161.field2556[var1] / var4 >> 8;
                            }
                            if (var10 > 0) {
                                class266 var11 = var3.method2282().method1898(class120.field1671);
                                class17 var12 = class17.method183(var11, 100, var10);
                                var12.method185(class334.field5207[var1] - 1);
                                class86.field1174.method1314(var12);
                            }
                            class86.field1161[var1] = -100;
                        }
                    }
                }
            } else {
                class43.field600--;
                for (int var2 = var1; var2 < class43.field600; var2++) {
                    class237.field3725[var2] = class237.field3725[var2 + 1];
                    class121.field1715[var2] = class121.field1715[var2 + 1];
                    class334.field5207[var2] = class334.field5207[var2 + 1];
                    class86.field1161[var2] = class86.field1161[var2 + 1];
                    class22.field347[var2] = class22.field347[var2 + 1];
                    class161.field2556[var2] = class161.field2556[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class4.field43 && !class65.method519(110)) {
            if (class204.field3233 != 0 && class149.field2331 != -1) {
                class76.method573(class149.field2331, class204.field3233, -1, false, 0, class249.field3913);
            }
            class4.field43 = false;
        } else if (class204.field3233 != 0 && class149.field2331 != -1 && !class65.method519(arg0 ^ 0x4C69)) {
            class295.field4580++;
            class183.field2965.method1947((byte) 88, 190);
            class183.field2965.method34(class149.field2331, arg0 + 294315676);
            class149.field2331 = -1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method522(Component arg0, byte arg1);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method524(Component arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)I")
    public abstract int method526(int arg0);
}
