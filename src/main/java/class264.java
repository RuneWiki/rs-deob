import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class264 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lmfa;")
    public class640 field3731;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[[I")
    public static int[][] field3725 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lrq;")
    public static class368 field3730 = class693.method3906((byte) -83);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3734 = 503;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lcb;")
    public static class544 field3732;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1738(int arg0) {
        field3732 = null;
        if (arg0 != -5499) {
            field3728 = -32;
        }
        field3730 = null;
        field3725 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
    public abstract int method666(byte arg0, int arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
    public abstract int method663(byte arg0);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public abstract void method660(int arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
    public static final boolean method1739(int arg0, int arg1) {
        field3729++;
        if (arg1 != 3580) {
            field3734 = 63;
        }
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1740(byte[] arg0, byte arg1) {
        field3727++;
        class120 var2 = new class120(arg0);
        int var3 = var2.method842(2384);
        int var4 = var2.method871(23995);
        if (var4 < 0 || !(class115.field1449 == 0 || var4 <= class115.field1449)) {
            throw new RuntimeException();
        }
        if (arg1 <= 2) {
            field3732 = null;
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method850(255, 0, var4, var5);
            return var5;
        }
        int var6 = var2.method871(23995);
        if (var6 < 0 || class115.field1449 != 0 && var6 > class115.field1449) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class528.method3064(var7, var6, arg0, var4, 9);
        } else {
            class386 var8 = class276.field3838;
            synchronized (class276.field3838) {
                class276.field3838.method2360(var7, var2, true);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
    public final void method1741(int arg0, boolean arg1) {
        field3726++;
        if (this.method666((byte) 112, arg0) != 3) {
            this.method659((byte) -126, arg0);
        }
        if (!arg1) {
            field3734 = 7;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V")
    public abstract void method659(byte arg0, int arg1);

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lmfa;)V")
    public class264(class640 arg0) {
        this.field3731 = arg0;
        this.field3733 = this.method663((byte) -38);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILmfa;)V")
    public class264(int arg0, class640 arg1) {
        this.field3733 = arg0;
        this.field3731 = arg1;
    }
}
