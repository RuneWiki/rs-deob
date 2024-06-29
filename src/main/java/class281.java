import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class281 extends class354 {

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lof;")
    public static class446 field3974 = new class446("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Z")
    public static boolean field3983 = false;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Ll;")
    public static class15 field3984;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "Luu;")
    public static class191 field3979;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
    public static int[] field3975;

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class281() {
        super(1, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
    public static final void method1798(int arg0, boolean arg1) {
        ++field3980;
        class70.field975.method2140(-111, arg0);
        class81.field1184.method2140(-115, arg0);
        class515.field7567.method2140(-106, arg0);
        class259.field3636.method2140(-127, arg0);
        class166.field2250.method2140(-126, arg0);
        if (arg1) {
            method1801((class191) null, -115);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Luo;IBZLuo;)I")
    public static final int method1799(class412 arg0, int arg1, byte arg2, boolean arg3, class412 arg4) {
        ++field3981;
        if (arg1 == 1) {
            int var5 = arg4.field6155;
            int var6 = arg0.field6155;
            if (!arg3) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (arg1 == 2) {
            return class409.method2525(0, arg4.method2541(4).field520, arg0.method2541(4).field520, class257.field3556);
        } else if (arg1 == 3) {
            if (arg4.field6260.equals("-")) {
                if (arg0.field6260.equals("-")) {
                    return 0;
                } else {
                    return !arg3 ? 1 : -1;
                }
            } else if (arg0.field6260.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class409.method2525(0, arg4.field6260, arg0.field6260, class257.field3556);
            }
        } else if (arg1 == 4) {
            if (arg4.method2506((byte) 115)) {
                return arg0.method2506((byte) 91) ? 0 : 1;
            } else {
                return !arg0.method2506((byte) 95) ? 0 : -1;
            }
        } else if (~arg1 == -6) {
            if (!arg4.method2508((byte) 103)) {
                return arg0.method2508((byte) 100) ? -1 : 0;
            } else {
                return !arg0.method2508((byte) 104) ? 1 : 0;
            }
        } else {
            if (arg2 > -1) {
                method1798(48, false);
            }
            if (arg1 == 6) {
                if (arg4.method2510((byte) 123)) {
                    return arg0.method2510((byte) 65) ? 0 : 1;
                } else {
                    return !arg0.method2510((byte) 123) ? 0 : -1;
                }
            } else if (arg1 == 7) {
                if (!arg4.method2509(117)) {
                    return !arg0.method2509(-96) ? 0 : -1;
                } else {
                    return arg0.method2509(122) ? 0 : 1;
                }
            } else if (~arg1 == -9) {
                int var7 = arg4.field6261;
                int var8 = arg0.field6261;
                if (!arg3) {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                } else {
                    if (~var7 == -1001) {
                        var7 = -1;
                    }
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                }
                return -var8 + var7;
            } else {
                return -arg0.field6264 + arg4.field6264;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZIII)V")
    public static final void method1800(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -11252) {
            method1800(92, false, 121, -85, -33);
        }
        if (~class378.field5771 == -1) {
            class229.method1543(false, arg2 + 11316);
        } else {
            class282.field4148 = class378.field5771;
            class170.method1152(117, 0);
        }
        ++field3985;
        class194.field2596 = arg4;
        class251.field3494 = arg1;
        class501.field7398 = arg0;
        class12.method115(arg3);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field3977;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[][] var4 = this.method2274((byte) 84, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class531.field7814; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        if (arg0 >= -74) {
            method1800(11, true, -40, 5, 85);
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Luu;I)V")
    public static final void method1801(class191 arg0, int arg1) {
        ++field3976;
        if (arg1 > -56) {
            field3978 = 110;
        }
        field3979 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method1802(byte arg0) {
        field3979 = null;
        if (arg0 > 46) {
            field3975 = null;
            field3984 = null;
            field3974 = null;
        }
    }
}
