import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class63 extends class161 {

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field823 = -1;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field827 = 1;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Lap;")
    public static class279 field822;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)Loh;", line = 11)
    public static final class231 method408(int arg0, byte arg1) {
        if (arg1 <= 9) {
            method409((byte) 10);
        }
        field833++;
        return class137.field2141 && class30.field381 <= arg0 && class199.field3217 >= arg0 ? class41.field512[arg0 - class30.field381] : null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V", line = 40)
    public static void method409(byte arg0) {
        field822 = null;
        if (arg0 > -35) {
            field823 = -63;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 61)
    public static final String[] method410(String arg0, char arg1, int arg2) {
        field835++;
        int var3 = class411.method2579(arg0, (byte) 121, arg1);
        String[] var4 = new String[var3 - arg2];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V", line = 95)
    public static final void method411(int arg0) {
        field828++;
        for (int var1 = -1; var1 < class107.field1500; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class132.field2063[var1];
            }
            class219 var7 = class216.field3517[var6];
            if (var7 != null && var7.field1846 > 0) {
                var7.field1846--;
                if (var7.field1846 == 0) {
                    var7.field1823 = null;
                }
            }
        }
        int var2 = -73 / ((arg0 + 74) / 42);
        for (int var3 = 0; var3 < class397.field5940; var3++) {
            int var4 = class423.field6253[var3];
            class50 var5 = class39.field499[var4];
            if (var5 != null && var5.field1846 > 0) {
                var5.field1846--;
                if (var5.field1846 == 0) {
                    var5.field1823 = null;
                }
            }
        }
    }
}
