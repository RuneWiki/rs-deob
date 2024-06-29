import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class30 extends class24 {

    @OriginalMember(owner = "client!da", name = "Lb", descriptor = "B")
    private byte field611 = 0;

    @OriginalMember(owner = "client!da", name = "Tb", descriptor = "I")
    private int field619 = 0;

    @OriginalMember(owner = "client!da", name = "Wb", descriptor = "[I")
    private int[] field622;

    @OriginalMember(owner = "client!da", name = "Hb", descriptor = "[I")
    private int[] field607;

    @OriginalMember(owner = "client!da", name = "Kb", descriptor = "[I")
    private int[] field610;

    @OriginalMember(owner = "client!da", name = "Ib", descriptor = "[B")
    private byte[] field608;

    @OriginalMember(owner = "client!da", name = "Qb", descriptor = "[B")
    private byte[] field616;

    @OriginalMember(owner = "client!da", name = "Ob", descriptor = "[I")
    private int[] field614;

    @OriginalMember(owner = "client!da", name = "Nb", descriptor = "[I")
    private int[] field613;

    @OriginalMember(owner = "client!da", name = "Ub", descriptor = "[I")
    private int[] field620;

    @OriginalMember(owner = "client!da", name = "Vb", descriptor = "[S")
    private short[] field621;

    @OriginalMember(owner = "client!da", name = "Mb", descriptor = "[I")
    private int[] field612;

    @OriginalMember(owner = "client!da", name = "Gb", descriptor = "[I")
    private int[] field606;

    @OriginalMember(owner = "client!da", name = "Pb", descriptor = "[I")
    private int[] field615;

    @OriginalMember(owner = "client!da", name = "Sb", descriptor = "[B")
    private byte[] field618;

    @OriginalMember(owner = "client!da", name = "Jb", descriptor = "Lda;")
    private static class30 field609 = new class30();

    @OriginalMember(owner = "client!da", name = "Rb", descriptor = "[B")
    private static byte[] field617 = new byte[1];

    @OriginalMember(owner = "client!da", name = "Xb", descriptor = "Lda;")
    private static class30 field623 = new class30();

    @OriginalMember(owner = "client!da", name = "Zb", descriptor = "[I")
    private static int[] field625 = new int[12];

    @OriginalMember(owner = "client!da", name = "ac", descriptor = "[Z")
    private static boolean[] field626 = new boolean[4096];

    @OriginalMember(owner = "client!da", name = "cc", descriptor = "[I")
    private static int[] field628 = new int[10];

    @OriginalMember(owner = "client!da", name = "ic", descriptor = "[I")
    private static int[] field634 = new int[4096];

    @OriginalMember(owner = "client!da", name = "jc", descriptor = "[Z")
    private static boolean[] field635 = new boolean[4096];

    @OriginalMember(owner = "client!da", name = "ec", descriptor = "[I")
    private static int[] field630 = class12.field286;

    @OriginalMember(owner = "client!da", name = "lc", descriptor = "[I")
    private static int[] field637 = new int[1600];

    @OriginalMember(owner = "client!da", name = "Yb", descriptor = "[I")
    private static int[] field624 = new int[4096];

    @OriginalMember(owner = "client!da", name = "mc", descriptor = "[[I")
    private static int[][] field638 = new int[1600][512];

    @OriginalMember(owner = "client!da", name = "oc", descriptor = "[I")
    private static int[] field640 = new int[4096];

    @OriginalMember(owner = "client!da", name = "pc", descriptor = "[I")
    private static int[] field641 = new int[10];

    @OriginalMember(owner = "client!da", name = "rc", descriptor = "[I")
    private static int[] field643 = new int[2000];

    @OriginalMember(owner = "client!da", name = "vc", descriptor = "[I")
    private static int[] field647 = class12.field283;

    @OriginalMember(owner = "client!da", name = "kc", descriptor = "[I")
    private static int[] field636 = new int[4096];

    @OriginalMember(owner = "client!da", name = "nc", descriptor = "[I")
    private static int[] field639 = class12.field279;

    @OriginalMember(owner = "client!da", name = "sc", descriptor = "[I")
    private static int[] field644 = new int[2000];

    @OriginalMember(owner = "client!da", name = "uc", descriptor = "[I")
    private static int[] field646 = new int[4096];

    @OriginalMember(owner = "client!da", name = "gc", descriptor = "[I")
    private static int[] field632 = new int[10];

    @OriginalMember(owner = "client!da", name = "tc", descriptor = "[I")
    private static int[] field645 = new int[12];

    @OriginalMember(owner = "client!da", name = "hc", descriptor = "[B")
    private static byte[] field633 = new byte[1];

    @OriginalMember(owner = "client!da", name = "bc", descriptor = "[I")
    private static int[] field627 = class12.field290;

    @OriginalMember(owner = "client!da", name = "qc", descriptor = "[I")
    private static int[] field642 = new int[4096];

    @OriginalMember(owner = "client!da", name = "xc", descriptor = "[[I")
    private static int[][] field649 = new int[12][2000];

    @OriginalMember(owner = "client!da", name = "dc", descriptor = "I")
    private static int field629;

    @OriginalMember(owner = "client!da", name = "fc", descriptor = "I")
    private static int field631;

    @OriginalMember(owner = "client!da", name = "wc", descriptor = "I")
    private static int field648;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lcd;")
    public final class24 method166(boolean arg0) {
        if (!arg0 && field633.length < super.field500) {
            field633 = new byte[super.field500 + 100];
        }
        return this.method208(arg0, field623, field633);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method171();
            int var9 = class12.field289;
            int var10 = class12.field294;
            int var11 = field639[arg0];
            int var12 = field647[arg0];
            int var13 = field639[arg1];
            int var14 = field647[arg1];
            int var15 = field639[arg2];
            int var16 = field647[arg2];
            int var17 = field639[arg3];
            int var18 = field647[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field508; ++var20) {
                int var21 = super.field496[var20];
                int var22 = super.field511[var20];
                int var23 = super.field509[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field624[var20] = var31 - var19;
                field642[var20] = (var27 << 9) / arg7 + var9;
                field640[var20] = (var30 << 9) / arg7 + var10;
                if (this.field619 > 0) {
                    field636[var20] = var27;
                    field646[var20] = var30;
                    field634[var20] = var31;
                }
            }
            this.method215(false, false, 0, super.field513, super.field513 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lcd;)Lcd;")
    public final class24 method207(class24 arg0) {
        return new class30(new class30[] { this, (class30) arg0 }, 2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLda;[B)Lda;")
    private final class30 method208(boolean arg0, class30 arg1, byte[] arg2) {
        arg1.field508 = super.field508;
        arg1.field500 = super.field500;
        arg1.field619 = this.field619;
        if (arg1.field496 == null || arg1.field496.length < super.field508) {
            arg1.field496 = new int[super.field508 + 100];
            arg1.field511 = new int[super.field508 + 100];
            arg1.field509 = new int[super.field508 + 100];
        }
        for (int var4 = 0; var4 < super.field508; ++var4) {
            arg1.field496[var4] = super.field496[var4];
            arg1.field511[var4] = super.field511[var4];
            arg1.field509[var4] = super.field509[var4];
        }
        if (arg0) {
            arg1.field616 = this.field616;
        } else {
            arg1.field616 = arg2;
            if (this.field616 == null) {
                for (int var5 = 0; var5 < super.field500; ++var5) {
                    arg1.field616[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field500; ++var6) {
                    arg1.field616[var6] = this.field616[var6];
                }
            }
        }
        arg1.field622 = this.field622;
        arg1.field607 = this.field607;
        arg1.field610 = this.field610;
        arg1.field614 = this.field614;
        arg1.field613 = this.field613;
        arg1.field620 = this.field620;
        arg1.field608 = this.field608;
        arg1.field618 = this.field618;
        arg1.field621 = this.field621;
        arg1.field611 = this.field611;
        arg1.field612 = this.field612;
        arg1.field606 = this.field606;
        arg1.field615 = this.field615;
        arg1.field494 = super.field494;
        arg1.field503 = super.field503;
        arg1.field515 = super.field515;
        arg1.field501 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Lcd;")
    public final class24 method161(boolean arg0) {
        if (!arg0 && field617.length < super.field500) {
            field617 = new byte[super.field500 + 100];
        }
        return this.method208(arg0, field609, field617);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I")
    private static final int method209(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIII)V")
    private final void method210(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field629 = 0;
            field648 = 0;
            field631 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field494.length) {
                    int[] var10 = super.field494[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field629 += super.field496[var12];
                        field648 += super.field511[var12];
                        field631 += super.field509[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field629 = field629 / var7 + arg2;
                field648 = field648 / var7 + arg3;
                field631 = field631 / var7 + arg4;
            } else {
                field629 = arg2;
                field648 = arg3;
                field631 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field494.length) {
                    int[] var15 = super.field494[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field496[var17] += arg2;
                        super.field511[var17] += arg3;
                        super.field509[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field494.length) {
                    int[] var20 = super.field494[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field496[var22] -= field629;
                        super.field511[var22] -= field648;
                        super.field509[var22] -= field631;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field639[var25];
                            int var27 = field647[var25];
                            int var28 = super.field511[var22] * var26 + super.field496[var22] * var27 + 32767 >> 16;
                            super.field511[var22] = super.field511[var22] * var27 - super.field496[var22] * var26 + 32767 >> 16;
                            super.field496[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field639[var23];
                            int var30 = field647[var23];
                            int var31 = super.field511[var22] * var30 - super.field509[var22] * var29 + 32767 >> 16;
                            super.field509[var22] = super.field511[var22] * var29 + super.field509[var22] * var30 + 32767 >> 16;
                            super.field511[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field639[var24];
                            int var33 = field647[var24];
                            int var34 = super.field509[var22] * var32 + super.field496[var22] * var33 + 32767 >> 16;
                            super.field509[var22] = super.field509[var22] * var33 - super.field496[var22] * var32 + 32767 >> 16;
                            super.field496[var22] = var34;
                        }
                        super.field496[var22] += field629;
                        super.field511[var22] += field648;
                        super.field509[var22] += field631;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field494.length) {
                    int[] var37 = super.field494[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field496[var39] -= field629;
                        super.field511[var39] -= field648;
                        super.field509[var39] -= field631;
                        super.field496[var39] = super.field496[var39] * arg2 / 128;
                        super.field511[var39] = super.field511[var39] * arg3 / 128;
                        super.field509[var39] = super.field509[var39] * arg4 / 128;
                        super.field496[var39] += field629;
                        super.field511[var39] += field648;
                        super.field509[var39] += field631;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field503 != null && this.field616 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field503.length) {
                        int[] var42 = super.field503[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field616[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field616[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method171();
            int var8 = class12.field289;
            int var9 = class12.field294;
            int var10 = field639[arg0];
            int var11 = field647[arg0];
            int var12 = field639[arg1];
            int var13 = field647[arg1];
            int var14 = field639[arg2];
            int var15 = field647[arg2];
            int var16 = field639[arg3];
            int var17 = field647[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field508; ++var19) {
                int var20 = super.field496[var19];
                int var21 = super.field511[var19];
                int var22 = super.field509[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field624[var19] = var30 - var18;
                field642[var19] = (var26 << 9) / var30 + var8;
                field640[var19] = (var29 << 9) / var30 + var9;
                if (this.field619 > 0) {
                    field636[var19] = var26;
                    field646[var19] = var29;
                    field634[var19] = var30;
                }
            }
            this.method215(false, false, 0, super.field513, super.field513 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
    public static void method211() {
        field609 = null;
        field617 = null;
        field623 = null;
        field633 = null;
        field635 = null;
        field626 = null;
        field642 = null;
        field640 = null;
        field624 = null;
        field636 = null;
        field646 = null;
        field634 = null;
        field637 = null;
        field638 = null;
        field645 = null;
        field649 = null;
        field644 = null;
        field643 = null;
        field625 = null;
        field632 = null;
        field641 = null;
        field628 = null;
        field639 = null;
        field647 = null;
        field630 = null;
        field627 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)I")
    private static final int method213(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkf;I)V")
    public final void method169(class96 arg0, int arg1) {
        if (super.field494 != null) {
            if (arg1 != -1) {
                class40 var3 = arg0.field1820[arg1];
                class203 var4 = var3.field757;
                field629 = 0;
                field648 = 0;
                field631 = 0;
                for (int var5 = 0; var5 < var3.field758; ++var5) {
                    int var6 = var3.field754[var5];
                    this.method210(var4.field3971[var6], var4.field3969[var6], var3.field752[var5], var3.field751[var5], var3.field756[var5]);
                }
                super.field501 = false;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkf;ILkf;I[I)V")
    public final void method175(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class40 var6 = arg0.field1820[arg1];
                class40 var7 = arg2.field1820[arg3];
                class203 var8 = var6.field757;
                field629 = 0;
                field648 = 0;
                field631 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field758; ++var11) {
                    int var16 = var6.field754[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field3971[var16] == 0) {
                        this.method210(var8.field3971[var16], var8.field3969[var16], var6.field752[var11], var6.field751[var11], var6.field756[var11]);
                    }
                }
                field629 = 0;
                field648 = 0;
                field631 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field758; ++var14) {
                    int var15 = var7.field754[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field3971[var15] == 0) {
                        this.method210(var8.field3971[var15], var8.field3969[var15], var7.field752[var14], var7.field751[var14], var7.field756[var14]);
                    }
                }
                super.field501 = false;
            } else {
                this.method169(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(I)V")
    private final void method214(int arg0) {
        int var2 = class12.field289;
        int var3 = class12.field294;
        int var4 = 0;
        int var5 = this.field622[arg0];
        int var6 = this.field607[arg0];
        int var7 = this.field610[arg0];
        int var8 = field634[var5];
        int var9 = field634[var6];
        int var10 = field634[var7];
        if (this.field616 == null) {
            class12.field288 = 0;
        } else {
            class12.field288 = this.field616[arg0] & 255;
        }
        if (var8 >= 50) {
            field632[var4] = field642[var5];
            field641[var4] = field640[var5];
            field628[var4++] = this.field614[arg0];
        } else {
            int var11 = field636[var5];
            int var12 = field646[var5];
            int var13 = this.field614[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field627[var10 - var8];
                field632[var4] = (((field636[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field641[var4] = (((field646[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field628[var4++] = ((this.field620[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field627[var9 - var8];
                field632[var4] = (((field636[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field641[var4] = (((field646[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field628[var4++] = ((this.field613[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field632[var4] = field642[var6];
            field641[var4] = field640[var6];
            field628[var4++] = this.field613[arg0];
        } else {
            int var16 = field636[var6];
            int var17 = field646[var6];
            int var18 = this.field613[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field627[var8 - var9];
                field632[var4] = (((field636[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field641[var4] = (((field646[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field628[var4++] = ((this.field614[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field627[var10 - var9];
                field632[var4] = (((field636[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field641[var4] = (((field646[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field628[var4++] = ((this.field620[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field632[var4] = field642[var7];
            field641[var4] = field640[var7];
            field628[var4++] = this.field620[arg0];
        } else {
            int var21 = field636[var7];
            int var22 = field646[var7];
            int var23 = this.field620[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field627[var9 - var10];
                field632[var4] = (((field636[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field641[var4] = (((field646[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field628[var4++] = ((this.field613[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field627[var8 - var10];
                field632[var4] = (((field636[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field641[var4] = (((field646[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field628[var4++] = ((this.field614[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field632[0];
        int var27 = field632[1];
        int var28 = field632[2];
        int var29 = field641[0];
        int var30 = field641[1];
        int var31 = field641[2];
        class12.field277 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class12.field292 || var27 > class12.field292 || var28 > class12.field292) {
                class12.field277 = true;
            }
            if (this.field621 != null && this.field621[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field618 != null && this.field618[arg0] != -1) {
                    int var32 = this.field618[arg0] & 255;
                    var33 = this.field612[var32];
                    var34 = this.field606[var32];
                    var35 = this.field615[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field620[arg0] == -1) {
                    class12.method72(var29, var30, var31, var26, var27, var28, this.field614[arg0], this.field614[arg0], this.field614[arg0], field636[var33], field636[var34], field636[var35], field646[var33], field646[var34], field646[var35], field634[var33], field634[var34], field634[var35], this.field621[arg0]);
                } else {
                    class12.method72(var29, var30, var31, var26, var27, var28, field628[0], field628[1], field628[2], field636[var33], field636[var34], field636[var35], field646[var33], field646[var34], field646[var35], field634[var33], field634[var34], field634[var35], this.field621[arg0]);
                }
            } else if (this.field620[arg0] == -1) {
                class12.method76(var29, var30, var31, var26, var27, var28, field630[this.field614[arg0]]);
            } else {
                class12.method78(var29, var30, var31, var26, var27, var28, field628[0], field628[1], field628[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class12.field292 || var27 > class12.field292 || var28 > class12.field292 || field632[3] < 0 || field632[3] > class12.field292) {
                class12.field277 = true;
            }
            if (this.field621 == null || this.field621[arg0] == -1) {
                if (this.field620[arg0] == -1) {
                    int var41 = field630[this.field614[arg0]];
                    class12.method76(var29, var30, var31, var26, var27, var28, var41);
                    class12.method76(var29, var31, field641[3], var26, var28, field632[3], var41);
                    return;
                }
                class12.method78(var29, var30, var31, var26, var27, var28, field628[0], field628[1], field628[2]);
                class12.method78(var29, var31, field641[3], var26, var28, field632[3], field628[0], field628[2], field628[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field618 != null && this.field618[arg0] != -1) {
                int var36 = this.field618[arg0] & 255;
                var37 = this.field612[var36];
                var38 = this.field606[var36];
                var39 = this.field615[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field621[arg0];
            if (this.field620[arg0] == -1) {
                class12.method72(var29, var30, var31, var26, var27, var28, this.field614[arg0], this.field614[arg0], this.field614[arg0], field636[var37], field636[var38], field636[var39], field646[var37], field646[var38], field646[var39], field634[var37], field634[var38], field634[var39], var40);
                class12.method72(var29, var31, field641[3], var26, var28, field632[3], this.field614[arg0], this.field614[arg0], this.field614[arg0], field636[var37], field636[var38], field636[var39], field646[var37], field646[var38], field646[var39], field634[var37], field634[var38], field634[var39], var40);
                return;
            }
            class12.method72(var29, var30, var31, var26, var27, var28, field628[0], field628[1], field628[2], field636[var37], field636[var38], field636[var39], field646[var37], field646[var38], field646[var39], field634[var37], field634[var38], field634[var39], var40);
            class12.method72(var29, var31, field641[3], var26, var28, field632[3], field628[0], field628[2], field628[3], field636[var37], field636[var38], field636[var39], field646[var37], field646[var38], field646[var39], field634[var37], field634[var38], field634[var39], var40);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([[IIIIZI)Lcd;")
    public final class24 method172(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method171();
        int var7 = super.field514 + arg1;
        int var8 = super.field497 + arg1;
        int var9 = super.field495 + arg3;
        int var10 = super.field505 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class30 var15;
                if (arg4) {
                    var15 = new class30();
                    var15.field508 = super.field508;
                    var15.field500 = super.field500;
                    var15.field619 = this.field619;
                    var15.field496 = super.field496;
                    var15.field509 = super.field509;
                    var15.field622 = this.field622;
                    var15.field607 = this.field607;
                    var15.field610 = this.field610;
                    var15.field614 = this.field614;
                    var15.field613 = this.field613;
                    var15.field620 = this.field620;
                    var15.field608 = this.field608;
                    var15.field616 = this.field616;
                    var15.field618 = this.field618;
                    var15.field621 = this.field621;
                    var15.field611 = this.field611;
                    var15.field612 = this.field612;
                    var15.field606 = this.field606;
                    var15.field615 = this.field615;
                    var15.field494 = super.field494;
                    var15.field503 = super.field503;
                    var15.field515 = super.field515;
                    var15.field511 = new int[var15.field508];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field508; ++var16) {
                        int var17 = super.field496[var16] + arg1;
                        int var18 = super.field509[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field511[var16] = super.field511[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field508; ++var26) {
                        int var27 = (super.field511[var26] << 16) / super.field84;
                        if (var27 < arg5) {
                            int var28 = super.field496[var26] + arg1;
                            int var29 = super.field509[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field511[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field511[var26];
                        } else {
                            var15.field511[var26] = super.field511[var26];
                        }
                    }
                }
                super.field501 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!super.field501) {
            this.method171();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = (super.field516 * arg2 + super.field507 * arg1 >> 16) + var11;
        if (var12 > 50) {
            int var13 = (-super.field516 * arg2 + super.field84 * arg1 >> 16) + var11;
            if (var13 < 3500) {
                int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var15 = super.field516 + var14 << 9;
                if (var15 / var12 > class12.field285) {
                    int var16 = var14 - super.field516 << 9;
                    if (var16 / var12 < class12.field291) {
                        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
                        int var18 = (super.field516 * arg1 + super.field507 * arg2 >> 16) + var17 << 9;
                        if (var18 / var12 > class12.field281) {
                            int var19 = (-super.field516 * arg1 + super.field84 * arg2 >> 16) + var17 << 9;
                            if (var19 / var12 < class12.field278) {
                                boolean var20 = false;
                                boolean var21 = var13 <= 50;
                                boolean var22 = var21 || this.field619 > 0;
                                int var23 = class12.field289;
                                int var24 = class12.field294;
                                int var25 = 0;
                                int var26 = 0;
                                if (arg0 != 0) {
                                    var25 = field639[arg0];
                                    var26 = field647[arg0];
                                }
                                boolean var27 = false;
                                if (arg8 > 0 && class24.field510) {
                                    int var28;
                                    int var29;
                                    if (var14 > 0) {
                                        var28 = var16 / var12;
                                        var29 = var15 / var13;
                                    } else {
                                        var28 = var16 / var13;
                                        var29 = var15 / var12;
                                    }
                                    int var30;
                                    int var31;
                                    if (var17 > 0) {
                                        var30 = var19 / var12;
                                        var31 = var18 / var13;
                                    } else {
                                        var30 = var19 / var13;
                                        var31 = var18 / var12;
                                    }
                                    int var32 = class24.field512 - class12.field289;
                                    int var33 = class24.field502 - class12.field294;
                                    if (var32 >= var28 && var32 <= var29 && var33 >= var30 && var33 <= var31) {
                                        int var34 = 999999;
                                        int var35 = -999999;
                                        int var36 = 999999;
                                        int var37 = -999999;
                                        int[] var38 = new int[] { super.field514, super.field497, super.field514, super.field497, super.field514, super.field497, super.field514, super.field497 };
                                        int[] var39 = new int[] { super.field495, super.field495, super.field505, super.field505, super.field495, super.field495, super.field505, super.field505 };
                                        int[] var40 = new int[] { super.field84, super.field84, super.field84, super.field84, super.field507, super.field507, super.field507, super.field507 };
                                        for (int var41 = 0; var41 < 8; ++var41) {
                                            int var42 = var38[var41];
                                            int var43 = var40[var41];
                                            int var44 = var39[var41];
                                            if (arg0 != 0) {
                                                int var45 = var25 * var44 + var26 * var42 >> 16;
                                                var44 = var26 * var44 - var25 * var42 >> 16;
                                                var42 = var45;
                                            }
                                            int var46 = arg5 + var42;
                                            int var47 = arg6 + var43;
                                            int var48 = arg7 + var44;
                                            int var49 = arg3 * var48 + arg4 * var46 >> 16;
                                            int var50 = arg4 * var48 - arg3 * var46 >> 16;
                                            int var52 = arg2 * var47 - arg1 * var50 >> 16;
                                            int var53 = arg1 * var47 + arg2 * var50 >> 16;
                                            if (var53 > 0) {
                                                int var55 = (var49 << 9) / var53;
                                                int var56 = (var52 << 9) / var53;
                                                if (var55 < var34) {
                                                    var34 = var55;
                                                }
                                                if (var55 > var35) {
                                                    var35 = var55;
                                                }
                                                if (var56 < var36) {
                                                    var36 = var56;
                                                }
                                                if (var56 > var37) {
                                                    var37 = var56;
                                                }
                                            }
                                        }
                                        if (var32 >= var34 && var32 <= var35 && var33 >= var36 && var33 <= var37) {
                                            if (super.field515) {
                                                class24.field506[class24.field498++] = arg8;
                                            } else {
                                                var27 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var57 = 0; var57 < super.field508; ++var57) {
                                    int var58 = super.field496[var57];
                                    int var59 = super.field511[var57];
                                    int var60 = super.field509[var57];
                                    if (arg0 != 0) {
                                        int var61 = var25 * var60 + var26 * var58 >> 16;
                                        var60 = var26 * var60 - var25 * var58 >> 16;
                                        var58 = var61;
                                    }
                                    int var62 = arg5 + var58;
                                    int var63 = arg6 + var59;
                                    int var64 = arg7 + var60;
                                    int var65 = arg3 * var64 + arg4 * var62 >> 16;
                                    int var66 = arg4 * var64 - arg3 * var62 >> 16;
                                    int var68 = arg2 * var63 - arg1 * var66 >> 16;
                                    int var69 = arg1 * var63 + arg2 * var66 >> 16;
                                    field624[var57] = var69 - var11;
                                    if (var69 >= 50) {
                                        field642[var57] = (var65 << 9) / var69 + var23;
                                        field640[var57] = (var68 << 9) / var69 + var24;
                                    } else {
                                        field642[var57] = -5000;
                                        var20 = true;
                                    }
                                    if (var22) {
                                        field636[var57] = var65;
                                        field646[var57] = var68;
                                        field634[var57] = var69;
                                    }
                                }
                                try {
                                    this.method215(var20, var27, arg8, var11 - var13, var12 - var13 + 2);
                                } catch (Exception var71) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZIII)V")
    private final void method215(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var6 = 0; var6 < arg4; ++var6) {
                field637[var6] = 0;
            }
            for (int var7 = 0; var7 < super.field500; ++var7) {
                if (this.field620[var7] != -2) {
                    int var32 = this.field622[var7];
                    int var33 = this.field607[var7];
                    int var34 = this.field610[var7];
                    int var35 = field642[var32];
                    int var36 = field642[var33];
                    int var37 = field642[var34];
                    if (!arg0 || var35 != -5000 && var36 != -5000 && var37 != -5000) {
                        if (arg1 && this.method212(class24.field512, class24.field502, field640[var32], field640[var33], field640[var34], var35, var36, var37)) {
                            class24.field506[class24.field498++] = arg2;
                            arg1 = false;
                        }
                        if ((field640[var34] - field640[var33]) * (var35 - var36) - (field640[var32] - field640[var33]) * (var37 - var36) > 0) {
                            field626[var7] = false;
                            if (var35 >= 0 && var36 >= 0 && var37 >= 0 && var35 <= class12.field292 && var36 <= class12.field292 && var37 <= class12.field292) {
                                field635[var7] = false;
                            } else {
                                field635[var7] = true;
                            }
                            int var57 = (field624[var32] + field624[var33] + field624[var34]) / 3 + arg3;
                            field638[var57][field637[var57]++] = var7;
                        }
                    } else {
                        int var38 = field636[var32];
                        int var39 = field636[var33];
                        int var40 = field636[var34];
                        int var41 = field646[var32];
                        int var42 = field646[var33];
                        int var43 = field646[var34];
                        int var44 = field634[var32];
                        int var45 = field634[var33];
                        int var46 = field634[var34];
                        int var47 = var38 - var39;
                        int var48 = var40 - var39;
                        int var49 = var41 - var42;
                        int var50 = var43 - var42;
                        int var51 = var44 - var45;
                        int var52 = var46 - var45;
                        int var53 = var49 * var52 - var50 * var51;
                        int var54 = var48 * var51 - var47 * var52;
                        int var55 = var47 * var50 - var48 * var49;
                        if (var45 * var55 + var39 * var53 + var42 * var54 > 0) {
                            field626[var7] = true;
                            int var56 = (field624[var32] + field624[var33] + field624[var34]) / 3 + arg3;
                            field638[var56][field637[var56]++] = var7;
                        }
                    }
                }
            }
            if (this.field608 == null) {
                for (int var8 = arg4 - 1; var8 >= 0; --var8) {
                    int var9 = field637[var8];
                    if (var9 > 0) {
                        int[] var10 = field638[var8];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            this.method216(var10[var11]);
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < 12; ++var12) {
                    field645[var12] = 0;
                    field625[var12] = 0;
                }
                for (int var13 = arg4 - 1; var13 >= 0; --var13) {
                    int var26 = field637[var13];
                    if (var26 > 0) {
                        int[] var27 = field638[var13];
                        for (int var28 = 0; var28 < var26; ++var28) {
                            int var29 = var27[var28];
                            byte var30 = this.field608[var29];
                            int var31 = field645[var30]++;
                            field649[var30][var31] = var29;
                            if (var30 < 10) {
                                field625[var30] += var13;
                            } else if (var30 == 10) {
                                field644[var31] = var13;
                            } else {
                                field643[var31] = var13;
                            }
                        }
                    }
                }
                int var14 = 0;
                if (field645[1] > 0 || field645[2] > 0) {
                    var14 = (field625[1] + field625[2]) / (field645[1] + field645[2]);
                }
                int var15 = 0;
                if (field645[3] > 0 || field645[4] > 0) {
                    var15 = (field625[3] + field625[4]) / (field645[3] + field645[4]);
                }
                int var16 = 0;
                if (field645[6] > 0 || field645[8] > 0) {
                    var16 = (field625[6] + field625[8]) / (field645[6] + field645[8]);
                }
                int var17 = 0;
                int var18 = field645[10];
                int[] var19 = field649[10];
                int[] var20 = field644;
                if (var17 == var18) {
                    var17 = 0;
                    var18 = field645[11];
                    var19 = field649[11];
                    var20 = field643;
                }
                int var21;
                if (var17 < var18) {
                    var21 = var20[var17];
                } else {
                    var21 = -1000;
                }
                for (int var22 = 0; var22 < 10; ++var22) {
                    while (var22 == 0 && var21 > var14) {
                        this.method216(var19[var17++]);
                        if (var17 == var18 && field649[11] != var19) {
                            var17 = 0;
                            var18 = field645[11];
                            var19 = field649[11];
                            var20 = field643;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 3 && var21 > var15) {
                        this.method216(var19[var17++]);
                        if (var17 == var18 && field649[11] != var19) {
                            var17 = 0;
                            var18 = field645[11];
                            var19 = field649[11];
                            var20 = field643;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 5 && var21 > var16) {
                        this.method216(var19[var17++]);
                        if (var17 == var18 && field649[11] != var19) {
                            var17 = 0;
                            var18 = field645[11];
                            var19 = field649[11];
                            var20 = field643;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    int var23 = field645[var22];
                    int[] var24 = field649[var22];
                    for (int var25 = 0; var25 < var23; ++var25) {
                        this.method216(var24[var25]);
                    }
                }
                while (var21 != -1000) {
                    this.method216(var19[var17++]);
                    if (var17 == var18 && field649[11] != var19) {
                        var17 = 0;
                        var19 = field649[11];
                        var18 = field645[11];
                        var20 = field643;
                    }
                    if (var17 < var18) {
                        var21 = var20[var17];
                    } else {
                        var21 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "(I)V")
    private final void method216(int arg0) {
        if (field626[arg0]) {
            this.method214(arg0);
        } else {
            int var2 = this.field622[arg0];
            int var3 = this.field607[arg0];
            int var4 = this.field610[arg0];
            class12.field277 = field635[arg0];
            if (this.field616 == null) {
                class12.field288 = 0;
            } else {
                class12.field288 = this.field616[arg0] & 255;
            }
            if (this.field621 != null && this.field621[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field618 != null && this.field618[arg0] != -1) {
                    int var5 = this.field618[arg0] & 255;
                    var6 = this.field612[var5];
                    var7 = this.field606[var5];
                    var8 = this.field615[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field620[arg0] == -1) {
                    class12.method72(field640[var2], field640[var3], field640[var4], field642[var2], field642[var3], field642[var4], this.field614[arg0], this.field614[arg0], this.field614[arg0], field636[var6], field636[var7], field636[var8], field646[var6], field646[var7], field646[var8], field634[var6], field634[var7], field634[var8], this.field621[arg0]);
                } else {
                    class12.method72(field640[var2], field640[var3], field640[var4], field642[var2], field642[var3], field642[var4], this.field614[arg0], this.field613[arg0], this.field620[arg0], field636[var6], field636[var7], field636[var8], field646[var6], field646[var7], field646[var8], field634[var6], field634[var7], field634[var8], this.field621[arg0]);
                }
            } else if (this.field620[arg0] == -1) {
                class12.method76(field640[var2], field640[var3], field640[var4], field642[var2], field642[var3], field642[var4], field630[this.field614[arg0]]);
            } else {
                class12.method78(field640[var2], field640[var3], field640[var4], field642[var2], field642[var3], field642[var4], this.field614[arg0], this.field613[arg0], this.field620[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class30() {
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lfe;IIIII)V")
    public class30(class52 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method335();
        arg0.method323();
        super.field508 = arg0.field953;
        super.field496 = arg0.field943;
        super.field511 = arg0.field969;
        super.field509 = arg0.field950;
        super.field500 = arg0.field942;
        this.field622 = arg0.field974;
        this.field607 = arg0.field979;
        this.field610 = arg0.field975;
        this.field608 = arg0.field952;
        this.field616 = arg0.field947;
        this.field611 = arg0.field966;
        super.field494 = arg0.field972;
        super.field503 = arg0.field937;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field614 = new int[super.field500];
        this.field613 = new int[super.field500];
        this.field620 = new int[super.field500];
        if (arg0.field955 != null) {
            this.field621 = new short[super.field500];
            for (int var9 = 0; var9 < super.field500; ++var9) {
                short var10 = arg0.field955[var9];
                if (var10 != -1 && class12.field275.method605(var10, 114)) {
                    this.field621[var9] = var10;
                } else {
                    this.field621[var9] = -1;
                }
            }
        } else {
            this.field621 = null;
        }
        if (arg0.field971 > 0 && arg0.field945 != null) {
            int[] var11 = new int[arg0.field971];
            for (int var12 = 0; var12 < super.field500; ++var12) {
                if (arg0.field945[var12] != -1) {
                    ++var11[arg0.field945[var12] & 255];
                }
            }
            this.field619 = 0;
            for (int var13 = 0; var13 < arg0.field971; ++var13) {
                if (var11[var13] > 0 && arg0.field936[var13] == 0) {
                    ++this.field619;
                }
            }
            this.field612 = new int[this.field619];
            this.field606 = new int[this.field619];
            this.field615 = new int[this.field619];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field971; ++var15) {
                if (var11[var15] > 0 && arg0.field936[var15] == 0) {
                    this.field612[var14] = arg0.field968[var15] & 65535;
                    this.field606[var14] = arg0.field938[var15] & 65535;
                    this.field615[var14] = arg0.field963[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field618 = new byte[super.field500];
            for (int var16 = 0; var16 < super.field500; ++var16) {
                if (arg0.field945[var16] != -1) {
                    this.field618[var16] = (byte) var11[arg0.field945[var16] & 255];
                    if (this.field618[var16] == -1 && this.field621 != null) {
                        this.field621[var16] = -1;
                    }
                } else {
                    this.field618[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field500; ++var17) {
            byte var18;
            if (arg0.field960 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field960[var17];
            }
            byte var19;
            if (arg0.field947 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field947[var17];
            }
            short var20;
            if (this.field621 == null) {
                var20 = -1;
            } else {
                var20 = this.field621[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class177 var28 = arg0.field965[var17];
                        int var29 = (var28.field3463 * arg5 + var28.field3461 * arg3 + var28.field3458 * arg4) / (var8 / 2 + var8) + arg1;
                        this.field614[var17] = method209(arg0.field946[var17] & 65535, var29);
                        this.field620[var17] = -1;
                    } else if (var18 == 3) {
                        this.field614[var17] = 128;
                        this.field620[var17] = -1;
                    } else {
                        this.field620[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field946[var17] & 65535;
                    class147 var22;
                    if (arg0.field976 != null && arg0.field976[this.field622[var17]] != null) {
                        var22 = arg0.field976[this.field622[var17]];
                    } else {
                        var22 = arg0.field935[this.field622[var17]];
                    }
                    int var23 = (var22.field2714 * arg5 + var22.field2709 * arg4 + var22.field2707 * arg3) / (var22.field2708 * var8) + arg1;
                    this.field614[var17] = method209(var21, var23);
                    class147 var24;
                    if (arg0.field976 != null && arg0.field976[this.field607[var17]] != null) {
                        var24 = arg0.field976[this.field607[var17]];
                    } else {
                        var24 = arg0.field935[this.field607[var17]];
                    }
                    int var25 = (var24.field2714 * arg5 + var24.field2709 * arg4 + var24.field2707 * arg3) / (var24.field2708 * var8) + arg1;
                    this.field613[var17] = method209(var21, var25);
                    class147 var26;
                    if (arg0.field976 != null && arg0.field976[this.field610[var17]] != null) {
                        var26 = arg0.field976[this.field610[var17]];
                    } else {
                        var26 = arg0.field935[this.field610[var17]];
                    }
                    int var27 = (var26.field2714 * arg5 + var26.field2709 * arg4 + var26.field2707 * arg3) / (var26.field2708 * var8) + arg1;
                    this.field620[var17] = method209(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class177 var36 = arg0.field965[var17];
                    int var37 = (var36.field3463 * arg5 + var36.field3461 * arg3 + var36.field3458 * arg4) / (var8 / 2 + var8) + arg1;
                    this.field614[var17] = method213(var37);
                    this.field620[var17] = -1;
                } else {
                    this.field620[var17] = -2;
                }
            } else {
                class147 var30;
                if (arg0.field976 != null && arg0.field976[this.field622[var17]] != null) {
                    var30 = arg0.field976[this.field622[var17]];
                } else {
                    var30 = arg0.field935[this.field622[var17]];
                }
                int var31 = (var30.field2714 * arg5 + var30.field2709 * arg4 + var30.field2707 * arg3) / (var30.field2708 * var8) + arg1;
                this.field614[var17] = method213(var31);
                class147 var32;
                if (arg0.field976 != null && arg0.field976[this.field607[var17]] != null) {
                    var32 = arg0.field976[this.field607[var17]];
                } else {
                    var32 = arg0.field935[this.field607[var17]];
                }
                int var33 = (var32.field2714 * arg5 + var32.field2709 * arg4 + var32.field2707 * arg3) / (var32.field2708 * var8) + arg1;
                this.field613[var17] = method213(var33);
                class147 var34;
                if (arg0.field976 != null && arg0.field976[this.field610[var17]] != null) {
                    var34 = arg0.field976[this.field610[var17]];
                } else {
                    var34 = arg0.field935[this.field610[var17]];
                }
                int var35 = (var34.field2714 * arg5 + var34.field2709 * arg4 + var34.field2707 * arg3) / (var34.field2708 * var8) + arg1;
                this.field620[var17] = method213(var35);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "([Lda;I)V")
    private class30(class30[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field508 = 0;
        super.field500 = 0;
        this.field619 = 0;
        this.field611 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class30 var13 = arg0[var7];
            if (var13 != null) {
                super.field508 += var13.field508;
                super.field500 += var13.field500;
                this.field619 += var13.field619;
                if (var13.field608 != null) {
                    var3 = true;
                } else {
                    if (this.field611 == -1) {
                        this.field611 = var13.field611;
                    }
                    if (this.field611 != var13.field611) {
                        var3 = true;
                    }
                }
                var4 |= var13.field616 != null;
                var5 |= var13.field621 != null;
                var6 |= var13.field618 != null;
            }
        }
        super.field496 = new int[super.field508];
        super.field511 = new int[super.field508];
        super.field509 = new int[super.field508];
        this.field622 = new int[super.field500];
        this.field607 = new int[super.field500];
        this.field610 = new int[super.field500];
        this.field614 = new int[super.field500];
        this.field613 = new int[super.field500];
        this.field620 = new int[super.field500];
        if (var3) {
            this.field608 = new byte[super.field500];
        }
        if (var4) {
            this.field616 = new byte[super.field500];
        }
        if (var5) {
            this.field621 = new short[super.field500];
        }
        if (var6) {
            this.field618 = new byte[super.field500];
        }
        if (this.field619 > 0) {
            this.field612 = new int[this.field619];
            this.field606 = new int[this.field619];
            this.field615 = new int[this.field619];
        }
        super.field508 = 0;
        super.field500 = 0;
        this.field619 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class30 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field500; ++var10) {
                    this.field622[super.field500] = var9.field622[var10] + super.field508;
                    this.field607[super.field500] = var9.field607[var10] + super.field508;
                    this.field610[super.field500] = var9.field610[var10] + super.field508;
                    this.field614[super.field500] = var9.field614[var10];
                    this.field613[super.field500] = var9.field613[var10];
                    this.field620[super.field500] = var9.field620[var10];
                    if (var3) {
                        if (var9.field608 != null) {
                            this.field608[super.field500] = var9.field608[var10];
                        } else {
                            this.field608[super.field500] = var9.field611;
                        }
                    }
                    if (var4 && var9.field616 != null) {
                        this.field616[super.field500] = var9.field616[var10];
                    }
                    if (var5) {
                        if (var9.field621 != null) {
                            this.field621[super.field500] = var9.field621[var10];
                        } else {
                            this.field621[super.field500] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field618 != null && var9.field618[var10] != -1) {
                            this.field618[super.field500] = (byte) (var9.field618[var10] + this.field619);
                        } else {
                            this.field618[super.field500] = -1;
                        }
                    }
                    ++super.field500;
                }
                for (int var11 = 0; var11 < var9.field619; ++var11) {
                    this.field612[this.field619] = var9.field612[var11] + super.field508;
                    this.field606[this.field619] = var9.field606[var11] + super.field508;
                    this.field615[this.field619] = var9.field615[var11] + super.field508;
                    ++this.field619;
                }
                for (int var12 = 0; var12 < var9.field508; ++var12) {
                    super.field496[super.field508] = var9.field496[var12];
                    super.field511[super.field508] = var9.field511[var12];
                    super.field509[super.field508] = var9.field509[var12];
                    ++super.field508;
                }
            }
        }
    }
}
