import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class354 extends class204 {

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Ljn;")
    public static class134 field5128 = new class134(25, 6);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ILfs;)V")
    public class354(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method2226(int arg0) {
        field5128 = null;
        if (arg0 != -19513) {
            method2229(1, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)I")
    public final int method2227(byte arg0) {
        ++field5123;
        if (arg0 != -98) {
            field5128 = null;
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Z")
    public final boolean method2228(int arg0) {
        ++field5127;
        int var2 = 34 % ((arg0 - -13) / 44);
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field5124;
        if (arg0 != 0 && super.field2853.field8551.method3429((byte) -98) != 1) {
            int var3 = 106 / ((arg1 - -57) / 60);
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        ++field5125;
        super.field2852 = arg0;
        if (arg1 > -105) {
            field5128 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            this.method486(73);
        }
        ++field5126;
        return 1;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lfs;)V")
    public class354(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method2229(int arg0, Canvas arg1) {
        ++field5121;
        Dimension var2 = arg1.getSize();
        class100.method714(var2.height, (byte) 83, var2.width);
        if (class166.field2118 != 1) {
            class377.field5424.method221(arg1, class68.field754, class93.field1086);
        } else {
            class377.field5424.method221(arg1, class327.field4604, class544.field7574);
        }
        if (arg0 != 0) {
            field5128 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (~super.field2852 != -1 && super.field2853.field8551.method3429((byte) -98) != 1) {
            super.field2852 = 0;
        }
        ++field5122;
        if (~super.field2852 > -1 || super.field2852 > 1) {
            super.field2852 = this.method490((byte) 107);
        }
        if (arg0 != -4591) {
            field5128 = null;
        }
    }
}
