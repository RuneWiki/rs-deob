import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class395 extends class445 {

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
    public boolean field5468;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public int field5478;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Ljava/lang/String;")
    public String field5474;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
    public boolean field5470;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Ljava/lang/String;")
    public String field5475;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "J")
    public long field5480;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lh;")
    public static class434 field5471 = new class434(105, -1);

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Lgp;")
    public static class35 field5477;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lh;")
    public static class434 field5473;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "Lfl;")
    public static class480 field5481;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 13)
    public static void method2410(int arg0) {
        field5471 = null;
        field5481 = null;
        int var1 = -128 / ((-arg0 - 44) / 56);
        field5477 = null;
        field5473 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 32)
    public class395(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field5476 = arg2;
        this.field5468 = arg9;
        this.field5478 = arg4;
        this.field5469 = arg3;
        this.field5474 = arg0;
        this.field5479 = arg7;
        this.field5470 = arg8;
        this.field5472 = arg6;
        this.field5475 = arg1;
        this.field5480 = arg5;
    }
}
