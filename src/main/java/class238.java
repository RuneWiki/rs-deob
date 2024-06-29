import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class238 {

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public int field3506 = 16;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
    public boolean field3492 = false;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field3489 = 1;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public int field3503 = -1;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    private int field3504 = -1;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field3513 = new String[5];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "B")
    private byte field3498 = 0;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "S")
    private short field3502 = -1;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Z")
    public boolean field3516 = false;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public int field3521 = -1;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Z")
    public boolean field3535 = false;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
    public boolean field3488 = false;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    private int field3534 = 0;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
    public boolean field3505 = false;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public int field3529 = 0;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Z")
    public boolean field3508 = false;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public int field3532 = 1;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    private int field3514 = -1;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field3493 = -1;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "Z")
    public boolean field3542 = true;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    public int field3543 = -1;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field3497 = -1;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public int field3517 = -1;

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "I")
    private int field3555 = 0;

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
    public int field3547 = -1;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public int field3524 = 0;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    private int field3546 = 0;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "Z")
    private boolean field3526 = false;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public int field3520 = 0;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "Z")
    public boolean field3544 = false;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field3507 = 2;

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "Z")
    public boolean field3554 = false;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Ljava/lang/String;")
    public String field3518 = "null";

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Z")
    public boolean field3515 = false;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public int field3527 = -1;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public int field3509 = -1;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public int field3538 = -1;

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "I")
    private int field3556 = 0;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private int field3528 = 0;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public int field3545 = -1;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private int field3523 = 128;

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "I")
    public int field3561 = 0;

    @OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
    public int field3562 = 255;

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "Z")
    private boolean field3559 = false;

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "I")
    private int field3558 = 128;

    @OriginalMember(owner = "client!fc", name = "yb", descriptor = "Z")
    public boolean field3563 = true;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "Z")
    public boolean field3560 = true;

    @OriginalMember(owner = "client!fc", name = "Ab", descriptor = "Z")
    public boolean field3565 = true;

    @OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
    private int field3564 = 128;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field3512 = 0;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Z")
    public static boolean field3530 = true;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3501 = 0;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Z")
    public static boolean field3539 = true;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "F")
    public static float field3552;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!fc", name = "Bb", descriptor = "Llb;")
    private class224 field3566;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[B")
    private byte[] field3490;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    private int[] field3487;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "[I")
    public int[] field3525;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "[I")
    public int[] field3549;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "[I")
    private int[] field3557;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[S")
    private short[] field3494;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "[S")
    private short[] field3519;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[S")
    private short[] field3531;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "[S")
    private short[] field3551;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)I", line = 7)
    public final int method1693(int arg0, int arg1, boolean arg2) {
        field3511++;
        if (this.field3566 == null) {
            return arg1;
        } else if (arg2) {
            return 81;
        } else {
            class172 var4 = (class172) this.field3566.method1537((long) arg0, -22708);
            return var4 == null ? arg1 : var4.field2483;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 33)
    public static final String method1694(Throwable arg0, boolean arg1) throws IOException {
        field3541++;
        String var3;
        if (arg0 instanceof class293) {
            class293 var2 = (class293) arg0;
            var3 = var2.field4589 + " | ";
            arg0 = var2.field4594;
        } else {
            var3 = "";
        }
        if (arg1) {
            method1707();
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[[IIII[[IZIIBLtb;ILqm;)Lsg;", line = 112)
    public final class42 method1695(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, int[][] arg6, boolean arg7, int arg8, int arg9, byte arg10, class234 arg11, int arg12, class247 arg13) {
        if (arg10 != 90) {
            this.field3542 = true;
        }
        field3495++;
        if (!class250.field3787) {
            long var21;
            if (this.field3557 == null) {
                var21 = (long) ((this.field3548 << 10) + arg8);
            } else {
                var21 = (long) ((arg0 << 3) + (this.field3548 << 10) + arg8);
            }
            class333 var23 = (class333) client.field4227.method1239((byte) -64, var21);
            if (var23 == null) {
                class207 var24 = this.method1700(arg0, (byte) 40, arg8);
                if (var24 == null) {
                    return null;
                }
                var23 = new class333(var24, this.field3556 + 64, this.field3534 * 5 + 768, -50, -10, -50);
                client.field4227.method1243(var23, var21, arg10 ^ 0xFFFF8DC4);
            }
            boolean var25 = false;
            if (arg13 != null) {
                var25 = true;
                var23 = (class333) arg13.method1781(arg1, var23, arg3, -112, arg8, arg4);
            }
            if (arg0 == 10 && arg8 > 3) {
                if (!var25) {
                    var25 = true;
                    var23 = (class333) var23.method695(true, true, true);
                }
                var23.method698(256);
            }
            if (this.field3498 != 0) {
                if (!var25) {
                    var23 = (class333) var23.method695(true, true, true);
                    boolean var26 = true;
                }
                var23 = var23.method2294(this.field3498, this.field3502, arg2, arg6, arg9, arg5, arg12, false);
            }
            class230.field3365.field496 = var23;
            return class230.field3365;
        }
        long var15;
        if (this.field3557 == null) {
            var15 = (long) ((this.field3548 << 10) + arg8);
        } else {
            var15 = (long) ((this.field3548 << 10) - (-(arg0 << 3) - arg8));
        }
        class108 var17 = (class108) client.field4227.method1239((byte) -32, var15);
        if (var17 == null) {
            var17 = this.method1697(arg0, 8023, arg8, true);
            if (var17 == null) {
                return null;
            }
            var17.method692();
            var17.method732(false, false, false, true, false, false, true);
            client.field4227.method1243(var17, var15, arg10 - 29372);
        }
        class108 var18 = var17;
        boolean var19 = false;
        if (arg13 != null) {
            var18 = (class108) arg13.method1778(arg8, arg4, arg3, -234906896, var17, arg1);
            var19 = true;
        }
        if (arg0 == 10 && arg8 > 3) {
            if (!var19) {
                var19 = true;
                var18 = (class108) var18.method695(true, true, true);
            }
            var18.method698(256);
        }
        if (arg7) {
            class230.field3365.field497 = var18.method720(arg11);
        } else {
            class230.field3365.field497 = null;
        }
        if (this.field3498 != 0) {
            if (!var19) {
                boolean var20 = true;
                var18 = (class108) var18.method695(true, true, true);
            }
            var18.method722(this.field3498, this.field3502, var17, arg2, arg6, arg9, arg5, arg12);
        }
        class230.field3365.field496 = var18;
        return class230.field3365;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLp;I)V", line = 246)
    private final void method1696(byte arg0, class107 arg1, int arg2) {
        if (arg2 == 1) {
            int var23 = arg1.method661(-1);
            if (var23 > 0) {
                if (this.field3487 == null || class337.field5207) {
                    this.field3487 = new int[var23];
                    this.field3557 = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        this.field3487[var24] = arg1.method624(class312.method2192(arg0, -14659));
                        this.field3557[var24] = arg1.method661(-1);
                    }
                } else {
                    arg1.field1400 += var23 * 3;
                }
            }
        } else if (arg2 == 2) {
            this.field3518 = arg1.method628(false);
        } else if (arg2 == 5) {
            int var21 = arg1.method661(-1);
            if (var21 > 0) {
                if (this.field3487 == null || class337.field5207) {
                    this.field3557 = null;
                    this.field3487 = new int[var21];
                    for (int var22 = 0; var22 < var21; var22++) {
                        this.field3487[var22] = arg1.method624(arg0 + 14699);
                    }
                } else {
                    arg1.field1400 += var21 * 2;
                }
            }
        } else if (arg2 == 14) {
            this.field3489 = arg1.method661(arg0 + 86);
        } else if (arg2 == 15) {
            this.field3532 = arg1.method661(arg0 + 86);
        } else if (arg2 == 17) {
            this.field3507 = 0;
            this.field3565 = false;
        } else if (arg2 == 18) {
            this.field3565 = false;
        } else if (arg2 == 19) {
            this.field3509 = arg1.method661(-1);
        } else if (arg2 == 21) {
            this.field3498 = 1;
        } else if (arg2 == 22) {
            this.field3526 = true;
        } else if (arg2 == 23) {
            this.field3543 = 1;
        } else if (arg2 == 24) {
            this.field3503 = arg1.method624(14612);
            if (this.field3503 == 65535) {
                this.field3503 = -1;
            }
        } else if (arg2 == 27) {
            this.field3507 = 1;
        } else if (arg2 == 28) {
            this.field3506 = arg1.method661(arg0 + 86);
        } else if (arg2 == 29) {
            this.field3556 = arg1.method679(-3);
        } else if (arg2 == 39) {
            this.field3534 = arg1.method679(arg0 ^ 0x54) * 5;
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field3513[arg2 - 30] = arg1.method628(false);
            if (this.field3513[arg2 - 30].equalsIgnoreCase(class256.field3898)) {
                this.field3513[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var4 = arg1.method661(-1);
            this.field3519 = new short[var4];
            this.field3551 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3519[var5] = (short) arg1.method624(14612);
                this.field3551[var5] = (short) arg1.method624(14612);
            }
        } else if (arg2 == 41) {
            int var19 = arg1.method661(-1);
            this.field3494 = new short[var19];
            this.field3531 = new short[var19];
            for (int var20 = 0; var20 < var19; var20++) {
                this.field3531[var20] = (short) arg1.method624(class312.method2192(arg0, -14659));
                this.field3494[var20] = (short) arg1.method624(14612);
            }
        } else if (arg2 == 42) {
            int var6 = arg1.method661(-1);
            this.field3490 = new byte[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3490[var7] = arg1.method679(class312.method2192(arg0, 84));
            }
        } else if (arg2 == 60) {
            this.field3547 = arg1.method624(14612);
        } else if (arg2 == 62) {
            this.field3559 = true;
        } else if (arg2 == 64) {
            this.field3542 = false;
        } else if (arg2 == 65) {
            this.field3564 = arg1.method624(14612);
        } else if (arg2 == 66) {
            this.field3523 = arg1.method624(14612);
        } else if (arg2 == 67) {
            this.field3558 = arg1.method624(arg0 + 14699);
        } else if (arg2 == 69) {
            arg1.method661(-1);
        } else if (arg2 == 70) {
            this.field3546 = arg1.method656(-104);
        } else if (arg2 == 71) {
            this.field3555 = arg1.method656(-113);
        } else if (arg2 == 72) {
            this.field3528 = arg1.method656(-120);
        } else if (arg2 == 73) {
            this.field3488 = true;
        } else if (arg2 == 74) {
            this.field3535 = true;
        } else if (arg2 == 75) {
            this.field3497 = arg1.method661(arg0 ^ 0x56);
        } else if (arg2 == 77 || arg2 == 92) {
            this.field3514 = arg1.method624(14612);
            if (this.field3514 == 65535) {
                this.field3514 = -1;
            }
            this.field3504 = arg1.method624(arg0 + 14699);
            if (this.field3504 == 65535) {
                this.field3504 = -1;
            }
            int var16 = -1;
            if (arg2 == 92) {
                var16 = arg1.method624(14612);
                if (var16 == 65535) {
                    var16 = -1;
                }
            }
            int var17 = arg1.method661(-1);
            this.field3525 = new int[var17 + 2];
            for (int var18 = 0; var18 <= var17; var18++) {
                this.field3525[var18] = arg1.method624(arg0 + 14699);
                if (this.field3525[var18] == 65535) {
                    this.field3525[var18] = -1;
                }
            }
            this.field3525[var17 + 1] = var16;
        } else if (arg2 == 78) {
            this.field3538 = arg1.method624(14612);
            this.field3561 = arg1.method661(-1);
        } else if (arg2 == 79) {
            this.field3529 = arg1.method624(14612);
            this.field3520 = arg1.method624(14612);
            this.field3561 = arg1.method661(-1);
            int var14 = arg1.method661(-1);
            this.field3549 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3549[var15] = arg1.method624(14612);
            }
        } else if (arg2 == 81) {
            this.field3498 = 2;
            this.field3502 = (short) (arg1.method661(-1) * 256);
        } else if (arg2 == 82) {
            this.field3544 = true;
        } else if (arg2 == 88) {
            this.field3560 = false;
        } else if (arg2 == 89) {
            this.field3563 = false;
        } else if (arg2 == 90) {
            this.field3516 = true;
        } else if (arg2 == 91) {
            this.field3515 = true;
        } else if (arg2 == 93) {
            this.field3498 = 3;
            this.field3502 = (short) arg1.method624(14612);
        } else if (arg2 == 94) {
            this.field3498 = 4;
        } else if (arg2 == 95) {
            this.field3498 = 5;
        } else if (arg2 == 96) {
            this.field3554 = true;
        } else if (arg2 == 97) {
            this.field3505 = true;
        } else if (arg2 == 98) {
            this.field3492 = true;
        } else if (arg2 == 99) {
            this.field3521 = arg1.method661(-1);
            this.field3493 = arg1.method624(14612);
        } else if (arg2 == 100) {
            this.field3527 = arg1.method661(-1);
            this.field3517 = arg1.method624(arg0 ^ 0xFFFFC6BD);
        } else if (arg2 == 101) {
            this.field3524 = arg1.method661(arg0 ^ 0x56);
        } else if (arg2 == 102) {
            this.field3545 = arg1.method624(arg0 ^ 0xFFFFC6BD);
        } else if (arg2 == 103) {
            this.field3543 = 0;
        } else if (arg2 == 104) {
            this.field3562 = arg1.method661(-1);
        } else if (arg2 == 105) {
            this.field3508 = true;
        } else if (arg2 == 249) {
            int var8 = arg1.method661(-1);
            if (this.field3566 == null) {
                int var9 = class258.method1873(var8, arg0 ^ 0xCE60C079);
                this.field3566 = new class224(var9);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                boolean var11 = arg1.method661(-1) == 1;
                int var12 = arg1.method622((byte) 7);
                class332 var13;
                if (var11) {
                    var13 = new class31(arg1.method628(false));
                } else {
                    var13 = new class172(arg1.method676(true));
                }
                this.field3566.method1541(false, var13, (long) var12);
            }
        }
        if (arg0 != -87) {
            this.field3523 = 110;
        }
        field3491++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIZ)Lpe;", line = 686)
    private final class108 method1697(int arg0, int arg1, int arg2, boolean arg3) {
        field3533++;
        Object var5 = null;
        int var6 = this.field3556 + 64;
        int var7 = this.field3534 * 5 + 768;
        if (arg1 != 8023) {
            return (class108) null;
        }
        class108 var12;
        if (this.field3557 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3487 == null) {
                return null;
            }
            int var8 = this.field3487.length;
            if (var8 == 0) {
                return null;
            }
            long var9 = 0L;
            for (int var11 = 0; var11 < var8; var11++) {
                var9 = var9 * 67783L + (long) this.field3487[var11];
            }
            if (arg3) {
                var9 = ~var9;
            }
            var12 = (class108) class256.field3897.method1239((byte) -45, var9);
            if (var12 == null) {
                class207 var13 = null;
                for (int var14 = 0; var14 < var8; var14++) {
                    var13 = class207.method1414(class97.field1262, this.field3487[var14] & 0xFFFF, 0);
                    if (var13 == null) {
                        return null;
                    }
                    if (var8 > 1) {
                        class78.field989[var14] = var13;
                    }
                }
                if (var8 > 1) {
                    var13 = new class207(class78.field989, var8);
                }
                var12 = new class108(var13, var6, var7, arg3);
                class256.field3897.method1243(var12, var9, -29282);
            }
        } else {
            int var15 = -1;
            for (int var16 = 0; var16 < this.field3557.length; var16++) {
                if (this.field3557[var16] == arg0) {
                    var15 = var16;
                    break;
                }
            }
            if (var15 == -1) {
                return null;
            }
            int var17 = this.field3487[var15];
            if (arg3) {
                var17 += 65536;
            }
            var12 = (class108) class256.field3897.method1239((byte) -54, (long) var17);
            if (var12 == null) {
                class207 var18 = class207.method1414(class97.field1262, var17 & 0xFFFF, 0);
                if (var18 == null) {
                    return null;
                }
                var12 = new class108(var18, var6, var7, arg3);
                class256.field3897.method1243(var12, (long) var17, -29282);
            }
        }
        boolean var19 = this.field3523 == 128 && this.field3555 == 0;
        boolean var20 = this.field3559;
        if (arg0 == 2 && arg2 > 3) {
            var20 = !var20;
        }
        boolean var21 = arg2 == 0 && this.field3564 == 128 && this.field3558 == 128 && this.field3546 == 0 && this.field3528 == 0 && !var20;
        class108 var22 = var12.method729(var21, var19, this.field3519 == null, true, var12.method730() == var6, arg2 == 0 && !var20, true, var7 == var12.method719(), true, !var20, this.field3531 == null);
        if (var20) {
            var22.method706();
        }
        if (arg0 == 4 && arg2 > 3) {
            var22.method712(256);
            var22.method688(45, 0, -45);
        }
        int var23 = arg2 & 0x3;
        if (var23 == 1) {
            var22.method686();
        } else if (var23 == 2) {
            var22.method703();
        } else if (var23 == 3) {
            var22.method708();
        }
        if (this.field3519 != null) {
            for (int var24 = 0; var24 < this.field3519.length; var24++) {
                var22.method705(this.field3519[var24], this.field3551[var24]);
            }
        }
        if (this.field3531 != null) {
            for (int var25 = 0; var25 < this.field3531.length; var25++) {
                var22.method693(this.field3531[var25], this.field3494[var25]);
            }
        }
        if (this.field3564 != 128 || this.field3523 != 128 || this.field3558 != 128) {
            var22.method740(this.field3564, this.field3523, this.field3558);
        }
        if (this.field3546 != 0 || this.field3555 != 0 || this.field3528 != 0) {
            var22.method688(this.field3546, this.field3555, this.field3528);
        }
        if (var6 != var22.method730()) {
            var22.method694(var6);
        }
        if (var22.method719() != var7) {
            var22.method715(var7);
        }
        return var22;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lp;Z)V", line = 880)
    public final void method1698(class107 arg0, boolean arg1) {
        field3537++;
        while (true) {
            int var3 = arg0.method661(-1);
            if (var3 == 0) {
                if (arg1) {
                    this.method1700(-1, (byte) 28, 87);
                }
                return;
            }
            this.method1696((byte) -87, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Z", line = 905)
    public final boolean method1699(byte arg0) {
        field3553++;
        if (this.field3487 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 > -34) {
            return true;
        } else {
            for (int var3 = 0; var3 < this.field3487.length; var3++) {
                var2 &= class97.field1262.method1185(0, -2, this.field3487[var3] & 0xFFFF);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)Lpn;", line = 931)
    private final class207 method1700(int arg0, byte arg1, int arg2) {
        class207 var4 = null;
        field3496++;
        boolean var5 = this.field3559;
        if (arg0 == 2 && arg2 > 3) {
            var5 = !var5;
        }
        if (this.field3557 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3487 == null) {
                return null;
            }
            int var9 = this.field3487.length;
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = this.field3487[var10];
                if (var5) {
                    var11 += 65536;
                }
                var4 = (class207) class256.field3897.method1239((byte) -96, (long) var11);
                if (var4 == null) {
                    var4 = class207.method1414(class97.field1262, var11 & 0xFFFF, 0);
                    if (var4 == null) {
                        return null;
                    }
                    if (var5) {
                        var4.method1400();
                    }
                    class256.field3897.method1243(var4, (long) var11, -29282);
                }
                if (var9 > 1) {
                    class78.field989[var10] = var4;
                }
            }
            if (var9 > 1) {
                var4 = new class207(class78.field989, var9);
            }
        } else {
            int var6 = -1;
            for (int var7 = 0; var7 < this.field3557.length; var7++) {
                if (this.field3557[var7] == arg0) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 == -1) {
                return null;
            }
            int var8 = this.field3487[var6];
            if (var5) {
                var8 += 65536;
            }
            var4 = (class207) class256.field3897.method1239((byte) -56, (long) var8);
            if (var4 == null) {
                var4 = class207.method1414(class97.field1262, var8 & 0xFFFF, 0);
                if (var4 == null) {
                    return null;
                }
                if (var5) {
                    var4.method1400();
                }
                class256.field3897.method1243(var4, (long) var8, -29282);
            }
        }
        boolean var12;
        if (this.field3546 == 0 && this.field3555 == 0 && this.field3528 == 0) {
            var12 = false;
        } else {
            var12 = true;
        }
        if (arg1 <= 22) {
            this.method1696((byte) -41, (class107) null, 56);
        }
        boolean var13;
        if (this.field3564 == 128 && this.field3523 == 128 && this.field3558 == 128) {
            var13 = false;
        } else {
            var13 = true;
        }
        class207 var14 = new class207(var4, arg2 == 0 && !var13 && !var12, this.field3519 == null, this.field3531 == null, true);
        if (arg0 == 4 && arg2 > 3) {
            var14.method1428(256);
            var14.method1412(45, 0, -45);
        }
        int var15 = arg2 & 0x3;
        if (var15 == 1) {
            var14.method1408();
        } else if (var15 == 2) {
            var14.method1429();
        } else if (var15 == 3) {
            var14.method1422();
        }
        if (this.field3519 != null) {
            for (int var16 = 0; var16 < this.field3519.length; var16++) {
                if (this.field3490 == null || this.field3490.length <= var16) {
                    var14.method1409(this.field3519[var16], this.field3551[var16]);
                } else {
                    var14.method1409(this.field3519[var16], class74.field959[this.field3490[var16] & 0xFF]);
                }
            }
        }
        if (this.field3531 != null) {
            for (int var17 = 0; var17 < this.field3531.length; var17++) {
                var14.method1416(this.field3531[var17], this.field3494[var17]);
            }
        }
        if (var13) {
            var14.method1420(this.field3564, this.field3523, this.field3558);
        }
        if (var12) {
            var14.method1412(this.field3546, this.field3555, this.field3528);
        }
        return var14;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([[IIB[[IIZZLtb;III)Lsg;", line = 1162)
    public final class42 method1701(int[][] arg0, int arg1, byte arg2, int[][] arg3, int arg4, boolean arg5, boolean arg6, class234 arg7, int arg8, int arg9, int arg10) {
        if (arg2 > -43) {
            this.method1697(113, 34, 43, false);
        }
        field3536++;
        if (class250.field3787) {
            long var12;
            if (this.field3557 == null) {
                var12 = (long) ((this.field3548 << 10) + arg4);
            } else {
                var12 = (long) ((this.field3548 << 10) + (arg1 << 3) + arg4);
            }
            class42 var14 = (class42) class134.field1851.method1239((byte) -56, var12);
            class108 var15;
            class234 var16;
            if (var14 == null) {
                var15 = this.method1697(arg1, 8023, arg4, false);
                if (var15 == null) {
                    class230.field3365.field496 = null;
                    class230.field3365.field497 = null;
                    return class230.field3365;
                }
                if (arg1 == 10 && arg4 > 3) {
                    var15.method698(256);
                }
                if (arg6) {
                    var16 = var15.method720(arg7);
                } else {
                    var16 = null;
                }
                class42 var17 = new class42();
                var17.field497 = var16;
                var17.field496 = var15;
                class134.field1851.method1243(var17, var12, -29282);
            } else {
                var15 = (class108) var14.field496;
                var16 = var14.field497;
            }
            boolean var18 = this.field3526 & arg5;
            class108 var19 = var15.method729(this.field3498 != 3, this.field3498 == 0, true, true, true, true, !var18, true, true, true, true);
            if (this.field3498 != 0) {
                var19.method722(this.field3498, this.field3502, var15, arg3, arg0, arg10, arg8, arg9);
            }
            var19.method732(this.field3509 == 0 && !this.field3492, true, true, true, this.field3509 == 0, true, false);
            class230.field3365.field497 = var16;
            class230.field3365.field496 = var19;
            var19.field1429 = var18;
            return class230.field3365;
        }
        long var20;
        if (this.field3557 == null) {
            var20 = (long) ((this.field3548 << 10) + arg4);
        } else {
            var20 = (long) ((this.field3548 << 10) + (arg1 << 3) + arg4);
        }
        boolean var22;
        if (arg5 && this.field3526) {
            var22 = true;
            var20 |= Long.MIN_VALUE;
        } else {
            var22 = false;
        }
        class47 var23 = (class47) class134.field1851.method1239((byte) -52, var20);
        if (var23 == null) {
            class207 var24 = this.method1700(arg1, (byte) 104, arg4);
            if (var24 == null) {
                class230.field3365.field496 = null;
                return class230.field3365;
            }
            var24.method1417();
            if (arg1 == 10 && arg4 > 3) {
                var24.method1428(256);
            }
            if (var22) {
                var23 = var24;
                var24.field2907 = (short) (this.field3534 * 5 + 768);
                var24.field2901 = (short) (this.field3556 + 64);
                var24.method1418();
            } else {
                var23 = new class333(var24, this.field3556 + 64, this.field3534 * 5 + 768, -50, -10, -50);
            }
            class134.field1851.method1243(var23, var20, -29282);
        }
        if (var22) {
            var23 = ((class207) var23).method1401();
        }
        if (this.field3498 != 0) {
            if (var23 instanceof class333) {
                var23 = ((class333) var23).method2294(this.field3498, this.field3502, arg3, arg0, arg10, arg8, arg9, true);
            } else if (var23 instanceof class207) {
                var23 = ((class207) var23).method1427(this.field3498, this.field3502, arg3, arg0, arg10, arg8, arg9, true, false);
            }
        }
        class230.field3365.field496 = var23;
        return class230.field3365;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;", line = 1307)
    public final String method1702(byte arg0, String arg1, int arg2) {
        field3510++;
        if (this.field3566 == null) {
            return arg1;
        }
        class31 var4 = (class31) this.field3566.method1537((long) arg2, -22708);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 >= -104) {
                this.field3523 = -123;
            }
            return var4.field388;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z", line = 1377)
    public final boolean method1703(int arg0) {
        field3522++;
        if (this.field3525 == null) {
            return this.field3538 != -1 || this.field3549 != null;
        }
        int var2 = -51 % ((-arg0 - 59) / 37);
        for (int var3 = 0; var3 < this.field3525.length; var3++) {
            if (this.field3525[var3] != -1) {
                class238 var4 = class142.method951(this.field3525[var3], 26915);
                if (var4.field3538 != -1 || var4.field3549 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)Z", line = 1424)
    public final boolean method1704(byte arg0, int arg1) {
        field3540++;
        if (arg0 != -126) {
            return false;
        } else if (this.field3557 != null) {
            for (int var3 = 0; var3 < this.field3557.length; var3++) {
                if (this.field3557[var3] == arg1) {
                    return class97.field1262.method1185(0, -2, this.field3487[var3] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field3487 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field3487.length; var5++) {
                var4 &= class97.field1262.method1185(0, arg0 ^ 0x7C, this.field3487[var5] & 0xFFFF);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 1474)
    public final void method1705(int arg0) {
        field3550++;
        if (this.field3509 == -1) {
            this.field3509 = 0;
            if (this.field3487 != null && (this.field3557 == null || this.field3557[0] == 10)) {
                this.field3509 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field3513[var2] != null) {
                    this.field3509 = 1;
                    break;
                }
            }
        }
        if (arg0 == -26130 && this.field3497 == -1) {
            this.field3497 = this.field3507 == 0 ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lfc;", line = 1537)
    public final class238 method1706(boolean arg0) {
        int var2 = -1;
        field3499++;
        if (this.field3514 != -1) {
            var2 = class292.method2080((byte) 50, this.field3514);
        } else if (this.field3504 != -1) {
            var2 = class226.field3235[this.field3504];
        }
        if (var2 < 0 || this.field3525.length - 1 <= var2 || this.field3525[var2] == -1) {
            int var3 = this.field3525[this.field3525.length - 1];
            return var3 == -1 ? null : class142.method951(var3, 26915);
        } else {
            if (!arg0) {
                this.method1697(96, -36, 69, true);
            }
            return class142.method951(this.field3525[var2], 26915);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V", line = 1627)
    public static final void method1707() {
        GL var0 = class250.field3818;
        var0.glDisableClientState(32886);
        class250.method1819(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class250.method1827();
        for (int var1 = 0; var1 < class281.field4365[0].length; var1++) {
            class245 var2 = class281.field4365[0][var1];
            if (var2.field3705 >= 0 && class120.method819(class215.field3020.method391(false, var2.field3705), 81)) {
                var0.glColor4fv(class328.method2269(2, var2.field3695), 0);
                float var3 = 201.5F - (var2.field3713 ? 1.0F : 0.5F);
                var2.method1763(class158.field2184, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class250.method1800();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class250.method1791();
    }
}
