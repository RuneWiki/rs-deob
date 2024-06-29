import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 {

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lqa;")
    private class96 field1398 = null;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    private int field1400 = 65000;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lqa;")
    private class96 field1404 = null;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1393 = -1;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lec;")
    public static class28 field1394 = class28.method210(-46, "@cr2@");

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
    public static boolean field1406 = false;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "[I")
    public static int[] field1412 = new int[2000];

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Lec;")
    public static class28 field1407 = class28.method210(-46, "@or2@");

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Z")
    public static boolean field1410 = false;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lec;")
    public static class28 field1401 = class28.method210(-46, "Aug");

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
    public static int[] field1411;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[B")
    public final byte[] method502(byte arg0, int arg1) {
        field1414++;
        class96 var3 = this.field1398;
        synchronized (this.field1398) {
            try {
                if (this.field1404.method696((byte) -100) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field1404.method699(108, (long) (arg1 * 6));
                this.field1404.method698(0, 6, class12.field205, -1);
                int var5 = (class12.field205[2] & 0xFF) + ((class12.field205[1] & 0xFF) << 8) + ((class12.field205[0] & 0xFF) << 16);
                int var6 = ((class12.field205[4] & 0xFF) << 8) + ((class12.field205[3] & 0xFF) << 16) + (class12.field205[5] & 0xFF);
                if (var5 < 0 || this.field1400 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1398.method696((byte) -100) / 520L) {
                    if (arg0 != 15) {
                        field1407 = null;
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label74: while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var11;
                        this.field1398.method699(114, (long) (var6 * 520));
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1398.method698(0, var13 + 8, class12.field205, -1);
                        int var14 = ((class12.field205[2] & 0xFF) << 8) + (class12.field205[3] & 0xFF);
                        int var15 = class12.field205[7] & 0xFF;
                        int var16 = ((class12.field205[5] & 0xFF) << 8) + ((class12.field205[4] & 0xFF) << 16) + (class12.field205[6] & 0xFF);
                        int var17 = ((class12.field205[0] & 0xFF) << 8) + (class12.field205[1] & 0xFF);
                        if (arg1 == var17 && var10 == var14 && this.field1403 == var15) {
                            if (var16 >= 0 && (long) var16 <= this.field1398.method696((byte) -100) / 520L) {
                                var6 = var16;
                                var10++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var9[var11++] = class12.field205[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BBZII)Z")
    private final boolean method503(byte[] arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1396++;
        class96 var6 = this.field1398;
        synchronized (this.field1398) {
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg4 * 6 + 6) > this.field1404.method696((byte) -100)) {
                        return false;
                    }
                    this.field1404.method699(79, (long) (arg4 * 6));
                    this.field1404.method698(0, 6, class12.field205, -1);
                    var7 = ((class12.field205[3] & 0xFF) << 16) + ((class12.field205[4] & 0xFF) << 8) + (class12.field205[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field1398.method696((byte) -100) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1398.method696((byte) -100) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class12.field205[0] = (byte) (arg3 >> 16);
                int var10 = 0;
                class12.field205[1] = (byte) (arg3 >> 8);
                class12.field205[2] = (byte) arg3;
                class12.field205[3] = (byte) (var7 >> 16);
                class12.field205[4] = (byte) (var7 >> 8);
                if (arg1 < 87) {
                    field1406 = true;
                }
                int var11 = 0;
                class12.field205[5] = (byte) var7;
                this.field1404.method699(76, (long) (arg4 * 6));
                this.field1404.method693(0, class12.field205, 0, 6);
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label109: {
                            this.field1398.method699(79, (long) (var7 * 520));
                            try {
                                this.field1398.method698(0, 8, class12.field205, -1);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class12.field205[6] & 0xFF) + ((class12.field205[5] & 0xFF) << 8) + ((class12.field205[4] & 0xFF) << 16);
                            int var13 = class12.field205[7] & 0xFF;
                            int var14 = ((class12.field205[2] & 0xFF) << 8) + (class12.field205[3] & 0xFF);
                            int var15 = ((class12.field205[0] & 0xFF) << 8) + (class12.field205[1] & 0xFF);
                            if (arg4 == var15 && var11 == var14 && this.field1403 == var13) {
                                if (var12 >= 0 && (long) var12 <= this.field1398.method696((byte) -100) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1398.method696((byte) -100) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    int var18 = arg3 - var10;
                    class12.field205[0] = (byte) (arg4 >> 8);
                    class12.field205[1] = (byte) arg4;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class12.field205[2] = (byte) (var11 >> 8);
                    class12.field205[3] = (byte) var11;
                    var11++;
                    class12.field205[4] = (byte) (var12 >> 16);
                    class12.field205[5] = (byte) (var12 >> 8);
                    class12.field205[6] = (byte) var12;
                    class12.field205[7] = (byte) this.field1403;
                    this.field1398.method699(127, (long) (var7 * 520));
                    var7 = var12;
                    this.field1398.method693(0, class12.field205, 0, 8);
                    this.field1398.method693(var10, arg0, 0, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIII)Z")
    public final boolean method504(byte[] arg0, int arg1, int arg2, int arg3) {
        field1402++;
        if (arg3 != -6) {
            return false;
        }
        class96 var5 = this.field1398;
        synchronized (this.field1398) {
            if (arg2 < 0 || this.field1400 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method503(arg0, (byte) 120, true, arg2, arg1);
            if (!var6) {
                var6 = this.method503(arg0, (byte) 99, false, arg2, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1407 = null;
        field1412 = null;
        field1401 = null;
        field1411 = null;
        if (arg0 != 0) {
            field1412 = null;
        }
        field1394 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILke;)V")
    public static final void method506(int arg0, class65 arg1) {
        arg1.field1438 = 0;
        if (arg1.field1475 == arg0) {
            arg1.field1471 = 1024;
        }
        if (arg1.field1475 == 1) {
            arg1.field1471 = 1536;
        }
        if (arg1.field1475 == 2) {
            arg1.field1471 = 0;
        }
        int var2 = arg1.field1450 - class83.field1888;
        field1395++;
        int var3 = arg1.field1488 * 128 + arg1.field1500 * 64;
        arg1.field1446 += (var3 - arg1.field1446) / var2;
        int var4 = arg1.field1500 * 64 + arg1.field1459 * 128;
        if (arg1.field1475 == 3) {
            arg1.field1471 = 512;
        }
        arg1.field1501 += (var4 - arg1.field1501) / var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ln;ILec;)Lec;")
    public static final class28 method507(class78 arg0, int arg1, class28 arg2) {
        int var3 = 28 % ((-arg1 - 40) / 55);
        field1408++;
        if (arg2.method203(class88.field1967, (byte) -71) == -1) {
            return arg2;
        }
        while (true) {
            int var4 = arg2.method203(class50.field1174, (byte) -71);
            if (var4 == -1) {
                while (true) {
                    int var5 = arg2.method203(client.field393, (byte) -71);
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg2.method203(class11.field186, (byte) -71);
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg2.method203(class46.field1039, (byte) -71);
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg2.method203(class1.field2, (byte) -71);
                                            if (var8 == -1) {
                                                return arg2;
                                            }
                                            arg2 = class68.method537(1, new class28[] { arg2.method228(var8, true, 0), class21.method142(338, class13.method73(3645, 4, arg0)), arg2.method218(var8 + 2, false) });
                                        }
                                    }
                                    arg2 = class68.method537(1, new class28[] { arg2.method228(var7, true, 0), class21.method142(338, class13.method73(3645, 3, arg0)), arg2.method218(var7 + 2, false) });
                                }
                            }
                            arg2 = class68.method537(1, new class28[] { arg2.method228(var6, true, 0), class21.method142(338, class13.method73(3645, 2, arg0)), arg2.method218(var6 + 2, false) });
                        }
                    }
                    arg2 = class68.method537(1, new class28[] { arg2.method228(var5, true, 0), class21.method142(338, class13.method73(3645, 1, arg0)), arg2.method218(var5 + 2, false) });
                }
            }
            arg2 = class68.method537(1, new class28[] { arg2.method228(var4, true, 0), class21.method142(338, class13.method73(3645, 0, arg0)), arg2.method218(var4 + 2, false) });
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLec;Lec;Lvb;)Lea;")
    public static final class26 method508(byte arg0, class28 arg1, class28 arg2, class122 arg3) {
        if (arg0 <= 103) {
            field1410 = false;
        }
        int var4 = arg3.method942(arg2, 1);
        field1397++;
        int var5 = arg3.method930((byte) 99, var4, arg1);
        return class72.method572((byte) 124, arg3, var5, var4);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lvb;ILvb;)I")
    public static final int method509(class122 arg0, int arg1, class122 arg2) {
        int var3 = 0;
        field1399++;
        if (arg0.method935(class21.field453, 1, class43.field912)) {
            var3++;
        }
        if (arg1 != -16272) {
            field1407 = null;
        }
        if (arg2.method935(class21.field453, arg1 ^ 0xFFFFC071, class118.field2513)) {
            var3++;
        }
        if (arg2.method935(class21.field453, 1, class9.field172)) {
            var3++;
        }
        if (arg2.method935(class21.field453, arg1 + 16273, class109.field2294)) {
            var3++;
        }
        if (arg2.method935(class21.field453, 1, class34.field774)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILqa;Lqa;I)V")
    public class63(int arg0, class96 arg1, class96 arg2, int arg3) {
        this.field1403 = arg0;
        this.field1398 = arg1;
        this.field1400 = arg3;
        this.field1404 = arg2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Ldb;")
    public static final class21 method510(int arg0, byte arg1) {
        class21 var2 = (class21) class96.field2153.method660(-2, (long) arg0);
        field1409++;
        int var3 = -55 / ((-arg1 - 9) / 43);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class11.field189.method932(125, arg0, 3);
        class21 var5 = new class21();
        if (var4 != null) {
            var5.method144(-28969, new class119(var4));
        }
        class96.field2153.method666(false, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLea;II)V")
    public static final void method511(byte arg0, class26 arg1, int arg2, int arg3) {
        field1405++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 49) {
            method511((byte) 90, null, -30, 39);
        }
        int var4 = arg2 * arg2 + arg3 * arg3;
        int var5 = class48.field1105 + class122.field2663 & 0x7FF;
        if (var4 > 6400) {
            return;
        }
        int var6 = class33.field736[var5];
        int var7 = class33.field760[var5];
        int var8 = var7 * 256 / (class74.field1637 + 256);
        int var9 = var6 * 256 / (class74.field1637 + 256);
        int var10 = arg2 * var8 - arg3 * var9 >> 16;
        int var11 = arg2 * var9 + arg3 * var8 >> 16;
        if (var4 <= 2500) {
            arg1.method188(var11 + 94 + 4 - arg1.field566 / 2, -(arg1.field564 / 2) + -4 + -var10 + 83);
        } else {
            arg1.method182(class45.field1000, var11 + 98 - arg1.field566 / 2, -(arg1.field564 / 2) + -4 + -var10 + 83);
        }
    }
}
