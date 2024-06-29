import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class203 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Ltl;")
    private class400 field3084 = new class400(64);

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lui;")
    public class451 field3085;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lui;")
    private class451 field3086;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "[I")
    public static int[] field3092 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lo;")
    public static class332 field3088 = new class332("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field3094 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Lgn;")
    public static class486 field3087;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 13)
    public final void method1383(byte arg0) {
        class400 var2 = this.field3084;
        synchronized (this.field3084) {
            this.field3084.method2401((byte) -47);
        }
        if (arg0 <= -34) {
            field3090++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Luo;", line = 26)
    public final class126 method1384(int arg0, int arg1) {
        if (arg0 < 36) {
            field3091 = 86;
        }
        field3083++;
        class400 var3 = this.field3084;
        class126 var4;
        synchronized (this.field3084) {
            var4 = (class126) this.field3084.method2393(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3086.method2691(arg1, 3, 0);
        class126 var6 = new class126();
        var6.field1718 = this;
        if (var5 != null) {
            var6.method878(new class446(var5), -1);
        }
        class400 var7 = this.field3084;
        synchronized (this.field3084) {
            this.field3084.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V", line = 58)
    public final void method1385(int arg0, int arg1) {
        class400 var3 = this.field3084;
        synchronized (this.field3084) {
            this.field3084.method2389(false, arg1);
        }
        field3093++;
        if (arg0 != 2423) {
            method1386(92);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 72)
    public static void method1386(int arg0) {
        field3092 = null;
        field3087 = null;
        if (arg0 != -13311) {
            method1386(87);
        }
        field3088 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 84)
    public final void method1387(int arg0) {
        field3089++;
        if (arg0 != 0) {
            method1388((class309) null, false);
        }
        class400 var2 = this.field3084;
        synchronized (this.field3084) {
            this.field3084.method2388(121);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lsk;Z)V", line = 97)
    public static final void method1388(class309 arg0, boolean arg1) {
        field3082++;
        int var2 = arg0.field4616 - class452.field6418;
        if (arg1) {
            field3088 = null;
        }
        int var3 = arg0.field4627 * 128 + arg0.method1705((byte) 65) * 64;
        int var4 = arg0.field4607 * 128 + (arg0.method1705((byte) 65) * 64);
        arg0.field4543 += (var3 - arg0.field4543) / var2;
        arg0.field4677 = 0;
        arg0.field4538 += (var4 - arg0.field4538) / var2;
        if (arg0.field4613 == 0) {
            arg0.method1924(8192, (byte) 103);
        }
        if (arg0.field4613 == 1) {
            arg0.method1924(12288, (byte) 105);
        }
        if (arg0.field4613 == 2) {
            arg0.method1924(0, (byte) 108);
        }
        if (arg0.field4613 == 3) {
            arg0.method1924(4096, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lgp;ILui;Lui;)V", line = 139)
    public class203(class430 arg0, int arg1, class451 arg2, class451 arg3) {
        this.field3085 = arg3;
        this.field3086 = arg2;
        this.field3086.method2662(3, (byte) -7);
    }
}
