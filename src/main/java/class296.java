import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class296 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Lea;")
    public static class474 field4391 = new class474("Profiling", "Profiling", "Profilage", "Profiling");

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4392;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lrt;I[B)V")
    public final void method1982(class194 arg0, int arg1, byte[] arg2) {
        field4390++;
        if (arg0.field2622[arg0.field2610] != 31 || arg0.field2622[arg0.field2610 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4392 == null) {
            this.field4392 = new Inflater(true);
        }
        try {
            this.field4392.setInput(arg0.field2622, arg0.field2610 + 10, -arg0.field2610 - 10 + -8 + arg0.field2622.length);
            this.field4392.inflate(arg2);
            if (arg1 != -13227) {
                this.method1982(null, -49, null);
            }
        } catch (Exception var4) {
            this.field4392.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4392.reset();
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class296() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4394++;
        if (arg0 == arg1) {
            class630.method3608(arg3, arg5, arg6, arg1, (byte) -117, arg4, arg2);
            return;
        }
        if (arg3 - arg1 >= class113.field1385 && class4.field43 >= (arg1 + arg3) && class418.field6298 <= arg6 - arg0 && class461.field6877 >= (arg6 + arg0)) {
            class570.method3312(13104, arg1, arg2, arg3, arg5, arg6, arg4, arg0);
        } else {
            class201.method1274(arg6, arg3, arg5, arg0, arg2, 1560382433, arg4, arg1);
        }
        if (arg7 >= -57) {
            method1983(69, 38, 47, 87, 82, 15, -112, -66);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
    public static final void method1984(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        field4393++;
        int var5 = arg0 << 3;
        int var6 = -24 / ((arg2 + 30) / 60);
        int var7 = arg3 << 3;
        if (class236.field3384 == 2) {
            class474.field7009 = var7;
            class17.field177 = var4;
            class309.field4550 = var5;
        }
        class388.field5967 = var4;
        class639.field9187 = var5;
        class508.method3029(-2368);
        class421.field6304 = true;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V")
    public static final void method1985(int arg0, boolean arg1) {
        if (arg1) {
            method1986(97);
        }
        field4389++;
        class467 var2 = class541.method3144(arg0, (byte) -115, 8);
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method1986(int arg0) {
        if (arg0 <= 34) {
            field4391 = null;
        }
        field4391 = null;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(III)V")
    private class296(int arg0, int arg1, int arg2) {
    }
}
