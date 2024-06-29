import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class71 {

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Ljv;")
    private class55 field1234 = new class55(256);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lvj;")
    private class303 field1230;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Lm;")
    private class126 field1240;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "Liv;")
    public static class64 field1239 = new class64(12, 6);

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "[[I")
    public static int[][] field1241 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1242 = 0;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 4)
    public final void method579(int arg0) {
        this.field1234.method488(-3);
        if (arg0 == 7) {
            field1233++;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IFFIIILgi;FIIF[BIF)V", line = 15)
    public static final void method580(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, class477 arg6, float arg7, int arg8, int arg9, float arg10, byte[] arg11, int arg12, float arg13) {
        field1236++;
        int var14 = arg4 * arg9;
        float[] var15 = new float[var14];
        int var16 = 82 % ((45 - arg3) / 62);
        for (int var17 = 0; var17 < arg5; var17++) {
            arg6.method2503(arg7 * 127.0F, arg0, arg2 / (float) arg8, arg1 / (float) arg9, var15, arg4, 0, 976, arg13 / (float) arg4, arg9, arg8);
            int var20 = arg12;
            arg7 *= arg10;
            arg1 *= 2.0F;
            for (int var21 = 0; var21 < var14; var21++) {
                arg11[var20] = (byte) ((int) ((float) arg11[var20] + var15[var21]));
                var20++;
            }
            arg2 *= 2.0F;
            arg13 *= 2.0F;
        }
        int var18 = arg12;
        for (int var19 = 0; var19 < var14; var19++) {
            arg11[var18] = (byte) (arg11[var18] + 127);
            var18++;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 66)
    public static void method581(byte arg0) {
        field1241 = null;
        if (arg0 != 75) {
            field1242 = 99;
        }
        field1239 = null;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V", line = 77)
    public static final void method582(byte arg0) {
        field1232++;
        if (!class1.field1) {
            return;
        }
        int var1 = -4 % ((arg0 - 69) / 32);
        while (true) {
            while (class305.field4650 < class403.field6057.length) {
                class89 var2 = class403.field6057[class305.field4650];
                if (var2 != null && var2.field1556 == -1) {
                    if (class261.field3797 == null) {
                        class261.field3797 = class390.field5892.method2755(var2.field1550, (byte) -63);
                    }
                    int var3 = class261.field3797.field7074;
                    if (var3 == -1) {
                        return;
                    }
                    var2.field1556 = var3;
                    class261.field3797 = null;
                    class305.field4650++;
                } else {
                    class305.field4650++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(JI)V", line = 119)
    public static final void method583(long arg0, int arg1) {
        field1237++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = -39 % ((arg1 + 28) / 54);
        if ((arg0 % 10L) == 0L) {
            class174.method1254(arg0 - 1L, -13939);
            class174.method1254(1L, -13939);
        } else {
            class174.method1254(arg0, -13939);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)Lmf;", line = 140)
    public final class286 method584(int arg0, byte arg1) {
        int var3 = 27 / ((33 - arg1) / 34);
        field1231++;
        Object var4 = this.field1234.method494(0, (long) arg0);
        if (var4 != null) {
            return (class286) var4;
        } else if (this.field1240.method959(arg0, (byte) 94)) {
            class83 var5 = this.field1240.method956(-945, arg0);
            int var6 = var5.field1429 ? 64 : this.field1230.field4479;
            class286 var8;
            if (var5.field1443 && this.field1230.method264()) {
                float[] var7 = this.field1240.method960(var6, 0.7F, -21557, false, arg0, var6);
                var8 = new class286(this.field1230, 3553, 34842, var6, var6, var5.field1438 != 0, var7, 6408);
            } else {
                short var9;
                int[] var10;
                if (var5.field1441 && class523.method3113(-123, var5.field1451)) {
                    var9 = 6407;
                    var10 = this.field1240.method958(arg0, var6, var6, true, false, 0.7F);
                } else {
                    var9 = 6408;
                    var10 = this.field1240.method957(false, arg0, var6, 0.7F, var6, 26878);
                }
                var8 = new class286(this.field1230, 3553, var9, var6, var6, var5.field1438 != 0, var10, false);
            }
            var8.method1818(var5.field1437, (byte) 118, var5.field1434);
            this.field1234.method485((long) arg0, (byte) -125, var8);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLpa;)Z", line = 191)
    public static final boolean method585(byte arg0, class248 arg1) {
        field1235++;
        int var2 = -11 / ((53 - arg0) / 42);
        class79 var3 = class319.field4807.method2874(arg1.method17((byte) -12), -17045);
        if (var3.field1349 == -1) {
            return true;
        } else {
            class421 var4 = class397.field5996.method1192(34, var3.field1349);
            return var4.field6289 == -1 ? true : var4.method2543(120);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V", line = 215)
    public final void method586(int arg0) {
        field1238++;
        this.field1234.method493(false, arg0);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lvj;Lm;)V", line = 236)
    public class71(class303 arg0, class126 arg1) {
        this.field1230 = arg0;
        this.field1240 = arg1;
    }
}
