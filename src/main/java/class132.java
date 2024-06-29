import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class132 {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "[Ldv;")
    public static class616[] field2164 = new class616[14];

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2166;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z[B)[B", line = 7)
    public final byte[] method992(boolean arg0, byte[] arg1) {
        field2165++;
        class335 var3 = new class335(arg1);
        var3.field4619 = arg1.length - 4;
        int var4 = var3.method2039(-126);
        if (arg0) {
            var3.field4619 = 0;
            byte[] var5 = new byte[var4];
            this.method993((byte) -96, var3, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLeh;[B)V", line = 27)
    public final void method993(byte arg0, class335 arg1, byte[] arg2) {
        field2168++;
        if (arg1.field4600[arg1.field4619] != 31 || arg1.field4600[arg1.field4619 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2166 == null) {
            this.field2166 = new Inflater(true);
        }
        try {
            this.field2166.setInput(arg1.field4600, arg1.field4619 + 10, -arg1.field4619 - 10 - (8 - arg1.field4600.length));
            this.field2166.inflate(arg2);
        } catch (Exception var4) {
            this.field2166.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != -96) {
            field2164 = null;
        }
        this.field2166.reset();
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 60)
    public static void method994(byte arg0) {
        field2164 = null;
        if (arg0 != 37) {
            method995(-19, -99, null, 42, (byte) -113, -22, 102);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILoa;IBII)Lba;", line = 71)
    public static final class358 method995(int arg0, int arg1, class651 arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2167++;
        long var7 = (long) arg5;
        class358 var9 = (class358) class48.field690.method3750(var7, false);
        if (arg4 <= 121) {
            field2164 = null;
        }
        short var10 = 2055;
        if (var9 == null) {
            class545 var11 = class590.method3240(class16.field254, arg5, 126, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field7257 < 13) {
                var11.method3027(-256, 2);
            }
            var9 = arg2.method443(var11, var10, class318.field4366, 64, 768);
            class48.field690.method3745(1, var7, var9);
        }
        class358 var12 = var9.method1519((byte) 2, var10, true);
        if (arg6 != 0) {
            var12.method1898(arg6);
        }
        if (arg0 != 0) {
            var12.method1933(arg0);
        }
        if (arg1 != 0) {
            var12.method1904(arg1);
        }
        if (arg3 != 0) {
            var12.method1932(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I", line = 116)
    public static final int method996(int arg0, int arg1) {
        field2170++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = -7 % ((arg1 + 28) / 58);
        int var7 = var5 | var5 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg0 & ~var8;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([JBII[I)V", line = 134)
    public static final void method997(long[] arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        field2169++;
        if (arg1 >= -124) {
            field2164 = null;
        }
        if (arg3 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        int var9 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if (((long) (var11 & var10) + var7) > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var9;
        method997(arg0, (byte) -127, var6 - 1, arg3, arg4);
        method997(arg0, (byte) -126, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 191)
    public class132() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(III)V", line = 199)
    private class132(int arg0, int arg1, int arg2) {
    }
}
