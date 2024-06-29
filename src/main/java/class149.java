import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class149 extends class155 {

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "[I")
    public static int[] field2385 = new int[500];

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field2388 = 0;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "Ljava/lang/String;")
    public String field2387;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "[C")
    public char[] field2382;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "[C")
    public char[] field2383;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "[I")
    public int[] field2376;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[I")
    public int[] field2386;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
    public final void method1108(int arg0) {
        field2378++;
        int var2 = 49 / ((-arg0 - 75) / 42);
        if (this.field2376 != null) {
            for (int var3 = 0; var3 < this.field2376.length; var3++) {
                this.field2376[var3] = class200.method1408(this.field2376[var3], 32768);
            }
        }
        if (this.field2386 != null) {
            for (int var4 = 0; var4 < this.field2386.length; var4++) {
                this.field2386[var4] = class200.method1408(this.field2386[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1109(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2381++;
        int var8 = arg4 - arg0;
        int var9 = arg0 + arg1;
        int var10 = arg0 + arg6;
        if (arg2) {
            field2385 = null;
        }
        for (int var11 = arg1; var11 < var9; var11++) {
            class89.method669(class104.field1795[var11], arg3, arg5, arg6, (byte) -125);
        }
        for (int var12 = arg4; var12 > var8; var12--) {
            class89.method669(class104.field1795[var12], arg3, arg5, arg6, (byte) -126);
        }
        int var13 = arg5 - arg0;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class104.field1795[var14];
            class89.method669(var15, arg3, var10, arg6, (byte) -123);
            class89.method669(var15, arg7, var13, var10, (byte) -123);
            class89.method669(var15, arg3, arg5, var13, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lff;III)V")
    public static final void method1110(class4 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class159.field2481) {
            class313 var4 = class223.field3286[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5027 != null && var4.field5027.field3150.method21()) {
                arg0.method24(var4.field5027.field3150, 128, 0, 0, true);
            }
        }
        if (arg3 < class159.field2481) {
            class313 var5 = class223.field3286[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5027 != null && var5.field5027.field3150.method21()) {
                arg0.method24(var5.field5027.field3150, 0, 0, 128, true);
            }
        }
        if (arg2 < class159.field2481 && arg3 < class7.field67) {
            class313 var6 = class223.field3286[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5027 != null && var6.field5027.field3150.method21()) {
                arg0.method24(var6.field5027.field3150, 128, 0, 128, true);
            }
        }
        if (arg2 < class159.field2481 && arg3 > 0) {
            class313 var7 = class223.field3286[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5027 != null && var7.field5027.field3150.method21()) {
                arg0.method24(var7.field5027.field3150, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lje;")
    public static final class163 method1111(int arg0, int arg1) {
        field2384++;
        class163 var2 = (class163) class169.field2559.method1418((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 14924) {
            method1109(72, 81, false, 39, 23, -19, -16, 8);
        }
        byte[] var3 = class227.field3332.method1868(arg0, 34, 1);
        class163 var4 = new class163();
        if (var3 != null) {
            var4.method1180(true, arg0, new class53(var3));
        }
        class169.field2559.method1421((long) arg0, var4, (byte) 115);
        return var4;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field2385 = null;
        if (arg0 > -74) {
            method1112(126);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLhc;)V")
    public final void method1113(byte arg0, class53 arg1) {
        field2392++;
        if (arg0 != -28) {
            method1115(54, (byte) -118);
        }
        while (true) {
            int var3 = arg1.method366(-16505);
            if (var3 == 0) {
                return;
            }
            this.method1118(var3, (byte) 112, arg1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZ)V")
    public static final void method1114(boolean arg0, boolean arg1) {
        class36.field459 = new int[104];
        field2377++;
        class259.field4005 = 99;
        class297.field4770 = new int[104];
        class123.field2042 = new int[5];
        class126.field2128 = new int[104];
        class261.field4034 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class252.field3802 = new int[var2][105][105];
        class210.field3108 = new int[104];
        class263.field4208 = new byte[var2][104][104];
        class219.field3202 = new byte[var2][104][104];
        class243.field3584 = new byte[var2][104][104];
        class227.field3335 = new byte[var2][104][104];
        if (!arg0) {
            class192.field2847 = new byte[var2][105][105];
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Z")
    public static final boolean method1115(int arg0, byte arg1) {
        class295.field4729 = true;
        if (arg1 == 78) {
            class182.field2727 = arg0 + 1 & 0xFFFF;
            field2379++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IC)I")
    public final int method1116(int arg0, char arg1) {
        field2380++;
        if (this.field2376 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field2376.length; var3++) {
            if (this.field2382[var3] == arg1) {
                return this.field2376[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(CB)I")
    public final int method1117(char arg0, byte arg1) {
        field2389++;
        if (this.field2386 == null) {
            return -1;
        }
        int var3 = 42 % ((-arg1 - 62) / 40);
        for (int var4 = 0; var4 < this.field2386.length; var4++) {
            if (this.field2383[var4] == arg0) {
                return this.field2386[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLhc;)V")
    private final void method1118(int arg0, byte arg1, class53 arg2) {
        if (arg1 != 112) {
            return;
        }
        if (arg0 == 1) {
            this.field2387 = arg2.method326(arg1 ^ 0x54);
        } else if (arg0 == 2) {
            int var7 = arg2.method366(-16505);
            this.field2383 = new char[var7];
            this.field2386 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2386[var8] = arg2.method331(-43);
                byte var9 = arg2.method335((byte) 26);
                this.field2383[var8] = var9 == 0 ? 0 : class52.method320(class224.method1553(arg1, 113), var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method366(-16505);
            this.field2382 = new char[var4];
            this.field2376 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2376[var5] = arg2.method331(-91);
                byte var6 = arg2.method335((byte) 26);
                this.field2382[var5] = var6 == 0 ? 0 : class52.method320(arg1 - 111, var6);
            }
        }
        field2391++;
    }
}
