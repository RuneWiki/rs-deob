import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class272 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Ljv;")
    private class55 field3926 = new class55(64);

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public int field3930 = 0;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lbu;")
    private class17 field3927;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Liv;")
    public static class64 field3920 = new class64(43, 8);

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Ljv;")
    public static class55 field3928 = new class55(200);

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lrn;")
    public static class174 field3929 = new class174(2, 8);

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
    public static volatile boolean field3932 = true;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 4)
    public static void method1750(int arg0) {
        field3929 = null;
        field3920 = null;
        if (arg0 != 200) {
            field3929 = null;
        }
        field3928 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 16)
    public final void method1751(int arg0) {
        class55 var2 = this.field3926;
        synchronized (this.field3926) {
            this.field3926.method488(-3);
            if (arg0 != 25916) {
                this.method1751(116);
            }
        }
        field3921++;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 35)
    public final void method1752(int arg0) {
        field3923++;
        class55 var2 = this.field3926;
        synchronized (this.field3926) {
            if (arg0 == 0) {
                this.field3926.method484(-120);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 48)
    public final void method1753(int arg0, int arg1) {
        class55 var3 = this.field3926;
        synchronized (this.field3926) {
            if (arg1 != 200) {
                return;
            }
            this.field3926.method493(false, arg0);
        }
        field3922++;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Lgf;", line = 67)
    public final class180 method1754(int arg0, int arg1) {
        field3925++;
        class55 var3 = this.field3926;
        class180 var4;
        synchronized (this.field3926) {
            var4 = (class180) this.field3926.method494(0, (long) arg0);
        }
        int var5 = -91 / ((arg1 + 10) / 58);
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field3927.method114(arg0, 4, 123);
        class180 var7 = new class180();
        var7.field2713 = arg0;
        var7.field2711 = this;
        if (var6 != null) {
            var7.method1273(9, new class145(var6));
        }
        var7.method1272((byte) -104);
        class55 var8 = this.field3926;
        synchronized (this.field3926) {
            this.field3926.method485((long) arg0, (byte) -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 107)
    public class272(class239 arg0, int arg1, class17 arg2) {
        this.field3927 = arg2;
        this.field3924 = this.field3927.method119(29630, 4);
    }
}
