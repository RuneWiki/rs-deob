import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class617 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "[I")
    public static int[] field8699 = new int[5];

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Ltm;")
    public static class334 field8703 = new class334(35, -2);

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field8705 = 0;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lbt;")
    public static class416 field8704;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 4)
    public static void method3522(byte arg0) {
        if (arg0 < -114) {
            field8703 = null;
            field8699 = null;
            field8704 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)I", line = 18)
    public static final int method3523(int arg0, int arg1, int arg2) {
        field8701++;
        int var3 = class639.method3615(arg1 - 1, arg2 + -1, -102) + class639.method3615(arg1 + 1, arg2 - 1, arg0 ^ 0xFFFFFF8C) - (-class639.method3615(arg1 + -1, arg2 + 1, -115) - class639.method3615(arg1 + 1, arg2 - -1, -106));
        int var4 = class639.method3615(arg1 - 1, arg2, -121) + class639.method3615(arg0 + arg1, arg2, arg0 - 109) - (-class639.method3615(arg1, arg2 + -1, arg0 + -129) + -class639.method3615(arg1, arg2 + 1, -110));
        int var5 = class639.method3615(arg1, arg2, -121);
        return var3 / 16 - (-(var4 / 8) - (var5 / 4));
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILla;)I", line = 39)
    public static final int method3524(int arg0, class422 arg1) {
        field8700++;
        int var2 = arg0;
        if (arg1.method2621(class141.field2214, -28975)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2621(class688.field9781, -28975)) {
            var2++;
        }
        if (arg1.method2621(class562.field7962, -28975)) {
            var2++;
        }
        if (arg1.method2621(class378.field5679, arg0 - 28975)) {
            var2++;
        }
        if (arg1.method2621(class544.field7768, -28975)) {
            var2++;
        }
        if (arg1.method2621(class685.field9685, -28975)) {
            var2++;
        }
        if (arg1.method2621(class14.field152, -28975)) {
            var2++;
        }
        if (arg1.method2621(class37.field367, -28975)) {
            var2++;
        }
        if (arg1.method2621(field8702, -28975)) {
            var2++;
        }
        if (arg1.method2621(class369.field5618, -28975)) {
            var2++;
        }
        if (arg1.method2621(class701.field9909, -28975)) {
            var2++;
        }
        if (arg1.method2621(class631.field8866, -28975)) {
            var2++;
        }
        if (arg1.method2621(class99.field1469, -28975)) {
            var2++;
        }
        if (arg1.method2621(class551.field7858, -28975)) {
            var2++;
        }
        if (arg1.method2621(class451.field6565, -28975)) {
            var2++;
        }
        if (arg1.method2621(class325.field4805, -28975)) {
            var2++;
        }
        return var2;
    }
}
