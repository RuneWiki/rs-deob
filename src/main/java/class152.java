import java.applet.Applet;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class152 {

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "B")
    public byte field1806;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "B")
    public byte field1809;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "B")
    public byte field1815;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "B")
    public byte field1816;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "B")
    public byte field1820;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "B")
    public byte field1821;

    @OriginalMember(owner = "client!tba", name = "y", descriptor = "B")
    public byte field1828;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "F")
    public static float field1813;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "Ljava/applet/Applet;")
    public static Applet field1827;

    @OriginalMember(owner = "client!tba", name = "v", descriptor = "S")
    public short field1825;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "Z")
    public boolean field1804;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Z")
    public boolean field1807;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "Z")
    public boolean field1808;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "Z")
    public boolean field1811;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "Z")
    public boolean field1812;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "Z")
    public boolean field1817;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "Z")
    public boolean field1818;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "Z")
    public boolean field1819;

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "Z")
    public boolean field1826;

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "Z")
    public boolean field1829;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public static void method941(byte arg0) {
        field1827 = null;
        int var1 = 124 % ((arg0 - 55) / 43);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lqj;IIIII)Ljava/awt/Frame;")
    public static final Frame method942(class476 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1823++;
        if (!arg0.method2589((byte) -63)) {
            return null;
        }
        if (arg5 == 0) {
            class48[] var6 = class177.method1055(arg0, (byte) -38);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field637 == arg1 && var6[var8].field636 == arg2 && (arg4 == 0 || var6[var8].field639 == arg4) && (!var7 || var6[var8].field640 > arg5)) {
                    var7 = true;
                    arg5 = var6[var8].field640;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg3 != 28618) {
            field1827 = null;
        }
        class218 var9 = arg0.method2598(arg3 - 28726, arg4, arg5, arg2, arg1);
        while (var9.field2546 == 0) {
            class700.method3867(29279, 10L);
        }
        Frame var10 = (Frame) var9.field2547;
        if (var10 == null) {
            return null;
        } else if (var9.field2546 == 2) {
            class78.method606(arg0, (byte) -106, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Luj;")
    public static final class356 method943(int arg0) {
        field1810++;
        if (arg0 != 1006) {
            field1813 = -0.099473864F;
        }
        return class82.method626(1, arg0 - 1052);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        field1814++;
        class210.field2482 = new class501(class671.field9118.method3726((byte) 113, class71.field912), "", class530.field6684, 1006, -1, 0L, 0, 0, arg0, false);
    }
}
