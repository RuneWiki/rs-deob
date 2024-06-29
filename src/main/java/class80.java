import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class80 {

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Ljo;")
    private class382 field1100 = new class382(64);

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Ljo;")
    private class382 field1109 = new class382(100);

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lok;")
    private class74 field1101;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Luv;")
    public static class2 field1102 = new class2(75, 0);

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Z")
    public static boolean field1107 = false;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lrl;")
    public static class524 field1106;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 8)
    public static void method569(int arg0) {
        if (arg0 < 57) {
            method574(null, null, null, 67);
        }
        field1106 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 19)
    public final void method570(int arg0, int arg1) {
        class382 var3 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2294(arg0, true);
        }
        field1108++;
        class382 var4 = this.field1109;
        synchronized (this.field1109) {
            if (arg1 >= 50) {
                this.field1109.method2294(arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lwg;", line = 36)
    public final class41 method571(int arg0, int arg1) {
        field1098++;
        class382 var3 = this.field1109;
        class41 var4;
        synchronized (this.field1109) {
            var4 = (class41) this.field1109.method2288((long) arg0, 0);
            if (arg1 != 100) {
                field1107 = false;
            }
            if (var4 == null) {
                var4 = new class41(arg0);
                this.field1109.method2290((long) arg0, var4, 111);
            }
        }
        synchronized (var4) {
            return var4.method330(0) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 64)
    public final void method572(int arg0) {
        class382 var2 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2287(90);
        }
        field1105++;
        class382 var3 = this.field1109;
        synchronized (this.field1109) {
            if (arg0 != 17544) {
                this.field1109 = null;
            }
            this.field1109.method2287(117);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 81)
    public final void method573(boolean arg0) {
        field1104++;
        class382 var2 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2293(arg0);
        }
        class382 var3 = this.field1109;
        synchronized (this.field1109) {
            this.field1109.method2293(arg0);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 103)
    public static final String method574(String arg0, String arg1, String arg2, int arg3) {
        field1099++;
        int var4 = arg1.indexOf(arg0);
        if (arg3 != 0) {
            field1107 = false;
        }
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg0.length() + var4);
            var4 = arg1.indexOf(arg0, var4 + arg2.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)Llc;", line = 125)
    public final class520 method575(int arg0, int arg1) {
        if (arg1 > -69) {
            return null;
        }
        field1103++;
        class382 var3 = this.field1100;
        class520 var4;
        synchronized (this.field1100) {
            var4 = (class520) this.field1100.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field1101;
        byte[] var6;
        synchronized (this.field1101) {
            var6 = this.field1101.method541(class291.method1804(12, arg0), class506.method2987(arg0, -118), (byte) -122);
        }
        class520 var7 = new class520();
        var7.field7640 = this;
        var7.field7624 = arg0;
        if (var6 != null) {
            var7.method3080(true, new class468(var6));
        }
        var7.method3071(-115);
        class382 var8 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method2290((long) arg0, var7, 108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lkr;ILok;Lok;Lok;)V", line = 170)
    public class80(class262 arg0, int arg1, class74 arg2, class74 arg3, class74 arg4) {
        this.field1101 = arg2;
        if (this.field1101 != null) {
            int var6 = this.field1101.method535((byte) 117) - 1;
            this.field1101.method536(false, var6);
        }
        class148.method1070(arg3, arg4, true);
    }
}
