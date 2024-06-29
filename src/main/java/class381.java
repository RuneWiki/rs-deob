import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class381 extends class499 {

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field5292 = class384.method2276(86, 1600);

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lqj;")
    public static class512 field5298 = new class512();

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Ljava/lang/String;")
    public String field5290;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "[Lsa;")
    public static class206[] field5297;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILlg;Lkaa;)Lpf;")
    public static final class583 method2246(int arg0, class417 arg1, class47 arg2) {
        field5299++;
        class583 var3 = class6.method83((byte) -62);
        var3.field7640 = arg2.field596;
        if (arg0 != 1) {
            field5297 = null;
        }
        var3.field7636 = arg2;
        if (var3.field7640 == -1) {
            var3.field7637 = new class276(260);
        } else if (var3.field7640 == -2) {
            var3.field7637 = new class276(10000);
        } else if (var3.field7640 <= 18) {
            var3.field7637 = new class276(20);
        } else if (var3.field7640 > 98) {
            var3.field7637 = new class276(260);
        } else {
            var3.field7637 = new class276(100);
        }
        var3.field7637.method1663(arg1, 8);
        var3.field7637.method1656(false, var3.field7636.method330(-1));
        var3.field7634 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method2247(int arg0) {
        if (arg0 == 10000) {
            field5298 = null;
            field5297 = null;
        }
    }
}
