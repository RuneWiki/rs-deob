import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class3 extends class28 {

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Z")
    public volatile boolean field20 = true;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[J")
    public static long[] field22;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Z")
    public boolean field18;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Z")
    public boolean field19;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "[Lxa;")
    public static class511[] field25;

    static {
        new class101("", 73);
        field22 = new long[32];
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 5)
    public static final void method9(long[] arg0, Object[] arg1, int arg2) {
        class473.method2617((byte) 51, 0, arg0, arg0.length - 1, arg1);
        field16++;
        if (arg2 != 5595) {
            field25 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BZ)Ljk;", line = 19)
    public static final class705 method10(byte[] arg0, boolean arg1) {
        field17++;
        class705 var2 = new class705();
        class418 var3 = new class418(arg0);
        var3.field5367 = var3.field5393.length - 2;
        int var4 = var3.method2393(-30727);
        int var5 = var3.field5393.length - var4 - 2 - 12;
        var3.field5367 = var5;
        int var6 = var3.method2355(118);
        var2.field9814 = var3.method2393(-30727);
        var2.field9818 = var3.method2393(-30727);
        var2.field9817 = var3.method2393(-30727);
        var2.field9824 = var3.method2393(-30727);
        int var7 = var3.method2396(43);
        if (var7 > 0) {
            var2.field9823 = new class9[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2393(-30727);
                class9 var10 = new class9(class426.method2447(var9, 250));
                var2.field9823[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2355(34);
                    int var12 = var3.method2355(56);
                    var10.method38(new class195(var12), -7, (long) var11);
                }
            }
        }
        if (arg1) {
            return null;
        }
        var3.field5367 = 0;
        var2.field9820 = var3.method2370(0);
        var2.field9812 = new int[var6];
        var2.field9816 = new int[var6];
        var2.field9819 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field5367) {
            int var14 = var3.method2393(-30727);
            if (var14 == 3) {
                var2.field9819[var13] = var3.method2394(4).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field9816[var13] = var3.method2396(-123);
            } else {
                var2.field9816[var13] = var3.method2355(34);
            }
            var2.field9812[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V", line = 110)
    public static void method12(byte arg0) {
        int var1 = 74 / ((58 - arg0) / 58);
        field22 = null;
        field25 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLsa;Loa;II)V", line = 120)
    public static final void method13(int arg0, boolean arg1, class698 arg2, class43 arg3, int arg4, int arg5) {
        field24++;
        class631 var6 = class414.field5331.method2890((byte) 72, arg2.field9621);
        if (var6.field8803 == -1) {
            return;
        }
        int var7;
        if (arg2.field9666) {
            int var8 = arg2.field9595 + arg5;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class511 var9 = var6.method3503(arg3, (byte) -48, arg2.field9620, var7);
        if (var9 == null || arg1) {
            return;
        }
        int var10 = arg2.field9589;
        int var11 = arg2.field9654;
        if ((var7 & 0x1) == 1) {
            var11 = arg2.field9589;
            var10 = arg2.field9654;
        }
        int var12 = var9.method602();
        int var13 = var9.method595();
        if (var6.field8793) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field8797 == 0) {
            var9.method2754(arg0, arg4 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method604(arg0, arg4 + 4 - (var11 * 4), var12, var13, 0, var6.field8797 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)[B")
    public abstract byte[] method8(byte arg0);

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)I")
    public abstract int method11(int arg0);
}
