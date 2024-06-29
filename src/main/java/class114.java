import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class114 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lbj;")
    private class430 field1406;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lsga;")
    private class583 field1407;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[S")
    public static short[] field1405;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I", line = 3)
    public final int method768(byte arg0) {
        field1413++;
        if (arg0 <= 0) {
            this.method775(-25, -118);
        }
        return this.field1397;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/Object;JI)V", line = 14)
    public final void method769(int arg0, Object arg1, long arg2, int arg3) {
        field1408++;
        if (this.field1397 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method772(false, arg2);
        this.field1396 -= arg3;
        while (this.field1396 < 0) {
            class16 var7 = (class16) this.field1406.method2566(0);
            this.method780(arg0 ^ 0xFFFFFF80, var7);
        }
        class364 var6 = new class364(arg1, arg3);
        this.field1407.method3249(arg2, var6, (byte) -109);
        this.field1406.method2564(var6, (byte) -123);
        var6.field8700 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I", line = 40)
    public final int method770(int arg0) {
        field1400++;
        int var2 = arg0;
        for (class16 var3 = (class16) this.field1406.method2565((byte) 101); var3 != null; var3 = (class16) this.field1406.method2568(-31355)) {
            if (!var3.method203(arg0 + 119)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 65)
    public static void method771(boolean arg0) {
        if (arg0) {
            field1404 = 109;
        }
        field1405 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZJ)V", line = 81)
    private final void method772(boolean arg0, long arg1) {
        field1409++;
        if (arg0) {
            method771(false);
        }
        class16 var4 = (class16) this.field1407.method3248(arg1, 0);
        this.method780(-128, var4);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 97)
    public final int method773(int arg0) {
        field1402++;
        return arg0 == 1 ? this.field1396 : 3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 110)
    public final void method774(long arg0, int arg1, Object arg2) {
        int var5 = -118 % ((33 - arg1) / 45);
        this.method769(0, arg2, arg0, 1);
        field1414++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 121)
    public final void method775(int arg0, int arg1) {
        field1411++;
        if (class734.field10272 != null) {
            for (class16 var3 = (class16) this.field1406.method2565((byte) 127); var3 != null; var3 = (class16) this.field1406.method2568(-31355)) {
                if (var3.method203(127)) {
                    if (var3.method202(-77) == null) {
                        var3.method3426((byte) -44);
                        var3.method3409(-126);
                        this.field1396 += var3.field226;
                    }
                } else if ((++var3.field8700) > ((long) arg1)) {
                    class16 var4 = class734.field10272.method1220(0, var3);
                    this.field1407.method3249(var3.field8746, var4, (byte) 88);
                    class716.method3975(119, var4, var3);
                    var3.method3426((byte) -37);
                    var3.method3409(-115);
                }
            }
        }
        if (arg0 != 1) {
            this.method781((byte) 34);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 169)
    public final void method776(byte arg0) {
        field1399++;
        int var2 = 80 % ((arg0 - 13) / 38);
        this.field1406.method2563(false);
        this.field1407.method3251(false);
        this.field1396 = this.field1397;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V", line = 220)
    public class114(int arg0, int arg1) {
        this.field1406 = new class430();
        this.field1396 = arg0;
        this.field1397 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field1407 = new class583(var3);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 185)
    public final Object method777(byte arg0) {
        field1403++;
        class16 var2 = (class16) this.field1407.method3252(12938);
        while (var2 != null) {
            Object var3 = var2.method202(49);
            if (var3 != null) {
                return var3;
            }
            class16 var4 = var2;
            var2 = (class16) this.field1407.method3252(12938);
            var4.method3426((byte) -58);
            var4.method3409(-124);
            this.field1396 += var4.field226;
        }
        if (arg0 <= 95) {
            this.method776((byte) 18);
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 237)
    public final Object method778(long arg0, int arg1) {
        field1398++;
        class16 var4 = (class16) this.field1407.method3248(arg0, 0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method202(-62);
        if (var5 == null) {
            var4.method3426((byte) -26);
            var4.method3409(-122);
            this.field1396 += var4.field226;
            return null;
        }
        int var6 = -66 % ((30 - arg1) / 33);
        if (var4.method203(117)) {
            class364 var7 = new class364(var5, var4.field226);
            this.field1407.method3249(var4.field8746, var7, (byte) 89);
            this.field1406.method2564(var7, (byte) -123);
            var7.field8700 = 0L;
            var4.method3426((byte) -87);
            var4.method3409(104);
        } else {
            this.field1406.method2564(var4, (byte) -123);
            var4.field8700 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 280)
    public final Object method779(int arg0) {
        int var2 = 56 % ((arg0 + 78) / 39);
        field1401++;
        class16 var3 = (class16) this.field1407.method3245(false);
        while (var3 != null) {
            Object var4 = var3.method202(-113);
            if (var4 != null) {
                return var4;
            }
            class16 var5 = var3;
            var3 = (class16) this.field1407.method3252(12938);
            var5.method3426((byte) -115);
            var5.method3409(-118);
            this.field1396 += var5.field226;
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILtia;)V", line = 311)
    private final void method780(int arg0, class16 arg1) {
        if (arg0 > -124) {
            this.method776((byte) 14);
        }
        if (arg1 != null) {
            arg1.method3426((byte) -20);
            arg1.method3409(77);
            this.field1396 += arg1.field226;
        }
        field1412++;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V", line = 330)
    public final void method781(byte arg0) {
        field1410++;
        if (arg0 != 47) {
            field1405 = null;
        }
        for (class16 var2 = (class16) this.field1406.method2565((byte) 117); var2 != null; var2 = (class16) this.field1406.method2568(-31355)) {
            if (var2.method203(118)) {
                var2.method3426((byte) -82);
                var2.method3409(-124);
                this.field1396 += var2.field226;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V", line = 355)
    public class114(int arg0) {
        this(arg0, arg0);
    }
}
