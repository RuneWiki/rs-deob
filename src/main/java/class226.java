import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class226 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lwf;")
    private class88 field3306 = new class88();

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lwa;")
    private class433 field3308;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Llt;")
    public static class475 field3320 = new class475("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field3323 = -1;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3326 = new String[100];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lic;")
    public static class491 field3325;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public final void method1534(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1539(-22);
        }
        field3312++;
        if (class426.field6394 == null) {
            return;
        }
        for (class79 var3 = (class79) this.field3306.method514((byte) 107); var3 != null; var3 = (class79) this.field3306.method517((byte) -119)) {
            if (var3.method141((byte) 55)) {
                if (var3.method142((byte) -128) == null) {
                    var3.method2049(-115);
                    var3.method1783((byte) -84);
                    this.field3314++;
                }
            } else if (++var3.field3936 > (long) arg1) {
                class79 var4 = class426.field6394.method1000(1, var3);
                this.field3308.method2606(var4, var3.field4736, arg0);
                class166.method1154(var4, var3, (byte) 87);
                var3.method2049(arg0 ^ 0xFFFFFFA6);
                var3.method1783((byte) -112);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZILod;I[I)Lwe;")
    public static final class279 method1535(int arg0, boolean arg1, int arg2, class349 arg3, int arg4, int[] arg5) {
        field3318++;
        int var6 = -124 / ((arg4 - 47) / 33);
        if (!arg3.field5316 && (!class415.method2495(1, arg2) || !class415.method2495(1, arg0))) {
            return arg3.field5358 ? new class279(arg3, 34037, arg2, arg0, arg1, arg5) : new class279(arg3, arg2, arg0, class476.method2841(arg2, true), class476.method2841(arg0, true), arg5);
        } else {
            return new class279(arg3, 3553, arg2, arg0, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1536(long arg0, int arg1) {
        field3317++;
        class79 var4 = (class79) this.field3308.method2605(false, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method142((byte) -126);
        if (arg1 != 0) {
            field3323 = -103;
        }
        if (var5 == null) {
            var4.method2049(-81);
            var4.method1783((byte) -113);
            this.field3314 += var4.field1191;
            return null;
        }
        if (var4.method141((byte) 55)) {
            class22 var6 = new class22(var5, var4.field1191);
            this.field3308.method2606(var6, var4.field4736, 0);
            this.field3306.method518(arg1, var6);
            var6.field3936 = 0L;
            var4.method2049(-115);
            var4.method1783((byte) -70);
        } else {
            this.field3306.method518(0, var4);
            var4.field3936 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1537(int arg0) {
        field3325 = null;
        if (arg0 < 72) {
            field3320 = null;
        }
        field3320 = null;
        field3326 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1538(byte arg0) {
        field3321++;
        if (arg0 >= -87) {
            return null;
        }
        class79 var2 = (class79) this.field3308.method2603(117);
        while (var2 != null) {
            Object var3 = var2.method142((byte) 20);
            if (var3 != null) {
                return var3;
            }
            class79 var4 = var2;
            var2 = (class79) this.field3308.method2603(89);
            var4.method2049(-103);
            var4.method1783((byte) -74);
            this.field3314 += var2.field1191;
        }
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public final void method1539(int arg0) {
        field3322++;
        if (arg0 > -52) {
            return;
        }
        for (class79 var2 = (class79) this.field3306.method514((byte) 115); var2 != null; var2 = (class79) this.field3306.method517((byte) -119)) {
            if (var2.method141((byte) 55)) {
                var2.method2049(-53);
                var2.method1783((byte) -68);
                this.field3314 += var2.field1191;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public final void method1540(int arg0) {
        this.field3306.method512(arg0 + 2);
        field3304++;
        this.field3308.method2601(arg0 - 21859);
        this.field3314 = this.field3316;
        if (arg0 != 0) {
            this.field3306 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(JI)V")
    private final void method1541(long arg0, int arg1) {
        field3315++;
        int var4 = -39 % ((arg1 + 60) / 33);
        class79 var5 = (class79) this.field3308.method2605(false, arg0);
        this.method1544(0, var5);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
    public final void method1542(Object arg0, byte arg1, long arg2) {
        if (arg1 != 112) {
            this.method1544(44, null);
        }
        field3311++;
        this.method1549(-74, arg2, 1, arg0);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
    public final int method1543(int arg0) {
        if (arg0 != -29655) {
            return 63;
        }
        field3305++;
        int var2 = 0;
        for (class79 var3 = (class79) this.field3306.method514((byte) 117); var3 != null; var3 = (class79) this.field3306.method517((byte) -119)) {
            if (!var3.method141((byte) 55)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILgm;)V")
    private final void method1544(int arg0, class79 arg1) {
        field3310++;
        if (arg1 != null) {
            arg1.method2049(arg0 ^ 0xFFFFFFBA);
            arg1.method1783((byte) -115);
            this.field3314 += arg1.field1191;
        }
        if (arg0 != 0) {
            this.method1547((byte) -20);
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1545(int arg0) {
        int var2 = 87 / ((arg0 + 78) / 39);
        field3309++;
        class79 var3 = (class79) this.field3308.method2608(true);
        while (var3 != null) {
            Object var4 = var3.method142((byte) -124);
            if (var4 != null) {
                return var4;
            }
            class79 var5 = var3;
            var3 = (class79) this.field3308.method2603(42);
            var5.method2049(-88);
            var5.method1783((byte) -123);
            this.field3314 += var3.field1191;
        }
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
    public class226(int arg0) {
        this.field3314 = arg0;
        this.field3316 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3308 = new class433(var2);
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)I")
    public final int method1546(int arg0) {
        if (arg0 <= 63) {
            this.field3306 = null;
        }
        field3307++;
        return this.field3314;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)I")
    public final int method1547(byte arg0) {
        field3327++;
        return arg0 < 88 ? -27 : this.field3316;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public static final void method1548(int arg0) {
        field3313++;
        int var1 = class74.field1105;
        int[] var2 = class272.field3948;
        for (int var3 = 0; var3 < var1; var3++) {
            class239 var7 = class44.field707[var2[var3]];
            if (var7 != null && var7.field1914 > 0) {
                var7.field1914--;
                if (var7.field1914 == 0) {
                    var7.field1944 = null;
                }
            }
        }
        if (arg0 != -20815) {
            field3323 = -124;
        }
        for (int var4 = 0; var4 < class402.field6044; var4++) {
            int var5 = class378.field5766[var4];
            class167 var6 = class193.field2821[var5];
            if (var6 != null && var6.field1914 > 0) {
                var6.field1914--;
                if (var6.field1914 == 0) {
                    var6.field1944 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJILjava/lang/Object;)V")
    private final void method1549(int arg0, long arg1, int arg2, Object arg3) {
        field3319++;
        if (this.field3316 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method1541(arg1, -117);
        this.field3314 -= arg2;
        while (this.field3314 < 0) {
            class79 var7 = (class79) this.field3306.method511(110);
            this.method1544(0, var7);
        }
        class22 var6 = new class22(arg3, arg2);
        if (arg0 < -16) {
            this.field3308.method2606(var6, arg1, 0);
            this.field3306.method518(0, var6);
            var6.field3936 = 0L;
        }
    }
}
