import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class537 extends class154 {

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public int field7297;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field7301;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "J")
    public static long field7296;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lvl;")
    public class15 field7302;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lkka;")
    public class329 field7295;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[I")
    public static int[] field7299;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 4)
    public final void method3038(int arg0) {
        field7298++;
        if (class148.field2477 < class661.field9160.length) {
            if (arg0 != -8401) {
                this.field7297 = 112;
            }
            class661.field9160[class148.field2477++] = this;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 22)
    public static void method3039(byte arg0) {
        field7299 = null;
        if (arg0 > -59) {
            method3040(-10, -66, 31);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V", line = 35)
    public static final void method3040(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        if (var3 != null) {
            class9.method60(var3.field7471);
            if (var3.field7471 != null) {
                var3.field7471 = null;
            }
        }
    }
}
