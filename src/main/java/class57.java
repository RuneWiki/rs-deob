import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class57 extends class270 {

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "Z")
    private boolean field844 = true;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "Z")
    private boolean field842 = true;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "[Z")
    public static boolean[] field839 = new boolean[100];

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "Lmh;")
    public static class62 field835 = class201.method1405(true, " loggt sich aus)3");

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "Lmh;")
    private static class62 field834 = class201.method1405(true, "Choose Option");

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "Lmh;")
    public static class62 field837 = field834;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lmi;II)V", line = 18)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field844 = arg0.method702(-1) == 1;
        } else if (arg1 == 1) {
            this.field842 = arg0.method702(-1) == 1;
        } else if (arg1 == 2) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        int var5 = -35 % ((-arg2 - 8) / 53);
        field838++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V", line = 52)
    public static final void method373(int arg0, byte arg1) {
        class151 var2 = class165.method1194((byte) 1, 7, arg0);
        var2.method1081(arg1 ^ 0xFFFFFF4A);
        field841++;
        if (arg1 != -54) {
            field834 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 63)
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "(B)I", line = 74)
    public static final int method374(byte arg0) {
        if (arg0 < 71) {
            return -118;
        } else {
            field833++;
            return class206.field3487;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I", line = 120)
    public final int[] method6(int arg0, int arg1) {
        field843++;
        if (arg0 != 18693) {
            method373(111, (byte) 69);
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, this.field842 ? class307.field5268 - arg1 : arg1);
            if (this.field844) {
                for (int var5 = 0; var5 < class109.field1770; var5++) {
                    var3[var5] = var4[class49.field717 - var5];
                }
            } else {
                class231.method1637(var4, 0, var3, 0, class109.field1770);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(B)V", line = 154)
    public static void method375(byte arg0) {
        field835 = null;
        if (arg0 == -27) {
            field839 = null;
            field834 = null;
            field837 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 171)
    public static final void method376(int arg0) {
        class154.method1127();
        field840++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        if (class212.field3569 != null) {
            class184.method1289(class212.field3569, class193.field3246, (byte) 103);
        }
        class212.field3569 = null;
        class197.method1378(false, 0);
        class108.method833(118);
        if (arg0 != -28268) {
            field835 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[[I", line = 191)
    public final int[][] method11(boolean arg0, int arg1) {
        field845++;
        if (arg0) {
            method374((byte) 43);
        }
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, this.field842 ? class307.field5268 - arg1 : arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field844) {
                for (int var12 = 0; var12 < class109.field1770; var12++) {
                    var9[var12] = var6[class49.field717 - var12];
                    var8[var12] = var5[class49.field717 - var12];
                    var10[var12] = var7[class49.field717 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class109.field1770; var11++) {
                    var9[var11] = var6[var11];
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIIIIIIIIIII)Z", line = 261)
    public static final boolean method377(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field836++;
        if (arg1 != 13581) {
            return false;
        } else if (class268.field4551.method1101(true) == 2) {
            return class17.method70(arg10, arg2, arg8, arg6, arg3, arg9, arg5, arg11, arg0, -1, arg4, arg7);
        } else if (class268.field4551.method1101(true) <= 2) {
            return class185.method1299(arg5, -20374, arg4, arg2, arg10, arg8, arg7, arg3, arg9, arg0, arg6, arg11);
        } else {
            return class262.method1814(arg10, arg8, arg5, arg0, arg11, arg9, arg6, arg7, class268.field4551.method1101(true), arg2, arg4, arg3, 40);
        }
    }
}
