import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class131 extends class275 {

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
    public static int[] field2004 = new int[100];

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2010 = new String[8];

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field2011 = 0;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[S")
    public static short[] field2009 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 18)
    public static void method1017(int arg0) {
        if (arg0 != 0) {
            method1017(38);
        }
        field2010 = null;
        field2009 = null;
        field2004 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", line = 33)
    public static final void method1018(int arg0, String arg1, int arg2, int arg3, String arg4, String arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            field2004[var6] = field2004[var6 - 1];
            class280.field4344[var6] = class280.field4344[var6 - 1];
            class79.field1152[var6] = class79.field1152[var6 - 1];
            class160.field2430[var6] = class160.field2430[var6 - 1];
            class148.field2248[var6] = class148.field2248[var6 - 1];
        }
        field2007++;
        class280.field4344[0] = arg5;
        field2004[0] = arg3;
        class234.field3556++;
        class184.field2908 = class12.field155;
        class79.field1152[0] = arg1;
        int var7 = 20 % ((arg0 - 44) / 43);
        class160.field2430[0] = arg4;
        class148.field2248[0] = arg2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V", line = 62)
    public static final void method1019(int arg0, int arg1, int arg2) {
        field2006++;
        class188 var3 = class147.method1111(-22, arg2, 5);
        var3.method1392((byte) -48);
        var3.field2959 = arg0;
        int var4 = 10 % ((-arg1 - 60) / 53);
    }
}
