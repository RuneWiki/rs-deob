import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class277 {

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "Llh;")
    private class364 field3996 = new class364(64);

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Llh;")
    public class364 field4006 = new class364(64);

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Lhh;")
    private class84 field4003;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lhh;")
    public class84 field4002;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3994 = -1;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "[[I")
    public static int[][] field4001 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field4004 = 1400;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)Ldd;", line = 3)
    public final class494 method1760(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        }
        field3999++;
        class364 var3 = this.field3996;
        class494 var4;
        synchronized (this.field3996) {
            var4 = (class494) this.field3996.method2339(-102, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4003.method683(34, arg1, 5);
        class494 var6 = new class494();
        var6.field7207 = this;
        if (var5 != null) {
            var6.method2947(new class303(var5), 78);
        }
        class364 var7 = this.field3996;
        synchronized (this.field3996) {
            this.field3996.method2342((long) arg1, var6, -100);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V", line = 36)
    public final void method1761(int arg0, int arg1) {
        if (arg1 != 12233) {
            field3995 = -74;
        }
        field4000++;
        class364 var3 = this.field3996;
        synchronized (this.field3996) {
            this.field3996.method2348(arg0, arg1 ^ 0x2FDB);
        }
        class364 var4 = this.field4006;
        synchronized (this.field4006) {
            this.field4006.method2348(arg0, arg1 ^ 0xFFFFD048);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V", line = 62)
    public final void method1762(int arg0, int arg1, int arg2) {
        field3998++;
        this.field3996 = new class364(arg0);
        if (arg2 > -33) {
            method1763(-23);
        }
        this.field4006 = new class364(arg1);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 78)
    public static void method1763(int arg0) {
        if (arg0 <= 84) {
            field3995 = 79;
        }
        field4001 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 91)
    public final void method1764(byte arg0) {
        field4005++;
        class364 var2 = this.field3996;
        synchronized (this.field3996) {
            this.field3996.method2349(0);
            if (arg0 != 8) {
                this.method1761(58, 24);
            }
        }
        class364 var3 = this.field4006;
        synchronized (this.field4006) {
            this.field4006.method2349(0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lmt;ILhh;Lhh;)V", line = 143)
    public class277(class271 arg0, int arg1, class84 arg2, class84 arg3) {
        this.field4003 = arg2;
        this.field4002 = arg3;
        this.field4003.method656((byte) 122, 34);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V", line = 124)
    public final void method1765(byte arg0) {
        class364 var2 = this.field3996;
        synchronized (this.field3996) {
            if (arg0 != -49) {
                field3995 = -88;
            }
            this.field3996.method2350((byte) 112);
        }
        field3997++;
        class364 var3 = this.field4006;
        synchronized (this.field4006) {
            this.field4006.method2350((byte) 112);
        }
    }
}
