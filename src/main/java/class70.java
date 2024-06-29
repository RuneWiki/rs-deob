import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class70 extends class112 {

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[I")
    public static int[] field1175 = new int[50];

    @OriginalMember(owner = "client!l", name = "F", descriptor = "C")
    private char field1176;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Ljava/lang/String;")
    public String field1179;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[[[B")
    public static byte[][][] field1173;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Z")
    public final boolean method543(int arg0) {
        if (arg0 == 0) {
            field1171++;
            return this.field1176 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method544(int arg0) {
        field1173 = null;
        if (arg0 != -1) {
            field1173 = null;
        }
        field1175 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lig;B)V")
    public final void method545(class136 arg0, byte arg1) {
        int var3 = 69 / ((arg1 + 3) / 63);
        field1172++;
        while (true) {
            int var4 = arg0.method1012(4);
            if (var4 == 0) {
                return;
            }
            this.method548(var4, -70, arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B[B)Lqa;")
    public static final class73 method546(byte arg0, byte[] arg1) {
        field1178++;
        if (arg0 != -85) {
            field1173 = null;
        }
        if (arg1 == null) {
            return null;
        } else {
            class30 var2 = new class30(arg1, class193.field3155, class197.field3224, class4.field56, class19.field268, class66.field1082);
            class213.method1410(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
    public static final void method547(byte arg0, int arg1) {
        if (arg0 != 84) {
            field1175 = null;
        }
        field1170++;
        if (!class137.field2308) {
            arg1 = -1;
        }
        if (class282.field4470 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class257 var2 = class241.method1586(arg0 - 51, arg1);
            class17 var3 = var2.method1719((byte) -21);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class205.field3294.method626(30685, new Point(var2.field4083, var2.field4091), class22.field340, var3.field1554, var3.method115(), var3.field1556);
                class282.field4470 = arg1;
            }
        }
        if (arg1 == -1 && class282.field4470 != -1) {
            class205.field3294.method626(arg0 ^ 0x7789, new Point(), class22.field340, -1, (int[]) null, -1);
            class282.field4470 = -1;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILig;)V")
    private final void method548(int arg0, int arg1, class136 arg2) {
        int var4 = 30 % ((-arg1 - 2) / 52);
        field1180++;
        if (arg0 == 1) {
            this.field1176 = class259.method1733(arg2.method981(false), -122);
        } else if (arg0 == 2) {
            this.field1177 = arg2.method1022(77);
            return;
        } else if (arg0 == 5) {
            this.field1179 = arg2.method1010(-101);
            return;
        }
    }
}
