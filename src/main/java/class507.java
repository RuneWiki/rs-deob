import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class507 extends class775 {

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "Lee;")
    public static class706 field7007 = new class706(4);

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "B")
    private byte field7008;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "B")
    private byte field7011;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "Ljava/lang/String;")
    private String field7009;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
    public static void method2933(int arg0) {
        field7007 = null;
        int var1 = -12 / ((arg0 - 19) / 36);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjp;)V")
    public final void method2934(int arg0, class376 arg1) {
        if (arg0 != 3) {
            return;
        }
        field7010++;
        this.field7009 = arg1.method2383((byte) 95);
        if (this.field7009 != null) {
            arg1.method2398(-1372747256);
            this.field7008 = arg1.method2387((byte) -82);
            this.field7011 = arg1.method2387((byte) -78);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLhka;)V")
    public final void method2935(byte arg0, class56 arg1) {
        if (this.field7009 != null) {
            arg1.field790 = this.field7011;
            arg1.field781 = this.field7008;
        }
        field7012++;
        arg1.field789 = this.field7009;
        int var3 = 55 / ((-arg0 - 58) / 57);
    }
}
