import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class523 extends class359 implements class21 {

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    private int field7747;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field7749 = -1;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public static int field7744 = -1;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "[I")
    public static int[] field7748 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "Lic;")
    public static class491 field7740;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lod;I[BIZ)V")
    public class523(class349 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7747 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static void method3098(int arg0) {
        int var1 = -73 % ((arg0 - -57) / 63);
        field7740 = null;
        field7748 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIII)V")
    public final void method139(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 44) {
            ++field7750;
            this.method2233(arg1, arg0, (byte) -57);
            this.field7747 = arg2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
    public final int method140(int arg0) {
        if (arg0 > -42) {
            field7744 = 104;
        }
        ++field7739;
        return this.field7747;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)J")
    public final long method138(boolean arg0) {
        if (!arg0) {
            return -15L;
        } else {
            ++field7746;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lic;B)V")
    public static final void method3099(class491 arg0, byte arg1) {
        ++field7743;
        class407.field6142 = arg0.method2940("p11_full", false);
        class180.field2656 = arg0.method2940("p12_full", false);
        class142.field2121 = arg0.method2940("b12_full", false);
        if (arg1 == 61) {
            class68.field1042 = arg0.method2940("hitmarks", false);
            class474.field6984 = arg0.method2940("hitbar_default", false);
            class266.field3897 = arg0.method2940("timerbar_default", false);
            class154.field2278 = arg0.method2940("headicons_pk", false);
            class19.field210 = arg0.method2940("headicons_prayer", false);
            class435.field6512 = arg0.method2940("hint_headicons", false);
            class522.field7724 = arg0.method2940("hint_mapmarkers", false);
            class184.field2742 = arg0.method2940("mapflag", false);
            class493.field7287 = arg0.method2940("cross", false);
            class308.field4433 = arg0.method2940("mapdots", false);
            class530.field7819 = arg0.method2940("scrollbar", false);
            class33.field347 = arg0.method2940("name_icons", false);
            class519.field7638 = arg0.method2940("floorshadows", false);
            class30.field324 = arg0.method2940("compass", false);
            class265.field3886 = arg0.method2940("otherlevel", false);
            class390.field5882 = arg0.method2940("hint_mapedge", false);
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lod;ILjaggl/memory/NativeBuffer;IZ)V")
    public class523(class349 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7747 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
    public final int method137(byte arg0) {
        ++field7742;
        if (arg0 != 52) {
            this.method140(10);
        }
        return super.field5508;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
    public final void method2231(boolean arg0) {
        super.field5502.method2197(11861, this);
        ++field7741;
        if (!arg0) {
            field7740 = null;
        }
    }
}
