import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class121 {

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lmu;")
    private class253 field1508 = null;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    private int field1510 = 65000;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lmu;")
    private class253 field1514 = null;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
    public static int[] field1505 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "[I")
    public static int[] field1512 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "J")
    public static long field1506;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[B", line = 4)
    public final byte[] method747(int arg0, int arg1) {
        field1516++;
        class253 var3 = this.field1508;
        synchronized (this.field1508) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field1514.method1663(1553)) {
                    return null;
                }
                this.field1514.method1665(arg1 - 1748413256, (long) (arg0 * 6));
                this.field1514.method1662(arg1 - 1748413248, 6, 0, class74.field792);
                int var5 = ((class74.field792[1] & 0xFF) << 8) + (((class74.field792[0] & 0xFF) << 16) + (class74.field792[2] & 0xFF));
                int var6 = (class74.field792[3] & 0xFF << 16) + (class74.field792[4] & 0xFF << 8) + (class74.field792[5] & 0xFF);
                if (var5 < 0 || var5 > this.field1510) {
                    return null;
                } else if (var6 > 0 && this.field1508.method1663(arg1 ^ 0x6836AD59) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1508.method1665(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1508.method1662(arg1 - 1748413248, var13 - -8, 0, class74.field792);
                        int var14 = ((class74.field792[0] & 0xFF) << 8) + (class74.field792[1] & 0xFF);
                        int var15 = ((class74.field792[2] & 0xFF) << 8) + (class74.field792[3] & 0xFF);
                        int var16 = (class74.field792[6] & 0xFF) + ((class74.field792[5] & 0xFF) << 8) + (class74.field792[4] & 0xFF << 16);
                        int var17 = class74.field792[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field1511 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field1508.method1663(1553) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class74.field792[var20 + 8];
                                }
                                var11++;
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    if (arg1 != 1748413256) {
                        this.toString();
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

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI[BZI)Z", line = 89)
    private final boolean method748(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1507++;
        class253 var6 = this.field1508;
        synchronized (this.field1508) {
            try {
                int var7;
                if (arg3) {
                    if ((long) (arg4 * 6 + 6) > this.field1514.method1663(1553)) {
                        return false;
                    }
                    this.field1514.method1665(0, (long) (arg4 * 6));
                    this.field1514.method1662(8, 6, 0, class74.field792);
                    var7 = (class74.field792[5] & 0xFF) + ((class74.field792[3] & 0xFF) << 16) + ((class74.field792[4] & 0xFF) << 8);
                    if (var7 <= 0 || (this.field1508.method1663(1553) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1508.method1663(1553) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class74.field792[4] = (byte) (var7 >> 8);
                class74.field792[1] = (byte) (arg1 >> 8);
                class74.field792[2] = (byte) arg1;
                class74.field792[5] = (byte) var7;
                class74.field792[0] = (byte) (arg1 >> 16);
                class74.field792[3] = (byte) (var7 >> 16);
                this.field1514.method1665(0, (long) (arg4 * 6));
                this.field1514.method1658(0, class74.field792, 0, 6);
                int var10 = 0;
                if (!arg0) {
                    field1512 = null;
                }
                int var11 = 0;
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field1508.method1665(0, (long) (var7 * 520));
                            try {
                                this.field1508.method1662(8, 8, 0, class74.field792);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class74.field792[0] & 0xFF << 8) + (class74.field792[1] & 0xFF);
                            var12 = ((class74.field792[4] & 0xFF) << 16) + (class74.field792[5] & 0xFF << 8) + (class74.field792[6] & 0xFF);
                            int var14 = (class74.field792[2] & 0xFF << 8) + (class74.field792[3] & 0xFF);
                            int var15 = class74.field792[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field1511 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1508.method1663(1553) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field1508.method1663(1553) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class74.field792[1] = (byte) arg4;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class74.field792[0] = (byte) (arg4 >> 8);
                    class74.field792[3] = (byte) var11;
                    class74.field792[2] = (byte) (var11 >> 8);
                    class74.field792[4] = (byte) (var12 >> 16);
                    class74.field792[7] = (byte) this.field1511;
                    class74.field792[5] = (byte) (var12 >> 8);
                    class74.field792[6] = (byte) var12;
                    this.field1508.method1665(0, (long) (var7 * 520));
                    this.field1508.method1658(0, class74.field792, 0, 8);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1508.method1658(0, arg2, var10, var18);
                    var7 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 208)
    public static void method749(int arg0) {
        field1505 = null;
        field1512 = null;
        if (arg0 != 65280) {
            field1506 = -15L;
        }
    }

    @OriginalMember(owner = "client!ls", name = "toString", descriptor = "()Ljava/lang/String;", line = 219)
    public final String toString() {
        field1515++;
        return "Cache:" + this.field1511;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILmu;Lmu;I)V", line = 282)
    public class121(int arg0, class253 arg1, class253 arg2, int arg3) {
        this.field1510 = arg3;
        this.field1514 = arg2;
        this.field1508 = arg1;
        this.field1511 = arg0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB[BI)Z", line = 245)
    public final boolean method750(int arg0, byte arg1, byte[] arg2, int arg3) {
        field1513++;
        class253 var5 = this.field1508;
        synchronized (this.field1508) {
            if (arg3 < 0 || arg3 > this.field1510) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method748(true, arg3, arg2, true, arg0);
            if (arg1 > -99) {
                return false;
            } else {
                if (!var6) {
                    var6 = this.method748(true, arg3, arg2, false, arg0);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V", line = 295)
    public static final void method751(int arg0) {
        class574.field8289 = new class293(8);
        field1509++;
        class297.field4396 = arg0;
        for (class211 var1 = (class211) class132.field1661.method3297((byte) 109); var1 != null; var1 = (class211) class132.field1661.method3296((byte) -115)) {
            var1.method1342();
        }
    }
}
