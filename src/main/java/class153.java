import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class153 extends class3 {

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "[B")
    private byte[] field2462 = new byte[512];

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    private int field2461 = 2048;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    private int field2466 = 2;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    private int field2464 = 5;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    private int field2472 = 0;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    private int field2463 = 5;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    private int field2471 = 1;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "[S")
    private short[] field2475 = new short[512];

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Ljo;")
    public static class150 field2474 = new class150();

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field2477 = -1;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2478 = "Loading config - ";

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "[F")
    public static float[] field2482 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "Z")
    public static boolean field2483 = false;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "Lui;")
    public static class98 field2480 = new class98(64);

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "Z")
    public static boolean field2486 = true;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lei;")
    public static class77 field2484 = new class77(0, -1);

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "[Llj;")
    public static class289[] field2479;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 360)
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IIIII)V", line = 12)
    public static final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -3911) {
            return;
        }
        field2470++;
        if (arg2 > arg4) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class306.field4998[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class306.field4998[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfh;IZ)V", line = 51)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field2469++;
        if (arg2) {
            field2485 = 86;
        }
        if (arg1 == 0) {
            this.field2464 = this.field2463 = arg0.method2224(-121);
        } else if (arg1 == 1) {
            this.field2472 = arg0.method2224(-128);
        } else if (arg1 == 2) {
            this.field2461 = arg0.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field2466 = arg0.method2224(-119);
        } else if (arg1 == 4) {
            this.field2471 = arg0.method2224(-125);
        } else if (arg1 == 5) {
            this.field2464 = arg0.method2224(-120);
        } else if (arg1 == 6) {
            this.field2463 = arg0.method2224(-123);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[I", line = 131)
    public final int[] method25(byte arg0, int arg1) {
        field2465++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class159.field2546[arg1] * this.field2463 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class326.field5342; var7++) {
                class98.field1419 = Integer.MAX_VALUE;
                class32.field485 = Integer.MAX_VALUE;
                class313.field5167 = Integer.MAX_VALUE;
                class346.field5551 = Integer.MAX_VALUE;
                int var8 = class163.field2591[var7] * this.field2464 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2462[(this.field2463 <= var11 ? var11 - this.field2463 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2462[var12 + (var13 < this.field2464 ? var13 : var13 - this.field2464) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field2475[var14] - (var13 << 12);
                        int var16 = var4 - (var11 << 12) - this.field2475[var27];
                        int var17 = this.field2471;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 >= 0 ? var16 : -var16;
                            int var25 = var15 >= 0 ? var15 : -var15;
                            var18 = var24 >= var25 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class346.field5551) {
                            class98.field1419 = class32.field485;
                            class32.field485 = class313.field5167;
                            class313.field5167 = class346.field5551;
                            class346.field5551 = var18;
                        } else if (var18 < class313.field5167) {
                            class98.field1419 = class32.field485;
                            class32.field485 = class313.field5167;
                            class313.field5167 = var18;
                        } else if (class32.field485 > var18) {
                            class98.field1419 = class32.field485;
                            class32.field485 = var18;
                        } else if (class98.field1419 > var18) {
                            class98.field1419 = var18;
                        }
                    }
                }
                int var26 = this.field2466;
                if (var26 == 0) {
                    var3[var7] = class346.field5551;
                } else if (var26 == 1) {
                    var3[var7] = class313.field5167;
                } else if (var26 == 3) {
                    var3[var7] = class32.field485;
                } else if (var26 == 4) {
                    var3[var7] = class98.field1419;
                } else if (var26 == 2) {
                    var3[var7] = class313.field5167 - class346.field5551;
                }
            }
        }
        if (arg0 <= 57) {
            this.field2464 = 19;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V", line = 347)
    public static void method1103(byte arg0) {
        field2480 = null;
        field2479 = null;
        field2474 = null;
        field2478 = null;
        int var1 = -31 % ((65 - arg0) / 61);
        field2484 = null;
        field2482 = null;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V", line = 365)
    private final void method1104(int arg0) {
        field2473++;
        Random var2 = new Random((long) this.field2472);
        if (arg0 != 124) {
            return;
        }
        this.field2475 = new short[512];
        if (this.field2461 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2475[var3] = (short) class4.method33(false, var2, this.field2461);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V", line = 399)
    public final void method20(byte arg0) {
        int var2 = -49 % ((-arg0 - 20) / 58);
        this.field2462 = class290.method2052(this.field2472, (byte) 126);
        field2468++;
        this.method1104(124);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V", line = 410)
    public static final void method1105(int arg0, int arg1) {
        short var2 = 256;
        field2467++;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class227.field3573 += arg0 * 128;
        if (class132.field2023.length < class227.field3573) {
            int var3 = (int) (Math.random() * 12.0D);
            class227.field3573 -= class132.field2023.length;
            class324.method2318(class120.field1778[var3], (byte) -108);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class21.field253[var4 + var5] - (class132.field2023[class132.field2023.length - 1 & class227.field3573 + var4] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class21.field253[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class21.field253[var10 + var11] = 255;
                } else {
                    class21.field253[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class37.field551[var13] = class37.field551[arg0 + var13];
        }
        int var14 = var2 - arg0;
        if (arg1 != 128) {
            field2482 = (float[]) null;
        }
        while (var2 > var14) {
            class37.field551[var14] = (int) (Math.sin((double) class325.field5330 / 14.0D) * 16.0D + Math.sin((double) class325.field5330 / 15.0D) * 14.0D + Math.sin((double) class325.field5330 / 16.0D) * 12.0D);
            class325.field5330++;
            var14++;
        }
        class270.field4459 += arg0;
        int var15 = (arg0 + (class58.field875 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class270.field4459; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class21.field253[(var18 << 7) + var17] = 192;
        }
        class270.field4459 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class21.field253[var15 + var22 + var21];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class21.field253[(var22 - -var21) - var15 - 1];
                }
                if (var22 >= 0) {
                    class120.field1794[var22 + var21] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class120.field1794[var23 + (var15 * 128) + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class120.field1794[var23 + var26 - ((var15 - -1) * 128)];
                }
                if (var25 >= 0) {
                    class21.field253[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)I", line = 587)
    public static final int method1106(int arg0, int arg1) {
        field2476++;
        int var2 = arg0 & 0x3F;
        if (arg1 != -3) {
            return -35;
        }
        int var3 = (arg0 & 0xD7) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
