import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class545 extends class392 {

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field7560 = class269.method1718(1600, 0);

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I", line = 5)
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            this.method3155(-121);
        }
        ++field7554;
        return 1;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I", line = 17)
    public final int method3155(int arg0) {
        if (arg0 != 17539) {
            field7560 = 127;
        }
        ++field7558;
        return super.field5452;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V", line = 28)
    public final void method291(boolean arg0) {
        ++field7555;
        if (super.field5452 != 1 && ~super.field5452 != -1) {
            super.field5452 = this.method292(true);
        }
        if (arg0) {
            field7560 = -32;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I", line = 45)
    public final int method292(boolean arg0) {
        ++field7559;
        if (!arg0) {
            this.method290(-67, -31);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lw;)V", line = 56)
    public class545(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([[BLqv;I)V", line = 64)
    public static final void method3156(byte[][] arg0, class79 arg1, int arg2) {
        ++field7556;
        int var3 = class555.field7705.length;
        if (arg2 != 640205096) {
            method3156((byte[][]) null, (class79) null, 82);
        }
        for (int var4 = 0; var3 > var4; ++var4) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class12.field156[var4] >> 8) * 64 + -class222.field3266;
                int var7 = (255 & class12.field156[var4]) * 64 + -class697.field9798;
                class193.method1378(111);
                arg1.method704(class686.field9702, var7, class605.field8591, arg2 ^ 640199339, var5, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILw;)V", line = 97)
    public class545(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V", line = 101)
    public final void method286(byte arg0, int arg1) {
        int var3 = 127 % ((-80 - arg0) / 38);
        super.field5452 = arg1;
        ++field7557;
    }
}
