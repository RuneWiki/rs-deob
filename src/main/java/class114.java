import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class114 extends class164 {

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
    public int field1474 = 0;

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "Z")
    public boolean field1473 = true;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
    public int field1484 = 12800;

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "I")
    public int field1479 = -1;

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "I")
    public int field1481 = 0;

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
    public int field1475 = 12800;

    @OriginalMember(owner = "client!hw", name = "P", descriptor = "I")
    public int field1488 = -1;

    @OriginalMember(owner = "client!hw", name = "N", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "Ljava/lang/String;")
    public String field1468;

    @OriginalMember(owner = "client!hw", name = "H", descriptor = "Ljava/lang/String;")
    public String field1480;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "Loe;")
    public class183 field1469;

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
    public static int field1478 = 0;

    @OriginalMember(owner = "client!hw", name = "J", descriptor = "[I")
    public static int[] field1482 = new int[128];

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hw", name = "K", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!hw", name = "O", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method815(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field1476++;
        for (class395 var6 = (class395) this.field1469.method1132((byte) 120); var6 != null; var6 = (class395) this.field1469.method1134(8446)) {
            if (var6.method2388(arg1, false, arg2, arg0)) {
                var6.method2391(arg0, arg4, 0, arg2);
                return true;
            }
        }
        if (arg3 != 20035) {
            this.method819((byte) 39, 117, null, 12);
        }
        return false;
    }

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)V")
    public final void method816(int arg0) {
        field1483++;
        this.field1475 = 12800;
        this.field1484 = 12800;
        this.field1474 = 0;
        if (arg0 != -18457) {
            method818(30);
        }
        this.field1481 = 0;
        for (class395 var2 = (class395) this.field1469.method1132((byte) 69); var2 != null; var2 = (class395) this.field1469.method1134(8446)) {
            if (var2.field5578 > this.field1481) {
                this.field1481 = var2.field5578;
            }
            if (var2.field5577 > this.field1474) {
                this.field1474 = var2.field5577;
            }
            if (var2.field5573 < this.field1475) {
                this.field1475 = var2.field5573;
            }
            if (this.field1484 > var2.field5568) {
                this.field1484 = var2.field5568;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
    public static final int method817(int arg0, int arg1) {
        if (arg1 != 4095) {
            field1485 = 92;
        }
        field1471++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "(I)V")
    public static void method818(int arg0) {
        int var1 = 116 / ((83 - arg0) / 43);
        field1482 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI[II)Z")
    public final boolean method819(byte arg0, int arg1, int[] arg2, int arg3) {
        field1466++;
        class395 var5 = (class395) this.field1469.method1132((byte) 50);
        if (arg0 != 64) {
            this.field1469 = null;
        }
        while (var5 != null) {
            if (var5.method2392(arg1, arg3, 11)) {
                var5.method2390(arg3, arg1, arg2, (byte) -66);
                return true;
            }
            var5 = (class395) this.field1469.method1134(8446);
        }
        return false;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBI)Z")
    public final boolean method820(int arg0, byte arg1, int arg2) {
        if (arg1 != -97) {
            return true;
        }
        field1467++;
        for (class395 var4 = (class395) this.field1469.method1132((byte) -87); var4 != null; var4 = (class395) this.field1469.method1134(8446)) {
            if (var4.method2389(arg2, 16384, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[[[Lcq;ZIII)Z")
    public static final boolean method821(int arg0, class433[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1470++;
        byte var6 = arg2 ? 1 : (byte) (field1478 & 0xFF);
        if (class257.field3493[class617.field8853][arg3][arg0] == var6) {
            return false;
        } else if ((class73.field1104[class617.field8853][arg3][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class29.field621[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class525.field7701[var7] = arg0;
            class257.field3493[class617.field8853][arg3][arg0] = var6;
            while (var35 != var8) {
                int var9 = class29.field621[var8] & 0xFFFF;
                int var10 = (class29.field621[var8] & 0xFF9256) >> 16;
                int var11 = class29.field621[var8] >> 24 & 0xFF;
                int var12 = class525.field7701[var8] & 0xFFFF;
                int var13 = class525.field7701[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class73.field1104[class617.field8853][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class617.field8853 + 1; var16 <= 3; var16++) {
                    if ((class73.field1104[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field6217 != null) {
                                int var20 = class635.method3628(var10, 1);
                                if (arg1[var16][var9][var12].field6217.field3327 == var20 || arg1[var16][var9][var12].field6210 != null && arg1[var16][var9][var12].field6210.field3327 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class635.method3628(var11, 1);
                                    if (arg1[var16][var9][var12].field6217.field3327 == var21 || arg1[var16][var9][var12].field6210 != null && arg1[var16][var9][var12].field6210.field3327 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class635.method3628(var13, 1);
                                    if (arg1[var16][var9][var12].field6217.field3327 == var22 || arg1[var16][var9][var12].field6210 != null && arg1[var16][var9][var12].field6210.field3327 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class433 var23 = arg1[var16][var9][var12];
                            if (var23.field6218 != null) {
                                for (class182 var24 = var23.field6218; var24 != null; var24 = var24.field2226) {
                                    class43 var25 = var24.field2227;
                                    if (var25 instanceof class691) {
                                        class691 var26 = (class691) var25;
                                        int var27 = var26.method1070(-24359);
                                        int var28 = var26.method1067((byte) -123);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class433 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field6218 != null) {
                            for (class182 var31 = var30.field6218; var31 != null; var31 = var31.field2226) {
                                class43 var32 = var31.field2227;
                                if (var32.field770 != var32.field769 || var32.field768 != var32.field765) {
                                    for (int var33 = var32.field769; var33 <= var32.field770; var33++) {
                                        for (int var34 = var32.field768; var34 <= var32.field765; var34++) {
                                            class257.field3493[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class257.field3493[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class155.field1899[class617.field8853 + 1].method437(127, var12, var9);
                    if (class137.field1736[arg4] < var17) {
                        class137.field1736[arg4] = var17;
                    }
                    int var18 = var9 << 9;
                    if (class368.field4958[arg4] > var18) {
                        class368.field4958[arg4] = var18;
                    } else if (var18 > class637.field9119[arg4]) {
                        class637.field9119[arg4] = var18;
                    }
                    int var19 = var12 << 9;
                    if (class608.field8735[arg4] > var19) {
                        class608.field8735[arg4] = var19;
                    } else if (class642.field9170[arg4] < var19) {
                        class642.field9170[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class257.field3493[class617.field8853][var9 - 1][var12] != var6) {
                        class29.field621[var35] = class242.method1474(class242.method1474(var9 - 1, 1179648), -754974720);
                        class525.field7701[var35] = class242.method1474(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class257.field3493[class617.field8853][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class205.field2465 > var12) {
                        if (var9 - 1 >= 0 && class257.field3493[class617.field8853][var9 - 1][var12] != var6 && (class73.field1104[class617.field8853][var9][var12] & 0x4) == 0 && (class73.field1104[class617.field8853][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class29.field621[var35] = class242.method1474(class242.method1474(1179648, var9 - 1), 1375731712);
                            class525.field7701[var35] = class242.method1474(var12, 1245184);
                            class257.field3493[class617.field8853][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class257.field3493[class617.field8853][var9][var12] != var6) {
                            class29.field621[var35] = class242.method1474(class242.method1474(5373952, var9), 318767104);
                            class525.field7701[var35] = class242.method1474(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class257.field3493[class617.field8853][var9][var12] = var6;
                        }
                        if (var9 + 1 < class473.field6604 && class257.field3493[class617.field8853][var9 + 1][var12] != var6 && (class73.field1104[class617.field8853][var9][var12] & 0x4) == 0 && (class73.field1104[class617.field8853][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class29.field621[var35] = class242.method1474(-1845493760, class242.method1474(5373952, var9 + 1));
                            class525.field7701[var35] = class242.method1474(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class257.field3493[class617.field8853][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class473.field6604 > var9 + 1 && class257.field3493[class617.field8853][var9 + 1][var12] != var6) {
                        class29.field621[var35] = class242.method1474(1392508928, class242.method1474(var9 + 1, 9568256));
                        class525.field7701[var35] = class242.method1474(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class257.field3493[class617.field8853][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class257.field3493[class617.field8853][var9 - 1][var12] != var6 && (class73.field1104[class617.field8853][var9][var12] & 0x4) == 0 && (class73.field1104[class617.field8853][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class29.field621[var35] = class242.method1474(301989888, class242.method1474(13762560, var9 - 1));
                            class525.field7701[var35] = class242.method1474(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class257.field3493[class617.field8853][var9 - 1][var12] = var6;
                        }
                        if (class257.field3493[class617.field8853][var9][var12] != var6) {
                            class29.field621[var35] = class242.method1474(class242.method1474(13762560, var9), -1828716544);
                            class525.field7701[var35] = class242.method1474(var12, 13828096);
                            class257.field3493[class617.field8853][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class473.field6604 > var9 + 1 && class257.field3493[class617.field8853][var9 + 1][var12] != var6 && (class73.field1104[class617.field8853][var9][var12] & 0x4) == 0 && (class73.field1104[class617.field8853][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class29.field621[var35] = class242.method1474(class242.method1474(var9 + 1, 9568256), -771751936);
                            class525.field7701[var35] = class242.method1474(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class257.field3493[class617.field8853][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (arg5 < 10) {
                field1478 = -49;
            }
            if (class137.field1736[arg4] != -1000000) {
                class137.field1736[arg4] += 40;
                class368.field4958[arg4] -= 512;
                class637.field9119[arg4] += 512;
                class642.field9170[arg4] += 512;
                class608.field8735[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([IIII)Z")
    public final boolean method822(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 51) {
            this.field1474 = 108;
        }
        field1487++;
        for (class395 var5 = (class395) this.field1469.method1132((byte) 36); var5 != null; var5 = (class395) this.field1469.method1134(8446)) {
            if (var5.method2389(arg3, 16384, arg2)) {
                var5.method2391(arg2, arg0, 0, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class114(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1473 = arg5;
        this.field1479 = arg4;
        this.field1488 = arg6;
        this.field1486 = arg0;
        this.field1468 = arg2;
        this.field1480 = arg1;
        this.field1477 = arg3;
        if (this.field1488 == 255) {
            this.field1488 = 0;
        }
        this.field1469 = new class183();
    }

    static {
        for (int var0 = 0; var0 < field1482.length; var0++) {
            field1482[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field1482[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field1482[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field1482[var3] = var3 + 52 - 48;
        }
        field1482[45] = field1482[47] = 63;
        field1482[42] = field1482[43] = 62;
        field1485 = 0;
    }
}
