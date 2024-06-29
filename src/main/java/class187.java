import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class187 extends class485 {

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2713 = "";

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lf;")
    private class702 field2716;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "[[Lhd;")
    public static class689[][] field2718;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1286(int arg0) {
        class474.field6524 = null;
        class564.field7623 = null;
        class474.field6516 = null;
        class66.field862 = null;
        class390.field5520 = null;
        if (arg0 == -2) {
            class584.field8234 = null;
            class263.field3568 = null;
            class308.field4265 = null;
            class655.field9114 = null;
            ++field2714;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lsea;Lsea;Lss;)V", line = 25)
    public class187(class648 arg0, class648 arg1, class396 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIB)V", line = 29)
    public final void method480(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field2711;
        if (arg3 != 113) {
            this.method481(-61, -89, true, 13);
        }
        int var5 = this.method2761(arg3 ^ 17) * super.field6672.field6764 / 10000;
        int[] var6 = new int[4];
        class334.field4506.method174(var6);
        class334.field4506.method200(arg1, arg2 + 2, arg1 + var5, super.field6672.field6757 + arg2);
        this.field2716.method3926(arg1, arg2 + 2, super.field6672.field6764, super.field6672.field6757);
        class334.field4506.method200(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method475(byte arg0) {
        ++field2717;
        return !super.method475(arg0) ? false : super.field6673.method3623(-98, ((class396) super.field6672).field5578);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJILin;Lua;IIII)V", line = 59)
    public static final void method1287(int arg0, long arg1, int arg2, class78 arg3, class618 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2715;
        if (arg0 < 118) {
            method1288((byte) 29);
        }
        int var10 = arg2 * arg2 + arg8 * arg8;
        if (arg1 >= (long) var10) {
            int var11 = Math.min(arg3.field1104 / 2, arg3.field1050 / 2);
            if (~(var11 * var11) <= ~var10) {
                class160.method1130(arg5, 256, arg8, arg4, arg7, arg3, class186.field2692[arg6], arg2);
            } else {
                var11 -= 10;
                int var12;
                if (class203.field2863 == 4) {
                    var12 = 16383 & (int) class705.field9964;
                } else {
                    var12 = (int) class705.field9964 - -class174.field2526 & 16383;
                }
                int var13 = class597.field8342[var12];
                int var14 = class597.field8344[var12];
                if (class203.field2863 != 4) {
                    var14 = var14 * 256 / (class216.field3062 + 256);
                    var13 = var13 * 256 / (class216.field3062 - -256);
                }
                int var15 = arg2 * var14 + arg8 * var13 >> 14;
                int var16 = arg8 * var14 + -(arg2 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class619.field8612[arg6].method3929((float) arg3.field1104 / 2.0F + (float) arg7 + (float) var19, (float) arg3.field1050 / 2.0F + (float) arg5 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZI)V", line = 113)
    public final void method481(int arg0, int arg1, boolean arg2, int arg3) {
        class334.field4506.method190(arg0 + -2, arg3, super.field6672.field6764 + 4, super.field6672.field6757 + 2, ((class396) super.field6672).field5583, 0);
        if (arg1 >= -113) {
            method1287(-13, 108L, -6, (class78) null, (class618) null, -45, 101, 2, 114);
        }
        ++field2710;
        class334.field4506.method190(arg0 + -1, arg3 + 1, super.field6672.field6764 + 2, super.field6672.field6757, 0, 0);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V", line = 126)
    public static void method1288(byte arg0) {
        field2713 = null;
        field2718 = null;
        if (arg0 != -127) {
            method1288((byte) -99);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 138)
    public final void method476(int arg0) {
        ++field2712;
        super.method476(arg0);
        this.field2716 = class65.method554(((class396) super.field6672).field5578, super.field6673, 3);
    }
}
