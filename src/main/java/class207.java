import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class207 extends class232 {

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private int field3607 = 0;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    private int field3614 = 16;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field3606 = 0;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    private int field3618 = 2000;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    private int field3622 = 4096;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[S")
    public static short[] field3609 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lhi;")
    public static class82 field3611 = class95.method664((byte) -49, "<)4col>");

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "Z")
    public static boolean field3610 = false;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field3623 = 100;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Z")
    public static boolean field3619;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V", line = 6)
    public static final void method1480(int arg0, int arg1) {
        field3617++;
        short var2 = 256;
        if (arg1 != -26558) {
            field3620 = -8;
        }
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class132.field2289 += arg0 * 128;
        if (class150.field2561.length < class132.field2289) {
            class132.field2289 -= class150.field2561.length;
            int var3 = (int) (Math.random() * 12.0D);
            class60.method396(class238.field4142[var3], 50);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class263.field4491[var4 + var5] - class150.field2561[class150.field2561.length - 1 & class132.field2289 + var4] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class263.field4491[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class263.field4491[var10 + var11] = 255;
                } else {
                    class263.field4491[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class187.field3152[var13] = class187.field3152[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class187.field3152[var14] = (int) (Math.sin((double) class144.field2464 / 14.0D) * 16.0D + Math.sin((double) class144.field2464 / 15.0D) * 14.0D + Math.sin((double) class144.field2464 / 16.0D) * 12.0D);
            class144.field2464++;
        }
        int var15 = ((class212.field3708 & 0x1) + arg0) / 2;
        class230.field3974 += arg0;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class230.field3974; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class263.field4491[var17 + (var18 << 7)] = 192;
        }
        class230.field3974 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class263.field4491[var21 + var22 + var15];
                }
                if (-(var15 - var22) - 1 >= 0) {
                    var20 -= class263.field4491[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class83.field1486[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class83.field1486[var23 + (var15 * 128) + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class83.field1486[-(var15 * 128) - (128 - (var23 + var26))];
                }
                if (var25 >= 0) {
                    class263.field4491[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIBIII)V", line = 181)
    private static final void method1481(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3612++;
        int var8 = arg0 - arg5;
        int var9 = arg5 + arg6;
        int var10 = arg1 - arg5;
        int var11 = arg3 + arg5;
        for (int var12 = arg3; var12 < var11; var12++) {
            class114.method780(-38, arg6, arg1, arg2, class73.field1117[var12]);
        }
        for (int var13 = arg0; var13 > var8; var13--) {
            class114.method780(-53, arg6, arg1, arg2, class73.field1117[var13]);
        }
        for (int var14 = var11; var14 <= var8; var14++) {
            int[] var15 = class73.field1117[var14];
            class114.method780(85, arg6, var9, arg2, var15);
            class114.method780(90, var9, var10, arg7, var15);
            class114.method780(96, var10, arg1, arg2, var15);
        }
        if (arg4 != -45) {
            field3610 = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIBIII)V", line = 226)
    public static final void method1482(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -62) {
            field3610 = false;
        }
        if (class200.field3443 <= arg2 && field3623 >= arg7 && arg5 >= class60.field931 && class29.field399 >= arg0) {
            method1481(arg0, arg7, arg3, arg5, (byte) -45, arg1, arg2, arg6);
        } else {
            class286.method1990(-1, arg7, arg3, arg1, arg6, arg5, arg0, arg2);
        }
        field3608++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLbc;)V", line = 245)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            return;
        }
        if (arg0 == 0) {
            this.field3606 = arg2.method1082(-88);
        } else if (arg0 == 1) {
            this.field3618 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field3614 = arg2.method1082(-71);
        } else if (arg0 == 3) {
            this.field3607 = arg2.method1090(false);
        } else if (arg0 == 4) {
            this.field3622 = arg2.method1090(false);
        }
        field3613++;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 305)
    public static void method1483(byte arg0) {
        field3609 = null;
        if (arg0 > -122) {
            method1480(59, 16);
        }
        field3611 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 576)
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)[I", line = 324)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = -123 % ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -88, arg0);
        field3615++;
        if (this.field4008.field256) {
            int var5 = this.field3622 >> 1;
            int[][] var6 = this.field4008.method134(127);
            Random var7 = new Random((long) this.field3606);
            for (int var8 = 0; var8 < this.field3618; var8++) {
                int var9 = this.field3622 <= 0 ? this.field3607 : this.field3607 - (var5 - class232.method1650(this.field3622, false, var7));
                int var10 = var9 >> 4 & 0xFF;
                int var11 = class232.method1650(class54.field858, false, var7);
                int var12 = class232.method1650(class133.field2294, false, var7);
                int var13 = (class51.field826[var10] * this.field3614 >> 12) + var12;
                int var14 = var13 - var12;
                int var15 = (class138.field2368[var10] * this.field3614 >> 12) + var11;
                int var16 = var15 - var11;
                if (var16 != 0 || var14 != 0) {
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var17 = var16 < var14;
                    if (var17) {
                        int var18 = var15;
                        var15 = var13;
                        int var19 = var11;
                        var13 = var18;
                        var11 = var12;
                        var12 = var19;
                    }
                    if (var15 < var11) {
                        int var20 = var11;
                        var11 = var15;
                        var15 = var20;
                        int var21 = var12;
                        var12 = var13;
                        var13 = var21;
                    }
                    int var22 = var12;
                    int var23 = var15 - var11;
                    int var24 = var13 - var12;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var25 = 2048 / var23;
                    int var26 = var12 < var13 ? 1 : -1;
                    int var27 = 1024 - (class232.method1650(4096, false, var7) >> 2);
                    int var28 = -var23 / 2;
                    for (int var29 = var11; var29 < var15; var29++) {
                        var28 += var24;
                        int var30 = (var29 - var11) * var25 + var27 + 1024;
                        int var31 = var29 & class65.field1024;
                        int var32 = var22 & class209.field3684;
                        if (var28 > 0) {
                            var28 += -var23;
                            var22 += var26;
                        }
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(IB)Lhi;", line = 462)
    public static final class82 method1484(int arg0, byte arg1) {
        int var2 = -117 / ((-arg1 - 21) / 42);
        field3616++;
        return class157.field2727[arg0].method535(true) <= 0 ? class327.field5589[arg0] : class29.method182(-6039, new class82[] { class327.field5589[arg0], class232.field4014, class157.field2727[arg0] });
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V", line = 478)
    public final void method144(int arg0) {
        field3621++;
        if (arg0 <= 48) {
            method1483((byte) -101);
        }
        class20.method137(4096);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lum;I)V", line = 508)
    public static final void method1485(class222 arg0, int arg1) {
        class238.field4142 = class211.method1521(class68.field1060, arg0, -92);
        field3624++;
        class175.field3035 = new int[256];
        if (arg1 != -8259) {
            return;
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class32.field481[var2] & 0xFF0000) >> 16);
            int var4 = (class32.field481[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) (class32.field481[var2] >> 8 & 0xFF);
            float var6 = ((float) var4 - var3) / 64.0F;
            int var7 = (class32.field481[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var5) / 64.0F;
            float var9 = (float) (class32.field481[var2] & 0xFF);
            int var10 = class32.field481[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class175.field3035[var2 * 64 + var12] = class98.method674((int) var9, class98.method674((int) var3 << 16, (int) var5 << 8));
                var5 += var8;
                var3 += var6;
                var9 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class175.field3035[var13] = class32.field481[3];
        }
        class150.field2561 = new int[32768];
        class203.field3523 = new int[32768];
        class60.method396((class186) null, 21);
        class83.field1486 = new int[32768];
        class263.field4491 = new int[32768];
        if (class147.field2485) {
            class316.field5431 = new class169(128, 254);
        } else {
            class316.field5431 = new class303(128, 254);
        }
    }
}
