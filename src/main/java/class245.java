import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class245 {

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public int field3506 = -1;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "[I")
    public static int[] field3499 = new int[200];

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "Z")
    public static boolean field3518 = false;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Lje;")
    public static class178 field3509 = null;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Ldi;")
    public static class166 field3510;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Lfa;")
    private class371 field3511;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "Ljava/lang/String;")
    private String field3515;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/String;")
    private String field3521;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[I")
    private int[] field3501;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[I")
    public static int[] field3502;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "[I")
    private int[] field3504;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[I")
    private int[] field3505;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "[I")
    private int[] field3513;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "[I")
    private int[] field3520;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "[I")
    private int[] field3522;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "[I")
    private int[] field3524;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "[I")
    private int[] field3525;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field3503;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "[Ljava/lang/String;")
    private String[] field3516;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "[[I")
    private int[][] field3500;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "[[I")
    private int[][] field3507;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "[[I")
    private int[][] field3514;

    static {
        new class332("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lre;BI)V", line = 12)
    private final void method1557(class446 arg0, byte arg1, int arg2) {
        if (arg1 <= 81) {
            return;
        }
        if (arg2 == 1) {
            this.field3515 = arg0.method2643((byte) -86);
        } else if (arg2 == 2) {
            this.field3521 = arg0.method2643((byte) -86);
        } else if (arg2 == 3) {
            int var22 = arg0.method2628(49152);
            this.field3514 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field3514[var23][0] = arg0.method2631(2530);
                this.field3514[var23][1] = arg0.method2604(-112);
                this.field3514[var23][2] = arg0.method2604(-115);
            }
        } else if (arg2 == 4) {
            int var20 = arg0.method2628(49152);
            this.field3500 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field3500[var21][0] = arg0.method2631(2530);
                this.field3500[var21][1] = arg0.method2604(127);
                this.field3500[var21][2] = arg0.method2604(85);
            }
        } else if (arg2 == 5) {
            arg0.method2631(2530);
        } else if (arg2 == 6) {
            arg0.method2628(49152);
        } else if (arg2 == 7) {
            arg0.method2628(49152);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method2628(49152);
            } else if (arg2 == 10) {
                int var18 = arg0.method2628(49152);
                this.field3504 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field3504[var19] = arg0.method2604(4);
                }
            } else if (arg2 == 12) {
                arg0.method2604(24);
            } else if (arg2 == 13) {
                int var4 = arg0.method2628(49152);
                this.field3505 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3505[var5] = arg0.method2631(2530);
                }
            } else if (arg2 == 14) {
                int var16 = arg0.method2628(49152);
                this.field3507 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field3507[var17][0] = arg0.method2628(49152);
                    this.field3507[var17][1] = arg0.method2628(49152);
                }
            } else if (arg2 == 15) {
                arg0.method2631(2530);
            } else if (arg2 == 17) {
                this.field3506 = arg0.method2631(2530);
            } else if (arg2 == 18) {
                int var14 = arg0.method2628(49152);
                this.field3513 = new int[var14];
                this.field3524 = new int[var14];
                this.field3503 = new String[var14];
                this.field3501 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field3513[var15] = arg0.method2604(-110);
                    this.field3524[var15] = arg0.method2604(-120);
                    this.field3501[var15] = arg0.method2604(-122);
                    this.field3503[var15] = arg0.method2582((byte) -59);
                }
            } else if (arg2 == 19) {
                int var6 = arg0.method2628(49152);
                this.field3522 = new int[var6];
                this.field3525 = new int[var6];
                this.field3520 = new int[var6];
                this.field3516 = new String[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3520[var7] = arg0.method2604(-120);
                    this.field3525[var7] = arg0.method2604(104);
                    this.field3522[var7] = arg0.method2604(115);
                    this.field3516[var7] = arg0.method2582((byte) -58);
                }
            } else if (arg2 == 249) {
                int var8 = arg0.method2628(49152);
                if (this.field3511 == null) {
                    int var9 = class158.method1078((byte) -97, var8);
                    this.field3511 = new class371(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method2628(49152) == 1;
                    int var12 = arg0.method2613(-25778);
                    class35 var13;
                    if (var11) {
                        var13 = new class81(arg0.method2582((byte) -120));
                    } else {
                        var13 = new class145(arg0.method2604(1));
                    }
                    this.field3511.method2307((long) var12, var13, (byte) 120);
                }
            }
        }
        field3523++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 244)
    public static void method1558(int arg0) {
        field3510 = null;
        field3509 = null;
        field3499 = null;
        field3502 = null;
        if (arg0 != -3) {
            field3502 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 257)
    public static final void method1559(int arg0, String arg1, int arg2) {
        field3519++;
        int var3 = class299.field4466;
        int[] var4 = class161.field2218;
        boolean var5 = false;
        if (arg2 != 25297) {
            method1561((class178) null, -115);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class257 var7 = class40.field565[var4[var6]];
            if (var7 != null && class472.field6622 != var7 && var7.field3839 != null && var7.field3839.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg0 == 1) {
                    class12.field176++;
                    class378.method2320(class304.field4527, (byte) 119);
                    class230.field3390.method2608(0, false);
                    class230.field3390.method2624((byte) -3, var4[var6]);
                } else if (arg0 == 4) {
                    class237.field3455++;
                    class378.method2320(class282.field4274, (byte) 119);
                    class230.field3390.method2593(-117, var4[var6]);
                    class230.field3390.method2619((byte) -11, 0);
                } else if (arg0 == 5) {
                    class378.method2320(class9.field151, (byte) 119);
                    class493.field6944++;
                    class230.field3390.method2615(0, (byte) -55);
                    class230.field3390.method2624((byte) -3, var4[var6]);
                } else if (arg0 == 6) {
                    class156.field2171++;
                    class378.method2320(class416.field5999, (byte) 119);
                    class230.field3390.method2592(var4[var6], (byte) -126);
                    class230.field3390.method2607(0, (byte) 110);
                } else if (arg0 == 7) {
                    class378.method2320(class250.field3600, (byte) 119);
                    class315.field4745++;
                    class230.field3390.method2607(0, (byte) 110);
                    class230.field3390.method2592(var4[var6], (byte) -108);
                }
                break;
            }
        }
        if (!var5) {
            class453.method2696(arg2 - 25171, class295.field4437.method2036(class4.field85, (byte) -21) + arg1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLre;)V", line = 351)
    public final void method1560(byte arg0, class446 arg1) {
        while (true) {
            int var3 = arg1.method2628(49152);
            if (var3 == 0) {
                field3517++;
                if (arg0 <= 57) {
                    method1559(58, (String) null, -107);
                    return;
                }
                return;
            }
            this.method1557(arg1, (byte) 98, var3);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lje;I)V", line = 384)
    public static final void method1561(class178 arg0, int arg1) {
        if (arg1 != -11) {
            field3518 = true;
        }
        field3512++;
        if (class301.field4484 != arg0.field2577) {
            return;
        }
        if (class472.field6622.field3839 == null) {
            arg0.field2572 = 0;
            arg0.field2564 = 0;
            return;
        }
        arg0.field2516 = 150;
        arg0.field2656 = (int) (Math.sin((double) class452.field6418 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2572 = class263.field3910;
        arg0.field2584 = 5;
        arg0.field2564 = class256.method1688(-29818, class472.field6622.field3839);
        arg0.field2616 = class472.field6622.field4620;
        arg0.field2568 = class472.field6622.field4610;
        arg0.field2535 = 0;
        arg0.field2563 = class472.field6622.field4662;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 435)
    public final void method1562(int arg0) {
        if (this.field3521 == null) {
            this.field3521 = this.field3515;
        }
        field3508++;
        if (arg0 != 14) {
            field3502 = null;
        }
    }
}
