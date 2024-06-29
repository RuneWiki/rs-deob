import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class423 extends class18 implements class290 {

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    private int field6207;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "Lau;")
    public static class692 field6210 = new class692(32);

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field6211 = 1;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[BII)V")
    public final void method1791(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 11 % ((arg3 - -71) / 55);
        ++field6205;
        this.method125(arg1, arg0, 114);
        this.field6207 = arg2;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
    public static void method2557(int arg0) {
        int var1 = -47 % ((83 - arg0) / 41);
        field6210 = null;
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)V")
    public final void method126(byte arg0) {
        super.field353.method1732((byte) -103, this);
        if (arg0 != 33) {
            this.method1793((byte) 87);
        }
        ++field6206;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)J")
    public final long method1793(byte arg0) {
        if (arg0 <= 79) {
            field6211 = 25;
        }
        ++field6209;
        return 0L;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)I")
    public final int method1790(int arg0) {
        ++field6208;
        if (arg0 != 17906) {
            this.method1792((byte) -39);
        }
        return super.field357;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I")
    public final int method1792(byte arg0) {
        if (arg0 != 115) {
            method2557(-61);
        }
        ++field6204;
        return this.field6207;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Luca;I[BIZ)V")
    public class423(class287 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6207 = arg1;
    }
}
