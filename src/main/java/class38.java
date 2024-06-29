import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class38 extends class287 {

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Z")
    public static boolean field812 = true;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "Lea;")
    public static class390 field804;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lwf;")
    public class91 field810;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "[B")
    public byte[] field805;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static final void method397(int arg0) {
        ++field809;
        for (int var1 = 0; var1 < 5; ++var1) {
            class172.field2551[var1] = false;
        }
        class86.field1396 = arg0;
        class84.field1331 = 0;
        class176.field2634 = -1;
        class27.field386 = 0;
        class294.field4381 = 1;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)[B")
    public final byte[] method398(byte arg0) {
        ++field808;
        if (super.field4248) {
            throw new RuntimeException();
        } else {
            if (arg0 != 68) {
                method397(-55);
            }
            return this.field805;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I")
    public final int method399(int arg0) {
        ++field811;
        if (super.field4248) {
            return 0;
        } else {
            if (arg0 != -22900) {
                field804 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static void method400(int arg0) {
        if (arg0 != -1) {
            field812 = true;
        }
        field804 = null;
    }
}
