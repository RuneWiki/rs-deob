import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class154 extends class191 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public int field3178 = 0;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "[J")
    public static long[] field3172 = new long[32];

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Z")
    public static boolean field3173 = true;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Ldd;")
    public static class35 field3176 = class180.method1196((byte) 126, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "Ldd;")
    public static class35 field3179 = class180.method1196((byte) -39, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Ldd;")
    public static class35 field3177 = class180.method1196((byte) -81, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    public static final void method1035(boolean arg0, int arg1) {
        if (arg1 != -3) {
            return;
        }
        class145.method993(true);
        field3175++;
        class109.field2422++;
        if (class109.field2422 < 50 && !arg0) {
            return;
        }
        class109.field2422 = 0;
        if (class53.field1198 || class108.field2408 == null) {
            return;
        }
        class186.field3791++;
        class1.field11.method659(46, true);
        try {
            class108.field2408.method924(0, class1.field11.field527, class1.field11.field529, true);
            class1.field11.field527 = 0;
        } catch (IOException var2) {
            class53.field1198 = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static final void method1036(byte arg0) {
        field3171++;
        class172.field3441.method662(57);
        int var1 = class172.field3441.method661(1, (byte) -79);
        if (var1 == 0) {
            return;
        }
        int var2 = class172.field3441.method661(2, (byte) -79);
        if (var2 == 0) {
            class165.field3327[class175.field3579++] = 2047;
        } else if (var2 == 1) {
            int var3 = class172.field3441.method661(3, (byte) -79);
            class71.field1704.method557(false, (byte) -102, var3);
            int var4 = class172.field3441.method661(1, (byte) -79);
            if (var4 == 1) {
                class165.field3327[class175.field3579++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class172.field3441.method661(3, (byte) -79);
            class71.field1704.method557(true, (byte) -98, var5);
            int var6 = class172.field3441.method661(3, (byte) -79);
            class71.field1704.method557(true, (byte) -125, var6);
            int var7 = class172.field3441.method661(1, (byte) -79);
            if (var7 == 1) {
                class165.field3327[class175.field3579++] = 2047;
            }
        } else {
            if (arg0 < 8) {
                field3170 = 7;
            }
            if (var2 == 3) {
                int var8 = class172.field3441.method661(1, (byte) -79);
                class175.field3585 = class172.field3441.method661(2, (byte) -79);
                int var9 = class172.field3441.method661(1, (byte) -79);
                if (var9 == 1) {
                    class165.field3327[class175.field3579++] = 2047;
                }
                int var10 = class172.field3441.method661(7, (byte) -79);
                int var11 = class172.field3441.method661(7, (byte) -79);
                class71.field1704.method558(var8 == 1, -64, var11, var10);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static void method1037(int arg0) {
        field3172 = null;
        field3177 = null;
        field3176 = null;
        if (arg0 != -1) {
            field3173 = false;
        }
        field3179 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lce;II)V")
    private final void method1038(class26 arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            this.field3178 = arg0.method256((byte) -78);
        }
        if (arg2 >= -61) {
            method1037(-82);
        }
        field3181++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lce;B)V")
    public final void method1039(class26 arg0, byte arg1) {
        if (arg1 != 34) {
            method1037(-5);
        }
        field3174++;
        while (true) {
            int var3 = arg0.method221(-89);
            if (var3 == 0) {
                return;
            }
            this.method1038(arg0, var3, -98);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[II[Lid;[I)V")
    public static final void method1040(int arg0, int arg1, int[] arg2, int arg3, class84[] arg4, int[] arg5) {
        if (arg1 != -29978) {
            method1037(-39);
        }
        if (arg3 < arg0) {
            int var6 = arg3 - 1;
            int var7 = arg0 + 1;
            int var8 = (arg3 + arg0) / 2;
            class84 var9 = arg4[var8];
            arg4[var8] = arg4[arg3];
            arg4[arg3] = var9;
            while (var7 > var6) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg5[var11] == 2) {
                            var12 = arg4[var7].field1924;
                            var13 = var9.field1924;
                        } else if (arg5[var11] == 1) {
                            var12 = arg4[var7].field1934;
                            if (var12 == -1 && arg2[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = var9.field1934;
                            if (var13 == -1 && arg2[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg5[var11] == 3) {
                            var12 = arg4[var7].field1922 ? 1 : 0;
                            var13 = var9.field1922 ? 1 : 0;
                        } else {
                            var13 = var9.field1935;
                            var12 = arg4[var7].field1935;
                        }
                        if (var12 != var13) {
                            if ((arg2[var11] != 1 || var12 <= var13) && (arg2[var11] != 0 || var13 <= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg5[var15] == 2) {
                            var16 = arg4[var6].field1924;
                            var17 = var9.field1924;
                        } else if (arg5[var15] == 1) {
                            var17 = var9.field1934;
                            var16 = arg4[var6].field1934;
                            if (var16 == -1 && arg2[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg2[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg5[var15] == 3) {
                            var17 = var9.field1922 ? 1 : 0;
                            var16 = arg4[var6].field1922 ? 1 : 0;
                        } else {
                            var16 = arg4[var6].field1935;
                            var17 = var9.field1935;
                        }
                        if (var16 != var17) {
                            if ((arg2[var15] != 1 || var16 >= var17) && (arg2[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var7) {
                    class84 var18 = arg4[var6];
                    arg4[var6] = arg4[var7];
                    arg4[var7] = var18;
                }
            }
            method1040(var7, arg1, arg2, arg3, arg4, arg5);
            method1040(arg0, -29978, arg2, var7 + 1, arg4, arg5);
        }
        field3180++;
    }
}
