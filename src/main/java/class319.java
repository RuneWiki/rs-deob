import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class319 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field4724 = class535.method2956(-61);

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "Ljava/lang/String;")
    public String field4732;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Ljava/lang/String;")
    public String field4730;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljava/lang/String;")
    public String field4727;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljava/lang/String;")
    public String field4736;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Ljava/lang/String;")
    public String field4725;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "[I")
    public static int[] field4729 = new int[2048];

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "Lpj;")
    public static class132 field4734;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public static void method1949(boolean arg0) {
        field4734 = null;
        if (!arg0) {
            method1949(false);
        }
        field4729 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
    public final void method1950(int arg0, String arg1, int arg2, String arg3, String arg4, String arg5, int arg6, int arg7, String arg8) {
        field4726++;
        this.field4724 = class535.method2956(-91);
        this.field4732 = arg3;
        this.field4730 = arg1;
        this.field4733 = arg0;
        this.field4735 = arg7;
        this.field4731 = arg2;
        this.field4725 = arg4;
        this.field4727 = arg5;
        this.field4737 = class239.field3440;
        if (arg6 == 15954) {
            this.field4736 = arg8;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class319(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field4732 = arg3;
        this.field4730 = arg5;
        this.field4727 = arg4;
        this.field4733 = arg6;
        this.field4736 = arg7;
        this.field4731 = arg1;
        this.field4725 = arg2;
        this.field4735 = arg0;
        this.field4737 = class239.field3440;
    }
}
