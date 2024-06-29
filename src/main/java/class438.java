import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class438 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
    private int[] field6483 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "[[I")
    public static int[][] field6496 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "Ldaa;")
    public class11 field6498;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "[I")
    private int[] field6492;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "[Lpga;")
    public static class536[] field6489;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[S")
    private short[] field6484;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "[S")
    private short[] field6485;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "[S")
    private short[] field6490;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "[S")
    private short[] field6495;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z")
    public final boolean method2705(int arg0) {
        field6494++;
        if (arg0 != 5) {
            return true;
        }
        boolean var2 = true;
        class39 var3 = this.field6498.field159;
        synchronized (this.field6498.field159) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6483[var4] != -1 && !this.field6498.field159.method214(0, this.field6483[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lrg;I)V")
    public final void method2706(class645 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3745(-6314);
            if (var3 == 0) {
                field6499++;
                if (arg1 > -58) {
                    this.method2713((byte) -79);
                    return;
                }
                return;
            }
            this.method2712(var3, (byte) -32, arg0);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Ldh;")
    public final class322 method2707(int arg0) {
        field6482++;
        if (this.field6492 == null) {
            return null;
        }
        class322[] var2 = new class322[this.field6492.length];
        class39 var3 = this.field6498.field159;
        synchronized (this.field6498.field159) {
            int var4 = 0;
            while (true) {
                if (this.field6492.length <= var4) {
                    break;
                }
                var2[var4] = class342.method2175(this.field6498.field159, 0, this.field6492[var4], (byte) -126);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field6492.length; var5++) {
            if (var2[var5].field4570 < 13) {
                var2[var5].method2040(2, (byte) 117);
            }
        }
        class322 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class322(var2, var2.length);
        }
        if (arg0 != 19026) {
            this.field6495 = null;
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6490 != null) {
            for (int var7 = 0; var7 < this.field6490.length; var7++) {
                var6.method2046(this.field6484[var7], this.field6490[var7], false);
            }
        }
        if (this.field6495 != null) {
            for (int var8 = 0; var8 < this.field6495.length; var8++) {
                var6.method2047(this.field6495[var8], this.field6485[var8], 6104);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
    public static final void method2708(boolean arg0) {
        field6493++;
        int var1 = 0;
        if (class63.field916.field10175.method1990(17503) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class63.field916.field10162.method4009(17503) == 0) {
            var1 |= 0x40;
        }
        class382.method2459(var1, arg0);
        class239.field3470.method398(true, var1);
        class336.field4876.method2077(-123, var1);
        class74.field1032.method3328(var1, -60);
        class499.field7100.method165(var1, (byte) -116);
        class639.method3668(var1, (byte) 91);
        class470.method2844(var1, -6822);
        class236.method1567(var1, (byte) -66);
        class12.method80(-1, var1);
        class63.method563(-11);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILvt;)V")
    public static final void method2709(int arg0, class304 arg1) {
        field6481++;
        for (int var2 = arg0; var2 < class153.field2421; var2++) {
            int var3 = class570.field8068[var2];
            class689 var4 = class314.field4456[var3];
            int var5 = arg1.method3745(arg0 ^ 0xFFFFE756);
            if ((var5 & 0x4) != 0) {
                var5 += arg1.method3745(-6314) << 8;
            }
            if ((var5 & 0x400) != 0) {
                var5 += arg1.method3745(-6314) << 16;
            }
            class369.method2271(117, var4, var5, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Lcha;")
    public static final class218 method2710(byte arg0, int arg1) {
        if (arg0 < 94) {
            return null;
        } else {
            field6488++;
            return class520.field7453 && class269.field3854 <= arg1 && class589.field8355 >= arg1 ? class587.field8320[arg1 - class269.field3854] : null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)Ldh;")
    public final class322 method2711(int arg0) {
        field6486++;
        class322[] var2 = new class322[5];
        int var3 = 0;
        class39 var4 = this.field6498.field159;
        synchronized (this.field6498.field159) {
            int var5 = arg0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6483[var5] != -1) {
                    var2[var3++] = class342.method2175(this.field6498.field159, 0, this.field6483[var5], (byte) -126);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field4570 < 13) {
                var2[var6].method2040(2, (byte) 127);
            }
        }
        class322 var7 = new class322(var2, var3);
        if (this.field6490 != null) {
            for (int var8 = 0; var8 < this.field6490.length; var8++) {
                var7.method2046(this.field6484[var8], this.field6490[var8], false);
            }
        }
        if (this.field6495 != null) {
            for (int var9 = 0; var9 < this.field6495.length; var9++) {
                var7.method2047(this.field6495[var9], this.field6485[var9], 6104);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBLrg;)V")
    private final void method2712(int arg0, byte arg1, class645 arg2) {
        if (arg1 != -32) {
            return;
        }
        field6487++;
        if (arg0 == 1) {
            arg2.method3745(-6314);
        } else if (arg0 == 2) {
            int var4 = arg2.method3745(-6314);
            this.field6492 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6492[var5] = arg2.method3712((byte) 96);
            }
            return;
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method3745(-6314);
                this.field6484 = new short[var6];
                this.field6490 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6490[var7] = (short) arg2.method3712((byte) 71);
                    this.field6484[var7] = (short) arg2.method3712((byte) -13);
                }
                return;
            }
            if (arg0 == 41) {
                int var8 = arg2.method3745(-6314);
                this.field6495 = new short[var8];
                this.field6485 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6495[var9] = (short) arg2.method3712((byte) 115);
                    this.field6485[var9] = (short) arg2.method3712((byte) 108);
                }
                return;
            }
            if (arg0 >= 60 && arg0 < 70) {
                this.field6483[arg0 - 60] = arg2.method3712((byte) -106);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
    public final boolean method2713(byte arg0) {
        field6491++;
        if (this.field6492 == null) {
            return true;
        }
        boolean var2 = true;
        class39 var3 = this.field6498.field159;
        synchronized (this.field6498.field159) {
            if (arg0 != 0) {
                this.method2713((byte) -111);
            }
            for (int var4 = 0; var4 < this.field6492.length; var4++) {
                if (!this.field6498.field159.method214(0, this.field6492[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V")
    public static void method2714(byte arg0) {
        if (arg0 != -117) {
            field6497 = 51;
        }
        field6496 = null;
        field6489 = null;
    }
}
