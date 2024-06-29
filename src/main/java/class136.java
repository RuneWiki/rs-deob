import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class136 extends class252 {

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "S")
    public static short field1743 = 256;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
    public static int[] field1738 = new int[13];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
    public final void method378(int arg0, int arg1, int arg2) {
        if (arg0 != 16136) {
            method734((byte) 126);
        }
        ++field1746;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method733(int arg0) {
        field1738 = null;
        if (arg0 != 13) {
            method733(90);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Z")
    public static final boolean method734(byte arg0) {
        ++field1734;
        if (class32.field310) {
            try {
                class245.method1313(class159.field2055.field6532, (byte) -27, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 < 16) {
            method734((byte) 104);
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1740 = arg3;
        this.field1745 = arg5;
        this.field1741 = arg7;
        this.field1735 = arg4;
        this.field1739 = arg2;
        this.field1736 = arg0;
        this.field1730 = arg6;
        this.field1733 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method733(-31);
        }
        ++field1742;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIII)V")
    public static final void method735(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            for (int var5 = 0; ~class274.field3694 < ~var5; ++var5) {
                Rectangle var6 = class128.field1651[var5];
                if (var6.x + var6.width > arg3 && arg3 - -arg2 > var6.x && arg4 < var6.y + var6.height && arg4 - -arg1 > var6.y) {
                    class321.field4290[var5] = true;
                }
            }
            ++field1744;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)V")
    public final void method380(boolean arg0, int arg1, int arg2) {
        ++field1732;
        int var4 = this.field1736 * arg2 >> 12;
        int var5 = this.field1733 * arg1 >> 12;
        int var6 = this.field1739 * arg2 >> 12;
        int var7 = this.field1740 * arg1 >> 12;
        int var8 = this.field1735 * arg2 >> 12;
        if (arg0) {
            int var9 = this.field1745 * arg1 >> 12;
            int var10 = this.field1730 * arg2 >> 12;
            int var11 = this.field1741 * arg1 >> 12;
            class211.method1145(var10, var9, var5, var7, var4, super.field3447, false, var11, var6, var8);
        }
    }
}
