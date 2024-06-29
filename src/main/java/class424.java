import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class424 {

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lbg;")
    private class275 field6319 = new class275();

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    private int field6316;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    private int field6313;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lmt;")
    private class517 field6318;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
    public static int[] field6321 = new int[8];

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Z")
    public static boolean field6325 = false;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "Luv;")
    public static class2 field6320 = new class2(0, 8);

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "F")
    public static float field6328;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILrb;)Ljava/lang/Object;")
    public final Object method2515(int arg0, class284 arg1) {
        field6310++;
        if (arg0 <= 39) {
            this.method2518((byte) 32, null);
        }
        long var3 = arg1.method1767((byte) -110);
        for (class438 var5 = (class438) this.field6318.method3059(81, var3); var5 != null; var5 = (class438) this.field6318.method3057(0)) {
            if (var5.field6448.method1766(arg1, 2655)) {
                Object var6 = var5.method2365(0);
                if (var6 != null) {
                    if (var5.method2368(121)) {
                        class394 var7 = new class394(arg1, var6, var5.field6449);
                        this.field6318.method3055(0, var5.field1739, var7);
                        this.field6319.method1708((byte) -8, var7);
                        var7.field6102 = 0L;
                        var5.method876((byte) -96);
                        var5.method2440(-58);
                    } else {
                        this.field6319.method1708((byte) -8, var5);
                        var5.field6102 = 0L;
                    }
                    return var6;
                }
                var5.method876((byte) -96);
                var5.method2440(-102);
                this.field6316 += var5.field6449;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
    public final void method2516(int arg0, byte arg1) {
        field6327++;
        if (class513.field7509 != null) {
            for (class438 var3 = (class438) this.field6319.method1713(105); var3 != null; var3 = (class438) this.field6319.method1711(21)) {
                if (var3.method2368(127)) {
                    if (var3.method2365(arg1 + 88) == null) {
                        var3.method876((byte) -96);
                        var3.method2440(-56);
                        this.field6316 += var3.field6449;
                    }
                } else if ((long) arg0 < ++var3.field6102) {
                    class438 var4 = class513.field7509.method983((byte) 47, var3);
                    this.field6318.method3055(0, var3.field1739, var4);
                    class481.method2870(var4, false, var3);
                    var3.method876((byte) -96);
                    var3.method2440(-122);
                }
            }
        }
        if (arg1 != -88) {
            field6321 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILrb;ILjava/lang/Object;)V")
    private final void method2517(int arg0, class284 arg1, int arg2, Object arg3) {
        if (arg2 <= 45) {
            this.field6313 = 64;
        }
        field6326++;
        if (arg0 > this.field6313) {
            throw new IllegalStateException("s>cs");
        }
        this.method2518((byte) 121, arg1);
        this.field6316 -= arg0;
        while (this.field6316 < 0) {
            class438 var6 = (class438) this.field6319.method1718((byte) -66);
            this.method2524(1, var6);
        }
        class394 var5 = new class394(arg1, arg3, arg0);
        this.field6318.method3055(0, arg1.method1767((byte) -108), var5);
        this.field6319.method1708((byte) -8, var5);
        var5.field6102 = 0L;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLrb;)V")
    private final void method2518(byte arg0, class284 arg1) {
        field6312++;
        long var3 = arg1.method1767((byte) -108);
        if (arg0 < 76) {
            this.method2518((byte) 119, null);
        }
        for (class438 var5 = (class438) this.field6318.method3059(110, var3); var5 != null; var5 = (class438) this.field6318.method3057(0)) {
            if (var5.field6448.method1766(arg1, 2655)) {
                this.method2524(1, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public final void method2519(boolean arg0) {
        this.field6319.method1709((byte) -54);
        field6317++;
        this.field6318.method3056(arg0);
        this.field6316 = this.field6313;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method2520(int arg0) {
        field6320 = null;
        if (arg0 != 1) {
            method2523(80, 117, 123);
        }
        field6321 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/Object;Lrb;B)V")
    public final void method2521(Object arg0, class284 arg1, byte arg2) {
        if (arg2 == 111) {
            this.method2517(1, arg1, 80, arg0);
            field6314++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I")
    public final int method2522(int arg0) {
        if (arg0 != 8) {
            this.method2516(81, (byte) -63);
        }
        field6315++;
        return this.field6313;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
    public static final void method2523(int arg0, int arg1, int arg2) {
        if (arg0 < -68) {
            field6322++;
            class9.field87 = arg2 - class137.field2035;
            class30.field425 = arg1 - class137.field2036;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILcm;)V")
    private final void method2524(int arg0, class438 arg1) {
        field6323++;
        if (arg0 != 1) {
            field6320 = null;
        }
        if (arg1 != null) {
            arg1.method876((byte) -96);
            arg1.method2440(-97);
            this.field6316 += arg1.field6449;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public final void method2525(byte arg0) {
        field6311++;
        for (class438 var2 = (class438) this.field6319.method1713(105); var2 != null; var2 = (class438) this.field6319.method1711(95)) {
            if (var2.method2368(122)) {
                var2.method876((byte) -96);
                var2.method2440(-56);
                this.field6316 += var2.field6449;
            }
        }
        if (arg0 <= 13) {
            field6328 = -0.57418257F;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
    public class424(int arg0) {
        this.field6316 = arg0;
        this.field6313 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field6318 = new class517(var2);
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)I")
    public final int method2526(int arg0) {
        if (arg0 != 15515) {
            this.method2524(85, null);
        }
        field6324++;
        return this.field6316;
    }
}
