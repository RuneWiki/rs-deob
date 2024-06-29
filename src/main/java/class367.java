import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class367 extends class416 {

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4731;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "Lfh;")
    public static class653 field4733 = new class653();

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4736 = null;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V", line = 7)
    public static final void method2118(int arg0) {
        field4730++;
        int var1 = class609.field8448.method2595((byte) 59);
        boolean var2 = class609.field8448.method2629(-116) == 1;
        int var3 = class609.field8448.method2606((byte) -103);
        int var4 = class609.field8448.method2604((byte) -128);
        class547.field7642 = class609.field8448.method2583(false);
        class262.method1574(true);
        class116.method905(var3, -6);
        class609.field8448.method1240(false);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class409.field5183 >> 3); var20++) {
                for (int var21 = 0; var21 < class543.field7597 >> 3; var21++) {
                    int var22 = class609.field8448.method1235(1, -4080);
                    if (var22 == 1) {
                        class387.field4934[var5][var20][var21] = class609.field8448.method1235(26, -4080);
                    } else {
                        class387.field4934[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class609.field8448.method1234((byte) 43);
        int var6 = (class440.field5868 - class609.field8448.field6193) / 16;
        class739.field10307 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class739.field10307[var7][var19] = class609.field8448.method2622(-539564808);
            }
        }
        class470.field6312 = null;
        class222.field2975 = new int[var6];
        class256.field3258 = new byte[var6][];
        if (arg0 >= -66) {
            return;
        }
        class201.field2708 = new int[var6];
        class393.field4990 = new int[var6];
        class731.field10169 = new int[var6];
        class480.field6528 = new int[var6];
        class273.field3430 = new byte[var6][];
        class412.field5243 = new byte[var6][];
        class385.field4921 = new byte[var6][];
        class33.field545 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class409.field5183 >> 3; var10++) {
                for (int var11 = 0; var11 < (class543.field7597 >> 3); var11++) {
                    int var12 = class387.field4934[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class201.field2708[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class201.field2708[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class222.field2975[var8] = class238.field3094.method3161((byte) -74, "m" + var17 + "_" + var18);
                            class480.field6528[var8] = class238.field3094.method3161((byte) -46, "l" + var17 + "_" + var18);
                            class731.field10169[var8] = class238.field3094.method3161((byte) -38, "um" + var17 + "_" + var18);
                            class393.field4990[var8] = class238.field3094.method3161((byte) -77, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class295.method1773((byte) -107, var2, var1, 11, var4);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(III)Z", line = 160)
    public static final boolean method2119(int arg0, int arg1, int arg2) {
        field4732++;
        int var3 = -45 % ((arg2 + 51) / 43);
        boolean var4 = (arg1 & 0x37) == 0 ? class164.method1143(arg0, -1, arg1) : class365.method2111(arg1, (byte) -70, arg0);
        return class745.method4142(arg1, arg0, (byte) 107) | (arg0 & 0x10000) != 0 | var4;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I[BILbi;IIIZ)Lbaa;", line = 176)
    public static final class525 method2120(int arg0, byte[] arg1, int arg2, class483 arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4734++;
        if (arg0 != 382) {
            method2122(-50);
        }
        if (!arg3.field6875 && (!class54.method400(5533, arg6) || !class54.method400(5533, arg2))) {
            return arg3.field6880 ? new class525(arg3, 34037, arg4, arg6, arg2, arg7, arg1, arg5) : new class525(arg3, arg4, arg6, arg2, class565.method3253(39, arg6), class565.method3253(-99, arg2), arg1, arg5);
        } else {
            return new class525(arg3, 3553, arg4, arg6, arg2, arg7, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 195)
    public final void method2121(byte arg0) {
        this.field4731.method3783();
        int var2 = 82 % ((arg0 - 11) / 55);
        field4735++;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V", line = 205)
    public static void method2122(int arg0) {
        field4736 = null;
        field4733 = null;
        if (arg0 != 4) {
            field4736 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(I)V", line = 219)
    public class367(int arg0) {
        this.field4731 = new NativeHeap(arg0);
    }
}
