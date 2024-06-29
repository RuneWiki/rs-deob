import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lba;")
    private class9 field1477 = null;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    private int field1497 = 65000;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lba;")
    private class9 field1487 = null;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lr;")
    private static class118 field1482 = class153.method1136(116, "Unable to find ");

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lr;")
    public static class118 field1478 = class153.method1136(111, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
    public static int[] field1483 = new int[128];

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
    public static int[] field1480 = new int[4000];

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lr;")
    public static class118 field1484 = class153.method1136(121, "(Z");

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
    public static volatile boolean field1491 = true;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1486 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lr;")
    private static class118 field1493 = class153.method1136(106, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1479 = 0;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Lr;")
    public static class118 field1499 = field1482;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lr;")
    private static class118 field1489 = class153.method1136(105, "Loading title screen )2 ");

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lr;")
    public static class118 field1476 = field1493;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lr;")
    public static class118 field1492 = field1489;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "[I")
    public static int[] field1488;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[B")
    public final byte[] method564(int arg0, int arg1) {
        field1494++;
        class9 var3 = this.field1487;
        synchronized (this.field1487) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field1477.method72(0)) {
                    return null;
                }
                this.field1477.method67(arg1 - 6945, (long) (arg0 * 6));
                this.field1477.method73(6, class136.field3078, -15769, 0);
                int var5 = (class136.field3078[5] & 0xFF) + (((class136.field3078[3] & 0xFF) << 16) + ((class136.field3078[4] & 0xFF) << 8));
                int var6 = ((class136.field3078[0] & 0xFF) << 16) + ((class136.field3078[1] & 0xFF) << 8) + (class136.field3078[2] & 0xFF);
                if (arg1 != 6944) {
                    field1480 = null;
                }
                if (var6 < 0 || var6 > this.field1497) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field1487.method72(0) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1487.method67(arg1 - 6945, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1487.method73(var13 + 8, class136.field3078, -15769, 0);
                        int var14 = class136.field3078[7] & 0xFF;
                        int var15 = ((class136.field3078[0] & 0xFF) << 8) + (class136.field3078[1] & 0xFF);
                        int var16 = ((class136.field3078[5] & 0xFF) << 8) + ((class136.field3078[4] & 0xFF) << 16) + (class136.field3078[6] & 0xFF);
                        int var17 = ((class136.field3078[2] & 0xFF) << 8) + (class136.field3078[3] & 0xFF);
                        if (arg0 == var15 && var11 == var17 && this.field1496 == var14) {
                            if (var16 >= 0 && this.field1487.method72(0) / 520L >= (long) var16) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class136.field3078[var20 + 8];
                                }
                                var5 = var16;
                                continue;
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

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method565(int arg0) {
        field1480 = null;
        if (arg0 < 116) {
            method569(59);
        }
        field1489 = null;
        field1484 = null;
        field1492 = null;
        field1493 = null;
        field1499 = null;
        field1482 = null;
        field1488 = null;
        field1476 = null;
        field1478 = null;
        field1483 = null;
    }

    @OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1500++;
        return "Cache:" + this.field1496;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ[B)I")
    public static final int method566(int arg0, boolean arg1, byte[] arg2) {
        field1475++;
        if (!arg1) {
            method571(62, -60, -59, 82);
        }
        return class139.method1043(0, arg2, arg0, (byte) -76);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[BZI)Z")
    private final boolean method567(byte arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1498++;
        class9 var6 = this.field1487;
        synchronized (this.field1487) {
            try {
                int var7;
                if (arg3) {
                    if (this.field1477.method72(0) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field1477.method67(-1, (long) (arg1 * 6));
                    this.field1477.method73(6, class136.field3078, -15769, 0);
                    var7 = ((class136.field3078[3] & 0xFF) << 16) + (class136.field3078[5] & 0xFF) + ((class136.field3078[4] & 0xFF) << 8);
                    if (var7 <= 0 || this.field1487.method72(0) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1487.method72(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                int var10 = -68 / ((arg0 + 51) / 58);
                class136.field3078[3] = (byte) (var7 >> 16);
                int var11 = 0;
                class136.field3078[2] = (byte) arg4;
                class136.field3078[0] = (byte) (arg4 >> 16);
                class136.field3078[4] = (byte) (var7 >> 8);
                class136.field3078[1] = (byte) (arg4 >> 8);
                int var12 = 0;
                class136.field3078[5] = (byte) var7;
                this.field1477.method67(-1, (long) (arg1 * 6));
                this.field1477.method65(class136.field3078, 6, 0, false);
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg3) {
                        label105: {
                            this.field1487.method67(-1, (long) (var7 * 520));
                            try {
                                this.field1487.method73(8, class136.field3078, -15769, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class136.field3078[5] & 0xFF) << 8) + ((class136.field3078[4] & 0xFF) << 16) + (class136.field3078[6] & 0xFF);
                            int var14 = ((class136.field3078[2] & 0xFF) << 8) + (class136.field3078[3] & 0xFF);
                            int var15 = ((class136.field3078[0] & 0xFF) << 8) + (class136.field3078[1] & 0xFF);
                            int var16 = class136.field3078[7] & 0xFF;
                            if (arg1 == var15 && var12 == var14 && this.field1496 == var16) {
                                if (var13 >= 0 && this.field1487.method72(0) / 520L >= (long) var13) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field1487.method72(0) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class136.field3078[7] = (byte) this.field1496;
                    class136.field3078[2] = (byte) (var12 >> 8);
                    class136.field3078[0] = (byte) (arg1 >> 8);
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class136.field3078[1] = (byte) arg1;
                    class136.field3078[3] = (byte) var12;
                    class136.field3078[5] = (byte) (var13 >> 8);
                    class136.field3078[6] = (byte) var13;
                    int var19 = arg4 - var11;
                    var12++;
                    class136.field3078[4] = (byte) (var13 >> 16);
                    this.field1487.method67(-1, (long) (var7 * 520));
                    var7 = var13;
                    this.field1487.method65(class136.field3078, 8, 0, false);
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1487.method65(arg2, var19, var11, false);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBILff;Lff;)Ldf;")
    public static final class28 method568(int arg0, byte arg1, int arg2, class42 arg3, class42 arg4) {
        field1495++;
        if (class9.method75(arg0, 1286850920, arg3, arg2)) {
            if (arg1 > -45) {
                method571(76, -48, -45, -19);
            }
            return class30.method259(arg4.method350(arg0, -19, arg2), -124);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method569(int arg0) {
        class91.field2167.method394(12693);
        field1490++;
        if (arg0 != 4) {
            method571(29, 5, 88, 40);
        }
        class118.field2765.method394(12693);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[B)Z")
    public final boolean method570(int arg0, int arg1, int arg2, byte[] arg3) {
        field1485++;
        class9 var5 = this.field1487;
        synchronized (this.field1487) {
            if (arg2 > arg0 || this.field1497 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method567((byte) -124, arg1, arg3, true, arg0);
            if (!var6) {
                var6 = this.method567((byte) -127, arg1, arg3, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
    public static final void method571(int arg0, int arg1, int arg2, int arg3) {
        field1481++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            class146.field3261 = -1;
            class46.field1105 = -1;
            return;
        }
        int var4 = class46.method386(-15186, class106.field2468, arg0, arg1) - arg3;
        int var5 = arg0 - class24.field580;
        int var6 = var4 - class85.field2093;
        int var7 = arg1 - class44.field1051;
        if (arg2 != -968986480) {
            field1499 = null;
        }
        int var8 = class58.field1354[class85.field2092];
        int var9 = class58.field1346[class85.field2092];
        int var10 = class58.field1354[class1.field25];
        int var11 = class58.field1346[class1.field25];
        int var12 = var5 * var11 + var7 * var10 >> 16;
        int var13 = var7 * var11 - var5 * var10 >> 16;
        int var15 = var6 * var9 - var8 * var13 >> 16;
        int var16 = var6 * var8 + var9 * var13 >> 16;
        if (var16 < 50) {
            class146.field3261 = -1;
            class46.field1105 = -1;
        } else {
            class146.field3261 = (var12 << 9) / var16 + 256;
            class46.field1105 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILba;Lba;I)V")
    public class65(int arg0, class9 arg1, class9 arg2, int arg3) {
        this.field1496 = arg0;
        this.field1497 = arg3;
        this.field1477 = arg2;
        this.field1487 = arg1;
    }
}
