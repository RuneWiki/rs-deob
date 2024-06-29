import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class21 extends class498 implements class383 {

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
    public static int[] field245 = new int[2048];

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lgt;")
    public static class289 field243 = new class289();

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "[I")
    public static int[] field248 = new int[4096];

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)I")
    public final int method132(int arg0) {
        ++field238;
        if (arg0 <= 92) {
            this.method134(38, 59, (byte) 4, (byte[]) null);
        }
        return super.field7493;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lna;ILjaggl/memory/NativeBuffer;IZ)V")
    public class21(class211 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field242 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)J")
    public final long method133(byte arg0) {
        if (arg0 > -85) {
            field243 = null;
        }
        ++field244;
        return 0L;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB[B)V")
    public final void method134(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field239;
        this.method3048(-2769, arg3, arg0);
        this.field242 = arg1;
        if (arg2 != 118) {
            field248 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method135(byte arg0) {
        int var2 = -125 % ((arg0 - -65) / 33);
        ++field246;
        return this.field242;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lna;I[BIZ)V")
    public class21(class211 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field242 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method136(boolean arg0) {
        if (!arg0) {
            field247 = -16;
        }
        field245 = null;
        field243 = null;
        field248 = null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public final void method137(byte arg0) {
        ++field240;
        super.field7496.method1524(this, arg0 ^ 34);
        if (arg0 != 35) {
            field247 = 92;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZZLjava/lang/String;)Z")
    public static final boolean method138(int arg0, boolean arg1, boolean arg2, String arg3) {
        ++field241;
        if (arg0 >= 2 && arg0 <= 36) {
            boolean var4 = false;
            boolean var5 = arg2;
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        return false;
                    }
                    var11 = var9 - 'W';
                }
                if (~var11 <= ~arg0) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if (~(var10 / arg0) != ~var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }
}
