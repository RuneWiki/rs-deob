import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class163 {

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lfr;")
    private class231 field2591 = new class231(256);

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Ll;")
    private class196 field2592;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lih;")
    private class214 field2588;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Let;")
    public static class503 field2587;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)Z")
    public static final boolean method1122(int arg0, int arg1, int arg2) {
        field2593++;
        return arg1 == 16619 ? (class105.method724(arg0, (byte) 116, arg2) | class140.method1042(arg0, arg1 ^ 0x40C9, arg2) | class243.method1663(arg0, arg1 - 16983, arg2)) & class477.method2816(3, arg0, arg2) : false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public final void method1123(byte arg0) {
        this.field2591.method1603((byte) -112, 5);
        field2589++;
        int var2 = 121 / ((56 - arg0) / 42);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2587 = null;
        int var1 = 100 % ((61 - arg0) / 36);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lah;")
    public final class187 method1125(int arg0, int arg1) {
        field2586++;
        Object var3 = this.field2591.method1593((byte) -115, (long) arg0);
        if (var3 != null) {
            return (class187) var3;
        } else if (this.field2592.method194((byte) 89, arg0)) {
            class320 var4 = this.field2592.method195(arg0, (byte) -105);
            int var5 = var4.field5020 ? 64 : this.field2588.field3594;
            class187 var7;
            if (var4.field5040 && this.field2588.method903()) {
                float[] var6 = this.field2592.method188(0.7F, var5, -26204, var5, false, arg0);
                var7 = new class187(this.field2588, 3553, 34842, var5, var5, var4.field5015 != 0, var6, 6408);
            } else {
                short var8;
                int[] var9;
                if (var4.field5028 && class437.method2643(30132, var4.field5026)) {
                    var8 = 6407;
                    var9 = this.field2592.method197(arg0, 0.7F, var5, (byte) 103, var5, false);
                } else {
                    var9 = this.field2592.method187(false, false, var5, arg0, var5, 0.7F);
                    var8 = 6408;
                }
                var7 = new class187(this.field2588, 3553, var8, var5, var5, var4.field5015 != 0, var9, false);
            }
            var7.method1262(-1, var4.field5019, var4.field5016);
            if (arg1 <= 122) {
                this.field2592 = null;
            }
            this.field2591.method1595(var7, (long) arg0, (byte) -95);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public final void method1126(int arg0) {
        if (arg0 != -31228) {
            method1122(-1, -113, 55);
        }
        field2590++;
        this.field2591.method1604(4);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lih;Ll;)V")
    public class163(class214 arg0, class196 arg1) {
        this.field2592 = arg1;
        this.field2588 = arg0;
    }

    static {
        new class306("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
