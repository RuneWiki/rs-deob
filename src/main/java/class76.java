import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class76 extends class617 {

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "[S")
    public static short[] field782 = new short[256];

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Z")
    public static boolean field779 = false;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Ljava/lang/String;")
    public String field790;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V", line = 3)
    public final void method403(byte arg0) {
        super.field8693 |= Long.MIN_VALUE;
        ++field784;
        int var2 = 42 % ((arg0 - -31) / 53);
        if (~this.method404((byte) 99) == -1L) {
            class34.field322.method1680(79, this);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)J", line = 17)
    public final long method404(byte arg0) {
        if (arg0 <= 88) {
            return -2L;
        } else {
            ++field781;
            return Long.MAX_VALUE & super.field8693;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I", line = 28)
    public final int method405(int arg0) {
        ++field788;
        if (arg0 != 256) {
            this.field785 = 8;
        }
        return (int) super.field4176;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V", line = 40)
    public final void method406(int arg0) {
        super.field8693 = Long.MIN_VALUE & super.field8693 | class557.method3157(arg0 ^ 975503890) - -500L;
        ++field787;
        class495.field7173.method1680(61, this);
        if (arg0 != -975503968) {
            method408(52);
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)I", line = 69)
    public final int method407(int arg0) {
        if (arg0 > -119) {
            this.method406(-127);
        }
        ++field783;
        return (int) (255L & super.field4176 >>> 32);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V", line = 80)
    public class76(int arg0, int arg1) {
        super.field4176 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V", line = 88)
    public static void method408(int arg0) {
        field782 = null;
        if (arg0 < 36) {
            method408(3);
        }
    }
}
