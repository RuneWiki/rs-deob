import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class348 implements Runnable {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
    private boolean field4766 = false;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
    private boolean field4768 = false;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    private int field4771 = 0;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    private int field4795 = 0;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "Ljava/net/Socket;")
    private Socket field4793;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lko;")
    private class294 field4778;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field4775;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4792;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[J")
    public static long[] field4770 = new long[32];

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field4774 = 0;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lms;")
    public static class453 field4779 = null;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lnq;")
    public static class268 field4781;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Laa;")
    private class283 field4769;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Lbo;")
    public static class435 field4791;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[B")
    private byte[] field4767;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[I")
    public static int[] field4772;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "[I")
    public static int[] field4796;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BIII)V", line = 5)
    public final void method2203(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4790++;
        if (this.field4766) {
            return;
        }
        int var5 = 84 / ((50 - arg3) / 57);
        if (this.field4768) {
            this.field4768 = false;
            throw new IOException();
        }
        if (this.field4767 == null) {
            this.field4767 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field4767[this.field4771] = arg0[arg1 + var7];
                this.field4771 = (this.field4771 + 1) % 5000;
                if ((this.field4795 + 4900) % 5000 == this.field4771) {
                    throw new IOException();
                }
            }
            if (this.field4769 == null) {
                this.field4769 = this.field4778.method1916((byte) -63, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pf", name = "run", descriptor = "()V", line = 61)
    public final void run() {
        field4773++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4795 == this.field4771) {
                        if (this.field4766) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field4795 <= this.field4771) {
                        var2 = this.field4771 - this.field4795;
                    } else {
                        var2 = 5000 - this.field4795;
                    }
                    var3 = this.field4795;
                }
                if (var2 > 0) {
                    try {
                        this.field4792.write(this.field4767, var3, var2);
                    } catch (IOException var9) {
                        this.field4768 = true;
                    }
                    this.field4795 = (this.field4795 + var2) % 5000;
                    try {
                        if (this.field4795 == this.field4771) {
                            this.field4792.flush();
                        }
                    } catch (IOException var8) {
                        this.field4768 = true;
                    }
                }
            }
            try {
                if (this.field4775 != null) {
                    this.field4775.close();
                }
                if (this.field4792 != null) {
                    this.field4792.close();
                }
                if (this.field4793 != null) {
                    this.field4793.close();
                }
            } catch (IOException var7) {
            }
            this.field4767 = null;
        } catch (Exception var12) {
            class271.method1776(-2296, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)V", line = 131)
    public static final void method2204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4786++;
        class292.field4082 = 0;
        if (arg5 != -16230) {
            method2216((byte) -100, (class345) null);
        }
        for (int var7 = -1; var7 < (class26.field467 + class125.field1758); var7++) {
            class327 var30 = null;
            class374 var31;
            if (var7 < 0) {
                var31 = class412.field5841;
            } else if (class26.field467 <= var7) {
                var31 = class98.field1358[class135.field1967[var7 - class26.field467]];
                var30 = ((class198) var31).field2737;
                if (var30.field4475 != null) {
                    var30 = var30.method2108(true);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class381.field5447[class66.field974[var7]];
            }
            if (var31.field5247 >= 0) {
                class92.method653(var31.method1292(arg5 ^ 0xFFFFC09A), var31, arg3, arg2, arg6 >> 1, arg5 + 16328, arg1 >> 1);
                if (class48.field682[0] >= 0) {
                    if (var31.field5292 != null && (class26.field467 <= var7 || class415.field5888 == 0 || class415.field5888 == 3 || class415.field5888 == 1 && class3.method16(((class134) var31).field1922, 0)) && class373.field5236 > class292.field4082) {
                        class373.field5241[class292.field4082] = class95.field1313.method2156(var31.field5292, 60) / 2;
                        class373.field5232[class292.field4082] = class48.field682[0];
                        class373.field5240[class292.field4082] = class48.field682[1];
                        class373.field5234[class292.field4082] = var31.field5253;
                        class373.field5235[class292.field4082] = var31.field5318;
                        class373.field5237[class292.field4082] = var31.field5245;
                        class373.field5239[class292.field4082] = var31.field5292;
                        class292.field4082++;
                    }
                    class226 var32 = class74.field1066[0];
                    int var33 = arg0 + class48.field682[1] - Math.max(class95.field1313.field4633, var32.method598());
                    if (!var31.field5317 && class276.field3837 < var31.field5299) {
                        class226 var34 = class74.field1066[1];
                        if (var31 instanceof class198) {
                            class198 var35 = (class198) var31;
                            class226[] var36 = (class226[]) class375.field5348.method904(false, (long) var35.field2737.field4486);
                            if (var36 == null) {
                                class238[] var37 = class238.method1617(class212.field2969, var35.field2737.field4486, 0);
                                if (var37 != null) {
                                    var36 = new class226[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class64.field949.method105(var37[var38], true);
                                    }
                                    class375.field5348.method902((long) var35.field2737.field4486, (byte) 112, var36);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var34 = var36[1];
                                var32 = var36[0];
                            }
                        }
                        int var39 = class48.field682[0] + arg4 - (var32.method600() >> 1);
                        var32.method1501(var39, var33);
                        int var40 = var32.method600() * var31.field5248 / 255;
                        class64.field949.method53(var39, var33, var39 + var40, var33 + var32.method598());
                        var34.method1501(var39, var33);
                        class64.field949.method136(arg4, arg0, arg1 + arg4, arg0 + arg6);
                    }
                    var33 -= 2;
                    if (!var31.field5317) {
                        if (class276.field3837 < var31.field5271) {
                            class226 var41 = class452.field6309[var31.field5322 ? 2 : 0];
                            class226 var42 = class452.field6309[var31.field5322 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if ((var31 instanceof class198)) {
                                var44 = var30.field4509;
                                if (var44 == -1) {
                                    var44 = var31.method2388(108).field6030;
                                }
                            } else {
                                var44 = var31.method2388(101).field6030;
                            }
                            if (var44 != -1) {
                                class226[] var45 = (class226[]) class412.field5842.method904(false, (long) var44);
                                if (var45 == null) {
                                    class238[] var46 = class238.method1617(class212.field2969, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class226[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class64.field949.method105(var46[var47], true);
                                        }
                                        class412.field5842.method902((long) var44, (byte) 112, var45);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var42 = var45[var31.field5322 ? 3 : 1];
                                    var41 = var45[var31.field5322 ? 2 : 0];
                                }
                            }
                            int var48 = var31.field5271 - class276.field3837;
                            int var51;
                            if (var48 > var31.field5282) {
                                int var49 = var48 - var31.field5282;
                                int var50 = var31.field5272 == 0 ? 0 : (var31.field5311 - var49) / var31.field5272 * var31.field5272;
                                var51 = var41.method600() * var50 / var31.field5311;
                            } else {
                                var51 = var41.method600();
                            }
                            int var52 = var41.method598();
                            var33 -= var52;
                            int var53 = class48.field682[0] + (arg4 - (var41.method600() >> 1));
                            var41.method1501(var53, var33);
                            class64.field949.method53(var53, var33, var51 + var53, var33 + var52);
                            var42.method1501(var53, var33);
                            var33 -= 2;
                            class64.field949.method136(arg4, arg0, arg4 + arg1, arg0 - -arg6);
                        }
                        if (var7 < class26.field467) {
                            class134 var54 = (class134) var31;
                            if (var54.field1926 != -1) {
                                var33 -= 25;
                                class222.field3103[var54.field1926].method1501(class48.field682[0] + arg4 - 12, var33);
                                var33 -= 2;
                            }
                            if (var54.field1960 != -1) {
                                var33 -= 25;
                                class366.field5158[var54.field1960].method1501(arg4 - (12 - class48.field682[0]), var33);
                                var33 -= 2;
                            }
                        } else if (var30.field4535 >= 0 && var30.field4535 < class366.field5158.length) {
                            var33 -= 25;
                            class226 var55 = class366.field5158[var30.field4535];
                            var55.method1501(arg4 + class48.field682[0] - (var55.method600() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class134) {
                        int var62 = 0;
                        class285[] var63 = class131.field1864;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class285 var68 = var63[var64];
                            if (var68 != null && var68.field4017 == 1 && class135.field1967[var7 - class26.field467] == var68.field4025) {
                                class226 var69 = class239.field3413[var68.field4011];
                                if (var69.method598() > var62) {
                                    var62 = var69.method598();
                                }
                                if (class276.field3837 % 20 < 10) {
                                    var69.method1501(class48.field682[0] + arg4 - 12, var33 + -var69.method598());
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class285[] var57 = class131.field1864;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class285 var60 = var57[var58];
                            if (var60 != null && var60.field4017 == 10 && class66.field974[var7] == var60.field4025) {
                                class226 var61 = class239.field3413[var60.field4011];
                                if (var56 < var61.method598()) {
                                    var56 = var61.method598();
                                }
                                var61.method1501(arg4 + class48.field682[0] - 12, -var61.method598() + var33);
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (var31.field5304[var66] > class276.field3837) {
                            int var67 = var31.method1292(0) / 2;
                            class92.method653(var67, var31, arg3, arg2, arg6 >> 1, 119, arg1 >> 1);
                            if (class48.field682[0] > -1) {
                                if (var66 == 1) {
                                    class48.field682[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class48.field682[0] -= 15;
                                    class48.field682[1] -= 10;
                                }
                                if (var66 == 3) {
                                    class48.field682[1] -= 10;
                                    class48.field682[0] += 15;
                                }
                                class65.field971[var31.field5261[var66]].method1501(class48.field682[0] + arg4 - 12, arg0 + -12 - -class48.field682[1]);
                                class51.field711.method2283((byte) -120, class48.field682[0] + arg4 - 1, arg0 + 3 + class48.field682[1], 0, Integer.toString(var31.field5321[var66]), -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class28.field476; var8++) {
            int var26 = class28.field475[var8];
            class374 var27;
            if (var26 < 2048) {
                var27 = class381.field5447[var26];
            } else {
                var27 = class98.field1358[var26 - 2048];
            }
            int var28 = class34.field527[var8];
            class374 var29;
            if (var28 < 2048) {
                var29 = class381.field5447[var28];
            } else {
                var29 = class98.field1358[var28 - 2048];
            }
            class278.method1817(var29, var27, arg6, --var27.field5246, arg3, arg0, true, arg2, arg4, arg1);
        }
        int var9 = class95.field1313.field4633 + class95.field1313.field4632 + 2;
        for (int var10 = 0; var10 < class292.field4082; var10++) {
            int var11 = class373.field5232[var10];
            int var12 = class373.field5240[var10];
            int var13 = class373.field5241[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if (class373.field5240[var25] - var9 < var12 - -2 && class373.field5240[var25] + 2 > -var9 + var12 && (class373.field5232[var25] + class373.field5241[var25]) > (var11 - var13) && var11 + var13 > class373.field5232[var25] + -class373.field5241[var25] && class373.field5240[var25] - var9 < var12) {
                        var14 = true;
                        var12 = class373.field5240[var25] - var9;
                    }
                }
            }
            class373.field5240[var10] = var12;
            String var15 = class373.field5239[var10];
            if (class253.field3563 == 0) {
                int var16 = 16776960;
                if (class373.field5234[var10] < 6) {
                    var16 = class276.field3838[class373.field5234[var10]];
                }
                if (class373.field5234[var10] == 6) {
                    var16 = (class70.field1025 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class373.field5234[var10] == 7) {
                    var16 = class70.field1025 % 20 >= 10 ? 65535 : 255;
                }
                if (class373.field5234[var10] == 8) {
                    var16 = (class70.field1025 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class373.field5234[var10] == 9) {
                    int var17 = 150 - class373.field5237[var10];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (class373.field5234[var10] == 10) {
                    int var18 = 150 - class373.field5237[var10];
                    if (var18 < 50) {
                        var16 = (var18 * 5) + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - ((var18 - 50) * 327680);
                    } else if (var18 < 150) {
                        var16 = -((var18 - 100) * 5) - (-(var18 * 327680) - 255) - 32768000;
                    }
                }
                if (class373.field5234[var10] == 11) {
                    int var19 = 150 - class373.field5237[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 + 32768000 - (var19 * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class373.field5235[var10] == 0) {
                    class279.field3915.method2283((byte) -42, arg4 + var11, arg0 + var12, -16777216, var15, var20);
                }
                if (class373.field5235[var10] == 1) {
                    class279.field3915.method2293(var15, arg4 + var11, arg0 - -var12, -66, var20, -16777216, class70.field1025);
                }
                if (class373.field5235[var10] == 2) {
                    class279.field3915.method2289(class70.field1025, arg4 + var11, var15, true, -16777216, var20, arg0 + var12);
                }
                if (class373.field5235[var10] == 3) {
                    class279.field3915.method2295(class70.field1025, arg0 + var12, 150 - class373.field5237[var10], var20, arg5 - 13277, arg4 - -var11, -16777216, var15);
                }
                if (class373.field5235[var10] == 4) {
                    int var21 = (150 - class373.field5237[var10]) * (class95.field1313.method2156(var15, 60) + 100) / 150;
                    class64.field949.method53(arg4 + var11 - 50, arg0, var11 + arg4 + 50, arg0 - -arg6);
                    class279.field3915.method2286(-16777216, arg0 + var12, var15, arg4 + var11 + 50 - var21, var20, (byte) -112);
                    class64.field949.method136(arg4, arg0, arg1 + arg4, arg0 + arg6);
                }
                if (class373.field5235[var10] == 5) {
                    int var22 = 150 - class373.field5237[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class95.field1313.field4633 + class95.field1313.field4632;
                    class64.field949.method53(arg4, arg0 + var12 - var24 - 1, arg4 - -arg1, arg0 + var12 + 5);
                    class279.field3915.method2283((byte) -78, arg4 + var11, arg0 + var23 + var12, -16777216, var15, var20);
                    class64.field949.method136(arg4, arg0, arg1 + arg4, arg0 + arg6);
                }
            } else {
                class279.field3915.method2283((byte) -69, arg4 + var11, arg0 + var12, -16777216, var15, -256);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILes;Les;)V", line = 685)
    public static final void method2205(int arg0, int arg1, int arg2, class214 arg3, class214 arg4) {
        if (class328.field4549[arg0][arg1][arg2] == null) {
            class75.method559(arg0, arg1, arg2);
        }
        class328.field4549[arg0][arg1][arg2].field1740 = arg3;
        class328.field4549[arg0][arg1][arg2].field1750 = arg4;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/net/Socket;Lko;)V", line = 1001)
    public class348(Socket arg0, class294 arg1) throws IOException {
        this.field4793 = arg0;
        this.field4778 = arg1;
        this.field4793.setSoTimeout(30000);
        this.field4793.setTcpNoDelay(true);
        this.field4775 = this.field4793.getInputStream();
        this.field4792 = this.field4793.getOutputStream();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 701)
    public final void method2206(int arg0) throws IOException {
        field4782++;
        if (!this.field4766 && arg0 == -25 && this.field4768) {
            this.field4768 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V", line = 723)
    protected final void finalize() {
        this.method2210(-2);
        field4784++;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)I", line = 734)
    public final int method2207(int arg0) throws IOException {
        field4787++;
        if (arg0 == 16776960) {
            return this.field4766 ? 0 : this.field4775.read();
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 750)
    public static void method2208(byte arg0) {
        field4791 = null;
        field4796 = null;
        field4772 = null;
        field4779 = null;
        field4781 = null;
        field4770 = null;
        if (arg0 != 105) {
            field4774 = 4;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[BII)V", line = 765)
    public final void method2209(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4794++;
        if (this.field4766) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4775.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
        if (arg3 != 1509) {
            method2204(-105, -117, -1, -119, 4, 49, 41);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 797)
    public final void method2210(int arg0) {
        field4789++;
        if (this.field4766) {
            return;
        }
        synchronized (this) {
            this.field4766 = true;
            if (arg0 != -2) {
                method2204(-108, 116, -74, -41, -107, -23, -11);
            }
            this.notifyAll();
        }
        if (this.field4769 != null) {
            while (this.field4769.field3998 == 0) {
                class349.method2219(1L, -112);
            }
            if (this.field4769.field3998 == 1) {
                try {
                    ((Thread) this.field4769.field3999).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4769 = null;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V", line = 833)
    public static final void method2211(int arg0) {
        class360.field4922.method905((byte) 51);
        field4785++;
        if (arg0 != 4) {
            method2204(43, -126, 122, 121, 84, -44, 76);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V", line = 852)
    public final void method2212(byte arg0) {
        field4765++;
        if (this.field4766) {
            return;
        }
        this.field4775 = new class314();
        this.field4792 = new class105();
        if (arg0 < 30) {
            field4781 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I", line = 871)
    public final int method2213(int arg0) throws IOException {
        if (arg0 <= 98) {
            return -126;
        } else {
            field4788++;
            return this.field4766 ? 0 : this.field4775.available();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I", line = 889)
    public static final int method2214(int arg0, int arg1, byte arg2) {
        field4777++;
        if (arg2 != -43) {
            field4774 = 71;
        }
        return arg0 == 1 || arg0 == 3 ? class338.field4648[arg1 & 0x3] : class184.field2509[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V", line = 907)
    public static final void method2215(boolean arg0, int arg1) {
        if (!arg0) {
            class371.field5218 = arg1;
            field4783++;
            class50.field699.method905((byte) 11);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLuo;)V", line = 925)
    public static final void method2216(byte arg0, class345 arg1) {
        field4776++;
        arg1.method136(0, 0, class47.field661, 350);
        arg1.method56(0, 0, class47.field661, 350, class364.field5133 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class20.field370[var2];
            int var14 = class243.field3447[var2];
            arg1.method56(var13, var14, 2, 2, class74.field1049[var2] << 24 | 0xFFFFFF, 1);
        }
        if (arg0 < 25) {
            method2214(110, -125, (byte) -108);
        }
        int var3 = 350 / class331.field4580;
        if (class357.field4897 > 0) {
            int var4 = 346 - class331.field4580 - 4;
            int var5 = var3 * var4 / (class357.field4897 + var3 - 1);
            int var6 = 4;
            if (class357.field4897 > 1) {
                var6 += (class357.field4897 - (class131.field1863 + 1)) * (var4 - var5) / (class357.field4897 - 1);
            }
            arg1.method56(class47.field661 - 16, var6, 12, var5, class364.field5133 << 24 | 0x332277, 2);
            for (int var7 = class131.field1863; class131.field1863 + var3 > var7 && var7 < class357.field4897; var7++) {
                String[] var8 = class46.method408((byte) 68, '\b', class399.field5695[var7]);
                int var9 = (class47.field661 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg1.method136(var11, 0, var9 + var11 - 8, 350);
                    class159.field2234.method2286(-16777216, 350 - class333.field4598 - class293.field4104.field4632 - ((var7 - class131.field1863) * class331.field4580) - 2, var8[var10], var11, -1, (byte) -79);
                }
            }
        }
        arg1.method136(0, 0, class47.field661, 350);
        arg1.method2189((byte) -84, class47.field661, 350 - class333.field4598, -1, 0);
        class279.field3915.method2286(-16777216, 349 - class95.field1313.field4632, "--> " + class175.field2395, 10, -1, (byte) -100);
        int var12 = -1;
        if (class276.field3837 % 30 > 15) {
            var12 = 16777215;
        }
        arg1.method2181(12, -23605, var12, 339 - class95.field1313.field4632, class95.field1313.method2156("--> " + class175.field2395.substring(0, class91.field1278), 60) + 10);
    }
}
