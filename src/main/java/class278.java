import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class278 extends class306 {

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    private int field4367 = 1024;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    private int field4366 = 0;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    private int field4374 = 409;

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    private int field4379 = 8;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    private int field4372 = 204;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    private int field4375 = 1024;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    private int field4368 = 81;

    @OriginalMember(owner = "client!tk", name = "eb", descriptor = "I")
    private int field4385 = 4;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field4370 = -1;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    private int field4362;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    private int field4369;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    private int field4373;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[I")
    private int[] field4371;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "[I")
    public static int[] field4377;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "[[I")
    private int[][] field4380;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "[[I")
    private int[][] field4381;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 10)
    public static final void method1985(int arg0, String arg1, boolean arg2) {
        field4382++;
        String var3 = class156.method1135(class228.method1586(false, arg1), (byte) 117);
        boolean var4 = false;
        if (!arg2) {
            method1986(92, (int[]) null, -47, 90, (byte) -22);
        }
        for (int var5 = 0; var5 < class302.field4704; var5++) {
            class67 var6 = class105.field1443[class80.field1067[var5]];
            if (var6 != null && var6.field848 != null && var6.field848.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg0 == 1) {
                    class328.field5282.method304(154, 19830);
                    class347.field5507++;
                    class328.field5282.method1002(-250657904, class80.field1067[var5]);
                    class328.field5282.method1010(87, 0);
                } else if (arg0 == 4) {
                    class328.field5282.method304(193, 19830);
                    class222.field3362++;
                    class328.field5282.method1006(-70, class80.field1067[var5]);
                    class328.field5282.method1010(-100, 0);
                } else if (arg0 == 5) {
                    class11.field114++;
                    class328.field5282.method304(80, 19830);
                    class328.field5282.method1006(72, class80.field1067[var5]);
                    class328.field5282.method1014(0, -125);
                } else if (arg0 == 6) {
                    class293.field4624++;
                    class328.field5282.method304(78, 19830);
                    class328.field5282.method1010(40, 0);
                    class328.field5282.method1049(class80.field1067[var5], (byte) -117);
                } else if (arg0 == 7) {
                    class151.field2390++;
                    class328.field5282.method304(254, 19830);
                    class328.field5282.method1049(class80.field1067[var5], (byte) -88);
                    class328.field5282.method1026(0, false);
                }
                break;
            }
        }
        if (!var4) {
            class306.method2157(class35.field393 + var3, false, 0, "");
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 336)
    public class278() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[IIIB)V", line = 98)
    public static final void method1986(int arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        arg0--;
        int var14 = arg3 - 1;
        int var5 = var14 - 7;
        while (var5 > arg0) {
            int var7 = arg0 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg0 = var13 + 1;
            arg1[arg0] = arg2;
        }
        while (var14 > arg0) {
            arg0++;
            arg1[arg0] = arg2;
        }
        field4365++;
        int var6 = 32 / ((arg4 + 15) / 41);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V", line = 128)
    private final void method1987(int arg0) {
        Random var2 = new Random((long) this.field4379);
        field4364++;
        this.field4373 = 4096 / this.field4385;
        int var3 = this.field4373 / 2;
        this.field4362 = 4096 / this.field4379;
        this.field4380 = new int[this.field4379][this.field4385];
        this.field4371 = new int[this.field4379 + 1];
        this.field4371[0] = 0;
        this.field4381 = new int[this.field4379][this.field4385 + 1];
        this.field4369 = this.field4368 / 2;
        int var4 = this.field4362 / 2;
        for (int var5 = 0; var5 < this.field4379; var5++) {
            if (var5 > 0) {
                int var6 = this.field4362;
                int var7 = (class220.method1534(4096, var2, 2) - 2048) * this.field4372 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4371[var5] = this.field4371[var5 - 1] + var8;
            }
            this.field4381[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4385; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4373;
                    int var11 = (class220.method1534(4096, var2, 2) - 2048) * this.field4374 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4381[var5][var9] = this.field4381[var5][var9 - 1] + var12;
                }
                this.field4380[var5][var9] = this.field4375 <= 0 ? 4096 : 4096 - class220.method1534(this.field4375, var2, 2);
            }
            this.field4381[var5][this.field4385] = 4096;
        }
        int var13 = 21 / ((arg0 - 6) / 61);
        this.field4371[this.field4379] = 4096;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V", line = 203)
    public final void method43(byte arg0) {
        field4363++;
        if (arg0 > -103) {
            this.field4380 = (int[][]) ((int[][]) null);
        }
        this.method1987(-85);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I", line = 218)
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = this.field4757.method903(arg0, arg1 ^ 0x5C2B3CD2);
        field4384++;
        if (arg1 != -1546337535) {
            this.field4366 = -6;
        }
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0] + this.field4366;
            int var5 = 0;
            while (var4 < 0) {
                var4 += 4096;
            }
            while (var4 > 4096) {
                var4 -= 4096;
            }
            while (this.field4379 > var5 && this.field4371[var5] <= var4) {
                var5++;
            }
            boolean var6 = (var5 & 0x1) == 0;
            int var7 = var5 - 1;
            int var8 = this.field4371[var5 - 1];
            int var9 = this.field4371[var5];
            if (var4 > (this.field4369 + var8) && (var9 - this.field4369) > var4) {
                for (int var10 = 0; var10 < class31.field367; var10++) {
                    int var11 = var6 ? this.field4367 : -this.field4367;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field4373 * var11 >> 12) + class25.field288[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field4385 && var13 >= this.field4381[var7][var12]) {
                        var12++;
                    }
                    int var14 = this.field4381[var7][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field4381[var7][var15];
                    if (this.field4369 + var16 < var13 && var14 - this.field4369 > var13) {
                        var3[var10] = this.field4380[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class8.method49(var3, 0, class31.field367, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V", line = 341)
    public static void method1988(int arg0) {
        if (arg0 <= -82) {
            field4377 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILlf;I)V", line = 351)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.method47(37, -68);
        }
        if (arg2 == 0) {
            this.field4385 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field4379 = arg1.method1043(true);
        } else if (arg2 == 2) {
            this.field4374 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field4372 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 4) {
            this.field4367 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 5) {
            this.field4366 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 6) {
            this.field4368 = arg1.method1051(1);
        } else if (arg2 == 7) {
            this.field4375 = arg1.method1051(1);
        }
        field4376++;
    }
}
