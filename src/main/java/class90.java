import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class90 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1340 = -1;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field1345 = 0;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1341 = -1;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field1344;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZII)V", line = 8)
    public static final void method636(boolean arg0, boolean arg1, int arg2, int arg3) {
        int var10002;
        for (int var4 = 0; var4 < class172.field2577; var4++) {
            class69 var5 = class187.field2788[class56.field711[var4]];
            if (var5 != null && var5.method455(120) && var5.field914.method388(-1)) {
                int var6 = var5.method696((byte) 117);
                if (arg0) {
                    if (!var5.field914.field761) {
                        continue;
                    }
                } else if (arg1 != var5.field914.field732 || arg3 != 0 && arg3 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field1566 & 0x7F) == 64 && (var5.field1505 & 0x7F) == 64) {
                        int var13 = var5.field1566 >> 7;
                        int var14 = var5.field1505 >> 7;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            var10002 = class206.field3104[var13][var14]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field1566 & 0x7F) == 0 && (var5.field1505 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field1566 & 0x7F) == 64 && (var5.field1505 & 0x7F) == 64)) {
                    int var7 = var5.field1566 - (var6 * 64) >> 7;
                    int var8 = var5.field1505 - var6 * 64 >> 7;
                    int var9 = var7 + var5.method696((byte) 117);
                    int var10 = var8 + var5.method696((byte) 117);
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = class206.field3104[var11][var12]++;
                        }
                    }
                }
            }
        }
        label212: for (int var15 = 0; var15 < class172.field2577; var15++) {
            class69 var16 = class187.field2788[class56.field711[var15]];
            long var17 = (long) class56.field711[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method455(125) && var16.field914.method388(arg2 ^ 0x1284)) {
                int var19 = var16.method696((byte) 117);
                if (arg0) {
                    if (!var16.field914.field761) {
                        continue;
                    }
                } else if (var16.field914.field732 != arg1 || arg3 != 0 && arg3 != var19) {
                    continue;
                }
                var16.field1477 = true;
                if (var19 == 1) {
                    if ((var16.field1566 & 0x7F) == 64 && (var16.field1505 & 0x7F) == 64) {
                        int var29 = var16.field1566 >> 7;
                        int var30 = var16.field1505 >> 7;
                        if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                            continue;
                        }
                        if (class206.field3104[var29][var30] > 1) {
                            var10002 = class206.field3104[var29][var30]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field1566 & 0x7F) == 0 && (var16.field1505 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field1566 & 0x7F) == 64 && (var16.field1505 & 0x7F) == 64) {
                    int var20 = var16.field1566 - var19 * 64 >> 7;
                    int var21 = var16.field1505 - (var19 * 64) >> 7;
                    int var22 = var20 + var19;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    boolean var23 = true;
                    int var24 = var21 + var19;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    for (int var25 = var20; var25 < var22; var25++) {
                        for (int var26 = var21; var26 < var24; var26++) {
                            if (class206.field3104[var25][var26] <= 1) {
                                var23 = false;
                                break;
                            }
                        }
                    }
                    if (var23) {
                        int var27 = var20;
                        while (true) {
                            if (var22 <= var27) {
                                continue label212;
                            }
                            for (int var28 = var21; var28 < var24; var28++) {
                                var10002 = class206.field3104[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                if (!var16.field914.field768) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field1477 = false;
                var16.field1497 = class74.method473(var16.field1505, var16.field1566, 64, class180.field2697);
                class309.method2136(class180.field2697, var16.field1566, var16.field1505, var16.field1497, (var19 - 1) * 64 + 60, var16, var16.field1470, var17, var16.field1510);
            }
        }
        if (arg2 != -4741) {
            method637(-100);
        }
        field1343++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 261)
    public static void method637(int arg0) {
        if (arg0 == -6095) {
            field1344 = null;
        }
    }
}
