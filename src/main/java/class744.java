import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class744 {

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lpa;")
    private class387 field10357 = new class387(128);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "Lcb;")
    private class544 field10355;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field10362 = new String[5];

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "Lke;")
    public static class622 field10361 = new class622(68, -2);

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field10360;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "Lrb;")
    public static class370 field10365;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)Lso;")
    public final class493 method4152(int arg0, int arg1) {
        field10358++;
        class387 var3 = this.field10357;
        class493 var4;
        synchronized (this.field10357) {
            var4 = (class493) this.field10357.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field10355;
        byte[] var6;
        synchronized (this.field10355) {
            var6 = this.field10355.method3150(arg1, -100, 1);
            if (arg0 > -81) {
                method4153(-123, 'I');
            }
        }
        class493 var7 = new class493();
        if (var6 != null) {
            var7.method2884(new class120(var6), 0);
        }
        class387 var8 = this.field10357;
        synchronized (this.field10357) {
            this.field10357.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IC)Z")
    public static final boolean method4153(int arg0, char arg1) {
        if (arg0 < 8) {
            return true;
        } else {
            field10363++;
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Ldd;")
    public static final class731 method4154(byte arg0) {
        field10364++;
        class731 var1 = class1.method9((byte) -96);
        var1.field10210 = null;
        var1.field10215 = 0;
        int var2 = -36 / ((arg0 - 17) / 40);
        var1.field10211 = new class331(5000);
        return var1;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
    public final void method4155(byte arg0) {
        if (arg0 > -62) {
            return;
        }
        field10356++;
        class387 var2 = this.field10357;
        synchronized (this.field10357) {
            this.field10357.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static void method4156(int arg0) {
        field10362 = null;
        field10365 = null;
        field10361 = null;
        if (arg0 != 68) {
            field10365 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)V")
    public final void method4157(byte arg0, int arg1) {
        class387 var3 = this.field10357;
        synchronized (this.field10357) {
            this.field10357.method2366(arg1, 112);
        }
        field10360++;
        if (arg0 < 48) {
            this.field10355 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
    public final void method4158(int arg0) {
        class387 var2 = this.field10357;
        synchronized (this.field10357) {
            if (arg0 != -26410) {
                return;
            }
            this.field10357.method2364(1);
        }
        field10359++;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Liv;ILcb;)V")
    public class744(class106 arg0, int arg1, class544 arg2) {
        this.field10355 = arg2;
        this.field10355.method3147(1, -71);
    }
}
