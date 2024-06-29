import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public abstract class class127 extends class159 {

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "F")
    public float field1746;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "F")
    public static float field1741;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I")
    public static final int method897(int arg0) {
        field1736++;
        class66 var1 = class375.field5490;
        boolean var2 = false;
        if (class125.field1721.field5141.method2541(43) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class30.method169(null, 0, (byte) -124, null, 0, var3);
        }
        long var4 = class401.method2440(false);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method463(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class401.method2440(false) - var4);
        if (arg0 <= 10) {
            return -15;
        }
        var1.method529(100, 0, 100, 0, -16777216, 1);
        if (var2) {
            var1.method464((byte) -119);
        }
        return var7;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)I")
    public final int method898(int arg0) {
        field1750++;
        if (arg0 > -83) {
            field1745 = -53;
        }
        return this.field1749;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)I")
    public final int method899(boolean arg0) {
        if (!arg0) {
            this.field1748 = 38;
        }
        field1738++;
        return this.field1742;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(DZ)V")
    public static final void method900(double arg0, boolean arg1) {
        field1743++;
        class685.field9153.method816(class312.field4419);
        class685.field9153.method818(0, 0, (int) arg0);
        if (!arg1) {
            class685.field9171.method509(class685.field9153);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
    public final int method901(byte arg0) {
        field1737++;
        return arg0 == -115 ? this.field1748 : -82;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)F")
    public final float method902(int arg0) {
        if (arg0 != 0) {
            this.method905((byte) 37, 106, 67, -49);
        }
        field1744++;
        return this.field1746;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)I")
    public final int method903(byte arg0) {
        field1735++;
        if (arg0 >= -107) {
            this.field1739 = -63;
        }
        return this.field1739;
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)I")
    public final int method904(int arg0) {
        field1740++;
        int var2 = 66 / ((-arg0 - 58) / 60);
        return this.field1747;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BIII)V")
    public abstract void method905(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IF)V")
    public abstract void method906(int arg0, float arg1);

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(IIIIIF)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1747 = arg1;
        this.field1748 = arg2;
        this.field1749 = arg4;
        this.field1746 = arg5;
        this.field1739 = arg3;
        this.field1742 = arg0;
    }
}
