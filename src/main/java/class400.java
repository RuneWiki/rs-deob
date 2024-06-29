import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class400 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    private int field5799 = 0;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    private int field5818 = -1;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lvn;")
    private class169 field5803 = new class169();

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
    public boolean field5819 = false;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field5800;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    private int field5814;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[I")
    private int[][][] field5802;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[Lpg;")
    private class435[] field5804;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Z")
    public static boolean field5811 = false;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public static int[] field5801 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Z")
    public static boolean field5808 = false;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Z")
    public static boolean field5815 = false;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field5805 = 0;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5813 = "";

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method2530(int arg0, byte arg1) {
        field5810++;
        if (arg1 <= 90) {
            field5808 = false;
        }
        if (this.field5814 == this.field5800) {
            this.field5819 = this.field5804[arg0] == null;
            this.field5804[arg0] = class135.field1898;
            return this.field5802[arg0];
        } else if (this.field5800 == 1) {
            this.field5819 = this.field5818 != arg0;
            this.field5818 = arg0;
            return this.field5802[0];
        } else {
            class435 var3 = this.field5804[arg0];
            if (var3 == null) {
                this.field5819 = true;
                if (this.field5799 < this.field5800) {
                    var3 = new class435(arg0, this.field5799);
                    this.field5799++;
                } else {
                    class435 var4 = (class435) this.field5803.method1117((byte) -116);
                    var3 = new class435(arg0, var4.field6381);
                    this.field5804[var4.field6374] = null;
                    var4.method2290((byte) 98);
                }
                this.field5804[arg0] = var3;
            } else {
                this.field5819 = false;
            }
            this.field5803.method1123((byte) 126, var3);
            return this.field5802[var3.field6381];
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 74)
    public static final void method2531(String arg0, byte arg1) {
        int var2 = 114 % ((8 - arg1) / 33);
        if (class133.field1857 == null) {
            class45.method288((byte) 116);
        }
        field5812++;
        String[] var3 = class112.method617('\n', arg0, 16777215);
        for (int var4 = 0; var4 < var3.length; var4++) {
            for (int var5 = class133.field1857.length - 1; var5 > 0; var5--) {
                class133.field1857[var5] = class133.field1857[var5 - 1];
            }
            class133.field1857[0] = var3[var4];
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 109)
    public static void method2532(int arg0) {
        field5801 = null;
        if (arg0 == -13064) {
            field5813 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)[[[I", line = 122)
    public final int[][][] method2533(int arg0) {
        field5806++;
        if (this.field5814 != this.field5800) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field5800; var2++) {
            this.field5804[var2] = class135.field1898;
        }
        return this.field5802;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 146)
    public static final void method2534(int arg0) {
        field5809++;
        class147.field2063 = new class169();
        if (arg0 != -30687) {
            field5815 = true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 167)
    public final void method2535(byte arg0) {
        field5817++;
        int var2 = 0;
        if (arg0 != 61) {
            method2531((String) null, (byte) -17);
        }
        while (this.field5800 > var2) {
            this.field5802[var2][0] = null;
            this.field5802[var2][1] = null;
            this.field5802[var2][2] = null;
            this.field5802[var2] = null;
            var2++;
        }
        this.field5804 = null;
        this.field5802 = null;
        this.field5803.method1116((byte) -127);
        this.field5803 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V", line = 275)
    public class400(int arg0, int arg1, int arg2) {
        this.field5800 = arg0;
        this.field5814 = arg1;
        this.field5802 = new int[this.field5800][3][arg2];
        this.field5804 = new class435[this.field5814];
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V", line = 218)
    public static final void method2536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 64) {
            field5815 = false;
        }
        field5807++;
        class41.field465 = arg2;
        class26.field256 = arg0;
        class180.field2474 = arg3;
        class188.field2548 = arg1;
        class269.field3784 = arg4;
        if (class180.field2474 >= 100) {
            int var6 = class188.field2548 * 128 + 64;
            int var7 = class269.field3784 * 128 + 64;
            int var8 = class372.method2335(var7, class410.field5931, (byte) 26, var6) - class41.field465;
            int var9 = var6 - class272.field3853;
            int var10 = var8 - class164.field2289;
            int var11 = var7 - class272.field3852;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class314.field4472 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class77.field869 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class314.field4472 < 1024) {
                class314.field4472 = 1024;
            }
            if (class314.field4472 > 3072) {
                class314.field4472 = 3072;
            }
        }
        class231.field3128 = 2;
    }
}
