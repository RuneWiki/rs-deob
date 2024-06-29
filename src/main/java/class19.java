import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class19 extends class477 {

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Z")
    public static boolean field174 = false;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field169 = 100;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Lpq;")
    public static class159 field168;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lhe;")
    public static class250 field179;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Ljava/lang/String;")
    public String field170;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method103(int arg0) {
        field168 = null;
        if (arg0 <= 115) {
            field169 = 106;
        }
        field179 = null;
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public final void method104(int arg0) {
        super.field6449 = super.field6449 & Long.MIN_VALUE | class669.method3713(0) - -500L;
        if (arg0 == 10) {
            ++field175;
            class108.field1301.method2713(arg0 + -92, this);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static final void method105(boolean arg0) {
        ++field178;
        class73.field938 = class170.method1135(8, 35, 4, arg0, 8, (byte) 23, 2048, 0.4F);
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)J")
    public final long method106(int arg0) {
        ++field177;
        if (arg0 < 32) {
            this.field171 = -105;
        }
        return super.field6449 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)I")
    public final int method107(boolean arg0) {
        if (arg0) {
            field174 = true;
        }
        ++field172;
        return (int) (super.field272 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I")
    public final int method108(byte arg0) {
        ++field176;
        if (arg0 != 31) {
            field169 = 126;
        }
        return (int) super.field272;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lxa;)V")
    public static final void method109(int arg0, class424[] arg1) {
        class520.field7217 = arg1.length;
        ++field166;
        class367.field5293 = new class424[class520.field7217 + 10];
        class315.field4561 = new int[class520.field7217 + 10];
        class657.method3640(arg1, 0, class367.field5293, 0, class520.field7217);
        int var2 = 0;
        if (arg0 != 2048) {
            field169 = -37;
        }
        while (~var2 > ~class520.field7217) {
            class315.field4561[var2] = class367.field5293[var2].method1157();
            ++var2;
        }
        for (int var3 = class520.field7217; var3 < class367.field5293.length; ++var3) {
            class315.field4561[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    public final void method110(int arg0) {
        super.field6449 |= Long.MIN_VALUE;
        if (arg0 != 12142) {
            method105(true);
        }
        ++field167;
        if (~this.method106(52) == -1L) {
            class218.field2818.method2713(-82, this);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
    public class19(int arg0, int arg1) {
        super.field272 = (long) arg1 | (long) arg0 << 32;
    }
}
