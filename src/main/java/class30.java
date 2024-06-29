import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class30 extends class213 {

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[B")
    public byte[] field569;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Lob;")
    private static class141 field574 = class175.method1195(40, "Loading config )2 ");

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lob;")
    public static class141 field571 = field574;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Lvc;")
    public static class212 field573 = new class212(200);

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Lob;")
    public static class141 field576 = class175.method1195(40, "3D)2Softwarebibliothek gestartet");

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Lob;")
    public static class141 field577 = class175.method1195(40, "titlebutton");

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lpi;")
    public static class158 field575 = new class158();

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "[I")
    public static int[] field582 = new int[5];

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field580 = 127;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "[I")
    public static int[] field578;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "[I")
    public static int[] field581;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field581 = null;
        field573 = null;
        field577 = null;
        field578 = null;
        field571 = null;
        field582 = null;
        field576 = null;
        if (arg0 >= -81) {
            method206((byte) 5);
        }
        field575 = null;
        field574 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
    public class30(byte[] arg0) {
        this.field569 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILob;Lra;)Lob;")
    public static final class141 method207(int arg0, class141 arg1, class170 arg2) {
        field572++;
        if (arg1.method910(class1.field3, (byte) 119) != -1) {
            label62: while (true) {
                int var3 = arg1.method910(class9.field151, (byte) 121);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method910(class73.field1461, (byte) 127);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method910(class117.field2264, (byte) 126);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method910(class24.field454, (byte) 123);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method910(class202.field3805, (byte) 123);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method910(class213.field4064, (byte) 126);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class141 var9 = class111.field2128;
                                                        if (class31.field631 != null) {
                                                            var9 = class213.method1390(-51, class31.field631.field1088);
                                                            try {
                                                                if (class31.field631.field1090 != null) {
                                                                    byte[] var10 = ((String) class31.field631.field1090).getBytes("ISO-8859-1");
                                                                    var9 = class182.method1227(1, 0, var10, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class220.method1422(new class141[] { arg1.method902(var8, 0, (byte) 41), var9, arg1.method907((byte) 47, var8 + 4) }, -3);
                                                    }
                                                }
                                                arg1 = class220.method1422(new class141[] { arg1.method902(var7, 0, (byte) 124), class87.method590(class93.method636(4, arg2, -31519), 999999999), arg1.method907((byte) 60, var7 + 2) }, -3);
                                            }
                                        }
                                        arg1 = class220.method1422(new class141[] { arg1.method902(var6, 0, (byte) 56), class87.method590(class93.method636(3, arg2, -31519), 999999999), arg1.method907((byte) -113, var6 + 2) }, -3);
                                    }
                                }
                                arg1 = class220.method1422(new class141[] { arg1.method902(var5, 0, (byte) 49), class87.method590(class93.method636(2, arg2, -31519), 999999999), arg1.method907((byte) -106, var5 + 2) }, -3);
                            }
                        }
                        arg1 = class220.method1422(new class141[] { arg1.method902(var4, 0, (byte) 39), class87.method590(class93.method636(1, arg2, -31519), 999999999), arg1.method907((byte) -115, var4 + 2) }, -3);
                    }
                }
                arg1 = class220.method1422(new class141[] { arg1.method902(var3, 0, (byte) 117), class87.method590(class93.method636(0, arg2, -31519), 999999999), arg1.method907((byte) -118, var3 + 2) }, -3);
            }
        }
        if (arg0 >= -67) {
            field574 = null;
        }
        return arg1;
    }
}
