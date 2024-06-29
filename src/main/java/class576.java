import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class576 {

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
    public static boolean field7860 = true;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field7861 = 0;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[Lqea;")
    public static class392[] field7862 = new class392[8];

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lcr;")
    public static class485 field7858;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)Z", line = 8)
    public static final boolean method3177(boolean arg0) {
        field7864++;
        if (class480.field6682) {
            try {
                class507.method2883(class516.field7178, -4200, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0) {
            method3180(-69, -126, -66, -8, -23);
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method3178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7863++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        class285.method1691(arg1 + arg3, class315.field4224[arg2], -7, arg1 - arg3, arg0);
        int var8 = arg4;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class315.field4224[arg2 + var6];
                int[] var10 = class315.field4224[arg2 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class285.method1691(var11, var9, arg4 ^ 0x6, var12, arg0);
                class285.method1691(var11, var10, -7, var12, arg0);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class315.field4224[arg2 + var5];
            int[] var16 = class315.field4224[arg2 - var5];
            class285.method1691(var13, var15, -7, var14, arg0);
            class285.method1691(var13, var16, -7, var14, arg0);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 80)
    public static void method3179(int arg0) {
        field7858 = null;
        if (arg0 <= 26) {
            method3179(103);
        }
        field7862 = null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIIII)V", line = 112)
    public static final void method3180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7859++;
        if (arg4 > -34) {
            method3177(false);
        }
        for (int var5 = 0; var5 < class629.field8707; var5++) {
            Rectangle var6 = class680.field9648[var5];
            if (arg2 < (var6.x + var6.width) && arg1 + arg2 > var6.x && arg0 < var6.y + var6.height && var6.y < arg0 + arg3) {
                class325.field4383[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public abstract void method1164(int arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI[B)V")
    public abstract void method1165(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Z")
    public abstract boolean method1163(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B[BII)I")
    public abstract int method1160(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public abstract void method1161(byte arg0);
}
