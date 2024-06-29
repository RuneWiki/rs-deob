import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class126 {

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "[I")
    private int[] field1723 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[I")
    public static int[] field1721 = new int[25];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Lll;")
    public class203 field1718;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[S")
    private short[] field1713;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[S")
    private short[] field1717;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "[S")
    private short[] field1725;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "[S")
    private short[] field1726;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)Lvn;")
    public final class246 method872(byte arg0) {
        field1720++;
        if (this.field1714 == null) {
            return null;
        }
        class246[] var2 = new class246[this.field1714.length];
        if (arg0 > -100) {
            this.field1726 = null;
        }
        class451 var3 = this.field1718.field3085;
        synchronized (this.field1718.field3085) {
            int var4 = 0;
            while (true) {
                if (this.field1714.length <= var4) {
                    break;
                }
                var2[var4] = class340.method2085((byte) 77, this.field1714[var4], this.field1718.field3085, 0);
                var4++;
            }
        }
        class246 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class246(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1717 != null) {
            for (int var6 = 0; var6 < this.field1717.length; var6++) {
                var5.method1563(this.field1717[var6], 0, this.field1726[var6]);
            }
        }
        if (this.field1713 != null) {
            for (int var7 = 0; var7 < this.field1713.length; var7++) {
                var5.method1577(122, this.field1725[var7], this.field1713[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z")
    public final boolean method873(int arg0) {
        field1712++;
        if (this.field1714 == null) {
            return true;
        }
        boolean var2 = true;
        class451 var3 = this.field1718.field3085;
        synchronized (this.field1718.field3085) {
            for (int var4 = arg0; var4 < this.field1714.length; var4++) {
                if (!this.field1718.field3085.method2680(0, this.field1714[var4], true)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public static void method874(byte arg0) {
        int var1 = -40 / ((-arg0 - 57) / 50);
        field1721 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lre;BI)V")
    private final void method875(class446 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            arg0.method2628(49152);
        } else if (arg2 == 2) {
            int var8 = arg0.method2628(49152);
            this.field1714 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1714[var9] = arg0.method2631(2530);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg0.method2628(49152);
                this.field1726 = new short[var4];
                this.field1717 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1717[var5] = (short) arg0.method2631(2530);
                    this.field1726[var5] = (short) arg0.method2631(2530);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method2628(49152);
                this.field1713 = new short[var6];
                this.field1725 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1713[var7] = (short) arg0.method2631(2530);
                    this.field1725[var7] = (short) arg0.method2631(2530);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field1723[arg2 - 60] = arg0.method2631(2530);
            }
        }
        field1716++;
        int var10 = 92 % ((78 - arg1) / 34);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Lvn;")
    public final class246 method876(int arg0) {
        field1727++;
        class246[] var2 = new class246[5];
        int var3 = 0;
        if (arg0 != 25) {
            return null;
        }
        class451 var4 = this.field1718.field3085;
        synchronized (this.field1718.field3085) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field1723[var5] != -1) {
                    var2[var3++] = class340.method2085((byte) 77, this.field1723[var5], this.field1718.field3085, 0);
                }
            }
        }
        class246 var6 = new class246(var2, var3);
        if (this.field1717 != null) {
            for (int var7 = 0; var7 < this.field1717.length; var7++) {
                var6.method1563(this.field1717[var7], 0, this.field1726[var7]);
            }
        }
        if (this.field1713 != null) {
            for (int var8 = 0; var8 < this.field1713.length; var8++) {
                var6.method1577(arg0 + 36, this.field1725[var8], this.field1713[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)Z")
    public final boolean method877(int arg0) {
        field1722++;
        boolean var2 = true;
        class451 var3 = this.field1718.field3085;
        synchronized (this.field1718.field3085) {
            if (arg0 <= 0) {
                return false;
            }
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field1723[var5] != -1 && !this.field1718.field3085.method2680(0, this.field1723[var5], true)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lre;I)V")
    public final void method878(class446 arg0, int arg1) {
        field1719++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                return;
            }
            this.method875(arg0, (byte) 117, var3);
        }
    }
}
