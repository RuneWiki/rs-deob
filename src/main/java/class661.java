import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class661 {

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Leb;")
    public static class651 field8893;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Z")
    public static final boolean method3660(int arg0, int arg1) {
        if (arg0 <= 43) {
            method3663(null, null, (byte) -46, -2);
        }
        field8892++;
        for (class478 var2 = (class478) class645.field8695.method679((byte) -86); var2 != null; var2 = (class478) class645.field8695.method681(-128)) {
            if (class450.method2678(-49, var2.field6718) && (long) arg1 == var2.field6719) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lcm;IZ)V")
    public static final void method3661(class758 arg0, int arg1, boolean arg2) {
        field8895++;
        if (class269.field3929 >= 400) {
            return;
        }
        if (class625.field8475 != arg0) {
            String var3;
            if (arg0.field10356 == 0) {
                boolean var4 = true;
                if (class625.field8475.field10377 != -1 && arg0.field10377 != -1) {
                    int var5 = class625.field8475.field10377 < arg0.field10377 ? class625.field8475.field10377 : arg0.field10377;
                    int var6 = class625.field8475.field10358 - arg0.field10358;
                    if (var6 < 0) {
                        var6 = -var6;
                    }
                    if (var5 < var6) {
                        var4 = false;
                    }
                }
                String var7 = class682.field9122 == class426.field6204 ? class58.field727.method365(class55.field647, (byte) 67) : class58.field725.method365(class55.field647, (byte) 80);
                if (arg0.field10358 < arg0.field10384) {
                    var3 = arg0.method4156((byte) 40, true) + (var4 ? class378.method2365(arg0.field10358, (byte) 101, class625.field8475.field10358) : "<col=ffffff>") + " (" + var7 + arg0.field10358 + "+" + (arg0.field10384 - arg0.field10358) + ")";
                } else {
                    var3 = arg0.method4156((byte) 40, true) + (var4 ? class378.method2365(arg0.field10358, (byte) 101, class625.field8475.field10358) : "<col=ffffff>") + " (" + var7 + arg0.field10358 + ")";
                }
            } else if (arg0.field10356 == -1) {
                var3 = arg0.method4156((byte) 40, true);
            } else {
                var3 = arg0.method4156((byte) 40, true) + " (" + class58.field726.method365(class55.field647, (byte) 115) + arg0.field10356 + ")";
            }
            if (class506.field7094 && !arg2 && (class384.field5578 & 0x8) != 0) {
                class26.method147(-1, true, class385.field5594, (long) arg0.field6146, 30, 0, class545.field7534 + " -> <col=ffffff>" + var3, (long) arg0.field6146, false, 0, -1, class182.field2384, false);
                class383.field5564++;
            }
            if (arg2) {
                class26.method147(0, false, "<col=cccccc>" + var3, 0L, -1, 0, "", (long) arg0.field6146, false, 0, -1, -1, true);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class300.field4234[var8] != null) {
                        short var9 = 0;
                        if (class743.field10050 == class426.field6204 && class300.field4234[var8].equalsIgnoreCase(class58.field720.method365(class55.field647, (byte) 61))) {
                            if (class7.field60 && arg0.field10358 > class625.field8475.field10358) {
                                var9 = 2000;
                            }
                            if (class625.field8475.field10383 == 0 || arg0.field10383 == 0) {
                                if (arg0.field10397) {
                                    var9 = 2000;
                                }
                            } else if (class625.field8475.field10383 == arg0.field10383) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        } else if (class160.field2152[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class524.field7273[var8] + var9);
                        int var11 = class252.field3683[var8] == -1 ? class37.field393 : class252.field3683[var8];
                        class382.field5539++;
                        class26.method147(-1, true, class300.field4234[var8], (long) arg0.field6146, var10, 0, "<col=ffffff>" + var3, (long) arg0.field6146, false, 0, -1, var11, false);
                    }
                }
            }
            int var12 = -45 / ((arg1 + 4) / 46);
            if (!arg2) {
                for (class478 var13 = (class478) class645.field8695.method679((byte) -86); var13 != null; var13 = (class478) class645.field8695.method681(-71)) {
                    if (var13.field6718 == 8) {
                        var13.field6704 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class506.field7094 && (class384.field5578 & 0x10) != 0) {
            class26.method147(-1, true, class385.field5594, 0L, 10, 0, class545.field7534 + " -> <col=ffffff>" + class58.field734.method365(class55.field647, (byte) 63), (long) arg0.field6146, false, 0, -1, class182.field2384, false);
            class787.field10811++;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method3662(byte arg0) {
        field8893 = null;
        if (arg0 != 25) {
            method3662((byte) -105);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lcm;[IBI)V")
    public static final void method3663(class758 arg0, int[] arg1, byte arg2, int arg3) {
        field8891++;
        if (arg0.field6179 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field6179.length; var5++) {
                if (arg0.field6179[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field6138 != -1) {
                class317 var6 = class693.field9223.method2388(arg0.field6138, 0);
                int var7 = var6.field4487;
                if (var7 == 1) {
                    arg0.field6157 = 0;
                    arg0.field6103 = 0;
                    arg0.field6150 = 0;
                    arg0.field6181 = 1;
                    arg0.field6183 = arg3;
                    if (!arg0.field6135) {
                        class627.method3466(arg0, var6, -29701, arg0.field6150);
                    }
                }
                if (var7 == 2) {
                    arg0.field6103 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg2 < 61) {
            method3663(null, null, (byte) -60, 52);
        }
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field6179 == null || arg0.field6179[var9] == -1 || class693.field9223.method2388(arg1[var9], 0).field4466 >= class693.field9223.method2388(arg0.field6179[var9], 0).field4466) {
                arg0.field6183 = arg3;
                arg0.field6179 = arg1;
                break;
            }
        }
        if (var8) {
            arg0.field6183 = arg3;
            arg0.field6179 = arg1;
        }
    }
}
