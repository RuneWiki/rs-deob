import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class177 {

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
    public boolean field2280 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lwg;")
    private class58 field2284 = new class58(64);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lwg;")
    public class58 field2288 = new class58(500);

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Lwg;")
    public class58 field2289 = new class58(30);

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Lwg;")
    public class58 field2290 = new class58(50);

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Lkr;")
    private class329 field2287;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Z")
    public boolean field2283;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lkr;")
    public class329 field2274;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "F")
    public static float field2286;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method1088(int arg0) {
        field2275++;
        class58 var2 = this.field2284;
        synchronized (this.field2284) {
            this.field2284.method317((byte) 21);
        }
        class58 var3 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method317((byte) 21);
        }
        class58 var4 = this.field2289;
        synchronized (this.field2289) {
            this.field2289.method317((byte) 21);
        }
        if (arg0 != -1) {
            this.method1091(-57, 99);
        }
        class58 var5 = this.field2290;
        synchronized (this.field2290) {
            this.field2290.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public final void method1089(int arg0) {
        field2276++;
        class58 var2 = this.field2284;
        synchronized (this.field2284) {
            this.field2284.method315(1);
        }
        class58 var3 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method315(1);
        }
        class58 var4 = this.field2289;
        synchronized (this.field2289) {
            if (arg0 != 30) {
                this.field2291 = 64;
            }
            this.field2289.method315(arg0 - 29);
        }
        class58 var5 = this.field2290;
        synchronized (this.field2290) {
            this.field2290.method315(1);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
    public final void method1090(boolean arg0, int arg1) {
        field2278++;
        if (this.field2280 != arg0) {
            this.field2280 = arg0;
            this.method1089(arg1);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public final void method1091(int arg0, int arg1) {
        class58 var3 = this.field2284;
        synchronized (this.field2284) {
            this.field2284.method320(arg1, arg0 ^ 0xEDB88320);
        }
        field2285++;
        class58 var4 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method320(arg1, -306674912);
        }
        class58 var5 = this.field2289;
        synchronized (this.field2289) {
            this.field2289.method320(arg1, -306674912);
            if (arg0 != 0) {
                field2286 = -1.0692782F;
            }
        }
        class58 var6 = this.field2290;
        synchronized (this.field2290) {
            this.field2290.method320(arg1, arg0 - 306674912);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
    public final void method1092(int arg0, int arg1) {
        if (arg0 > -10) {
            this.field2289 = null;
        }
        this.field2284 = new class58(arg1);
        field2277++;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)Lbu;")
    public final class137 method1093(int arg0, int arg1) {
        field2279++;
        class58 var3 = this.field2284;
        class137 var4;
        synchronized (this.field2284) {
            var4 = (class137) this.field2284.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field2287;
        byte[] var6;
        synchronized (this.field2287) {
            var6 = this.field2287.method2054(true, class403.method2409(arg1, -103), class504.method2819(arg1, 12));
        }
        class137 var7 = new class137();
        var7.field1726 = this;
        var7.field1679 = arg1;
        if (var6 != null) {
            var7.method725(new class551(var6), arg0 ^ 0x6F);
        }
        var7.method726(arg0 ^ 0x4B);
        if (!this.field2283 && var7.field1744) {
            var7.field1702 = null;
            var7.field1683 = null;
        }
        if (var7.field1701) {
            var7.field1709 = 0;
            var7.field1745 = false;
        }
        class58 var8 = this.field2284;
        synchronized (this.field2284) {
            this.field2284.method316((long) arg1, (byte) -112, var7);
        }
        if (arg0 != 0) {
            this.method1091(-66, 28);
        }
        return var7;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(II)V")
    public final void method1094(int arg0, int arg1) {
        field2281++;
        this.field2291 = arg0;
        int var3 = -116 / ((arg1 + 16) / 47);
        class58 var4 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method315(1);
        }
        class58 var5 = this.field2289;
        synchronized (this.field2289) {
            this.field2289.method315(1);
        }
        class58 var6 = this.field2290;
        synchronized (this.field2290) {
            this.field2290.method315(1);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(ZI)V")
    public final void method1095(boolean arg0, int arg1) {
        field2282++;
        if (this.field2283 == arg0) {
            return;
        }
        this.field2283 = arg0;
        this.method1089(arg1);
        if (arg1 != 30) {
            this.field2289 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lg;IZLkr;Lkr;)V")
    public class177(class513 arg0, int arg1, boolean arg2, class329 arg3, class329 arg4) {
        this.field2287 = arg3;
        this.field2283 = arg2;
        this.field2274 = arg4;
        if (this.field2287 != null) {
            int var6 = this.field2287.method2046((byte) 64) - 1;
            this.field2287.method2064(0, var6);
        }
    }
}
