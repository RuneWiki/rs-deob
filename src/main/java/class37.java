import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class37 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lse;")
    public static class168 field582 = new class168();

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field584 = 0;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lai;")
    public static class10 field588 = class44.method278("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -63);

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lai;")
    private static class10 field590 = class44.method278("No reply from loginserver)3", 118);

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lai;")
    public static class10 field591 = class44.method278("0(U", 111);

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lai;")
    public static class10 field587 = field590;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lbf;")
    public static class17 field589;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method247(byte arg0) {
        field591 = null;
        field590 = null;
        field582 = null;
        field588 = null;
        if (arg0 != 96) {
            field590 = null;
        }
        field587 = null;
        field589 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([Lwa;IB)V")
    public static final void method248(class200[] arg0, int arg1, byte arg2) {
        field581++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class200 var4 = arg0[var3];
            if (var4 != null && var4.field3794 == arg1 && (!var4.field3927 || !class185.method1195(var4, (byte) 65))) {
                if (var4.field3888 == 0) {
                    if (!var4.field3927 && class185.method1195(var4, (byte) 52) && class77.field1342 != var4) {
                        continue;
                    }
                    method248(arg0, var4.field3833, (byte) -27);
                    if (var4.field3796 != null) {
                        method248(var4.field3796, var4.field3833, (byte) -78);
                    }
                    class118 var5 = (class118) class165.field3162.method213(-111, (long) var4.field3833);
                    if (var5 != null) {
                        class94.method616(var5.field2272, -99);
                    }
                }
                if (var4.field3888 == 6) {
                    if (var4.field3920 != -1 || var4.field3763 != -1) {
                        boolean var6 = class206.method1333(var4, (byte) 127);
                        int var7;
                        if (var6) {
                            var7 = var4.field3763;
                        } else {
                            var7 = var4.field3920;
                        }
                        if (var7 != -1) {
                            class77 var8 = class142.method958((byte) -104, var7);
                            var4.field3860 += class145.field2769;
                            while (var8.field1358[var4.field3893] < var4.field3860) {
                                var4.field3860 -= var8.field1358[var4.field3893];
                                var4.field3893++;
                                if (var4.field3893 >= var8.field1339.length) {
                                    var4.field3893 -= var8.field1355;
                                    if (var4.field3893 < 0 || var4.field3893 >= var8.field1339.length) {
                                        var4.field3893 = 0;
                                    }
                                }
                                class168.method1116(var4, -93);
                            }
                        }
                    }
                    if (var4.field3804 != 0 && !var4.field3927) {
                        int var9 = var4.field3804 >> 16;
                        int var10 = var4.field3804 << 16 >> 16;
                        int var11 = class145.field2769 * var9;
                        var4.field3827 = var4.field3827 + var11 & 0x7FF;
                        int var12 = class145.field2769 * var10;
                        var4.field3909 = var4.field3909 + var12 & 0x7FF;
                        class168.method1116(var4, -100);
                    }
                }
            }
        }
        if (arg2 > -10) {
            method249((byte) 18);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static final void method249(byte arg0) {
        class101.field1887.method1000(10523);
        class25.field387 = null;
        field583++;
        if (arg0 >= -12) {
            field591 = null;
        }
        class75.field1290 = 1;
    }
}
