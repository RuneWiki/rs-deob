import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class585 {

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lqr;")
    private class65 field7655 = new class65(128);

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lqr;")
    public class65 field7656 = new class65(64);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lwu;")
    public class376 field7647;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lwu;")
    private class376 field7648;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field7652 = 1401;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Ldh;")
    public final class325 method3192(byte arg0, int arg1) {
        field7650++;
        class65 var3 = this.field7655;
        class325 var4;
        synchronized (this.field7655) {
            var4 = (class325) this.field7655.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 <= 22) {
            this.method3196((byte) -68);
        }
        class376 var5 = this.field7648;
        byte[] var6;
        synchronized (this.field7648) {
            var6 = this.field7648.method2218((byte) 124, 36, arg1);
        }
        class325 var7 = new class325();
        var7.field4616 = this;
        var7.field4629 = arg1;
        if (var6 != null) {
            var7.method1969((byte) 101, new class677(var6));
        }
        var7.method1964((byte) 87);
        class65 var8 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)V")
    public final void method3193(int arg0, byte arg1, int arg2) {
        field7651++;
        this.field7655 = new class65(arg0);
        if (arg1 > -76) {
            field7652 = -114;
        }
        this.field7656 = new class65(arg2);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILfha;B[I)V")
    public static final void method3194(int arg0, class383 arg1, byte arg2, int[] arg3) {
        field7653++;
        if (arg1.field10227 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field10227.length; var5++) {
                if (arg1.field10227[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field10257 != -1) {
                class456 var6 = class509.field6780.method663((byte) -90, arg1.field10257);
                int var7 = var6.field6214;
                if (var7 == 1) {
                    arg1.field10279 = 0;
                    arg1.field10237 = arg0;
                    arg1.field10232 = 0;
                    arg1.field10220 = 1;
                    arg1.field10233 = 0;
                    if (!arg1.field10252) {
                        class514.method2871(var6, arg1.field10233, arg1, true);
                    }
                }
                if (var7 == 2) {
                    arg1.field10232 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg2 <= 35) {
            return;
        }
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg1.field10227 == null || arg1.field10227[var9] == -1 || class509.field6780.method663((byte) -90, arg3[var9]).field6213 >= class509.field6780.method663((byte) -90, arg1.field10227[var9]).field6213) {
                arg1.field10237 = arg0;
                arg1.field10227 = arg3;
                break;
            }
        }
        if (var8) {
            arg1.field10227 = arg3;
            arg1.field10237 = arg0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public final void method3195(int arg0, int arg1) {
        class65 var3 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method553(arg1, -15782);
        }
        field7649++;
        if (arg0 > -30) {
            field7652 = -17;
        }
        class65 var4 = this.field7656;
        synchronized (this.field7656) {
            this.field7656.method553(arg1, -15782);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public final void method3196(byte arg0) {
        field7646++;
        class65 var2 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method558(0);
            if (arg0 != -68) {
                this.method3192((byte) 60, 13);
            }
        }
        class65 var3 = this.field7656;
        synchronized (this.field7656) {
            this.field7656.method558(0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public final void method3197(int arg0) {
        class65 var2 = this.field7655;
        synchronized (this.field7655) {
            this.field7655.method561((byte) -78);
            if (arg0 != 0) {
                this.field7655 = null;
            }
        }
        field7654++;
        class65 var3 = this.field7656;
        synchronized (this.field7656) {
            this.field7656.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lms;ILwu;Lwu;)V")
    public class585(class763 arg0, int arg1, class376 arg2, class376 arg3) {
        this.field7647 = arg3;
        this.field7648 = arg2;
        this.field7648.method2195(36, 0);
    }
}
