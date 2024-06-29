import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class205 {

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Ljn;")
    private class117 field3175 = new class117(64);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Ljn;")
    private class117 field3177 = new class117(100);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lvo;")
    private class345 field3166;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Z")
    public static boolean field3169 = false;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Luea;")
    public static class256 field3174 = new class256("LIVE", 0);

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Lvo;")
    public static class345 field3168;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1414(int arg0, byte arg1, int arg2) {
        if (arg1 > -57) {
            return false;
        }
        field3176++;
        class119 var3 = class14.field224.method2834(0, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method955(61, arg0);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public final void method1415(byte arg0) {
        class117 var2 = this.field3175;
        synchronized (this.field3175) {
            this.field3175.method950((byte) -124);
        }
        field3173++;
        if (arg0 != -74) {
            this.field3177 = null;
        }
        class117 var3 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method950((byte) -20);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIILbda;Lbda;)V")
    public static final void method1416(int arg0, int arg1, int arg2, class197 arg3, class197 arg4) {
        class293 var5 = class316.method1907(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field4091 = arg3;
        var5.field4095 = arg4;
        int var6 = class687.field9745 == class340.field4723 ? 1 : 0;
        if (!arg3.method633(true)) {
            class128.field2093[var6][class108.field1764[var6]++] = arg3;
        } else if (arg3.method630(44)) {
            class430.field6131[var6][class352.field4945[var6]++] = arg3;
        } else {
            class431.field6138[var6][class310.field4305[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method633(true)) {
            if (arg4.method630(-4)) {
                class430.field6131[var6][class352.field4945[var6]++] = arg4;
                return;
            }
            class431.field6138[var6][class310.field4305[var6]++] = arg4;
            return;
        }
        class128.field2093[var6][class108.field1764[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Lfo;")
    public final class606 method1417(int arg0, int arg1) {
        field3167++;
        class117 var3 = this.field3175;
        class606 var4;
        synchronized (this.field3175) {
            var4 = (class606) this.field3175.method941((long) arg1, arg0 ^ arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field3166;
        byte[] var6;
        synchronized (this.field3166) {
            var6 = this.field3166.method2081(41, class271.method1710(arg1, arg0 + 3467), class207.method1433(arg1, true));
        }
        class606 var7 = new class606();
        var7.field8725 = arg1;
        var7.field8718 = this;
        if (var6 != null) {
            var7.method3450(100, new class465(var6));
        }
        var7.method3448((byte) -80);
        class117 var8 = this.field3175;
        synchronized (this.field3175) {
            this.field3175.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public final void method1418(int arg0) {
        field3170++;
        class117 var2 = this.field3175;
        synchronized (this.field3175) {
            this.field3175.method936(-41);
        }
        class117 var3 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method936(-106);
        }
        if (arg0 != 5) {
            field3174 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field3168 = null;
        field3174 = null;
        if (arg0 != 0) {
            field3168 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)V")
    public final void method1420(int arg0, byte arg1) {
        class117 var3 = this.field3175;
        synchronized (this.field3175) {
            this.field3175.method939(arg1 + 28121, arg0);
        }
        if (arg1 != -28) {
            return;
        }
        field3171++;
        class117 var4 = this.field3177;
        synchronized (this.field3177) {
            this.field3177.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)Lhea;")
    public final class374 method1421(byte arg0, int arg1) {
        field3172++;
        class117 var3 = this.field3177;
        class374 var4;
        synchronized (this.field3177) {
            var4 = (class374) this.field3177.method941((long) arg1, 0);
            if (var4 == null) {
                var4 = new class374(arg1);
                this.field3177.method949((long) arg1, true, var4);
            }
            if (!var4.method2239(-7962)) {
                return null;
            }
        }
        if (arg0 <= 18) {
            this.method1417(68, 7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lgn;ILvo;Lvo;Lvo;)V")
    public class205(class529 arg0, int arg1, class345 arg2, class345 arg3, class345 arg4) {
        this.field3166 = arg2;
        if (this.field3166 != null) {
            int var6 = this.field3166.method2102(true) - 1;
            this.field3166.method2098(0, var6);
        }
        class673.method3809(2, arg3, arg4, 1);
    }
}
