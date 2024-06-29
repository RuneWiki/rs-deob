import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class188 {

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "B")
    public byte field2771 = 0;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "S")
    public short field2752;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "S")
    public short field2759;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "B")
    public byte field2769;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "B")
    public byte field2763;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field2765 = -1;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "B")
    public byte field2754;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "B")
    public byte field2761;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "B")
    public byte field2762;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "B")
    public byte field2766;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lib;")
    public class108 field2756;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Lmm;")
    public class188 field2772;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Lwg;")
    public class300 field2767;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Lpr;")
    public class317 field2773;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Log;")
    public class467 field2753;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lbl;")
    public class468 field2751;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "Lbl;")
    public class468 field2764;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Lpl;")
    public class469 field2755;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Lpl;")
    public class469 field2774;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "S")
    public short field2768;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
    public boolean field2750;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    public boolean field2757;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Z")
    public boolean field2758;

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(III)V")
    public class188(int arg0, int arg1, int arg2) {
        this.field2752 = (short) arg1;
        this.field2759 = (short) arg2;
        this.field2763 = this.field2769 = (byte) arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lwh;")
    public static final class102 method1287(byte arg0) {
        field2760++;
        if (arg0 != 0) {
            field2765 = -11;
        }
        class102 var1 = (class102) class413.field5847.method908(94);
        if (var1 == null) {
            return new class102();
        } else {
            class181.field2673--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsv;)V")
    public static final void method1288(class478 arg0) {
        for (int var1 = arg0.field6971; var1 <= arg0.field6970; var1++) {
            for (int var2 = arg0.field6962; var2 <= arg0.field6959; var2++) {
                class188 var3 = class461.field6675[arg0.field6956][var1][var2];
                if (var3 != null) {
                    class317 var4 = var3.field2773;
                    class317 var5 = null;
                    while (var4 != null) {
                        if (var4.field4711 == arg0) {
                            if (var5 == null) {
                                var3.field2773 = var4.field4709;
                            } else {
                                var5.field4709 = var4.field4709;
                            }
                            var4.method2003(false);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4709;
                    }
                    var3.field2771 = 0;
                    for (class317 var6 = var3.field2773; var6 != null; var6 = var6.field4709) {
                        var3.field2771 = (byte) (var3.field2771 | var6.field4714);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
    public final void method1289(byte arg0) {
        while (this.field2773 != null) {
            class317 var2 = this.field2773.field4709;
            this.field2773.method2003(false);
            this.field2773 = var2;
        }
        field2770++;
        this.field2771 = arg0;
    }
}
