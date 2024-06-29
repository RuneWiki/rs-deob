import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class362 extends class576 implements class716 {

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "Lwd;")
    public static class179 field5218 = new class179();

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "B")
    private byte field5222;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "[I")
    public static int[] field5227;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 5)
    public final Buffer method2276(boolean arg0, boolean arg1) {
        ++field5221;
        if (arg1) {
            method2278(119);
        }
        return super.method3372(arg0, super.field8086.field7805, 2);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZ)Z", line = 17)
    public final boolean method2277(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            this.field5222 = (byte) arg1;
            ++field5223;
            super.method1119(arg0, -27671);
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Loaa;Z)V", line = 32)
    public class362(class556 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 35)
    public final void method1125(int arg0) {
        ++field5216;
        super.method1125(26);
        if (arg0 <= 18) {
            this.method2276(true, true);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I", line = 49)
    public final int method1124(int arg0) {
        if (arg0 != 22913) {
            this.method2279(55);
        }
        ++field5224;
        return super.method1124(22913);
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V", line = 60)
    public static void method2278(int arg0) {
        field5227 = null;
        if (arg0 != 34962) {
            field5226 = 114;
        }
        field5218 = null;
    }

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)I", line = 74)
    public final int method2279(int arg0) {
        if (arg0 <= 93) {
            return 9;
        } else {
            ++field5220;
            return this.field5222;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILjaclib/memory/Source;I)Z", line = 86)
    public final boolean method2280(byte arg0, int arg1, Source arg2, int arg3) {
        this.field5222 = (byte) arg1;
        ++field5217;
        if (arg0 <= 22) {
            this.field5222 = 28;
        }
        super.method3369(arg3, arg2, 35044);
        return true;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z", line = 105)
    public final boolean method2281(int arg0) {
        if (arg0 != -14567) {
            return false;
        } else {
            ++field5219;
            return super.method3370(super.field8086.field7805, arg0 ^ -14567);
        }
    }
}
