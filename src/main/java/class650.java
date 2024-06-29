import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class650 {

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9057 = new Rectangle[100];

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lki;")
    public static class364 field9051 = new class364();

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "B")
    public byte field9049;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public int field9058;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Laj;")
    public static class401 field9060;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Lpe;")
    public static class615 field9053;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Ljava/lang/String;")
    public String field9050;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Ljava/lang/String;")
    public String field9052;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "Ljava/lang/String;")
    public String field9054;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Ljava/lang/String;")
    public String field9056;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)I")
    public static final int method3574(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 69 / ((arg3 - 65) / 42);
        field9055++;
        if (arg1 > arg2) {
            return arg1;
        } else if (arg0 < arg2) {
            return arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3575(int arg0, int arg1, int arg2, Class arg3) {
        class530 var4 = class483.field6438[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class571 var5 = var4.field6887; var5 != null; var5 = var5.field7445) {
            class34 var6 = var5.field7444;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field497 == arg1 && var6.field502 == arg2) {
                class708.method3876(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method3576(int arg0) {
        field9060 = null;
        field9057 = null;
        field9053 = null;
        field9051 = null;
        if (arg0 != 100) {
            method3574(46, -64, 59, 34);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
    public static final int method3577(int arg0, int arg1, int arg2) {
        field9059++;
        if (arg1 != -913897729) {
            field9060 = null;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }
}
