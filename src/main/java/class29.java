import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class29 {

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "Lvi;")
    private class560 field279 = new class560(64);

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "Lpq;")
    private class159 field284;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "Lcb;")
    public static class318 field281 = new class318(105, 6);

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "Lfca;")
    public static class188 field285;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "[I")
    public static int[] field283;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Lpv;")
    public final class332 method178(int arg0, int arg1) {
        field282++;
        class560 var3 = this.field279;
        class332 var4;
        synchronized (this.field279) {
            var4 = (class332) this.field279.method3134((long) arg0, -116);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 <= 24) {
            this.field280 = -115;
        }
        class159 var5 = this.field284;
        byte[] var6;
        synchronized (this.field284) {
            var6 = this.field284.method1087(19, arg0, 1);
        }
        class332 var7 = new class332();
        if (var6 != null) {
            var7.method2125(new class138(var6), true);
        }
        class560 var8 = this.field279;
        synchronized (this.field279) {
            this.field279.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
    public static void method179(byte arg0) {
        if (arg0 == 65) {
            field283 = null;
            field281 = null;
            field285 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)Laf;")
    public static final class651 method180(int arg0, int arg1, int arg2) {
        if (class145.field1841[arg0][arg1][arg2] == null) {
            boolean var3 = class145.field1841[0][arg1][arg2] != null && class145.field1841[0][arg1][arg2].field9225 != null;
            if (var3 && arg0 >= class87.field1079 - 1) {
                return null;
            }
            class207.method1295(arg0, arg1, arg2);
        }
        return class145.field1841[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class29(class484 arg0, int arg1, class159 arg2) {
        this.field284 = arg2;
        this.field280 = this.field284.method1076(19, 0);
    }
}
