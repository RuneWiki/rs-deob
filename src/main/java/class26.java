import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ce")
public class class26 extends class85 {

    @OriginalMember(owner = "ce", name = "S", descriptor = "I")
    private int field551 = 4096;

    @OriginalMember(owner = "ce", name = "Y", descriptor = "I")
    private int field557 = 4096;

    @OriginalMember(owner = "ce", name = "V", descriptor = "I")
    private int field554 = 4096;

    @OriginalMember(owner = "ce", name = "U", descriptor = "Llf;")
    public static class109 field553 = class35.method275("Startseite auf (WSpielkonto wiederherstellen(W)3", 2);

    @OriginalMember(owner = "ce", name = "T", descriptor = "Llf;")
    public static class109 field552 = class35.method275("Bitte wenden Sie sich an den Kundendienst)3", 2);

    @OriginalMember(owner = "ce", name = "R", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "ce", name = "Q", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "ce", name = "W", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "ce", name = "X", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "ce", name = "ab", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "ce", name = "Z", descriptor = "Ljava/awt/Frame;")
    public static Frame field558;

    @OriginalMember(owner = "ce", name = "c", descriptor = "(III)V")
    public static final void method218(int arg0, int arg1, int arg2) {
        if (arg1 < 38) {
            method218(82, 74, 117);
        }
        ++field556;
        if (class185.method1253(false, arg2)) {
            class209.method1363(-4019, class169.field3146[arg2], arg0);
        }
    }

    @OriginalMember(owner = "ce", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "ce", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field551 = arg2.method569(true);
                }
            } else {
                this.field554 = arg2.method569(true);
            }
        } else {
            this.field557 = arg2.method569(true);
        }
        if (arg0 >= -120) {
            method218(-70, -28, -46);
        }
        ++field555;
    }

    @OriginalMember(owner = "ce", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (arg1 != 2177) {
            return null;
        } else {
            if (super.field1719.field1926) {
                int[][] var4 = this.method544(false, arg0, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~class57.field1152 < ~var11; ++var11) {
                    int var12 = var6[var11];
                    int var13 = var7[var11];
                    int var14 = var5[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field557 * var12 >> 12;
                        var10[var11] = this.field554 * var13 >> 12;
                        var9[var11] = this.field551 * var14 >> 12;
                    } else {
                        var8[var11] = this.field557;
                        var10[var11] = this.field554;
                        var9[var11] = this.field551;
                    }
                }
            }
            ++field559;
            return var3;
        }
    }

    @OriginalMember(owner = "ce", name = "a", descriptor = "()V")
    public static final void method219() {
        for (int var0 = 0; var0 < class44.field920; ++var0) {
            for (int var5 = 0; var5 < class103.field2036; ++var5) {
                for (int var6 = 0; var6 < class65.field1245; ++var6) {
                    class78.field1550[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class103.field2038; ++var1) {
            for (int var4 = 0; var4 < class103.field2029[var1]; ++var4) {
                class103.field2034[var1][var4] = null;
            }
            class103.field2029[var1] = 0;
        }
        for (int var2 = 0; var2 < class191.field3659; ++var2) {
            class121.field2346[var2] = null;
        }
        class191.field3659 = 0;
        for (int var3 = 0; var3 < class51.field1042.length; ++var3) {
            class51.field1042[var3] = null;
        }
    }

    @OriginalMember(owner = "ce", name = "b", descriptor = "(Z)V")
    public static void method220(boolean arg0) {
        if (arg0) {
            method221(-116, 69, -40, -68);
        }
        field552 = null;
        field558 = null;
        field553 = null;
    }

    @OriginalMember(owner = "ce", name = "a", descriptor = "(IIII)Z")
    public static final boolean method221(int arg0, int arg1, int arg2, int arg3) {
        if (!class201.method1327(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class1.method1(var4 + 1, class29.field623[arg0][arg1][arg2] + arg3, var5 + 1) && class1.method1(var4 + 128 - 1, class29.field623[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class1.method1(var4 + 128 - 1, class29.field623[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class1.method1(var4 + 1, class29.field623[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }
}
