import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class312 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lwo;")
    public static class690 field4117 = new class690(104, 17);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Ljs;")
    public static class302 field4118;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Lob;")
    public static class685 field4120;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "[I")
    public static int[] field4119;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBII)I", line = 6)
    public static final int method1832(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4116++;
        int var5 = arg0 & 0xF;
        int var6 = var5 < 8 ? arg4 : arg1;
        if (arg2 == -34) {
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg3) : arg1;
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return 33;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 23)
    public static void method1833(int arg0) {
        field4118 = null;
        if (arg0 == 104) {
            field4120 = null;
            field4119 = null;
            field4117 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[B)V")
    public abstract void method1811(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1810(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1809(boolean arg0);
}
