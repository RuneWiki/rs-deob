import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class166 extends InputStream {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[I")
    public static int[] field2994 = new int[32];

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field3001 = 0;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lcc;")
    public static class209 field2998 = class95.method669(88, "scrollen:");

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lcc;")
    private static class209 field2995 = class95.method669(127, "Loaded input handler");

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lcc;")
    public static class209 field2993 = field2995;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lal;")
    public static class231 field2996;

    @OriginalMember(owner = "client!ba", name = "read", descriptor = "()I")
    public final int read() {
        class174.method1196((byte) 113, 30000L);
        field3002++;
        return -1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1146(byte arg0) {
        field2993 = null;
        field2998 = null;
        if (arg0 != 0) {
            method1147(-24, false, -38, (class109[][][]) null, 71, 105);
        }
        field2995 = null;
        field2994 = null;
        field2996 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI[[[Lfi;II)Z")
    public static final boolean method1147(int arg0, boolean arg1, int arg2, class109[][][] arg3, int arg4, int arg5) {
        field2999++;
        byte var6 = arg1 ? 1 : (byte) (class5.field73 & 0xFF);
        if (class272.field4820[class99.field1937][arg4][arg5] == var6) {
            return false;
        } else if ((class285.field5023[class99.field1937][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 127 / ((arg0 + 45) / 63);
            class195.field3499[var7] = arg4;
            int var32 = var7 + 1;
            class265.field4756[var7] = arg5;
            class272.field4820[class99.field1937][arg4][arg5] = var6;
            int var9 = 0;
            while (var32 != var9) {
                int var10 = (class195.field3499[var9] & 0xFF70F7) >> 16;
                int var11 = class195.field3499[var9] & 0xFFFF;
                int var12 = class195.field3499[var9] >> 24 & 0xFF;
                int var13 = class265.field4756[var9] & 0xFFFF;
                int var14 = (class265.field4756[var9] & 0xFF4D63) >> 16;
                boolean var15 = false;
                var9 = var9 + 1 & 0xFFF;
                boolean var16 = false;
                if ((class285.field5023[class99.field1937][var11][var13] & 0x4) == 0) {
                    var16 = true;
                }
                label225: for (int var17 = class99.field1937 + 1; var17 <= 3; var17++) {
                    if ((class285.field5023[var17][var11][var13] & 0x8) == 0) {
                        if (var16 && arg3[var17][var11][var13] != null) {
                            if (arg3[var17][var11][var13].field2213 != null) {
                                int var20 = class65.method480(var10, (byte) 56);
                                if (arg3[var17][var11][var13].field2213.field3376 == var20 || arg3[var17][var11][var13].field2213.field3371 == var20) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var21 = class65.method480(var12, (byte) 90);
                                    if (arg3[var17][var11][var13].field2213.field3376 == var21 || arg3[var17][var11][var13].field2213.field3371 == var21) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var22 = class65.method480(var14, (byte) 120);
                                    if (arg3[var17][var11][var13].field2213.field3376 == var22 || arg3[var17][var11][var13].field2213.field3371 == var22) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var17][var11][var13].field2189 != null) {
                                for (int var23 = 0; var23 < arg3[var17][var11][var13].field2203; var23++) {
                                    int var24 = (int) (arg3[var17][var11][var13].field2189[var23].field4733 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = (int) (arg3[var17][var11][var13].field2189[var23].field4733 >> 20 & 0x3L);
                                    int var26 = var24 | var25 << 6;
                                    if (var10 == var26 || var12 != 0 && var12 == var26 || var14 != 0 && var14 == var26) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class109 var27 = arg3[var17][var11][var13];
                        if (var27 != null && var27.field2203 > 0) {
                            for (int var28 = 0; var28 < var27.field2203; var28++) {
                                class264 var29 = var27.field2189[var28];
                                if (var29.field4747 != var29.field4746 || var29.field4741 != var29.field4731) {
                                    for (int var30 = var29.field4746; var30 <= var29.field4747; var30++) {
                                        for (int var31 = var29.field4741; var31 <= var29.field4731; var31++) {
                                            class272.field4820[var17][var30][var31] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class272.field4820[var17][var11][var13] = var6;
                    }
                }
                if (var15) {
                    if (class271.field4803[class99.field1937 + 1][var11][var13] > class88.field1747[arg2]) {
                        class88.field1747[arg2] = class271.field4803[class99.field1937 + 1][var11][var13];
                    }
                    int var18 = var11 << 7;
                    int var19 = var13 << 7;
                    if (var18 < class21.field402[arg2]) {
                        class21.field402[arg2] = var18;
                    } else if (class80.field1490[arg2] < var18) {
                        class80.field1490[arg2] = var18;
                    }
                    if (var19 < class118.field2366[arg2]) {
                        class118.field2366[arg2] = var19;
                    } else if (var19 > class191.field3457[arg2]) {
                        class191.field3457[arg2] = var19;
                    }
                }
                if (!var16) {
                    if (var11 >= 1 && class272.field4820[class99.field1937][var11 - 1][var13] != var6) {
                        class195.field3499[var32] = class6.method63(class6.method63(1179648, var11 - 1), -754974720);
                        class265.field4756[var32] = class6.method63(1245184, var13);
                        var32 = var32 + 1 & 0xFFF;
                        class272.field4820[class99.field1937][var11 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var11 - 1) >= 0 && class272.field4820[class99.field1937][var11 - 1][var13] != var6 && (class285.field5023[class99.field1937][var11][var13] & 0x4) == 0 && (class285.field5023[class99.field1937][var11 - 1][var13 - 1] & 0x4) == 0) {
                            class195.field3499[var32] = class6.method63(1375731712, class6.method63(var11 - 1, 1179648));
                            class265.field4756[var32] = class6.method63(var13, 1245184);
                            class272.field4820[class99.field1937][var11 - 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class272.field4820[class99.field1937][var11][var13] != var6) {
                            class195.field3499[var32] = class6.method63(class6.method63(5373952, var11), 318767104);
                            class265.field4756[var32] = class6.method63(5439488, var13);
                            class272.field4820[class99.field1937][var11][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class272.field4820[class99.field1937][var11 + 1][var13] != var6 && (class285.field5023[class99.field1937][var11][var13] & 0x4) == 0 && (class285.field5023[class99.field1937][var11 + 1][var13 - 1] & 0x4) == 0) {
                            class195.field3499[var32] = class6.method63(-1845493760, class6.method63(var11 + 1, 5373952));
                            class265.field4756[var32] = class6.method63(var13, 5439488);
                            var32 = var32 + 1 & 0xFFF;
                            class272.field4820[class99.field1937][var11 + 1][var13] = var6;
                        }
                    }
                    var13--;
                    if ((var11 + 1) < 104 && class272.field4820[class99.field1937][var11 + 1][var13] != var6) {
                        class195.field3499[var32] = class6.method63(1392508928, class6.method63(9568256, var11 + 1));
                        class265.field4756[var32] = class6.method63(var13, 9633792);
                        class272.field4820[class99.field1937][var11 + 1][var13] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var11 - 1) >= 0 && class272.field4820[class99.field1937][var11 - 1][var13] != var6 && (class285.field5023[class99.field1937][var11][var13] & 0x4) == 0 && (class285.field5023[class99.field1937][var11 - 1][var13 + 1] & 0x4) == 0) {
                            class195.field3499[var32] = class6.method63(class6.method63(var11 - 1, 13762560), 301989888);
                            class265.field4756[var32] = class6.method63(13828096, var13);
                            class272.field4820[class99.field1937][var11 - 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class272.field4820[class99.field1937][var11][var13] != var6) {
                            class195.field3499[var32] = class6.method63(-1828716544, class6.method63(var11, 13762560));
                            class265.field4756[var32] = class6.method63(13828096, var13);
                            class272.field4820[class99.field1937][var11][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (var11 + 1 < 104 && class272.field4820[class99.field1937][var11 + 1][var13] != var6 && (class285.field5023[class99.field1937][var11][var13] & 0x4) == 0 && (class285.field5023[class99.field1937][var11 + 1][var13 + 1] & 0x4) == 0) {
                            class195.field3499[var32] = class6.method63(-771751936, class6.method63(9568256, var11 + 1));
                            class265.field4756[var32] = class6.method63(9633792, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class272.field4820[class99.field1937][var11 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class88.field1747[arg2] != -1000000) {
                class88.field1747[arg2] += 10;
                class21.field402[arg2] -= 50;
                class80.field1490[arg2] += 50;
                class191.field3457[arg2] += 50;
                class118.field2366[arg2] -= 50;
            }
            return true;
        }
    }
}
