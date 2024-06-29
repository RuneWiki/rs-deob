import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class357 {

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Z")
    public boolean field5287 = false;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Ld;")
    private class242 field5281 = new class242(64);

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Ld;")
    public class242 field5292 = new class242(500);

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "Ld;")
    public class242 field5293 = new class242(30);

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "Ld;")
    public class242 field5295 = new class242(50);

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Z")
    public boolean field5283;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Lum;")
    public class83 field5277;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lum;")
    private class83 field5282;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field5290 = -1;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
    public final void method2274(int arg0, byte arg1) {
        field5285++;
        if (arg1 < 17) {
            return;
        }
        this.field5296 = arg0;
        class242 var3 = this.field5292;
        synchronized (this.field5292) {
            this.field5292.method1637((byte) 13);
        }
        class242 var4 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1637((byte) 13);
        }
        class242 var5 = this.field5295;
        synchronized (this.field5295) {
            this.field5295.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)V")
    public final void method2275(boolean arg0, int arg1) {
        field5280++;
        if (this.field5283 != arg0 && arg1 == 2) {
            this.field5283 = arg0;
            this.method2282((byte) -86);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method2276(int arg0) {
        field5291++;
        int var2 = -85 / ((17 - arg0) / 38);
        class242 var3 = this.field5281;
        synchronized (this.field5281) {
            this.field5281.method1630(-23);
        }
        class242 var4 = this.field5292;
        synchronized (this.field5292) {
            this.field5292.method1630(-127);
        }
        class242 var5 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1630(-38);
        }
        class242 var6 = this.field5295;
        synchronized (this.field5295) {
            this.field5295.method1630(-25);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public static final void method2277(int arg0, int arg1) {
        field5276++;
        class188 var2 = class10.method48((byte) 40, 2, arg0);
        var2.method1306(-23128);
        if (arg1 < 88) {
            field5290 = -33;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(ZI)V")
    public final void method2278(boolean arg0, int arg1) {
        field5284++;
        if (arg0 == this.field5287) {
            return;
        }
        this.field5287 = arg0;
        this.method2282((byte) 91);
        if (arg1 != 0) {
            this.method2281(45, -29);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(IB)V")
    public final void method2279(int arg0, byte arg1) {
        if (arg1 != -52) {
            return;
        }
        field5278++;
        class242 var3 = this.field5281;
        synchronized (this.field5281) {
            this.field5281.method1631(arg0, (byte) -19);
        }
        class242 var4 = this.field5292;
        synchronized (this.field5292) {
            this.field5292.method1631(arg0, (byte) -19);
        }
        class242 var5 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1631(arg0, (byte) -19);
        }
        class242 var6 = this.field5295;
        synchronized (this.field5295) {
            this.field5295.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)V")
    public final void method2280(byte arg0, int arg1) {
        field5289++;
        if (arg0 >= 83) {
            this.field5281 = new class242(arg1);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Lii;")
    public final class395 method2281(int arg0, int arg1) {
        field5279++;
        class242 var3 = this.field5281;
        class395 var4;
        synchronized (this.field5281) {
            var4 = (class395) this.field5281.method1634((long) arg0, arg1 + 9444);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field5282;
        byte[] var6;
        synchronized (this.field5282) {
            var6 = this.field5282.method731(arg1 + 9380, class317.method2108(-25147, arg0), class527.method3126(arg0, 103));
        }
        class395 var7 = new class395();
        var7.field5760 = this;
        var7.field5831 = arg0;
        if (var6 != null) {
            var7.method2490(new class194(var6), (byte) 63);
        }
        var7.method2494(arg1 ^ 0xFFFFDB5F);
        if (arg1 != -9380) {
            this.field5296 = 118;
        }
        if (var7.field5806) {
            var7.field5827 = 0;
            var7.field5820 = false;
        }
        if (!this.field5283 && var7.field5777) {
            var7.field5770 = null;
            var7.field5768 = null;
        }
        class242 var8 = this.field5281;
        synchronized (this.field5281) {
            this.field5281.method1623((long) arg0, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public final void method2282(byte arg0) {
        class242 var2 = this.field5281;
        synchronized (this.field5281) {
            this.field5281.method1637((byte) 13);
        }
        field5288++;
        int var3 = 104 % ((-arg0 - 34) / 47);
        class242 var4 = this.field5292;
        synchronized (this.field5292) {
            this.field5292.method1637((byte) 13);
        }
        class242 var5 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1637((byte) 13);
        }
        class242 var6 = this.field5295;
        synchronized (this.field5295) {
            this.field5295.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
    public static final void method2283(byte arg0) {
        if (arg0 != 5) {
            method2277(-40, 58);
        }
        field5286++;
        for (class426 var1 = (class426) class453.field6742.method295((byte) 124); var1 != null; var1 = (class426) class453.field6742.method296(true)) {
            class190 var2 = var1.field6345;
            if (var2.field2901) {
                var1.method947((byte) 115);
                var2.method1314(arg0 - 6);
            } else if (class446.field6625 >= var2.field2885) {
                var2.method1313((byte) 45, class124.field1851);
                if (var2.field2901) {
                    var1.method947((byte) 95);
                } else {
                    class321.method2123(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lpt;IZLum;Lum;)V")
    public class357(class308 arg0, int arg1, boolean arg2, class83 arg3, class83 arg4) {
        this.field5283 = arg2;
        this.field5277 = arg4;
        this.field5282 = arg3;
        if (this.field5282 != null) {
            int var6 = this.field5282.method754(false) - 1;
            this.field5282.method748(var6, 12408);
        }
    }
}
