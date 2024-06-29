import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class507 extends class601 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 4)
    public final void method35(byte arg0) {
        if (~super.field8565 != -2 && ~super.field8565 != -1) {
            super.field8565 = this.method39((byte) -17);
        }
        ++field7226;
        if (arg0 > -37) {
            this.method35((byte) 109);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V", line = 19)
    public final void method40(int arg0, boolean arg1) {
        ++field7230;
        if (arg1) {
            field7232 = -7;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I", line = 30)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            this.method35((byte) -89);
        }
        ++field7225;
        return 1;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I", line = 41)
    public final int method3007(int arg0) {
        int var2 = 15 / ((arg0 - -59) / 61);
        ++field7228;
        return super.field8565;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)I", line = 54)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            this.method40(31, true);
        }
        ++field7227;
        return 1;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(ILgn;)V", line = 68)
    public class507(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lgn;)V", line = 71)
    public class507(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I", line = 78)
    public static final int method3008(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class577.field8147 - 1; ++var2) {
            if (arg0 < class439.field6376[var2] + class394.field5413[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class577.field8147 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V", line = 100)
    public static final void method3009(boolean arg0) {
        class643.field9209 = new class532[class309.field3840.method2478((byte) -110)][];
        ++field7229;
        class286.field3496 = new class532[class309.field3840.method2478((byte) -127)][];
        class348.field4498 = new boolean[class309.field3840.method2478((byte) -117)];
        if (!arg0) {
            field7232 = 68;
        }
    }
}
