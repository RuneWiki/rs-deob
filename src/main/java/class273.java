import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class273 {

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lwm;")
    public static class152 field4692 = class157.method1048("unzap", 110);

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    public static short[] field4688 = new short[500];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lwm;")
    public static class152 field4690 = class157.method1048("(U5", 108);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lwm;")
    public static class152 field4694 = class157.method1048(":chalreq:", 106);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "J")
    public long field4689;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lbh;")
    public class273 field4685;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lbh;")
    public class273 field4687;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 13)
    public static void method1877(int arg0) {
        field4690 = null;
        if (arg0 == 0) {
            field4694 = null;
            field4688 = null;
            field4692 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lhi;II)Lwm;", line = 35)
    public static final class152 method1878(class291 arg0, int arg1, int arg2) {
        field4683++;
        try {
            int var3 = arg0.method2013((byte) -20);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field4946 += class97.field1384.method44(arg2, arg0.field4950, var3, var4, false, arg0.field4946);
            return class117.method775(var4, var3, (byte) 85, 0);
        } catch (Exception var7) {
            return class224.field3641;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Z", line = 62)
    public final boolean method1879(byte arg0) {
        field4691++;
        if (this.field4685 == null) {
            return false;
        } else {
            if (arg0 != -3) {
                this.field4689 = 29L;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 81)
    public final void method1880(int arg0) {
        field4684++;
        if (this.field4685 == null) {
            return;
        }
        this.field4685.field4687 = this.field4687;
        this.field4687.field4685 = this.field4685;
        this.field4685 = null;
        this.field4687 = null;
        if (arg0 != -25368) {
            method1878((class291) null, -94, 73);
        }
    }
}
