import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class411 extends class404 implements class147 {

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lti;")
    public class404 field5817;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field5807 = 0;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method562(int arg0) {
        if (arg0 != 29008) {
            this.field5817 = null;
        }
        field5809++;
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILoa;)Lba;", line = 15)
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        field5811++;
        if (arg0 != -585) {
            this.method552(false, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILoa;I)Z", line = 31)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        if (arg1 != -8003) {
            this.method552(true, null);
        }
        field5815++;
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLoa;)V", line = 43)
    public final void method556(byte arg0, class638 arg1) {
        if (arg0 <= 5) {
            this.method548(-118, 18, null);
        }
        field5810++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I", line = 55)
    public final int method554(int arg0) {
        field5818++;
        if (arg0 != -18971) {
            field5807 = 46;
        }
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLoa;)V", line = 68)
    public final void method552(boolean arg0, class638 arg1) {
        field5806++;
        if (!arg0) {
            this.method555(41, null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 79)
    public final void method550(int arg0) {
        field5808++;
        if (arg0 > -4) {
            this.field5817 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I", line = 91)
    public final int method549(int arg0) {
        if (arg0 != 12352) {
            this.method562(19);
        }
        field5813++;
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)I", line = 105)
    public final int method560(int arg0) {
        if (arg0 != 15654) {
            field5807 = -58;
        }
        field5820++;
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Loa;B)Lac;", line = 117)
    public final class496 method551(class638 arg0, byte arg1) {
        field5816++;
        if (arg1 > -62) {
            field5807 = 34;
        }
        return this.field5817.method551(arg0, (byte) -117);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(BLoa;)V", line = 128)
    public final void method561(byte arg0, class638 arg1) {
        if (arg0 != 111) {
            this.method555(74, null);
        }
        field5814++;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIILti;)V", line = 139)
    public class411(int arg0, int arg1, int arg2, int arg3, int arg4, class404 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class232.method1470(arg0, arg1, 5));
        this.field5817 = arg5;
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)I", line = 147)
    public final int method575(int arg0) {
        field5819++;
        return arg0 >= -117 ? 82 : 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILoa;)Lwc;", line = 158)
    public final class60 method555(int arg0, class638 arg1) {
        field5812++;
        if (arg0 != 0) {
            this.method560(24);
        }
        return null;
    }
}
