import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class323 {

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lfc;")
    private class174 field4724 = new class174(64);

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Loi;")
    private class53 field4720;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Lam;")
    public static class455 field4718 = new class455();

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
    public static int[] field4721 = new int[8];

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field4722 = -2;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Lc;")
    public static class125 field4723;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 11)
    public static void method1950(int arg0) {
        field4718 = null;
        field4721 = null;
        field4723 = null;
        if (arg0 != -13281) {
            field4721 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Luv;", line = 23)
    public final class248 method1951(int arg0, int arg1) {
        field4716++;
        class174 var3 = this.field4724;
        class248 var4;
        synchronized (this.field4724) {
            var4 = (class248) this.field4724.method1088((long) arg0, (byte) -8);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field4720;
        byte[] var6;
        synchronized (this.field4720) {
            var6 = this.field4720.method426(16, (byte) 9, arg0);
        }
        if (arg1 != -458) {
            this.method1951(64, -70);
        }
        class248 var7 = new class248();
        if (var6 != null) {
            var7.method1623(new class403(var6), arg1 + 460);
        }
        class174 var8 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 55)
    public final void method1952(byte arg0) {
        class174 var2 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method1095(0);
        }
        if (arg0 == 97) {
            field4714++;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V", line = 69)
    public final void method1953(byte arg0, int arg1) {
        field4717++;
        int var3 = -52 % ((arg0 - 29) / 47);
        class174 var4 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method1087(1, arg1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 85)
    public final void method1954(byte arg0) {
        class174 var2 = this.field4724;
        synchronized (this.field4724) {
            if (arg0 != -118) {
                return;
            }
            this.field4724.method1096((byte) -61);
        }
        field4715++;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 110)
    public class323(class205 arg0, int arg1, class53 arg2) {
        this.field4720 = arg2;
        if (this.field4720 == null) {
            this.field4719 = 0;
        } else {
            this.field4719 = this.field4720.method435(16, 0);
        }
    }
}
