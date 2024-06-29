import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class679 extends class408 {

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "[B")
    public byte[] field9437;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "I")
    public static int field9433 = -1;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "[I")
    public static int[] field9438 = new int[1];

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "[I")
    public static int[] field9435 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Ljava/lang/String;", line = 5)
    public static final String method3895(int arg0, int arg1, int arg2) {
        field9439++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < arg0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILrg;)Lbe;", line = 47)
    public static final class38 method3896(int arg0, class645 arg1) {
        arg1.method3745(-6314);
        field9434++;
        int var2 = arg1.method3745(-6314);
        int var3 = -36 / ((-arg0 - 40) / 32);
        class38 var4 = class210.method1424(var2, false);
        var4.field382 = arg1.method3745(-6314);
        int var5 = arg1.method3745(-6314);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.method3745(-6314);
            var4.method190(108, var7, arg1);
        }
        var4.method191((byte) 126);
        return var4;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "([B)V", line = 92)
    public class679(byte[] arg0) {
        this.field9437 = arg0;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V", line = 100)
    public static void method3897(byte arg0) {
        field9435 = null;
        field9438 = null;
        if (arg0 != 118) {
            method3897((byte) 35);
        }
    }
}
