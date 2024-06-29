import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class420 {

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
    private int[] field6286 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field6290 = 1401;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Z")
    public static boolean field6295 = false;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lmq;")
    public class59 field6284;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    private int[] field6282;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[Lta;")
    public static class337[] field6281;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[S")
    private short[] field6279;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    private short[] field6283;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    private short[] field6288;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[S")
    private short[] field6293;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lio;")
    public final class118 method2500(int arg0) {
        field6287++;
        if (this.field6282 == null) {
            return null;
        }
        class118[] var2 = new class118[this.field6282.length];
        if (arg0 != -19967) {
            field6290 = -73;
        }
        class74 var3 = this.field6284.field808;
        synchronized (this.field6284.field808) {
            int var4 = 0;
            while (true) {
                if (this.field6282.length <= var4) {
                    break;
                }
                var2[var4] = class132.method975(this.field6284.field808, this.field6282[var4], 0, -51);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field6282.length; var5++) {
            if (var2[var5].field1781 < 13) {
                var2[var5].method881(-2, 0);
            }
        }
        class118 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class118(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6293 != null) {
            for (int var7 = 0; var7 < this.field6293.length; var7++) {
                var6.method896(this.field6293[var7], this.field6279[var7], false);
            }
        }
        if (this.field6288 != null) {
            for (int var8 = 0; var8 < this.field6288.length; var8++) {
                var6.method887(this.field6283[var8], 8071, this.field6288[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Lio;")
    public final class118 method2501(int arg0) {
        field6278++;
        class118[] var2 = new class118[5];
        int var3 = 0;
        class74 var4 = this.field6284.field808;
        synchronized (this.field6284.field808) {
            int var5 = 51 % ((arg0 - 30) / 34);
            int var6 = 0;
            while (true) {
                if (var6 >= 5) {
                    break;
                }
                if (this.field6286[var6] != -1) {
                    var2[var3++] = class132.method975(this.field6284.field808, this.field6286[var6], 0, -125);
                }
                var6++;
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            if (var2[var7] != null && var2[var7].field1781 < 13) {
                var2[var7].method881(-2, 0);
            }
        }
        class118 var8 = new class118(var2, var3);
        if (this.field6293 != null) {
            for (int var9 = 0; var9 < this.field6293.length; var9++) {
                var8.method896(this.field6293[var9], this.field6279[var9], false);
            }
        }
        if (this.field6288 != null) {
            for (int var10 = 0; var10 < this.field6288.length; var10++) {
                var8.method887(this.field6283[var10], 8071, this.field6288[var10]);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLgk;)Lie;")
    public static final class88 method2502(byte arg0, class468 arg1) {
        int var2 = -66 / ((arg0 + 80) / 45);
        field6289++;
        return new class88(arg1.method2745(-1), arg1.method2745(-1), arg1.method2745(-1), arg1.method2745(-1), arg1.method2759(1919914864), arg1.method2765(55));
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BB)Ltq;")
    public static final class68 method2503(byte[] arg0, byte arg1) {
        field6285++;
        class68 var2 = new class68();
        class468 var3 = new class468(arg0);
        if (arg1 < 100) {
            field6295 = false;
        }
        var3.field6830 = var3.field6868.length - 2;
        int var4 = var3.method2727((byte) 43);
        int var5 = var3.field6868.length - var4 - 2 - 12;
        var3.field6830 = var5;
        int var6 = var3.method2722(false);
        var2.field894 = var3.method2727((byte) 43);
        var2.field898 = var3.method2727((byte) 43);
        var2.field890 = var3.method2727((byte) 43);
        var2.field900 = var3.method2727((byte) 43);
        int var7 = var3.method2765(91);
        if (var7 > 0) {
            var2.field899 = new class517[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2727((byte) 43);
                class517 var10 = new class517(class143.method1039(8, var9));
                var2.field899[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2722(false);
                    int var12 = var3.method2722(false);
                    var10.method3055(0, (long) var11, new class221(var12));
                }
            }
        }
        var3.field6830 = 0;
        var2.field901 = var3.method2741(0);
        var2.field897 = new int[var6];
        var2.field892 = new String[var6];
        var2.field893 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field6830) {
            int var14 = var3.method2727((byte) 43);
            if (var14 == 3) {
                var2.field892[var13] = var3.method2770(-20459).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field897[var13] = var3.method2765(116);
            } else {
                var2.field897[var13] = var3.method2722(false);
            }
            var2.field893[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Z")
    public final boolean method2504(int arg0) {
        field6280++;
        int var2 = -36 / ((arg0 - 75) / 42);
        boolean var3 = true;
        class74 var4 = this.field6284.field808;
        synchronized (this.field6284.field808) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field6286[var5] != -1 && !this.field6284.field808.method538(this.field6286[var5], 100, 0)) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
    public final boolean method2505(int arg0) {
        field6291++;
        if (this.field6282 == null) {
            return true;
        }
        boolean var2 = true;
        class74 var3 = this.field6284.field808;
        synchronized (this.field6284.field808) {
            if (arg0 != -19340) {
                method2506(-24);
            }
            for (int var4 = 0; var4 < this.field6282.length; var4++) {
                if (!this.field6284.field808.method538(this.field6282[var4], 100, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public static void method2506(int arg0) {
        field6281 = null;
        if (arg0 != -60) {
            method2503(null, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILgk;)V")
    private final void method2507(int arg0, int arg1, class468 arg2) {
        field6294++;
        if (arg0 != 1414) {
            return;
        }
        if (arg1 == 1) {
            arg2.method2765(arg0 - 1306);
        } else if (arg1 == 2) {
            int var4 = arg2.method2765(50);
            this.field6282 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6282[var5] = arg2.method2727((byte) 43);
            }
            return;
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method2765(123);
                this.field6293 = new short[var6];
                this.field6279 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6293[var7] = (short) arg2.method2727((byte) 43);
                    this.field6279[var7] = (short) arg2.method2727((byte) 43);
                }
                return;
            }
            if (arg1 == 41) {
                int var8 = arg2.method2765(74);
                this.field6283 = new short[var8];
                this.field6288 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6288[var9] = (short) arg2.method2727((byte) 43);
                    this.field6283[var9] = (short) arg2.method2727((byte) 43);
                }
                return;
            }
            if (arg1 >= 60 && arg1 < 70) {
                this.field6286[arg1 - 60] = arg2.method2727((byte) 43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgk;B)V")
    public final void method2508(class468 arg0, byte arg1) {
        if (arg1 < 51) {
            field6281 = null;
        }
        while (true) {
            int var3 = arg0.method2765(111);
            if (var3 == 0) {
                field6292++;
                return;
            }
            this.method2507(1414, var3, arg0);
        }
    }
}
