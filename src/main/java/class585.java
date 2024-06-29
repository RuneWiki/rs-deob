import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class585 extends class354 {

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
    public static final void method3324(int arg0) {
        class86.field1189 = arg0;
        for (int var1 = 0; var1 < class289.field3784; ++var1) {
            for (int var2 = 0; var2 < class463.field6223; ++var2) {
                if (class197.field2689[arg0][var1][var2] == null) {
                    class197.field2689[arg0][var1][var2] = new class14(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field8171;
            super.field4545 = arg1;
            class236.method1479(super.field4545, true);
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lwo;)V")
    public class585(class746 arg0) {
        super(arg0);
        class236.method1479(super.field4545, true);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        ++field8176;
        if (arg0 != 6384) {
            this.method388(-76);
        }
        if (~super.field4544.method4148((byte) 104).method22((byte) 126) > -97) {
            super.field4545 = 0;
        }
        if (super.field4545 < 0 || super.field4545 > 2) {
            super.field4545 = this.method393((byte) -79);
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)I")
    public final int method3325(byte arg0) {
        ++field8175;
        int var2 = 117 / ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field8173;
        if (arg0 != 3) {
            this.method3325((byte) 16);
        }
        return ~super.field4544.method4148((byte) 104).method22((byte) 120) > -97 ? 3 : 1;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lsl;Z)Lkd;")
    public static final class284 method3326(class461 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field8177;
            int var2 = arg0.method2566(-2);
            return new class284(var2);
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field8174;
        int var2 = 66 % ((arg0 - 37) / 63);
        return super.field4544.method4148((byte) 104).method22((byte) 121) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(ILwo;)V")
    public class585(int arg0, class746 arg1) {
        super(arg0, arg1);
        class236.method1479(super.field4545, true);
    }

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)Z")
    public final boolean method3327(int arg0) {
        ++field8172;
        if (super.field4544.method4148((byte) 104).method22((byte) 118) < 96) {
            return false;
        } else {
            int var2 = -112 % ((-34 - arg0) / 41);
            return true;
        }
    }
}
