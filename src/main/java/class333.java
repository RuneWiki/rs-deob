import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class333 {

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "Z")
    public boolean field4922 = false;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    private int field4920 = 128;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Z")
    public boolean field4916 = false;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    private int field4923 = 128;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    private int field4925 = 0;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public int field4924 = -1;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    private int field4928 = 0;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    private int field4914 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4908 = new String[100];

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public static int[] field4913 = new int[14];

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4927 = null;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Z")
    public static boolean field4921 = false;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    private int field4919;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lqj;")
    public static class238 field4911;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[S")
    private short[] field4909;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[S")
    private short[] field4912;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "[S")
    private short[] field4929;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "[S")
    private short[] field4930;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[Z")
    public static boolean[] field4915;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lil;IB)V")
    private final void method2209(class265 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field4919 = arg0.method1685(8104);
        } else if (arg1 == 2) {
            this.field4924 = arg0.method1685(8104);
        } else if (arg1 == 4) {
            this.field4920 = arg0.method1685(8104);
        } else if (arg1 == 5) {
            this.field4923 = arg0.method1685(8104);
        } else if (arg1 == 6) {
            this.field4928 = arg0.method1685(8104);
        } else if (arg1 == 7) {
            this.field4914 = arg0.method1697(101);
        } else if (arg1 == 8) {
            this.field4925 = arg0.method1697(102);
        } else if (arg1 == 9) {
            this.field4916 = true;
        } else if (arg1 == 10) {
            this.field4922 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1697(59);
            this.field4912 = new short[var6];
            this.field4930 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4912[var7] = (short) arg0.method1685(8104);
                this.field4930[var7] = (short) arg0.method1685(8104);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1697(-65);
            this.field4929 = new short[var4];
            this.field4909 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4929[var5] = (short) arg0.method1685(8104);
                this.field4909[var5] = (short) arg0.method1685(8104);
            }
        }
        if (arg2 > 111) {
            field4918++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIILnr;)Lqc;")
    public final class95 method2210(int arg0, int arg1, int arg2, int arg3, int arg4, class437 arg5) {
        field4931++;
        int var7 = arg4;
        class15 var8 = this.field4924 == -1 || arg1 == -1 ? null : class391.method2551(this.field4924, (byte) -91);
        if (var8 != null) {
            var7 = arg4 | var8.method101(1, false, arg3, arg1);
        }
        if (this.field4923 != 128) {
            var7 |= 0x2;
        }
        if (this.field4920 != 128 || this.field4928 != 0) {
            var7 |= 0x5;
        }
        class24 var9 = class29.field500;
        class95 var10;
        synchronized (class29.field500) {
            var10 = (class95) class29.field500.method209(120, (long) (this.field4926 |= arg5.field6424 << 29));
        }
        if (var10 == null || arg5.method2132(var10.method594(), var7) != 0) {
            if (var10 != null) {
                var7 = arg5.method2068(var7, var10.method594());
            }
            int var11 = var7;
            if (this.field4912 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field4929 != null) {
                var11 |= 0x4000;
            }
            class180 var12 = class357.method2343(this.field4919, 0, class156.field2046, 1);
            if (var12 == null) {
                return null;
            }
            var10 = arg5.method2164(var12, var11, class231.field3263, this.field4914 + 64, this.field4925 + 850);
            if (this.field4912 != null) {
                for (int var13 = 0; var13 < this.field4912.length; var13++) {
                    var10.method601(this.field4912[var13], this.field4930[var13]);
                }
            }
            if (this.field4929 != null) {
                for (int var14 = 0; var14 < this.field4929.length; var14++) {
                    var10.method622(this.field4929[var14], this.field4909[var14]);
                }
            }
            var10.method589(var7);
            class24 var15 = class29.field500;
            synchronized (class29.field500) {
                class29.field500.method202(true, var10, (long) (this.field4926 |= arg5.field6424 << 29));
            }
        }
        class95 var16 = var8 == null ? var10.method628((byte) 2, var7, true) : var8.method102(arg3, arg1, var7, (byte) 2, arg2, 0, var10, (byte) -101);
        if (this.field4920 != 128 || this.field4923 != 128) {
            var16.method603(this.field4920, this.field4923, this.field4920);
        }
        if (~this.field4928 != arg0) {
            if (this.field4928 == 90) {
                var16.method605(4096);
            }
            if (this.field4928 == 180) {
                var16.method605(8192);
            }
            if (this.field4928 == 270) {
                var16.method605(12288);
            }
        }
        var16.method589(arg4);
        return var16;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILil;)V")
    public final void method2211(int arg0, class265 arg1) {
        while (true) {
            int var3 = arg1.method1697(-63);
            if (var3 == 0) {
                field4910++;
                if (arg0 != 0) {
                    this.method2209((class265) null, -124, (byte) 74);
                    return;
                }
                return;
            }
            this.method2209(arg1, var3, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static final void method2212(boolean arg0) {
        field4917++;
        class282.method1801(0, arg0);
        if (class59.field851 >= 0 && class59.field851 != 0) {
            class22.method189(class59.field851, 93);
            class59.field851 = -1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V")
    public static void method2213(boolean arg0) {
        field4915 = null;
        field4911 = null;
        field4908 = null;
        if (arg0) {
            field4913 = null;
        }
        field4913 = null;
        field4927 = null;
    }
}
