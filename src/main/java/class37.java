import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class37 extends class12 {

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public int field604 = 2;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public int field612 = -1;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "Z")
    public boolean field605 = false;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public int field599 = -1;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public int field618 = -1;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public int field609 = -1;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public int field614 = -1;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public int field621 = 99;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public int field607 = 5;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Lmd;")
    public static class113 field610 = new class113(512);

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lkb;")
    private static class93 field625 = class76.method390("Loading)3)3)3", 0);

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Lkb;")
    public static class93 field623 = field625;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "[I")
    public static int[] field628 = new int[5];

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "Lkb;")
    private static class93 field631 = class76.method390("Starting game engine)3)3)3", 0);

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "[I")
    public static int[] field633 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Lkb;")
    public static class93 field626 = field631;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lkb;")
    private static class93 field632 = class76.method390("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 0);

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lkb;")
    public static class93 field627 = field632;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "[I")
    private int[] field611;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[I")
    public int[] field615;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
    public int[] field616;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "[I")
    private int[] field622;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "[I")
    public int[] field630;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lfd;ILdg;BI)Lfd;")
    public final class52 method200(class52 arg0, int arg1, class37 arg2, byte arg3, int arg4) {
        int var6 = this.field616[arg4];
        if (arg3 != -2) {
            this.field607 = -115;
        }
        field603++;
        class46 var7 = class30.method176(var6 >> 16, 109);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method209(arg0, arg1, (byte) 75);
        }
        int var9 = arg2.field616[arg1];
        class46 var10 = class30.method176(var9 >> 16, 107);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class52 var12 = arg0.method273(!var7.method243(arg3 ^ 0x4A, var8));
            var12.method279(var7, var8);
            return var12;
        } else {
            class52 var13 = arg0.method273(!var7.method243(-102, var8) & !var10.method243(-125, var11));
            var13.method282(var7, var8, var10, var11, this.field611);
            return var13;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
    public final void method201(byte arg0) {
        if (this.field618 == -1) {
            if (this.field611 == null) {
                this.field618 = 0;
            } else {
                this.field618 = 2;
            }
        }
        field608++;
        if (this.field612 == -1) {
            if (this.field611 == null) {
                this.field612 = 0;
            } else {
                this.field612 = 2;
            }
        }
        if (arg0 != 103) {
            field627 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLfd;)Lfd;")
    public final class52 method202(int arg0, boolean arg1, class52 arg2) {
        field613++;
        int var4 = this.field616[arg0];
        class46 var5 = class30.method176(var4 >> 16, 53);
        if (!arg1) {
            this.method200(null, -11, null, (byte) 70, 13);
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method277(true);
        } else {
            class52 var7 = arg2.method277(!var5.method243(-70, var6));
            var7.method279(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lrd;Z)V")
    public final void method203(class158 arg0, boolean arg1) {
        if (arg1) {
            this.method201((byte) -121);
        }
        while (true) {
            int var3 = arg0.method1054(128);
            if (var3 == 0) {
                field601++;
                return;
            }
            this.method207(var3, -34, arg0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
    public static final int method204(byte arg0, int arg1) {
        field602++;
        return arg0 >= -95 ? -78 : arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static void method205(byte arg0) {
        field628 = null;
        field633 = null;
        field623 = null;
        field626 = null;
        field632 = null;
        field610 = null;
        field627 = null;
        if (arg0 != -46) {
            method205((byte) -61);
        }
        field631 = null;
        field625 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLfd;I)Lfd;")
    public final class52 method206(int arg0, byte arg1, class52 arg2, int arg3) {
        int var5 = this.field616[arg0];
        class46 var6 = class30.method176(var5 >> 16, 34);
        int var7 = var5 & 0xFFFF;
        field620++;
        if (var6 == null) {
            return arg2.method273(true);
        }
        int var8 = 112 / ((arg1 + 29) / 48);
        int var9 = arg3 & 0x3;
        class52 var10 = arg2.method273(!var6.method243(-58, var7));
        if (var9 == 1) {
            var10.method274();
        } else if (var9 == 2) {
            var10.method281();
        } else if (var9 == 3) {
            var10.method270();
        }
        var10.method279(var6, var7);
        if (var9 == 1) {
            var10.method270();
        } else if (var9 == 2) {
            var10.method281();
        } else if (var9 == 3) {
            var10.method274();
        }
        return var10;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILrd;)V")
    private final void method207(int arg0, int arg1, class158 arg2) {
        if (arg0 == 1) {
            int var11 = arg2.method1071(28101);
            this.field615 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field615[var12] = arg2.method1071(28101);
            }
            this.field616 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field616[var13] = arg2.method1071(28101);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field616[var14] = (arg2.method1071(28101) << 16) + this.field616[var14];
            }
        } else if (arg0 == 2) {
            this.field609 = arg2.method1071(28101);
        } else if (arg0 == 3) {
            int var4 = arg2.method1054(128);
            this.field611 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field611[var5] = arg2.method1054(128);
            }
            this.field611[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field605 = true;
        } else if (arg0 == 5) {
            this.field607 = arg2.method1054(128);
        } else if (arg0 == 6) {
            this.field614 = arg2.method1071(28101);
        } else if (arg0 == 7) {
            this.field599 = arg2.method1071(28101);
        } else if (arg0 == 8) {
            this.field621 = arg2.method1054(128);
        } else if (arg0 == 9) {
            this.field612 = arg2.method1054(128);
        } else if (arg0 == 10) {
            this.field618 = arg2.method1054(128);
        } else if (arg0 == 11) {
            this.field604 = arg2.method1054(128);
        } else if (arg0 == 12) {
            int var6 = arg2.method1054(128);
            this.field622 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field622[var7] = arg2.method1071(28101);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field622[var8] += arg2.method1071(28101) << 16;
            }
        } else if (arg0 == 13) {
            int var9 = arg2.method1054(128);
            this.field630 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field630[var10] = arg2.method1060(255);
            }
        }
        if (arg1 >= -19) {
            this.field630 = null;
        }
        field617++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILfd;B)Lfd;")
    public final class52 method208(int arg0, class52 arg1, byte arg2) {
        field606++;
        int var4 = this.field616[arg0];
        class46 var5 = class30.method176(var4 >> 16, arg2 ^ 0xFFFFFFDB);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method273(true);
        }
        int var7 = 0;
        class46 var8 = null;
        if (arg2 != -102) {
            method204((byte) -123, 7);
        }
        if (this.field622 != null && this.field622.length > arg0) {
            int var9 = this.field622[arg0];
            var8 = class30.method176(var9 >> 16, arg2 + 221);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class52 var11 = arg1.method273(!var5.method243(-64, var6));
            var11.method279(var5, var6);
            return var11;
        } else {
            class52 var10 = arg1.method273(!var5.method243(-121, var6) & !var8.method243(-67, var7));
            var10.method279(var5, var6);
            var10.method279(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lfd;IB)Lfd;")
    public final class52 method209(class52 arg0, int arg1, byte arg2) {
        int var4 = this.field616[arg1];
        class46 var5 = class30.method176(var4 >> 16, 44);
        int var6 = var4 & 0xFFFF;
        field619++;
        if (arg2 != 75) {
            this.method207(35, 41, null);
        }
        if (var5 == null) {
            return arg0.method273(true);
        } else {
            class52 var7 = arg0.method273(!var5.method243(-101, var6));
            var7.method279(var5, var6);
            return var7;
        }
    }
}
