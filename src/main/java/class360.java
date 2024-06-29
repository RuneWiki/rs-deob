import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class360 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Z")
    public boolean field5252 = false;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field5263 = -1;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
    private int[] field5261 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lfi;")
    public static class331 field5262 = new class331(30);

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lfi;")
    public static class331 field5269 = new class331(64);

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field5270 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
    private int[] field5260;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[S")
    private short[] field5254;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[S")
    private short[] field5257;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[S")
    private short[] field5264;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[S")
    private short[] field5265;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLbk;)V")
    private final void method2292(int arg0, byte arg1, class211 arg2) {
        if (arg0 == 1) {
            this.field5263 = arg2.method1342((byte) -126);
        } else if (arg0 == 2) {
            int var8 = arg2.method1342((byte) -128);
            this.field5260 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5260[var9] = arg2.method1355(32136);
            }
        } else if (arg0 == 3) {
            this.field5252 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1342((byte) -127);
            this.field5265 = new short[var4];
            this.field5254 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5254[var5] = (short) arg2.method1355(32136);
                this.field5265[var5] = (short) arg2.method1355(32136);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1342((byte) -128);
            this.field5264 = new short[var6];
            this.field5257 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5257[var7] = (short) arg2.method1355(32136);
                this.field5264[var7] = (short) arg2.method1355(32136);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field5261[arg0 - 60] = arg2.method1355(32136);
        }
        field5268++;
        int var10 = -125 % ((48 - arg1) / 53);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)La;")
    public static final class367 method2293(int arg0, byte arg1) {
        field5249++;
        class367 var2 = (class367) class26.field254.method2049(-62, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class157.field2233.method361(30, 100, arg0);
        class367 var4 = new class367();
        if (var3 != null) {
            var4.method2319(arg0, false, new class211(var3));
        }
        class26.field254.method2046((long) arg0, 0, var4);
        int var5 = -55 / ((arg1 + 19) / 61);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
    public final boolean method2294(int arg0) {
        field5251++;
        boolean var2 = true;
        class57 var3 = class447.field6519;
        synchronized (class447.field6519) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field5261[var4] != -1 && !class447.field6519.method355(0, this.field5261[var4], -4013)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z")
    public final boolean method2295(int arg0) {
        field5250++;
        if (this.field5260 == null) {
            return true;
        }
        boolean var2 = true;
        class57 var3 = class447.field6519;
        synchronized (class447.field6519) {
            for (int var4 = 0; var4 < this.field5260.length; var4++) {
                if (!class447.field6519.method355(0, this.field5260[var4], -4013)) {
                    var2 = false;
                }
            }
            if (arg0 != -7745) {
                this.method2292(-27, (byte) 14, (class211) null);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Loq;")
    public final class200 method2296(int arg0) {
        field5267++;
        class200[] var2 = new class200[5];
        int var3 = 0;
        class57 var4 = class447.field6519;
        synchronized (class447.field6519) {
            if (arg0 != -1) {
                return null;
            }
            for (int var6 = 0; var6 < 5; var6++) {
                if (this.field5261[var6] != -1) {
                    var2[var3++] = class38.method227(this.field5261[var6], class447.field6519, 0, false);
                }
            }
        }
        class200 var7 = new class200(var2, var3);
        if (this.field5254 != null) {
            for (int var8 = 0; var8 < this.field5254.length; var8++) {
                var7.method1286((byte) -116, this.field5265[var8], this.field5254[var8]);
            }
        }
        if (this.field5257 != null) {
            for (int var9 = 0; var9 < this.field5257.length; var9++) {
                var7.method1277(this.field5257[var9], (byte) 42, this.field5264[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILbk;)V")
    public final void method2297(int arg0, class211 arg1) {
        while (true) {
            int var3 = arg1.method1342((byte) -126);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.method2302(-23);
                }
                field5266++;
                return;
            }
            this.method2292(var3, (byte) 104, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2298(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5255++;
        if (class143.field2029 <= arg6 && class128.field1785 >= arg3 && arg1 >= class20.field209 && class407.field5914 >= arg5) {
            if (arg2 == 1) {
                class175.method1157(arg5, arg6, 123, arg4, arg1, arg3);
            } else {
                class307.method1924(arg4, arg2, arg6, arg1, arg3, 34, arg5);
            }
        } else if (arg2 == 1) {
            class440.method2733(arg6, 121, arg1, arg5, arg3, arg4);
        } else {
            class301.method1900(arg4, arg3, -127, arg5, arg1, arg6, arg2);
        }
        int var7 = -20 % ((arg0 + 47) / 35);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public static final void method2299(int arg0, int arg1) {
        field5259++;
        class348 var2 = class385.method2464(12, arg1 - 17556, arg0);
        var2.method2214((byte) 121);
        if (arg1 != 18858) {
            method2303(-28);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZLjf;)V")
    public static final void method2300(int arg0, int arg1, boolean arg2, class119 arg3) {
        field5258++;
        if (class193.field2632 != null || class81.field903 || arg3 == null || class144.method847(-19393, arg3) == null) {
            return;
        }
        class193.field2632 = arg3;
        class382.field5600 = class144.method847(-19393, arg3);
        class388.field5682 = arg1;
        class383.field5619 = arg0;
        if (!arg2) {
            field5270 = -77;
        }
        class397.field5786 = 0;
        class173.field2409 = false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Lnn;")
    public static final class239 method2301(byte arg0) {
        field5256++;
        try {
            if (arg0 >= -58) {
                field5262 = null;
            }
            return (class239) Class.forName("sk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Loq;")
    public final class200 method2302(int arg0) {
        field5253++;
        if (this.field5260 == null) {
            return null;
        }
        class200[] var2 = new class200[this.field5260.length];
        class57 var3 = class447.field6519;
        synchronized (class447.field6519) {
            int var4 = arg0;
            while (true) {
                if (var4 >= this.field5260.length) {
                    break;
                }
                var2[var4] = class38.method227(this.field5260[var4], class447.field6519, 0, false);
                var4++;
            }
        }
        class200 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class200(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field5254 != null) {
            for (int var6 = 0; var6 < this.field5254.length; var6++) {
                var5.method1286((byte) -116, this.field5265[var6], this.field5254[var6]);
            }
        }
        if (this.field5257 != null) {
            for (int var7 = 0; var7 < this.field5257.length; var7++) {
                var5.method1277(this.field5257[var7], (byte) 124, this.field5264[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public static void method2303(int arg0) {
        int var1 = 40 % ((arg0 + 40) / 50);
        field5262 = null;
        field5269 = null;
    }
}
