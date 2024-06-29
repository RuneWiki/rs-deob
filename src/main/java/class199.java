import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class199 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lea;")
    public static class38 field3933 = class9.method46((byte) 114, "mapedge");

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3935 = 1;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lea;")
    public static class38 field3928 = class9.method46((byte) 119, "m");

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
    public static int[] field3929 = new int[128];

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Ldd;")
    public static class32 field3930;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lic;")
    public static class75 field3931;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLea;Z)V")
    public static final void method1307(byte arg0, class38 arg1, boolean arg2) {
        class38 var3 = arg1.method251(12131);
        if (arg0 < 88) {
            field3929 = null;
        }
        field3932++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class95.field2142; var6++) {
            class2 var13 = class117.method908(var6, (byte) 127);
            if ((!arg2 || var13.field1) && var13.field38.method251(12131).method260(-126, var3) != -1) {
                if (var5 >= 100) {
                    class53.field1343 = -1;
                    class183.field3659 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var14 = new short[var4.length * 2];
                    for (int var15 = 0; var15 < var5; var15++) {
                        var14[var15] = var4[var15];
                    }
                    var4 = var14;
                }
                var4[var5++] = (short) var6;
            }
        }
        class22.field467 = 0;
        class53.field1343 = var5;
        int var7 = var5;
        class183.field3659 = var4;
        boolean var8;
        do {
            if (var7 <= 0) {
                return;
            }
            var8 = true;
            var7--;
            for (int var9 = 0; var9 < var7; var9++) {
                class2 var10 = class117.method908(var4[var9], (byte) 89);
                class2 var11 = class117.method908(var4[var9 + 1], (byte) 81);
                if (var10.field38.method247(var11.field38, 10303) > 0) {
                    var8 = false;
                    short var12 = var4[var9];
                    var4[var9] = var4[var9 + 1];
                    var4[var9 + 1] = var12;
                }
            }
        } while (!var8);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1308(byte arg0) {
        field3931 = null;
        field3933 = null;
        if (arg0 != -108) {
            method1307((byte) -7, null, true);
        }
        field3929 = null;
        field3928 = null;
        field3930 = null;
    }
}
