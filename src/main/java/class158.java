import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class158 {

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "J")
    public long field2400 = 0L;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lfc;")
    public class110 field2398;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lfc;")
    public class110 field2402;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[[[B")
    public static byte[][][] field2408;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([I[IIII)V", line = 18)
    public static final void method1184(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 > arg2) {
            int var5 = arg2;
            int var6 = (arg2 + arg4) / 2;
            int var7 = arg1[var6];
            arg1[var6] = arg1[arg4];
            arg1[arg4] = var7;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (arg1[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg1[arg4] = arg1[var5];
            arg1[var5] = var7;
            arg0[arg4] = arg0[var5];
            arg0[var5] = var8;
            method1184(arg0, arg1, arg2, 7313, var5 - 1);
            method1184(arg0, arg1, var5 + 1, 7313, arg4);
        }
        field2395++;
        if (arg3 != 7313) {
            method1189(-27);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 72)
    public static void method1185(int arg0) {
        field2408 = (byte[][][]) null;
        if (arg0 != -22433) {
            field2408 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZC)Z", line = 89)
    public static final boolean method1186(boolean arg0, char arg1) {
        field2405++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class181.field2872;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)I", line = 127)
    public static final int method1187(byte arg0, int arg1) {
        field2399++;
        if (arg0 != -31) {
            field2408 = (byte[][][]) ((byte[][][]) null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lrj;", line = 142)
    public static final class269 method1188(int arg0) {
        field2397++;
        int var1 = class209.field3191[0] * class133.field2028[0];
        byte[] var2 = class220.field3362[0];
        int[] var3 = new int[var1];
        for (int var4 = arg0; var4 < var1; var4++) {
            var3[var4] = class82.field1212[class149.method1117(var2[var4], 255)];
        }
        class269 var5;
        if (class73.field1058) {
            var5 = new class44(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], var3);
        } else {
            var5 = new class195(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], var3);
        }
        class245.method1684(255);
        return var5;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V", line = 170)
    public static final void method1189(int arg0) {
        field2403++;
        if (class152.field2308 == 10 && class73.field1058) {
            class101.method758(126, 28);
        }
        if (~class152.field2308 == arg0) {
            class101.method758(126, 25);
        }
    }
}
