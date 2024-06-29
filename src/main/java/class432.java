import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class432 implements class347 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public int field6407;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field6405 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[Lf;")
    public static class191[] field6406;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method2584(int arg0) {
        field6406 = null;
        if (arg0 != 3) {
            field6409 = -32;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILea;Ljb;Lf;IIII)V")
    public static final void method2585(int arg0, class15 arg1, class499 arg2, class191 arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 93 / ((arg0 - 24) / 49);
        field6404++;
        if (arg3 == null) {
            return;
        }
        int var9;
        if (field6409 == 4) {
            var9 = (int) class482.field7022 & 0x3FFF;
        } else {
            var9 = (int) class482.field7022 + class384.field5871 & 0x3FFF;
        }
        int var10 = Math.max(arg2.field7348 / 2, arg2.field7386 / 2) + 10;
        int var11 = arg4 * arg4 + arg5 * arg5;
        if (var11 > var10 * var10) {
            return;
        }
        int var12 = class525.field7760[var9];
        int var13 = class525.field7763[var9];
        if (field6409 != 4) {
            var12 = var12 * 256 / (class235.field3345 + 256);
            var13 = var13 * 256 / (class235.field3345 + 256);
        }
        int var14 = arg4 * var12 + arg5 * var13 >> 15;
        int var15 = arg4 * var13 - (arg5 * var12) >> 15;
        arg3.method30(arg2.field7348 / 2 + arg6 - (-var14 - -(arg3.method209() / 2)), arg7 + arg2.field7386 / 2 - var15 + -(arg3.method219() / 2), arg1, arg6, arg7);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
    public static final int method2586(int arg0, int arg1) {
        return class518.field7684 == null ? 0 : (class518.field7684[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILjava/lang/Class;)Lvj;")
    public static final class153 method2587(int arg0, int arg1, int arg2, Class arg3) {
        class420 var4 = class380.field5802[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class115 var5 = var4.field6273; var5 != null; var5 = var5.field1600) {
            class153 var6 = var5.field1594;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2208 == arg1 && var6.field2216 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
    public static final void method2588(int arg0, byte arg1) {
        field6408++;
        class14.field242.method1016(arg0, (byte) 117);
        class411.field6185.method1016(arg0, (byte) 117);
        class112.field1563.method1016(arg0, (byte) 115);
        class242.field3402.method1016(arg0, (byte) 120);
        class438.field6530.method1016(arg0, (byte) 118);
        if (arg1 < 93) {
            method2586(-52, 57);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class432(String arg0, int arg1) {
        this.field6407 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6403++;
        throw new IllegalStateException();
    }
}
