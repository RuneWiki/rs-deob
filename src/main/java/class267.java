import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class267 extends class159 {

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[S")
    public static short[] field4394 = new short[256];

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field4402 = new String[1000];

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lte;")
    public static class293 field4400;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
    public static int[] field4388;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "[I")
    public int[] field4391;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
    public int[] field4395;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
    public int[] field4398;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "[Lsc;")
    public class158[] field4390;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[Lsc;")
    public class158[] field4396;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[[[B")
    public byte[][][] field4399;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1882(int arg0, int arg1) {
        field4403++;
        int var2 = 0;
        if (arg0 < arg1 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Lof;", line = 62)
    public static final class296 method1883(byte arg0, int arg1) {
        class296 var2 = (class296) class83.field1190.method1539(-72, (long) arg1);
        field4392++;
        int var3 = -116 / ((arg0 - 17) / 45);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class30.field458.method1504(arg1, true, 26);
        class296 var5 = new class296();
        if (var4 != null) {
            var5.method2095(-69, new class313(var4));
        }
        class83.field1190.method1538(-124, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 87)
    public static final String method1884(int arg0, long arg1) {
        field4393++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class147.field2375[(int) (var7 - (arg1 * 37L))]);
            }
            if (arg0 != -65537) {
                field4388 = (int[]) null;
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V", line = 132)
    public static void method1885(int arg0) {
        if (arg0 != 1000) {
            method1884(70, 33L);
        }
        field4400 = null;
        field4402 = null;
        field4394 = null;
        field4388 = null;
    }
}
