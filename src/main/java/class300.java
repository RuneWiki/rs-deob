import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class300 {

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[F")
    public float[] field5103 = new float[4];

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public int field5114;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Z")
    public boolean field5110;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Z")
    public boolean field5115;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public int field5101;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public int field5105;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public int field5106;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[S")
    public short[] field5116;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    private int field5102;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field5090;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "[Lnj;")
    public static class100[] field5111 = new class100[50];

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field5089 = new int[128];

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Lhi;")
    public static class82 field5119 = class95.method664((byte) -105, "k");

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "F")
    public float field5092;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "F")
    public float field5096;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    private int field5108;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    private int field5109;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lwe;")
    public class173 field5093;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lag;")
    public static class301 field5099;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
    public static boolean field5098;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZ)V", line = 18)
    public static final void method2072(boolean arg0, boolean arg1) {
        field5113++;
        if (arg1) {
            if (class255.field4382 != -1) {
                class38.method298(class255.field4382, 0);
            }
            for (class146 var2 = (class146) class191.field3195.method502((byte) -104); var2 != null; var2 = (class146) class191.field3195.method494(true)) {
                class117.method797(true, var2, true);
            }
            class255.field4382 = -1;
            class191.field3195 = new class79(8);
            class209.method1496(84);
            class255.field4382 = class314.field5415;
            class81.method522(false, false);
            class302.method2081((byte) -9);
            class107.method733(-72, class255.field4382);
        }
        class168.field2932 = new class81();
        class168.field2932.field1689 = 3000;
        class168.field2932.field1685 = 3000;
        if (class147.field2485) {
            if (class273.field4602 == 2) {
                class219.field3792 = class87.field1549 << 7;
                class4.field32 = class24.field326 << 7;
            } else {
                class272.method1902(false);
            }
            class317.method2171(!arg0);
            class87.method612((byte) -47);
            class292.method2014(28, 28);
        } else {
            class207.method1485(class182.field3117, -8259);
            class292.method2014(28, 10);
        }
        if (arg0) {
            field5099 = (class301) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 76)
    private final void method2073(byte arg0) {
        int var2 = (this.field5106 << 7) + 64;
        this.field5096 = 1.0F / (float) (var2 * var2);
        if (arg0 != -76) {
            method2078(59);
        }
        field5112++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 88)
    private final void method2074(byte arg0) {
        field5107++;
        int var2 = 42 % ((arg0 + 34) / 54);
        int var3 = this.field5102;
        if (var3 == 2) {
            this.field5109 = 1;
            this.field5097 = 0;
            this.field5094 = 2048;
            this.field5108 = 2048;
        } else if (var3 == 3) {
            this.field5108 = 2048;
            this.field5097 = 0;
            this.field5094 = 4096;
            this.field5109 = 1;
        } else if (var3 == 4) {
            this.field5094 = 2048;
            this.field5108 = 2048;
            this.field5109 = 4;
            this.field5097 = 0;
        } else if (var3 == 5) {
            this.field5109 = 4;
            this.field5094 = 8192;
            this.field5108 = 2048;
            this.field5097 = 0;
        } else if (var3 == 12) {
            this.field5097 = 0;
            this.field5108 = 2048;
            this.field5094 = 2048;
            this.field5109 = 2;
        } else if (var3 == 13) {
            this.field5094 = 8192;
            this.field5109 = 2;
            this.field5097 = 0;
            this.field5108 = 2048;
        } else if (var3 == 10) {
            this.field5108 = 512;
            this.field5109 = 3;
            this.field5097 = 1536;
            this.field5094 = 2048;
        } else if (var3 == 11) {
            this.field5108 = 512;
            this.field5094 = 4096;
            this.field5097 = 1536;
            this.field5109 = 3;
        } else if (var3 == 6) {
            this.field5094 = 2048;
            this.field5097 = 1280;
            this.field5109 = 3;
            this.field5108 = 768;
        } else if (var3 == 7) {
            this.field5094 = 4096;
            this.field5109 = 3;
            this.field5108 = 768;
            this.field5097 = 1280;
        } else if (var3 == 8) {
            this.field5094 = 2048;
            this.field5109 = 3;
            this.field5097 = 1024;
            this.field5108 = 1024;
        } else if (var3 == 9) {
            this.field5109 = 3;
            this.field5108 = 1024;
            this.field5094 = 4096;
            this.field5097 = 1024;
        } else if (var3 == 14) {
            this.field5097 = 1280;
            this.field5108 = 768;
            this.field5109 = 1;
            this.field5094 = 2048;
        } else if (var3 == 15) {
            this.field5097 = 1536;
            this.field5094 = 4096;
            this.field5108 = 512;
            this.field5109 = 1;
        } else if (var3 == 16) {
            this.field5109 = 1;
            this.field5094 = 8192;
            this.field5108 = 256;
            this.field5097 = 1792;
        } else {
            this.field5097 = 0;
            this.field5108 = 2048;
            this.field5109 = 0;
            this.field5094 = 2048;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V", line = 292)
    public static final void method2075(byte arg0) {
        field5100++;
        class35.field545.method1495(-103);
        int var1 = class35.field545.method1499((byte) 102, 8);
        if (class25.field333 > var1) {
            for (int var2 = var1; var2 < class25.field333; var2++) {
                class149.field2545[class20.field270++] = class43.field749[var2];
            }
        }
        if (var1 > class25.field333) {
            throw new RuntimeException("gnpov1");
        }
        class25.field333 = 0;
        int var3 = -125 % ((-arg0 - 1) / 63);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class43.field749[var4];
            class275 var6 = class99.field1777[var5];
            int var7 = class35.field545.method1499((byte) 127, 1);
            if (var7 == 0) {
                class43.field749[class25.field333++] = var5;
                var6.field1680 = class212.field3708;
            } else {
                int var8 = class35.field545.method1499((byte) 117, 2);
                if (var8 == 0) {
                    class43.field749[class25.field333++] = var5;
                    var6.field1680 = class212.field3708;
                    class44.field760[class106.field1877++] = var5;
                } else if (var8 == 1) {
                    class43.field749[class25.field333++] = var5;
                    var6.field1680 = class212.field3708;
                    int var12 = class35.field545.method1499((byte) 121, 3);
                    var6.method655(var12, false, (byte) -52);
                    int var13 = class35.field545.method1499((byte) 123, 1);
                    if (var13 == 1) {
                        class44.field760[class106.field1877++] = var5;
                    }
                } else if (var8 == 2) {
                    class43.field749[class25.field333++] = var5;
                    var6.field1680 = class212.field3708;
                    int var9 = class35.field545.method1499((byte) 112, 3);
                    var6.method655(var9, true, (byte) -50);
                    int var10 = class35.field545.method1499((byte) -36, 3);
                    var6.method655(var10, true, (byte) -120);
                    int var11 = class35.field545.method1499((byte) 127, 1);
                    if (var11 == 1) {
                        class44.field760[class106.field1877++] = var5;
                    }
                } else if (var8 == 3) {
                    class149.field2545[class20.field270++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V", line = 398)
    public static final void method2076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5104++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -1;
        int var8 = class163.method1179(arg1 + arg0, class207.field3623, class200.field3443, (byte) -103);
        int var9 = -arg0;
        int var10 = -2 / ((-arg2 - 43) / 44);
        int var11 = class163.method1179(arg1 - arg0, class207.field3623, class200.field3443, (byte) -79);
        class114.method780(122, var11, var8, arg4, class73.field1117[arg3]);
        while (var6 > var5) {
            var7 += 2;
            var9 += var7;
            if (var9 > 0) {
                var6--;
                int var12 = arg3 - var6;
                var9 -= var6 << 1;
                int var13 = arg3 + var6;
                if (var13 >= class60.field931 && var12 <= class29.field399) {
                    int var14 = class163.method1179(arg1 + var5, class207.field3623, class200.field3443, (byte) -66);
                    int var15 = class163.method1179(arg1 - var5, class207.field3623, class200.field3443, (byte) -71);
                    if (class29.field399 >= var13) {
                        class114.method780(-76, var15, var14, arg4, class73.field1117[var13]);
                    }
                    if (class60.field931 <= var12) {
                        class114.method780(-82, var15, var14, arg4, class73.field1117[var12]);
                    }
                }
            }
            var5++;
            int var16 = arg3 + var5;
            int var17 = arg3 - var5;
            if (class60.field931 <= var16 && var17 <= class29.field399) {
                int var18 = class163.method1179(arg1 + var6, class207.field3623, class200.field3443, (byte) -118);
                int var19 = class163.method1179(arg1 - var6, class207.field3623, class200.field3443, (byte) -107);
                if (var16 <= class29.field399) {
                    class114.method780(124, var19, var18, arg4, class73.field1117[var16]);
                }
                if (var17 >= class60.field931) {
                    class114.method780(-119, var19, var18, arg4, class73.field1117[var17]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIZ)V", line = 485)
    public final void method2077(boolean arg0, int arg1, boolean arg2) {
        field5095++;
        int var4 = this.field5094 * arg1 / 50 + this.field5090 & 0x7FF;
        int var5 = this.field5109;
        int var6;
        if (var5 == 1) {
            var6 = (class102.field1813[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class245.field4254[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (!arg2) {
            this.field5092 = -0.19227417F;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field5092 = (float) ((this.field5108 * var6 >> 11) + this.field5097) / 2048.0F;
        float var7 = this.field5092 / 255.0F;
        this.field5103[1] = var7 * (float) (class277.method1935(65377, this.field5117) >> 8);
        this.field5103[2] = var7 * (float) class277.method1935(this.field5117, 255);
        this.field5103[0] = (float) (class277.method1935(this.field5117, 16765037) >> 16) * var7;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 574)
    protected class300() {
        if (class245.field4254 == null) {
            class283.method1969(false);
        }
        this.method2074((byte) -111);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lbc;)V", line = 597)
    public class300(class153 arg0) {
        if (class245.field4254 == null) {
            class283.method1969(false);
        }
        this.field5114 = arg0.method1082(-119);
        this.field5110 = (this.field5114 & 0x8) != 0;
        this.field5115 = (this.field5114 & 0x10) != 0;
        this.field5114 &= 0x7;
        this.field5101 = arg0.method1090(false);
        this.field5105 = arg0.method1090(false);
        this.field5118 = arg0.method1090(false);
        this.field5106 = arg0.method1082(-94);
        this.method2073((byte) -76);
        this.field5116 = new short[this.field5106 * 2 + 1];
        for (int var2 = 0; var2 < this.field5116.length; var2++) {
            this.field5116[var2] = (short) arg0.method1090(false);
        }
        this.field5117 = class102.field1805[arg0.method1090(false)];
        int var3 = arg0.method1082(-91);
        this.field5102 = var3 & 0x1F;
        this.field5090 = (var3 & 0xE0) << 3;
        this.method2074((byte) -112);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 587)
    public static void method2078(int arg0) {
        field5111 = null;
        int var1 = 48 % ((arg0 + 68) / 46);
        field5099 = null;
        field5089 = null;
        field5119 = null;
    }
}
