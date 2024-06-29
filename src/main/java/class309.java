import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class309 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljv;")
    private class55 field4718 = new class55(64);

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lbu;")
    private class17 field4721;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "S")
    public static short field4716 = 320;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lrn;")
    public static class174 field4723 = new class174(39, 2);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 9)
    public final void method2023(int arg0) {
        if (arg0 != 31) {
            field4716 = 16;
        }
        field4719++;
        class55 var2 = this.field4718;
        synchronized (this.field4718) {
            this.field4718.method484(57);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 31)
    public static void method2024(byte arg0) {
        if (arg0 != -82) {
            field4716 = 47;
        }
        field4723 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 41)
    public final void method2025(int arg0) {
        class55 var2 = this.field4718;
        synchronized (this.field4718) {
            this.field4718.method488(-3);
        }
        field4722++;
        if (arg0 != 14724) {
            method2024((byte) 97);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)Loj;", line = 54)
    public final class257 method2026(int arg0, byte arg1) {
        field4720++;
        int var3 = 73 % ((arg1 + 77) / 41);
        class55 var4 = this.field4718;
        class257 var5;
        synchronized (this.field4718) {
            var5 = (class257) this.field4718.method494(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field4721.method114(arg0, 31, 123);
        class257 var7 = new class257();
        if (var6 != null) {
            var7.method1666(new class145(var6), 0);
        }
        class55 var8 = this.field4718;
        synchronized (this.field4718) {
            this.field4718.method485((long) arg0, (byte) -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 84)
    public class309(class239 arg0, int arg1, class17 arg2) {
        this.field4721 = arg2;
        this.field4721.method119(29630, 31);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V", line = 99)
    public final void method2027(int arg0, int arg1) {
        if (arg0 != -3968) {
            field4716 = -83;
        }
        field4717++;
        class55 var3 = this.field4718;
        synchronized (this.field4718) {
            this.field4718.method493(false, arg1);
        }
    }
}
