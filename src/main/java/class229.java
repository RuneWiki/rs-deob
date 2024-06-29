import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class229 extends class86 {

    @OriginalMember(owner = "client!j", name = "A", descriptor = "[I")
    public static int[] field3279 = new int[4];

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILtl;)Lts;", line = 4)
    public static final class27 method1568(int arg0, class91 arg1) {
        field3282++;
        return arg0 == -1 ? new class27(arg1.method643((byte) 105), arg1.method643((byte) 111), arg1.method643((byte) 127), arg1.method643((byte) 122), arg1.method643((byte) 119), arg1.method643((byte) 109), arg1.method643((byte) 115), arg1.method643((byte) 104), arg1.method641(32455), arg1.method618((byte) 100)) : null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lch;", line = 15)
    public static final class166 method1569(Throwable arg0, String arg1) {
        field3283++;
        class166 var2;
        if ((arg0 instanceof class166)) {
            var2 = (class166) arg0;
            var2.field2413 = var2.field2413 + ' ' + arg1;
        } else {
            var2 = new class166(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 36)
    public static void method1570(byte arg0) {
        if (arg0 > -118) {
            method1571(-50, 101, -30);
        }
        field3279 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 49)
    public static final void method1571(int arg0, int arg1, int arg2) {
        if (arg1 <= 48) {
            method1573(null, (byte) -101);
        }
        field3281++;
        class377 var3 = class99.method672(arg2, false, 14);
        var3.method2340((byte) 126);
        var3.field5763 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Lrt;", line = 64)
    public static final class316 method1572(int arg0) {
        field3278++;
        if (arg0 != -16777216) {
            method1570((byte) -108);
        }
        return class135.field1952;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqa;B)V", line = 81)
    public static final void method1573(class496 arg0, byte arg1) {
        field3280++;
        arg0.method1046(0, 0, class7.field112, 350);
        if (arg1 != -40) {
            return;
        }
        arg0.method1112(0, 0, class7.field112, 350, class33.field523 << 24 | 0x332277, 1);
        int var2 = 350 / class40.field622;
        if (class74.field993 > 0) {
            int var3 = 346 - class40.field622 - 4;
            int var4 = var2 * var3 / (var2 - (1 - class74.field993));
            int var5 = 4;
            if (class74.field993 > 1) {
                var5 += (class74.field993 - class52.field703 - 1) * (var3 - var4) / (class74.field993 - 1);
            }
            arg0.method1112(class7.field112 - 16, var5, 12, var4, class33.field523 << 24 | 0x332277, 2);
            for (int var6 = class52.field703; (class52.field703 + var2) > var6 && class74.field993 > var6; var6++) {
                String[] var7 = class14.method125(68, '\b', class341.field5382[var6]);
                int var8 = (class7.field112 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = (var8 * var9) + 8;
                    arg0.method1046(var10, 0, var8 + var10 - 8, 350);
                    class84.field1153.method235(var7[var9], -1, var10, -16777216, 29451, 350 - class270.field3750 - ((-class52.field703 + var6) * class40.field622) - class34.field532.field44 - 2);
                }
            }
        }
        arg0.method1046(0, 0, class7.field112, 350);
        arg0.method2947(0, -1, 350 - class270.field3750, (byte) 90, class7.field112);
        class104.field1497.method235("--> " + class350.field5444, -1, 10, -16777216, 29451, 350 - class472.field6901.field44 - 1);
        int var11 = -1;
        if ((class405.field6116 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method2949(var11, (byte) -83, 12, 350 - class472.field6901.field44 - 11, 10 - -class472.field6901.method45("--> " + class350.field5444.substring(0, class300.field4438), (byte) -64));
    }
}
