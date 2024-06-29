import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class361 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lpca;")
    private class653 field4716 = new class653(64);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Ljo;")
    private class303 field4714;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljo;")
    public class303 field4711;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lbd;")
    public static class57 field4715 = new class57();

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lag;[I[II[I)V", line = 3)
    public static final void method1980(class625 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        field4718++;
        for (int var5 = arg3; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg0.field3776.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field3776[var9] = null;
                    } else {
                        class576 var10 = class618.field8696.method124(24006, var6);
                        int var11 = var10.field8217;
                        class179 var12 = arg0.field3776[var9];
                        if (var12 != null) {
                            if (var12.field2211 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field3776[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2217 = 0;
                                    var12.field2210 = 0;
                                    var12.field2214 = var8;
                                    var12.field2213 = 0;
                                    var12.field2212 = 1;
                                    class259.method1473(arg0.field4641, (byte) 1, var10, arg0.field4647, arg0.field4638, 0, false);
                                } else if (var11 == 2) {
                                    var12.field2213 = 0;
                                }
                            } else if (var10.field8222 >= class618.field8696.method124(24006, var12.field2211).field8222) {
                                var12 = arg0.field3776[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class179 var13 = arg0.field3776[var9] = new class179();
                            var13.field2211 = var6;
                            var13.field2210 = 0;
                            var13.field2212 = 1;
                            var13.field2213 = 0;
                            var13.field2214 = var8;
                            var13.field2217 = 0;
                            class259.method1473(arg0.field4641, (byte) 1, var10, arg0.field4647, arg0.field4638, 0, false);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 97)
    public final void method1981(int arg0) {
        class653 var2 = this.field4716;
        synchronized (this.field4716) {
            this.field4716.method3687((byte) -10);
        }
        field4717++;
        if (arg0 < 27) {
            this.field4714 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lth;", line = 110)
    public final class544 method1982(int arg0, byte arg1) {
        field4713++;
        class653 var3 = this.field4716;
        class544 var4;
        synchronized (this.field4716) {
            var4 = (class544) this.field4716.method3690((byte) 5, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field4714;
        byte[] var6;
        synchronized (this.field4714) {
            if (arg1 > -66) {
                this.field4714 = null;
            }
            var6 = this.field4714.method1719(arg0, 3, 4);
        }
        class544 var7 = new class544();
        var7.field7784 = this;
        if (var6 != null) {
            var7.method3088((byte) 75, new class452(var6));
        }
        class653 var8 = this.field4716;
        synchronized (this.field4716) {
            this.field4716.method3683(var7, (byte) 99, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 142)
    public static void method1983(byte arg0) {
        field4715 = null;
        if (arg0 != -112) {
            field4715 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IB)V", line = 156)
    public final void method1984(int arg0, byte arg1) {
        class653 var3 = this.field4716;
        synchronized (this.field4716) {
            this.field4716.method3691(false, arg0);
        }
        if (arg1 != 110) {
            this.method1982(20, (byte) -14);
        }
        field4719++;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 169)
    public final void method1985(int arg0) {
        if (arg0 != -1) {
            field4715 = null;
        }
        field4712++;
        class653 var2 = this.field4716;
        synchronized (this.field4716) {
            this.field4716.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ljda;ILjo;Ljo;)V", line = 192)
    public class361(class207 arg0, int arg1, class303 arg2, class303 arg3) {
        this.field4714 = arg2;
        this.field4711 = arg3;
        this.field4714.method1727(-77, 3);
    }
}
