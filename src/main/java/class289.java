import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class289 extends class219 {

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    private int field4859 = 1;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    private int field4872 = 0;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    private int field4871 = 5;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    private int field4869 = 2;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "[B")
    private byte[] field4868 = new byte[512];

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    private int field4857 = 2048;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    private int field4858 = 5;

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "[S")
    private short[] field4885 = new short[512];

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "Lbd;")
    public static class162 field4865 = class17.method142(0, "gleiten:");

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "Z")
    public static boolean field4861 = false;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "Z")
    public static boolean field4878 = false;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Lbd;")
    public static class162 field4862 = class17.method142(0, "blinken1:");

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Lbd;")
    private static class162 field4866 = class17.method142(0, " has logged in)3");

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field4880 = 0;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field4873 = 0;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "Lbd;")
    public static class162 field4884 = class17.method142(0, "Hierhin gehen");

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "Lbd;")
    public static class162 field4883 = field4866;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "Lob;")
    public static class78 field4863;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "[I")
    public static int[] field4860;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILb;)V", line = 7)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            this.method41(true, 119);
        }
        field4879++;
        if (arg0 == 0) {
            this.field4858 = this.field4871 = arg2.method756(915905888);
        } else if (arg0 == 1) {
            this.field4872 = arg2.method756(arg1 + 915905888);
        } else if (arg0 == 2) {
            this.field4857 = arg2.method761((byte) 108);
        } else if (arg0 == 3) {
            this.field4869 = arg2.method756(arg1 ^ 0x36979D60);
        } else if (arg0 == 4) {
            this.field4859 = arg2.method756(915905888);
        } else if (arg0 == 5) {
            this.field4858 = arg2.method756(915905888);
        } else if (arg0 == 6) {
            this.field4871 = arg2.method756(915905888);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 90)
    public static final void method2002(int arg0) {
        if (arg0 != -1) {
            method2002(-42);
        }
        if (class29.field491 == 2) {
            if (class233.field3876 == class185.field3197 && class43.field718 == class297.field4980) {
                class29.field491 = 0;
                class213.method1556(class293.field4931 - 1, false);
            }
        } else if (class233.field3876 == class153.field2721 && class43.field718 == class183.field3158) {
            class29.field491 = 0;
            class213.method1556(class293.field4931 - 1, false);
        } else {
            class297.field4980 = class183.field3158;
            class185.field3197 = class153.field2721;
            class29.field491 = 2;
        }
        field4882++;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 485)
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V", line = 140)
    public static void method2003(byte arg0) {
        field4862 = null;
        field4863 = null;
        field4884 = null;
        field4866 = null;
        field4860 = null;
        if (arg0 < -17) {
            field4865 = null;
            field4883 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(B)V", line = 163)
    public static final void method2004(byte arg0) {
        class213.field3579 = null;
        class27.field463 = null;
        if (arg0 > -63) {
            return;
        }
        class129.field2336 = null;
        class18.field303 = null;
        class297.field4978 = null;
        class218.field3629 = null;
        class207.field3507 = null;
        class165.field2924 = null;
        class268.field4487 = null;
        class222.field3709 = null;
        class93.field1642 = null;
        class258.field4284 = null;
        class106.field1926 = null;
        field4874++;
        class50.field801 = null;
        class251.field4187 = null;
        class128.field2325 = null;
        class63.field989 = null;
        class305.field5140 = null;
        class46.field731 = null;
        class147.field2663 = null;
        class62.field959 = null;
        class131.field2360 = null;
        class286.field4831 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I", line = 196)
    public static int method2005(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZZIIIIZ)Ldc;", line = 222)
    public static final class71 method2006(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class116 var8 = class304.method2075(arg5, 4);
        if (arg6 > 1 && var8.field2106 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field2069[var10] <= arg6 && var8.field2069[var10] != 0) {
                    var9 = var8.field2106[var10];
                }
            }
            if (var9 != -1) {
                var8 = class304.method2075(var9, 4);
            }
        }
        class11 var11 = var8.method920(-1);
        field4876++;
        if (var11 == null) {
            return null;
        }
        int var12 = 74 / ((-arg4 - 32) / 46);
        class79 var13 = null;
        if (var8.field2102 != -1) {
            var13 = (class79) method2006(1, true, true, 0, -90, var8.field2066, 10, false);
            if (var13 == null) {
                return null;
            }
        } else if (var8.field2063 != -1) {
            var13 = (class79) method2006(arg0, false, true, arg3, 83, var8.field2100, arg6, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class316.field5328;
        int var15 = class316.field5329;
        int var16 = class316.field5331;
        int[] var17 = new int[4];
        class316.method2176(var17);
        class79 var18 = new class79(36, 32);
        class316.method2154(var18.field1384, 36, 32);
        class312.method2117();
        class312.method2119(16, 16);
        class312.field5268 = false;
        int var19 = var8.field2115;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class312.field5262[var8.field2077] * var19 >> 16;
        int var21 = class312.field5269[var8.field2077] * var19 >> 16;
        var11.method80(0, var8.field2099, var8.field2061, var8.field2077, var8.field2070, (var20 + var8.field2092) - (var11.method46() / 2), var21 - -var8.field2092);
        if (arg0 >= 1) {
            var18.method603(1);
            if (arg0 >= 2) {
                var18.method603(16777215);
            }
            class316.method2154(var18.field1384, 36, 32);
        }
        if (arg3 != 0) {
            var18.method609(arg3);
        }
        if (var8.field2102 != -1) {
            var13.method285(0, 0);
        } else if (var8.field2063 != -1) {
            class316.method2154(var13.field1384, 36, 32);
            var18.method285(0, 0);
            var18 = var13;
        }
        if (arg7 && (var8.field2082 == 1 || arg6 != 1) && arg6 != -1) {
            class214.field3595.method1881(class78.method584(-1, arg6), 0, 9, 16776960, 1);
        }
        class316.method2154(var14, var16, var15);
        class316.method2159(var17);
        class312.method2117();
        class312.field5268 = true;
        return class117.field2159 && !arg2 ? new class140(var18) : var18;
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(B)V", line = 361)
    private final void method2007(byte arg0) {
        field4875++;
        if (arg0 <= 41) {
            return;
        }
        Random var2 = new Random((long) this.field4872);
        this.field4885 = new short[512];
        if (this.field4857 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4885[var3] = (short) class95.method771(var2, this.field4857, (byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 405)
    public final void method39(byte arg0) {
        this.field4868 = class172.method1318(this.field4872, arg0 + 60);
        field4877++;
        this.method2007((byte) 98);
        if (arg0 != 22) {
            field4865 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 417)
    public static final void method2008(int arg0) {
        field4864++;
        class187.field3229.method338(arg0, (byte) 8);
        class68.field1098++;
        class187.field3229.method751(class63.field988, -1044017976);
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(B)V", line = 433)
    public static final void method2009(byte arg0) {
        class267.field4446 = 0;
        class4.field29 = 0;
        field4881++;
        class190.method1416((byte) 94);
        class40.method296((byte) 116);
        class290.method2013(-117);
        class112.method900(-123);
        for (int var1 = 0; var1 < class4.field29; var1++) {
            int var2 = class181.field3116[var1];
            if (class90.field1598 != class270.field4520[var2].field5051) {
                if (class270.field4520[var2].field609 > 0) {
                    class230.method1644(0, class270.field4520[var2]);
                }
                class270.field4520[var2] = null;
            }
        }
        if (class244.field4045 != class63.field975.field1653) {
            throw new RuntimeException("gpp1 pos:" + class63.field975.field1653 + " psize:" + class244.field4045);
        }
        if (arg0 != 125) {
            method2002(88);
        }
        for (int var3 = 0; var3 < class171.field2966; var3++) {
            if (class270.field4520[class123.field2233[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class171.field2966);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[I", line = 509)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            method2008(50);
        }
        field4870++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int var4 = class53.field842[arg1] * this.field4871 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class128.field2326; var7++) {
                class257.field4260 = Integer.MAX_VALUE;
                class303.field5114 = Integer.MAX_VALUE;
                class39.field644 = Integer.MAX_VALUE;
                class165.field2923 = Integer.MAX_VALUE;
                int var8 = (class280.field4762[var7] * this.field4858) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4868[(var11 < this.field4871 ? var11 : var11 - this.field4871) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4868[(this.field4858 > var13 ? var13 : var13 - this.field4858) + var12 & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field4885[var14] - (var13 << 12);
                        int var16 = var4 - this.field4885[var27] - (var11 << 12);
                        int var17 = this.field4859;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 < 0 ? -var16 : var16;
                            var18 = var24 > var25 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var19 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var20 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var21 = var19 + var20;
                            var18 = var21 * var21 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var15 * var15;
                            int var23 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class165.field2923) {
                            class257.field4260 = class303.field5114;
                            class303.field5114 = class39.field644;
                            class39.field644 = class165.field2923;
                            class165.field2923 = var18;
                        } else if (class39.field644 > var18) {
                            class257.field4260 = class303.field5114;
                            class303.field5114 = class39.field644;
                            class39.field644 = var18;
                        } else if (class303.field5114 > var18) {
                            class257.field4260 = class303.field5114;
                            class303.field5114 = var18;
                        } else if (class257.field4260 > var18) {
                            class257.field4260 = var18;
                        }
                    }
                }
                int var26 = this.field4869;
                if (var26 == 0) {
                    var3[var7] = class165.field2923;
                } else if (var26 == 1) {
                    var3[var7] = class39.field644;
                } else if (var26 == 3) {
                    var3[var7] = class303.field5114;
                } else if (var26 == 4) {
                    var3[var7] = class257.field4260;
                } else if (var26 == 2) {
                    var3[var7] = class39.field644 - class165.field2923;
                }
            }
        }
        return var3;
    }
}
