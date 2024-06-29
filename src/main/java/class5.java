import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field52 = -1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
    public String field54;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)I")
    public static final int method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field53++;
        if (arg1 != 0) {
            field52 = -104;
        }
        int var5 = 65536 - class302.field4824[arg0 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V")
    public static final void method28(int arg0, boolean arg1) {
        field51++;
        class107.method766((byte) -68);
        class205.method1432(3);
        int var2 = class301.method1988((byte) 120, arg0).field2031;
        if (var2 == 0 || !arg1) {
            return;
        }
        int var3 = class195.field3160[arg0];
        if (var2 == 6) {
            class212.field3514 = var3;
        }
        if (var2 == 5) {
            class2.field21 = var3;
        }
        if (var2 == 9) {
            class304.field4868 = var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IZ)Lfc;")
    public static final class158 method29(int arg0, boolean arg1) {
        if (!arg1) {
            method27(14, -90, -28, -12, 29);
        }
        field50++;
        class158 var2 = (class158) class78.field1297.method1261(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field1553.method1680(class144.method1011(arg0, (byte) 121), class246.method1648(arg0, 1939253256), -128);
        class158 var4 = new class158();
        var4.field2474 = arg0;
        if (var3 != null) {
            var4.method1092(new class162(var3), (byte) -21);
        }
        var4.method1079(-25517);
        if (var4.field2486) {
            var4.field2493 = false;
            var4.field2514 = 0;
        }
        if (!class298.field4748 && var4.field2479) {
            var4.field2455 = null;
        }
        class78.field1297.method1264(-1, (long) arg0, var4);
        return var4;
    }
}
