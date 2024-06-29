import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class504 implements Runnable {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Luh;")
    private class526 field6931 = new class25();

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Luh;")
    private class526 field6952 = null;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field6939 = -1;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "[I")
    public static int[] field6942 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    private int field6951;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    private int field6956;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "J")
    private long field6950;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "J")
    private long field6953;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "Ldr;")
    public static class391 field6946;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Lvv;")
    private class696 field6954;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Ljava/lang/String;")
    private String field6949;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Z")
    private boolean field6935;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Z")
    private volatile boolean field6936;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)J")
    public final long method2857(byte arg0) {
        field6932++;
        if (arg0 != 40) {
            this.field6950 = -95L;
        }
        return this.field6953;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method2858(boolean arg0) {
        field6943++;
        return arg0 ? this.field6949 : null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public final void method2859(int arg0) {
        field6945++;
        this.field6936 = true;
        if (arg0 != 16777215) {
            this.field6956 = -121;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)I")
    public final int method2860(byte arg0) {
        if (arg0 <= 7) {
            this.method2857((byte) 127);
        }
        field6940++;
        return this.field6951;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)I")
    public final int method2861(boolean arg0) {
        field6941++;
        if (!arg0) {
            this.method2859(52);
        }
        if (this.field6954 == null) {
            return 0;
        }
        int var2 = this.field6954.method3928(false);
        if (this.field6954.field9818 && this.field6954.field9823 > this.field6956) {
            return this.field6956 + 1;
        } else if (var2 >= 0 && var2 < (class51.field636.length - 1)) {
            return this.field6954.field9820 == this.field6956 ? this.field6954.field9823 : this.field6954.field9820;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)Lvv;")
    public final class696 method2862(byte arg0) {
        if (arg0 < 43) {
            return null;
        } else {
            field6947++;
            return this.field6954;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Luh;I)V")
    public final synchronized void method2863(class526 arg0, int arg1) {
        this.field6952 = this.field6931;
        field6955++;
        this.field6931 = arg0;
        int var3 = 61 / ((arg1 + 65) / 42);
        this.field6950 = class529.method2982((byte) -69);
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)Z")
    public final synchronized boolean method2864(byte arg0) {
        field6934++;
        int var2 = 10 / ((-arg0 - 76) / 49);
        return this.field6931.method150(this.field6950, 5607);
    }

    @OriginalMember(owner = "client!pp", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field6936) {
            long var1 = class529.method2982((byte) -69);
            synchronized (this) {
                try {
                    if (this.field6931 instanceof class25) {
                        this.field6931.method143(-25156, this.field6935);
                    } else {
                        this.field6951++;
                        long var4 = class529.method2982((byte) -69);
                        if (class146.field1963 == null || this.field6952 == null || this.field6952.method152(-3210) == 0 || this.field6950 < var4 - ((long) this.field6952.method152(-3210))) {
                            if (this.field6952 != null) {
                                this.field6935 = true;
                                this.field6952.method151(true);
                                this.field6952 = null;
                            }
                            if (this.field6935) {
                                class314.method1837((byte) 62);
                                if (class146.field1963 != null) {
                                    class146.field1963.method1146(0);
                                }
                            }
                            this.field6931.method143(-25156, this.field6935 || class146.field1963 != null && class146.field1963.method1112());
                        } else {
                            int var6 = (int) ((var4 - this.field6950) * 255L / (long) this.field6952.method152(-3210));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class314.method1837((byte) 62);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class146.field1963.method1146(0);
                            class532 var10 = class146.field1963.method1040(class399.field5301, class60.field750, true);
                            class146.field1963.method3121(var10, (byte) -89);
                            this.field6952.method143(-25156, true);
                            class146.field1963.method1150();
                            var10.method217(0, 0, 0, var8, 1);
                            class146.field1963.method3121(var10, (byte) -89);
                            class146.field1963.method1146(0);
                            this.field6931.method143(-25156, true);
                            class146.field1963.method1150();
                            var10.method217(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class146.field1963 != null && !(this.field6931 instanceof class25)) {
                                class146.field1963.method1151();
                            }
                        } catch (class56 var17) {
                            class91.method499(var17.getMessage() + " (Recovered) " + class386.field5153.method2606(0), var17, (byte) -11);
                            class174.method1190(0, 0);
                        }
                    }
                    this.field6935 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class529.method2982((byte) -69);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class588.method3253(0, (long) var14);
            }
        }
        field6937++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(JIZLjava/lang/String;Lvv;)V")
    public final synchronized void method2865(long arg0, int arg1, boolean arg2, String arg3, class696 arg4) {
        field6944++;
        this.field6953 = arg0;
        this.field6954 = arg4;
        this.field6949 = arg3;
        this.field6956 = arg1;
        if (arg2) {
            this.field6954 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static void method2866(int arg0) {
        field6946 = null;
        if (arg0 != 1) {
            field6946 = null;
        }
        field6942 = null;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public final synchronized void method2867(int arg0) {
        field6948++;
        if (arg0 >= -7) {
            this.method2865(2L, -74, false, null, null);
        }
        this.field6935 = true;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
    public static final void method2868(int arg0) {
        if (class576.field7861 == 9) {
            class28.method182(5, 29697);
        } else if (class576.field7861 == 5 || class576.field7861 == 6) {
            class28.method182(3, 29697);
        } else if (class576.field7861 == 12) {
            class28.method182(3, arg0 + 29692);
        }
        field6938++;
        if (arg0 != 5) {
            method2866(-56);
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I")
    public final int method2869(boolean arg0) {
        if (arg0) {
            return 23;
        } else {
            field6933++;
            return this.field6956;
        }
    }

    static {
        new class192("", 73);
    }
}
