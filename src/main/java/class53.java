import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class53 {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field674 = -1;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[[Ljava/lang/String;")
    public static String[][] field675 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
    public static int[] field679 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lgfa;")
    public static class150 field693 = new class150();

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field696 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lwh;")
    private class546 field685;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Ljava/lang/String;")
    private String field684;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljava/lang/String;")
    private String field687;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    private int[] field672;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    private int[] field676;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    private int[] field677;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
    private int[] field681;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
    private int[] field683;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
    private int[] field690;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
    private int[] field694;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "[I")
    private int[] field695;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field673;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field688;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[[I")
    private int[][] field680;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[[I")
    private int[][] field682;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "[[I")
    private int[][] field692;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 3)
    public static void method309(int arg0) {
        field675 = null;
        field693 = null;
        field679 = null;
        if (arg0 != -22790) {
            method312(26, 124, -35, 27, 61, null, -85, null, -26);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lio;Z)V", line = 16)
    public final void method310(class157 arg0, boolean arg1) {
        if (arg1) {
            method312(-9, -80, 73, -55, 71, null, -77, null, 123);
        }
        field686++;
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method311(arg0, var3, 4);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lio;II)V", line = 57)
    private final void method311(class157 arg0, int arg1, int arg2) {
        field670++;
        if (arg1 == 1) {
            this.field687 = arg0.method932(0);
        } else if (arg1 == 2) {
            this.field684 = arg0.method932(0);
        } else if (arg1 == 3) {
            int var22 = arg0.method930(255);
            this.field680 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field680[var23][0] = arg0.method963(-118);
                this.field680[var23][1] = arg0.method908(false);
                this.field680[var23][2] = arg0.method908(false);
            }
        } else if (arg1 == 4) {
            int var20 = arg0.method930(arg2 ^ 0xFB);
            this.field692 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field692[var21][0] = arg0.method963(-123);
                this.field692[var21][1] = arg0.method908(false);
                this.field692[var21][2] = arg0.method908(false);
            }
        } else if (arg1 == 5) {
            arg0.method963(-124);
        } else if (arg1 == 6) {
            arg0.method930(255);
        } else if (arg1 == 7) {
            arg0.method930(255);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method930(arg2 + 251);
            } else if (arg1 == 10) {
                int var18 = arg0.method930(255);
                this.field676 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field676[var19] = arg0.method908(false);
                }
            } else if (arg1 == 12) {
                arg0.method908(false);
            } else if (arg1 == 13) {
                int var4 = arg0.method930(255);
                this.field690 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field690[var5] = arg0.method963(-127);
                }
            } else if (arg1 == 14) {
                int var6 = arg0.method930(255);
                this.field682 = new int[var6][2];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field682[var7][0] = arg0.method930(class50.method268(arg2, 251));
                    this.field682[var7][1] = arg0.method930(255);
                }
            } else if (arg1 == 15) {
                arg0.method963(arg2 - 129);
            } else if (arg1 == 17) {
                this.field674 = arg0.method963(-122);
            } else if (arg1 == 18) {
                int var16 = arg0.method930(255);
                this.field688 = new String[var16];
                this.field672 = new int[var16];
                this.field681 = new int[var16];
                this.field695 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field681[var17] = arg0.method908(false);
                    this.field695[var17] = arg0.method908(false);
                    this.field672[var17] = arg0.method908(false);
                    this.field688[var17] = arg0.method925(120);
                }
            } else if (arg1 == 19) {
                int var14 = arg0.method930(255);
                this.field677 = new int[var14];
                this.field694 = new int[var14];
                this.field673 = new String[var14];
                this.field683 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field683[var15] = arg0.method908(false);
                    this.field694[var15] = arg0.method908(false);
                    this.field677[var15] = arg0.method908(false);
                    this.field673[var15] = arg0.method925(77);
                }
            } else if (arg1 == 249) {
                int var8 = arg0.method930(255);
                if (this.field685 == null) {
                    int var9 = class385.method2206(0, var8);
                    this.field685 = new class546(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method930(255) == 1;
                    int var12 = arg0.method933((byte) 1);
                    class45 var13;
                    if (var11) {
                        var13 = new class419(arg0.method925(126));
                    } else {
                        var13 = new class37(arg0.method908(false));
                    }
                    this.field685.method3061(127, (long) var12, var13);
                }
            }
        }
        if (arg2 != 4) {
            this.method311(null, 10, 55);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII[BI[BI)V", line = 302)
    public static final void method312(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field691++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg2;
        if (arg0 != -1) {
            field675 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg5[var10001] += arg7[arg3++];
                int var14 = arg6++;
                arg5[var14] += arg7[arg3++];
                int var15 = arg6++;
                arg5[var15] += arg7[arg3++];
                int var16 = arg6++;
                arg5[var16] += arg7[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg5[var10001] += arg7[arg3++];
            }
            arg6 += arg4;
            arg3 += arg8;
            var11++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 353)
    public final void method313(byte arg0) {
        if (this.field684 == null) {
            this.field684 = this.field687;
        }
        field671++;
        if (arg0 < 30) {
            this.method310(null, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lfea;", line = 374)
    public static final class47 method314(int arg0) {
        field689++;
        try {
            return new class528();
        } catch (Throwable var2) {
            if (arg0 != 2047) {
                method309(114);
            }
            try {
                return (class47) Class.forName("et").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class283();
            }
        }
    }
}
