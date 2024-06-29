import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class177 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Ljd;")
    public static class92 field3407 = class202.method1325((byte) 90, "mapdots");

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Ljd;")
    public static class92 field3413 = class202.method1325((byte) 90, ":duelstake:");

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3412 = 0;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3402 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Ljd;")
    public static class92 field3415 = class202.method1325((byte) 90, "Konfig geladen)3");

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lmg;")
    public static class123 field3404;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field3413 = null;
        field3415 = null;
        field3404 = null;
        if (arg0 == 75) {
            field3402 = null;
            field3407 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1167(boolean arg0, int arg1) {
        if (arg0) {
            field3404 = null;
        }
        field3408++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class13.field383[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method1168(int arg0) {
        if (arg0 <= 37) {
            return;
        }
        field3411++;
        for (class35 var1 = (class35) class32.field725.method103(57); var1 != null; var1 = (class35) class32.field725.method100(-49)) {
            if (class81.field1639 != var1.field807 || class158.field3150 > var1.field803) {
                var1.method1370(126);
            } else if (var1.field819 <= class158.field3150) {
                if (var1.field795 > 0) {
                    class129 var2 = class107.field2187[var1.field795 - 1];
                    if (var2 != null && var2.field246 >= 0 && var2.field246 < 13312 && var2.field208 >= 0 && var2.field208 < 13312) {
                        var1.method227(var2.field246, class118.method804(var2.field246, var1.field807, var2.field208, 0) - var1.field817, class158.field3150, var2.field208, (byte) 113);
                    }
                }
                if (var1.field795 < 0) {
                    int var3 = -var1.field795 - 1;
                    class91 var4;
                    if (class170.field3313 == var3) {
                        var4 = class15.field423;
                    } else {
                        var4 = class172.field3347[var3];
                    }
                    if (var4 != null && var4.field246 >= 0 && var4.field246 < 13312 && var4.field208 >= 0 && var4.field208 < 13312) {
                        var1.method227(var4.field246, class118.method804(var4.field246, var1.field807, var4.field208, 0) - var1.field817, class158.field3150, var4.field208, (byte) 97);
                    }
                }
                var1.method225(0, class76.field1588);
                class113.method762(class81.field1639, (int) var1.field800, (int) var1.field792, (int) var1.field791, 60, var1, var1.field816, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILnh;B)[Lsc;")
    public static final class173[] method1169(int arg0, class133 arg1, byte arg2) {
        field3410++;
        if (class204.method1332(arg0, arg1, 125)) {
            int var3 = 46 / ((20 - arg2) / 39);
            return class66.method391((byte) 85);
        } else {
            return null;
        }
    }
}
