import java.awt.Component;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class175 {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2867 = 100;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ldf;")
    public static class51 field2865 = class46.method233(" weitere Optionen", 100);

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field2872 = 1;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2876 = Calendar.getInstance();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lu;")
    public static class111 field2869;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lgb;")
    public static class139 field2864;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public static final void method1227(int arg0, int arg1, int arg2) {
        field2870++;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class191.field3200[arg0];
        int var5 = class159.field2609[arg0];
        if (arg1 == 0) {
            class95.field1575.method424((byte) 91, 8);
            client.field2449++;
            class95.field1575.method919(arg2 - 34765, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class95.field1575.method424((byte) 109, 84);
            class95.field1575.method919(arg2 - 34765, var3 + var3 + 17);
            class145.field2427++;
        }
        if (arg1 == 2) {
            class75.field1213++;
            class95.field1575.method424((byte) 82, 121);
            class95.field1575.method919(-4742, var3 + var3 + 3);
        }
        class95.field1575.method866(class144.field2405[82] ? 1 : 0, (byte) 126);
        class96.field1581 = class159.field2609[0];
        if (arg2 != 30023) {
            return;
        }
        class248.field4373 = class191.field3200[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class95.field1575.method919(-4742, class159.field2609[arg0] - var5);
            class95.field1575.method886(0, class191.field3200[arg0] - var4);
        }
        class95.field1575.method895(-116, class241.field4179 + var4);
        class95.field1575.method895(arg2 ^ 0xFFFF8A96, class11.field160 + var5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method1228(boolean arg0) {
        field2864 = null;
        field2865 = null;
        field2869 = null;
        field2876 = null;
        if (!arg0) {
            field2865 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILlb;)V")
    public static final void method1229(int arg0, class121 arg1) {
        field2866++;
        if (arg0 >= -113) {
            return;
        }
        while (true) {
            while (arg1.field2014.length > arg1.field2026) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method897(118) == 1) {
                    var2 = true;
                    var3 = arg1.method897(110);
                    var4 = arg1.method897(-34);
                }
                int var5 = arg1.method897(111);
                int var6 = arg1.method897(122);
                int var7 = var5 * 64 - class107.field1764;
                int var8 = class85.field1433 + class46.field736 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class5.field38 && class85.field1433 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method912((byte) -90);
                                if (var13 != 0) {
                                    if (class111.field1877[var9][var10] == null) {
                                        class111.field1877[var9][var10] = new byte[4096];
                                    }
                                    class111.field1877[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method912((byte) -90);
                                    if (class222.field3873[var9][var10] == null) {
                                        class222.field3873[var9][var10] = new byte[4096];
                                    }
                                    class222.field3873[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method912((byte) -90);
                        if (var16 != 0) {
                            arg1.field2026++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lsc;IILjava/awt/Component;I)Lje;")
    public static final class173 method1230(class229 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field2873++;
        if (class156.field2568 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class173 var5 = (class173) Class.forName("kg").getDeclaredConstructor().newInstance();
                var5.field2849 = arg2;
                var5.field2841 = new int[(class34.field498 ? 2 : 1) * 256];
                var5.method946(arg3);
                var5.field2854 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field2854 > 16384) {
                    var5.field2854 = 16384;
                }
                var5.method944(var5.field2854);
                if (class223.field3939 > 0 && class48.field766 == null) {
                    class48.field766 = new class44();
                    class48.field766.field714 = arg0;
                    arg0.method1570(class48.field766, -28437, class223.field3939);
                }
                if (class48.field766 != null) {
                    if (class48.field766.field715[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class48.field766.field715[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class251 var6 = new class251(arg0, arg1);
                    var6.field2841 = new int[(class34.field498 ? 2 : 1) * 256];
                    var6.field2849 = arg2;
                    var6.method946(arg3);
                    var6.field2854 = 16384;
                    var6.method944(var6.field2854);
                    if (arg4 >= -58) {
                        method1230((class229) null, -94, 61, (Component) null, -124);
                    }
                    if (class223.field3939 > 0 && class48.field766 == null) {
                        class48.field766 = new class44();
                        class48.field766.field714 = arg0;
                        arg0.method1570(class48.field766, -28437, class223.field3939);
                    }
                    if (class48.field766 != null) {
                        if (class48.field766.field715[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class48.field766.field715[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class173();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public static final int method1231(int arg0, int arg1) {
        field2875++;
        if (class196.field3290 == 1) {
            return 7;
        } else if (class196.field3290 == 2) {
            return 20;
        } else if (arg1 != 21010) {
            return 22;
        } else if (arg0 == 15) {
            return 13;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 22) {
            return 8;
        } else if (arg0 == 31) {
            return 14;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 43) {
            return 15;
        } else if (arg0 == 48) {
            return 17;
        } else if (arg0 == 58) {
            return 11;
        } else if (arg0 == 69) {
            return 6;
        } else if (arg0 == 74) {
            return 20;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 101) {
            return 12;
        } else if (arg0 == 103) {
            return 19;
        } else if (arg0 == 152) {
            return 16;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 162) {
            return 9;
        } else if (arg0 == 166) {
            return 10;
        } else if (arg0 == 179) {
            return 18;
        } else if (arg0 == 191) {
            return 5;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg0;
        int var7 = arg4 - arg2;
        field2868++;
        if (var7 == 0) {
            if (var6 != 0) {
                class195.method1381(arg2, arg3, arg5, arg0, -109);
            }
        } else if (var6 == 0) {
            class39.method199(arg4, arg0, arg2, arg3, 0);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg0;
                int var10 = arg4;
                arg4 = arg5;
                arg5 = var10;
                arg0 = var9;
            }
            if (arg2 > arg4) {
                int var11 = arg2;
                arg2 = arg4;
                arg4 = var11;
                int var12 = arg0;
                arg0 = arg5;
                arg5 = var12;
            }
            int var13 = arg0;
            int var14 = arg4 - arg2;
            int var15 = arg5 - arg0;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = arg5 > arg0 ? 1 : -1;
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var18 = arg2; var18 <= arg4; var18++) {
                    class80.field1324[var18][var13] = arg3;
                    var17 += var15;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg4; var19++) {
                    var17 += var15;
                    class80.field1324[var13][var19] = arg3;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            }
            int var20 = -34 / ((arg1 + 29) / 62);
        }
    }
}
