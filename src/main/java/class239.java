import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class239 extends class120 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "[I")
    private int[] field3716 = new int[this.field1872];

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field3714 = 0;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Luf;")
    public static class184 field3712 = class61.method615(14);

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field3720 = 255;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3719 = " more options";

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "[I")
    public static int[] field3718 = new int[5];

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "F")
    public static float field3721;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lrn;")
    public static class18 field3701;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "Luh;")
    public static class95 field3717;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[B")
    private byte[] field3702;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "[I")
    public static int[] field3711;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "[[[B")
    public static byte[][][] field3722;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V", line = 10)
    public void method1132(int arg0, byte arg1) {
        field3710++;
        this.field3702[this.field3699++] = (byte) (class301.method2169(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 18)
    public static final void method1769(int arg0) {
        if (arg0 == 2391) {
            field3704++;
            class340.field5226.method655(-1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V", line = 32)
    public static void method1770(int arg0) {
        field3711 = null;
        field3701 = null;
        if (arg0 != 0) {
            method1776((byte) 70, -85L);
        }
        field3718 = null;
        field3717 = null;
        field3722 = (byte[][][]) null;
        field3712 = null;
        field3719 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 49)
    public final void method224(int arg0) {
        this.field3715 = Math.abs(this.field3715);
        field3706++;
        if (arg0 != -868156244) {
            return;
        }
        if (this.field3715 >= 4096) {
            this.field3715 = 4095;
        }
        this.method1132(this.field3699++, (byte) (this.field3715 >> 4));
        this.field3715 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V", line = 69)
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1872; var7++) {
            this.field3716[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILua;)V", line = 93)
    public static final void method1771(int arg0, class323 arg1) {
        class139.field2321 = 3;
        field3705++;
        class5 var2 = null;
        class109.method953(true, (byte) -112);
        field3720 = 255;
        class274.field4252 = true;
        class271.field4194 = 0;
        class290.field4504 = true;
        class134.field2245 = 0;
        class327.field5034 = true;
        class110.field1686 = true;
        class164.field2603 = true;
        class59.field927 = true;
        class68.field1047 = 0;
        class224.field3509 = 127;
        class74.field1091 = 0;
        class19.field311 = 2;
        class86.field1241 = true;
        class121.field1878 = true;
        class287.field4454 = 127;
        class343.field5451 = true;
        class101.field1529 = true;
        class108.field1626 = true;
        if (class121.field1889 >= 96) {
            class273.method1998(2);
        } else {
            class273.method1998(0);
        }
        class278.field4292 = false;
        class123.field1968 = 0;
        if (arg0 != 2016) {
            field3720 = -110;
        }
        class195.field3071 = 0;
        class4.field56 = false;
        class321.field4946 = true;
        class64.field989 = 0;
        class33.field502 = false;
        try {
            class95 var3 = arg1.method2278("runescape", false);
            while (var3.field1447 == 0) {
                class188.method1443(10, 1L);
            }
            if (var3.field1447 == 1) {
                var2 = (class5) var3.field1446;
                byte[] var4 = new byte[(int) var2.method36((byte) -113)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method39((byte) 109, var4.length - var5, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class20.method227(6, new class25(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method37(arg0 - 2016);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 178)
    public static final void method1772(int arg0, int arg1) {
        field3708++;
        class112.field1715.method649((byte) 75, arg0);
        if (arg1 < 74) {
            field3721 = -2.529579F;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V", line = 189)
    public final void method223(boolean arg0) {
        if (!arg0) {
            this.field3715 = 0;
            this.field3699 = 0;
            field3709++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[I[I[ILsd;)V", line = 202)
    public static final void method1773(int arg0, int[] arg1, int[] arg2, int[] arg3, class244 arg4) {
        if (arg0 != 3) {
            field3720 = 75;
        }
        field3713++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field1331.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1331[var9] = null;
                    } else {
                        class93 var10 = class126.method1091((byte) 71, var6);
                        int var11 = var10.field1405;
                        class349 var12 = arg4.field1331[var9];
                        if (var12 != null) {
                            if (var12.field5542 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1331[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5539 = 1;
                                    var12.field5543 = var8;
                                    var12.field5547 = 0;
                                    var12.field5541 = 0;
                                    var12.field5535 = 0;
                                    class335.method2358(arg4.field1359, 0, var10, false, arg4.field1286, true);
                                } else if (var11 == 2) {
                                    var12.field5541 = 0;
                                }
                            } else if (var10.field1423 >= class126.method1091((byte) 65, var12.field5542).field1423) {
                                var12 = arg4.field1331[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class349 var13 = arg4.field1331[var9] = new class349();
                            var13.field5542 = var6;
                            var13.field5543 = var8;
                            var13.field5535 = 0;
                            var13.field5547 = 0;
                            var13.field5541 = 0;
                            var13.field5539 = 1;
                            class335.method2358(arg4.field1359, 0, var10, false, arg4.field1286, true);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILkk;)V", line = 301)
    public static final void method1774(int arg0, class77 arg1) {
        for (int var2 = 0; var2 < class75.field1109.length; var2++) {
            class75.field1109[var2] = 0;
        }
        short var3 = 256;
        field3697++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class75.field1109[var5] = (int) (Math.random() * 284.0D);
        }
        int var6 = 0;
        int var7 = -75 / ((41 - arg0) / 55);
        while (var6 < 20) {
            for (int var8 = 1; var8 < var3 - 1; var8++) {
                for (int var9 = 1; var9 < 127; var9++) {
                    int var10 = (var8 << 7) + var9;
                    class331.field5091[var10] = (class75.field1109[var10 - 128] + class75.field1109[var10 - 1] - (-class75.field1109[var10 + 1] - class75.field1109[var10 + 128])) / 4;
                }
            }
            int[] var11 = class75.field1109;
            class75.field1109 = class331.field5091;
            class331.field5091 = var11;
            var6++;
        }
        if (arg1 == null) {
            return;
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1.field3826; var13++) {
            for (int var14 = 0; var14 < arg1.field3827; var14++) {
                if (arg1.field1124[var12++] != 0) {
                    int var15 = arg1.field3831 + var14 + 16;
                    int var16 = var13 + arg1.field3828 + 16;
                    int var17 = (var16 << 7) + var15;
                    class75.field1109[var17] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)I", line = 393)
    public static final int method1775(boolean arg0) {
        field3698++;
        if ((double) class351.field5595 == 3.0D) {
            return 37;
        }
        if (!arg0) {
            method1775(true);
        }
        if ((double) class351.field5595 == 4.0D) {
            return 50;
        } else if ((double) class351.field5595 == 6.0D) {
            return 75;
        } else if ((double) class351.field5595 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BJ)V", line = 417)
    public static final void method1776(byte arg0, long arg1) {
        field3707++;
        try {
            Thread.sleep(arg1);
            if (arg0 != -117) {
                method1771(-33, (class323) null);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 437)
    public final void method221(int arg0, int arg1, int arg2) {
        field3700++;
        if (arg2 != 512) {
            method1770(37);
        }
        this.field3715 += this.field3716[arg0] * arg1 >> 12;
    }
}
