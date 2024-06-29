import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class221 {

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "Lot;")
    private class255 field3112 = new class255();

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    private int field3106;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Lsq;")
    private class454 field3108;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "J")
    public static long field3113;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Lfn;")
    public static class52 field3114;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "Z")
    public static boolean field3117;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Loh;I)V")
    private final void method1390(class22 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method1182(28818);
            arg0.method738(-13002);
            this.field3103 += arg0.field373;
        }
        int var3 = 44 / ((arg1 + 31) / 59);
        field3110++;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public final void method1391(byte arg0) {
        field3116++;
        this.field3112.method1586((byte) -25);
        this.field3108.method2623((byte) 92);
        if (arg0 != 25) {
            this.method1396((class281) null, 8, (Object) null);
        }
        this.field3103 = this.field3106;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method1392(int arg0) {
        field3105++;
        class22 var2 = (class22) this.field3112.method1587(0);
        int var3 = -126 % ((arg0 + 58) / 53);
        while (var2 != null) {
            if (var2.method183(false)) {
                var2.method1182(28818);
                var2.method738(-13002);
                this.field3103 += var2.field373;
            }
            var2 = (class22) this.field3112.method1583((byte) -69);
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
    public final int method1393(int arg0) {
        if (arg0 != 0) {
            this.method1397(-56, -122);
        }
        field3115++;
        return this.field3106;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
    public final int method1394(int arg0) {
        if (arg0 != 1) {
            this.method1393(-122);
        }
        field3099++;
        return this.field3103;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lig;I)V")
    private final void method1395(class281 arg0, int arg1) {
        field3107++;
        long var3 = arg0.method1751(-24922);
        for (class22 var5 = (class22) this.field3108.method2614(var3, -93); var5 != null; var5 = (class22) this.field3108.method2616(false)) {
            if (var5.field371.method1752(arg0, -123)) {
                this.method1390(var5, -103);
                break;
            }
        }
        int var6 = 86 % ((arg1 - 57) / 60);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lig;ILjava/lang/Object;)V")
    public final void method1396(class281 arg0, int arg1, Object arg2) {
        field3109++;
        this.method1399(arg2, arg1 ^ 0x1, arg1, arg0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
    public final void method1397(int arg0, int arg1) {
        if (arg0 > -126) {
            field3117 = false;
        }
        field3102++;
        if (class174.field2564 == null) {
            return;
        }
        for (class22 var3 = (class22) this.field3112.method1587(0); var3 != null; var3 = (class22) this.field3112.method1583((byte) -69)) {
            if (var3.method183(false)) {
                if (var3.method185(90) == null) {
                    var3.method1182(28818);
                    var3.method738(-13002);
                    this.field3103 += var3.field373;
                }
            } else if (((long) arg1) < (++var3.field1649)) {
                class22 var4 = class174.field2564.method2294(var3, (byte) 13);
                this.field3108.method2620(var3.field2608, var4, false);
                class475.method2796(var4, var3, 0);
                var3.method1182(28818);
                var3.method738(-13002);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
    public static void method1398(boolean arg0) {
        if (!arg0) {
            field3114 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Object;IILig;)V")
    private final void method1399(Object arg0, int arg1, int arg2, class281 arg3) {
        field3104++;
        if (arg2 > this.field3106) {
            throw new IllegalStateException("s>cs");
        }
        this.method1395(arg3, arg1 - 108);
        this.field3103 -= arg2;
        while (this.field3103 < 0) {
            class22 var6 = (class22) this.field3112.method1589(0);
            this.method1390(var6, -104);
        }
        class59 var5 = new class59(arg3, arg0, arg2);
        this.field3108.method2620(arg3.method1751(arg1 ^ 0xFFFF9EA6), var5, false);
        this.field3112.method1584(79, var5);
        var5.field1649 = (long) arg1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILig;)Ljava/lang/Object;")
    public final Object method1400(int arg0, class281 arg1) {
        field3101++;
        if (arg0 != 0) {
            return null;
        }
        long var3 = arg1.method1751(-24922);
        for (class22 var5 = (class22) this.field3108.method2614(var3, arg0 ^ 0xFFFFFF9F); var5 != null; var5 = (class22) this.field3108.method2616(false)) {
            if (var5.field371.method1752(arg1, arg0 - 123)) {
                Object var6 = var5.method185(116);
                if (var6 != null) {
                    if (var5.method183(false)) {
                        class59 var7 = new class59(arg1, var6, var5.field373);
                        this.field3108.method2620(var5.field2608, var7, false);
                        this.field3112.method1584(arg0 ^ 0x6B, var7);
                        var7.field1649 = 0L;
                        var5.method1182(28818);
                        var5.method738(-13002);
                    } else {
                        this.field3112.method1584(arg0 ^ 0x69, var5);
                        var5.field1649 = 0L;
                    }
                    return var6;
                }
                var5.method1182(28818);
                var5.method738(arg0 ^ 0xFFFFCD36);
                this.field3103 += var5.field373;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
    public class221(int arg0) {
        this.field3103 = arg0;
        this.field3106 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3108 = new class454(var2);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)I")
    public static final int method1401(int arg0, int arg1) {
        field3100++;
        if (arg0 != 0) {
            method1398(true);
        }
        return arg1 >>> 8;
    }

    static {
        new class112((String) null, "geschickt werden.", (String) null, (String) null);
        field3111 = 0;
        field3113 = -1L;
        field3114 = new class52(8, 4);
        field3117 = false;
        field3118 = 0;
    }
}
