import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class245 extends class460 implements class161 {

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!dea", name = "A", descriptor = "Z")
    public static boolean field3273 = false;

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "Lms;")
    public static class758 field3269 = new class758();

    @OriginalMember(owner = "client!dea", name = "I", descriptor = "Z")
    public static boolean field3279 = true;

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "B")
    private byte field3277;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!dea", name = "B", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!dea", name = "C", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!dea", name = "D", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)I", line = 3)
    public final int method1564(boolean arg0) {
        ++field3280;
        if (!arg0) {
            field3273 = false;
        }
        return super.method1564(true);
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lfha;Z)V", line = 14)
    public class245(class378 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)Z", line = 17)
    public final boolean method1060(int arg0) {
        if (arg0 != -17151) {
            method1568(false, (String) null);
        }
        ++field3268;
        return super.method2733((byte) 100, super.field6494.field5406);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILwm;I)V", line = 31)
    public static final void method1565(int arg0, class564 arg1, int arg2) {
        if (arg1.field7911 != null) {
            int var3 = arg1.field7911[arg0 + 1];
            if (arg1.field7991 != var3) {
                arg1.field7944 = 0;
                arg1.field7921 = 0;
                arg1.field7965 = 0;
                arg1.field7922 = 1;
                arg1.field8007 = arg1.field8014;
                arg1.field7991 = var3;
                if (arg1.field7991 != -1) {
                    class346.method2239(-701644944, arg1.field7965, arg1, class343.field4785.method3525(arg1.field7991, (byte) -43));
                }
            }
        }
        if (arg2 != -1) {
            method1565(121, (class564) null, -48);
        }
        ++field3267;
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "(I)V", line = 62)
    public static void method1566(int arg0) {
        if (arg0 != 30386) {
            field3272 = -48;
        }
        field3269 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 72)
    public final void method1059(int arg0) {
        if (arg0 != 5342) {
            this.field3277 = 62;
        }
        super.method1059(arg0);
        ++field3275;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)Z", line = 84)
    public final boolean method1061(int arg0, int arg1, int arg2) {
        ++field3270;
        this.field3277 = (byte) arg1;
        int var4 = 88 / ((-67 - arg0) / 56);
        super.method2157(arg2, (byte) 55);
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljaclib/memory/Source;BII)Z", line = 99)
    public final boolean method1062(Source arg0, byte arg1, int arg2, int arg3) {
        int var5 = 110 % ((arg1 - 22) / 49);
        this.field3277 = (byte) arg3;
        ++field3278;
        super.method2736(arg0, arg2, 2);
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "(I)I", line = 113)
    public final int method1567(int arg0) {
        if (arg0 != -1611) {
            this.method1567(117);
        }
        ++field3276;
        return this.field3277;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 130)
    public static final String method1568(boolean arg0, String arg1) {
        if (arg0) {
            field3269 = null;
        }
        ++field3271;
        String var2 = class10.method72(45, class593.method3352(57, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 150)
    public final Buffer method1063(int arg0, boolean arg1) {
        if (arg0 != -5419) {
            return null;
        } else {
            ++field3274;
            return super.method2735(arg1, super.field6494.field5406, (byte) -24);
        }
    }
}
