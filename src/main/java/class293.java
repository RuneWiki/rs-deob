import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class293 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "J")
    public long field4618 = 0L;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field4620 = 5063219;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Z")
    public static boolean field4622 = true;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Lji;")
    public class43 field4619;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZIIII[Lre;)V")
    public static final void method1959(boolean arg0, int arg1, int arg2, int arg3, int arg4, class228[] arg5) {
        field4608++;
        if (arg2 != 255) {
            method1960(-24);
        }
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class228 var7 = arg5[var6];
            if (var7 != null && var7.field3467 == arg3) {
                class257.method1745(arg4, var7, arg1, true, arg0);
                class230.method1533((byte) 19, arg1, var7, arg4);
                if (var7.field3606 > var7.field3522 - var7.field3574) {
                    var7.field3606 = var7.field3522 - var7.field3574;
                }
                if ((var7.field3513 - var7.field3625) < var7.field3523) {
                    var7.field3523 = var7.field3513 - var7.field3625;
                }
                if (var7.field3523 < 0) {
                    var7.field3523 = 0;
                }
                if (var7.field3606 < 0) {
                    var7.field3606 = 0;
                }
                if (var7.field3477 == 0) {
                    class258.method1753(var7, -15085, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Led;")
    public static final class186 method1960(int arg0) {
        field4617++;
        int var1 = class28.field390[0] * class171.field2679[0];
        byte[] var2 = class198.field3123[0];
        int[] var3 = new int[var1];
        if (arg0 != -13810) {
            return null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class94.field1601[class55.method420(255, var2[var4])];
        }
        class276 var5 = new class276(class213.field3317, class130.field2056, class193.field3066[0], class108.field1779[0], class28.field390[0], class171.field2679[0], var3);
        class19.method179(8);
        return var5;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIZZZ)Lhc;")
    public static final class235 method1961(byte arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field4628++;
        class103 var5 = null;
        int var6 = 98 / ((arg0 - 47) / 59);
        if (class259.field4141 != null) {
            var5 = new class103(arg1, class259.field4141, class122.field1963[arg1], 1000000);
        }
        class230.field3659[arg1] = class147.field2328.method987(class223.field3421, arg1, var5, 105);
        if (arg3) {
            class230.field3659[arg1].method1970((byte) 31);
        }
        return new class235(class230.field3659[arg1], arg2, arg4);
    }
}
