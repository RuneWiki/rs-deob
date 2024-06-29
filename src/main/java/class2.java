import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class2 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[B")
    public static byte[] field23;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Z")
    public static boolean field34;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
    public static int[] field32;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIIZ)V")
    public static final void method8(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field25++;
        if (arg1) {
            method12(-114);
        }
        if (class67.method473(arg0, (byte) -98)) {
            class47.method337(1000, arg3, -1, arg4, class34.field519[arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public abstract void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()Z")
    public boolean method11() {
        field30++;
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static final void method12(int arg0) {
        field24++;
        class115.field1845.method1257(48);
        class49.field811.method1257(-103);
        if (arg0 != 952606864) {
            method12(-18);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static void method13(int arg0) {
        field32 = null;
        field23 = null;
        int var1 = 86 / ((arg0 + 75) / 46);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIZILjava/lang/String;Lfm;Lag;I)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, String arg6, class93 arg7, class211 arg8, int arg9) {
        field29++;
        int var10;
        if (class120.field1919 == 4) {
            var10 = (int) class90.field1456 & 0x7FF;
        } else {
            var10 = (int) class90.field1456 + class173.field2831 & 0x7FF;
        }
        int var11 = Math.max(arg8.field3430 / 2, arg8.field3394 / 2) + 10;
        if (!arg4) {
            return;
        }
        int var12 = arg0 * arg0 + arg3 * arg3;
        if (var11 * var11 < var12) {
            return;
        }
        int var13 = class302.field4823[var10];
        int var14 = class302.field4824[var10];
        if (class120.field1919 != 4) {
            var14 = var14 * 256 / (class292.field4687 + 256);
            var13 = var13 * 256 / (class292.field4687 + 256);
        }
        int var15 = arg0 * var14 + arg3 * var13 >> 16;
        int var16 = arg3 * var14 - (arg0 * var13) >> 16;
        int var17 = arg7.method629(arg6, 100);
        int var18 = arg7.method640(arg6, 100, 0);
        int var19 = var15 - var17 / 2;
        if (var19 >= (-arg8.field3430) && var19 <= arg8.field3430 && var16 >= (-arg8.field3394) && arg8.field3394 >= var16) {
            class127.method907(arg8.field3460, arg8.field3505);
            arg7.method628(arg6, arg8.field3430 / 2 + arg1 + var19, arg8.field3394 / 2 + arg9 + -arg5 + -var16 + -var18, var17, 50, arg2, 0, 256, 1, 0, 0);
            class127.method888();
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()I")
    public abstract int method15();

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqk;IIIZ)V")
    public void method16(class2 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field31++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Lqk;")
    public class2 method17(int arg0, int arg1, int arg2) {
        field26++;
        return this;
    }

    static {
        int var0 = 0;
        field23 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field23[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field33 = 0;
        field34 = false;
    }
}
