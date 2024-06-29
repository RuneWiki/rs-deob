import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class78 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "S")
    public short field920;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public boolean field926;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "S")
    public short field929;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "S")
    public short field925;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "B")
    public byte field917;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[S")
    public static short[] field915 = new short[] { 44, 3, 30, 10, 13, 5, 16, 9 };

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Leba;")
    public static class550 field916 = new class550(110, 4);

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIII)V", line = 7)
    public static final void method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field927++;
        int var9 = 107 % ((arg3 + 50) / 49);
        if (arg5 < 1 || arg2 < 1 || class703.field9886 - 2 < arg5 || (class431.field5789 - 2) < arg2) {
            return;
        }
        int var10 = arg6;
        if (arg6 < 3 && class8.method44(arg2, arg5, 15090)) {
            var10 = arg6 + 1;
        }
        if (!class602.field8408.method3554(class618.field8566, (byte) -122) && !class452.method2541(class32.field454, arg2, var10, arg5, 0)) {
            return;
        }
        if (class153.field2168 == null) {
            return;
        }
        class327.field4403.method1457(-5, arg0, arg5, arg6, class322.field4302[arg6], arg2, class146.field1963);
        if (arg4 < 0) {
            return;
        }
        boolean var11 = class602.field8408.field4300;
        class602.field8408.field4300 = true;
        class327.field4403.method1462(arg1, var10, arg5, arg8, class322.field4302[arg6], class146.field1963, arg2, 6766, arg4, arg6, arg7);
        class602.field8408.field4300 = var11;
        return;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljd;II)V", line = 49)
    public static final void method425(class537 arg0, int arg1, int arg2) {
        field924++;
        boolean var3 = arg0.method3008(false, 1) == 1;
        if (var3) {
            class573.field7829[class564.field7691++] = arg1;
        }
        int var4 = -89 % ((arg2 - 44) / 35);
        int var5 = arg0.method3008(false, 2);
        class573 var6 = class513.field7145[arg1];
        if (var5 == 0) {
            if (var3) {
                var6.field7813 = false;
            } else if (class423.field5702 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class228 var7 = class11.field145[arg1] = new class228();
                var7.field2957 = (class4.field23 + var6.field3086[0] >> 6) + ((var6.field385 << 28) + (class125.field1745 + var6.field3088[0] >> 6 << 14));
                if (var6.field7806 == -1) {
                    var7.field2958 = var6.field3027.method3603(63);
                } else {
                    var7.field2958 = var6.field7806;
                }
                var7.field2961 = var6.field7818;
                var7.field2954 = var6.field3045;
                if (var6.field7793 > 0) {
                    class617.method3415(false, var6);
                }
                class513.field7145[arg1] = null;
                if (arg0.method3008(false, 1) != 0) {
                    class696.method3932(arg1, 255, arg0);
                }
            }
        } else if (var5 == 1) {
            int var8 = arg0.method3008(false, 3);
            int var9 = var6.field3088[0];
            int var10 = var6.field3086[0];
            if (var8 == 0) {
                var9--;
                var10--;
            } else if (var8 == 1) {
                var10--;
            } else if (var8 == 2) {
                var10--;
                var9++;
            } else if (var8 == 3) {
                var9--;
            } else if (var8 == 4) {
                var9++;
            } else if (var8 == 5) {
                var9--;
                var10++;
            } else if (var8 == 6) {
                var10++;
            } else if (var8 == 7) {
                var10++;
                var9++;
            }
            if (var3) {
                var6.field7800 = var9;
                var6.field7813 = true;
                var6.field7822 = var10;
            } else {
                var6.method3170(var9, -1, var10, class394.field5265[arg1]);
            }
        } else if (var5 == 2) {
            int var11 = arg0.method3008(false, 4);
            int var12 = var6.field3088[0];
            int var13 = var6.field3086[0];
            if (var11 == 0) {
                var12 -= 2;
                var13 -= 2;
            } else if (var11 == 1) {
                var12--;
                var13 -= 2;
            } else if (var11 == 2) {
                var13 -= 2;
            } else if (var11 == 3) {
                var12++;
                var13 -= 2;
            } else if (var11 == 4) {
                var13 -= 2;
                var12 += 2;
            } else if (var11 == 5) {
                var12 -= 2;
                var13--;
            } else if (var11 == 6) {
                var13--;
                var12 += 2;
            } else if (var11 == 7) {
                var12 -= 2;
            } else if (var11 == 8) {
                var12 += 2;
            } else if (var11 == 9) {
                var12 -= 2;
                var13++;
            } else if (var11 == 10) {
                var13++;
                var12 += 2;
            } else if (var11 == 11) {
                var12 -= 2;
                var13 += 2;
            } else if (var11 == 12) {
                var13 += 2;
                var12--;
            } else if (var11 == 13) {
                var13 += 2;
            } else if (var11 == 14) {
                var12++;
                var13 += 2;
            } else if (var11 == 15) {
                var12 += 2;
                var13 += 2;
            }
            if (var3) {
                var6.field7800 = var12;
                var6.field7822 = var13;
                var6.field7813 = true;
            } else {
                var6.method3170(var12, -1, var13, class394.field5265[arg1]);
            }
        } else {
            int var14 = arg0.method3008(false, 1);
            if (var14 == 0) {
                int var15 = arg0.method3008(false, 12);
                int var16 = var15 >> 10;
                int var17 = var15 >> 5 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var15 & 0x1F;
                if (var18 > 15) {
                    var18 -= 32;
                }
                int var19 = var6.field3088[0] + var17;
                int var20 = var6.field3086[0] + var18;
                if (var3) {
                    var6.field7813 = true;
                    var6.field7822 = var20;
                    var6.field7800 = var19;
                } else {
                    var6.method3170(var19, -1, var20, class394.field5265[arg1]);
                }
                var6.field385 = var6.field386 = (byte) (var6.field385 + var16 & 0x3);
                if (class8.method44(var20, var19, 15090)) {
                    var6.field386++;
                }
                if (class423.field5702 == arg1) {
                    class298.field3942 = var6.field385;
                }
            } else {
                int var21 = arg0.method3008(false, 30);
                int var22 = var21 >> 28;
                int var23 = (var21 & 0xFFFDF96) >> 14;
                int var24 = var21 & 0x3FFF;
                int var25 = (class125.field1745 + var23 + var6.field3088[0] & 0x3FFF) - class125.field1745;
                int var26 = (var6.field3086[0] + class4.field23 + var24 & 0x3FFF) - class4.field23;
                if (var3) {
                    var6.field7800 = var25;
                    var6.field7813 = true;
                    var6.field7822 = var26;
                } else {
                    var6.method3170(var25, -1, var26, class394.field5265[arg1]);
                }
                var6.field385 = var6.field386 = (byte) (var6.field385 + var22 & 0x3);
                if (class8.method44(var26, var25, 15090)) {
                    var6.field386++;
                }
                if (class423.field5702 == arg1) {
                    class298.field3942 = var6.field385;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 383)
    public static void method426(int arg0) {
        field916 = null;
        if (arg0 != -10274) {
            field915 = null;
        }
        field915 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 401)
    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field920 = (short) arg5;
        this.field922 = arg1;
        this.field926 = arg10;
        this.field929 = (short) arg4;
        this.field925 = (short) arg6;
        this.field919 = arg2;
        this.field928 = arg11;
        this.field918 = arg3;
        this.field917 = (byte) arg8;
        this.field921 = arg0;
    }
}
