import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class408 {

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Ler;")
    private class157 field6161 = new class157(64);

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "Lns;")
    private class438 field6160;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public int field6165;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Lf;")
    public static class191 field6158;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)Ljg;")
    public final class513 method2488(int arg0, byte arg1) {
        field6159++;
        class157 var3 = this.field6161;
        class513 var4;
        synchronized (this.field6161) {
            var4 = (class513) this.field6161.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6160.method2650(arg0, -93, 19);
        class513 var6 = new class513();
        if (arg1 < 41) {
            this.method2488(76, (byte) 116);
        }
        if (var5 != null) {
            var6.method3052(-13, new class91(var5));
        }
        class157 var7 = this.field6161;
        synchronized (this.field6161) {
            this.field6161.method1012(-65, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)Z")
    public static final boolean method2489(int arg0, int arg1, int arg2) {
        if (arg2 == -22050) {
            field6164++;
            return class511.method3045(arg0, (byte) 42, arg1) & class80.method518(arg0, 2048, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2490(int arg0, byte arg1, int arg2) {
        int var3 = -94 % ((-arg1 - 34) / 47);
        field6162++;
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static void method2491(int arg0) {
        if (arg0 > -75) {
            method2489(-14, -85, 70);
        }
        field6158 = null;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class408(class331 arg0, int arg1, class438 arg2) {
        this.field6160 = arg2;
        this.field6165 = this.field6160.method2645(1, 19);
    }
}
