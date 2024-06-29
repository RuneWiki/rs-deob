import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class174 {

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Laj;")
    private class287 field2873 = new class287(64);

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Laj;")
    public class287 field2878 = new class287(60);

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Lom;")
    public class344 field2875;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lom;")
    private class344 field2869;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2877;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method1308(byte arg0) {
        if (arg0 == -123) {
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
    public final void method1309(int arg0, int arg1) {
        field2874++;
        this.field2879 = arg0;
        class287 var3 = this.field2878;
        synchronized (this.field2878) {
            this.field2878.method1913(true);
            if (arg1 != 60) {
                this.field2875 = null;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public final void method1310(int arg0) {
        field2868++;
        class287 var2 = this.field2873;
        synchronized (this.field2873) {
            this.field2873.method1913(true);
            if (arg0 <= 92) {
                this.field2875 = null;
            }
        }
        class287 var3 = this.field2878;
        synchronized (this.field2878) {
            this.field2878.method1913(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public final void method1311(int arg0) {
        class287 var2 = this.field2873;
        synchronized (this.field2873) {
            if (arg0 != 60) {
                this.method1309(-106, 43);
            }
            this.field2873.method1912(-2552);
        }
        field2870++;
        class287 var3 = this.field2878;
        synchronized (this.field2878) {
            this.field2878.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
    public final void method1312(int arg0, boolean arg1) {
        class287 var3 = this.field2873;
        synchronized (this.field2873) {
            this.field2873.method1908(arg0, (byte) -11);
        }
        field2872++;
        class287 var4 = this.field2878;
        synchronized (this.field2878) {
            this.field2878.method1908(arg0, (byte) -11);
            if (!arg1) {
                this.field2869 = null;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)Lk;")
    public final class526 method1313(byte arg0, int arg1) {
        field2871++;
        class287 var3 = this.field2873;
        class526 var4;
        synchronized (this.field2873) {
            var4 = (class526) this.field2873.method1900((long) arg1, 77);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field2869;
        byte[] var6;
        synchronized (this.field2869) {
            var6 = this.field2869.method2216(class261.method1709(arg1, -1), class1.method104((byte) -24, arg1), true);
        }
        class526 var7 = new class526();
        var7.field7416 = this;
        var7.field7424 = arg1;
        if (var6 != null) {
            var7.method3080(false, new class61(var6));
        }
        if (arg0 > -107) {
            this.field2873 = null;
        }
        class287 var8 = this.field2873;
        synchronized (this.field2873) {
            this.field2873.method1904(var7, (long) arg1, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lmea;ILom;Lom;)V")
    public class174(class398 arg0, int arg1, class344 arg2, class344 arg3) {
        this.field2875 = arg3;
        this.field2869 = arg2;
        int var5 = this.field2869.method2245(0) - 1;
        this.field2869.method2236(var5, 0);
    }
}
