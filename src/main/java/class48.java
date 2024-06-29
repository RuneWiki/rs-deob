import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class48 extends class125 {

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Loa;")
    private static class99 field801 = class221.method1463(2844, "Started 3d Library");

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Loa;")
    public static class99 field796 = field801;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lpi;")
    public static class139 field795;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public static final int method342(int arg0, int arg1) {
        field799++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 != 1049852161) {
            method344(-121, -78);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method343(int arg0) {
        field801 = null;
        field796 = null;
        if (arg0 <= 37) {
            field797 = -101;
        }
        field795 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    public static final void method344(int arg0, int arg1) {
        class119.field2102 = arg1;
        field798++;
        class65.field1108 = -1;
        class65.field1108 = -1;
        if (arg0 == 17399) {
            class132.method888(arg0 - 17399);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(II)V")
    public class48(int arg0, int arg1) {
        this.field800 = arg1;
        this.field803 = arg0;
    }
}
