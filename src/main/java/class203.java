import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class203 {

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "F")
    public static float field3025 = 0.0F;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Lqc;")
    public static class325 field3028 = new class325(32);

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "[I")
    public static int[] field3033 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "[Lql;")
    public static class155[] field3026;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZFIIIII)[[I", line = 4)
    public static final int[][] method1308(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3029++;
        int[][] var9 = new int[arg0][arg4];
        class196 var10 = new class196();
        var10.field2947 = (int) (arg3 * 4096.0F);
        var10.field2946 = arg7;
        var10.field2963 = arg2;
        var10.field2955 = arg8;
        var10.field2962 = arg6;
        var10.method212(-19103);
        class335.method2094(127, arg0, arg4);
        if (arg5 >= -13) {
            return null;
        } else {
            for (int var11 = 0; var11 < arg0; var11++) {
                var10.method1269(var9[var11], var11, (byte) 76);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)I", line = 35)
    public static final int method1309(int arg0, int arg1, int arg2, int arg3) {
        field3027++;
        if (arg1 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg0;
        int var5 = (arg3 & 0x7F) * var4 + ((arg1 & 0x7F) * arg0) >> 7;
        int var6 = (arg1 & arg2) * arg0 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg1 & 0xFC00) * arg0 + (arg3 & 0xFC00) * var4 >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)Z", line = 56)
    public static final boolean method1310(byte arg0, int arg1, int arg2) {
        if (arg0 >= -96) {
            method1309(-120, -74, 59, 0);
        }
        field3022++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 67)
    public static void method1311(int arg0) {
        field3026 = null;
        field3028 = null;
        field3033 = null;
        int var1 = -13 / ((-arg0 - 34) / 63);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V", line = 79)
    public static final void method1312(int arg0, int arg1) {
        field3030++;
        if (class102.field1303 == arg0) {
            return;
        }
        class35.field399 = class382.field5586 = class292.field4280[arg0];
        class19.method88((byte) 51);
        class497.field7475 = new int[4][class35.field399 >> 3][class382.field5586 >> 3];
        class122.field1576 = new int[class35.field399][class382.field5586];
        class226.field3335 = new int[class35.field399][class382.field5586];
        for (int var2 = 0; var2 < 4; var2++) {
            class67.field772[var2] = class67.method413(class382.field5586, (byte) 7, class35.field399);
        }
        class22.field197 = new byte[arg1][class35.field399][class382.field5586];
        class409.method2436(class382.field5586, 4, class35.field399, arg1 ^ 0x63);
        class248.method1579(class382.field5586 >> 3, class35.field399 >> 3, class379.field5558, (byte) 65);
        class102.field1303 = arg0;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)Z", line = 125)
    public final boolean method1313(int arg0) {
        field3023++;
        if (arg0 != 2) {
            field3028 = null;
        }
        return class149.field1922 == this | class125.field1647 == this;
    }

    @OriginalMember(owner = "client!mba", name = "toString", descriptor = "()Ljava/lang/String;", line = 136)
    public final String toString() {
        field3024++;
        throw new IllegalStateException();
    }
}
