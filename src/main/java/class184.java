import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class184 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Ldc;")
    private class5 field2601 = new class5(64);

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "Ldc;")
    public class5 field2620 = new class5(50);

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Lve;")
    public class331 field2621 = new class331(250);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Lj;")
    private class362 field2622 = new class362();

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "Loj;")
    private class246 field2626;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lhe;")
    private class239 field2600;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
    private boolean field2613;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lhe;")
    public class239 field2604;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2624;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field2625;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2605 = 0;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Z")
    public static boolean field2606 = false;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lhe;")
    public static class239 field2614;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Lhe;")
    public static class239 field2616;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 4)
    public final void method1151(int arg0) {
        if (arg0 != -1) {
            field2616 = null;
        }
        field2599++;
        class5 var2 = this.field2620;
        synchronized (this.field2620) {
            this.field2620.method38((byte) -28);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILwb;Leq;III)Lqg;", line = 20)
    public final class307 method1152(int arg0, int arg1, int arg2, class206 arg3, class134 arg4, int arg5, int arg6, int arg7) {
        field2608++;
        this.field2622.field5439 = arg0;
        this.field2622.field5448 = arg6;
        this.field2622.field5441 = arg1;
        this.field2622.field5436 = arg4.field1706;
        this.field2622.field5435 = arg7;
        this.field2622.field5440 = arg3 != null;
        if (arg2 == 16131) {
            this.field2622.field5445 = arg5;
            return (class307) this.field2621.method1992(this.field2622, arg2 ^ 0x3F18);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V", line = 40)
    public final void method1153(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        this.field2623 = arg1;
        field2607++;
        class5 var3 = this.field2620;
        synchronized (this.field2620) {
            this.field2620.method38((byte) -53);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V", line = 59)
    public final void method1154(byte arg0, boolean arg1) {
        field2603++;
        if (this.field2613 == arg1) {
            return;
        }
        this.field2613 = arg1;
        if (arg0 > -78) {
            this.field2624 = null;
        }
        this.method1156((byte) -40);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILeq;IZLwb;IZILhr;IILeq;)Lqg;", line = 74)
    public final class307 method1155(int arg0, class134 arg1, int arg2, boolean arg3, class206 arg4, int arg5, boolean arg6, int arg7, class348 arg8, int arg9, int arg10, class134 arg11) {
        field2615++;
        class307 var13 = this.method1152(arg2, arg9, 16131, arg4, arg1, arg10, arg7, arg0);
        if (var13 != null) {
            return var13;
        }
        class361 var14 = this.method1162(arg10, 0);
        if (arg9 > 1 && var14.field5414 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg9 >= var14.field5397[var16] && var14.field5397[var16] != 0) {
                    var15 = var14.field5414[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1162(var15, 0);
            }
        }
        int[] var17 = var14.method2200(arg1, arg4, arg8, arg7, arg0, arg6, arg9, arg11, (byte) -68, arg2);
        if (var17 == null) {
            return null;
        }
        class307 var18;
        if (arg3) {
            var18 = arg11.method784(var17, 0, 36, 36, 32);
        } else {
            var18 = arg1.method784(var17, 0, 36, 36, 32);
        }
        if (arg5 < 114) {
            this.method1155(119, null, 109, true, null, 3, true, -77, null, 94, -122, null);
        }
        if (!arg3) {
            class362 var19 = new class362();
            var19.field5448 = arg7;
            var19.field5445 = arg10;
            var19.field5441 = arg9;
            var19.field5435 = arg0;
            var19.field5436 = arg1.field1706;
            var19.field5439 = arg2;
            var19.field5440 = arg4 != null;
            this.field2621.method1999(var19, 1, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 141)
    public final void method1156(byte arg0) {
        if (arg0 >= -2) {
            this.method1158(64);
        }
        field2612++;
        class5 var2 = this.field2601;
        synchronized (this.field2601) {
            this.field2601.method38((byte) -122);
        }
        class5 var3 = this.field2620;
        synchronized (this.field2620) {
            this.field2620.method38((byte) -41);
        }
        class331 var4 = this.field2621;
        synchronized (this.field2621) {
            this.field2621.method1993((byte) 47);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V", line = 160)
    public final void method1157(int arg0, boolean arg1) {
        class5 var3 = this.field2601;
        synchronized (this.field2601) {
            this.field2601.method39(arg1, arg0);
        }
        field2617++;
        class5 var4 = this.field2620;
        synchronized (this.field2620) {
            this.field2620.method39(false, arg0);
        }
        class331 var5 = this.field2621;
        synchronized (this.field2621) {
            this.field2621.method1996(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 177)
    public final void method1158(int arg0) {
        field2611++;
        class331 var2 = this.field2621;
        synchronized (this.field2621) {
            this.field2621.method1993((byte) 82);
        }
        if (arg0 != 0) {
            this.method1162(83, -63);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 192)
    public static void method1159(int arg0) {
        field2614 = null;
        if (arg0 != 32) {
            method1160(-39, (byte) -91);
        }
        field2616 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 209)
    public static final void method1160(int arg0, byte arg1) {
        if (arg1 != -121) {
            method1159(4);
        }
        field2618++;
        class406.field5965 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 226)
    public final void method1161(byte arg0) {
        field2602++;
        class5 var2 = this.field2601;
        synchronized (this.field2601) {
            this.field2601.method35((byte) -1);
        }
        class5 var3 = this.field2620;
        synchronized (this.field2620) {
            this.field2620.method35((byte) -1);
        }
        class331 var4 = this.field2621;
        synchronized (this.field2621) {
            this.field2621.method1994(125);
            int var5 = -91 / ((-arg0 - 16) / 59);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lac;", line = 248)
    public final class361 method1162(int arg0, int arg1) {
        field2609++;
        class5 var3 = this.field2601;
        class361 var4;
        synchronized (this.field2601) {
            var4 = (class361) this.field2601.method40(arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2600.method1470(4, class325.method1946(arg0, -80), class305.method1836((byte) -65, arg0));
        class361 var6 = new class361();
        var6.field5359 = this;
        var6.field5411 = arg0;
        var6.field5355 = new String[] { null, null, class84.field1138.method1220(2969, this.field2610), null, null };
        var6.field5381 = new String[] { null, null, null, null, class72.field1054.method1220(2969, this.field2610) };
        if (var5 != null) {
            var6.method2207(new class156(var5), -1);
        }
        var6.method2203((byte) -86);
        if (var6.field5431 != -1) {
            var6.method2189((byte) 104, this.method1162(var6.field5358, 0), this.method1162(var6.field5431, 0));
        }
        if (var6.field5409 != -1) {
            var6.method2199((byte) 60, this.method1162(var6.field5409, 0), this.method1162(var6.field5423, 0));
        }
        if (!this.field2613 && var6.field5382) {
            var6.field5353 = class308.field4469.method1220(2969, this.field2610);
            var6.field5355 = this.field2624;
            var6.field5387 = 0;
            var6.field5430 = null;
            var6.field5407 = false;
            var6.field5381 = this.field2625;
            if (var6.field5389 != null) {
                boolean var7 = false;
                for (class86 var8 = var6.field5389.method2316(4999); var8 != null; var8 = var6.field5389.method2308((byte) -93)) {
                    class483 var9 = this.field2626.method1536((byte) -126, (int) var8.field1177);
                    if (var9.field6992) {
                        var8.method536(false);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field5389 = null;
                }
            }
        }
        class5 var10 = this.field2601;
        synchronized (this.field2601) {
            this.field2601.method36(-20960, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lci;IZLoj;Lhe;Lhe;)V", line = 342)
    public class184(class298 arg0, int arg1, boolean arg2, class246 arg3, class239 arg4, class239 arg5) {
        this.field2626 = arg3;
        this.field2600 = arg4;
        this.field2613 = arg2;
        this.field2610 = arg1;
        this.field2604 = arg5;
        if (this.field2600 == null) {
            this.field2619 = 0;
        } else {
            int var7 = this.field2600.method1466(false) - 1;
            this.field2619 = this.field2600.method1473(4309, var7) + var7 * 256;
        }
        this.field2624 = new String[] { null, null, class84.field1138.method1220(2969, this.field2610), null, null };
        this.field2625 = new String[] { null, null, null, null, class72.field1054.method1220(2969, this.field2610) };
    }
}
