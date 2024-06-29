import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class250 implements class480 {

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljava/lang/String;")
    private String field4000;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3996 = -1;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lhga;")
    public static class158 field3994 = new class158(96, 10);

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4004 = -1;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field4003 = -1;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lja;")
    public static class254 field4005 = new class254();

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
    private boolean field4001;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1778(boolean arg0) {
        field4005 = null;
        field3994 = null;
        if (arg0) {
            field4005 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lcj;", line = 17)
    public final class644 method1779(int arg0) {
        field4002++;
        int var2 = 115 / ((-arg0 - 38) / 40);
        return class644.field9056;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z", line = 32)
    public final boolean method1780(int arg0) {
        field3995++;
        if (arg0 != -1) {
            field4005 = null;
        }
        return this.field4001;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I", line = 43)
    public final int method1781(int arg0) {
        int var2 = -9 / ((29 - arg0) / 57);
        field3997++;
        int var3 = class507.method3084(this.field4000, (byte) -75);
        if (var3 >= 0 && var3 <= 100) {
            return var3;
        } else {
            this.field4001 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLos;)I", line = 60)
    public static final int method1782(byte arg0, class408 arg1) {
        if (arg0 < 67) {
            field4005 = null;
        }
        field3999++;
        if (class189.field3150 == arg1) {
            return 6407;
        } else if (class86.field1055 == arg1) {
            return 6408;
        } else if (class203.field3311 == arg1) {
            return 6406;
        } else if (class442.field6728 == arg1) {
            return 6409;
        } else if (class135.field2205 == arg1) {
            return 6410;
        } else if (class436.field6648 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 99)
    public class250(String arg0) {
        this.field4000 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 111)
    public static final void method1783(byte arg0) {
        if (class78.field996 != null) {
            class78.field996.method1746(30921);
        }
        field3998++;
        if (class253.field4040 != null) {
            class253.field4040.method1746(30921);
        }
        if (arg0 <= 34) {
            method1778(true);
        }
    }
}
