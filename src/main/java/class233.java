import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class233 {

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    private int field3744 = 0;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    private int field3750 = -1;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Ljk;")
    private class76 field3749 = new class76();

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Z")
    public boolean field3756 = false;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[[[I")
    private int[][][] field3752;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    private int field3741;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[Lnh;")
    private class294[] field3755;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "J")
    public static long field3742 = 0L;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3740 = 0;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Luf;")
    public static class168 field3754 = null;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Luf;")
    public static class168 field3753 = class148.method1019(-1720, "");

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 7)
    public static void method1581(int arg0) {
        field3753 = null;
        if (arg0 != 0) {
            field3754 = (class168) null;
        }
        field3754 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lj;I)V", line = 18)
    public static final void method1582(class153 arg0, int arg1) {
        field3739++;
        if (arg0.field2359.length - arg0.field2367 < 1) {
            return;
        }
        int var2 = arg0.method1042((byte) -112);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field2359.length - arg0.field2367 < var3) {
            return;
        }
        class69.field913 = arg0.method1042((byte) 111);
        if (class69.field913 < 1) {
            class69.field913 = 1;
        } else if (class69.field913 > 4) {
            class69.field913 = 4;
        }
        class124.method883(arg0.method1042((byte) 98) == 1, arg1 ^ 0xFFFFFFD7);
        class263.field4460 = arg0.method1042((byte) 84) == 1;
        class69.field914 = arg0.method1042((byte) -83) == 1;
        class145.field2250 = arg0.method1042((byte) 118) == 1;
        class120.field1865 = arg0.method1042((byte) 89) == 1;
        class61.field796 = arg0.method1042((byte) 119) == 1;
        class165.field2654 = arg0.method1042((byte) 120) == 1;
        class164.field2631 = arg0.method1042((byte) -81) == 1;
        class201.field3310 = arg0.method1042((byte) 109);
        if (class201.field3310 > 2) {
            class201.field3310 = 2;
        }
        if (var2 >= 2) {
            class44.field539 = arg0.method1042((byte) -126) == 1;
        } else {
            class44.field539 = arg0.method1042((byte) -68) == 1;
            arg0.method1042((byte) -55);
        }
        client.field4939 = arg0.method1042((byte) 84) == 1;
        class164.field2632 = arg0.method1042((byte) 91) == 1;
        class161.field2599 = arg0.method1042((byte) 98);
        if (class161.field2599 > 2) {
            class161.field2599 = 2;
        }
        class53.field653 = arg0.method1042((byte) 105) == 1;
        class1.field1 = arg0.method1042((byte) -103);
        if (class1.field1 > arg1) {
            class1.field1 = 127;
        }
        class48.field593 = arg0.method1042((byte) 123);
        class72.field968 = arg0.method1042((byte) -35);
        if (class72.field968 > 127) {
            class72.field968 = 127;
        }
        if (var2 >= 1) {
            class17.field201 = arg0.method1069(arg1 ^ 0xB);
            class219.field3558 = arg0.method1069(arg1 - 27);
        }
        if (var2 >= 3) {
            class12.field133 = arg0.method1042((byte) 95) == 1;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 118)
    public static final void method1583(int arg0) {
        if (class190.field3071[96]) {
            class194.field3153 += (-class194.field3153 - 24) / 2;
        } else if (class190.field3071[97]) {
            class194.field3153 += (24 - class194.field3153) / 2;
        } else {
            class194.field3153 /= 2;
        }
        field3743++;
        class71.field959 += class194.field3153 / 2;
        if (class190.field3071[98]) {
            class157.field2479 += (12 - class157.field2479) / 2;
        } else if (class190.field3071[99]) {
            class157.field2479 += (-class157.field2479 - 12) / 2;
        } else {
            class157.field2479 /= 2;
        }
        class171.field2787 += class157.field2479 / 2;
        int var1 = class39.field490 + class266.field4489.field3027;
        int var2 = -72 % ((arg0 - 73) / 50);
        int var3 = class103.field1594 + class266.field4489.field3021;
        if (class215.field3503 - var1 < -500 || (class215.field3503 - var1) > 500 || (class296.field5009 - var3) < -500 || class296.field5009 - var3 > 500) {
            class296.field5009 = var3;
            class215.field3503 = var1;
        }
        if (class296.field5009 != var3) {
            class296.field5009 += (var3 - class296.field5009) / 16;
        }
        if (class215.field3503 != var1) {
            class215.field3503 += (var1 - class215.field3503) / 16;
        }
        class5.method15(125);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)[[[I", line = 167)
    public final int[][][] method1584(byte arg0) {
        field3746++;
        int var2 = 28 / ((arg0 + 51) / 43);
        if (this.field3751 != this.field3741) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field3751; var3++) {
            this.field3755[var3] = class211.field3468;
        }
        return this.field3752;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 201)
    public final void method1585(byte arg0) {
        for (int var2 = 0; var2 < this.field3751; var2++) {
            this.field3752[var2][0] = null;
            this.field3752[var2][1] = null;
            this.field3752[var2][2] = null;
            this.field3752[var2] = (int[][]) null;
        }
        if (arg0 != -92) {
            return;
        }
        this.field3755 = null;
        field3747++;
        this.field3752 = (int[][][]) null;
        this.field3749.method453(arg0 + 347);
        this.field3749 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Lok;", line = 225)
    public static final class40 method1586(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1979;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[[I", line = 241)
    public final int[][] method1587(int arg0, int arg1) {
        field3745++;
        if (arg1 != 9804) {
            method1581(22);
        }
        if (this.field3751 == this.field3741) {
            this.field3756 = this.field3755[arg0] == null;
            this.field3755[arg0] = class211.field3468;
            return this.field3752[arg0];
        } else if (this.field3751 == 1) {
            this.field3756 = this.field3750 != arg0;
            this.field3750 = arg0;
            return this.field3752[0];
        } else {
            class294 var3 = this.field3755[arg0];
            if (var3 == null) {
                this.field3756 = true;
                if (this.field3751 <= this.field3744) {
                    class294 var4 = (class294) this.field3749.method443(117);
                    var3 = new class294(arg0, var4.field4984);
                    this.field3755[var4.field4986] = null;
                    var4.method124((byte) 74);
                } else {
                    var3 = new class294(arg0, this.field3744);
                    this.field3744++;
                }
                this.field3755[arg0] = var3;
            } else {
                this.field3756 = false;
            }
            this.field3749.method446(var3, -27762);
            return this.field3752[var3.field4984];
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V", line = 351)
    public class233(int arg0, int arg1, int arg2) {
        this.field3751 = arg0;
        this.field3752 = new int[this.field3751][3][arg2];
        this.field3741 = arg1;
        this.field3755 = new class294[this.field3741];
    }
}
