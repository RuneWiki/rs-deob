import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class144 extends class601 {

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "F")
    public static float field1602 = 0.0F;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 7)
    public final void method35(byte arg0) {
        if (arg0 <= -37) {
            ++field1600;
            if (~super.field8565 != -2 && super.field8565 != 0) {
                super.field8565 = this.method39((byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lgn;)V", line = 20)
    public class144(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)I", line = 26)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            method899(-1L, -127, 14, 46);
        }
        ++field1601;
        return 1;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(ILgn;)V", line = 37)
    public class144(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 46)
    public static final String method898(String arg0, int arg1) {
        ++field1597;
        if (arg1 != 0) {
            return null;
        } else if (!class228.field2621.startsWith("win")) {
            if (class228.field2621.startsWith("linux")) {
                return "lib" + arg0 + ".so";
            } else {
                return class228.field2621.startsWith("mac") ? "lib" + arg0 + ".dylib" : null;
            }
        } else {
            return arg0 + ".dll";
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(JIII)V", line = 69)
    public static final void method899(long arg0, int arg1, int arg2, int arg3) {
        ++field1596;
        if (arg1 != 1128360276) {
            field1602 = -0.69003725F;
        }
        int var5 = 31 & (int) arg0 >> 14;
        int var6 = ((int) arg0 & 4044595) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class647.method3689(true, var6, var5, arg3, 0, 0, 0, arg2, (byte) -80);
        } else {
            class316 var8 = class445.field6442.method3972((byte) 109, var7);
            int var9;
            int var10;
            if (~var6 != -1 && var6 != 2) {
                var9 = var8.field4050;
                var10 = var8.field4020;
            } else {
                var10 = var8.field4050;
                var9 = var8.field4020;
            }
            int var11 = var8.field3994;
            if (~var6 != -1) {
                var11 = (var11 << var6 & 15) - -(var11 >> -var6 + 4);
            }
            class647.method3689(true, 0, 0, arg3, var10, var9, var11, arg2, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I", line = 113)
    public final int method900(int arg0) {
        int var2 = 83 % ((arg0 - -59) / 61);
        ++field1599;
        return super.field8565;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V", line = 123)
    public final void method40(int arg0, boolean arg1) {
        ++field1598;
        if (arg1) {
            this.method900(-126);
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I", line = 137)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            this.method35((byte) -76);
        }
        ++field1603;
        return 1;
    }
}
