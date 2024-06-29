import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class263 {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([IBII[J)V")
    public static final void method1697(int[] arg0, byte arg1, int arg2, int arg3, long[] arg4) {
        if (arg3 > arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg3; var11++) {
                if (((long) (var10 & var11) + var7) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method1697(arg0, (byte) -58, arg2, var6 - 1, arg4);
            method1697(arg0, (byte) 125, var6 + 1, arg3, arg4);
        }
        field3800++;
        int var15 = 50 % ((45 - arg1) / 44);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1698(String arg0, int arg1) {
        field3798++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILln;Z)V")
    public static final void method1699(int arg0, class256 arg1, boolean arg2) {
        field3801++;
        if (class363.field5500 >= 400 || arg0 != 0) {
            return;
        }
        if (class139.field2224 != arg1) {
            String var9;
            if (arg1.field3680 == 0) {
                boolean var3 = true;
                if (class139.field2224.field3723 != -1 && arg1.field3723 != -1) {
                    int var4 = class139.field2224.field3690 > arg1.field3690 ? class139.field2224.field3690 : arg1.field3690;
                    int var5 = arg1.field3723 > class139.field2224.field3723 ? class139.field2224.field3723 : arg1.field3723;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class139.field2224.field3690 - arg1.field3690;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class428.field6357 == class403.field6054 ? class372.field5647.method2180(client.field2870, 29491) : class110.field1862.method2180(client.field2870, 29491);
                if (arg1.field3682 <= arg1.field3690) {
                    var9 = arg1.method1663((byte) 117, true) + (var3 ? class139.method1040(arg1.field3690, class139.field2224.field3690, (byte) -68) : "<col=ffffff>") + " (" + var8 + arg1.field3690 + ")";
                } else {
                    var9 = arg1.method1663((byte) 90, true) + (var3 ? class139.method1040(arg1.field3690, class139.field2224.field3690, (byte) -68) : "<col=ffffff>") + " (" + var8 + arg1.field3690 + "+" + (arg1.field3682 - arg1.field3690) + ")";
                }
            } else {
                var9 = arg1.method1663((byte) 63, true) + " (" + class407.field6104.method2180(client.field2870, 29491) + arg1.field3680 + ")";
            }
            if (class99.field1638) {
                if (!arg2 && (class417.field6234 & 0x8) != 0) {
                    class179.field2707++;
                    class338.method2167(class1.field7 + " -> <col=ffffff>" + var9, (long) arg1.field7669, class56.field980, 1, 0, true, class432.field6423, false, 0, -1, 6);
                }
            } else if (arg2) {
                class338.method2167("", 0L, -1, 1, 0, false, "<col=cccccc>" + var9, true, 0, 0, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class11.field169[var10] != null) {
                        short var11 = 0;
                        if (class403.field6054 == class168.field2608 && class11.field169[var10].equalsIgnoreCase(class402.field6046.method2180(client.field2870, arg0 ^ 0x7333))) {
                            if (class139.field2224.field3690 < arg1.field3690) {
                                var11 = 2000;
                            }
                            if (class139.field2224.field3722 != 0 && arg1.field3722 != 0) {
                                if (class139.field2224.field3722 == arg1.field3722) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class159.field2474[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class414.field6184[var10] + var11);
                        int var13 = class26.field561[var10] == -1 ? class361.field5476 : class26.field561[var10];
                        class499.field7364++;
                        class338.method2167("<col=ffffff>" + var9, (long) arg1.field7669, var13, 1, 0, true, class11.field169[var10], false, 0, -1, var12);
                    }
                }
            }
            if (!arg2) {
                for (class208 var14 = (class208) class339.field5122.method2427(125); var14 != null; var14 = (class208) class339.field5122.method2422(-101)) {
                    if (var14.field3005 == 16) {
                        var14.field3007 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class99.field1638 && (class417.field6234 & 0x10) != 0) {
            class275.field3975++;
            class338.method2167(class1.field7 + " -> <col=ffffff>" + class396.field5971.method2180(client.field2870, 29491), 0L, class56.field980, 1, 0, true, class432.field6423, false, 0, -1, 57);
        }
    }
}
