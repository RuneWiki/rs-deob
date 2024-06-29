import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class673 extends class435 {

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Z")
    public boolean field9539;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field9544;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public int field9551;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/lang/String;")
    public String field9542;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field9540;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "J")
    public long field9543;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field9550;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public int field9548;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Ljava/lang/String;")
    public String field9549;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Z")
    public boolean field9553;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "[I")
    public static int[] field9554 = new int[256];

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[S")
    public static short[] field9555;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Lel;")
    public static class3 field9556;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "Lvn;")
    public static class186 field9557;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)I")
    public static final int method3808(boolean arg0, int arg1, int arg2) {
        field9541++;
        if (class577.field8455 == -1) {
            return 1;
        }
        if (class76.field1182 != arg2) {
            class238.method1551(-118, class343.field4762.method2059(class238.field3511, true), arg2);
            if (class76.field1182 != arg2) {
                return -1;
            }
        }
        try {
            Dimension var3 = class126.field2061.getSize();
            class194.method1361(class637.field9048, (byte) -12, true, class399.field5763, class335.field4670, class343.field4762.method2059(class238.field3511, arg0));
            class163 var4 = class84.method639(class205.field3168, -4341, class577.field8455, 0);
            long var5 = class254.method1619(arg0);
            class637.field9048.method805();
            class410.field5865.method166(0, class211.field3229, 0);
            class637.field9048.method755(class410.field5865);
            class637.field9048.method819(var3.width / 2, var3.height / 2, 512, 512);
            class637.field9048.method794(1.0F);
            class637.field9048.method756(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class397 var7 = class637.field9048.method795(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label41: for (int var9 = 0; var9 < 500; var9++) {
                class637.field9048.method118(0);
                class637.field9048.method138();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class70.field1103.method166((int) (((float) var11 - (float) var10 / 2.0F) * (float) class457.field6576), 0, (var10 + 1) * class457.field6576);
                        var7.method460(class70.field1103, null, 0);
                        var8++;
                        if ((long) arg1 <= class254.method1619(true) - var5) {
                            break label41;
                        }
                    }
                }
            }
            class637.field9048.method102();
            long var12 = (long) (var8 * 1000) / (class254.method1619(true) - var5);
            class637.field9048.method118(0);
            class637.field9048.method138();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILvo;Lvo;I)V")
    public static final void method3809(int arg0, class345 arg1, class345 arg2, int arg3) {
        field9552++;
        class319.field4402 = arg1;
        class689.field9781 = arg2;
        if (arg3 != 1) {
            method3809(116, null, null, -59);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
    public static final boolean method3810(int arg0, int arg1, int arg2) {
        if (arg1 != 8192) {
            field9554 = null;
        }
        field9545++;
        return class644.method3621(arg0, (byte) -79, arg2) & ((arg0 & 0x2000) != 0 | class541.method3184(arg0, (byte) 115, arg2) | class564.method3302(arg0, arg2, 90));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLr;IB)Lql;")
    public static final class173 method3811(boolean arg0, class98 arg1, int arg2, byte arg3) {
        field9546++;
        if (arg2 == -1) {
            return null;
        }
        if (class634.field8978 != null) {
            for (int var4 = 0; var4 < class634.field8978.length; var4++) {
                if (class634.field8978[var4] == arg2) {
                    return class314.field4361[var4];
                }
            }
        }
        class173 var5 = (class173) class433.field6238.method941((long) arg2, 0);
        if (var5 != null) {
            if (arg0 && var5.field2787 == null) {
                class490 var6 = class61.method514(class662.field9306, arg2, -1);
                if (var6 == null) {
                    return null;
                }
                var5.field2787 = var6;
            }
            return var5;
        }
        class628[] var7 = class628.method3538(class609.field8758, arg2);
        if (var7 == null) {
            return null;
        }
        if (arg3 != -47) {
            method3813(-78);
        }
        class490 var8 = class61.method514(class662.field9306, arg2, -1);
        if (var8 == null) {
            return null;
        }
        class173 var9;
        if (arg0) {
            var9 = new class173(arg1.method804(var8, var7, true), var8);
        } else {
            var9 = new class173(arg1.method804(var8, var7, true));
        }
        class433.field6238.method949((long) arg2, true, var9);
        return var9;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Canvas;BLfa;)Lr;")
    public static final class98 method3812(Canvas arg0, byte arg1, class615 arg2) {
        field9547++;
        if (arg1 != -51) {
            method3812(null, (byte) -22, null);
        }
        return new class578(arg0, arg2);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class673(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field9539 = arg9;
        this.field9544 = arg3;
        this.field9551 = arg7;
        this.field9542 = arg1;
        this.field9540 = arg6;
        this.field9543 = arg5;
        this.field9550 = arg4;
        this.field9548 = arg2;
        this.field9549 = arg0;
        this.field9553 = arg8;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method3813(int arg0) {
        if (arg0 != 2048) {
            method3813(4);
        }
        field9554 = null;
        field9556 = null;
        field9555 = null;
        field9557 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9554[var0] = var1;
        }
        field9555 = new short[256];
        field9556 = new class3();
    }
}
