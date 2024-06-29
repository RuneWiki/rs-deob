import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class426 {

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Lrn;")
    public static class174 field6344 = new class174(23, 7);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZLat;)V")
    public static final void method2561(int arg0, boolean arg1, class255 arg2) {
        field6342++;
        if (class363.field5500 >= 400) {
            return;
        }
        class42 var3 = arg2.field3677;
        if (var3.field797 != null) {
            var3 = var3.method427(class335.field5059, (byte) -72);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field811) {
            return;
        }
        String var4 = var3.field757;
        if (var3.field800 != 0) {
            String var5 = class428.field6357 == class403.field6054 ? class372.field5647.method2180(client.field2870, 29491) : class110.field1862.method2180(client.field2870, arg0 ^ 0xFFFF8CCC);
            var4 = var4 + class139.method1040(var3.field800, class139.field2224.field3690, (byte) -68) + " (" + var5 + var3.field800 + ")";
        }
        if (!class99.field1638) {
            if (!arg1) {
                String[] var7 = var3.field814;
                if (class203.field2966) {
                    var7 = class34.method361(0, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class403.field6054 != class168.field2608 || !var7[var8].equalsIgnoreCase(class402.field6046.method2180(client.field2870, 29491)))) {
                            byte var9 = 0;
                            int var10 = class361.field5476;
                            if (var8 == 0) {
                                var9 = 19;
                            }
                            if (var8 == 1) {
                                var9 = 58;
                            }
                            if (var8 == 2) {
                                var9 = 51;
                            }
                            if (var8 == 3) {
                                var9 = 18;
                            }
                            if (var8 == 4) {
                                var9 = 25;
                            }
                            if (var3.field794 == var8) {
                                var10 = var3.field819;
                            }
                            if (var3.field795 == var8) {
                                var10 = var3.field804;
                            }
                            class229.field3251++;
                            class338.method2167("<col=ffff00>" + var4, (long) arg2.field7669, var10, 1, 0, true, var7[var8], false, 0, -1, var9);
                        }
                    }
                }
                if (class403.field6054 == class168.field2608 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class402.field6046.method2180(client.field2870, arg0 ^ 0xFFFF8CCC))) {
                            short var12 = 0;
                            if (var3.field800 > class139.field2224.field3690) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 19;
                            }
                            if (var11 == 1) {
                                var13 = 58;
                            }
                            if (var11 == 2) {
                                var13 = 51;
                            }
                            if (var11 == 3) {
                                var13 = 18;
                            }
                            if (var11 == 4) {
                                var13 = 25;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class59.field1046++;
                            class338.method2167("<col=ffff00>" + var4, (long) arg2.field7669, var3.field806, 1, 0, true, var7[var11], false, 0, -1, var13);
                        }
                    }
                }
            }
            class338.method2167("<col=ffff00>" + var4, (long) arg2.field7669, class155.field2446, 1, 0, true, class360.field5464.method2180(client.field2870, arg0 ^ 0xFFFF8CCC), arg1, 0, -1, 1004);
            class46.field857++;
        } else if (!arg1) {
            class61 var6 = class140.field2234 == -1 ? null : class162.field2506.method597(11, class140.field2234);
            if ((class417.field6234 & 0x2) != 0 && (var6 == null || var3.method421((byte) -66, var6.field1062, class140.field2234) != var6.field1062)) {
                class87.field1528++;
                class338.method2167(class1.field7 + " -> <col=ffff00>" + var4, (long) arg2.field7669, class56.field980, 1, 0, true, class432.field6423, false, 0, -1, 49);
            }
        }
        if (arg0 != -1) {
            field6345 = -117;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method2562(byte arg0) {
        field6344 = null;
        if (arg0 > -37) {
            field6344 = null;
        }
    }
}
