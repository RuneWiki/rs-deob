import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class168 {

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field2712 = -1;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Z")
    public boolean field2714 = false;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[I")
    private int[] field2727 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Ljg;")
    public static class42 field2718 = new class42(64);

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Ljg;")
    public static class42 field2724 = new class42(16);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[I")
    private int[] field2708;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[S")
    private short[] field2709;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[S")
    private short[] field2715;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[S")
    private short[] field2719;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "[S")
    private short[] field2726;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BB)I")
    public static final int method1252(int arg0, byte[] arg1, byte arg2) {
        if (arg2 != 117) {
            field2718 = null;
        }
        field2713++;
        return class127.method944(arg1, 0, (byte) 119, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static final void method1253(int arg0) {
        field2716++;
        if (arg0 != 0) {
            field2718 = null;
        }
        class150.field2478.method97(arg0 + 70);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Lhl;")
    public final class229 method1254(int arg0) {
        field2722++;
        if (this.field2708 == null) {
            return null;
        }
        class229[] var2 = new class229[this.field2708.length];
        for (int var3 = 0; var3 < this.field2708.length; var3++) {
            var2[var3] = class229.method1644(class200.field3237, this.field2708[var3], 0);
        }
        class229 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class229(var2, var2.length);
        }
        if (arg0 < 97) {
            this.method1257(-14);
        }
        if (this.field2726 != null) {
            for (int var5 = 0; var5 < this.field2726.length; var5++) {
                var4.method1628(this.field2726[var5], this.field2719[var5]);
            }
        }
        if (this.field2715 != null) {
            for (int var6 = 0; var6 < this.field2715.length; var6++) {
                var4.method1641(this.field2715[var6], this.field2709[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Z")
    public final boolean method1255(byte arg0) {
        field2720++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2727[var3] != -1 && !class200.field3237.method1136(this.field2727[var3], 0, true)) {
                var2 = false;
            }
        }
        if (arg0 >= -33) {
            this.field2715 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public static final void method1256(int arg0, int arg1, int arg2) {
        class36 var3 = class136.method1013(13, arg2, (byte) -90);
        var3.method224(false);
        field2717++;
        var3.field577 = arg1;
        if (arg0 != 64) {
            method1253(121);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
    public final boolean method1257(int arg0) {
        field2711++;
        if (this.field2708 == null) {
            return true;
        }
        if (arg0 != 6957) {
            method1260(-45);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2708.length; var3++) {
            if (!class200.field3237.method1136(this.field2708[var3], 0, true)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field2718 = null;
        field2724 = null;
        if (arg0 != 0) {
            method1256(-28, -82, 79);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLab;)V")
    private final void method1259(int arg0, byte arg1, class249 arg2) {
        field2710++;
        if (arg1 > -3) {
            this.method1262(115, (class249) null);
        }
        if (arg0 == 1) {
            this.field2712 = arg2.method1802((byte) -92);
        } else if (arg0 == 2) {
            int var4 = arg2.method1802((byte) 120);
            this.field2708 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2708[var5] = arg2.method1821((byte) 51);
            }
        } else if (arg0 == 3) {
            this.field2714 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method1802((byte) 102);
            this.field2719 = new short[var8];
            this.field2726 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2726[var9] = (short) arg2.method1821((byte) 51);
                this.field2719[var9] = (short) arg2.method1821((byte) 51);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1802((byte) -86);
            this.field2709 = new short[var6];
            this.field2715 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2715[var7] = (short) arg2.method1821((byte) 51);
                this.field2709[var7] = (short) arg2.method1821((byte) 51);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2727[arg0 - 60] = arg2.method1821((byte) 51);
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static final void method1260(int arg0) {
        while (true) {
            if (class136.field2239.method631((byte) -12, class150.field2480) >= 27) {
                int var1 = class136.field2239.method641(false, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class57.field1002[var1] == null) {
                        class57.field1002[var1] = new class307();
                        var2 = true;
                    }
                    class307 var3 = class57.field1002[var1];
                    class186.field2972[class303.field4932++] = var1;
                    var3.field749 = class275.field4598;
                    if (var3.field4960 != null && var3.field4960.method341(true)) {
                        class115.method882(var3, (byte) -94);
                    }
                    int var4 = class136.field2239.method641(false, 1);
                    var3.method2078(79, class217.method1551(7, class136.field2239.method641(false, 14)));
                    int var5 = class136.field2239.method641(false, 5);
                    int var6 = class275.field4595[class136.field2239.method641(false, 3)];
                    if (var2) {
                        var3.field776 = var3.field753 = var6;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class136.field2239.method641(false, 1);
                    if (var7 == 1) {
                        class41.field619[class289.field4761++] = var1;
                    }
                    int var8 = class136.field2239.method641(false, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method289((byte) -105, var3.field4960.field915);
                    var3.field792 = var3.field4960.field955;
                    if (var3.field792 == 0) {
                        var3.field753 = 0;
                    }
                    var3.field785 = var3.field4960.field959;
                    var3.method293(class16.field314.field711[0] + var8, var3.method294((byte) -108), var4 == 1, false, class16.field314.field717[0] + var5);
                    if (var3.field4960.method341(true)) {
                        class169.method1264(class182.field2898, var3, 0, var3.field717[0], var3.field711[0], (class1) null, (class123) null, 128, 0);
                    }
                    continue;
                }
            }
            int var9 = -29 % ((arg0 - 47) / 47);
            class136.field2239.method638(-7);
            field2725++;
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)Lhl;")
    public final class229 method1261(int arg0) {
        field2723++;
        class229[] var2 = new class229[5];
        int var3 = 0;
        int var4 = 0;
        if (arg0 > -40) {
            return null;
        }
        while (var4 < 5) {
            if (this.field2727[var4] != -1) {
                var2[var3++] = class229.method1644(class200.field3237, this.field2727[var4], 0);
            }
            var4++;
        }
        class229 var5 = new class229(var2, var3);
        if (this.field2726 != null) {
            for (int var6 = 0; var6 < this.field2726.length; var6++) {
                var5.method1628(this.field2726[var6], this.field2719[var6]);
            }
        }
        if (this.field2715 != null) {
            for (int var7 = 0; var7 < this.field2715.length; var7++) {
                var5.method1641(this.field2715[var7], this.field2709[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILab;)V")
    public final void method1262(int arg0, class249 arg1) {
        while (true) {
            int var3 = arg1.method1802((byte) -112);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field2709 = null;
                }
                field2721++;
                return;
            }
            this.method1259(var3, (byte) -70, arg1);
        }
    }
}
