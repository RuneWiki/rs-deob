import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class359 {

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5245 = "Opened title screen";

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "J")
    public long field5248;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Lqs;")
    public class359 field5243;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lqs;")
    public class359 field5247;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)Lmk;")
    public static final class34 method2287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5244++;
        if (arg1 != 0) {
            method2291((char) 65461, -51);
        }
        class333[] var5 = null;
        class158 var6 = class434.method2699(16626, arg4);
        if (var6.field2242 != null) {
            var5 = new class333[var6.field2242.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class367 var8 = class360.method2293(var6.field2242[var7], (byte) -85);
                var5[var7] = new class333(var8.field5356, var8.field5363, var8.field5355, var8.field5365, var8.field5359, var8.field5369, var8.field5364, var8.field5354);
            }
        }
        return new class34(var6.field2235, var5, var6.field2240, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method2288(byte arg0) {
        field5245 = null;
        if (arg0 != 51) {
            method2291('\f', 33);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
    public final boolean method2289(int arg0) {
        if (arg0 < 96) {
            this.field5243 = null;
        }
        field5246++;
        return this.field5247 != null;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
    public final void method2290(byte arg0) {
        field5241++;
        if (this.field5247 == null) {
            return;
        }
        this.field5247.field5243 = this.field5243;
        this.field5243.field5247 = this.field5247;
        if (arg0 != 98) {
            this.field5247 = null;
        }
        this.field5247 = null;
        this.field5243 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(CI)Z")
    public static final boolean method2291(char arg0, int arg1) {
        int var2 = -51 % ((arg1 + 57) / 46);
        field5242++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
