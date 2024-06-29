import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class410 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Lbo;")
    private class355 field5730 = new class355();

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    private int field5739;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    private int field5737;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Laj;")
    private class71 field5735;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5731 = "Loading sprites - ";

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5742 = new String[8];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
    public final int method2532(byte arg0) {
        int var2 = -79 % ((arg0 + 60) / 33);
        field5738++;
        return this.field5739;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method2533(int arg0) {
        field5729++;
        this.field5730.method2238(arg0 + 5);
        this.field5735.method607(arg0);
        this.field5737 = this.field5739;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public final void method2534(int arg0, int arg1) {
        if (class402.field5613 != null) {
            for (class172 var3 = (class172) this.field5730.method2234(9700); var3 != null; var3 = (class172) this.field5730.method2237((byte) -88)) {
                if (var3.method1081((byte) -84)) {
                    if (var3.method1080(arg0) == null) {
                        var3.method2367(5);
                        var3.method1902(arg0 ^ 0x20);
                        this.field5737++;
                    }
                } else if (++var3.field3984 > (long) arg1) {
                    class172 var4 = class402.field5613.method1930(var3, (byte) 8);
                    this.field5735.method612(var3.field5349, -1, var4);
                    class417.method2583(var4, var3, arg0 ^ 0xFFFFFFA9);
                    var3.method2367(5);
                    var3.method1902(32);
                }
            }
        }
        field5740++;
        if (arg0 != 0) {
            this.method2536(false);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2535(byte arg0) {
        field5741++;
        if (arg0 <= 20) {
            return null;
        }
        class172 var2 = (class172) this.field5735.method606((byte) 81);
        while (var2 != null) {
            Object var3 = var2.method1080(0);
            if (var3 != null) {
                return var3;
            }
            class172 var4 = var2;
            var2 = (class172) this.field5735.method606((byte) 87);
            var4.method2367(5);
            var4.method1902(32);
            this.field5737++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
    public final int method2536(boolean arg0) {
        field5727++;
        int var2 = 0;
        class172 var3 = (class172) this.field5730.method2234(9700);
        if (!arg0) {
            this.field5739 = 82;
        }
        while (var3 != null) {
            if (!var3.method1081((byte) -75)) {
                var2++;
            }
            var3 = (class172) this.field5730.method2237((byte) 78);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2537(int arg0, long arg1) {
        field5734++;
        class172 var4 = (class172) this.field5735.method614(-117, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1080(0);
        if (var5 == null) {
            var4.method2367(5);
            var4.method1902(32);
            this.field5737++;
            return null;
        }
        if (arg0 > -16) {
            this.field5737 = -128;
        }
        if (var4.method1081((byte) -127)) {
            class285 var6 = new class285(var5);
            this.field5735.method612(var4.field5349, -1, var6);
            this.field5730.method2244(11310, var6);
            var6.field3984 = 0L;
            var4.method2367(5);
            var4.method1902(32);
        } else {
            this.field5730.method2244(11310, var4);
            var4.field3984 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method2538(int arg0) {
        if (arg0 == -31892) {
            field5742 = null;
            field5731 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public final void method2539(int arg0) {
        for (class172 var2 = (class172) this.field5730.method2234(9700); var2 != null; var2 = (class172) this.field5730.method2237((byte) -73)) {
            if (var2.method1081((byte) -119)) {
                var2.method2367(5);
                var2.method1902(32);
                this.field5737++;
            }
        }
        field5744++;
        if (arg0 < 27) {
            this.method2540(-47);
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2540(int arg0) {
        if (arg0 != -1) {
            this.method2539(-100);
        }
        field5743++;
        class172 var2 = (class172) this.field5735.method608(arg0 ^ 0xFFFFFFA5);
        while (var2 != null) {
            Object var3 = var2.method1080(0);
            if (var3 != null) {
                return var3;
            }
            class172 var4 = var2;
            var2 = (class172) this.field5735.method606((byte) 100);
            var4.method2367(5);
            var4.method1902(32);
            this.field5737++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
    public static final String method2541(int arg0, int[] arg1, byte arg2, long arg3) {
        int var5 = 39 / ((arg2 + 36) / 49);
        field5732++;
        if (class440.field6315 != null) {
            String var6 = class440.field6315.method271(0, arg1, arg0, arg3);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
    public final void method2542(Object arg0, byte arg1, long arg2) {
        int var5 = -48 % (arg1 / 49);
        this.method2543(arg2, (byte) -26);
        field5728++;
        if (this.field5737 == 0) {
            class172 var6 = (class172) this.field5730.method2243(0);
            var6.method2367(5);
            var6.method1902(32);
        } else {
            this.field5737--;
        }
        class285 var7 = new class285(arg0);
        this.field5735.method612(arg2, -1, var7);
        this.field5730.method2244(11310, var7);
        var7.field3984 = 0L;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JB)V")
    private final void method2543(long arg0, byte arg1) {
        field5733++;
        class172 var4 = (class172) this.field5735.method614(-102, arg0);
        if (var4 != null) {
            var4.method2367(5);
            var4.method1902(arg1 + 58);
            this.field5737++;
        }
        if (arg1 != -26) {
            this.method2542((Object) null, (byte) 102, 27L);
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)I")
    public final int method2544(int arg0) {
        if (arg0 != 0) {
            field5731 = null;
        }
        field5736++;
        return this.field5737;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
    public class410(int arg0) {
        this.field5739 = arg0;
        this.field5737 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5735 = new class71(var2);
    }
}
