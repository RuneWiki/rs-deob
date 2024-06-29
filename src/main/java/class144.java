import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class144 implements Runnable {

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Liw;")
    private class334 field1933 = new class76();

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Liw;")
    private class334 field1945 = null;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    public static int[] field1923 = new int[1];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "J")
    private long field1943;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "J")
    private long field1947;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lida;")
    private class249 field1946;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Ljava/lang/String;")
    private String field1942;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
    private volatile boolean field1928;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
    private boolean field1932;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
    public final int method999(int arg0) {
        field1925++;
        if (arg0 != -1) {
            this.method1009(-35);
        }
        return this.field1941;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Z")
    public final synchronized boolean method1000(byte arg0) {
        field1934++;
        return arg0 > -16 ? true : this.field1933.method309((byte) -115, this.field1943);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILcc;[[B)V")
    public static final void method1001(int arg0, class760 arg1, byte[][] arg2) {
        field1930++;
        int var3 = class754.field10206.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class649.field8753[var4] >> 8) * 64 - class120.field1625;
                int var7 = (class649.field8753[var4] & 0xFF) * 64 - class259.field3849;
                class324.method2095(-99);
                arg1.method4189(var5, var6, 1, class257.field3830, var7, class375.field5490);
            }
        }
        if (arg0 > -4) {
            field1923 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public final synchronized void method1002(int arg0) {
        field1936++;
        this.field1932 = true;
        if (arg0 <= 40) {
            this.method1002(-84);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILiw;)V")
    public final synchronized void method1003(int arg0, class334 arg1) {
        this.field1945 = this.field1933;
        field1931++;
        int var3 = -47 % ((arg0 - 66) / 52);
        this.field1933 = arg1;
        this.field1943 = class401.method2440(false);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)I")
    public final int method1004(int arg0) {
        field1937++;
        if (this.field1946 == null) {
            return 0;
        }
        int var2 = this.field1946.method1558((byte) 111);
        if (this.field1946.field3271 && this.field1941 < this.field1946.field3264) {
            return this.field1941 + 1;
        } else if (var2 >= 0 && class170.field2232.length - 1 > var2) {
            int var3 = -123 % ((46 - arg0) / 48);
            return this.field1946.field3269 == this.field1941 ? this.field1946.field3264 : this.field1946.field3269;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(CI)Z")
    public static final boolean method1005(char arg0, int arg1) {
        if (arg1 <= 11) {
            return true;
        } else {
            field1927++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1928) {
            long var1 = class401.method2440(false);
            synchronized (this) {
                try {
                    this.field1944++;
                    if (this.field1933 instanceof class76) {
                        this.field1933.method313(this.field1932, (byte) 2);
                    } else {
                        long var4 = class401.method2440(false);
                        if (class375.field5490 == null || this.field1945 == null || this.field1945.method311((byte) 14) == 0 || this.field1943 < var4 - (long) this.field1945.method311((byte) 14)) {
                            if (this.field1945 != null) {
                                this.field1932 = true;
                                this.field1945.method307(8883);
                                this.field1945 = null;
                            }
                            if (this.field1932) {
                                class555.method3188(-32479);
                                if (class375.field5490 != null) {
                                    class375.field5490.method493(0);
                                }
                            }
                            this.field1933.method313(this.field1932 || class375.field5490 != null && class375.field5490.method450(), (byte) 2);
                        } else {
                            int var6 = (int) ((var4 - this.field1943) * 255L / (long) this.field1945.method311((byte) 14));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class555.method3188(-32479);
                            class375.field5490.method493(0);
                            class140 var10 = class375.field5490.method488(class460.field6558, class693.field9222, true);
                            class375.field5490.method452(-63, var10);
                            this.field1945.method313(true, (byte) 2);
                            class375.field5490.method514();
                            var10.method358(0, 0, 0, var9, 1);
                            class375.field5490.method452(-62, var10);
                            class375.field5490.method493(0);
                            this.field1933.method313(true, (byte) 2);
                            class375.field5490.method514();
                            var10.method358(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class375.field5490 != null && !(this.field1933 instanceof class76)) {
                                class375.field5490.method483(false);
                            }
                        } catch (class283 var18) {
                            class607.method3379(var18.getMessage() + " (Recovered) " + class723.field9821.method2031(-31064), var18, true);
                            class399.method2434(true, (byte) 123, 0);
                        }
                    }
                    Container var12;
                    if (class639.field8606 != null) {
                        var12 = class639.field8606;
                    } else if (class552.field7624 == null) {
                        var12 = class468.field6609;
                    } else {
                        var12 = class552.field7624;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class639.field8606 == var12) {
                        class639.field8606.getInsets();
                    }
                    this.field1932 = false;
                    if (class375.field5490 != null && !(this.field1933 instanceof class76) && this.field1946.method1558((byte) 114) < class249.field3291.method1558((byte) 107)) {
                        class642.method3535(-1);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class401.method2440(false);
            int var15 = (int) (var1 - (var13 - 20L));
            if (var15 > 0) {
                class171.method1152((long) var15, false);
            }
        }
        field1940++;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)Lida;")
    public final class249 method1006(int arg0) {
        field1935++;
        if (arg0 < 41) {
            field1923 = null;
        }
        return this.field1946;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field1923 = null;
        if (arg0 != -3670) {
            field1923 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1008(int arg0) {
        if (arg0 > -24) {
            this.method1008(-55);
        }
        field1929++;
        return this.field1942;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)I")
    public final int method1009(int arg0) {
        field1938++;
        return arg0 == 19684 ? this.field1944 : -7;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILjava/lang/String;JLida;)V")
    public final synchronized void method1010(byte arg0, int arg1, String arg2, long arg3, class249 arg4) {
        int var7 = -84 / ((-arg0 - 75) / 43);
        field1939++;
        this.field1942 = arg2;
        this.field1947 = arg3;
        this.field1946 = arg4;
        this.field1941 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public final void method1011(boolean arg0) {
        this.field1928 = arg0;
        field1926++;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)J")
    public final long method1012(int arg0) {
        field1924++;
        if (arg0 != 16777215) {
            this.method1006(-10);
        }
        return this.field1947;
    }
}
