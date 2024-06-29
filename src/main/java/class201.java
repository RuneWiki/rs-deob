import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class201 {

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lek;")
    private class205 field2965 = new class205();

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lrb;")
    private class143 field2952;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
    public static volatile long field2954 = 0L;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field2956 = 0;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Llc;")
    public static class270 field2957;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JZ)V")
    public final void method1415(long arg0, boolean arg1) {
        field2962++;
        if (arg1) {
            return;
        }
        class186 var4 = (class186) this.field2952.method1073(-1, arg0);
        if (var4 != null) {
            var4.method1781(5250);
            var4.method1135(false);
            this.field2959++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public final void method1416(int arg0, int arg1) {
        if (arg1 != 0) {
            field2957 = null;
        }
        if (class36.field467 != null) {
            for (class186 var3 = (class186) this.field2965.method1450(false); var3 != null; var3 = (class186) this.field2965.method1448(false)) {
                if (var3.method563(true)) {
                    if (var3.method559(17395) == null) {
                        var3.method1781(arg1 ^ 0x1482);
                        var3.method1135(false);
                        this.field2959++;
                    }
                } else if (++var3.field2422 > (long) arg0) {
                    class186 var4 = class36.field467.method1927(74, var3);
                    this.field2952.method1074((byte) 39, var4, var3.field4008);
                    class249.method1719(var4, var3, arg1);
                    var3.method1781(5250);
                    var3.method1135(false);
                }
            }
        }
        field2964++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1417(byte arg0) {
        if (arg0 != -76) {
            method1417((byte) 94);
        }
        field2957 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1418(long arg0, int arg1) {
        field2955++;
        class186 var4 = (class186) this.field2952.method1073(-1, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method559(17395);
        if (arg1 != 0) {
            method1423(true, false, -101);
        }
        if (var5 == null) {
            var4.method1781(5250);
            var4.method1135(false);
            this.field2959++;
            return null;
        }
        if (var4.method563(true)) {
            class75 var6 = new class75(var5);
            this.field2952.method1074((byte) 39, var6, var4.field4008);
            this.field2965.method1453(arg1 ^ 0xFFFFFF88, var6);
            var6.field2422 = 0L;
            var4.method1781(arg1 ^ 0x1482);
            var4.method1135(false);
        } else {
            this.field2965.method1453(-74, var4);
            var4.field2422 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)I")
    public final int method1419(byte arg0) {
        field2958++;
        int var2 = 0;
        for (class186 var3 = (class186) this.field2965.method1450(false); var3 != null; var3 = (class186) this.field2965.method1448(false)) {
            if (!var3.method563(true)) {
                var2++;
            }
        }
        if (arg0 != -26) {
            field2956 = 21;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public final void method1420(byte arg0) {
        field2953++;
        this.field2965.method1449(-12452);
        this.field2952.method1072(0);
        this.field2959 = this.field2960;
        int var2 = -43 % ((61 - arg0) / 46);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method1421(long arg0, Object arg1, byte arg2) {
        int var5 = -86 % ((arg2 + 28) / 33);
        this.method1415(arg0, false);
        field2967++;
        if (this.field2959 == 0) {
            class186 var6 = (class186) this.field2965.method1452((byte) 23);
            var6.method1781(5250);
            var6.method1135(false);
        } else {
            this.field2959--;
        }
        class75 var7 = new class75(arg1);
        this.field2952.method1074((byte) 39, var7, arg0);
        this.field2965.method1453(-70, var7);
        var7.field2422 = 0L;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
    public final void method1422(byte arg0) {
        int var2 = 98 / ((arg0 - 22) / 63);
        field2961++;
        for (class186 var3 = (class186) this.field2965.method1450(false); var3 != null; var3 = (class186) this.field2965.method1448(false)) {
            if (var3.method563(true)) {
                var3.method1781(5250);
                var3.method1135(false);
                this.field2959++;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZI)Ljava/lang/String;")
    public static final String method1423(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2956 = 126;
        }
        field2966++;
        return arg0 && arg2 >= 0 ? class100.method786(arg0, 87, 10, arg2) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I)V")
    public class201(int arg0) {
        int var2 = 1;
        this.field2960 = arg0;
        this.field2959 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field2952 = new class143(var2);
    }
}
