import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class296 {

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "Lde;")
    private class534 field3906 = new class534(64);

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "Lnd;")
    private class547 field3907;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "Lhg;")
    public static class693 field3905 = new class693(28, -1);

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "Lhg;")
    public static class693 field3908 = new class693(23, 6);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IB)Loda;", line = 8)
    public final class120 method1776(int arg0, byte arg1) {
        field3904++;
        if (arg1 != -68) {
            return null;
        }
        class534 var3 = this.field3906;
        class120 var4;
        synchronized (this.field3906) {
            var4 = (class120) this.field3906.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field3907;
        byte[] var6;
        synchronized (this.field3907) {
            var6 = this.field3907.method3153(arg0, 0, 5);
        }
        class120 var7 = new class120();
        if (var6 != null) {
            var7.method924((byte) 127, new class461(var6));
        }
        class534 var8 = this.field3906;
        synchronized (this.field3906) {
            this.field3906.method3077((byte) -59, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V", line = 40)
    public static void method1777(byte arg0) {
        field3908 = null;
        if (arg0 != 53) {
            field3908 = null;
        }
        field3905 = null;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 56)
    public class296(class102 arg0, int arg1, class547 arg2) {
        this.field3907 = arg2;
        this.field3907.method3178((byte) 73, 5);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIIII)V", line = 73)
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3903++;
        class323[] var7 = class98.field1369;
        if (arg0 != 1250620353) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class323 var9 = var7[var8];
            if (var9 != null && var9.field4163 == 2) {
                class75.method674(arg2, var9.field4159, var9.field4164, arg1 >> 1, var9.field4165, arg4 >> 1, var9.field4157 * 2, arg5, (byte) -70);
                if (class83.field1136[0] > -1 && class463.field6224 % 20 < 10) {
                    class481 var10 = class537.field7461[var9.field4155];
                    int var11 = class83.field1136[0] + arg3 - 12;
                    int var12 = class83.field1136[1] + arg6 - 28;
                    var10.method2759(var11, var12);
                    class236.method1478(-122, var12, var10.method142() + var11, var11, var12 + var10.method149());
                }
            }
        }
    }
}
