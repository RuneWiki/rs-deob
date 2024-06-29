import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class596 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljn;")
    private class117 field8623 = new class117(64);

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lvo;")
    private class345 field8631;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljn;")
    public static class117 field8625 = new class117(64);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[Lpi;")
    public static class302[] field8630;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Ljq;")
    public final class348 method3409(byte arg0, int arg1) {
        if (arg0 != 52) {
            return null;
        }
        field8629++;
        class117 var3 = this.field8623;
        class348 var4;
        synchronized (this.field8623) {
            var4 = (class348) this.field8623.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field8631;
        byte[] var6;
        synchronized (this.field8631) {
            var6 = this.field8631.method2081(arg0 ^ 0x3, arg1, 5);
        }
        class348 var7 = new class348();
        if (var6 != null) {
            var7.method2119(new class465(var6), (byte) -98);
        }
        class117 var8 = this.field8623;
        synchronized (this.field8623) {
            this.field8623.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)Lvfa;")
    public static final class438 method3410(int arg0, byte[] arg1) {
        field8624++;
        class438 var2 = new class438();
        class465 var3 = new class465(arg1);
        var3.field6710 = var3.field6719.length - 2;
        int var4 = var3.method2755((byte) -69);
        int var5 = var3.field6719.length - var4 - 2 - 12;
        var3.field6710 = var5;
        int var6 = var3.method2691((byte) -67);
        var2.field6309 = var3.method2755((byte) -117);
        var2.field6296 = var3.method2755((byte) -120);
        var2.field6307 = var3.method2755((byte) -90);
        var2.field6304 = var3.method2755((byte) -47);
        int var7 = var3.method2705(-96);
        if (var7 > 0) {
            var2.field6303 = new class482[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2755((byte) -112);
                class482 var10 = new class482(class99.method830(var9, false));
                var2.field6303[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2691((byte) -67);
                    int var12 = var3.method2691((byte) -67);
                    var10.method2816(new class83(var12), (long) var11, false);
                }
            }
        }
        var3.field6710 = 0;
        var2.field6310 = var3.method2734((byte) -103);
        int var13 = 121 % ((25 - arg0) / 61);
        var2.field6300 = new int[var6];
        var2.field6301 = new int[var6];
        var2.field6299 = new String[var6];
        int var14 = 0;
        while (var5 > var3.field6710) {
            int var15 = var3.method2755((byte) -86);
            if (var15 == 3) {
                var2.field6299[var14] = var3.method2717(true).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field6301[var14] = var3.method2705(-123);
            } else {
                var2.field6301[var14] = var3.method2691((byte) -67);
            }
            var2.field6300[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static void method3411(boolean arg0) {
        field8625 = null;
        field8630 = null;
        if (!arg0) {
            field8630 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static final void method3412(byte arg0) {
        if (class683.field9716 != -1) {
            class595.method3404(-1, false, class683.field9716, -1, (byte) -6);
            class683.field9716 = -1;
        }
        field8627++;
        int var1 = 113 / ((arg0 - 67) / 39);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3413(int arg0, int arg1, byte arg2) {
        field8628++;
        if (arg2 != -32) {
            method3413(-119, -10, (byte) -11);
        }
        return class491.method2880(-89, arg0, arg1) | (arg0 & 0x60000) != 0 || class229.method1499(arg1, arg0, 24314) || class70.method574(false, arg1, arg0);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class596(class529 arg0, int arg1, class345 arg2) {
        this.field8631 = arg2;
        this.field8631.method2098(0, 5);
    }
}
