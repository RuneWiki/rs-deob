import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class77 {

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lvh;")
    private class328 field1059 = new class328(64);

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lpj;")
    private class132 field1055;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
    public static int[] field1061 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Lfc;")
    public static class235 field1060 = new class235(92, 5);

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Llaa;")
    public static class106 field1066 = new class106(14, 0, 4, 1);

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lpj;")
    public static class132 field1054;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1056;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Luu;", line = 3)
    public static final class258 method604(int arg0, int arg1) {
        field1063++;
        class258 var2 = (class258) class335.field4901.method1267((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class156.field2357.method940(arg0, 0, 0);
        int var4 = 56 / ((-arg1 - 22) / 38);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class258 var5 = class656.method3641(-4450, var3);
            class335.field4901.method1265(false, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Ldv;", line = 28)
    public final class603 method605(byte arg0, int arg1) {
        field1065++;
        class328 var3 = this.field1059;
        class603 var4;
        synchronized (this.field1059) {
            var4 = (class603) this.field1059.method1986((byte) -98, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field1055;
        byte[] var6;
        synchronized (this.field1055) {
            var6 = this.field1055.method940(35, arg1, 0);
        }
        class603 var7 = new class603();
        if (var6 != null) {
            var7.method3344(-63, new class96(var6));
        }
        var7.method3345(0);
        class328 var8 = this.field1059;
        synchronized (this.field1059) {
            this.field1059.method1985(var7, (long) arg1, (byte) -102);
            if (arg0 > -62) {
                this.method606(46);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 64)
    public final void method606(int arg0) {
        class328 var2 = this.field1059;
        synchronized (this.field1059) {
            this.field1059.method1987(-31085);
        }
        if (arg0 != 22015) {
            this.field1055 = null;
        }
        field1057++;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V", line = 78)
    public final void method607(int arg0, int arg1) {
        class328 var3 = this.field1059;
        synchronized (this.field1059) {
            this.field1059.method1989(arg1, (byte) 84);
            if (arg0 != 35) {
                method604(-48, 87);
            }
        }
        field1064++;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 92)
    public static void method608(int arg0) {
        field1066 = null;
        field1060 = null;
        field1061 = null;
        if (arg0 >= 93) {
            field1054 = null;
            field1056 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V", line = 110)
    public final void method609(int arg0) {
        class328 var2 = this.field1059;
        synchronized (this.field1059) {
            int var3 = 65 % ((39 - arg0) / 62);
            this.field1059.method1997(1);
        }
        field1058++;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 139)
    public class77(class647 arg0, int arg1, class132 arg2) {
        this.field1055 = arg2;
        if (this.field1055 != null) {
            this.field1055.method936(35, -128);
        }
    }
}
