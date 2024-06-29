import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class210 implements class425 {

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "Lne;")
    public class210 field511;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I", line = 5)
    public final int method224(int arg0) {
        if (arg0 != -10848) {
            this.method227((byte) -111);
        }
        field521++;
        return 0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)I", line = 17)
    public final int method225(boolean arg0) {
        field513++;
        return arg0 ? 102 : 0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V", line = 28)
    public static final void method226(int arg0, long arg1) {
        if (arg0 != -6351) {
            return;
        }
        field520++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I", line = 44)
    public final int method227(byte arg0) {
        if (arg0 != -104) {
            this.method9((byte) -96, null);
        }
        field508++;
        return 0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLza;II)Z", line = 55)
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        field512++;
        return arg0;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)Z", line = 66)
    public final boolean method228(int arg0) {
        field519++;
        return arg0 == 1396 ? false : false;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 77)
    public final void method229(int arg0) {
        if (arg0 != -4715) {
            this.field511 = null;
        }
        field510++;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZII)Z", line = 91)
    public static final boolean method230(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method226(-116, -71L);
        }
        field509++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I", line = 103)
    public final int method231(int arg0) {
        field506++;
        if (arg0 < 7) {
            this.method234(62, null, 16);
        }
        return 0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lza;Z)V", line = 114)
    public final void method232(class288 arg0, boolean arg1) {
        field507++;
        if (!arg1) {
            this.method224(-45);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lza;I)Lnd;", line = 124)
    public final class385 method15(class288 arg0, int arg1) {
        if (arg1 == 2) {
            field516++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lza;I)V", line = 136)
    public final void method233(class288 arg0, int arg1) {
        field515++;
        if (arg1 != 13367) {
            this.method228(106);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILza;I)Le;", line = 147)
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        field518++;
        if (arg0 <= 99) {
            this.method234(109, null, -99);
        }
        return null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLza;)V", line = 160)
    public final void method9(byte arg0, class288 arg1) {
        field514++;
        if (arg0 >= -98) {
            this.method227((byte) 51);
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(IIIIILne;)V", line = 172)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, class210 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class499.method3011(arg1, arg0, 0));
        this.field511 = arg5;
    }
}
