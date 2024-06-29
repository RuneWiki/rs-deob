import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "Ljt;")
    private class106 field162 = new class106(64);

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "Lvd;")
    private class39 field156;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "Lvd;")
    public class39 field159;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field154 = 1;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "Lmia;")
    public static class63 field155 = new class63(41, 3);

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)Lrp;", line = 9)
    public final class438 method74(byte arg0, int arg1) {
        field157++;
        class106 var3 = this.field162;
        class438 var4;
        synchronized (this.field162) {
            var4 = (class438) this.field162.method803(110, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 45) {
            field154 = 85;
        }
        class39 var5 = this.field156;
        byte[] var6;
        synchronized (this.field156) {
            var6 = this.field156.method211(true, 3, arg1);
        }
        class438 var7 = new class438();
        var7.field6498 = this;
        if (var6 != null) {
            var7.method2706(new class645(var6), -118);
        }
        class106 var8 = this.field162;
        synchronized (this.field162) {
            this.field162.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V", line = 41)
    public final void method75(byte arg0) {
        class106 var2 = this.field162;
        synchronized (this.field162) {
            if (arg0 >= -101) {
                this.field156 = null;
            }
            this.field162.method809(true);
        }
        field163++;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V", line = 54)
    public final void method76(byte arg0) {
        class106 var2 = this.field162;
        synchronized (this.field162) {
            this.field162.method800(114);
        }
        field158++;
        if (arg0 < 19) {
            this.method78(11, true);
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)V", line = 74)
    public static void method77(byte arg0) {
        field155 = null;
        if (arg0 >= -82) {
            method77((byte) -54);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V", line = 90)
    public final void method78(int arg0, boolean arg1) {
        class106 var3 = this.field162;
        synchronized (this.field162) {
            this.field162.method807(arg0, -1);
        }
        if (arg1) {
            this.field159 = null;
        }
        field160++;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lqg;ILvd;Lvd;)V", line = 111)
    public class11(class464 arg0, int arg1, class39 arg2, class39 arg3) {
        this.field156 = arg2;
        this.field159 = arg3;
        this.field156.method229(3, 0);
    }
}
