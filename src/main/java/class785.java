import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class785 {

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "B")
    public byte field10769;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "S")
    public short field10764;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "Z")
    public boolean field10766;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public int field10760;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
    public int field10768;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "I")
    public int field10767;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "S")
    public short field10770;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "S")
    public short field10762;

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
    public int field10765;

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
    public int field10761;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "Lsi;")
    public static class769 field10763 = new class769();

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    public static int field10773 = 0;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "Lpj;")
    public static class764 field10774 = null;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field10759;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "Ld;")
    public static class101 field10772;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "Lho;")
    public static class318 field10771;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
    public static final void method4305(File arg0, String arg1, int arg2) {
        if (arg2 >= 61) {
            field10759++;
            class722.field9959.put(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
    public static void method4306(int arg0) {
        field10772 = null;
        field10771 = null;
        field10763 = null;
        if (arg0 != 0) {
            method4305(null, null, -61);
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field10769 = (byte) arg8;
        this.field10764 = (short) arg4;
        this.field10766 = arg10;
        this.field10760 = arg2;
        this.field10768 = arg0;
        this.field10767 = arg1;
        this.field10770 = (short) arg6;
        this.field10762 = (short) arg5;
        this.field10765 = arg3;
        this.field10761 = arg11;
    }
}
