import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class265 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Loo;")
    private class652 field3861 = new class652(64);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lwia;")
    private class791 field3867;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Ljia;")
    public class643 field3870;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[J")
    public static long[] field3862 = new long[100];

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[C")
    private static char[] field3864 = new char[64];

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lmea;")
    public static class451 field3871;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public final void method1717(byte arg0) {
        if (arg0 != 125) {
            return;
        }
        field3869++;
        class652 var2 = this.field3861;
        synchronized (this.field3861) {
            this.field3861.method3735(2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method1718(int arg0) {
        class652 var2 = this.field3861;
        synchronized (this.field3861) {
            this.field3861.method3743(arg0 ^ 0xFFFFFFC9);
            if (arg0 != -63) {
                method1723((byte) -24);
            }
        }
        field3865++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lgq;")
    public final class539 method1719(int arg0, int arg1) {
        field3866++;
        class652 var3 = this.field3861;
        class539 var4;
        synchronized (this.field3861) {
            var4 = (class539) this.field3861.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field3867;
        byte[] var6;
        synchronized (this.field3867) {
            var6 = this.field3867.method4339(arg0, 0, arg1);
        }
        class539 var7 = new class539();
        var7.field7771 = this;
        if (var6 != null) {
            var7.method3235((byte) 19, new class494(var6));
        }
        class652 var8 = this.field3861;
        synchronized (this.field3861) {
            this.field3861.method3739((long) arg0, (byte) 68, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method1720(int arg0) {
        field3863++;
        if (class632.field8877 == 10) {
            class632.field8877 = arg0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
    public final void method1721(byte arg0, int arg1) {
        class652 var3 = this.field3861;
        synchronized (this.field3861) {
            int var4 = -2 % ((82 - arg0) / 33);
            this.field3861.method3741(arg1, 0);
        }
        field3860++;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static final void method1722(int arg0) {
        field3868++;
        if (arg0 != 16033) {
            field3862 = null;
        }
        if (class16.field299 != null) {
            class16.field299.method2191(arg0 - 16060);
        }
        if (class443.field6038 != null) {
            class443.field6038.method2191(arg0 - 16145);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static void method1723(byte arg0) {
        field3864 = null;
        field3862 = null;
        field3871 = null;
        if (arg0 <= 57) {
            method1723((byte) -102);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ldt;ILwia;Ljia;)V")
    public class265(class252 arg0, int arg1, class791 arg2, class643 arg3) {
        this.field3867 = arg2;
        this.field3867.method4353(32, true);
        this.field3870 = arg3;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3864[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3864[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3864[var2] = (char) (var2 - 4);
        }
        field3864[62] = '+';
        field3864[63] = '/';
        field3871 = null;
    }
}
