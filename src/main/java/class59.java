import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class59 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1147 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lob;")
    private static class141 field1148 = class175.method1195(40, "Use");

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lob;")
    public static class141 field1151 = class175.method1195(40, "k");

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lob;")
    public static class141 field1150 = field1148;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[Z")
    public static boolean[] field1145 = new boolean[8];

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lob;")
    private static class141 field1156 = class175.method1195(40, "Please contact customer support)3");

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lob;")
    public static class141 field1157 = field1156;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lca;")
    public static class22 field1146;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JIZI)Lob;")
    public static final class141 method396(long arg0, int arg1, boolean arg2, int arg3) {
        field1149++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg3 == -15271) {
            int var5 = 1;
            long var6 = arg0 / (long) arg1;
            while (var6 != 0L) {
                var6 /= arg1;
                var5++;
            }
            int var8 = var5;
            if (arg0 < 0L || arg2) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (arg0 < 0L) {
                var9[0] = 45;
            } else if (arg2) {
                var9[0] = 43;
            }
            for (int var10 = 0; var10 < var5; var10++) {
                int var12 = (int) (arg0 % (long) arg1);
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 9) {
                    var12 += 39;
                }
                arg0 /= arg1;
                var9[var8 - var10 - 1] = (byte) (var12 + 48);
            }
            class141 var11 = new class141();
            var11.field2701 = var9;
            var11.field2705 = var8;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static final void method397(int arg0) {
        for (int var1 = 0; var1 < class165.field3199; var1++) {
            int var2 = class125.field2416[var1];
            class131 var3 = class10.field172[var2];
            int var4 = class156.field3014.method991(arg0 + 223);
            if ((var4 & 0x8) != 0) {
                int var5 = class156.field3014.method1015((byte) 110);
                int var6 = class156.field3014.method967((byte) -127);
                if (var5 == 65535) {
                    var5 = -1;
                }
                if (var3.field3851 == var5 && var5 != -1) {
                    class26 var7 = class114.method736(15619, var5);
                    int var8 = var7.field493;
                    if (var8 == 1) {
                        var3.field3862 = 0;
                        var3.field3841 = 0;
                        var3.field3861 = var6;
                        var3.field3875 = 0;
                        class9.method60(var3.field3889, var7, false, var3.field3875, false, var3.field3854);
                    }
                    if (var8 == 2) {
                        var3.field3862 = 0;
                    }
                } else if (var5 == -1 || var3.field3851 == -1 || class114.method736(15619, var5).field482 >= class114.method736(arg0 + 15587, var3.field3851).field482) {
                    var3.field3893 = var3.field3832;
                    var3.field3862 = 0;
                    var3.field3851 = var5;
                    var3.field3841 = 0;
                    var3.field3875 = 0;
                    var3.field3861 = var6;
                    if (var3.field3851 != -1) {
                        class9.method60(var3.field3889, class114.method736(arg0 ^ 0x3D23, var3.field3851), false, var3.field3875, false, var3.field3854);
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field3866 = class156.field3014.method1013(-19405);
                var3.field3886 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var9 = class156.field3014.method991(255);
                int var10 = class156.field3014.method974(-711444088);
                var3.method1347(var9, class20.field344, var10, false);
                var3.field3880 = class20.field344 + 300;
                var3.field3863 = class156.field3014.method1002(-8544);
            }
            if ((var4 & 0x80) != 0) {
                var3.field3877 = class156.field3014.method982((byte) -72);
                if (var3.field3877 == 65535) {
                    var3.field3877 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field2507 = class50.method323(class156.field3014.method982((byte) 106), 0);
                var3.field3859 = var3.field2507.field211;
                var3.field3837 = var3.field2507.field194;
                var3.field3860 = var3.field2507.field165;
                var3.field3882 = var3.field2507.field212;
                var3.field3871 = var3.field2507.field205;
                var3.field3839 = var3.field2507.field214;
                var3.field3874 = var3.field2507.field204;
                var3.field3830 = var3.field2507.field192;
                var3.field3848 = var3.field2507.field191;
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class156.field3014.method967((byte) -127);
                int var12 = class156.field3014.method991(arg0 + 223);
                var3.method1347(var11, class20.field344, var12, false);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3827 = class156.field3014.method1015((byte) 110);
                int var13 = class156.field3014.method1006(arg0 - 1234576320);
                var3.field3829 = var13 >> 16;
                if (var3.field3827 == 65535) {
                    var3.field3827 = -1;
                }
                var3.field3894 = (var13 & 0xFFFF) + class20.field344;
                var3.field3838 = 0;
                var3.field3883 = 0;
                if (var3.field3894 > class20.field344) {
                    var3.field3883 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field3879 = class156.field3014.method982((byte) 84);
                var3.field3850 = class156.field3014.method965((byte) -118);
            }
        }
        if (arg0 != 32) {
            method400(-84);
        }
        field1154++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZII)V")
    public static final void method398(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1155++;
        if (!arg2) {
            return;
        }
        if (arg1 >= arg3) {
            class180.method1217(arg1, (byte) 52, arg3, arg4, class41.field805[arg0]);
        } else {
            class180.method1217(arg3, (byte) 52, arg1, arg4, class41.field805[arg0]);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lra;B)V")
    public static final void method399(class170 arg0, byte arg1) {
        int var2 = arg0.field3314;
        if (arg1 <= 25) {
            field1156 = null;
        }
        field1153++;
        if (var2 == 324) {
            if (class104.field2007 == -1) {
                class172.field3411 = arg0.field3270;
                class104.field2007 = arg0.field3264;
            }
            if (class144.field2779.field1464) {
                arg0.field3264 = class104.field2007;
            } else {
                arg0.field3264 = class172.field3411;
            }
        } else if (var2 == 325) {
            if (class104.field2007 == -1) {
                class104.field2007 = arg0.field3264;
                class172.field3411 = arg0.field3270;
            }
            if (class144.field2779.field1464) {
                arg0.field3264 = class172.field3411;
            } else {
                arg0.field3264 = class104.field2007;
            }
        } else if (var2 == 327) {
            arg0.field3272 = 150;
            arg0.field3306 = (int) (Math.sin((double) class20.field344 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3327 = -1;
            arg0.field3315 = 5;
        } else if (var2 == 328) {
            if (class114.field2176.field773 == null) {
                arg0.field3327 = 0;
            } else {
                arg0.field3272 = 150;
                arg0.field3306 = (int) (Math.sin((double) class20.field344 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3315 = 5;
                arg0.field3327 = ((int) class114.field2176.field773.method926(19790) << 11) + 2047;
                arg0.field3406 = class114.field2176.field3887;
                arg0.field3379 = class114.field2176.field3828;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method400(int arg0) {
        field1146 = null;
        field1151 = null;
        if (arg0 != 48) {
            return;
        }
        field1157 = null;
        field1148 = null;
        field1145 = null;
        field1156 = null;
        field1150 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(DI)V")
    public static final void method401(double arg0, int arg1) {
        field1152++;
        if (class179.field3532 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class195.field3740[var3] = var4 <= 255 ? var4 : 255;
            }
            class179.field3532 = arg0;
        }
        if (arg1 > -48) {
            method396(-109L, -128, true, 34);
        }
    }
}
