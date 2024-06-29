import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class348 {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public int field4445 = -1;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Loi;")
    public static class169 field4448 = new class169("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Ljr;")
    private class357 field4459;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/String;")
    private String field4444;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Ljava/lang/String;")
    private String field4446;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    private int[] field4438;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[I")
    private int[] field4439;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
    private int[] field4440;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[I")
    private int[] field4442;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[I")
    private int[] field4450;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[I")
    private int[] field4451;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
    private int[] field4456;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    private int[] field4457;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field4453;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field4454;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[[I")
    private int[][] field4441;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[[I")
    private int[][] field4449;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[[I")
    private int[][] field4455;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public final void method2045(boolean arg0) {
        if (this.field4446 == null) {
            this.field4446 = this.field4444;
        }
        field4458++;
        if (!arg0) {
            this.field4450 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbt;II)V")
    private final void method2046(class88 arg0, int arg1, int arg2) {
        if (arg2 > -57) {
            method2048(124, 89, -7, 31, 25, 46, (byte) 24, 89);
        }
        field4452++;
        if (arg1 == 1) {
            this.field4444 = arg0.method585(false);
        } else if (arg1 == 2) {
            this.field4446 = arg0.method585(false);
        } else if (arg1 == 3) {
            int var4 = arg0.method617(2);
            this.field4455 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4455[var5][0] = arg0.method568((byte) 110);
                this.field4455[var5][1] = arg0.method578(116);
                this.field4455[var5][2] = arg0.method578(102);
            }
        } else if (arg1 == 4) {
            int var6 = arg0.method617(2);
            this.field4441 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4441[var7][0] = arg0.method568((byte) 110);
                this.field4441[var7][1] = arg0.method578(97);
                this.field4441[var7][2] = arg0.method578(100);
            }
        } else if (arg1 == 5) {
            arg0.method568((byte) 110);
        } else if (arg1 == 6) {
            arg0.method617(2);
            return;
        } else if (arg1 == 7) {
            arg0.method617(2);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method617(2);
                return;
            }
            if (arg1 != 10) {
                if (arg1 == 12) {
                    arg0.method578(113);
                    return;
                }
                if (arg1 == 13) {
                    int var8 = arg0.method617(2);
                    this.field4456 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field4456[var9] = arg0.method568((byte) 110);
                    }
                    return;
                }
                if (arg1 == 14) {
                    int var10 = arg0.method617(2);
                    this.field4449 = new int[var10][2];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field4449[var11][0] = arg0.method617(2);
                        this.field4449[var11][1] = arg0.method617(2);
                    }
                    return;
                }
                if (arg1 == 15) {
                    arg0.method568((byte) 110);
                } else if (arg1 == 17) {
                    this.field4445 = arg0.method568((byte) 110);
                    return;
                } else if (arg1 == 18) {
                    int var12 = arg0.method617(2);
                    this.field4453 = new String[var12];
                    this.field4451 = new int[var12];
                    this.field4450 = new int[var12];
                    this.field4457 = new int[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field4451[var13] = arg0.method578(108);
                        this.field4450[var13] = arg0.method578(100);
                        this.field4457[var13] = arg0.method578(87);
                        this.field4453[var13] = arg0.method591(20557);
                    }
                    return;
                } else if (arg1 == 19) {
                    int var14 = arg0.method617(2);
                    this.field4440 = new int[var14];
                    this.field4454 = new String[var14];
                    this.field4442 = new int[var14];
                    this.field4439 = new int[var14];
                    for (int var15 = 0; var15 < var14; var15++) {
                        this.field4439[var15] = arg0.method578(108);
                        this.field4442[var15] = arg0.method578(101);
                        this.field4440[var15] = arg0.method578(127);
                        this.field4454[var15] = arg0.method591(20557);
                    }
                    return;
                } else if (arg1 == 249) {
                    int var16 = arg0.method617(2);
                    if (this.field4459 == null) {
                        int var17 = class124.method788(var16, -123);
                        this.field4459 = new class357(var17);
                    }
                    for (int var18 = 0; var18 < var16; var18++) {
                        boolean var19 = arg0.method617(2) == 1;
                        int var20 = arg0.method584(255);
                        class508 var21;
                        if (var19) {
                            var21 = new class372(arg0.method591(20557));
                        } else {
                            var21 = new class206(arg0.method578(120));
                        }
                        this.field4459.method2096((long) var20, var21, (byte) 76);
                    }
                    return;
                }
                return;
            }
            int var22 = arg0.method617(2);
            this.field4438 = new int[var22];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4438[var23] = arg0.method578(127);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbt;B)V")
    public final void method2047(class88 arg0, byte arg1) {
        field4443++;
        if (arg1 >= -36) {
            this.field4438 = null;
        }
        while (true) {
            int var3 = arg0.method617(2);
            if (var3 == 0) {
                return;
            }
            this.method2046(arg0, var3, -110);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = 32 / ((-arg6 - 45) / 62);
        if (class65.field827 <= arg1 && arg3 <= class281.field3589 && class418.field5559 <= arg0 && arg4 <= class456.field6365) {
            class6.method32(arg3, arg1, arg0, arg5, 64, arg7, arg4, arg2);
        } else {
            class235.method1498(arg0, arg7, arg3, arg4, arg1, arg2, arg5, 64);
        }
        field4447++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method2049(int arg0) {
        field4448 = null;
        if (arg0 < 55) {
            field4448 = null;
        }
    }
}
