import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class129 {

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "[I")
    private int[] field2125 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "Lki;")
    public class709 field2127;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "[I")
    private int[] field2119;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "[S")
    private short[] field2117;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "[S")
    private short[] field2120;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "[S")
    private short[] field2123;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "[S")
    private short[] field2126;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)Z")
    public final boolean method1014(byte arg0) {
        field2128++;
        if (this.field2119 == null) {
            return true;
        }
        int var2 = 28 % ((53 - arg0) / 54);
        boolean var3 = true;
        class376 var4 = this.field2127.field9824;
        synchronized (this.field2127.field9824) {
            for (int var5 = 0; var5 < this.field2119.length; var5++) {
                if (!this.field2127.field9824.method2211(54, 0, this.field2119[var5])) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)Lur;")
    public final class538 method1015(int arg0) {
        field2124++;
        class538[] var2 = new class538[5];
        int var3 = 0;
        class376 var4 = this.field2127.field9824;
        synchronized (this.field2127.field9824) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2125[var5] != -1) {
                    var2[var3++] = class47.method333(0, this.field2127.field9824, -106, this.field2125[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7109 < 13) {
                var2[var6].method2982((byte) 1, 2);
            }
        }
        class538 var7 = new class538(var2, var3);
        if (arg0 <= 60) {
            this.field2126 = null;
        }
        if (this.field2117 != null) {
            for (int var8 = 0; var8 < this.field2117.length; var8++) {
                var7.method2994(this.field2126[var8], (byte) -119, this.field2117[var8]);
            }
        }
        if (this.field2120 != null) {
            for (int var9 = 0; var9 < this.field2120.length; var9++) {
                var7.method2996((byte) 124, this.field2120[var9], this.field2123[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lee;I)V")
    public final void method1016(class677 arg0, int arg1) {
        field2122++;
        if (arg1 != -1) {
            this.method1014((byte) 62);
        }
        while (true) {
            int var3 = arg0.method3821((byte) 105);
            if (var3 == 0) {
                return;
            }
            this.method1020(arg0, arg1 ^ 0x3C, var3);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1017(int arg0, int arg1, byte arg2) {
        field2129++;
        int var3 = -96 / ((arg2 - 73) / 52);
        return (arg0 & 0x70000) != 0 | class141.method1082(-117, arg1, arg0) || class705.method3965(arg0, (byte) -35, arg1);
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)Lur;")
    public final class538 method1018(int arg0) {
        field2121++;
        if (this.field2119 == null) {
            return null;
        }
        class538[] var2 = new class538[this.field2119.length];
        class376 var3 = this.field2127.field9824;
        synchronized (this.field2127.field9824) {
            int var4 = 51 / ((15 - arg0) / 35);
            int var5 = 0;
            while (true) {
                if (this.field2119.length <= var5) {
                    break;
                }
                var2[var5] = class47.method333(0, this.field2127.field9824, -106, this.field2119[var5]);
                var5++;
            }
        }
        for (int var6 = 0; var6 < this.field2119.length; var6++) {
            if (var2[var6].field7109 < 13) {
                var2[var6].method2982((byte) 1, 2);
            }
        }
        class538 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class538(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field2117 != null) {
            for (int var8 = 0; var8 < this.field2117.length; var8++) {
                var7.method2994(this.field2126[var8], (byte) -119, this.field2117[var8]);
            }
        }
        if (this.field2120 != null) {
            for (int var9 = 0; var9 < this.field2120.length; var9++) {
                var7.method2996((byte) 116, this.field2120[var9], this.field2123[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)Z")
    public final boolean method1019(byte arg0) {
        field2118++;
        if (arg0 != -123) {
            method1017(47, 111, (byte) -25);
        }
        boolean var2 = true;
        class376 var3 = this.field2127.field9824;
        synchronized (this.field2127.field9824) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2125[var4] != -1 && !this.field2127.field9824.method2211(96, 0, this.field2125[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lee;II)V")
    private final void method1020(class677 arg0, int arg1, int arg2) {
        field2130++;
        if (arg2 == 1) {
            arg0.method3821((byte) -73);
        } else if (arg2 == 2) {
            int var4 = arg0.method3821((byte) -85);
            this.field2119 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2119[var5] = arg0.method3807(-1);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var8 = arg0.method3821((byte) 76);
                this.field2117 = new short[var8];
                this.field2126 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2117[var9] = (short) arg0.method3807(-1);
                    this.field2126[var9] = (short) arg0.method3807(-1);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method3821((byte) 119);
                this.field2123 = new short[var6];
                this.field2120 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2120[var7] = (short) arg0.method3807(-1);
                    this.field2123[var7] = (short) arg0.method3807(arg1 + 60);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field2125[arg2 - 60] = arg0.method3807(-1);
            }
        }
        if (arg1 != -61) {
            this.field2127 = null;
        }
    }
}
