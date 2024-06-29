import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class303 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Loh;")
    public static class258 field5171 = class153.method1046("<col=ffff00>", 89);

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Loh;")
    public static class258 field5176 = class153.method1046("sch-Utteln:", 101);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Ls;")
    public static class171 field5173;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient;")
    public static client field5178;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[Lkl;")
    public static class65[] field5175;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLva;)V", line = 5)
    public static final void method2120(byte arg0, class235 arg1) {
        if (arg0 != -67) {
            return;
        }
        field5177++;
        while (true) {
            while (arg1.field4051 < arg1.field4066.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1589(66) == 1) {
                    var3 = arg1.method1589(arg0 + 177);
                    var2 = true;
                    var4 = arg1.method1589(69);
                }
                int var5 = arg1.method1589(82);
                int var6 = arg1.method1589(arg0 + 132);
                int var7 = class317.field5348 + class225.field3870 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class49.field735;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class57.field907 && var7 < class225.field3870) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method1617((byte) -117);
                                if (var13 != 0) {
                                    if (class19.field224[var9][var10] == null) {
                                        class19.field224[var9][var10] = new byte[4096];
                                    }
                                    class19.field224[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1617((byte) -117);
                                    if (class56.field885[var9][var10] == null) {
                                        class56.field885[var9][var10] = new byte[4096];
                                    }
                                    class56.field885[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1617((byte) -117);
                        if (var16 != 0) {
                            arg1.field4051++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 140)
    public static void method2121(boolean arg0) {
        field5178 = null;
        field5173 = null;
        field5176 = null;
        field5171 = null;
        field5175 = null;
        if (!arg0) {
            method2120((byte) 74, (class235) null);
        }
    }
}
