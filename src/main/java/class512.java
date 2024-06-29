import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class512 {

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lgw;")
    public class690 field7080 = new class690(20);

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "Lgw;")
    private class690 field7085 = new class690(64);

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Luu;")
    public class237 field7079;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Luu;")
    private class237 field7076;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static final void method3059(int arg0) {
        field7081++;
        class333.method2131((byte) -58, 255, arg0);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public final void method3060(byte arg0) {
        field7083++;
        class690 var2 = this.field7085;
        synchronized (this.field7085) {
            this.field7085.method3902(0);
        }
        class690 var3 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3902(0);
        }
        if (arg0 < 36) {
            this.method3064(-13);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)V")
    public final void method3061(boolean arg0, int arg1) {
        class690 var3 = this.field7085;
        synchronized (this.field7085) {
            this.field7085.method3896(1, arg1);
        }
        field7077++;
        class690 var4 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3896(1, arg1);
        }
        if (!arg0) {
            this.field7085 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Lwf;")
    public final class108 method3062(int arg0, int arg1) {
        field7078++;
        class690 var3 = this.field7085;
        class108 var4;
        synchronized (this.field7085) {
            var4 = (class108) this.field7085.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field7076;
        byte[] var6;
        synchronized (this.field7076) {
            var6 = this.field7076.method1572(arg0, 0, arg1);
        }
        class108 var7 = new class108();
        var7.field1449 = this;
        if (var6 != null) {
            var7.method705((byte) -94, new class63(var6));
        }
        class690 var8 = this.field7085;
        synchronized (this.field7085) {
            this.field7085.method3899(47, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3063(int arg0, int arg1, byte arg2) {
        field7082++;
        if (arg2 < 106) {
            method3063(12, -82, (byte) -53);
        }
        return (arg0 & 0x70000) != 0 | class429.method2660(arg0, (byte) -102, arg1) || class639.method3568((byte) 127, arg1, arg0);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method3064(int arg0) {
        field7084++;
        class690 var2 = this.field7085;
        synchronized (this.field7085) {
            this.field7085.method3906(-126);
        }
        class690 var3 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3906(-119);
            if (arg0 != 28816) {
                this.field7079 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lgp;ILuu;Luu;)V")
    public class512(class553 arg0, int arg1, class237 arg2, class237 arg3) {
        this.field7079 = arg3;
        this.field7076 = arg2;
        this.field7076.method1597(46, 0);
    }
}
