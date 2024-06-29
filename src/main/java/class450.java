import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class450 extends class207 implements class246 {

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field6622;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Laa;")
    public static class76 field6618 = new class76(55, 6);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[[B")
    public static byte[][] field6624;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lvd;ILjaggl/memory/NativeBuffer;)V", line = 4)
    public class450(class258 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field6622 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z[BII)V", line = 12)
    public final void method1193(boolean arg0, byte[] arg1, int arg2, int arg3) {
        this.method1350(arg1, arg2);
        ++field6619;
        this.field6622 = arg3;
        if (!arg0) {
            this.method1193(true, (byte[]) null, -18, 58);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I", line = 25)
    public final int method1187(int arg0) {
        if (arg0 != -1407) {
            method2625((byte) 61);
        }
        ++field6616;
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([BI)[B", line = 40)
    public static final byte[] method2624(byte[] arg0, int arg1) {
        ++field6625;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 < 60) {
            method2625((byte) 73);
        }
        class442.method2590(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I", line = 56)
    public final int method1190(int arg0) {
        ++field6623;
        return arg0 != -1739 ? -104 : this.field6622;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lvd;I[BI)V", line = 67)
    public class450(class258 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6622 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)J", line = 82)
    public final long method1189(boolean arg0) {
        ++field6621;
        if (arg0) {
            method2625((byte) 47);
        }
        return super.field2996.method2846();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 93)
    public static void method2625(byte arg0) {
        field6624 = null;
        if (arg0 >= -111) {
            method2624((byte[]) null, 105);
        }
        field6618 = null;
    }
}
