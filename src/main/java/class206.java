import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class206 {

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ljv;")
    private class55 field2983 = new class55(64);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lbu;")
    private class17 field2982;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lno;")
    public static class494 field2984 = new class494("", 11);

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
    public static boolean field2985 = false;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "F")
    public static float field2978;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lhu;")
    public static class85 field2986;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lem;")
    public final class149 method1400(int arg0, int arg1) {
        int var3 = 60 % ((arg0 + 21) / 61);
        field2979++;
        class55 var4 = this.field2983;
        class149 var5;
        synchronized (this.field2983) {
            var5 = (class149) this.field2983.method494(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field2982.method114(arg1, 19, -85);
        class149 var7 = new class149();
        if (var6 != null) {
            var7.method1146((byte) 57, new class145(var6));
        }
        class55 var8 = this.field2983;
        synchronized (this.field2983) {
            this.field2983.method485((long) arg1, (byte) -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1401(int arg0, String arg1) {
        field2981++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class184.field2756; var2++) {
            if (arg1.equalsIgnoreCase(class436.field6504[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class139.field2224.field3684);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field2984 = null;
        int var1 = -76 / ((arg0 - 58) / 38);
        field2986 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Loq;ILbu;)V")
    public class206(class239 arg0, int arg1, class17 arg2) {
        this.field2982 = arg2;
        this.field2977 = this.field2982.method119(29630, 19);
    }
}
