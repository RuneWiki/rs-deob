import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class102 implements class666 {

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lgga;")
    private class513 field1506;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljava/lang/String;")
    private String field1499;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lsv;")
    public static class570 field1501 = new class570(2, 3);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
    public static int[] field1503 = new int[1000];

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lsv;")
    public static class570 field1502 = new class570(38, 7);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Z")
    public static boolean field1505;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static void method840(boolean arg0) {
        field1503 = null;
        field1501 = null;
        if (!arg0) {
            method840(false);
        }
        field1502 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLfm;I)V")
    public static final void method841(boolean arg0, class281 arg1, int arg2) {
        field1498++;
        if (arg1.field4088 != null) {
            int var3 = arg1.field4088[arg2 + 1];
            if (arg1.field4064 != var3) {
                arg1.field4140 = arg1.field4141;
                arg1.field4132 = 0;
                arg1.field4080 = 1;
                arg1.field4064 = var3;
                arg1.field4114 = 0;
                arg1.field4086 = 0;
                if (arg1.field4064 != -1) {
                    class324.method1958(class168.field2552.method3287(110, arg1.field4064), (byte) 42, arg1, arg1.field4114);
                }
            }
        }
        if (arg0) {
            field1501 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lpw;")
    public final class104 method842(byte arg0) {
        field1504++;
        if (arg0 != -49) {
            field1503 = null;
        }
        return class104.field1512;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
    public final int method843(int arg0) {
        field1500++;
        if (this.field1506.method2990((byte) -87, this.field1499)) {
            return 100;
        } else if (arg0 == 25894) {
            return this.field1506.method3020(this.field1499, arg0 ^ 0x6526);
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lgga;Ljava/lang/String;)V")
    public class102(class513 arg0, String arg1) {
        this.field1506 = arg0;
        this.field1499 = arg1;
    }
}
