import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class364 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field4621 = class34.method219(0);

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Ljava/lang/String;")
    public String field4630;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
    public String field4623;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
    public String field4627;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public String field4625;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/lang/String;")
    public String field4624;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lrga;")
    public static class280 field4629 = new class280(67, -1);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 7)
    public static final void method1998(long[] arg0, int arg1, Object[] arg2) {
        class544.method2940(arg1, arg0.length - 1, arg0, arg2, (byte) 35);
        field4622++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 18)
    public static void method1999(int arg0) {
        field4629 = null;
        if (arg0 != -16044) {
            method1999(-56);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;)V", line = 35)
    public final void method2000(String arg0, String arg1, String arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7, String arg8) {
        this.field4621 = class34.method219(0);
        field4628++;
        this.field4631 = arg4;
        this.field4626 = arg6;
        this.field4632 = class133.field1735;
        this.field4624 = arg0;
        this.field4625 = arg8;
        this.field4627 = arg1;
        this.field4623 = arg3;
        this.field4633 = arg5;
        this.field4630 = arg2;
        if (arg7) {
            method1999(-30);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 56)
    public class364(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field4626 = arg6;
        this.field4630 = arg2;
        this.field4633 = arg1;
        this.field4631 = arg0;
        this.field4623 = arg3;
        this.field4627 = arg7;
        this.field4632 = class133.field1735;
        this.field4625 = arg4;
        this.field4624 = arg5;
    }
}
