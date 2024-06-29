import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class427 extends class128 {

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "[B")
    public static byte[] field5831 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "[I")
    public static int[] field5837 = new int[200];

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field5834 = 0;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field5835 = 0;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "[B")
    private byte[] field5839;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 5)
    public static void method2460(int arg0) {
        field5831 = null;
        if (arg0 == -377) {
            field5837 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILpe;)V", line = 17)
    public static final void method2461(int arg0, int arg1, int arg2, class431 arg3) {
        class409 var4 = class185.method1204(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5618 = arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIB)V", line = 23)
    public final void method922(boolean arg0, int arg1, byte arg2) {
        field5840++;
        int var4 = arg1 * 2;
        if (arg0) {
            byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
            this.field5839[var4++] = var5;
            this.field5839[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 38)
    public class427() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)I", line = 43)
    public static final int method2462(int arg0) {
        field5838++;
        class162 var1 = class370.field4984;
        boolean var2 = false;
        if (class166.field2414 != arg0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class162.method1100(null, (byte) 124, 0, var3, null, 0);
        }
        long var4 = class498.method2854(-117);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method552(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class498.method2854(arg0 ^ 0xFFFFFF86) - var4);
        var1.method1093(100, 0, 0, 3, 100, -16777216);
        if (var2) {
            var1.method1095(arg0 ^ 0x3C98);
        }
        return var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZC)B", line = 83)
    public static final byte method2463(boolean arg0, char arg1) {
        field5833++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (!arg0) {
            field5831 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBII)[B", line = 216)
    public final byte[] method2464(int arg0, byte arg1, int arg2, int arg3) {
        field5832++;
        this.field5839 = new byte[arg0 * arg2 * 2 * arg3];
        this.method3077(arg0, -42, arg3, arg2);
        if (arg1 != -117) {
            field5835 = 22;
        }
        return this.field5839;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIII)V", line = 229)
    public static final void method2465(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field5830++;
        arg2--;
        int var6 = arg1 - 1;
        int var5 = var6 + arg3;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg0[var7] = arg4;
            int var8 = var7 + 1;
            arg0[var8] = arg4;
            int var9 = var8 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var12 = var11 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg2 = var13 + 1;
            arg0[arg2] = arg4;
        }
        while (var6 > arg2) {
            arg2++;
            arg0[arg2] = arg4;
        }
    }
}
