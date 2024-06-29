import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class178 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Z")
    public static boolean field2680 = true;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lnk;")
    public static class16 field2675;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2678;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lld;", line = 6)
    public static final class140 method1229(int arg0, int arg1) {
        field2679++;
        class140 var2 = (class140) class16.field199.method380(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class346.field5486.method100(class298.method2107(0, arg0), class58.method348((byte) 116, arg0), (byte) -107);
        class140 var4 = new class140();
        var4.field2094 = arg0;
        if (var3 != null) {
            var4.method956(new class143(var3), (byte) 86);
        }
        var4.method968((byte) 112);
        if (arg1 != 8) {
            method1233(true, (class238) null, 84);
        }
        class16.field199.method377((long) arg0, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILlf;[B)V", line = 36)
    public final void method1230(int arg0, class143 arg1, byte[] arg2) {
        field2676++;
        if (arg1.field2260[arg1.field2295] != 31 || arg1.field2260[arg1.field2295 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2678 == null) {
            this.field2678 = new Inflater(true);
        }
        try {
            this.field2678.setInput(arg1.field2260, arg1.field2295 + 10, arg0 - (8 - arg1.field2260.length + arg1.field2295));
            this.field2678.inflate(arg2);
        } catch (Exception var5) {
            this.field2678.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2678.reset();
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIBI[[II)I", line = 60)
    public static final int method1231(int arg0, int arg1, byte arg2, int arg3, int[][] arg4, int arg5) {
        field2681++;
        int var6 = (128 - arg3) * arg4[arg0][arg1] + arg4[arg0 + 1][arg1] * arg3 >> 7;
        int var7 = (128 - arg3) * arg4[arg0][arg1 + 1] + arg4[arg0 + 1][arg1 + 1] * arg3 >> 7;
        if (arg2 != -92) {
            field2675 = (class16) null;
        }
        return (128 - arg5) * var6 + (arg5 * var7) >> 7;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 74)
    public class178() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 80)
    public static void method1232(byte arg0) {
        field2675 = null;
        if (arg0 >= -55) {
            method1231(126, -53, (byte) -118, 69, (int[][]) ((int[][]) null), 99);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLqn;I)V", line = 92)
    public static final void method1233(boolean arg0, class238 arg1, int arg2) {
        field2677++;
        int var3 = arg1.field3658;
        int var4 = (int) arg1.field2834;
        arg1.method1290(-60);
        int var5 = -33 % ((arg2 + 33) / 63);
        if (arg0) {
            class315.method2224((byte) -126, var3);
        }
        class305.method2147((byte) -29, var3);
        class323 var6 = class45.method277(-12866, var4);
        if (var6 != null) {
            class107.method693(var6, 6);
        }
        int var7 = class74.field924;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class191.method1304(-4378, class105.field1442[var8])) {
                class108.method694(var8, false);
            }
        }
        if (class74.field924 == 1) {
            class38.field437 = false;
            class181.method1251(class151.field2399, class357.field5669, false, class257.field4073, class251.field3977);
        } else {
            class181.method1251(class151.field2399, class357.field5669, false, class257.field4073, class251.field3977);
            int var9 = class93.field1233.method1692(class110.field1513);
            for (int var10 = 0; var10 < class74.field924; var10++) {
                int var11 = class93.field1233.method1692(class2.method14(var10, true));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class251.field3977 = class74.field924 * 15 + (class161.field2481 ? 26 : 22);
            class257.field4073 = var9 + 8;
        }
        if (class345.field5482 != -1) {
            class106.method688((byte) -24, 1, class345.field5482);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(III)V", line = 163)
    private class178(int arg0, int arg1, int arg2) {
    }
}
