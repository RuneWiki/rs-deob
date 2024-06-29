import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class92 extends class50 {

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    private final int field1768;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    private final int field1775;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    private final int field1763;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    private final int field1770;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    private final int field1766;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    private final int field1773;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    private final int field1765;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    private final int field1772;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field1777 = 0;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1763 * arg1 >> 12;
        ++field1776;
        int var5 = this.field1768 * arg1 >> 12;
        int var6 = this.field1772 * arg2 >> 12;
        int var7 = this.field1770 * arg2 >> 12;
        int var8 = this.field1765 * arg1 >> 12;
        int var9 = this.field1766 * arg2 >> 12;
        int var10 = this.field1773 * arg2 >> 12;
        int var11 = this.field1775 * arg1 >> 12;
        class147.method1012(var5, (byte) -119, var6, var7, var4, var11, var9, super.field893, var10, var8);
        if (!arg0) {
            this.method79(false, -1, 2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final void method80(int arg0, int arg1, int arg2) {
        ++field1764;
        if (arg1 != 23700) {
            field1769 = -52;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
    public final void method75(int arg0, int arg1, int arg2) {
        int var4 = -39 % ((arg1 - -49) / 43);
        ++field1771;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static final void method640(int arg0) {
        ++field1767;
        if (arg0 != -1) {
            method640(84);
        }
        for (class26 var1 = (class26) class246.field4288.method873((byte) 76); var1 != null; var1 = (class26) class246.field4288.method870((byte) 34)) {
            class52 var2 = var1.field328;
            if (class196.field3401 == var2.field918 && !var2.field924) {
                if (~class75.field1501 <= ~var2.field915) {
                    var2.method358(class193.field3347, false);
                    if (!var2.field924) {
                        class159.method1084(var2.field918, var2.field925, var2.field917, var2.field905, 60, var2, 0, -1L, false);
                    } else {
                        var1.method560(-17554);
                    }
                }
            } else {
                var1.method560(-17554);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1768 = arg2;
        this.field1775 = arg6;
        this.field1763 = arg0;
        this.field1770 = arg3;
        this.field1766 = arg5;
        this.field1773 = arg7;
        this.field1765 = arg4;
        this.field1772 = arg1;
    }
}
