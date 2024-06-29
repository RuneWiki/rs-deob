import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class73 {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Ljava/lang/String;")
    public static String field912 = "flash1:";

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/lang/Thread;")
    public static Thread field909;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    public static int[] field911;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lvj;", line = 5)
    public static final class122 method452(int arg0, int arg1) {
        field914++;
        if (class115.field1602 && class311.field4883 <= arg1 && class5.field60 >= arg1) {
            if (arg0 != -3301) {
                method456(-48);
            }
            return class201.field3038[arg1 - class311.field4883];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZZB)V", line = 25)
    public static final void method454(int arg0, boolean arg1, boolean arg2, byte arg3) {
        int var10002;
        for (int var4 = 0; var4 < class296.field4667; var4++) {
            class231 var5 = class251.field3974[class225.field3392[var4]];
            if (var5 != null && var5.method414((byte) 91) && var5.field3503.method962(-1)) {
                int var6 = var5.method412((byte) 111);
                if (arg2) {
                    if (!var5.field3503.field2115) {
                        continue;
                    }
                } else if (var5.field3503.field2122 != arg1 || arg0 != 0 && arg0 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field3767 & 0x7F) == 64 && (var5.field3763 & 0x7F) == 64) {
                        int var13 = var5.field3767 >> 7;
                        int var14 = var5.field3763 >> 7;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            var10002 = class312.field4888[var13][var14]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field3767 & 0x7F) == 0 && (var5.field3763 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field3767 & 0x7F) == 64 && (var5.field3763 & 0x7F) == 64)) {
                    int var7 = var5.field3767 - (var6 * 64) >> 7;
                    int var8 = var5.field3763 - (var6 * 64) >> 7;
                    int var9 = var5.method412((byte) 108) + var7;
                    int var10 = var8 + var5.method412((byte) 124);
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = class312.field4888[var11][var12]++;
                        }
                    }
                }
            }
        }
        if (arg3 != 87) {
            return;
        }
        field915++;
        label220: for (int var15 = 0; var15 < class296.field4667; var15++) {
            class231 var16 = class251.field3974[class225.field3392[var15]];
            long var17 = (long) class225.field3392[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method414((byte) 88) && var16.field3503.method962(-1)) {
                int var19 = var16.method412((byte) 82);
                if (arg2) {
                    if (!var16.field3503.field2115) {
                        continue;
                    }
                } else if (var16.field3503.field2122 != arg1 || arg0 != 0 && arg0 != var19) {
                    continue;
                }
                var16.field3706 = true;
                if (var19 == 1) {
                    if ((var16.field3767 & 0x7F) == 64 && (var16.field3763 & 0x7F) == 64) {
                        int var20 = var16.field3767 >> 7;
                        int var21 = var16.field3763 >> 7;
                        if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                            continue;
                        }
                        if (class312.field4888[var20][var21] > 1) {
                            var10002 = class312.field4888[var20][var21]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field3767 & 0x7F) == 0 && (var16.field3763 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field3767 & 0x7F) == 64 && (var16.field3763 & 0x7F) == 64) {
                    int var22 = var16.field3763 - var19 * 64 >> 7;
                    int var23 = var16.field3767 - var19 * 64 >> 7;
                    int var24 = var19 + var23;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    int var25 = var19 + var22;
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    boolean var26 = true;
                    for (int var27 = var23; var27 < var24; var27++) {
                        for (int var28 = var22; var28 < var25; var28++) {
                            if (class312.field4888[var27][var28] <= 1) {
                                var26 = false;
                                break;
                            }
                        }
                    }
                    if (var26) {
                        int var29 = var23;
                        while (true) {
                            if (var29 >= var24) {
                                continue label220;
                            }
                            for (int var30 = var22; var30 < var25; var30++) {
                                var10002 = class312.field4888[var29][var30]--;
                            }
                            var29++;
                        }
                    }
                }
                if (!var16.field3503.field2144) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field3706 = false;
                var16.field3800 = class14.method80(var16.field3763, class219.field3290, var16.field3767, (byte) -126);
                class214.method1495(class219.field3290, var16.field3767, var16.field3763, var16.field3800, (var19 - 1) * 64 + 60, var16, var16.field3760, var17, var16.field3728);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 279)
    public static void method456(int arg0) {
        field909 = null;
        field911 = null;
        field912 = null;
        if (arg0 != 26884) {
            field911 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
    public abstract int method451(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method453(int arg0, Component arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method455(Component arg0, int arg1);
}
