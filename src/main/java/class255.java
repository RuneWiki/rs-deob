import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class255 extends class68 {

    @OriginalMember(owner = "client!vw", name = "x", descriptor = "[I")
    public static int[] field3676 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "J")
    public long field3670;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1637(int arg0) {
        field3671++;
        for (int var1 = arg0; var1 < class491.field6998.length; var1++) {
            for (int var2 = 0; var2 < class491.field6998[var1].length; var2++) {
                class491.field6998[var1][var2] = class84.field1197;
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)I", line = 29)
    public final int method532(byte arg0) {
        if (arg0 != 108) {
            this.field3668 = -73;
        }
        field3669++;
        return this.field3667;
    }

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V", line = 40)
    public static void method1638(int arg0) {
        field3676 = null;
        int var1 = -44 % ((-arg0 - 67) / 54);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)J", line = 50)
    public final long method537(byte arg0) {
        field3675++;
        int var2 = 112 / ((41 - arg0) / 50);
        return this.field3670;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Z)I", line = 61)
    public final int method539(boolean arg0) {
        field3666++;
        return arg0 ? 0 : -40;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)I", line = 73)
    public final int method536(boolean arg0) {
        field3674++;
        return arg0 ? 28 : this.field3668;
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(II)I", line = 86)
    public static final int method1639(int arg0, int arg1) {
        return class188.field2797 == null ? 0 : class188.field2797[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)I", line = 91)
    public final int method541(int arg0) {
        field3673++;
        return arg0 == 30818 ? this.field3672 : 119;
    }
}
