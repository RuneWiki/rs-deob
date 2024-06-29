import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class63 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Ljava/lang/String;")
    public static String field915 = "level: ";

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field918 = -1;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Lfm;")
    public static class52 field928;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field922++;
        int var8 = arg2 + arg7;
        int var9 = arg1 + arg7;
        int var10 = arg4 - arg7;
        for (int var11 = arg2; var11 < var8; var11++) {
            class323.method2273(arg1, arg5, class221.field3443[var11], arg4, 82);
        }
        if (arg0 <= 65) {
            field928 = (class52) null;
        }
        int var12 = arg3 - arg7;
        for (int var13 = arg3; var13 > var12; var13--) {
            class323.method2273(arg1, arg5, class221.field3443[var13], arg4, 79);
        }
        for (int var14 = var8; var14 <= var12; var14++) {
            int[] var15 = class221.field3443[var14];
            class323.method2273(arg1, arg5, var15, var9, 109);
            class323.method2273(var9, arg6, var15, var10, 47);
            class323.method2273(var10, arg5, var15, arg4, 30);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lpi;", line = 60)
    public static final class326 method502(int arg0, int arg1) {
        class326 var2 = (class326) class297.field4775.method1183((long) arg1, (byte) -112);
        field927++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= ~arg1) {
            var3 = class229.field3520.method967(1, arg1 & 0x7FFF, 65280);
        } else {
            var3 = class174.field2796.method967(1, arg1, arg0 + 98049);
        }
        class326 var4 = new class326();
        if (var3 != null) {
            var4.method2289(new class1(var3), false);
        }
        if (arg1 >= 32768) {
            var4.method2299(arg0 ^ 0xFFFF7FFE);
        }
        class297.field4775.method1182((byte) -69, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Lhn;", line = 87)
    public static final class38 method503(int arg0, byte arg1) {
        field924++;
        class38 var2 = (class38) class44.field694.method2288((long) arg0, (byte) 122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field874.method967(class164.method1232(arg0, false), class103.method838(false, arg0), 65280);
        if (arg1 < 63) {
            return (class38) null;
        }
        class38 var4 = new class38();
        var4.field574 = arg0;
        if (var3 != null) {
            var4.method331(107, new class1(var3));
        }
        var4.method338(-38);
        class44.field694.method2281(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V", line = 120)
    public static final void method504(int arg0, int arg1, boolean arg2) {
        field925++;
        class30 var3 = class316.field4985[class75.field1153][arg1][arg0];
        if (var3 == null) {
            class221.method1611(class75.field1153, arg1, arg0);
            return;
        }
        if (!arg2) {
            method501(-51, -87, 53, 73, 111, 72, -120, 111);
        }
        int var4 = -99999999;
        class227 var5 = null;
        for (class227 var6 = (class227) var3.method268(-1); var6 != null; var6 = (class227) var3.method278(1)) {
            class135 var7 = class188.method1361(arg2, var6.field3510.field1029);
            int var8 = var7.field2159;
            if (var7.field2198 == 1) {
                var8 = (var6.field3510.field1028 + 1) * var8;
            }
            if (var4 < var8) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class221.method1611(class75.field1153, arg1, arg0);
            return;
        }
        class68 var9 = null;
        var3.method274(1, var5);
        class227 var10 = (class227) var3.method268(-1);
        class68 var11 = null;
        while (var10 != null) {
            class68 var12 = var10.field3510;
            if (var5.field3510.field1029 != var12.field1029) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field1029 != var12.field1029 && var9 == null) {
                    var9 = var12;
                }
            }
            var10 = (class227) var3.method278(1);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class340.method2357(class75.field1153, arg1, arg0, class170.method1265(arg1 * 128 + 64, arg0 * 128 + 64, class75.field1153, 1), var5.field3510, var13, var11, var9);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 197)
    public static void method505(int arg0) {
        field915 = null;
        if (arg0 == 23098) {
            field928 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZII)I", line = 221)
    public static final int method506(int arg0, boolean arg1, int arg2, int arg3) {
        class307 var4 = (class307) class340.field5253.method79((long) arg0, (byte) 0);
        field926++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg2 != -1) {
            field918 = -81;
        }
        for (int var6 = 0; var6 < var4.field4871.length; var6++) {
            if (var4.field4871[var6] >= 0 && var4.field4871[var6] < class216.field3356) {
                class135 var7 = class188.method1361(true, var4.field4871[var6]);
                if (var7.field2170 != null) {
                    class304 var8 = (class304) var7.field2170.method79((long) arg3, (byte) 0);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field4867[var6] * var8.field4844;
                        } else {
                            var5 += var8.field4844;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
