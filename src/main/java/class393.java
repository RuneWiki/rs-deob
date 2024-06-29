import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class393 extends class278 {

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Z")
    public static boolean field5480 = false;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field5484 = 0;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field5482;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    private int field5485;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    private int field5486;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "[[B")
    public static byte[][] field5478;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method2248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5479;
        if (arg5 == arg7) {
            class23.method174(arg1, arg6, arg4, arg0, arg7, (byte) -57, arg2);
        } else {
            if (class382.field5379 <= -arg7 + arg1 && ~(arg1 - -arg7) >= ~class175.field2497 && -arg5 + arg0 >= class343.field4727 && class54.field753 >= arg0 + arg5) {
                class351.method1943(arg4, arg2, arg0, arg5, arg1, -1, arg7, arg6);
            } else {
                class28.method194(arg4, arg2, arg5, arg1, arg0, arg7, 0, arg6);
            }
            if (arg3 <= 64) {
                method2252((byte) -28);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)I", line = 33)
    public static final int method2249(int arg0, int arg1) {
        ++field5477;
        return arg1 < 16 ? 87 : 127 & arg0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 44)
    public class393() {
        this(0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B)[B", line = 47)
    public static final byte[] method2250(int arg0, byte[] arg1) {
        ++field5487;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class416.method2491(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBII)V", line = 62)
    public static final void method2251(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg2 << 3;
        ++field5483;
        int var6 = arg3 << 3;
        class510.field7495 = (float) var5;
        int var7 = -95 / ((2 - arg1) / 32);
        class40.field553 = (float) var6;
        if (~class128.field1742 == -3) {
            class476.field6958 = var5;
            class208.field2951 = var6;
            class250.field3483 = var4;
        }
        class118.method746(-86);
        class351.field4800 = true;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V", line = 85)
    public static void method2252(byte arg0) {
        if (arg0 != 29) {
            field5480 = false;
        }
        field5478 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Llh;II)V", line = 95)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.method2253((byte) -121, arg0.method2111(-2));
        }
        if (arg1 != -30446) {
            this.field5486 = -105;
        }
        ++field5488;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V", line = 122)
    private class393(int arg0) {
        super(0, false);
        this.method2253((byte) -117, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I", line = 138)
    public final int[][] method324(int arg0, int arg1) {
        ++field5481;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (arg0 < 75) {
            this.method324(-113, 111);
        }
        if (super.field3757.field3420) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class507.field7456; ++var7) {
                var4[var7] = this.field5486;
                var5[var7] = this.field5482;
                var6[var7] = this.field5485;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)V", line = 183)
    private final void method2253(byte arg0, int arg1) {
        int var3 = -59 % ((arg0 - -28) / 59);
        this.field5485 = arg1 << 4 & 4080;
        ++field5489;
        this.field5486 = (arg1 & 16711680) >> 12;
        this.field5482 = (65280 & arg1) >> 4;
    }
}
