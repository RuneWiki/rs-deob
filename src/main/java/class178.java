import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class178 {

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Lql;")
    private class346 field2357 = new class346();

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lvk;")
    private class56 field2351;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Z")
    public static boolean field2347 = false;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2352 = new String[100];

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "F")
    public static float field2361 = 0.0F;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public static int field2362 = -1;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "Lar;")
    public static class47 field2366 = new class47();

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "Lqj;")
    public static class237 field2367 = null;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Z")
    public static boolean field2358;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final void method1083(int arg0) {
        this.field2357.method2251(6);
        if (arg0 == 0) {
            field2353++;
            this.field2351.method391(46);
            this.field2365 = this.field2354;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)I")
    public final int method1084(int arg0) {
        field2364++;
        if (arg0 != 11503) {
            this.field2365 = 15;
        }
        return this.field2365;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method1085(byte arg0) {
        field2352 = null;
        field2366 = null;
        if (arg0 != -58) {
            method1085((byte) 22);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Object;Lkb;I)V")
    public final void method1086(Object arg0, class80 arg1, int arg2) {
        if (arg2 <= 62) {
            field2347 = true;
        }
        this.method1088(arg1, -12826);
        field2360++;
        if (this.field2365 == 0) {
            class240 var4 = (class240) this.field2357.method2246((byte) -120);
            var4.method322(11);
            var4.method1302(true);
        } else {
            this.field2365--;
        }
        class48 var5 = new class48(arg1, arg0);
        this.field2351.method381(true, var5, arg1.method576(12192));
        this.field2357.method2245(var5, (byte) -107);
        var5.field2962 = 0L;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I")
    public final int method1087(int arg0) {
        field2363++;
        return arg0 < 114 ? -128 : this.field2354;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lkb;I)V")
    private final void method1088(class80 arg0, int arg1) {
        field2356++;
        long var3 = arg0.method576(arg1 ^ 0xFFFFE246);
        if (arg1 != -12826) {
            method1085((byte) -115);
        }
        for (class240 var5 = (class240) this.field2351.method384(var3, true); var5 != null; var5 = (class240) this.field2351.method392(false)) {
            if (var5.field3214.method575(-7088, arg0)) {
                var5.method322(arg1 + 12837);
                var5.method1302(true);
                this.field2365++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
    public final void method1089(byte arg0, int arg1) {
        if (arg0 != 59) {
            return;
        }
        if (class430.field6324 != null) {
            for (class240 var3 = (class240) this.field2357.method2250(1580); var3 != null; var3 = (class240) this.field2357.method2244(arg0 ^ 0x3B)) {
                if (var3.method349((byte) 29)) {
                    if (var3.method347(-27089) == null) {
                        var3.method322(11);
                        var3.method1302(true);
                        this.field2365++;
                    }
                } else if ((++var3.field2962) > ((long) arg1)) {
                    class240 var4 = class430.field6324.method1171((byte) -90, var3);
                    this.field2351.method381(true, var4, var3.field640);
                    class404.method2606(var4, var3, 12111);
                    var3.method322(11);
                    var3.method1302(true);
                }
            }
        }
        field2350++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lkb;Z)Ljava/lang/Object;")
    public final Object method1090(class80 arg0, boolean arg1) {
        field2355++;
        long var3 = arg0.method576(12192);
        for (class240 var5 = (class240) this.field2351.method384(var3, arg1); var5 != null; var5 = (class240) this.field2351.method392(!arg1)) {
            if (var5.field3214.method575(-7088, arg0)) {
                Object var6 = var5.method347(-27089);
                if (var6 != null) {
                    if (var5.method349((byte) 29)) {
                        class48 var7 = new class48(arg0, var6);
                        this.field2351.method381(arg1, var7, var5.field640);
                        this.field2357.method2245(var7, (byte) -57);
                        var7.field2962 = 0L;
                        var5.method322(11);
                        var5.method1302(true);
                    } else {
                        this.field2357.method2245(var5, (byte) -124);
                        var5.field2962 = 0L;
                    }
                    return var6;
                }
                var5.method322(11);
                var5.method1302(true);
                this.field2365++;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V")
    public final void method1091(int arg0) {
        if (arg0 != -29222) {
            return;
        }
        field2359++;
        for (class240 var2 = (class240) this.field2357.method2250(1580); var2 != null; var2 = (class240) this.field2357.method2244(0)) {
            if (var2.method349((byte) 29)) {
                var2.method322(11);
                var2.method1302(true);
                this.field2365++;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
    public class178(int arg0) {
        this.field2365 = arg0;
        this.field2354 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2351 = new class56(var2);
    }
}
