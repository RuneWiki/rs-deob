import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class201 {

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "J")
    public long field2831;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public int[] field2826;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[S")
    public short[] field2829;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[S")
    public short[] field2830;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
    public static boolean field2824 = false;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public static final void method1296(int arg0, int arg1, int arg2) {
        class759.field10432 = arg2 - class46.field503;
        class83.field1004 = arg1 - class46.field511;
        field2823++;
        if (arg0 < 100) {
            method1297(22, 79, 83);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
    public static final void method1297(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class543.method3219(var3.field6548);
        class543.method3219(var3.field6544);
        if (var3.field6548 != null) {
            var3.field6548 = null;
        }
        if (var3.field6544 != null) {
            var3.field6544 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILha;)V")
    public static final void method1298(int arg0, class473 arg1) {
        if (arg0 != 16) {
            return;
        }
        field2828++;
        if (!(class640.field8992 >= 2 || class773.field10644) || class81.field906 != null) {
            return;
        }
        String var2;
        if (class773.field10644 && class640.field8992 < 2) {
            var2 = class56.field656 + class712.field9885.method3999(class553.field7667, (byte) -117) + class523.field7205 + " ->";
        } else if (class152.field1997 && class479.field6647.method273(81, Integer.MAX_VALUE) && class640.field8992 > 2) {
            var2 = class298.method1949(class99.field1151, -128);
        } else {
            class171 var3 = class99.field1151;
            if (var3 == null) {
                return;
            }
            var2 = class298.method1949(var3, -102);
            int[] var4 = null;
            if (class557.method3281(var3.field2174, arg0 - 131)) {
                var4 = class35.field367.method3051((byte) -20, (int) var3.field2179).field8162;
            } else if (var3.field2171 != -1) {
                var4 = class35.field367.method3051((byte) -20, var3.field2171).field8162;
            } else if (class651.method3728((byte) 115, var3.field2174)) {
                class685 var5 = (class685) class450.field6288.method3669(false, (long) ((int) var3.field2179));
                if (var5 != null) {
                    class359 var6 = var5.field9573;
                    class636 var7 = var6.field5172;
                    if (var7.field8872 != null) {
                        var7 = var7.method3650(class173.field2192, (byte) 55);
                    }
                    if (var7 != null) {
                        var4 = var7.field8921;
                    }
                }
            } else if (class593.method3465(var3.field2174, (byte) -109)) {
                Object var8 = null;
                class286 var9;
                if (var3.field2174 == 1003) {
                    var9 = class390.field5558.method3065(-121, (int) var3.field2179);
                } else {
                    var9 = class390.field5558.method3065(arg0 ^ 0xFFFFFF93, (int) (var3.field2179 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field4136 != null) {
                    var9 = var9.method1889(class173.field2192, false);
                }
                if (var9 != null) {
                    var4 = var9.field4174;
                }
            }
            if (var4 != null) {
                var2 = var2 + class468.method2797(arg0 ^ 0x69, var4);
            }
        }
        if (class640.field8992 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class640.field8992 - 2) + class712.field9878.method3999(class553.field7667, (byte) -95);
        }
        if (class777.field10680 != null) {
            class442 var11 = class777.field10680.method821((byte) 100, arg1);
            if (var11 == null) {
                var11 = class386.field5515;
            }
            var11.method2648(class777.field10680.field1434, class777.field10680.field1497, class777.field10680.field1517, class777.field10680.field1505, class33.field321, -2899, class777.field10680.field1548, class688.field9603, class773.field10647, var2, class332.field4720, class313.field4505, class777.field10680.field1560, class492.field6782, class512.field7020);
            class453.method2733(class773.field10647[1], class773.field10647[3], class773.field10647[2], -109, class773.field10647[0]);
        } else if (class478.field6635 != null && class692.field9661 == class327.field4603) {
            int var10 = class386.field5515.method2638(class110.field1326 + 4, class313.field4505, 61, var2, class604.field8475 + 16, class332.field4720, 16777215, class492.field6782, class33.field321, 0);
            class453.method2733(class604.field8475, 16, var10 + class705.field9812.method1953(var2, (byte) -121), -33, class110.field1326 + 4);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public static final void method1299(int arg0, int arg1) {
        class531.field7316 = 2;
        class284.field4094 = arg1;
        field2827++;
        long var2 = 0L;
        if (class766.field10546 == null) {
            class349.method2198(arg0 + 13607, 35);
        } else {
            class511 var4 = new class511(class688.method3910(-96, class467.method2794(arg0 ^ -46, class766.field10546)));
            long var5 = var4.method3020(true);
            class602.field8444 = var4.method3020(true);
            class115.method837(class425.method2564(var5, arg0 ^ arg0), true, "", ~arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(J[I[S[S)V")
    public class201(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field2831 = arg0;
        this.field2826 = arg1;
        this.field2829 = arg3;
        this.field2830 = arg2;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    protected class201() {
    }
}
