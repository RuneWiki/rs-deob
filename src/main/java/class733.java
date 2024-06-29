import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class733 {

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
    private int field10236;

    @OriginalMember(owner = "client!pw", name = "u", descriptor = "I")
    private int field10241;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    private int field10232;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    private int field10230;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public int field10228;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public int field10231;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public int field10221;

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
    public int field10238;

    @OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
    public int field10239;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public int field10229;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "[I")
    public static int[] field10224 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "Z")
    public static boolean field10237 = false;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "Z")
    public static boolean field10233 = false;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Lks;")
    public static class460 field10223 = new class460("", 17);

    @OriginalMember(owner = "client!pw", name = "t", descriptor = "I")
    public static int field10240 = -1;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!pw", name = "v", descriptor = "Lhk;")
    public static class110 field10242;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field10222;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZILjava/io/File;)[B")
    public static final byte[] method4098(boolean arg0, int arg1, File arg2) {
        field10225++;
        if (arg0) {
            return null;
        }
        try {
            byte[] var3 = new byte[arg1];
            class141.method984(-1, arg2, arg1, var3);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIZB)V")
    public static final void method4099(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field10234++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class375.field5410 + ((class228.field3252 - class375.field5410) * var6 / 100);
        if (var7 < class607.field8583) {
            var7 = class607.field8583;
        } else if (class32.field432 < var7) {
            var7 = class32.field432;
        }
        int var8 = arg0 * var7 * 512 / (arg3 * 334);
        if (class372.field5360 > var8) {
            short var9 = class372.field5360;
            var7 = arg3 * 334 * var9 / (arg0 * 512);
            if (var7 > class32.field432) {
                var7 = class32.field432;
                int var10 = arg0 * var7 * 512 / (var9 * 334);
                int var11 = (arg3 - var10) / 2;
                if (arg4) {
                    class638.field8979.method463();
                    class638.field8979.method488(arg2, arg1, -16777216, arg0, 1, var11);
                    class638.field8979.method488(arg2, arg3 + arg1 - var11, -16777216, arg0, 1, var11);
                }
                arg3 -= var11 * 2;
                arg1 += var11;
            }
        } else if (class617.field8705 < var8) {
            short var12 = class617.field8705;
            var7 = arg3 * 334 * var12 / (arg0 * 512);
            if (var7 < class607.field8583) {
                var7 = class607.field8583;
                int var13 = arg3 * 334 * var12 / (var7 * 512);
                int var14 = (arg0 - var13) / 2;
                if (arg4) {
                    class638.field8979.method463();
                    class638.field8979.method488(arg2, arg1, -16777216, var14, 1, arg3);
                    class638.field8979.method488(arg0 + arg2 - var14, arg1, -16777216, var14, 1, arg3);
                }
                arg0 -= var14 * 2;
                arg2 += var14;
            }
        }
        if (arg5 >= -31) {
            field10224 = null;
        }
        class746.field10376 = (short) arg0;
        class202.field2958 = arg2;
        class668.field9397 = (short) arg3;
        class103.field1293 = arg0 * var7 / 334;
        class467.field6635 = arg1;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
    public static void method4100(int arg0) {
        field10242 = null;
        field10222 = null;
        field10224 = null;
        field10223 = null;
        int var1 = -28 / ((arg0 + 76) / 42);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIBIIIIIIII)V")
    public final void method4101(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field10230 = arg1;
        this.field10236 = arg0;
        if (arg2 != 77) {
            return;
        }
        field10235++;
        this.field10232 = arg10 * arg10;
        this.field10241 = arg9;
        this.field10238 = this.field10241 + arg3;
        this.field10239 = this.field10236 + arg7;
        this.field10228 = this.field10236 + arg4;
        this.field10221 = this.field10230 + arg5;
        this.field10231 = this.field10241 + arg6;
        this.field10229 = this.field10230 + arg8;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V")
    public static final void method4102(int arg0, int arg1) {
        field10226++;
        class387 var2 = class211.field3052;
        synchronized (class211.field3052) {
            class211.field3052.method2366(arg0, 106);
        }
        if (arg1 <= -99) {
            class387 var3 = class204.field2986;
            synchronized (class204.field2986) {
                class204.field2986.method2366(arg0, 115);
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIBI)Z")
    public final boolean method4103(int arg0, int arg1, byte arg2, int arg3) {
        field10227++;
        if (this.field10229 > arg0 || arg0 > this.field10221) {
            return false;
        } else if (arg3 < this.field10239 || this.field10228 < arg3) {
            return false;
        } else if (arg1 >= this.field10231 && this.field10238 >= arg1) {
            int var5 = arg0 - this.field10230;
            int var6 = arg1 - this.field10241;
            if (arg2 > -34) {
                this.field10238 = 5;
            }
            return this.field10232 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field10236 = arg1;
        this.field10241 = arg2;
        this.field10232 = arg3 * arg3;
        this.field10230 = arg0;
        this.field10228 = this.field10236 + arg7;
        this.field10231 = this.field10241 + arg8;
        this.field10221 = this.field10230 + arg5;
        this.field10238 = this.field10241 + arg9;
        this.field10239 = this.field10236 + arg6;
        this.field10229 = this.field10230 + arg4;
    }
}
