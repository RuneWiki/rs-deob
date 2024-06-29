import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class40 {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Ljda;")
    private class239 field634 = new class239(64);

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Laj;")
    private class333 field633;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Ljw;")
    public static class581 field629 = new class581(49, -2);

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
    public static int[] field635 = new int[32];

    @OriginalMember(owner = "client!be", name = "j", descriptor = "F")
    public static float field638;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lmi;", line = 11)
    public final class523 method276(int arg0, int arg1) {
        field631++;
        int var3 = 5 / ((arg0 - 48) / 59);
        class239 var4 = this.field634;
        class523 var5;
        synchronized (this.field634) {
            var5 = (class523) this.field634.method1541(-10, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class333 var6 = this.field633;
        byte[] var7;
        synchronized (this.field633) {
            var7 = this.field633.method2095(arg1, 19, 1);
        }
        class523 var8 = new class523();
        if (var7 != null) {
            var8.method3020(new class376(var7), 0);
        }
        class239 var9 = this.field634;
        synchronized (this.field634) {
            this.field634.method1544(true, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Lcha;", line = 42)
    public static final class230 method277(int arg0, boolean arg1) {
        field630++;
        class230 var2 = (class230) class9.field138.method1541(-10, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class491.field6807.method2095(arg0, 1, 1);
        class230 var4 = new class230();
        var4.field3128 = arg0;
        if (var3 != null) {
            var4.method1509((byte) 21, new class376(var3));
        }
        var4.method1503(1);
        if (var4.field3140 == 2 && class179.field2380.method3953((long) arg0, 14) == null) {
            class179.field2380.method3962((long) arg0, new class119(class134.field1970), -108);
            class413.field5936[class134.field1970++] = var4;
        }
        class9.field138.method1544(arg1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 106)
    public class40(class285 arg0, int arg1, class333 arg2) {
        this.field633 = arg2;
        this.field632 = this.field633.method2090(19, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 96)
    public static void method278(boolean arg0) {
        field629 = null;
        if (arg0) {
            field637 = 84;
        }
        field635 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lor;B)V", line = 119)
    public static final void method279(class668 arg0, byte arg1) {
        field636++;
        if (!class497.field6870) {
            return;
        }
        class527.field7223++;
        if (arg0.field9239 != null) {
            class668 var2 = class452.method2690(-4353, class372.field5384, class121.field1770);
            if (var2 != null) {
                class12 var3 = new class12();
                var3.field186 = arg0.field9239;
                var3.field189 = var2;
                var3.field190 = arg0;
                class173.method1235(var3);
            }
        }
        if (arg1 > -95) {
            field639 = -78;
        }
        class267 var4 = class545.method3099((byte) 63, class269.field3966, class728.field10113);
        var4.field3938.method2354(arg0.field9221, (byte) 119);
        var4.field3938.method2396(1662353656, class372.field5384);
        var4.field3938.method2415(false, arg0.field9283);
        var4.field3938.method2362((byte) -101, class121.field1770);
        var4.field3938.method2362((byte) -119, class167.field2258);
        var4.field3938.method2363(29262, arg0.field9318);
        class617.method3392(var4, true);
    }
}
