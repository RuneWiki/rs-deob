import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class69 extends class28 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Ljava/lang/String;")
    public String field904;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Ljava/lang/String;")
    public String field907;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "J")
    public long field900;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
    public boolean field903;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Z")
    public boolean field906;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lpn;")
    public static class361 field909 = new class361();

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 3)
    public static void method409(int arg0) {
        field909 = null;
        if (arg0 != 16) {
            method410(-8, 64, -16);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 22)
    public static final void method410(int arg0, int arg1, int arg2) {
        int var3 = -29 % ((-arg2 - 72) / 54);
        field911++;
        class19 var4 = class364.method2236(1248116640, arg0, 16);
        var4.method110(12142);
        var4.field171 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 39)
    public class69(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field901 = arg2;
        this.field904 = arg0;
        this.field908 = arg6;
        this.field910 = arg7;
        this.field907 = arg1;
        this.field902 = arg3;
        this.field900 = arg5;
        this.field903 = arg9;
        this.field906 = arg8;
        this.field905 = arg4;
    }
}
