import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class430 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Liu;")
    private class356 field6389;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Ltc;")
    private class359 field6396;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lbi;")
    private class103 field6397;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Z")
    public static boolean field6388 = false;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Ljb;")
    public static class499 field6398 = null;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field6399 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Ldl;")
    public static class48 field6387 = new class48(2);

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[[S")
    public static short[][] field6400 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lui;")
    public static class375 field6401 = new class375("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field6402 = -1;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ltl;")
    private class91 field6391;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[Lqg;")
    private class205[] field6392;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILqa;IIIIIZII[[[B)V")
    public static final void method2576(int arg0, int arg1, int arg2, class496 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, byte[][][] arg12) {
        field6394++;
        if (arg5 == 0 || arg1 == 0) {
            return;
        }
        if (arg5 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 10) {
            arg10 = arg10 + 3 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg5 = 8;
        }
        if (arg9) {
            method2576(-97, 98, 52, null, 31, 14, -124, -22, 77, false, 113, -85, null);
        }
        arg3.method1086(arg0, arg4, arg2, arg6, arg7, arg11, arg12[arg5 - 1][arg10], arg1, arg8);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public final void method2577(byte arg0) {
        field6385++;
        if (this.field6392 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6392.length; var2++) {
            if (this.field6392[var2] != null) {
                this.field6392[var2].method1426(31431);
            }
        }
        if (arg0 != 101) {
            method2580((byte) -116, (byte) -77);
        }
        for (int var3 = 0; var3 < this.field6392.length; var3++) {
            if (this.field6392[var3] != null) {
                this.field6392[var3].method1427(127);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lht;BLht;ZI)Lqg;")
    private final class205 method2578(class80 arg0, byte arg1, class80 arg2, boolean arg3, int arg4) {
        field6393++;
        if (this.field6391 == null) {
            throw new RuntimeException();
        }
        this.field6391.field1292 = arg4 * 8 + 5;
        if (this.field6391.field1292 >= this.field6391.field1277.length) {
            throw new RuntimeException();
        } else if (this.field6392[arg4] == null) {
            int var6 = this.field6391.method626((byte) 100);
            int var7 = this.field6391.method626((byte) 100);
            class205 var8 = new class205(arg4, arg0, arg2, this.field6389, this.field6396, var6, var7, arg3);
            this.field6392[arg4] = var8;
            return arg1 >= -108 ? null : var8;
        } else {
            return this.field6392[arg4];
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILht;Lht;I)Lqg;")
    public final class205 method2579(int arg0, class80 arg1, class80 arg2, int arg3) {
        field6386++;
        if (arg3 != 8404) {
            field6398 = null;
        }
        return this.method2578(arg1, (byte) -125, arg2, true, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BB)V")
    public static final void method2580(byte arg0, byte arg1) {
        field6390++;
        if (class307.field4504 == null) {
            class307.field4504 = new byte[4][class96.field1403][class485.field7122];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class96.field1403; var3++) {
                for (int var4 = 0; var4 < class485.field7122; var4++) {
                    class307.field4504[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 13) {
            method2583(-115, -8, -77, -6);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method2581(int arg0) {
        field6401 = null;
        field6387 = null;
        field6398 = null;
        field6400 = null;
        if (arg0 != -12189) {
            field6402 = -62;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Z")
    public final boolean method2582(int arg0) {
        field6395++;
        if (this.field6391 != null) {
            return true;
        }
        if (this.field6397 == null) {
            if (this.field6389.method2252(20)) {
                return false;
            }
            this.field6397 = this.field6389.method2251(true, (byte) -122, 255, (byte) 0, 255);
        }
        if (arg0 != 255) {
            field6398 = null;
        }
        if (this.field6397.field5535) {
            return false;
        } else {
            this.field6391 = new class91(this.field6397.method696(arg0 ^ 0xFFFFFF6D));
            this.field6392 = new class205[(this.field6391.field1277.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Liu;Ltc;)V")
    public class430(class356 arg0, class359 arg1) {
        this.field6389 = arg0;
        this.field6396 = arg1;
        if (!this.field6389.method2252(20)) {
            this.field6397 = this.field6389.method2251(true, (byte) -125, 255, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2583(int arg0, int arg1, int arg2, int arg3) {
        if (class263.method1697(arg0, arg1, arg2)) {
            int var4 = arg1 << class386.field5882;
            int var5 = arg2 << class386.field5882;
            return class421.method2537(var4 + 1, class455.field6683[arg0].method849(arg1, arg2) + arg3, var5 + 1) && class421.method2537(class215.field2995 + var4 - 1, class455.field6683[arg0].method849(arg1 + 1, arg2) + arg3, var5 + 1) && class421.method2537(class215.field2995 + var4 - 1, class455.field6683[arg0].method849(arg1 + 1, arg2 + 1) + arg3, class215.field2995 + var5 - 1) && class421.method2537(var4 + 1, class455.field6683[arg0].method849(arg1, arg2 + 1) + arg3, class215.field2995 + var5 - 1);
        } else {
            return false;
        }
    }
}
