import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class258 extends class203 {

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Lmh;")
    public static class62 field4341 = class201.method1405(true, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lwa;")
    public static class291 field4348 = new class291();

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Lhi;")
    public static class26 field4344;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "[I")
    private int[] field4345;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
    public int[] field4350;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "[Lmh;")
    private class62[] field4358;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[[I")
    private int[][] field4349;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I", line = 23)
    public final int method1791(int arg0, int arg1) {
        field4342++;
        if (this.field4345 == null || arg0 < 0 || this.field4345.length < arg0) {
            return -1;
        } else {
            int var3 = -77 / ((arg1 - 52) / 52);
            return this.field4345[arg0];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILmi;)V", line = 50)
    public final void method1792(int arg0, class92 arg1) {
        if (arg0 != 1) {
            return;
        }
        field4343++;
        while (true) {
            int var3 = arg1.method702(arg0 - 2);
            if (var3 == 0) {
                return;
            }
            this.method1797(arg1, 94, var3);
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(B)I", line = 73)
    public final int method1793(byte arg0) {
        int var2 = -27 % ((arg0 - 45) / 45);
        field4356++;
        return this.field4345 == null ? 0 : this.field4345.length;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLmi;)Lmh;", line = 93)
    public final class62 method1794(byte arg0, class92 arg1) {
        field4346++;
        if (arg0 != -34) {
            field4351 = 116;
        }
        class62 var3 = class296.method2005(80, -1757618132);
        if (this.field4345 != null) {
            for (int var4 = 0; var4 < this.field4345.length; var4++) {
                var3.method403(this.field4358[var4], false);
                var3.method403(class31.method204(56, this.field4345[var4], this.field4349[var4], arg1.method719((byte) -42, class63.field955[this.field4345[var4]])), false);
            }
        }
        var3.method403(this.field4358[this.field4358.length - 1], false);
        return var3.method434(-72);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V", line = 128)
    public static final void method1795(int arg0, int arg1, int arg2) {
        field4347++;
        class297 var3 = class35.method230(arg2, arg0 ^ 0xFFFFD3F2);
        int var4 = var3.field5064;
        int var5 = var3.field5069;
        int var6 = var3.field5066;
        int var7 = class218.field3751[var6 - var5];
        if (arg0 != 11370) {
            field4354 = -107;
        }
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class36.method236(var4, 120, arg1 << var5 & var8 | ~var8 & class222.field3877[var4]);
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(B)V", line = 157)
    public final void method1796(byte arg0) {
        if (arg0 > -103) {
            this.method1796((byte) -112);
        }
        if (this.field4350 != null) {
            for (int var2 = 0; var2 < this.field4350.length; var2++) {
                this.field4350[var2] = class270.method1854(this.field4350[var2], 32768);
            }
        }
        field4353++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmi;II)V", line = 180)
    private final void method1797(class92 arg0, int arg1, int arg2) {
        if (arg1 <= 36) {
            return;
        }
        field4357++;
        if (arg2 == 1) {
            this.field4358 = arg0.method696((byte) -97).method420((byte) 21, 60);
        } else if (arg2 == 2) {
            int var4 = arg0.method702(-1);
            this.field4350 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4350[var5] = arg0.method721(96);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method702(-1);
            this.field4349 = new int[var6][];
            this.field4345 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method721(39);
                this.field4345[var7] = var8;
                this.field4349[var7] = new int[class150.field2365[var8]];
                for (int var9 = 0; var9 < class150.field2365[var8]; var9++) {
                    this.field4349[var7][var9] = arg0.method721(94);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmi;I[I)V", line = 242)
    public final void method1798(class92 arg0, int arg1, int[] arg2) {
        field4355++;
        if (this.field4345 == null) {
            return;
        }
        for (int var4 = 0; this.field4345.length > var4 && var4 < arg2.length; var4++) {
            int var5 = class306.field5254[this.method1791(var4, 114)];
            if (var5 > 0) {
                arg0.method749(122, (long) arg2[var4], var5);
            }
        }
        if (arg1 != -1) {
            this.method1792(-58, (class92) null);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(III)I", line = 276)
    public final int method1799(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field4350 = (int[]) null;
        }
        field4359++;
        if (this.field4345 == null || arg0 < 0 || this.field4345.length < arg0) {
            return -1;
        } else if (this.field4349[arg0] == null || arg2 < 0 || arg2 > this.field4349[arg0].length) {
            return -1;
        } else {
            return this.field4349[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(B)V", line = 294)
    public static void method1800(byte arg0) {
        field4341 = null;
        if (arg0 != 18) {
            field4351 = 116;
        }
        field4348 = null;
        field4344 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lmh;", line = 312)
    public final class62 method1801(int arg0) {
        field4352++;
        class62 var2 = class296.method2005(80, arg0 ^ 0x973CE02D);
        if (this.field4358 == null) {
            return class267.field4505;
        }
        var2.method403(this.field4358[0], false);
        for (int var3 = arg0; var3 < this.field4358.length; var3++) {
            var2.method403(class111.field1797, false);
            var2.method403(this.field4358[var3], false);
        }
        return var2.method434(-59);
    }
}
