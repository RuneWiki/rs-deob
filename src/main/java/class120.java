import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class120 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    private int field1514 = 65000;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lvv;")
    private class640 field1521 = null;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lvv;")
    private class640 field1522 = null;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method656(int arg0, byte arg1, int arg2, String[] arg3) {
        field1516++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var12 = arg3[var7];
                if (var12 == null) {
                    var6 += 4;
                } else {
                    var6 += var12.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            int var9 = arg0;
            int var10 = -87 / ((arg1 + 9) / 40);
            while (var9 < var5) {
                String var11 = arg3[var9];
                if (var11 == null) {
                    var8.append("null");
                } else {
                    var8.append(var11);
                }
                var9++;
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)I")
    public static final int method657(int arg0, int arg1, int arg2) {
        field1517++;
        if (arg0 < 17) {
            return -55;
        } else if (arg1 == 1 || arg1 == 3) {
            return class90.field1223[arg2 & 0x3];
        } else {
            return class165.field2089[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!km", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1524++;
        return "Cache:" + this.field1523;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BII)Z")
    public final boolean method658(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 22996) {
            return true;
        }
        field1520++;
        class640 var5 = this.field1522;
        synchronized (this.field1522) {
            if (arg3 < 0 || arg3 > this.field1514) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method659(true, arg1, arg3, arg2, 80);
            if (!var6) {
                var6 = this.method659(false, arg1, arg3, arg2, 80);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z[BIII)Z")
    private final boolean method659(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field1518++;
        class640 var6 = this.field1522;
        synchronized (this.field1522) {
            try {
                int var7;
                if (arg0) {
                    if (this.field1521.method3693((byte) 63) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field1521.method3685(1456, (long) (arg3 * 6));
                    this.field1521.method3692(0, class599.field8657, (byte) 75, 6);
                    var7 = (class599.field8657[5] & 0xFF) + ((class599.field8657[3] & 0xFF) << 16) + (class599.field8657[4] & 0xFF << 8);
                    if (var7 <= 0 || (long) var7 > this.field1522.method3693((byte) 63) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1522.method3693((byte) 63) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class599.field8657[5] = (byte) var7;
                if (arg4 < 27) {
                    return true;
                }
                class599.field8657[1] = (byte) (arg2 >> 8);
                class599.field8657[3] = (byte) (var7 >> 16);
                class599.field8657[4] = (byte) (var7 >> 8);
                class599.field8657[0] = (byte) (arg2 >> 16);
                class599.field8657[2] = (byte) arg2;
                this.field1521.method3685(1456, (long) (arg3 * 6));
                this.field1521.method3694((byte) 124, class599.field8657, 0, 6);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg2) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field1522.method3685(1456, (long) (var7 * 520));
                            try {
                                this.field1522.method3692(0, class599.field8657, (byte) 75, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class599.field8657[0] & 0xFF << 8) + (class599.field8657[1] & 0xFF);
                            int var15 = ((class599.field8657[2] & 0xFF) << 8) + (class599.field8657[3] & 0xFF);
                            var13 = (class599.field8657[6] & 0xFF) + ((class599.field8657[4] & 0xFF) << 16) + (class599.field8657[5] & 0xFF << 8);
                            int var16 = class599.field8657[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field1523 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field1522.method3693((byte) 63) / 520L)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field1522.method3693((byte) 63) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    class599.field8657[1] = (byte) arg3;
                    class599.field8657[0] = (byte) (arg3 >> 8);
                    class599.field8657[3] = (byte) var12;
                    class599.field8657[2] = (byte) (var12 >> 8);
                    class599.field8657[6] = (byte) var13;
                    class599.field8657[4] = (byte) (var13 >> 16);
                    class599.field8657[5] = (byte) (var13 >> 8);
                    class599.field8657[7] = (byte) this.field1523;
                    this.field1522.method3685(1456, (long) (var7 * 520));
                    this.field1522.method3694((byte) 125, class599.field8657, 0, 8);
                    int var19 = arg2 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1522.method3694((byte) 122, arg1, var11, var19);
                    var7 = var13;
                    var12++;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[B")
    public final byte[] method660(int arg0, int arg1) {
        field1525++;
        class640 var3 = this.field1522;
        synchronized (this.field1522) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1521.method3693((byte) 63)) {
                    return null;
                }
                this.field1521.method3685(1456, (long) (arg1 * 6));
                this.field1521.method3692(0, class599.field8657, (byte) 75, 6);
                int var5 = ((class599.field8657[0] & 0xFF) << 16) + (class599.field8657[1] & 0xFF << 8) + (class599.field8657[2] & 0xFF);
                int var6 = (class599.field8657[4] & 0xFF << 8) + (((class599.field8657[3] & 0xFF) << 16) + (class599.field8657[5] & 0xFF));
                if (var5 < 0 || var5 > this.field1514) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1522.method3693((byte) 63) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 >= -8) {
                        return null;
                    }
                    int var12 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1522.method3685(1456, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1522.method3692(0, class599.field8657, (byte) 75, var14 + 8);
                        int var15 = ((class599.field8657[0] & 0xFF) << 8) + (class599.field8657[1] & 0xFF);
                        int var16 = (class599.field8657[2] & 0xFF << 8) + (class599.field8657[3] & 0xFF);
                        int var17 = ((class599.field8657[4] & 0xFF) << 16) + (class599.field8657[5] & 0xFF << 8) + (class599.field8657[6] & 0xFF);
                        int var18 = class599.field8657[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field1523 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field1522.method3693((byte) 63) / 520L)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class599.field8657[var21 + 8];
                                }
                                var12++;
                                var6 = var17;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(ILvv;Lvv;I)V")
    public class120(int arg0, class640 arg1, class640 arg2, int arg3) {
        this.field1521 = arg2;
        this.field1514 = arg3;
        this.field1522 = arg1;
        this.field1523 = arg0;
    }
}
