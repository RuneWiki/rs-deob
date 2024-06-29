import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class65 extends class51 {

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Lpj;")
    public static class237 field1289 = class33.method353("<col=00ff00>", 66);

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lpj;")
    public static class237 field1286 = class33.method353("Ausw-=hlen", 102);

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lpj;")
    public static class237 field1291 = class33.method353("Konfig geladen)3", 85);

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lva;")
    public static class34 field1288 = new class34(5000);

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "Lpj;")
    public static class237 field1293 = class33.method353("", 96);

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Lpj;")
    public static class237 field1292 = class33.method353("(Y<)4col>", 47);

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "B")
    public static byte field1295;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Lkk;")
    public static class224 field1296;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "[I")
    public static int[] field1294;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public static final void method537(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1287++;
        if (arg4 > arg1) {
            class199.method1361(arg3, arg4, class62.field1241[arg0], arg1, 95);
        } else {
            class199.method1361(arg3, arg1, class62.field1241[arg0], arg4, 124);
        }
        int var5 = -100 / ((-arg2 - 62) / 32);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method538(byte arg0) {
        field1288 = null;
        field1296 = null;
        field1291 = null;
        field1293 = null;
        field1294 = null;
        if (arg0 != -83) {
            field1289 = null;
        }
        field1289 = null;
        field1286 = null;
        field1292 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Laf;ILjava/lang/Object;)V")
    public static final void method539(class67 arg0, int arg1, Object arg2) {
        field1290++;
        if (arg0.field1318 == null) {
            return;
        }
        if (arg1 != 9884) {
            method538((byte) 3);
        }
        for (int var3 = 0; var3 < 50 && arg0.field1318.peekEvent() != null; var3++) {
            class84.method645(1, 1L);
        }
        if (arg2 != null) {
            arg0.field1318.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }
}
