import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class130 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljp;")
    private class236 field1889 = new class236(256);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lpc;")
    private class473 field1893;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lcu;")
    public static class145 field1890 = new class145(74, -1);

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1894 = 0;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
    public static int[] field1896;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lia;")
    public static class414 field1895;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lce;")
    public final class201 method926(int arg0, int arg1) {
        if (arg1 != 14) {
            return null;
        }
        field1888++;
        class236 var3 = this.field1889;
        class201 var4;
        synchronized (this.field1889) {
            var4 = (class201) this.field1889.method1456((long) arg0, 123);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1893.method2708(26, arg0, (byte) 54);
        class201 var6 = new class201();
        if (var5 != null) {
            var6.method1287(new class379(var5), arg1 ^ 0x54EA);
        }
        class236 var7 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method1462(var6, (long) arg0, -127);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method927(int arg0) {
        field1891++;
        class236 var2 = this.field1889;
        synchronized (this.field1889) {
            if (arg0 != 26) {
                field1894 = -53;
            }
            this.field1889.method1458((byte) -128);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
    public static final void method928(int arg0, int arg1) {
        field1887++;
        if (class28.method230(arg0, 114)) {
            class46.method328((byte) -50, arg1, class238.field3185[arg0]);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
    public final void method929(int arg0, int arg1) {
        field1892++;
        class236 var3 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method1461(-5, arg0);
        }
        if (arg1 <= 124) {
            this.field1889 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method930(int arg0) {
        if (arg0 >= -112) {
            this.field1889 = null;
        }
        class236 var2 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method1459(19088);
        }
        field1886++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method931(int arg0) {
        field1890 = null;
        int var1 = 104 / ((-arg0 - 44) / 59);
        field1896 = null;
        field1895 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class130(class234 arg0, int arg1, class473 arg2) {
        this.field1893 = arg2;
        this.field1893.method2710(26, (byte) -105);
    }

    static {
        new class317("", 73);
        field1896 = new int[14];
    }
}
