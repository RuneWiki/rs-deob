import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class179 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Lrt;")
    public static class179 field2004 = new class179(1);

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Lrt;")
    public static class179 field2006 = new class179(2);

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lrt;")
    public static class179 field2007 = new class179(4);

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lrt;")
    public static class179 field2008 = new class179(1);

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Lrt;")
    public static class179 field2009 = new class179(2);

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lrt;")
    public static class179 field2010 = new class179(4);

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Lrt;")
    public static class179 field2011 = new class179(2);

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Lrt;")
    public static class179 field2012 = new class179(4);

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "[I")
    public static int[] field2013 = new int[1000];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILsp;)V")
    public static final void method1092(int arg0, class677 arg1) {
        field2005++;
        int var2 = arg1.field9479 - class678.field9539;
        int var3 = arg1.field9459 * 512 + (arg1.method1414(-31789) * 256);
        int var4 = arg1.field9414 * 512 + (arg1.method1414(arg0 ^ 0xFFFFB3D3) * 256);
        arg1.field5176 += (var4 - arg1.field5176) / var2;
        arg1.field9514 = 0;
        arg1.field5179 += (var3 - arg1.field5179) / var2;
        if (arg1.field9500 == 0) {
            arg1.method3740((byte) -29, 8192);
        }
        if (arg1.field9500 == 1) {
            arg1.method3740((byte) -29, 12288);
        }
        if (arg1.field9500 == 2) {
            arg1.method3740((byte) -29, 0);
        }
        if (arg0 == 12288 && arg1.field9500 == 3) {
            arg1.method3740((byte) -29, 4096);
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V")
    private class179(int arg0) {
        this.field2003 = arg0;
    }

    @OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2002++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static void method1093(int arg0) {
        field2011 = null;
        field2006 = null;
        if (arg0 != 8192) {
            field2008 = null;
        }
        field2008 = null;
        field2013 = null;
        field2009 = null;
        field2010 = null;
        field2004 = null;
        field2012 = null;
        field2007 = null;
    }
}
