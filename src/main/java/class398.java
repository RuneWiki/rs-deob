import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class398 extends class45 {

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Z")
    public boolean field5931;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[Lfa;")
    public class398[] field5936;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field5921 = 0;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lcr;")
    public static class189 field5926 = new class189(50);

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
    public static int[] field5938 = new int[1024];

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Ljava/lang/String;")
    public static String field5937 = "K";

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field5939 = 0;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field5918;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Lol;")
    public class335 field5933;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Lwb;")
    public class42 field5927;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljava/awt/Image;")
    public static Image field5925;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 8)
    public void method209(int arg0) {
        if (arg0 == 16) {
            field5930++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)[I", line = 19)
    public final int[] method2558(int arg0, int arg1, int arg2) {
        if (arg1 != 29295) {
            method2559(-121, false, 90, -82, -12, -28, -91, 0.035508808F, -52);
        }
        field5924++;
        return this.field5936[arg0].field5931 ? this.field5936[arg0].method95(arg2, 0) : this.field5936[arg0].method99(arg2, arg1 - 29293)[0];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIIIIIFI)[[I", line = 44)
    public static final int[][] method2559(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8) {
        field5935++;
        int[][] var9 = new int[arg4][arg0];
        class385 var10 = new class385();
        var10.field5582 = arg3;
        var10.field5569 = arg8;
        var10.field5576 = arg6;
        var10.field5584 = arg1;
        var10.field5579 = (int) (arg7 * 4096.0F);
        var10.method209(16);
        int var11 = -128 / ((36 - arg5) / 32);
        class226.method1308((byte) -126, arg0, arg4);
        for (int var12 = 0; var12 < arg4; var12++) {
            var10.method2480(255, var9[var12], var12);
        }
        return var9;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V", line = 78)
    public static final void method2560(int arg0, int arg1, byte arg2) {
        field5919++;
        class56 var3 = new class56(16);
        for (class38 var4 = (class38) class200.field2656.method389(0); var4 != null; var4 = (class38) class200.field2656.method388(0)) {
            var4.method322(11);
            int var6 = (int) (var4.field640 >> 28);
            int var7 = (int) (var4.field640 >> 14 & 0x3FFFL) - arg1;
            int var8 = (int) (var4.field640 & 0x3FFFL) - arg0;
            if (var8 >= 0 && var7 >= 0 && var8 < class192.field2574 && class364.field5262 > var7) {
                var3.method381(true, var4, (long) (var7 << 14 | var6 << 28 | var8));
            }
        }
        int var5 = 5 / ((-arg2 - 6) / 62);
        class200.field2656 = var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I", line = 112)
    public int[] method95(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field5918 = 18;
        }
        field5923++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I", line = 125)
    public int method2476(byte arg0) {
        field5928++;
        if (arg0 != -21) {
            this.field5931 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)[[I", line = 136)
    public final int[][] method2561(int arg0, byte arg1, int arg2) {
        field5915++;
        if (arg1 > -53) {
            this.method2561(6, (byte) -85, 121);
        }
        if (this.field5936[arg2].field5931) {
            int[] var4 = this.field5936[arg2].method95(arg0, 0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5936[arg2].method99(arg0, 2);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 169)
    public static final void method2562(boolean arg0) {
        field5929++;
        class178 var1 = class212.field2835;
        synchronized (class212.field2835) {
            if (!arg0) {
                field5921 = -33;
            }
            class212.field2835.method1083(0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)I", line = 188)
    public int method1279(boolean arg0) {
        field5932++;
        if (arg0) {
            this.method2476((byte) 20);
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V", line = 202)
    public void method1274(int arg0, int arg1, int arg2) {
        field5917++;
        int var4 = ~this.field5918 == arg2 ? arg1 : this.field5918;
        if (this.field5931) {
            this.field5927 = new class42(var4, arg1, arg0);
        } else {
            this.field5933 = new class335(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I", line = 223)
    public int[][] method99(int arg0, int arg1) {
        field5922++;
        if (arg1 == 2) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 234)
    public void method1273(int arg0) {
        field5934++;
        if (arg0 >= -31) {
            return;
        }
        if (this.field5931) {
            this.field5927.method302((byte) -97);
            this.field5927 = null;
        } else {
            this.field5933.method2207(false);
            this.field5933 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V", line = 261)
    public static final void method2563(int arg0, byte arg1) {
        class434.field6383 = arg0;
        field5920++;
        if (arg1 != 67) {
            method2559(-124, true, 111, -122, -74, 114, -76, 1.5521742F, 36);
        }
        class403.field5996.method1141(256);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lnj;II)V", line = 281)
    public void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 == -13132) {
            field5916++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IZ)V", line = 299)
    public class398(int arg0, boolean arg1) {
        this.field5931 = arg1;
        this.field5936 = new class398[arg0];
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V", line = 317)
    public static void method2564(int arg0) {
        if (arg0 != 0) {
            field5938 = null;
        }
        field5937 = null;
        field5925 = null;
        field5926 = null;
        field5938 = null;
    }
}
