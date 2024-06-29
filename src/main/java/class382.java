import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class382 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5379 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2195(int arg0) {
        if (class137.field1958 == 10 || class137.field1958 == 28) {
            class224.method1322(5000, class310.field4240 >> 10, class132.field1901 >> 10, (byte) 123);
        } else {
            int var1 = class75.field1089.field372[0] >> 3;
            int var2 = class75.field1089.field362[0] >> 3;
            if (var1 >= 0 && var1 < class442.field6435 >> 3 && var2 >= 0 && var2 < (class232.field3217 >> 3)) {
                class224.method1322(5000, var2, var1, (byte) 123);
            } else {
                class224.method1322(0, class232.field3217 >> 4, class442.field6435 >> 4, (byte) 123);
            }
        }
        field5380++;
        int var3 = -59 % ((arg0 - 53) / 35);
        class164.method1020(true);
        class125.method820(14247);
        class92.method622(94);
        class448.method2642((byte) -73);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[[[BIBII)V", line = 32)
    public static final void method2196(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class322.field4444++;
        class46.field643 = 0;
        for (int var6 = class354.field4827; var6 < class401.field5574; var6++) {
            class61[][] var17 = class385.field5410[var6];
            for (int var18 = class436.field6347; var18 < class364.field5059; var18++) {
                for (int var19 = class300.field4130; var19 < class450.field6492; var19++) {
                    class61 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class39.field529[var18 + class231.field3212 - class192.field2742][var19 + class231.field3212 - class141.field2010] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field817 = true;
                            var20.field827 = true;
                            if (var20.field819 == null) {
                                var20.field833 = false;
                            } else {
                                var20.field833 = true;
                            }
                            class46.field643++;
                        } else {
                            var20.field817 = false;
                            var20.field827 = false;
                            var20.field830 = 0;
                            if (var18 >= class192.field2742 - 16 && var18 <= class192.field2742 + 16 && var19 >= class141.field2010 - 16 && var19 <= class141.field2010 + 16 && (var20.field814 != null || var20.field832 != null || var20.field825 != null || var20.field816 != null || var20.field824 != null || var20.field819 != null)) {
                                class210.field2984.method1952(var20, (byte) 117);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class383.field5391 == class364.field5058;
        for (int var8 = class354.field4827; var8 < class401.field5574; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class344.field4741.method450() && var8 >= arg2 && arg1 != null) {
                int var10 = class39.field529.length;
                if (class39.field529.length + class436.field6347 > class469.field6860) {
                    var10 -= class39.field529.length + class436.field6347 - class469.field6860;
                }
                int var11 = class39.field529[0].length;
                if (class39.field529[0].length + class300.field4130 > class472.field6900) {
                    var11 -= class39.field529[0].length + class300.field4130 - class472.field6900;
                }
                int var12 = class93.field1248;
                while (true) {
                    if (var12 >= var10) {
                        class210.field2984.method1959(true, class383.field5391[var8], var9, 75, var8);
                        break;
                    }
                    int var13 = class436.field6347 + var12 - class93.field1248;
                    for (int var14 = class325.field4463; var14 < var11; var14++) {
                        class103.field1410[var12][var14] = false;
                        if (class39.field529[var12][var14]) {
                            int var15 = class300.field4130 + var14 - class325.field4463;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class385.field5410[var16][var13][var15] != null && class385.field5410[var16][var13][var15].field836 == var8) {
                                    class103.field1410[var12][var14] = class385.field5410[var16][var13][var15].field817;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class210.field2984.method1959(false, class383.field5391[var8], var9, 69, var8);
            }
            class210.field2984.method1951((byte) -122);
        }
        if (!class308.method1744(true)) {
            class308.method1744(false);
        }
    }
}
