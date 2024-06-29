import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class233 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lfa;")
    private class156 field3424 = new class156(64);

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "Lfs;")
    private class387 field3432;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Z")
    public static boolean field3421 = true;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "[I")
    public static int[] field3426 = new int[6];

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "[B")
    public static byte[] field3423 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[I")
    public static int[] field3422 = new int[14];

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "F")
    public static float field3427;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Lfs;")
    public static class387 field3429;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 4)
    public static void method1561(int arg0) {
        field3423 = null;
        int var1 = 39 / ((arg0 + 1) / 57);
        field3429 = null;
        field3422 = null;
        field3426 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljj;IIIII)V", line = 18)
    public static final void method1562(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1031 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field1034[var6] != null) {
                arg0.field1031++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1031; var7++) {
            long var8 = class270.field3980[arg1][arg2][arg3];
            while (var8 != 0L) {
                class521 var14 = class9.field115[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field1034[var7] == var14.field7653) {
                    continue label50;
                }
            }
            long var10 = class270.field3980[arg1][arg4][arg5];
            while (var10 != 0L) {
                class521 var13 = class9.field115[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field1034[var7] == var13.field7653) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field1031 - 1; var12++) {
                arg0.field1034[var12] = arg0.field1034[var12 + 1];
            }
            arg0.field1031--;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 74)
    public final void method1563(byte arg0) {
        field3428++;
        class156 var2 = this.field3424;
        synchronized (this.field3424) {
            this.field3424.method1105(false);
        }
        if (arg0 <= 81) {
            field3427 = 0.45382535F;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V", line = 87)
    public final void method1564(boolean arg0) {
        class156 var2 = this.field3424;
        synchronized (this.field3424) {
            this.field3424.method1119(85);
        }
        if (arg0) {
            field3422 = null;
        }
        field3431++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V", line = 110)
    public final void method1565(int arg0, int arg1) {
        int var3 = 79 / ((-arg1 - 21) / 43);
        class156 var4 = this.field3424;
        synchronized (this.field3424) {
            this.field3424.method1116(arg0, -50);
        }
        field3430++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmn;", line = 128)
    public static final class247 method1566(Throwable arg0, String arg1) {
        field3420++;
        class247 var2;
        if (arg0 instanceof class247) {
            var2 = (class247) arg0;
            var2.field3664 = var2.field3664 + ' ' + arg1;
        } else {
            var2 = new class247(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ljk;ILfs;)V", line = 154)
    public class233(class446 arg0, int arg1, class387 arg2) {
        this.field3432 = arg2;
        if (this.field3432 != null) {
            this.field3432.method2367(35, 28724);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)Lhv;", line = 177)
    public final class358 method1567(byte arg0, int arg1) {
        field3425++;
        class156 var3 = this.field3424;
        class358 var4;
        synchronized (this.field3424) {
            var4 = (class358) this.field3424.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3432.method2363(arg1, 35, 84);
        class358 var6 = new class358();
        if (var5 != null) {
            var6.method2156((byte) -78, new class65(var5));
        }
        var6.method2153(-64);
        if (arg0 > -55) {
            return null;
        }
        class156 var7 = this.field3424;
        synchronized (this.field3424) {
            this.field3424.method1107(1, (long) arg1, var6);
            return var6;
        }
    }
}
