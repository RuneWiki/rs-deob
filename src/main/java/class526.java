import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class class526 {

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Ldr;")
    public static class675 field6642 = new class675(29, 6);

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Luv;")
    public static class338 field6650 = new class338();

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "[B")
    public static byte[] field6651 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public int field6643;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public int field6644;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public int field6646;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 18)
    public static void method2838(int arg0) {
        field6650 = null;
        field6642 = null;
        field6651 = null;
        int var1 = -119 % ((11 - arg0) / 55);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Z", line = 29)
    public final boolean method2839(int arg0) {
        if (arg0 == 0) {
            field6645++;
            return (this.field6643 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z", line = 41)
    public final boolean method2840(boolean arg0) {
        field6640++;
        if (arg0) {
            return true;
        } else {
            return (this.field6643 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILcu;ZIII)V", line = 52)
    public static final void method2841(int arg0, int arg1, class207 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field6641++;
        if (arg0 != -305539927) {
            field6650 = null;
        }
        if (class141.field1697 >= 50 || arg2 == null || arg2.field2439 == null || arg2.field2439.length <= arg5 || arg2.field2439[arg5] == null) {
            return;
        }
        int var7 = arg2.field2439[arg5][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE4) >> 5;
        int var10 = var7 & 0x1F;
        if (arg2.field2439[arg5].length > 1) {
            int var11 = (int) ((double) arg2.field2439[arg5].length * Math.random());
            if (var11 > 0) {
                var8 = arg2.field2439[arg5][var11];
            }
        }
        if (var10 == 0) {
            if (arg3) {
                if (arg2.field2448) {
                    class606.method3374(var8, (byte) 124, 0, 255, false, var9);
                    return;
                }
                class132.method852(255, (byte) -47, var8, 0, var9);
            }
        } else if (class611.field8310.field8701 != 0) {
            int var12 = arg4 - 256 >> 9;
            int var13 = arg6 - 256 >> 9;
            class266.field3358[class141.field1697++] = new class175((byte) (arg2.field2448 ? 2 : 1), var8, var9, 0, 255, (var13 << 8) + (arg1 << 24) + (var12 << 16) + var10);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)Lhg;", line = 112)
    public static final class647 method2842(boolean arg0, int arg1) {
        field6648++;
        class647[] var2 = class323.method1863((byte) 104);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class647 var4 = var2[var3];
            if (var4.field8751 == arg1) {
                return var4;
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)Z", line = 139)
    public final boolean method2843(int arg0) {
        if (arg0 == -22050) {
            field6647++;
            return (this.field6643 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)Z", line = 153)
    public final boolean method2844(boolean arg0) {
        field6639++;
        if (arg0) {
            return true;
        } else {
            return (this.field6643 & 0x2) != 0;
        }
    }
}
