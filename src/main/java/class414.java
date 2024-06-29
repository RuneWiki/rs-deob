import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class414 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Lkp;")
    public static class456 field6001;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5998++;
        int var7 = arg0 + arg6;
        if (arg1 != 2) {
            return;
        }
        int var8 = arg3 - arg6;
        for (int var9 = arg0; var9 < var7; var9++) {
            class705.method3938(arg5, arg4, 30336, arg2, class582.field8429[var9]);
        }
        for (int var10 = arg3; var10 > var8; var10--) {
            class705.method3938(arg5, arg4, 30336, arg2, class582.field8429[var10]);
        }
        int var11 = arg5 - arg6;
        int var12 = arg2 + arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class582.field8429[var13];
            class705.method3938(var12, arg4, 30336, arg2, var14);
            class705.method3938(arg5, arg4, arg1 ^ 0x7682, var11, var14);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public static void method2525(byte arg0) {
        field6001 = null;
        if (arg0 < 117) {
            field6001 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z")
    public final boolean method2526(int arg0) {
        field6009++;
        if (arg0 != -19441) {
            this.field5999 = 105;
        }
        return (this.field6007 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)Z")
    public final boolean method2527(int arg0) {
        if (arg0 < 53) {
            field6008 = -29;
        }
        field6004++;
        return (this.field6007 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)S")
    public static final short method2528(byte arg0, int arg1) {
        field6000++;
        int var2 = (arg1 & 0xFC4F) >> 10;
        int var3 = (arg1 & 0x382) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        int var9 = -121 % ((72 - arg0) / 36);
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z")
    public static final boolean method2529(int arg0, int arg1, int arg2) {
        if (arg0 <= 92) {
            field6001 = null;
        }
        field6003++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Z")
    public final boolean method2530(int arg0) {
        if (arg0 >= -21) {
            this.method2526(-6);
        }
        field6005++;
        return (this.field6007 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z")
    public final boolean method2531(boolean arg0) {
        field6002++;
        if (arg0) {
            this.method2531(false);
        }
        return (this.field6007 & 0x1) != 0;
    }
}
