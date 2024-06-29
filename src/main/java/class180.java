import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class180 {

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2876 = new String[100];

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[I")
    public static int[] field2877 = new int[100];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1309(String arg0, int arg1) {
        field2878++;
        if (arg1 != -20696) {
            return -66L;
        }
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/Object;Lci;I)V")
    public static final void method1310(Object arg0, class83 arg1, int arg2) {
        field2872++;
        if (arg1.field1367 == null) {
            return;
        }
        if (arg2 != 29616) {
            field2873 = -51;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1367.peekEvent() != null; var3++) {
            class28.method182(1L, true);
        }
        if (arg0 != null) {
            arg1.field1367.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IJ)V")
    public static final void method1311(int arg0, long arg1) {
        field2871++;
        if (arg0 != 0) {
            return;
        }
        if (!class46.field814) {
            class187.field2993 += (float) arg1 * class43.field658 / 40.0F;
            class265.field4432 += (float) arg1 * class250.field4237 / 40.0F;
        }
        int var3 = class54.field958;
        int var4 = class138.field2264;
        if (class127.field2115 != var4) {
            int var5 = var4 - class127.field2115;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class127.field2115 += var6;
        }
        if (class100.field1592 != var3) {
            int var7 = var3 - class100.field1592;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class100.field1592 += var8;
        }
        class249.method1776(122);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
    public static final void method1312(int arg0, boolean arg1) {
        class243.field4075 = arg1;
        class224.field3777 = !class136.method1011(false);
        field2875++;
        if (arg0 != -1) {
            field2876 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILhg;I)I")
    public static final int method1313(int arg0, class207 arg1, int arg2) {
        field2869++;
        if (arg1.field3493 == null || arg2 >= arg1.field3493.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field3493[arg2];
            if (arg0 != -28178) {
                return -22;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class231.field3914[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class111.field1831[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class250.field4238[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class207 var12 = class222.method1574(arg0 ^ 0xFFFF919E, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class13.method75(false, var13).field1224 || class85.field1418)) {
                        for (int var14 = 0; var14 < var12.field3421.length; var14++) {
                            if (var13 + 1 == var12.field3421[var14]) {
                                var8 += var12.field3354[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class12.field230[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class244.field4094[class111.field1831[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class12.field230[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class16.field314.field2073;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class36.field579[var15]) {
                            var8 += class111.field1831[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class207 var18 = class222.method1574(105, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class13.method75(false, var19).field1224 || class85.field1418)) {
                        for (int var20 = 0; var20 < var18.field3421.length; var20++) {
                            if (var19 + 1 == var18.field3421[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class147.field2429;
                }
                if (var7 == 12) {
                    var8 = class174.field2793;
                }
                if (var7 == 13) {
                    int var21 = class12.field230[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class313.method2120((byte) -127, var23);
                }
                if (var7 == 18) {
                    var8 = (class16.field314.field715 >> 7) + class26.field462;
                }
                if (var7 == 19) {
                    var8 = (class16.field314.field771 >> 7) + class78.field1313;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static void method1314(byte arg0) {
        if (arg0 == -38) {
            field2877 = null;
            field2876 = null;
        }
    }
}
