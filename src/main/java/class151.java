import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class151 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
    public static int[] field2650 = new int[2];

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Loa;")
    private static class99 field2653 = class221.method1463(2844, "Close");

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Loa;")
    public static class99 field2654 = class221.method1463(2844, "Particles: ");

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2658 = 0;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Loa;")
    public static class99 field2657 = class221.method1463(2844, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Loa;")
    public static class99 field2655 = field2653;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([BBII)Z")
    public static final boolean method1005(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 102) {
            return true;
        }
        boolean var4 = true;
        field2656++;
        class261 var5 = new class261(arg0);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method1721(false);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var12;
                class153 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1742(-957401312);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method1693((byte) 23);
                                    }
                                    int var10 = var5.method1742(-957401312);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method1693((byte) 88) >> 2;
                                    int var13 = var8 >> 6 & 0x3F;
                                    var14 = arg2 + var11;
                                    var15 = arg3 + var13;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class247.method1601(26012, var6);
                } while (var12 == 22 && !class63.field1072 && var16.field2716 == 0 && var16.field2685 != 1 && !var16.field2686);
                if (!var16.method1029(0)) {
                    class117.field2076++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2650 = null;
        field2655 = null;
        field2657 = null;
        field2654 = null;
        if (arg0 != 1) {
            field2658 = 64;
        }
        field2653 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
    public static final boolean method1007(int arg0, int arg1) {
        field2651++;
        if (arg0 == -104) {
            return (-arg1 & arg1) == arg1;
        } else {
            return false;
        }
    }
}
