import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class21 extends class311 {

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public static int field271 = 0;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "[I")
    public static int[] field273;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "[Lwn;")
    public static class77[] field269;

    static {
        new class368("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method120(byte arg0, int arg1, int arg2) {
        if (arg0 == 59) {
            field268++;
            return (class302.field4122[1][arg1][arg2] & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Lbm;Lea;BLdn;Z)V", line = 22)
    public static final void method122(int arg0, class325[] arg1, class58 arg2, byte arg3, class323 arg4, boolean arg5) {
        field270++;
        if (!arg5) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class11.field107; var7++) {
                    for (int var8 = 0; var8 < class264.field3620; var8++) {
                        if ((class302.field4122[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class302.field4122[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg1[var9].method1978(var8, 15789, var7);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class11.field107][class264.field3620];
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var13 = 0; var13 < class264.field3620; var13++) {
                class163.field2329[var13] = 0;
                class334.field4530[var13] = 0;
                class408.field5694[var13] = 0;
                class302.field4124[var13] = 0;
                class81.field1124[var13] = 0;
            }
            for (int var14 = -5; var14 < class11.field107; var14++) {
                for (int var15 = 0; var15 < class264.field3620; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (var24 < class11.field107) {
                        int var25 = class25.field321[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class290 var26 = class415.method2565(-1730, var25 - 1);
                            class163.field2329[var15] += var26.field3935;
                            class334.field4530[var15] += var26.field3940;
                            class408.field5694[var15] += var26.field3930;
                            class302.field4124[var15] += var26.field3933;
                            var10002 = class81.field1124[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class25.field321[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class290 var29 = class415.method2565(-1730, var28 - 1);
                            class163.field2329[var15] -= var29.field3935;
                            class334.field4530[var15] -= var29.field3940;
                            class408.field5694[var15] -= var29.field3930;
                            class302.field4124[var15] -= var29.field3933;
                            var10002 = class81.field1124[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class264.field3620; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < class264.field3620) {
                            var19 += class302.field4124[var22];
                            var20 += class81.field1124[var22];
                            var17 += class334.field4530[var22];
                            var16 += class163.field2329[var22];
                            var18 += class408.field5694[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var17 -= class334.field4530[var23];
                            var19 -= class302.field4124[var23];
                            var18 -= class408.field5694[var23];
                            var16 -= class163.field2329[var23];
                            var20 -= class81.field1124[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class407.method2511(var18 / var20, var16 * 256 / var19, 29743, var17 / var20);
                        }
                    }
                }
            }
            class227.method1484(arg5, class436.field6160[var11], var11, class25.field321[var11], arg2, class408.field5693[var11], class362.field4988[var11], (byte) -124, arg4, class264.field3620, var10, class305.field4155[var11], class11.field107);
            class25.field321[var11] = null;
            class408.field5693[var11] = null;
            class362.field4988[var11] = null;
            class305.field4155[var11] = null;
        }
        if (!arg5) {
            if (class428.field5958) {
                class140.method1026();
            }
            if (class228.field3188 != 0) {
                class447.method2762();
            }
        }
        if (arg3 > -18) {
            method122(-67, (class325[]) null, (class58) null, (byte) -45, (class323) null, true);
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            class436.field6160[var12].method325();
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V", line = 229)
    public static void method123(int arg0) {
        field269 = null;
        if (arg0 != -20002) {
            field271 = 17;
        }
        field273 = null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)I")
    public abstract int method121(byte arg0);

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)I")
    public abstract int method124(int arg0);

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)J")
    public abstract long method125(byte arg0);

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)I")
    public abstract int method126(boolean arg0);
}
