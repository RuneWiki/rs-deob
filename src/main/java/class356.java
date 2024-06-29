import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class356 extends class83 {

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    private int field5029 = 3216;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "[I")
    private int[] field5021 = new int[3];

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    private int field5031 = 3216;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    private int field5036 = 4096;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "[I")
    public static int[] field5025 = new int[16384];

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field5023 = -1;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "[I")
    public static int[] field5037 = new int[16384];

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5027 = null;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "[[S")
    public static short[][] field5035 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "Lam;")
    public static class286 field5038;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        this.method2167(27698);
        ++field5033;
        if (arg0) {
            this.method37(36, -60);
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    private final void method2167(int arg0) {
        ++field5022;
        if (arg0 == 27698) {
            double var2 = Math.cos((double) ((float) this.field5029 / 4096.0F));
            this.field5021[0] = (int) (var2 * Math.sin((double) ((float) this.field5031 / 4096.0F)) * 4096.0D);
            this.field5021[1] = (int) (Math.cos((double) ((float) this.field5031 / 4096.0F)) * var2 * 4096.0D);
            this.field5021[2] = (int) (Math.sin((double) ((float) this.field5029 / 4096.0F)) * 4096.0D);
            int var4 = this.field5021[0] * this.field5021[0] >> 12;
            int var5 = this.field5021[1] * this.field5021[1] >> 12;
            int var6 = this.field5021[2] * this.field5021[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - (-var5 - var6) >> 12)));
            if (var7 != 0) {
                this.field5021[2] = (this.field5021[2] << 12) / var7;
                this.field5021[0] = (this.field5021[0] << 12) / var7;
                this.field5021[1] = (this.field5021[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2168(int arg0, int arg1, String arg2, String arg3) {
        class230.field3173 = arg3;
        class30.field291 = arg1;
        ++field5030;
        class264.field3600 = arg2;
        if (!class264.field3600.equals("") && !class230.field3173.equals("")) {
            if (~class281.field3854 != 0) {
                class385.method2387(-3);
            } else {
                class305.field4137 = 0;
                class96.field1146 = 0;
                class248.field3339 = 1;
                class297.field4046 = -3;
                class250 var4 = new class250(128);
                var4.method1386(-222840624, 10);
                var4.method1357((int) (Math.random() * 9.9999999E7D), 1826838072);
                var4.method1355(class317.method1829(-105, class264.field3600), (byte) -99);
                var4.method1357((int) (9.9999999E7D * Math.random()), 1826838072);
                var4.method1343(class230.field3173, 22608);
                var4.method1357((int) (9.9999999E7D * Math.random()), arg0 ^ 1826838072);
                var4.method1339(-98, class77.field876, class267.field3644);
                class281.field3857.field3389 = 0;
                class281.field3857.method1386(-222840624, 24);
                class281.field3857.method1386(-222840624, var4.field3389 + 2);
                class281.field3857.method1346(arg0 ^ 122, 559);
                class281.field3857.method1368(var4.field3389, -2008, 0, var4.field3406);
                if (arg0 != 0) {
                    method2172((byte) 19, -34, 'w');
                }
            }
        } else {
            class297.field4046 = 3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLc;)I")
    public static final int method2169(byte arg0, class158 arg1) {
        ++field5024;
        int var2 = -76 % ((-10 - arg0) / 60);
        int var3 = arg1.field2036;
        class70 var4 = arg1.method2606(0);
        if (arg1.field6056) {
            var3 = arg1.field2031;
        } else if (arg1.field6100 != var4.field783 && ~arg1.field6100 != ~var4.field743 && arg1.field6100 != var4.field770 && arg1.field6100 != var4.field775) {
            if (arg1.field6100 == var4.field784 || ~arg1.field6100 == ~var4.field756 || ~arg1.field6100 == ~var4.field774 || arg1.field6100 == var4.field739) {
                var3 = arg1.field2016;
            }
        } else {
            var3 = arg1.field2041;
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field5029 = arg2.method1374(-2);
                }
            } else {
                this.field5031 = arg2.method1374(-2);
            }
        } else {
            this.field5036 = arg2.method1374(-2);
        }
        int var5 = -55 % ((-27 - arg1) / 50);
        ++field5034;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILbl;)V")
    public static final void method2170(int arg0, class54 arg1) {
        class98.field1161[arg0] = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method2171(int arg0, Throwable arg1) throws IOException {
        ++field5032;
        String var3;
        if (arg1 instanceof class315) {
            class315 var2 = (class315) arg1;
            arg1 = var2.field4217;
            var3 = var2.field4213 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 != -13312) {
            method2168(1, 1, (String) null, (String) null);
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) - -1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (~var10 != 0 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field5026;
            int[] var3 = super.field916.method1813(arg1, (byte) 19);
            if (super.field916.field4174) {
                int var4 = class390.field5579 * this.field5036 >> 12;
                int[] var5 = this.method451(0, 77, arg1 + -1 & class109.field1348);
                int[] var6 = this.method451(0, 102, arg1);
                int[] var7 = this.method451(0, 114, class109.field1348 & arg1 + 1);
                for (int var8 = 0; ~class420.field6139 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class213.field2881 & var8 - 1] - var6[class213.field2881 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class349.field4854[var11 - -((var12 + 1) * var12 >> 1)];
                    int var14 = var10 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field5021[2] * var15 >> 12;
                    int var18 = this.field5021[0] * var14 >> 12;
                    int var19 = this.field5021[1] * var16 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class356() {
        super(1, true);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BIC)C")
    public static final char method2172(byte arg0, int arg1, char arg2) {
        ++field5028;
        if (arg2 >= 192 && arg2 <= 255) {
            if (arg2 >= 192 && ~arg2 >= -199) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (arg2 >= 200 && arg2 <= 203) {
                return 'E';
            }
            if (~arg2 <= -205 && arg2 <= 207) {
                return 'I';
            }
            if (arg2 == 209 && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 210 && arg2 <= 214) {
                return 'O';
            }
            if (arg2 >= 217 && arg2 <= 220) {
                return 'U';
            }
            if (arg2 == 221) {
                return 'Y';
            }
            if (~arg2 == -224) {
                return 's';
            }
            if (arg2 >= 224 && ~arg2 >= -231) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (arg2 >= 232 && arg2 <= 235) {
                return 'e';
            }
            if (~arg2 <= -237 && ~arg2 >= -240) {
                return 'i';
            }
            if (~arg2 == -242 && ~arg1 != -1) {
                return 'n';
            }
            if (~arg2 <= -243 && ~arg2 >= -247) {
                return 'o';
            }
            if (arg2 >= 249 && ~arg2 >= -253) {
                return 'u';
            }
            if (arg2 == 253 || arg2 == 255) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else if (~arg2 == -340) {
            return 'o';
        } else if (~arg2 == -377) {
            return 'Y';
        } else if (arg0 >= -46) {
            return (char) 65427;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public static void method2173(int arg0) {
        field5027 = null;
        field5038 = null;
        field5035 = null;
        if (arg0 >= -63) {
            field5025 = null;
        }
        field5025 = null;
        field5037 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field5037[var2] = (int) (32768.0D * Math.sin((double) var2 * var0));
            field5025[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
    }
}
