import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class215 {

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private int field2506 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lpfa;")
    private class295 field2503;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "F")
    public static float field2502;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "F")
    public static float field2504;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "F")
    public static float field2510;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lmc;")
    private class134 field2509;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lg;")
    public static class155[] field2498;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILfh;IIIIILha;IIII)V")
    public static final void method1260(int arg0, class649 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class58 arg7, int arg8, int arg9, int arg10, int arg11) {
        field2499++;
        if (arg4 > arg6 && arg4 < arg5 + arg6 && (arg11 - 13) < arg10 && (arg11 + 3) > arg10 && arg1.field9275) {
            arg2 = arg3;
        }
        int[] var12 = null;
        if (arg8 != -2) {
            method1261(null, true, null, true);
        }
        if (class657.method3746((byte) 80, arg1.field9270)) {
            var12 = class361.field4643.method912((byte) 1, (int) arg1.field9272).field6258;
        } else if (arg1.field9263 != -1) {
            var12 = class361.field4643.method912((byte) 1, arg1.field9263).field6258;
        } else if (class411.method2523(75, arg1.field9270)) {
            class151 var13 = (class151) class253.field3052.method1754(false, (long) ((int) arg1.field9272));
            if (var13 != null) {
                class197 var14 = var13.field1661;
                class326 var15 = var14.field2293;
                if (var15.field4199 != null) {
                    var15 = var15.method1939(true, class722.field10125);
                }
                if (var15 != null) {
                    var12 = var15.field4221;
                }
            }
        } else if (class59.method455((byte) 106, arg1.field9270)) {
            Object var16 = null;
            class316 var17;
            if (arg1.field9270 == 1003) {
                var17 = class445.field6442.method3972((byte) 119, (int) arg1.field9272);
            } else {
                var17 = class445.field6442.method3972((byte) 110, (int) (arg1.field9272 >>> 32 & 0x7FFFFFFFL));
            }
            if (var17.field4045 != null) {
                var17 = var17.method1886(class722.field10125, -67);
            }
            if (var17 != null) {
                var12 = var17.field4040;
            }
        }
        String var18 = class98.method686(31734, arg1);
        if (var12 != null) {
            var18 = var18 + class659.method3756(var12, arg8 ^ 0xFFFFFFC0);
        }
        class567.field8070.method452(arg2, class740.field10345, arg11, var18, arg6 + 3, class126.field1322, (byte) -39, 0);
        if (arg1.field9264) {
            class542.field7795.method824((arg6 + class96.field1014.method3137((byte) -54, var18)) + 5, arg11 - 12);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Loh;ZLjava/lang/String;Z)Laga;")
    public static final class664 method1261(class404 arg0, boolean arg1, String arg2, boolean arg3) {
        field2501++;
        int var4 = arg0.method2474(72, arg2);
        if (var4 == -1) {
            return new class664(0);
        }
        if (arg1) {
            field2502 = -1.2139603F;
        }
        int[] var5 = arg0.method2470((byte) -121, var4);
        class664 var6 = new class664(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field9447 > var7) {
                class244 var9 = new class244(arg0.method2481(var4, var5[var8++], (byte) 122));
                int var10 = var9.method1438(113);
                int var11 = var9.method1476(-3);
                int var12 = var9.method1423(-13);
                if (!arg3 && var12 == 1) {
                    var6.field9447--;
                } else {
                    var6.field9449[var7] = var10;
                    var6.field9446[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lmc;")
    public final class134 method1262(int arg0) {
        this.field2506 = arg0;
        field2507++;
        return this.method1264(113);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field2498 = null;
        if (arg0 != 0) {
            method1263(10);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lmc;")
    public final class134 method1264(int arg0) {
        if (arg0 < 76) {
            this.field2506 = -71;
        }
        field2508++;
        if (this.field2506 > 0 && this.field2503.field3637[this.field2506 - 1] != this.field2509) {
            class134 var2 = this.field2509;
            this.field2509 = var2.field1521;
            return var2;
        }
        while (this.field2503.field3625 > this.field2506) {
            class134 var3 = this.field2503.field3637[this.field2506++].field1521;
            if (this.field2503.field3637[this.field2506 - 1] != var3) {
                this.field2509 = var3.field1521;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class215() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lpfa;)V")
    public class215(class295 arg0) {
        this.field2503 = arg0;
    }
}
