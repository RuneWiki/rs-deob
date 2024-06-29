import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class594 extends class350 implements class555 {

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "[I")
    public static int[] field8262 = new int[1024];

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field8263 = 0;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "Loj;")
    public static class346 field8264 = new class346(16);

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)Z", line = 5)
    public final boolean method1249(int arg0, int arg1, byte arg2) {
        field8267++;
        int var4 = -27 / ((-arg2 - 57) / 63);
        super.method777(arg0, (byte) 73);
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 23)
    public static void method3297(int arg0) {
        field8262 = null;
        if (arg0 == 1024) {
            field8264 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lmc;Z)V", line = 37)
    public class594(class120 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 42)
    public final Buffer method779(byte arg0, boolean arg1) {
        if (arg0 != -20) {
            this.method779((byte) -108, false);
        }
        field8261++;
        return super.method779((byte) -20, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method774(int arg0) {
        if (arg0 == -22324) {
            field8266++;
            return super.method774(-22324);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBILjaclib/memory/Source;)Z", line = 64)
    public final boolean method1247(int arg0, byte arg1, int arg2, Source arg3) {
        if (arg1 != -64) {
            field8262 = null;
        }
        field8265++;
        super.method2076((byte) 33, arg0, arg3);
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)I", line = 83)
    public final int method21(boolean arg0) {
        if (arg0) {
            field8264 = null;
        }
        field8260++;
        return super.method21(false);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V", line = 95)
    public final void method776(boolean arg0) {
        field8268++;
        super.method776(arg0);
    }
}
