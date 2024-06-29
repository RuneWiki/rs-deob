import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class521 {

    @OriginalMember(owner = "client!si", name = "h", descriptor = "S")
    public short field7377;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "S")
    public short field7382;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
    public boolean field7379;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public int field7376;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field7372;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public int field7371;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "B")
    public byte field7380;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "S")
    public short field7383;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lr;")
    public static class167 field7381;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILpl;)V")
    public static final void method3064(int arg0, class604 arg1) {
        if (arg0 != 0) {
            return;
        }
        if ((arg1 instanceof class22)) {
            class22 var3 = (class22) arg1;
            if (var3.field880 != null) {
                class434.method2638(-1, class532.field7456.field9814 != var3.field9814, var3);
            }
        } else if (arg1 instanceof class602) {
            class602 var2 = (class602) arg1;
            class165.method1254(var2, class532.field7456.field9814 != var2.field9814, false);
        }
        field7378++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method3065(int arg0) {
        if (arg0 > -122) {
            field7373 = -39;
        }
        field7381 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBII)V")
    public static final void method3066(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -91 / ((-arg2 - 63) / 60);
        for (int var6 = 0; var6 < class152.field2587; var6++) {
            Rectangle var7 = class293.field4404[var6];
            if (arg1 < var7.x + var7.width && var7.x < (arg1 + arg3) && var7.y + var7.height > arg4 && (arg0 + arg4) > var7.y) {
                class248.field3731[var6] = true;
            }
        }
        field7374++;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7377 = (short) arg4;
        this.field7382 = (short) arg6;
        this.field7370 = arg11;
        this.field7379 = arg10;
        this.field7376 = arg1;
        this.field7372 = arg2;
        this.field7371 = arg3;
        this.field7380 = (byte) arg8;
        this.field7375 = arg0;
        this.field7383 = (short) arg5;
    }
}
