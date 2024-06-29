import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class235 extends class393 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "J")
    public long field3305;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lw;")
    public class235 field3302;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lw;")
    public class235 field3311;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lqj;")
    public static class238 field3300;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public static final void method1435(byte arg0) {
        class10.field97 = 0;
        field3308++;
        class373.field5574.method2654(0);
        class373.field5574.method2660((byte) -126, class116.field1568);
        if (arg0 <= 29) {
            field3306 = -18;
        }
        class10.field97++;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static void method1436(boolean arg0) {
        field3300 = null;
        if (!arg0) {
            field3298 = 68;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILil;)Lak;")
    public static final class220 method1437(int arg0, class265 arg1) {
        field3304++;
        arg1.method1697(-36);
        int var2 = arg1.method1697(-49);
        class220 var3 = class17.method117((byte) 123, var2);
        var3.field3128 = arg1.method1697(arg0 + 85);
        int var4 = arg1.method1697(106);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1697(arg0 + 82);
            var3.method2(var6, (byte) -49, arg1);
        }
        var3.method440(arg0 ^ arg0);
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
    public final boolean method1438(int arg0) {
        if (arg0 != -29860) {
            method1435((byte) -95);
        }
        field3299++;
        return this.field3311 != null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public final void method1439(int arg0) {
        field3301++;
        if (arg0 != -29183) {
            field3309 = 0;
        }
        if (this.field3311 != null) {
            this.field3311.field3302 = this.field3302;
            this.field3302.field3311 = this.field3311;
            this.field3311 = null;
            this.field3302 = null;
        }
    }
}
