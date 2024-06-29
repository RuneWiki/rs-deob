import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class436 extends class477 implements class532 {

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "Ldk;")
    public class477 field5972;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field5960 = -1;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Lgba;")
    public static class625 field5966 = null;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field5953 = class364.method2153((byte) -126, 1600);

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "[I")
    public static int[] field5974 = new int[32];

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "Lkca;")
    public static class76 field5964;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method139(int arg0) {
        if (arg0 != 2) {
            field5965 = -50;
        }
        field5956++;
        return false;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 17)
    public static void method2476(int arg0) {
        field5974 = null;
        if (arg0 == 0) {
            field5964 = null;
            field5966 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 30)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (!arg5) {
            method2477(33, -24, 53);
        }
        field5958++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BILoa;I)Z", line = 40)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = -74 % ((arg0 + 26) / 38);
        field5961++;
        return false;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLoa;)Lpe;", line = 50)
    public final class571 method145(byte arg0, class651 arg1) {
        if (arg0 == 124) {
            field5971++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Loa;BI)Lba;", line = 62)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            this.method146(true);
        }
        field5959++;
        return null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 73)
    public final void method144(boolean arg0) {
        field5969++;
        if (arg0) {
            this.method139(-11);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Loa;I)V", line = 85)
    public final void method138(class651 arg0, int arg1) {
        if (arg1 != 2215) {
            method2477(42, -117, -52);
        }
        field5970++;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)I", line = 95)
    public final int method151(byte arg0) {
        if (arg0 == 78) {
            field5968++;
            return 0;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(Z)I", line = 112)
    public final int method152(boolean arg0) {
        field5973++;
        if (!arg0) {
            field5960 = -95;
        }
        return 0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Loa;Z)V", line = 123)
    public final void method147(class651 arg0, boolean arg1) {
        field5963++;
        if (!arg1) {
            this.method146(false);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Lwh;", line = 135)
    public static final class136 method2477(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class136 var4 = var3.field403;
            var3.field403 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z", line = 148)
    public final boolean method150(byte arg0) {
        field5954++;
        return arg0 >= -34 ? false : false;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Loa;B)V", line = 163)
    public final void method148(class651 arg0, byte arg1) {
        field5962++;
        if (arg1 != 70) {
            this.method138(null, 46);
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIIIILdk;)V", line = 175)
    public class436(int arg0, int arg1, int arg2, int arg3, int arg4, class477 arg5) {
        super(arg2, arg3, arg4, class510.method2833(120, arg1, arg0));
        this.field5972 = arg5;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(Z)I", line = 186)
    public final int method146(boolean arg0) {
        if (arg0) {
            this.method142((byte) 123);
        }
        field5967++;
        return 0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILoa;)Ldd;", line = 200)
    public final class660 method143(int arg0, class651 arg1) {
        field5955++;
        if (arg0 != 31358) {
            this.method143(90, null);
        }
        return this.field5972.method143(arg0, arg1);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V", line = 211)
    public final void method142(byte arg0) {
        if (arg0 != -77) {
            this.field5972 = null;
        }
        field5957++;
    }
}
