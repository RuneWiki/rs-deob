import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class37 extends class424 {

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lki;")
    public class364 field542 = new class364();

    @OriginalMember(owner = "client!k", name = "o", descriptor = "[S")
    public static short[] field537 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Ltc;")
    public static class477 field538 = null;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
    public static int[] field544 = new int[2];

    @OriginalMember(owner = "client!k", name = "n", descriptor = "F")
    public static float field536;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)I")
    public static final int method299(int arg0, int arg1, byte arg2) {
        field539++;
        if (arg0 == 1 || arg0 == 3) {
            return class513.field6723[arg1 & 0x3];
        } else {
            if (arg2 != -12) {
                field538 = null;
            }
            return class667.field9246[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method300(byte arg0) {
        field537 = null;
        field538 = null;
        field544 = null;
        int var1 = 108 % ((arg0 - 74) / 40);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method301(byte arg0, int[] arg1) {
        field540++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class356.field4614;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class636 var5 = class97.field1307.method1741(arg1[var4], (byte) -46);
            if (var5.field8861 != -1) {
                class511 var6 = (class511) class703.field9805.method3655(-115, (long) var5.field8861);
                if (var6 == null) {
                    class506 var7 = class506.method2732(class90.field1186, var5.field8861, 0);
                    if (var7 != null) {
                        var6 = class520.field6799.method325(var7, true);
                        class703.field9805.method3650((long) var5.field8861, -119, var6);
                    }
                }
                if (var6 != null) {
                    class256.field3469[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg0 > -48) {
            return null;
        } else {
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B[Ltc;I)V")
    public static final void method302(byte arg0, class477[] arg1, int arg2) {
        field541++;
        if (arg0 > -92) {
            field544 = null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class477 var4 = arg1[var3];
            if (var4 != null && var4.field6292 == arg2 && !client.method707(var4)) {
                if (var4.field6312 == 0) {
                    method302((byte) -124, arg1, var4.field6234);
                    if (var4.field6258 != null) {
                        method302((byte) -122, var4.field6258, var4.field6234);
                    }
                    class270 var5 = (class270) class700.field9763.method39((long) var4.field6234, 31750);
                    if (var5 != null) {
                        class112.method857(var5.field3588, (byte) -116);
                    }
                }
                if (var4.field6312 == 6 && var4.field6272 != -1) {
                    class348 var6 = class552.field7163.method3031(114, var4.field6272);
                    if (var6 != null) {
                        var4.field6261 += class57.field767;
                        int var7 = var4.field6301;
                        while (var4.field6261 > var6.field4453[var4.field6301]) {
                            var4.field6261 -= var6.field4453[var4.field6301];
                            var4.field6301++;
                            if (var4.field6301 >= var6.field4463.length) {
                                var4.field6301 -= var6.field4443;
                                if (var4.field6301 < 0 || var4.field6301 >= var6.field4463.length) {
                                    var4.field6301 = 0;
                                }
                            }
                            var4.field6267 = var4.field6301 + 1;
                            if (var6.field4463.length <= var4.field6267) {
                                var4.field6267 -= var6.field4443;
                                if (var4.field6267 < 0 || var6.field4463.length <= var4.field6267) {
                                    var4.field6267 = -1;
                                }
                            }
                            class386.method2199(var4, false);
                        }
                        if (var4.field6301 != var7) {
                            class708.method3883(var6, var4.field6301, false);
                        }
                    }
                }
            }
        }
    }
}
