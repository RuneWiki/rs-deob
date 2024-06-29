import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class8 {

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
    public static volatile boolean field201 = false;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lgd;")
    public static class40 field202 = class14.method90(false, "Benutzername: ");

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
    public static boolean field198 = false;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Z")
    public static boolean field209 = false;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lgd;")
    public static class40 field200 = class14.method90(false, ": ");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lgd;")
    public static class40 field197 = class14.method90(false, "Neuer Benutzer");

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lgd;")
    private static class40 field214 = class14.method90(false, "Prepared sound engine");

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
    public static int[] field212 = new int[1000];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lgd;")
    public static class40 field203 = class14.method90(false, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lgd;")
    public static class40 field215 = field214;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lba;")
    public static class7 field216 = new class7(100);

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
    public static int[] field218 = new int[4000];

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field221 = 2301979;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lrb;")
    public static class103 field222;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lrb;")
    public static class103 field223;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lhd;")
    public static class46 field210;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lmb;")
    public static class73 field213;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
    public static int[] field219;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "[Lmb;")
    public static class73[] field220;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 16)
    public static final void method43(int arg0) {
        class10.field259 = new class24(32);
        field211++;
        if (arg0 <= 115) {
            field198 = false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 40)
    public static void method44(int arg0) {
        field210 = null;
        field203 = null;
        field218 = null;
        if (arg0 >= -96) {
            return;
        }
        field222 = null;
        field213 = null;
        field216 = null;
        field215 = null;
        field200 = null;
        field220 = null;
        field223 = null;
        field219 = null;
        field214 = null;
        field202 = null;
        field212 = null;
        field197 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I", line = 70)
    public static final int method45(int arg0, int arg1, int arg2) {
        field204++;
        if (arg0 == -1) {
            return 12345678;
        } else if (arg2 > -107) {
            return -74;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 105)
    public static final void method46(int arg0) {
        class60.field1512 = null;
        field217++;
        class53.field1358 = null;
        if (arg0 <= -111) {
            class35.field893 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lgd;BLee;)Lgd;", line = 134)
    public static final class40 method47(class40 arg0, byte arg1, class30 arg2) {
        field208++;
        if (arg1 > -39) {
            field197 = null;
        }
        if (arg0.method258(class18.field447, (byte) -61) == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.method258(class10.field250, (byte) 78);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method258(class76.field1767, (byte) -91);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method258(class67.field1645, (byte) 99);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method258(class131.field3174, (byte) 93);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method258(class132.field3213, (byte) 90);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method258(class108.field2641, (byte) 54);
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    class40 var9 = class125.field2966;
                                                    if (class92.field2104 != null) {
                                                        var9 = class11.method63(-74, class92.field2104.field2886);
                                                        try {
                                                            if (class92.field2104.field2887 != null) {
                                                                byte[] var10 = ((String) class92.field2104.field2887).getBytes("ISO-8859-1");
                                                                var9 = class50.method388(var10.length, var10, (byte) -51, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg0 = client.method114(true, new class40[] { arg0.method242(0, -12448, var8), var9, arg0.method240(-28427, var8 + 4) });
                                                }
                                            }
                                            arg0 = client.method114(true, new class40[] { arg0.method242(0, -12448, var7), class104.method794((byte) -120, class12.method69(false, 4, arg2)), arg0.method240(-28427, var7 + 2) });
                                        }
                                    }
                                    arg0 = client.method114(true, new class40[] { arg0.method242(0, -12448, var6), class104.method794((byte) -120, class12.method69(false, 3, arg2)), arg0.method240(-28427, var6 + 2) });
                                }
                            }
                            arg0 = client.method114(true, new class40[] { arg0.method242(0, -12448, var5), class104.method794((byte) -120, class12.method69(false, 2, arg2)), arg0.method240(-28427, var5 + 2) });
                        }
                    }
                    arg0 = client.method114(true, new class40[] { arg0.method242(0, -12448, var4), class104.method794((byte) -120, class12.method69(false, 1, arg2)), arg0.method240(-28427, var4 + 2) });
                }
            }
            arg0 = client.method114(true, new class40[] { arg0.method242(0, -12448, var3), class104.method794((byte) -120, class12.method69(false, 0, arg2)), arg0.method240(-28427, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 266)
    public static final void method48(boolean arg0) {
        field199++;
        int var1 = -1;
        if (arg0) {
            method47(null, (byte) -32, null);
        }
        if (class137.field3344 == 0 && class110.field2682 == 0) {
            class98.method686(class40.field1001, class135.field3282, class125.field2966, class51.field1311, 45, 0, -1);
            class87.field1967++;
        }
        for (int var2 = 0; var2 < class97.field2296; var2++) {
            int var3 = class97.field2305[var2];
            int var4 = var3 >> 7 & 0x7F;
            int var5 = var3 >> 29 & 0x3;
            int var6 = var3 & 0x7F;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var5 == 2 && class21.field490.method957(class99.field2361, var6, var4, var3) >= 0) {
                    class14 var8 = class114.method884(var7, (byte) -56);
                    if (var8.field361 != null) {
                        var8 = var8.method88(4);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class137.field3344 == 1) {
                        class98.method686(var6, var4, client.method114(!arg0, new class40[] { class103.field2460, class41.field1022, var8.field348 }), class93.field2130, 38, var3, -1);
                        class99.field2356++;
                    } else if (class110.field2682 != 1) {
                        class92.field2092++;
                        class40[] var9 = var8.field351;
                        if (class5.field149) {
                            var9 = class122.method937((byte) 98, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 15;
                                    }
                                    class107.field2611++;
                                    if (var10 == 1) {
                                        var11 = 3;
                                    }
                                    if (var10 == 2) {
                                        var11 = 48;
                                    }
                                    if (var10 == 3) {
                                        var11 = 57;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1001;
                                    }
                                    class98.method686(var6, var4, client.method114(true, new class40[] { class113.field2740, var8.field348 }), var9[var10], var11, var3, -1);
                                }
                            }
                        }
                        class98.method686(var6, var4, client.method114(true, new class40[] { class113.field2740, var8.field348 }), class52.field1325, 1005, var8.field409 << 14, -1);
                    } else if ((class107.field2618 & 0x4) == 4) {
                        class98.method686(var6, var4, client.method114(true, new class40[] { class4.field76, class41.field1022, var8.field348 }), class2.field39, 51, var3, -1);
                        class106.field2571++;
                    }
                }
                if (var5 == 1) {
                    class23 var12 = class130.field3142[var7];
                    if (var12.field531.field3030 == 1 && (var12.field792 & 0x7F) == 64 && (var12.field838 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class23.field548; var13++) {
                            class23 var16 = class130.field3142[class115.field2763[var13]];
                            if (var16 != null && var12 != var16 && var16.field531.field3030 == 1 && var12.field792 == var16.field792 && var12.field838 == var16.field838) {
                                class30.method196(-4, class115.field2763[var13], var16.field531, var6, var4);
                            }
                        }
                        for (int var14 = 0; var14 < class1.field18; var14++) {
                            class96 var15 = class90.field2044[class77.field1787[var14]];
                            if (var15 != null && var12.field792 == var15.field792 && var12.field838 == var15.field838) {
                                class104.method802(var4, var15, var6, class77.field1787[var14], 16711680);
                            }
                        }
                    }
                    class30.method196(-4, var7, var12.field531, var6, var4);
                }
                if (var5 == 0) {
                    class96 var17 = class90.field2044[var7];
                    if ((var17.field792 & 0x7F) == 64 && (var17.field838 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class23.field548; var18++) {
                            class23 var21 = class130.field3142[class115.field2763[var18]];
                            if (var21 != null && var21.field531.field3030 == 1 && var17.field792 == var21.field792 && var17.field838 == var21.field838) {
                                class30.method196(-4, class115.field2763[var18], var21.field531, var6, var4);
                            }
                        }
                        for (int var19 = 0; var19 < class1.field18; var19++) {
                            class96 var20 = class90.field2044[class77.field1787[var19]];
                            if (var20 != null && var17 != var20 && var17.field792 == var20.field792 && var17.field838 == var20.field838) {
                                class104.method802(var4, var20, var6, class77.field1787[var19], 16711680);
                            }
                        }
                    }
                    class104.method802(var4, var17, var6, var7, 16711680);
                }
                if (var5 == 3) {
                    class89 var22 = class59.field1494[class99.field2361][var6][var4];
                    if (var22 != null) {
                        for (class41 var23 = (class41) var22.method588(119); var23 != null; var23 = (class41) var22.method592((byte) -94)) {
                            class4 var24 = class132.method1041(var23.field1005, 31);
                            if (class137.field3344 == 1) {
                                class98.method686(var6, var4, client.method114(!arg0, new class40[] { class103.field2460, class4.field141, var24.field114 }), class93.field2130, 7, var23.field1005, -1);
                                class55.field1437++;
                            } else if (class110.field2682 != 1) {
                                class98.field2332++;
                                class40[] var25 = var24.field80;
                                if (class5.field149) {
                                    var25 = class122.method937((byte) 88, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class112.field2708++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 2;
                                        }
                                        if (var26 == 1) {
                                            var27 = 28;
                                        }
                                        if (var26 == 2) {
                                            var27 = 52;
                                        }
                                        if (var26 == 3) {
                                            var27 = 4;
                                        }
                                        if (var26 == 4) {
                                            var27 = 39;
                                        }
                                        class98.method686(var6, var4, client.method114(true, new class40[] { class79.field1817, var24.field114 }), var25[var26], var27, var23.field1005, -1);
                                    } else if (var26 == 2) {
                                        class98.method686(var6, var4, client.method114(true, new class40[] { class79.field1817, var24.field114 }), class79.field1794, 52, var23.field1005, -1);
                                        class113.field2722++;
                                    }
                                }
                                class98.method686(var6, var4, client.method114(true, new class40[] { class79.field1817, var24.field114 }), class52.field1325, 1002, var23.field1005, -1);
                            } else if ((class107.field2618 & 0x1) == 1) {
                                class98.method686(var6, var4, client.method114(true, new class40[] { class4.field76, class4.field141, var24.field114 }), class2.field39, 37, var23.field1005, -1);
                                class45.field1144++;
                            }
                        }
                    }
                }
            }
        }
    }
}
