import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class738 {

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "Ljr;")
    private class112 field9932 = new class112(64);

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "Lin;")
    public class91 field9936;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "Lin;")
    private class91 field9930;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
    public static int field9939 = 0;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "Lbf;")
    public static class536 field9929 = new class536();

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public static final void method4055(int arg0) {
        field9934++;
        int[] var1 = new int[class721.field9801.field302];
        int var2 = arg0;
        for (int var3 = 0; var3 < class721.field9801.field302; var3++) {
            class352 var5 = class721.field9801.method162(-104, var3);
            if (var5.field4958 >= 0 || var5.field4931 >= 0) {
                var1[var2++] = var3;
            }
        }
        class160.field2570 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class160.field2570[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BI)Lic;")
    public final class699 method4056(byte arg0, int arg1) {
        field9938++;
        if (arg0 != 33) {
            this.field9930 = null;
        }
        class112 var3 = this.field9932;
        class699 var4;
        synchronized (this.field9932) {
            var4 = (class699) this.field9932.method992((long) arg1, -58);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field9930;
        byte[] var6;
        synchronized (this.field9930) {
            var6 = this.field9930.method863(arg0 - 1893, 3, arg1);
        }
        class699 var7 = new class699();
        var7.field9454 = this;
        if (var6 != null) {
            var7.method3907(~arg0, new class215(var6));
        }
        class112 var8 = this.field9932;
        synchronized (this.field9932) {
            this.field9932.method991(var7, (long) arg1, (byte) -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
    public final void method4057(int arg0) {
        class112 var2 = this.field9932;
        synchronized (this.field9932) {
            this.field9932.method996(-93);
        }
        field9931++;
        if (arg0 != 0) {
            this.field9930 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZLin;I)Ldfa;")
    public static final class167 method4058(int arg0, boolean arg1, class91 arg2, int arg3) {
        field9935++;
        class215 var4 = new class215(arg2.method863(-1860, arg3, arg0));
        if (!arg1) {
            method4061(102);
        }
        class167 var5 = new class167(arg0, var4.method1525((byte) 88), var4.method1525((byte) 120), var4.method1533((byte) -126), var4.method1533((byte) -126), var4.method1535(255) == 1, var4.method1535(255), var4.method1535(255));
        int var6 = var4.method1535(255);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2614.method1273(new class340(var4.method1535(255), var4.method1478(842397944), var4.method1478(842397944), var4.method1478(842397944), var4.method1478(842397944), var4.method1478(842397944), var4.method1478(842397944), var4.method1478(842397944), var4.method1478(842397944)), -20180);
        }
        var5.method1257((byte) 37);
        return var5;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
    public final void method4059(byte arg0) {
        if (arg0 != -37) {
            this.field9930 = null;
        }
        field9933++;
        class112 var2 = this.field9932;
        synchronized (this.field9932) {
            this.field9932.method999(0);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
    public final void method4060(int arg0, int arg1) {
        field9937++;
        if (arg0 == -17452) {
            class112 var3 = this.field9932;
            synchronized (this.field9932) {
                this.field9932.method987(arg0 + 17454, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
    public static void method4061(int arg0) {
        field9929 = null;
        int var1 = -65 / ((arg0 + 58) / 57);
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lsj;ILin;Lin;)V")
    public class738(class460 arg0, int arg1, class91 arg2, class91 arg3) {
        this.field9936 = arg3;
        this.field9930 = arg2;
        this.field9930.method860(0, 3);
    }
}
