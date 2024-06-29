import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class276 extends class296 {

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public int field3948 = -1;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public int field3940 = -1;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "Liu;")
    public static class390 field3951 = new class390(64, -1);

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "[Lqg;")
    public static class307[] field3952;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB[B)I")
    public static final int method1694(int arg0, byte arg1, byte[] arg2) {
        ++field3946;
        return arg1 != 19 ? -53 : class134.method805(0, arg0, (byte) 95, arg2);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public static final void method1695(boolean arg0) {
        class415.field6150 = new class147[50];
        class124.field1611 = 0;
        ++field3942;
        if (arg0) {
            field3953 = -3;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method1696(int arg0) {
        field3952 = null;
        if (arg0 == 0) {
            field3951 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        if (arg1) {
            this.method364((class134) null, false);
        }
        ++field3941;
        class33 var3 = arg0.method830();
        var3.method278(super.field4325, super.field4316, super.field4323);
        class408 var4 = class118.method675(-128, 3);
        if (~this.field3940 != 0) {
            class327 var5 = class405.field5947.method1162(this.field3940, 0).method2204(2048, -1, (class168) null, true, 0, this.field3945, arg0, (class206) null, 0);
            if (var5 != null) {
                var5.method191(var3, var4.field5983[2], 0);
            }
        }
        if (~this.field3948 != 0) {
            class327 var6 = class405.field5947.method1162(this.field3948, 0).method2204(2048, -1, (class168) null, true, 0, this.field3950, arg0, (class206) null, 0);
            if (var6 != null) {
                var6.method191(var3, var4.field5983[1], 0);
            }
        }
        class327 var7 = class405.field5947.method1162(this.field3947, 0).method2204(2048, -1, (class168) null, true, 0, this.field3944, arg0, (class206) null, 0);
        if (var7 != null) {
            var7.method191(var3, var4.field5983[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field3943;
        class33 var5 = arg1.method830();
        int var6 = -9 % ((arg2 - -23) / 38);
        var5.method278(super.field4325, super.field4316, super.field4323);
        class327 var7 = class405.field5947.method1162(this.field3947, 0).method2204(131072, -1, (class168) null, true, 0, this.field3944, arg1, (class206) null, 0);
        if (var7 != null && var7.method184(arg0, arg3, var5, true)) {
            return true;
        } else {
            if (~this.field3948 != 0) {
                class327 var8 = class405.field5947.method1162(this.field3948, 0).method2204(131072, -1, (class168) null, true, 0, this.field3950, arg1, (class206) null, 0);
                if (var8 != null && var8.method184(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            if (~this.field3940 != 0) {
                class327 var9 = class405.field5947.method1162(this.field3940, 0).method2204(131072, -1, (class168) null, true, 0, this.field3945, arg1, (class206) null, 0);
                if (var9 != null && var9.method184(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        if (arg1 == -1) {
            ++field3949;
        }
    }
}
