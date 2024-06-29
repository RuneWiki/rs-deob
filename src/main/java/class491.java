import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class491 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "Ldh;")
    public static class320 field6987 = new class320(47, -1);

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field6992 = 0;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "J")
    public static long field6991 = 0L;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 3)
    public static void method2949(int arg0) {
        if (arg0 == -1) {
            field6987 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2950(int arg0) {
        field6989++;
        class11.method50(class344.field4474, (byte) -114);
        class582.field8219++;
        if (class551.field7908 && class65.field659) {
            int var1 = 2 / ((38 - arg0) / 39);
            int var2 = 0;
            int var3 = 0;
            if (class397.field5443) {
                var2 = class389.method2400(102);
                var3 = class752.method4192(1);
            }
            int var4 = class353.field4537.method694((byte) 114) + var2;
            int var5 = class353.field4537.method691((byte) -111) + var3;
            int var6 = var4 - class356.field4557;
            int var7 = var5 - class408.field5588;
            if (class631.field9069 > var6) {
                var6 = class631.field9069;
            }
            if (class687.field9702 > var7) {
                var7 = class687.field9702;
            }
            if (class344.field4474.field7658 + var6 > class631.field9069 + class68.field694.field7658) {
                var6 = class631.field9069 + class68.field694.field7658 - class344.field4474.field7658;
            }
            if ((class687.field9702 + class68.field694.field7573) < (class344.field4474.field7573 + var7)) {
                var7 = class687.field9702 + class68.field694.field7573 - class344.field4474.field7573;
            }
            int var8 = var6 + class68.field694.field7567 - class631.field9069;
            int var9 = var7 + class68.field694.field7571 - class687.field9702;
            if (class353.field4537.method697(-99)) {
                if (class344.field4474.field7589 < class582.field8219) {
                    int var10 = var6 - class514.field7330;
                    int var11 = var7 - class125.field1318;
                    if (var10 > class344.field4474.field7660 || var10 < (-class344.field4474.field7660) || class344.field4474.field7660 < var11 || -class344.field4474.field7660 > var11) {
                        class85.field903 = true;
                    }
                }
                if (class344.field4474.field7552 != null && class85.field903) {
                    class622 var12 = new class622();
                    var12.field8908 = class344.field4474;
                    var12.field8904 = class344.field4474.field7552;
                    var12.field8914 = var9;
                    var12.field8910 = var8;
                    class133.method859(var12);
                    return;
                }
            } else {
                if (class85.field903) {
                    class251.method1503((byte) 121);
                    if (class344.field4474.field7631 != null) {
                        class622 var13 = new class622();
                        var13.field8907 = class520.field7402;
                        var13.field8904 = class344.field4474.field7631;
                        var13.field8914 = var9;
                        var13.field8910 = var8;
                        var13.field8908 = class344.field4474;
                        class133.method859(var13);
                    }
                    if (class520.field7402 != null && client.method1778(class344.field4474) != null) {
                        class471.method2847(class520.field7402, -1, class344.field4474);
                    }
                } else if ((class574.field8142 == 1 || class151.method935(-4)) && class343.field4449 > 2) {
                    class140.method883(class408.field5588 + class125.field1318, class356.field4557 - -class514.field7330, -87);
                } else if (class44.method260(11657)) {
                    class140.method883(class408.field5588 + class125.field1318, class514.field7330 + class356.field4557, -88);
                }
                class344.field4474 = null;
            }
        } else if (class582.field8219 > 1) {
            class344.field4474 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 147)
    public static final void method2951(byte arg0) {
        class30.field343.method2539(-32067);
        field6990++;
        class220.method1285((byte) -39);
        class668.field9500 = null;
        class122.field1276 = 0;
        class537.field7759 = 0;
        class89.field931 = null;
        class97.field1022 = null;
        class248.field3008.field2903 = 0;
        class486.method2934(false);
        class422.field6150 = 0;
        class75.field795 = null;
        class697.field9812 = null;
        if (arg0 > 59) {
            class96.field1011 = 0;
            class752.field10524 = 0;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V", line = 173)
    public static final void method2952(byte arg0) {
        class375.field4818.method1654(false);
        field6988++;
        class353.field4537.method693((byte) 72);
        if (arg0 != 79) {
            method2950(-98);
        }
        class30.field343.method1777((byte) -4);
        class618.field8849.setBackground(Color.black);
        class683.field9667 = -1;
        class375.field4818 = class124.method796(class618.field8849, -59);
        class353.field4537 = class177.method1088(arg0 - 206, class618.field8849, true);
    }
}
