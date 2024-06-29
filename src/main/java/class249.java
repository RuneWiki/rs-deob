import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class249 extends class76 {

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "Lia;")
    public static class257 field4296 = class28.method234(105, "mapdots");

    @OriginalMember(owner = "client!a", name = "db", descriptor = "Lia;")
    public static class257 field4300 = class28.method234(122, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "Lia;")
    public static class257 field4302 = class28.method234(-22, "leuchten1:");

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "[Lvh;")
    private class239[] field4299;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "(I)V")
    public static void method1628(int arg0) {
        if (arg0 >= 81) {
            field4300 = null;
            field4302 = null;
            field4296 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            return null;
        } else {
            int[] var3 = super.field1467.method1182((byte) -48, arg1);
            ++field4297;
            if (super.field1467.field2980) {
                this.method1630(1, super.field1467.method1180((byte) -117));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            field4302 = null;
        }
        if (~arg2 == -1) {
            this.field4299 = new class239[arg0.method1051((byte) -64)];
            for (int var4 = 0; var4 < this.field4299.length; ++var4) {
                int var5 = arg0.method1051((byte) 105);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field4299[var4] = class228.method1489(arg0, false);
                            }
                        } else {
                            this.field4299[var4] = class89.method666(arg0, 8);
                        }
                    } else {
                        this.field4299[var4] = class12.method131(-104, arg0);
                    }
                } else {
                    this.field4299[var4] = class76.method559(arg0, -119);
                }
            }
        } else if (arg2 == 1) {
            super.field1477 = arg0.method1051((byte) 91) == 1;
        }
        ++field4303;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)V")
    public static final void method1629(int arg0, int arg1) {
        ++field4298;
        if (class244.field4242 != 0) {
            class55.field1179 = arg0;
        } else {
            class40.field835.method6((byte) 125, arg0);
        }
        if (arg1 != 4927) {
            field4296 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class249() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[[I)V")
    private final void method1630(int arg0, int[][] arg1) {
        ++field4301;
        if (arg0 != 1) {
            field4302 = null;
        }
        int var3 = class96.field1807;
        int var4 = class13.field249;
        class123.method858(arg1, arg0 + -117);
        class82.method612(class157.field2753, 0, 0, class105.field1950, false);
        if (this.field4299 != null) {
            for (int var5 = 0; var5 < this.field4299.length; ++var5) {
                class239 var6 = this.field4299[var5];
                int var7 = var6.field4111;
                int var8 = var6.field4102;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method241(var4, 5, var3);
                    } else {
                        var6.method242(var4, (byte) -56, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method240((byte) -15, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field4295;
        if (arg1 <= 2) {
            return null;
        } else {
            int[][] var3 = super.field1485.method649(arg0, true);
            if (super.field1485.field1692) {
                int var4 = class96.field1807;
                int var5 = class13.field249;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field1485.method654(true);
                this.method1630(1, var6);
                for (int var8 = 0; var8 < class13.field249; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; class96.field1807 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class30.method252(4080, var15 << 4);
                        var12[var14] = class30.method252(var15, 65280) >> 4;
                        var11[var14] = class30.method252(var15 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }
}
