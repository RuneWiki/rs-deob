import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class class124 extends class223 {

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "F")
    public float field1808;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field1814 = 0;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "Ll;")
    public static class16 field1818;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method978(boolean arg0) {
        field1818 = null;
        if (arg0) {
            field1818 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IF)V")
    public abstract void method773(int arg0, float arg1);

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)F")
    public final float method979(boolean arg0) {
        if (arg0) {
            this.field1812 = 97;
        }
        field1813++;
        return this.field1808;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(Z)I")
    public final int method980(boolean arg0) {
        field1816++;
        return arg0 ? -94 : this.field1812;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)I")
    public final int method981(byte arg0) {
        field1815++;
        return arg0 == 27 ? this.field1819 : 4;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)I")
    public final int method982(byte arg0) {
        field1817++;
        return arg0 > -108 ? -110 : this.field1809;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIB)V")
    public abstract void method770(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIIF)V")
    public class124(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1808 = arg5;
        this.field1819 = arg1;
        this.field1806 = arg3;
        this.field1809 = arg4;
        this.field1812 = arg0;
        this.field1807 = arg2;
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)I")
    public final int method983(byte arg0) {
        field1811++;
        if (arg0 >= -35) {
            this.method773(11, 0.6382251F);
        }
        return this.field1807;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
    public final int method984(int arg0) {
        field1810++;
        if (arg0 <= 78) {
            this.field1808 = 1.2582719F;
        }
        return this.field1806;
    }
}
