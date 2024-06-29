import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class107 extends class176 {

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public int field2049 = -1;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Z")
    public boolean field2058 = false;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    private int field2057 = 128;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    private int field2059 = 0;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field2060 = 0;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    private int field2065 = 0;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    private int field2067 = 128;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Lob;")
    public static class141 field2055 = class175.method1195(40, "::autoshadow on");

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "[[B")
    public static byte[][] field2068 = new byte[50][];

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Lkc;")
    public static class102 field2051;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "[I")
    public static int[] field2069;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "[S")
    private short[] field2052;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "[S")
    private short[] field2053;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "[S")
    private short[] field2070;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "[S")
    private short[] field2071;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILog;)V")
    public final void method707(int arg0, class146 arg1) {
        if (arg0 != 13737) {
            method712(53);
        }
        field2064++;
        while (true) {
            int var3 = arg1.method991(255);
            if (var3 == 0) {
                return;
            }
            this.method713(var3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Lfe;")
    public final class56 method708(int arg0, int arg1) {
        if (arg0 != 13557) {
            return null;
        }
        field2066++;
        class56 var3 = (class56) class46.field884.method1383((long) this.field2063, (byte) -97);
        if (var3 == null) {
            class23 var4 = class23.method149(class164.field3166, this.field2062, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2053 != null) {
                for (int var5 = 0; var5 < this.field2053.length; var5++) {
                    var4.method159(this.field2053[var5], this.field2071[var5]);
                }
            }
            if (this.field2052 != null) {
                for (int var6 = 0; var6 < this.field2052.length; var6++) {
                    var4.method147(this.field2052[var6], this.field2070[var6]);
                }
            }
            var3 = var4.method166(this.field2060 + 64, this.field2065 + 850, -30, -50, -30);
            class46.field884.method1378(var3, (byte) -43, (long) this.field2063);
        }
        class56 var7;
        if (this.field2049 == -1 || arg1 == -1) {
            var7 = var3.method381(true);
        } else {
            var7 = class114.method736(arg0 ^ 0x9F6, this.field2049).method186(var3, (byte) -121, arg1);
        }
        if (this.field2057 != 128 || this.field2067 != 128) {
            var7.method373(this.field2057, this.field2067, this.field2057);
        }
        if (this.field2059 != 0) {
            if (this.field2059 == 90) {
                var7.method379();
            }
            if (this.field2059 == 180) {
                var7.method382();
            }
            if (this.field2059 == 270) {
                var7.method374();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BIIZ)Lob;")
    public static final class141 method709(byte arg0, int arg1, int arg2, boolean arg3) {
        field2054++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = arg1 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg2;
        }
        int var6 = var5;
        if (arg1 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        int var8 = -120 / ((arg0 - 38) / 55);
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg1 % arg2;
            arg1 /= arg2;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var7[var6 - var9 - 1] = (byte) (var11 + 48);
        }
        class141 var10 = new class141();
        var10.field2701 = var7;
        var10.field2705 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BI)[B")
    public static final byte[] method710(byte[] arg0, int arg1) {
        field2050++;
        class146 var2 = new class146(arg0);
        int var3 = var2.method991(255);
        int var4 = var2.method979(1029109968);
        if (var4 < 0 || class54.field1082 != 0 && class54.field1082 < var4) {
            throw new RuntimeException();
        }
        if (arg1 <= 79) {
            field2069 = null;
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1001(var4, 0, 99, var5);
            return var5;
        }
        int var6 = var2.method979(1029109968);
        if (var6 < 0 || class54.field1082 != 0 && class54.field1082 < var6) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class171.method1181(var7, var6, arg0, var4, 9);
        } else {
            class63.field1228.method1444(var7, var2, (byte) 117);
        }
        return var7;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BB)Li;")
    public static final class80 method711(byte[] arg0, byte arg1) {
        field2048++;
        if (arg0 == null) {
            return null;
        }
        class80 var2 = new class80(arg0, class30.field581, class30.field578, class201.field3801, class114.field2186, class16.field291, class224.field4225);
        if (arg1 != 45) {
            field2051 = null;
        }
        class88.method601(-128);
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method712(int arg0) {
        field2068 = null;
        field2051 = null;
        field2055 = null;
        field2069 = null;
        if (arg0 >= -111) {
            method709((byte) -41, -22, 38, false);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILog;I)V")
    private final void method713(int arg0, class146 arg1, int arg2) {
        field2056++;
        if (arg0 == arg2) {
            this.field2062 = arg1.method1007(120);
        } else if (arg0 == 2) {
            this.field2049 = arg1.method1007(75);
        } else if (arg0 == 4) {
            this.field2057 = arg1.method1007(39);
        } else if (arg0 == 5) {
            this.field2067 = arg1.method1007(85);
        } else if (arg0 == 6) {
            this.field2059 = arg1.method1007(arg2 + 69);
        } else if (arg0 == 7) {
            this.field2060 = arg1.method991(arg2 ^ 0xFE);
        } else if (arg0 == 8) {
            this.field2065 = arg1.method991(255);
        } else if (arg0 == 9) {
            this.field2058 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method991(255);
            this.field2053 = new short[var6];
            this.field2071 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2053[var7] = (short) arg1.method1007(126);
                this.field2071[var7] = (short) arg1.method1007(113);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method991(255);
            this.field2052 = new short[var4];
            this.field2070 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2052[var5] = (short) arg1.method1007(53);
                this.field2070[var5] = (short) arg1.method1007(107);
            }
            return;
        }
    }
}
