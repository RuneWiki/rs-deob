import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class434 extends class262 {

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public int field6165 = -1;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public int field6172 = -1;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lub;")
    public static class18 field6164 = new class18();

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
    public static int[] field6168 = new int[5];

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "[Lwv;")
    public static class26[] field6167 = new class26[2048];

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "[[I")
    public static int[][] field6173 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public int field6163;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public int field6166;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public int field6170;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public int field6174;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Ljj;")
    public static class76 field6169;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V", line = 3)
    public static void method2540(byte arg0) {
        field6164 = null;
        field6168 = null;
        field6167 = null;
        if (arg0 != 73) {
            method2540((byte) 38);
        }
        field6169 = null;
        field6173 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2541(int arg0) {
        ++field6171;
        class110.method809(-128, (long) class163.field2065, class33.field416);
        if (~class277.field3510 != 0) {
            class200.method1266(3568, class277.field3510);
        }
        for (int var1 = 0; ~var1 > ~class65.field840; ++var1) {
            if (class229.field2928[var1]) {
                class324.field4108[var1] = true;
            }
            class508.field7311[var1] = class229.field2928[var1];
            class229.field2928[var1] = false;
        }
        class500.field7236 = class163.field2065;
        if (class33.field416.method322()) {
            class325.field4123 = true;
        }
        if (~class277.field3510 != 0) {
            class65.field840 = 0;
            class511.method3052(-122);
        }
        class33.field416.method318();
        class513.method3061(-112, class33.field416);
        int var2 = class298.method1761(3);
        if (var2 == -1) {
            var2 = class236.field3000;
        }
        if (~var2 == 0) {
            var2 = class298.field3838;
        }
        if (arg0 != 5) {
            field6168 = null;
        }
        class329.method1915((byte) 99, var2);
        class250.field3207 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLya;)Llo;", line = 71)
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field6160;
        if (!arg0) {
            method2540((byte) -62);
        }
        class123 var3 = arg1.method369();
        var3.method229(super.field3316, super.field3311, super.field3308);
        class531 var4 = class119.method850(3, 39);
        if (~this.field6165 != 0) {
            class474 var5 = class376.field4949.method624((byte) -127, this.field6165).method49((byte) 20, arg1, 0, 2048, -1, (class415) null, 0, (class442) null, this.field6170);
            if (var5 != null) {
                var5.method415(var3, var4.field7810[2], 0);
            }
        }
        if (this.field6172 != -1) {
            class474 var6 = class376.field4949.method624((byte) -113, this.field6172).method49((byte) 20, arg1, 0, 2048, -1, (class415) null, 0, (class442) null, this.field6166);
            if (var6 != null) {
                var6.method415(var3, var4.field7810[1], 0);
            }
        }
        class474 var7 = class376.field4949.method624((byte) -122, this.field6174).method49((byte) 20, arg1, 0, 2048, -1, (class415) null, 0, (class442) null, this.field6163);
        if (var7 != null) {
            var7.method415(var3, var4.field7810[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lya;I)V", line = 116)
    public final void method192(class38 arg0, int arg1) {
        if (arg1 != 1) {
            field6167 = null;
        }
        ++field6161;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILya;II)Z", line = 127)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field6159;
        class123 var5 = arg1.method369();
        var5.method229(super.field3316, super.field3311, super.field3308);
        class474 var6 = class376.field4949.method624((byte) -123, this.field6174).method49((byte) 20, arg1, 0, 131072, -1, (class415) null, 0, (class442) null, this.field6163);
        if (var6 != null && var6.method412(arg2, arg3, var5, true)) {
            return true;
        } else {
            if (~this.field6172 != 0) {
                class474 var7 = class376.field4949.method624((byte) -121, this.field6172).method49((byte) 20, arg1, 0, 131072, -1, (class415) null, 0, (class442) null, this.field6166);
                if (var7 != null && var7.method412(arg2, arg3, var5, true)) {
                    return true;
                }
            }
            if (this.field6165 != -1) {
                class474 var8 = class376.field4949.method624((byte) -124, this.field6165).method49((byte) 20, arg1, 0, 131072, -1, (class415) null, 0, (class442) null, this.field6170);
                if (var8 != null && var8.method412(arg2, arg3, var5, true)) {
                    return true;
                }
            }
            if (arg0 < 66) {
                this.field6172 = 48;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ltg;Z)V", line = 169)
    public static final void method2542(class155 arg0, boolean arg1) {
        class49.field643 = arg0;
        if (!arg1) {
            method2541(25);
        }
        ++field6162;
    }
}
