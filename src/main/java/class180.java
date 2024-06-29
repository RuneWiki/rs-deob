import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class180 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lph;")
    public static class229 field2946 = class266.method1858("Bitte entfernen Sie ", 0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "J")
    public static long field2947 = 0L;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lph;")
    public static class229 field2949 = class266.method1858(")2", 0);

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[Lh;")
    public static class237[] field2955 = new class237[28];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lph;")
    public class229 field2953;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lii;")
    public static class247 field2950;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljk;")
    public static class85 field2957;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
    public static boolean field2952;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1282(int arg0) {
        class294.field4803.method1414(91);
        if (arg0 == 122) {
            class208.field3419.method1414(108);
            field2951++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 37)
    public static final void method1283(int arg0) {
        field2954++;
        if (!field2952) {
            return;
        }
        class312.field5256 = null;
        class268.field4494 = null;
        if (arg0 == 29379) {
            field2952 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJIIILph;I)V", line = 69)
    public static final void method1284(int arg0, long arg1, int arg2, int arg3, int arg4, class229 arg5, int arg6) {
        field2956++;
        class164 var8 = new class164(arg0);
        var8.method1188(-98, 10);
        var8.method1155(arg0 ^ 0x9E377939, (int) (Math.random() * 99999.0D));
        var8.method1155(arg0 ^ 0x9E377939, 525);
        var8.method1208((byte) -6, arg1);
        var8.method1168((int) (Math.random() * 9.9999999E7D), (byte) -66);
        var8.method1194(arg0 - 11632, arg5);
        var8.method1168((int) (Math.random() * 9.9999999E7D), (byte) -76);
        var8.method1155(arg0 ^ 0x9E377939, class48.field709);
        var8.method1188(-79, arg4);
        var8.method1188(-119, arg2);
        var8.method1168((int) (Math.random() * 9.9999999E7D), (byte) -69);
        var8.method1155(-1640531527, arg3);
        var8.method1155(-1640531527, arg6);
        var8.method1168((int) (Math.random() * 9.9999999E7D), (byte) -96);
        var8.method1205(class236.field3884, class230.field3822, (byte) -117);
        class121.field2033.field2670 = 0;
        class121.field2033.method1188(-76, 122);
        class121.field2033.method1188(-127, var8.field2670);
        class121.field2033.method1164(0, var8.field2670, true, var8.field2668);
        class228.field3751 = 0;
        class4.field42 = -3;
        class263.field4404 = 0;
        class211.field3490 = 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 111)
    public static void method1285(boolean arg0) {
        field2949 = null;
        field2950 = null;
        field2946 = null;
        field2955 = null;
        if (!arg0) {
            field2957 = null;
        }
    }
}
