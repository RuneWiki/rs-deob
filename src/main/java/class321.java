import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class321 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public int field4230 = 0;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field4232 = 0;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Lmq;")
    private class472 field4235 = new class472(64);

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "Lfo;")
    private class481 field4237 = null;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljn;")
    private class668 field4229;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Ljn;")
    private class668 field4233;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Ljk;")
    public static class585 field4227 = new class585(10, 3);

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "[I")
    public static int[] field4236 = new int[14];

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "[[[J")
    public static long[][][] field4226;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZIJI)Ljava/lang/String;", line = 3)
    public static final String method1866(int arg0, boolean arg1, int arg2, long arg3, int arg4) {
        field4228++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        if (arg0 != -28555) {
            method1866(-37, true, 56, -75L, 44);
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(JI[ILgfa;)Ljava/lang/String;", line = 83)
    public final String method1867(long arg0, int arg1, int[] arg2, class696 arg3) {
        field4231++;
        if (this.field4237 != null) {
            String var6 = this.field4237.method2813((byte) 101, arg2, arg3, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg1 != 3) {
            this.method1867(46L, -54, null, null);
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 107)
    public static void method1868(byte arg0) {
        if (arg0 > -14) {
            field4227 = null;
        }
        field4236 = null;
        field4227 = null;
        field4226 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Ljc;", line = 123)
    public final class406 method1869(int arg0, int arg1) {
        if (arg1 >= -78) {
            return null;
        }
        field4234++;
        class406 var3 = (class406) this.field4235.method2766(-125, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field4233.method3800(arg0, 1, (byte) -92);
        } else {
            var4 = this.field4229.method3800(arg0 & 0x7FFF, 1, (byte) -92);
        }
        class406 var5 = new class406();
        var5.field5752 = this;
        if (var4 != null) {
            var5.method2454(new class389(var4), 91);
        }
        if (arg0 >= 32768) {
            var5.method2461((byte) 98);
        }
        this.field4235.method2772(var5, true, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILjn;Ljn;Lfo;)V", line = 182)
    public class321(int arg0, class668 arg1, class668 arg2, class481 arg3) {
        this.field4237 = arg3;
        this.field4229 = arg2;
        this.field4233 = arg1;
        if (this.field4233 != null) {
            this.field4230 = this.field4233.method3805(1, false);
        }
        if (this.field4229 != null) {
            this.field4232 = this.field4229.method3805(1, false);
        }
    }
}
