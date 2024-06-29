import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class243 {

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3653 = new CRC32();

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "J")
    public static volatile long field3663 = 0L;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field3659;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Z")
    public static boolean field3662;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[Lbi;")
    public static class91[] field3658;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1750(int arg0, int arg1) {
        if (arg1 >= -42) {
            method1751((String) null, 32);
        }
        field3657++;
        class311.field4809.method1236(-495037017, arg0);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 18)
    public static final void method1751(String arg0, int arg1) {
        int var2 = class244.method1758(arg0, -104);
        field3656++;
        if (var2 == -1) {
            return;
        }
        int[] var3 = class69.field899.method466(class334.field5162.field4243[var2] >> 28 & 0x3, -10, class334.field5162.field4243[var2] & 0x3FFF, (class334.field5162.field4243[var2] & 0xFFFC097) >> 14);
        class287.method2049(var3[1], var3[2], (byte) -120);
        if (arg1 != 30924) {
            field3653 = (CRC32) null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 38)
    public static void method1752(byte arg0) {
        int var1 = -94 % ((arg0 - 20) / 38);
        field3659 = null;
        field3653 = null;
        field3658 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z[[[Ldk;IIII)Z", line = 48)
    public static final boolean method1753(boolean arg0, class225[][][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field3655++;
        byte var6 = arg0 ? 1 : (byte) (class262.field3962 & 0xFF);
        if (class15.field215[class138.field1940][arg2][arg5] == var6) {
            return false;
        } else if ((class264.field4163[class138.field1940][arg2][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class264.field4167[var7] = arg2;
            int var31 = var7 + 1;
            class109.field1520[var7] = arg5;
            class15.field215[class138.field1940][arg2][arg5] = var6;
            int var8 = 0;
            if (arg4 != 22290) {
                return false;
            }
            while (var31 != var8) {
                int var9 = class264.field4167[var8] >> 24 & 0xFF;
                int var10 = class264.field4167[var8] >> 16 & 0xFF;
                int var11 = class109.field1520[var8] & 0xFFFF;
                int var12 = class109.field1520[var8] >> 16 & 0xFF;
                int var13 = class264.field4167[var8] & 0xFFFF;
                boolean var14 = false;
                boolean var15 = false;
                var8 = var8 + 1 & 0xFFF;
                if ((class264.field4163[class138.field1940][var13][var11] & 0x4) == 0) {
                    var14 = true;
                }
                label236: for (int var16 = class138.field1940 + 1; var16 <= 3; var16++) {
                    if ((class264.field4163[var16][var13][var11] & 0x8) == 0) {
                        if (var14 && arg1[var16][var13][var11] != null) {
                            if (arg1[var16][var13][var11].field3196 != null) {
                                int var17 = class291.method2073(var10, (byte) 1);
                                if (arg1[var16][var13][var11].field3196.field2333 == var17 || arg1[var16][var13][var11].field3196.field2340 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class291.method2073(var9, (byte) 1);
                                    if (arg1[var16][var13][var11].field3196.field2333 == var18 || arg1[var16][var13][var11].field3196.field2340 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class291.method2073(var12, (byte) 1);
                                    if (arg1[var16][var13][var11].field3196.field2333 == var19 || arg1[var16][var13][var11].field3196.field2340 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var13][var11].field3199 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var13][var11].field3214; var20++) {
                                    int var21 = (int) (arg1[var16][var13][var11].field3199[var20].field1026 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg1[var16][var13][var11].field3199[var20].field1026 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var10 == var23 || var9 != 0 && var9 == var23 || var12 != 0 && var12 == var23) {
                                        continue label236;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class225 var24 = arg1[var16][var13][var11];
                        if (var24 != null && var24.field3214 > 0) {
                            for (int var25 = 0; var25 < var24.field3214; var25++) {
                                class80 var26 = var24.field3199[var25];
                                if (var26.field1035 != var26.field1015 || var26.field1028 != var26.field1027) {
                                    for (int var27 = var26.field1015; var27 <= var26.field1035; var27++) {
                                        for (int var28 = var26.field1027; var28 <= var26.field1028; var28++) {
                                            class15.field215[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class15.field215[var16][var13][var11] = var6;
                    }
                }
                if (var15) {
                    if (class167.field2324[class138.field1940 + 1][var13][var11] > class322.field4946[arg3]) {
                        class322.field4946[arg3] = class167.field2324[class138.field1940 + 1][var13][var11];
                    }
                    int var29 = var13 << 7;
                    int var30 = var11 << 7;
                    if (var29 < class158.field2178[arg3]) {
                        class158.field2178[arg3] = var29;
                    } else if (var29 > class259.field3931[arg3]) {
                        class259.field3931[arg3] = var29;
                    }
                    if (class312.field4829[arg3] > var30) {
                        class312.field4829[arg3] = var30;
                    } else if (class309.field4785[arg3] < var30) {
                        class309.field4785[arg3] = var30;
                    }
                }
                if (!var14) {
                    if (var13 >= 1 && class15.field215[class138.field1940][var13 - 1][var11] != var6) {
                        class264.field4167[var31] = class48.method283(class48.method283(var13 - 1, 1179648), -754974720);
                        class109.field1520[var31] = class48.method283(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class15.field215[class138.field1940][var13 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var13 - 1) >= 0 && class15.field215[class138.field1940][var13 - 1][var11] != var6 && (class264.field4163[class138.field1940][var13][var11] & 0x4) == 0 && (class264.field4163[class138.field1940][var13 - 1][var11 - 1] & 0x4) == 0) {
                            class264.field4167[var31] = class48.method283(1375731712, class48.method283(var13 - 1, 1179648));
                            class109.field1520[var31] = class48.method283(var11, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class15.field215[class138.field1940][var13 - 1][var11] = var6;
                        }
                        if (class15.field215[class138.field1940][var13][var11] != var6) {
                            class264.field4167[var31] = class48.method283(class48.method283(5373952, var13), 318767104);
                            class109.field1520[var31] = class48.method283(5439488, var11);
                            class15.field215[class138.field1940][var13][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var13 + 1) < 104 && class15.field215[class138.field1940][var13 + 1][var11] != var6 && (class264.field4163[class138.field1940][var13][var11] & 0x4) == 0 && (class264.field4163[class138.field1940][var13 + 1][var11 - 1] & 0x4) == 0) {
                            class264.field4167[var31] = class48.method283(class48.method283(var13 + 1, 5373952), -1845493760);
                            class109.field1520[var31] = class48.method283(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class15.field215[class138.field1940][var13 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if ((var13 + 1) < 104 && class15.field215[class138.field1940][var13 + 1][var11] != var6) {
                        class264.field4167[var31] = class48.method283(class48.method283(9568256, var13 + 1), 1392508928);
                        class109.field1520[var31] = class48.method283(var11, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class15.field215[class138.field1940][var13 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var13 - 1) >= 0 && class15.field215[class138.field1940][var13 - 1][var11] != var6 && (class264.field4163[class138.field1940][var13][var11] & 0x4) == 0 && (class264.field4163[class138.field1940][var13 - 1][var11 + 1] & 0x4) == 0) {
                            class264.field4167[var31] = class48.method283(class48.method283(var13 - 1, 13762560), 301989888);
                            class109.field1520[var31] = class48.method283(var11, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class15.field215[class138.field1940][var13 - 1][var11] = var6;
                        }
                        if (class15.field215[class138.field1940][var13][var11] != var6) {
                            class264.field4167[var31] = class48.method283(class48.method283(13762560, var13), -1828716544);
                            class109.field1520[var31] = class48.method283(var11, 13828096);
                            class15.field215[class138.field1940][var13][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var13 + 1) < 104 && class15.field215[class138.field1940][var13 + 1][var11] != var6 && (class264.field4163[class138.field1940][var13][var11] & 0x4) == 0 && (class264.field4163[class138.field1940][var13 + 1][var11 + 1] & 0x4) == 0) {
                            class264.field4167[var31] = class48.method283(-771751936, class48.method283(9568256, var13 + 1));
                            class109.field1520[var31] = class48.method283(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class15.field215[class138.field1940][var13 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class322.field4946[arg3] != -1000000) {
                class322.field4946[arg3] += 10;
                class158.field2178[arg3] -= 50;
                class259.field3931[arg3] += 50;
                class309.field4785[arg3] += 50;
                class312.field4829[arg3] -= 50;
            }
            return true;
        }
    }
}
