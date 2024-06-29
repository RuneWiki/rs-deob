import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class219 extends class87 {

    @OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rha", name = "y", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rha", name = "A", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "Ljg;")
    public static class338 field3127;

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(IZ)V", line = 6)
    public final void method1517(int arg0, boolean arg1) {
        if (arg0 > -82) {
            method1519(true);
        }
        super.field1571.method3425(this, 112);
        ++field3128;
        OpenGL.glTexParameteri(super.field1567, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZILae;)V", line = 19)
    public static final void method1518(boolean arg0, int arg1, class250 arg2) {
        class443.field6166.method375(false, arg2);
        ++field3126;
        if (arg0) {
            class202.method1413(class443.field6166, class528.field7505, class710.field9930, (byte) 61, class662.field9317, arg2);
        }
        if (arg1 != 0) {
            method1519(false);
        }
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Loea;II[BI)V", line = 38)
    public class219(class594 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3125 = arg2;
        super.field1571.method3425(this, 114);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field1567, 0, super.field1562, this.field3125, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(Z)V", line = 51)
    public static void method1519(boolean arg0) {
        if (arg0) {
            method1518(false, 33, (class250) null);
        }
        field3127 = null;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZZ)I", line = 61)
    public static final int method1520(boolean arg0, boolean arg1) {
        ++field3124;
        if (class417.field5862 == null) {
            return 0;
        } else if (!arg0 && class478.field6826 != null) {
            return class417.field5862.length * 2;
        } else {
            int var2 = 0;
            if (arg1) {
                field3127 = null;
            }
            for (int var3 = 0; var3 < class417.field5862.length; ++var3) {
                int var4 = class417.field5862[var3];
                if (class571.field8117.method1472(-25711, var4)) {
                    ++var2;
                }
                if (class19.field244.method1472(-25711, var4)) {
                    ++var2;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V", line = 99)
    public final void method827(int arg0) {
        ++field3123;
        if (arg0 != 0) {
            method1518(false, 38, (class250) null);
        }
    }
}
