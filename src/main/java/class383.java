import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class383 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lvi;")
    private class560 field5569 = new class560(64);

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lpq;")
    private class159 field5566;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Ljj;")
    public static class398 field5563 = new class398(31, 2);

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5573 = new String[200];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "B")
    public static byte field5572;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lgba;")
    public static class29 field5570;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method2311(int arg0) {
        if (arg0 == 31) {
            field5567++;
            class327.field4791 = null;
            class426.field5921 = false;
            class578.method3251((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public final void method2312(int arg0) {
        class560 var2 = this.field5569;
        synchronized (this.field5569) {
            if (arg0 < 15) {
                this.field5569 = null;
            }
            this.field5569.method3144(true);
        }
        field5571++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
    public final void method2313(int arg0, int arg1) {
        field5564++;
        class560 var3 = this.field5569;
        synchronized (this.field5569) {
            if (arg0 == -31159) {
                this.field5569.method3129(arg1, 14583);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lwr;")
    public final class363 method2314(int arg0, int arg1) {
        field5568++;
        class560 var3 = this.field5569;
        class363 var4;
        synchronized (this.field5569) {
            var4 = (class363) this.field5569.method3134((long) arg1, -124);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field5566;
        byte[] var6;
        synchronized (this.field5566) {
            var6 = this.field5566.method1087(35, arg1, 1);
        }
        class363 var7 = new class363();
        if (var6 != null) {
            var7.method2230(5, new class138(var6));
        }
        var7.method2234(false);
        if (arg0 != 64) {
            this.method2315(59);
        }
        class560 var8 = this.field5569;
        synchronized (this.field5569) {
            this.field5569.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final void method2315(int arg0) {
        class560 var2 = this.field5569;
        synchronized (this.field5569) {
            this.field5569.method3142(false);
        }
        if (arg0 != 64) {
            this.field5569 = null;
        }
        field5565++;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public static void method2316(int arg0) {
        field5570 = null;
        field5573 = null;
        if (arg0 == 19775) {
            field5563 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class383(class484 arg0, int arg1, class159 arg2) {
        this.field5566 = arg2;
        if (this.field5566 != null) {
            this.field5566.method1076(35, 0);
        }
    }
}
