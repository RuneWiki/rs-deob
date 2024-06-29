import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class155 implements Runnable {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Llm;")
    private class502 field2112 = new class500();

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Llm;")
    private class502 field2126 = null;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "Lpfa;")
    public static class299 field2108 = new class299();

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "J")
    private long field2125;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "J")
    private long field2131;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "Lcaa;")
    private class306 field2124;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "Lnd;")
    public static class547 field2129;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/lang/String;")
    private String field2128;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
    private boolean field2115;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "Z")
    private volatile boolean field2122;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)J")
    public final long method1079(byte arg0) {
        field2116++;
        if (arg0 < 63) {
            this.method1086((byte) -96);
        }
        return this.field2131;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)I")
    public final int method1080(byte arg0) {
        int var2 = 5 / ((-arg0 - 24) / 54);
        field2119++;
        return this.field2127;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Lcaa;")
    public final class306 method1081(int arg0) {
        field2107++;
        if (arg0 != -1512726696) {
            this.method1090(100);
        }
        return this.field2124;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
    public static void method1082(int arg0) {
        if (arg0 != 16777215) {
            method1082(74);
        }
        field2129 = null;
        field2108 = null;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
    public final int method1083(int arg0) {
        field2123++;
        if (this.field2124 == null) {
            return 0;
        }
        int var2 = this.field2124.method1844(arg0 ^ 0xFFFF90BB);
        if (arg0 != -28490) {
            this.method1089(-99);
        }
        if (this.field2124.field4017 && this.field2127 < this.field2124.field4009) {
            return this.field2127 + 1;
        } else if (var2 >= 0 && var2 < class400.field5095.length - 1) {
            return this.field2124.field4012 == this.field2127 ? this.field2124.field4009 : this.field2124.field4012;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
    public final synchronized boolean method1084(boolean arg0) {
        if (arg0) {
            field2114++;
            return this.field2112.method1937(87, this.field2125);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(JLcaa;ILjava/lang/String;I)V")
    public final synchronized void method1085(long arg0, class306 arg1, int arg2, String arg3, int arg4) {
        this.field2131 = arg0;
        field2109++;
        if (arg4 == 9577) {
            this.field2124 = arg1;
            this.field2127 = arg2;
            this.field2128 = arg3;
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method1086(byte arg0) {
        field2120++;
        if (arg0 <= 40) {
            this.method1083(12);
        }
        return this.field2128;
    }

    @OriginalMember(owner = "client!as", name = "run", descriptor = "()V")
    public final void run() {
        field2113++;
        while (!this.field2122) {
            long var1 = class446.method2525(500);
            synchronized (this) {
                try {
                    this.field2130++;
                    if (this.field2112 instanceof class500) {
                        this.field2112.method1935(-127, this.field2115);
                    } else {
                        long var4 = class446.method2525(500);
                        if (class386.field4930 == null || this.field2126 == null || this.field2126.method1936(45) == 0 || this.field2125 < var4 - ((long) this.field2126.method1936(44))) {
                            if (this.field2126 != null) {
                                this.field2115 = true;
                                this.field2126.method1941(30861);
                                this.field2126 = null;
                            }
                            if (this.field2115) {
                                class759.method4224(0);
                                if (class386.field4930 != null) {
                                    class386.field4930.method462(0);
                                }
                            }
                            this.field2112.method1935(-54, this.field2115 || class386.field4930 != null && class386.field4930.method431());
                        } else {
                            int var6 = (int) ((var4 - this.field2125) * 255L / (long) this.field2126.method1936(123));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class759.method4224(0);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class386.field4930.method462(0);
                            class481 var10 = class386.field4930.method551(class356.field4586, class466.field6263, true);
                            class386.field4930.method489(var10, false);
                            this.field2126.method1935(-58, true);
                            class386.field4930.method444();
                            var10.method148(0, 0, 0, var8, 1);
                            class386.field4930.method489(var10, false);
                            class386.field4930.method462(0);
                            this.field2112.method1935(-84, true);
                            class386.field4930.method444();
                            var10.method148(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class386.field4930 != null && !(this.field2112 instanceof class500)) {
                                class386.field4930.method492(68);
                            }
                        } catch (class230 var18) {
                            class684.method3842(1, var18, var18.getMessage() + " (Recovered) " + class654.field9104.method1814((byte) -124));
                            class415.method2331(true, 0, -4);
                        }
                    }
                    Container var12;
                    if (class731.field10179 != null) {
                        var12 = class731.field10179;
                    } else if (class64.field900 == null) {
                        var12 = class319.field4123;
                    } else {
                        var12 = class64.field900;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class731.field10179 == var12) {
                        class731.field10179.getInsets();
                    }
                    this.field2115 = false;
                    if (class386.field4930 != null && !(this.field2112 instanceof class500) && this.field2124.method1844(13) < class306.field4035.method1844(13)) {
                        class386.method2195(-84);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class446.method2525(500);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class149.method1052((long) var15, true);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Llm;Z)V")
    public final synchronized void method1087(class502 arg0, boolean arg1) {
        this.field2126 = this.field2112;
        field2110++;
        this.field2112 = arg0;
        if (arg1) {
            method1082(-49);
        }
        this.field2125 = class446.method2525(500);
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)I")
    public final int method1088(int arg0) {
        field2118++;
        int var2 = 61 / ((arg0 - 52) / 37);
        return this.field2130;
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
    public final void method1089(int arg0) {
        this.field2122 = true;
        int var2 = 78 % ((-arg0 - 67) / 53);
        field2111++;
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "(I)V")
    public final synchronized void method1090(int arg0) {
        field2121++;
        if (arg0 != 100) {
            this.method1090(-32);
        }
        this.field2115 = true;
    }
}
