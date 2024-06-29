import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class326 extends class362 {

    @OriginalMember(owner = "client!vv", name = "C", descriptor = "[[[I")
    public static int[][][] field4524 = new int[2][][];

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field4513 = 0;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!vv", name = "B", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!vv", name = "D", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!vv", name = "G", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!vv", name = "H", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!vv", name = "N", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "Lho;")
    public class151 field4520;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "Lsq;")
    public static class180 field4510;

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "Ljf;")
    public class217 field4530;

    @OriginalMember(owner = "client!vv", name = "F", descriptor = "Lvia;")
    public class563 field4526;

    @OriginalMember(owner = "client!vv", name = "A", descriptor = "Lob;")
    public class735 field4522;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BZLke;)V")
    public static final void method2075(byte arg0, boolean arg1, class598 arg2) {
        field4518++;
        if (class192.field2844 >= 400) {
            return;
        }
        if (class58.field1147 != arg2) {
            String var9;
            if (arg2.field8209 == 0) {
                boolean var3 = true;
                if (class58.field1147.field8206 != -1 && arg2.field8206 != -1) {
                    int var4 = class58.field1147.field8161 > arg2.field8161 ? class58.field1147.field8161 : arg2.field8161;
                    int var5 = class58.field1147.field8206 >= arg2.field8206 ? arg2.field8206 : class58.field1147.field8206;
                    int var6 = 5 - (-(var4 * 10 / 100) - var5);
                    int var7 = class58.field1147.field8161 - arg2.field8161;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class582.field7970 == class204.field2938 ? class497.field6921.method2936(class607.field8336, 544) : class497.field6919.method2936(class607.field8336, 544);
                if (arg2.field8202 <= arg2.field8161) {
                    var9 = arg2.method3404(true, 255) + (var3 ? class204.method1416(class58.field1147.field8161, true, arg2.field8161) : "<col=ffffff>") + " (" + var8 + arg2.field8161 + ")";
                } else {
                    var9 = arg2.method3404(true, 255) + (var3 ? class204.method1416(class58.field1147.field8161, true, arg2.field8161) : "<col=ffffff>") + " (" + var8 + arg2.field8161 + "+" + (arg2.field8202 - arg2.field8161) + ")";
                }
            } else if (arg2.field8209 == -1) {
                var9 = arg2.method3404(true, 255);
            } else {
                var9 = arg2.method3404(true, 255) + " (" + class497.field6920.method2936(class607.field8336, 544) + arg2.field8209 + ")";
            }
            if (class184.field2785 && !arg1 && (class479.field6669 & 0x8) != 0) {
                class142.method1128(false, class133.field2241 + " -> <col=ffffff>" + var9, 0, (byte) -109, false, 0, -1, true, 51, (long) arg2.field5716, class133.field2242, (long) arg2.field5716, class548.field7549);
                class236.field3430++;
            }
            if (arg0 <= 89) {
                field4513 = -113;
            }
            if (arg1) {
                class142.method1128(true, "", 0, (byte) -115, false, 0, 0, false, -1, (long) arg2.field5716, "<col=cccccc>" + var9, 0L, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class509.field7086[var10] != null) {
                        short var12 = 0;
                        if (class582.field7970 == class456.field6431 && class509.field7086[var10].equalsIgnoreCase(class497.field6914.method2936(class607.field8336, 544))) {
                            if (class58.field1147.field8161 < arg2.field8161) {
                                var12 = 2000;
                            }
                            if (class58.field1147.field8187 != 0 && arg2.field8187 != 0) {
                                if (class58.field1147.field8187 == arg2.field8187) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class545.field7517[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class665.field9093[var10] + var12);
                        int var14 = class53.field1089[var10] == -1 ? class479.field6675 : class53.field1089[var10];
                        class142.method1128(false, "<col=ffffff>" + var9, 0, (byte) -105, false, 0, -1, true, var13, (long) arg2.field5716, class509.field7086[var10], (long) arg2.field5716, var14);
                        class53.field1098++;
                    }
                }
            }
            if (!arg1) {
                for (class324 var11 = (class324) class528.field7301.method1269(4); var11 != null; var11 = (class324) class528.field7301.method1264((byte) 105)) {
                    if (var11.field4505 == 19) {
                        var11.field4492 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class184.field2785 && (class479.field6669 & 0x10) != 0) {
            class155.field2513++;
            class142.method1128(false, class133.field2241 + " -> <col=ffffff>" + class497.field6928.method2936(class607.field8336, 544), 0, (byte) -109, false, 0, -1, true, 50, (long) arg2.field5716, class133.field2242, 0L, class548.field7549);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public final void method2076(byte arg0) {
        field4523++;
        this.field4526 = null;
        this.field4522 = null;
        int var2 = 71 / ((arg0 + 26) / 58);
        this.field4520 = null;
        this.field4530 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public static void method2077(int arg0) {
        field4524 = null;
        field4510 = null;
        if (arg0 != 0) {
            method2077(-61);
        }
    }
}
