import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class479 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BJ)V")
    public static final void method2830(byte arg0, long arg1) {
        int var3 = -80 % ((arg0 - 8) / 56);
        field6516++;
        int var4 = class473.field6483.field9490 + class676.field9531;
        int var5 = class481.field6529 + class473.field6483.field9489;
        if ((class595.field8572 - var4) < -2000 || (class595.field8572 - var4) > 2000 || class128.field1755 - var5 < -2000 || class128.field1755 - var5 > 2000) {
            class595.field8572 = var4;
            class128.field1755 = var5;
        }
        if (class595.field8572 != var4) {
            int var6 = var4 - class595.field8572;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var6 > var7) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var6 < var7) {
                var7 = var6;
            }
            class595.field8572 += var7;
        }
        if (class128.field1755 != var5) {
            int var8 = var5 - class128.field1755;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 > 0) {
                if (var9 == 0) {
                    var9 = 1;
                } else if (var9 > var8) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = -1;
            } else if (var9 < var8) {
                var9 = var8;
            }
            class128.field1755 += var9;
        }
        class403.field5597 += (float) arg1 * class675.field9508 / 6.0F;
        class223.field3131 += (float) arg1 * class196.field2836 / 6.0F;
        class143.method935(-118);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lha;I)V")
    public static final void method2831(class545 arg0, int arg1) {
        field6517++;
        if (!(class605.field8642 >= 2 || class13.field187) || class740.field10315 != null || arg1 != 4) {
            return;
        }
        String var2;
        if (class13.field187 && class605.field8642 < 2) {
            var2 = class215.field3044 + class138.field1868.method891(-2041650704, class369.field4721) + class146.field2027 + " ->";
        } else if (class349.field4447 && class196.field2837.method315(arg1 + 73, 81) && class605.field8642 > 2) {
            var2 = class159.method995(87, class627.field8950);
        } else {
            class6 var3 = class627.field8950;
            if (var3 == null) {
                return;
            }
            var2 = class159.method995(arg1 ^ 0x3F, var3);
            int[] var4 = null;
            if (class50.method341(-113, var3.field60)) {
                var4 = class487.field6572.method3054((int) var3.field47, (byte) -99).field7666;
            } else if (var3.field52 != -1) {
                var4 = class487.field6572.method3054(var3.field52, (byte) -99).field7666;
            } else if (class462.method2765((byte) -84, var3.field60)) {
                class15 var7 = (class15) class403.field5587.method1381(true, (long) ((int) var3.field47));
                if (var7 != null) {
                    class55 var8 = var7.field204;
                    class11 var9 = var8.field771;
                    if (var9.field111 != null) {
                        var9 = var9.method55((byte) 118, class554.field7826);
                    }
                    if (var9 != null) {
                        var4 = var9.field162;
                    }
                }
            } else if (class464.method2770(var3.field60, -46)) {
                Object var5 = null;
                class30 var6;
                if (var3.field60 == 1001) {
                    var6 = class264.field3604.method3188((int) var3.field47, (byte) -57);
                } else {
                    var6 = class264.field3604.method3188((int) (var3.field47 >>> 32 & 0x7FFFFFFFL), (byte) -57);
                }
                if (var6.field455 != null) {
                    var6 = var6.method219(arg1 ^ 0xFFFFFFFB, class554.field7826);
                }
                if (var6 != null) {
                    var4 = var6.field453;
                }
            }
            if (var4 != null) {
                var2 = var2 + class278.method1672(var4, (byte) 110);
            }
        }
        if (class605.field8642 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class605.field8642 - 2) + class138.field1861.method891(-2041650704, class369.field4721);
        }
        if (class133.field1798 != null) {
            class400 var11 = class133.field1798.method4011(-52, arg0);
            if (var11 == null) {
                var11 = class743.field10354;
            }
            var11.method2435(class200.field2888, class133.field1798.field9960, class133.field1798.field9945, class11.field171, var2, class133.field1798.field10011, class133.field1798.field9966, class133.field1798.field10069, class304.field3952, 1, class133.field1798.field10096, class9.field89, class298.field3904, class209.field2970, class393.field5475);
            class746.method4149(class9.field89[2], class9.field89[0], class9.field89[3], (byte) 94, class9.field89[1]);
        } else if (class431.field5928 != null && class75.field1037 == class210.field2984) {
            int var10 = class743.field10354.method2436(16777215, class11.field171, class298.field3904, class200.field2888, 0, var2, class586.field8433 + 16, -13575, class304.field3952, class32.field485 + 4);
            class746.method4149(var10 + class514.field7181.method4134((byte) -124, var2), class32.field485 + 4, 16, (byte) 100, class586.field8433);
            return;
        }
    }
}
