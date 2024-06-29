import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class65 extends class176 {

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "[I")
    private int[] field1257 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Z")
    public boolean field1262 = false;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public int field1254 = -1;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lob;")
    public static class141 field1259 = class175.method1195(40, "Hierhin gehen");

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lob;")
    public static class141 field1268 = class175.method1195(40, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
    private int[] field1249;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[S")
    private short[] field1247;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "[S")
    private short[] field1252;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "[S")
    private short[] field1258;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "[S")
    private short[] field1263;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)Z")
    public final boolean method428(int arg0) {
        field1265++;
        boolean var2 = true;
        if (arg0 <= 5) {
            this.field1247 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1257[var3] != -1 && !class160.field3111.method1080((byte) 63, this.field1257[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILra;)Lra;")
    public static final class170 method429(int arg0, class170 arg1) {
        int var2 = class161.method1125(class26.method180(arg1, 18125), -114);
        field1260++;
        if (~var2 == arg0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class192.method1268(arg1.field3400, arg0 ^ 0x41);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lob;Lob;ISJII)V")
    public static final void method430(class141 arg0, class141 arg1, int arg2, short arg3, long arg4, int arg5, int arg6) {
        field1261++;
        if (class114.field2180) {
            return;
        }
        if (arg2 != 0) {
            field1268 = null;
        }
        if (class188.field3637 >= 500) {
            return;
        }
        class22.field396[class188.field3637] = arg1;
        class223.field4210[class188.field3637] = arg0;
        class157.field3026[class188.field3637] = arg3;
        class161.field3123[class188.field3637] = arg4;
        class6.field76[class188.field3637] = arg5;
        class133.field2529[class188.field3637] = arg6;
        class188.field3637++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lpe;B)V")
    public static final void method431(class154 arg0, byte arg1) {
        field1267++;
        class100.field1956 = arg0;
        if (arg1 <= 64) {
            field1259 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)I")
    public static final int method432(int arg0, int arg1, int arg2) {
        field1264++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (arg0 != 41) {
                field1268 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
    public final boolean method433(boolean arg0) {
        if (arg0) {
            this.field1263 = null;
        }
        field1255++;
        if (this.field1249 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1249.length; var3++) {
            if (!class160.field3111.method1080((byte) 83, this.field1249[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lcb;")
    public final class23 method434(byte arg0) {
        field1256++;
        class23[] var2 = new class23[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1257[var4] != -1) {
                var2[var3++] = class23.method149(class160.field3111, this.field1257[var4], 0);
            }
        }
        if (arg0 > -62) {
            return null;
        }
        class23 var5 = new class23(var2, var3);
        if (this.field1252 != null) {
            for (int var6 = 0; var6 < this.field1252.length; var6++) {
                var5.method159(this.field1252[var6], this.field1258[var6]);
            }
        }
        if (this.field1263 != null) {
            for (int var7 = 0; var7 < this.field1263.length; var7++) {
                var5.method147(this.field1263[var7], this.field1247[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Lcb;")
    public final class23 method435(int arg0) {
        field1266++;
        if (this.field1249 == null) {
            return null;
        }
        class23[] var2 = new class23[this.field1249.length];
        if (arg0 != -19400) {
            this.method435(-54);
        }
        for (int var3 = 0; var3 < this.field1249.length; var3++) {
            var2[var3] = class23.method149(class160.field3111, this.field1249[var3], 0);
        }
        class23 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class23(var2, var2.length);
        }
        if (this.field1252 != null) {
            for (int var5 = 0; var5 < this.field1252.length; var5++) {
                var4.method159(this.field1252[var5], this.field1258[var5]);
            }
        }
        if (this.field1263 != null) {
            for (int var6 = 0; var6 < this.field1263.length; var6++) {
                var4.method147(this.field1263[var6], this.field1247[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLra;)Lra;")
    public static final class170 method436(byte arg0, class170 arg1) {
        int var2 = -116 / ((arg0 + 35) / 57);
        field1253++;
        class170 var3 = method429(-1, arg1);
        if (var3 == null) {
            var3 = arg1.field3276;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public static void method437(int arg0) {
        field1259 = null;
        field1268 = null;
        if (arg0 < 93) {
            method429(31, null);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Log;B)V")
    public final void method438(class146 arg0, byte arg1) {
        field1250++;
        if (arg1 > -66) {
            method429(52, null);
        }
        while (true) {
            int var3 = arg0.method991(255);
            if (var3 == 0) {
                return;
            }
            this.method440(arg0, var3, -90);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
    public static final void method439(int arg0, int arg1) {
        if (arg1 != -12885) {
            method431(null, (byte) -116);
        }
        field1248++;
        class111.field2127 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Log;II)V")
    private final void method440(class146 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1254 = arg0.method991(255);
        } else if (arg1 == 2) {
            int var4 = arg0.method991(255);
            this.field1249 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1249[var5] = arg0.method1007(47);
            }
        } else if (arg1 == 3) {
            this.field1262 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method991(255);
            this.field1258 = new short[var8];
            this.field1252 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1252[var9] = (short) arg0.method1007(112);
                this.field1258[var9] = (short) arg0.method1007(116);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method991(255);
            this.field1263 = new short[var6];
            this.field1247 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1263[var7] = (short) arg0.method1007(72);
                this.field1247[var7] = (short) arg0.method1007(101);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1257[arg1 - 60] = arg0.method1007(60);
        }
        field1251++;
        int var10 = 92 % ((26 - arg2) / 59);
    }
}
