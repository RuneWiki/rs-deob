import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class518 {

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "Lka;")
    private class473 field7599 = new class473(64);

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "Lka;")
    public class473 field7617 = new class473(50);

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "Lit;")
    public class392 field7618 = new class392(250);

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "Lgo;")
    private class309 field7619 = new class309();

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Ldk;")
    public class421 field7610;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "Lke;")
    private class364 field7621;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public int field7605;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Z")
    private boolean field7596;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Ldk;")
    private class421 field7608;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public int field7602;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field7622;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field7623;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Lat;")
    public static class444 field7597 = null;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Lkc;")
    public static class157 field7600 = new class157("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "Ljava/lang/String;")
    public static String field7611 = "";

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "S")
    public static short field7615 = 32767;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Lde;")
    public static class10 field7613 = new class10(7, 0, 1, 1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public int field7620;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lza;Lur;BIIIII)Lo;", line = 3)
    public final class359 method3084(class295 arg0, class291 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7619.field4194 = arg6;
        this.field7619.field4198 = arg7;
        this.field7619.field4197 = arg0.field3976;
        this.field7619.field4204 = arg5;
        field7601++;
        this.field7619.field4195 = arg1 != null;
        this.field7619.field4193 = arg4;
        this.field7619.field4202 = arg3;
        if (arg2 != -4) {
            this.method3090((byte) -85);
        }
        return (class359) this.field7618.method2331(-115, this.field7619);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V", line = 25)
    public final void method3085(byte arg0, int arg1) {
        field7606++;
        if (arg0 != -72) {
            return;
        }
        this.field7620 = arg1;
        class473 var3 = this.field7617;
        synchronized (this.field7617) {
            this.field7617.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lza;IZILza;IZIIILla;Lur;)Lo;", line = 47)
    public final class359 method3086(class295 arg0, int arg1, boolean arg2, int arg3, class295 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class306 arg10, class291 arg11) {
        field7609++;
        class359 var13 = this.method3084(arg0, arg11, (byte) -4, arg3, arg1, arg8, arg7, arg5);
        if (var13 != null) {
            return var13;
        }
        class297 var14 = this.method3089(arg7, -48);
        if (arg8 > 1 && var14.field4011 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg8 >= var14.field4055[var16] && var14.field4055[var16] != 0) {
                    var15 = var14.field4011[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3089(var15, -57);
            }
        }
        int[] var17 = var14.method1734(arg5, arg4, 32, arg0, arg2, arg11, arg1, arg3, arg10, arg8);
        if (var17 == null) {
            return null;
        }
        class359 var18;
        if (arg6) {
            var18 = arg4.method510(var17, 0, 36, 36, 32);
        } else {
            var18 = arg0.method510(var17, 0, 36, 36, 32);
        }
        if (!arg6) {
            class309 var19 = new class309();
            var19.field4195 = arg11 != null;
            var19.field4204 = arg8;
            var19.field4193 = arg1;
            var19.field4198 = arg5;
            var19.field4197 = arg0.field3976;
            var19.field4202 = arg3;
            var19.field4194 = arg7;
            this.field7618.method2334(25338, var18, var19);
        }
        int var20 = 114 / ((arg9 + 26) / 49);
        return var18;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZZ)V", line = 117)
    public final void method3087(boolean arg0, boolean arg1) {
        field7603++;
        if (this.field7596 == arg1) {
            return;
        }
        this.field7596 = arg1;
        this.method3088(-73);
        if (arg0) {
            this.field7623 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 133)
    public final void method3088(int arg0) {
        class473 var2 = this.field7599;
        synchronized (this.field7599) {
            this.field7599.method2764(-769);
        }
        field7604++;
        class473 var3 = this.field7617;
        synchronized (this.field7617) {
            int var4 = -48 % ((9 - arg0) / 32);
            this.field7617.method2764(-769);
        }
        class392 var5 = this.field7618;
        synchronized (this.field7618) {
            this.field7618.method2333(45);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)Lqt;", line = 151)
    public final class297 method3089(int arg0, int arg1) {
        field7612++;
        class473 var3 = this.field7599;
        class297 var4;
        synchronized (this.field7599) {
            var4 = (class297) this.field7599.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field7608;
        byte[] var6;
        synchronized (this.field7608) {
            var6 = this.field7608.method2512(class363.method2169(128, arg0), (byte) -93, class330.method1948(-28009, arg0));
        }
        class297 var7 = new class297();
        var7.field4033 = arg0;
        var7.field4065 = this;
        var7.field4039 = new String[] { null, null, class496.field7222.method1126(this.field7605, (byte) -19), null, null };
        var7.field4082 = new String[] { null, null, null, null, class222.field3138.method1126(this.field7605, (byte) -19) };
        if (var6 != null) {
            var7.method1738((byte) -122, new class319(var6));
        }
        var7.method1733(-73);
        if (var7.field4050 != -1) {
            var7.method1727(this.method3089(var7.field4075, -27), this.method3089(var7.field4050, -68), 123);
        }
        if (var7.field4046 != -1) {
            var7.method1732(this.method3089(var7.field4086, 114), this.method3089(var7.field4046, 113), (byte) 16);
        }
        int var8 = -103 / ((arg1 - 80) / 33);
        if (!this.field7596 && var7.field4024) {
            var7.field4068 = class102.field1599.method1126(this.field7605, (byte) -19);
            var7.field4072 = null;
            var7.field4053 = 0;
            var7.field4078 = false;
            var7.field4082 = this.field7623;
            var7.field4039 = this.field7622;
            if (var7.field4074 != null) {
                boolean var9 = false;
                for (class476 var10 = var7.field4074.method1588(79); var10 != null; var10 = var7.field4074.method1582(-111)) {
                    class145 var11 = this.field7621.method2181((byte) 104, (int) var10.field6883);
                    if (var11.field2134) {
                        var10.method2791((byte) 112);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var7.field4074 = null;
                }
            }
        }
        class473 var12 = this.field7599;
        synchronized (this.field7599) {
            this.field7599.method2777(-1025, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 236)
    public final void method3090(byte arg0) {
        class473 var2 = this.field7599;
        synchronized (this.field7599) {
            if (arg0 > -105) {
                this.field7619 = null;
            }
            this.field7599.method2774((byte) -48);
        }
        field7607++;
        class473 var3 = this.field7617;
        synchronized (this.field7617) {
            this.field7617.method2774((byte) 126);
        }
        class392 var4 = this.field7618;
        synchronized (this.field7618) {
            this.field7618.method2330((byte) 22);
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V", line = 256)
    public static void method3091(byte arg0) {
        field7611 = null;
        field7600 = null;
        field7597 = null;
        if (arg0 >= -99) {
            method3091((byte) -125);
        }
        field7613 = null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lad;IZLke;Ldk;Ldk;)V", line = 351)
    public class518(class12 arg0, int arg1, boolean arg2, class364 arg3, class421 arg4, class421 arg5) {
        this.field7610 = arg5;
        this.field7621 = arg3;
        this.field7605 = arg1;
        this.field7596 = arg2;
        this.field7608 = arg4;
        if (this.field7608 == null) {
            this.field7602 = 0;
        } else {
            int var7 = this.field7608.method2493((byte) -41) - 1;
            this.field7602 = this.field7608.method2509(0, var7) + var7 * 256;
        }
        this.field7622 = new String[] { null, null, class496.field7222.method1126(this.field7605, (byte) -19), null, null };
        this.field7623 = new String[] { null, null, null, null, class222.field3138.method1126(this.field7605, (byte) -19) };
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V", line = 274)
    public final void method3092(boolean arg0) {
        if (!arg0) {
            this.method3084(null, null, (byte) -109, 1, -22, -2, -110, 80);
        }
        class473 var2 = this.field7617;
        synchronized (this.field7617) {
            this.field7617.method2764(-769);
        }
        field7616++;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V", line = 287)
    public final void method3093(byte arg0) {
        class392 var2 = this.field7618;
        synchronized (this.field7618) {
            if (arg0 <= 26) {
                return;
            }
            this.field7618.method2333(-97);
        }
        field7614++;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)V", line = 305)
    public final void method3094(int arg0, int arg1) {
        class473 var3 = this.field7599;
        synchronized (this.field7599) {
            this.field7599.method2779(arg0 + 15562, arg1);
        }
        field7598++;
        class473 var4 = this.field7617;
        synchronized (this.field7617) {
            this.field7617.method2779(14896, arg1);
        }
        class392 var5 = this.field7618;
        synchronized (this.field7618) {
            if (arg0 == -666) {
                this.field7618.method2325(arg1, 115);
            }
        }
    }
}
