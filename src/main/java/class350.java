import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class class350 extends class256 {

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "[I")
    public static int[] field4969 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!im", name = "t", descriptor = "[I")
    public static int[] field4977 = new int[25];

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Ldp;")
    public static class174 field4966;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V", line = 5)
    public final void method54(int arg0) {
        field4981++;
        if (arg0 != 0) {
            this.method54(-15);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B[II)V", line = 16)
    public static final void method2245(byte arg0, int[] arg1, int arg2) {
        field4971++;
        for (int var3 = 31; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg1[var4 + var5] == 0 && arg1[var4 + var5 - 1 - 36] != 0) {
                    arg1[var5 + var4] = arg2;
                }
            }
        }
        if (arg0 != 36) {
            method2246(-127, -84, 59, -35, 63, -68, 95);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)V", line = 56)
    public static final void method2246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class137 var7 = new class137();
        var7.field2176 = arg1 >> 7;
        var7.field2198 = arg2 >> 7;
        var7.field2196 = arg3 >> 7;
        var7.field2183 = arg4 >> 7;
        var7.field2199 = arg0;
        var7.field2193 = arg1;
        var7.field2186 = arg2;
        var7.field2177 = arg3;
        var7.field2191 = arg4;
        var7.field2187 = arg5;
        var7.field2194 = arg6;
        class26.field382[class243.field3540++] = var7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V", line = 71)
    public static final void method2247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4968++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg5 != -28664) {
            field4967 = 75;
        }
        int var20 = (arg2 - 1) * var15;
        class47.method379(arg0 + arg4, (byte) 103, arg1, class286.field4283[arg3], arg0 - arg4);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class47.method379(var23, (byte) 98, arg1, class286.field4283[var21], var24);
            class47.method379(var23, (byte) 120, arg1, class286.field4283[var22], var24);
        }
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)V", line = 153)
    public static void method2248(int arg0) {
        if (arg0 >= -38) {
            method2245((byte) -63, (int[]) null, -125);
        }
        field4977 = null;
        field4969 = null;
        field4966 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 174)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg1 != 47) {
            this.method53((byte) 54);
        }
        field4976++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)Z", line = 190)
    public final boolean method53(byte arg0) {
        field4970++;
        if (arg0 <= 58) {
            field4966 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIII)V", line = 202)
    public class350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4978 = arg5;
        this.field4972 = arg1;
        this.field4973 = arg3;
        this.field4975 = arg2;
        this.field4974 = arg6;
        this.field4980 = arg0;
        this.field4979 = arg4;
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)I")
    public abstract int method1457(int arg0);
}
