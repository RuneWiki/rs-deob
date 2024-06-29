import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class183 {

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "Ljg;")
    private class241 field2753 = new class241(64);

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "Ljg;")
    public class241 field2757 = new class241(50);

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Lbn;")
    public class267 field2758 = new class267(250);

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Lwm;")
    private class418 field2759 = new class418();

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "Z")
    private boolean field2755;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "Liq;")
    public class134 field2744;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Liq;")
    private class134 field2750;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field2760;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field2762;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "[I")
    public static int[] field2748;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Liq;")
    public static class134 field2741;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Lkr;")
    public static class234 field2754;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Ljd;")
    public static class361 field2740;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sn", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2763;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sn", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2764;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sn", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field2765;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public final void method1105(byte arg0) {
        field2747++;
        class241 var2 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method1482((byte) -118);
        }
        class241 var3 = this.field2757;
        synchronized (this.field2757) {
            this.field2757.method1482((byte) -120);
        }
        class267 var4 = this.field2758;
        synchronized (this.field2758) {
            if (arg0 >= -41) {
                this.method1118(-116);
            }
            this.field2758.method1662((byte) -105);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lko;")
    public final class167 method1106(int arg0, int arg1) {
        field2735++;
        class241 var3 = this.field2753;
        class167 var4;
        synchronized (this.field2753) {
            var4 = (class167) this.field2753.method1491((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2750.method823(class409.method2570(23346, arg1), -20334, class99.method636(-28156, arg1));
        class167 var6 = new class167();
        var6.field2342 = this;
        var6.field2319 = arg1;
        var6.field2336 = new String[] { null, null, class170.field2472.method937((byte) -90, this.field2742), null, null };
        if (arg0 != 50) {
            this.method1111((byte) -91);
        }
        var6.field2348 = new String[] { null, null, null, null, class149.field2062.method937((byte) 127, this.field2742) };
        if (var5 != null) {
            var6.method1009(true, new class385(var5));
        }
        var6.method1004(arg0 ^ 0x45);
        if (var6.field2345 != -1) {
            var6.method1016(this.method1106(arg0, var6.field2345), this.method1106(50, var6.field2376), (byte) 16);
        }
        if (var6.field2372 != -1) {
            var6.method1015(this.method1106(arg0, var6.field2372), this.method1106(50, var6.field2350), -5);
        }
        if (!this.field2755 && var6.field2387) {
            var6.field2329 = class55.field741.method937((byte) 101, this.field2742);
            var6.field2357 = null;
            var6.field2348 = this.field2762;
            var6.field2359 = false;
            var6.field2326 = 0;
            var6.field2336 = this.field2760;
            if (var6.field2351 != null) {
                boolean var7 = false;
                for (class97 var8 = var6.field2351.method2296(5773); var8 != null; var8 = var6.field2351.method2304(arg0 ^ 0x56)) {
                    class15 var9 = class19.method123((int) var8.field1339, (byte) -103);
                    if (var9.field187) {
                        var8.method625((byte) -50);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field2351 = null;
                }
            }
        }
        class241 var10 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method1488(128, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
    public final void method1107(int arg0, boolean arg1) {
        field2749++;
        if (this.field2755 == arg1) {
            return;
        }
        this.field2755 = arg1;
        if (arg0 != -1) {
            field2748 = null;
        }
        this.method1111((byte) 107);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZLjava/awt/Canvas;Lsc;Lec;)Ldr;")
    public static final class261 method1108(int arg0, int arg1, boolean arg2, Canvas arg3, class239 arg4, class96 arg5) {
        if (arg2) {
            return null;
        }
        field2739++;
        try {
            Class var6 = Class.forName("cg");
            Constructor var7 = var6.getConstructor(field2763 == null ? (field2763 = method1120("java.awt.Canvas")) : field2763, field2764 == null ? (field2764 = method1120("ec")) : field2764, Integer.TYPE, Integer.TYPE, field2765 == null ? (field2765 = method1120("sc")) : field2765);
            return (class261) var7.newInstance(arg3, arg5, Integer.valueOf(arg0), new Integer(arg1), arg4);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public final void method1109(boolean arg0) {
        field2751++;
        class241 var2 = this.field2757;
        synchronized (this.field2757) {
            this.field2757.method1485(-22032);
        }
        if (!arg0) {
            this.method1109(false);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V")
    public final void method1110(byte arg0, int arg1) {
        if (arg0 > -56) {
            this.method1107(30, true);
        }
        this.field2761 = arg1;
        field2733++;
        class241 var3 = this.field2757;
        synchronized (this.field2757) {
            this.field2757.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        if (arg0 < 99) {
            method1114(87, 12);
        }
        field2746++;
        class241 var2 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method1485(-22032);
        }
        class241 var3 = this.field2757;
        synchronized (this.field2757) {
            this.field2757.method1485(-22032);
        }
        class267 var4 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method1657((byte) -127);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1112(String arg0, byte arg1) {
        if (arg1 < 11) {
            field2741 = null;
        }
        field2738++;
        String var2 = class86.method560(-117, class55.method317(arg0, (byte) 51));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lwe;ILlp;IILdr;ILdr;ZIZI)Lkr;")
    public final class234 method1113(class128 arg0, int arg1, class137 arg2, int arg3, int arg4, class261 arg5, int arg6, class261 arg7, boolean arg8, int arg9, boolean arg10, int arg11) {
        field2756++;
        class234 var13 = this.method1115(arg6, arg11, -96, arg1, arg9, arg5, arg4, arg0);
        if (var13 != null) {
            return var13;
        }
        class167 var14 = this.method1106(50, arg9);
        if (arg3 != 0) {
            this.field2762 = null;
        }
        if (arg11 > 1 && var14.field2379 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg11 >= var14.field2395[var16] && var14.field2395[var16] != 0) {
                    var15 = var14.field2379[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1106(50, var15);
            }
        }
        int[] var17 = var14.method1010(arg10, arg7, (byte) -67, arg11, arg2, arg6, arg5, arg1, arg4, arg0);
        if (var17 == null) {
            return null;
        }
        class234 var18;
        if (arg8) {
            var18 = arg7.method401(var17, 0, 36, 36, 32);
        } else {
            var18 = arg5.method401(var17, 0, 36, 36, 32);
        }
        if (!arg8) {
            class418 var19 = new class418();
            var19.field6197 = arg9;
            var19.field6188 = arg1;
            var19.field6186 = arg11;
            var19.field6192 = arg5.field3971;
            var19.field6194 = arg6;
            var19.field6187 = arg0 != null;
            var19.field6195 = arg4;
            this.field2758.method1652(var19, (byte) -100, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)V")
    public static final void method1114(int arg0, int arg1) {
        class426.field6263 = 100;
        field2752++;
        class71.field911 = -1;
        class354.field5228 = 3;
        if (arg0 == 25105) {
            class327.field4919 = arg1;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIILdr;ILwe;)Lkr;")
    public final class234 method1115(int arg0, int arg1, int arg2, int arg3, int arg4, class261 arg5, int arg6, class128 arg7) {
        this.field2759.field6186 = arg1;
        this.field2759.field6194 = arg0;
        this.field2759.field6195 = arg6;
        field2734++;
        this.field2759.field6192 = arg5.field3971;
        this.field2759.field6187 = arg7 != null;
        if (arg2 >= -53) {
            this.field2743 = 34;
        }
        this.field2759.field6197 = arg4;
        this.field2759.field6188 = arg3;
        return (class234) this.field2758.method1659(this.field2759, -16397);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Lof;")
    public static final class360 method1116(int arg0) {
        field2737++;
        try {
            return new class197();
        } catch (Throwable var2) {
            if (arg0 != 21671) {
                method1116(15);
            }
            try {
                return (class360) Class.forName("ag").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class24();
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V")
    public static void method1117(byte arg0) {
        field2754 = null;
        field2748 = null;
        field2740 = null;
        if (arg0 >= -92) {
            method1108(1, 22, true, (Canvas) null, (class239) null, (class96) null);
        }
        field2741 = null;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public final void method1118(int arg0) {
        field2736++;
        class267 var2 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method1657((byte) -127);
        }
        int var3 = 89 % ((arg0 - 1) / 42);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(BI)V")
    public final void method1119(byte arg0, int arg1) {
        class241 var3 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method1481(3, arg1);
        }
        field2745++;
        class241 var4 = this.field2757;
        synchronized (this.field2757) {
            this.field2757.method1481(3, arg1);
        }
        if (arg0 >= -37) {
            field2748 = null;
        }
        class267 var5 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method1658(arg1, 21156);
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lrg;IZLiq;Liq;)V")
    public class183(class406 arg0, int arg1, boolean arg2, class134 arg3, class134 arg4) {
        this.field2755 = arg2;
        this.field2742 = arg1;
        this.field2744 = arg4;
        this.field2750 = arg3;
        if (this.field2750 != null) {
            int var6 = this.field2750.method824(28970) - 1;
            this.field2743 = var6 * 256 + this.field2750.method812(var6, (byte) -41);
        }
        this.field2760 = new String[] { null, null, class170.field2472.method937((byte) 111, this.field2742), null, null };
        this.field2762 = new String[] { null, null, null, null, class149.field2062.method937((byte) 122, this.field2742) };
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1120(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field2748 = new int[] { 16, 32, 64, 128 };
    }
}
