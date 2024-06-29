import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class573 {

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Lkca;")
    public static class73 field8274 = new class73(27, 18);

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Lkea;")
    public static class203 field8275;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Ldd;")
    public static class612 field8276;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[I")
    public static int[] field8270;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3330(int arg0) {
        field8273++;
        class570.method3310((byte) -123);
        class30.field346 = null;
        class266.field3755 = null;
        if (arg0 == 334) {
            class20.field203 = null;
            class108.field1302 = null;
            class316.field4605 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIIIII)V", line = 19)
    public static final void method3331(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        field8277++;
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class104.field1246 - class38.field415) * var6 / 100 + class38.field415;
        if (var7 < class100.field1194) {
            var7 = class100.field1194;
        } else if (var7 > class359.field5089) {
            var7 = class359.field5089;
        }
        int var8 = arg4 * var7 * 512 / (arg2 * 334);
        if (var8 < class512.field7484) {
            short var9 = class512.field7484;
            var7 = var9 * 334 * arg2 / (arg4 * 512);
            if (var7 > class359.field5089) {
                var7 = class359.field5089;
                int var10 = arg4 * 512 * var7 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg0) {
                    class413.field6264.method404();
                    class413.field6264.method3524(var11, arg3, (byte) 92, -16777216, arg4, arg1);
                    class413.field6264.method3524(var11, arg3, (byte) 92, -16777216, arg4, arg1 + arg2 - var11);
                }
                arg2 -= var11 * 2;
                arg1 += var11;
            }
        } else if (class323.field4671 < var8) {
            short var12 = class323.field4671;
            var7 = arg2 * var12 * 334 / (arg4 * 512);
            if (class100.field1194 > var7) {
                var7 = class100.field1194;
                int var13 = arg2 * var12 * 334 / (var7 * 512);
                int var14 = (arg4 - var13) / 2;
                if (arg0) {
                    class413.field6264.method404();
                    class413.field6264.method3524(arg2, arg3, (byte) 92, -16777216, var14, arg1);
                    class413.field6264.method3524(arg2, arg4 + arg3 - var14, (byte) 92, -16777216, var14, arg1);
                }
                arg4 -= var14 * 2;
                arg3 += var14;
            }
        }
        class119.field1493 = arg4 * var7 / 334;
        class455.field6797 = (short) arg2;
        class544.field7779 = arg3;
        class594.field8685 = (short) arg4;
        class342.field4884 = arg1;
        if (arg5 != 31243) {
            field8274 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 113)
    public static void method3332(int arg0) {
        if (arg0 <= -3) {
            field8276 = null;
            field8274 = null;
            field8275 = null;
            field8270 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBLqf;I)V", line = 131)
    public static final void method3333(int arg0, byte arg1, class593 arg2, int arg3) {
        int var4 = -82 % ((arg1 - 53) / 45);
        field8278++;
        class384.field5787 = arg3;
        class426.field6340 = arg0;
        class15.field130 = arg2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()V", line = 143)
    public static final void method3334() {
        class620.method3569(1, class637.field9161);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 146)
    public static final long method3335(String arg0, int arg1) {
        field8271++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != 512) {
            method3336(64, -49, 67);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)I", line = 195)
    public static final int method3336(int arg0, int arg1, int arg2) {
        field8272++;
        int var3 = arg1 >> 31 & arg0 - 1;
        return arg2 == 512 ? ((arg1 >>> 31) + arg1) % arg0 + var3 : 60;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(FIIZIFFFI[FI)V")
    public abstract void method1263(float arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, float arg6, float arg7, int arg8, float[] arg9, int arg10);
}
