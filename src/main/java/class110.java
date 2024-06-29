import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class110 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    private int field1716 = 65000;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lkk;")
    private class63 field1719 = null;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lkk;")
    private class63 field1730 = null;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1710 = 0;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lth;")
    public static class121 field1712 = class50.method281(5);

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field1726 = 0;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Luf;")
    public static class168 field1729 = class148.method1019(-1720, "Hidden)2");

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Luf;")
    public static class168 field1728 = class148.method1019(-1720, "(U4");

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Ldk;")
    public static class241 field1722;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 5)
    public static void method814(int arg0) {
        if (arg0 != 1439) {
            field1725 = 7;
        }
        field1722 = null;
        field1712 = null;
        field1729 = null;
        field1728 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BZI)Z", line = 18)
    private final boolean method815(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field1720++;
        class63 var6 = this.field1719;
        synchronized (this.field1719) {
            boolean var10000;
            try {
                int var7;
                if (arg3) {
                    if (this.field1730.method356(32) < ((long) (arg1 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1730.method358((long) (arg1 * 6), -69);
                    this.field1730.method359(class125.field1927, 6, (byte) 69, 0);
                    var7 = (class125.field1927[5] & 0xFF) + ((class125.field1927[3] & 0xFF) << 16) + (class125.field1927[4] & 0xFF << 8);
                    if (var7 <= 0 || (long) var7 > this.field1719.method356(32) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1719.method356(32) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class125.field1927[0] = (byte) (arg4 >> 16);
                int var8 = 0;
                class125.field1927[3] = (byte) (var7 >> 16);
                class125.field1927[2] = (byte) arg4;
                class125.field1927[5] = (byte) var7;
                class125.field1927[1] = (byte) (arg4 >> 8);
                class125.field1927[4] = (byte) (var7 >> 8);
                this.field1730.method358((long) (arg0 * arg1), -74);
                int var9 = 0;
                this.field1730.method353(class125.field1927, 0, 6, arg0 - 7);
                while (arg4 > var8) {
                    int var10 = 0;
                    if (arg3) {
                        this.field1719.method358((long) (var7 * 520), -75);
                        try {
                            this.field1719.method359(class125.field1927, 8, (byte) 91, 0);
                        } catch (EOFException var18) {
                            break;
                        }
                        var10 = (class125.field1927[6] & 0xFF) + (((class125.field1927[4] & 0xFF) << 16) + ((class125.field1927[5] & 0xFF) << 8));
                        int var12 = ((class125.field1927[0] & 0xFF) << 8) + (class125.field1927[1] & 0xFF);
                        int var13 = (class125.field1927[2] & 0xFF << 8) + (class125.field1927[3] & 0xFF);
                        int var14 = class125.field1927[7] & 0xFF;
                        if (arg1 != var12 || var9 != var13 || this.field1717 != var14) {
                            var10000 = false;
                            return var10000;
                        }
                        if (var10 < 0 || (this.field1719.method356(32) / 520L) < ((long) var10)) {
                            var10000 = false;
                            return var10000;
                        }
                    }
                    if (var10 == 0) {
                        arg3 = false;
                        var10 = (int) ((this.field1719.method356(32) + 519L) / 520L);
                        if (var10 == 0) {
                            var10++;
                        }
                        if (var7 == var10) {
                            var10++;
                        }
                    }
                    class125.field1927[1] = (byte) arg1;
                    class125.field1927[2] = (byte) (var9 >> 8);
                    class125.field1927[0] = (byte) (arg1 >> 8);
                    int var15 = arg4 - var8;
                    if (var15 > 512) {
                        var15 = 512;
                    }
                    if (arg4 - var8 <= 512) {
                        var10 = 0;
                    }
                    class125.field1927[6] = (byte) var10;
                    class125.field1927[3] = (byte) var9;
                    var9++;
                    class125.field1927[5] = (byte) (var10 >> 8);
                    class125.field1927[7] = (byte) this.field1717;
                    class125.field1927[4] = (byte) (var10 >> 16);
                    this.field1719.method358((long) (var7 * 520), -68);
                    this.field1719.method353(class125.field1927, 0, 8, -1);
                    this.field1719.method353(arg2, var8, var15, -1);
                    var8 += var15;
                    var7 = var10;
                }
                var10000 = true;
            } catch (IOException var19) {
                return false;
            }
            return var10000;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V", line = 141)
    public static final void method816(int arg0, byte arg1) {
        if (arg1 != -45) {
            field1722 = (class241) null;
        }
        class261.field4427.method1428(arg0, arg1 + 29991);
        class39.field485.method1428(arg0, 29946);
        class64.field856.method1428(arg0, 29946);
        field1711++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[B", line = 159)
    public final byte[] method817(int arg0, boolean arg1) {
        field1721++;
        class63 var3 = this.field1719;
        synchronized (this.field1719) {
            try {
                Object var10000;
                if ((long) (arg0 * 6 + 6) > this.field1730.method356(32)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1730.method358((long) (arg0 * 6), -70);
                this.field1730.method359(class125.field1927, 6, (byte) 109, 0);
                int var4 = (class125.field1927[2] & 0xFF) + (class125.field1927[0] & 0xFF << 16) + (class125.field1927[1] & 0xFF << 8);
                int var5 = ((class125.field1927[3] & 0xFF) << 16) + (class125.field1927[4] & 0xFF << 8) + (class125.field1927[5] & 0xFF);
                if (var4 < 0 || this.field1716 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (this.field1719.method356(32) / 520L) < ((long) var5)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var6 = 0;
                    byte[] var7 = new byte[var4];
                    if (arg1) {
                        field1710 = -59;
                    }
                    int var8 = 0;
                    while (var4 > var6) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var6;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1719.method358((long) (var5 * 520), -99);
                        this.field1719.method359(class125.field1927, var9 + 8, (byte) 127, 0);
                        int var10 = (class125.field1927[2] & 0xFF << 8) + (class125.field1927[3] & 0xFF);
                        int var11 = (class125.field1927[0] & 0xFF << 8) + (class125.field1927[1] & 0xFF);
                        int var12 = (class125.field1927[6] & 0xFF) + ((class125.field1927[5] & 0xFF) << 8) + ((class125.field1927[4] & 0xFF) << 16);
                        int var13 = class125.field1927[7] & 0xFF;
                        if (arg0 != var11 || var8 != var10 || this.field1717 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || (long) var12 > this.field1719.method356(32) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var5 = var12;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var7[var6++] = class125.field1927[var14 + 8];
                        }
                        var8++;
                    }
                    byte[] var19 = var7;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 240)
    public static final void method818(int arg0) {
        class249.field4254 = (byte[][][]) null;
        class207.field3400 = (short[][][]) null;
        field1713++;
        class207.field3401 = null;
        class127.field1978 = 0;
        class177.field2867 = (int[][][]) null;
        class77.field1045 = null;
        class115.field1790 = null;
        class5.field66 = (byte[][][]) null;
        class209.field3459 = (byte[][][]) null;
        class63.field832 = (int[][][]) null;
        class125.field1931 = (byte[][][]) null;
        if (arg0 != -1445985368) {
            field1710 = 65;
        }
        class200.field3299 = (byte[][][]) null;
        class113.field1757.method453(255);
        class299.field5066 = null;
        class247.field4237 = null;
        class214.field3492 = null;
        class201.field3315 = null;
        class213.field3477 = null;
        class211.field3474 = null;
        class157.field2476 = null;
        class136.field2115 = null;
        class187.field2963 = null;
        class118.field1842 = null;
        class96.field1530 = null;
    }

    @OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;", line = 276)
    public final String toString() {
        field1718++;
        return "Cache:" + this.field1717;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLj;)Lla;", line = 285)
    public static final class175 method819(byte arg0, class153 arg1) {
        field1724++;
        class175 var2 = new class175(arg1.method1075(50), arg1.method1075(66), arg1.method1069(57), arg1.method1069(55), arg1.method1089((byte) -14), arg1.method1042((byte) -103) == 1);
        int var3 = arg1.method1042((byte) -121);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field2842.method451(-91453648, new class123(arg1.method1069(84), arg1.method1069(117), arg1.method1069(107), arg1.method1069(48)));
        }
        var2.method1261(false);
        int var5 = 107 % ((arg0 - 38) / 51);
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BI)Z", line = 311)
    public final boolean method820(int arg0, int arg1, byte[] arg2, int arg3) {
        field1715++;
        if (arg1 != -23600) {
            return true;
        }
        class63 var5 = this.field1719;
        synchronized (this.field1719) {
            if (arg3 < 0 || arg3 > this.field1716) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method815(arg1 + 23606, arg0, arg2, true, arg3);
            if (!var6) {
                var6 = this.method815(6, arg0, arg2, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(ILkk;Lkk;I)V", line = 390)
    public class110(int arg0, class63 arg1, class63 arg2, int arg3) {
        this.field1719 = arg1;
        this.field1717 = arg0;
        this.field1730 = arg2;
        this.field1716 = arg3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 367)
    public static final void method821(byte arg0) {
        field1709++;
        int var1 = -52 % ((arg0 - 10) / 46);
        class103.field1604.method1429((byte) 120);
    }
}
