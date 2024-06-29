import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class69 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    private int field1358 = 65000;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lph;")
    private class166 field1355 = null;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lph;")
    private class166 field1366 = null;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Loc;")
    public static class151 field1356 = class137.method873(2, "<col=ffff00>*V");

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Loc;")
    private static class151 field1364 = class137.method873(2, "Password: ");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Loc;")
    public static class151 field1354 = field1364;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Loh;")
    public static class156 field1365 = new class156(30);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lma;")
    public static class129 field1363;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
    public static int[] field1368;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIZI)Z")
    private final boolean method466(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1360++;
        class166 var6 = this.field1355;
        synchronized (this.field1355) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg2 * 6 + 6) > this.field1366.method1074(0)) {
                        return false;
                    }
                    this.field1366.method1081((byte) -126, (long) (arg2 * 6));
                    this.field1366.method1078(0, class204.field3622, false, 6);
                    var8 = (class204.field3622[5] & 0xFF) + (((class204.field3622[3] & 0xFF) << 16) + ((class204.field3622[4] & 0xFF) << 8));
                    if (var8 <= 0 || (long) var8 > this.field1355.method1074(0) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1355.method1074(0) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class204.field3622[1] = (byte) (arg1 >> 8);
                class204.field3622[2] = (byte) arg1;
                class204.field3622[4] = (byte) (var8 >> 8);
                class204.field3622[0] = (byte) (arg1 >> 16);
                class204.field3622[5] = (byte) var8;
                class204.field3622[3] = (byte) (var8 >> 16);
                int var10 = 0;
                int var11 = 0;
                this.field1366.method1081((byte) -35, (long) (arg2 * 6));
                int var12 = -19 / ((arg4 + 5) / 40);
                this.field1366.method1073(-1, 6, 0, class204.field3622);
                while (var10 < arg1) {
                    int var13 = 0;
                    if (arg3) {
                        label104: {
                            this.field1355.method1081((byte) -28, (long) (var8 * 520));
                            try {
                                this.field1355.method1078(0, class204.field3622, false, 8);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class204.field3622[4] & 0xFF) << 16) + (class204.field3622[6] & 0xFF) + ((class204.field3622[5] & 0xFF) << 8);
                            int var14 = class204.field3622[7] & 0xFF;
                            int var15 = ((class204.field3622[0] & 0xFF) << 8) + (class204.field3622[1] & 0xFF);
                            int var16 = ((class204.field3622[2] & 0xFF) << 8) + (class204.field3622[3] & 0xFF);
                            if (arg2 == var15 && var11 == var16 && this.field1362 == var14) {
                                if (var13 >= 0 && (long) var13 <= this.field1355.method1074(0) / 520L) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1355.method1074(0) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class204.field3622[1] = (byte) arg2;
                    if (arg1 - var10 <= 512) {
                        var13 = 0;
                    }
                    class204.field3622[7] = (byte) this.field1362;
                    class204.field3622[4] = (byte) (var13 >> 16);
                    class204.field3622[0] = (byte) (arg2 >> 8);
                    class204.field3622[6] = (byte) var13;
                    class204.field3622[2] = (byte) (var11 >> 8);
                    int var19 = arg1 - var10;
                    class204.field3622[5] = (byte) (var13 >> 8);
                    class204.field3622[3] = (byte) var11;
                    this.field1355.method1081((byte) -122, (long) (var8 * 520));
                    var8 = var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1355.method1073(-1, 8, 0, class204.field3622);
                    this.field1355.method1073(-1, var19, var10, arg0);
                    var11++;
                    var10 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIII)Z")
    public final boolean method467(byte[] arg0, int arg1, int arg2, int arg3) {
        field1367++;
        class166 var5 = this.field1355;
        synchronized (this.field1355) {
            if (arg3 != -30550) {
                field1365 = null;
            }
            if (arg1 < 0 || arg1 > this.field1358) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method466(arg0, arg1, arg2, true, -124);
            if (!var6) {
                var6 = this.method466(arg0, arg1, arg2, false, arg3 + 30443);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[B")
    public final byte[] method468(int arg0, int arg1) {
        field1369++;
        class166 var3 = this.field1355;
        synchronized (this.field1355) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field1366.method1074(0)) {
                    return null;
                }
                this.field1366.method1081((byte) -8, (long) (arg0 * 6));
                this.field1366.method1078(0, class204.field3622, false, 6);
                int var5 = (class204.field3622[2] & 0xFF) + ((class204.field3622[1] & 0xFF) << 8) + ((class204.field3622[0] & 0xFF) << 16);
                if (arg1 <= 74) {
                    this.field1355 = null;
                }
                int var6 = ((class204.field3622[3] & 0xFF) << 16) + (class204.field3622[4] << 8 & 0xFF00) + (class204.field3622[5] & 0xFF);
                if (var5 < 0 || this.field1358 < var5) {
                    return null;
                } else if (var6 > 0 && this.field1355.method1074(0) / 520L >= (long) var6) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label72: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1355.method1081((byte) -123, (long) (var6 * 520));
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1355.method1078(0, class204.field3622, false, var13 + 8);
                        int var14 = ((class204.field3622[0] & 0xFF) << 8) + (class204.field3622[1] & 0xFF);
                        int var15 = ((class204.field3622[2] & 0xFF) << 8) + (class204.field3622[3] & 0xFF);
                        int var16 = ((class204.field3622[5] & 0xFF) << 8) + ((class204.field3622[4] << 16 & 0xFF0000) + (class204.field3622[6] & 0xFF));
                        int var17 = class204.field3622[7] & 0xFF;
                        if (arg0 == var14 && var9 == var15 && this.field1362 == var17) {
                            if (var16 >= 0 && this.field1355.method1074(0) / 520L >= (long) var16) {
                                var9++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var10[var11++] = class204.field3622[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1359++;
        return "Cache:" + this.field1362;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method469(boolean arg0) {
        field1363 = null;
        field1365 = null;
        field1356 = null;
        field1364 = null;
        if (arg0) {
            method469(true);
        }
        field1354 = null;
        field1368 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIII)V")
    public static final void method470(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 7) {
            method470((byte) -114, -55, -52, 79, -94);
        }
        class110 var5 = (class110) class166.field3032.method1538((long) arg2, (byte) 127);
        if (var5 == null) {
            var5 = new class110();
            class166.field3032.method1536((byte) -89, var5, (long) arg2);
        }
        if (arg4 >= var5.field1952.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1952.length; var8++) {
                var6[var8] = var5.field1952[var8];
                var7[var8] = var5.field1953[var8];
            }
            for (int var9 = var5.field1952.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1952 = var6;
            var5.field1953 = var7;
        }
        var5.field1952[arg4] = arg1;
        field1361++;
        var5.field1953[arg4] = arg3;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ILph;Lph;I)V")
    public class69(int arg0, class166 arg1, class166 arg2, int arg3) {
        this.field1366 = arg2;
        this.field1355 = arg1;
        this.field1362 = arg0;
        this.field1358 = arg3;
    }
}
