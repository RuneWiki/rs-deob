import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class256 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lfc;")
    private class262 field3311 = new class262(128);

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lni;")
    private class522 field3318;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
    public static volatile boolean field3319 = true;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3321 = null;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Z")
    public static boolean field3322 = false;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lha;")
    public static class60 field3310;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 5)
    public final void method1519(byte arg0) {
        field3320++;
        class262 var2 = this.field3311;
        synchronized (this.field3311) {
            this.field3311.method1575((byte) 61);
        }
        if (arg0 <= 17) {
            method1524(126);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lel;", line = 22)
    public final class548 method1520(int arg0, int arg1) {
        field3315++;
        class262 var3 = this.field3311;
        class548 var4;
        synchronized (this.field3311) {
            var4 = (class548) this.field3311.method1571(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 < 117) {
            field3319 = false;
        }
        class522 var5 = this.field3318;
        byte[] var6;
        synchronized (this.field3318) {
            var6 = this.field3318.method2885(arg0, 1, false);
        }
        class548 var7 = new class548();
        if (var6 != null) {
            var7.method3104(new class611(var6), -52);
        }
        class262 var8 = this.field3311;
        synchronized (this.field3311) {
            this.field3311.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLfl;Ljava/awt/Component;)Lqn;", line = 53)
    public static final class65 method1521(int arg0, int arg1, byte arg2, class739 arg3, Component arg4) {
        field3317++;
        if (class478.field6609 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class65 var5 = (class65) Class.forName("iba").getDeclaredConstructor().newInstance();
                var5.field730 = arg0;
                var5.field712 = new int[(class460.field6375 ? 2 : 1) * 256];
                var5.method499(arg4);
                var5.field724 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field724 > 16384) {
                    var5.field724 = 16384;
                }
                var5.method496(var5.field724);
                if (class244.field3174 > 0 && class713.field9948 == null) {
                    class713.field9948 = new class678();
                    class713.field9948.field9462 = arg3;
                    arg3.method4126(class244.field3174, class713.field9948, 1);
                }
                if (class713.field9948 != null) {
                    if (class713.field9948.field9466[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class713.field9948.field9466[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class667 var6 = new class667(arg3, arg1);
                    var6.field730 = arg0;
                    var6.field712 = new int[(class460.field6375 ? 2 : 1) * 256];
                    var6.method499(arg4);
                    var6.field724 = 16384;
                    if (arg2 != -126) {
                        field3319 = true;
                    }
                    var6.method496(var6.field724);
                    if (class244.field3174 > 0 && class713.field9948 == null) {
                        class713.field9948 = new class678();
                        class713.field9948.field9462 = arg3;
                        arg3.method4126(class244.field3174, class713.field9948, 1);
                    }
                    if (class713.field9948 != null) {
                        if (class713.field9948.field9466[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class713.field9948.field9466[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class65();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V", line = 145)
    public final void method1522(int arg0, int arg1) {
        class262 var3 = this.field3311;
        synchronized (this.field3311) {
            this.field3311.method1569((byte) 62, arg0);
        }
        if (arg1 == 1) {
            field3314++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 162)
    public final void method1523(byte arg0) {
        class262 var2 = this.field3311;
        synchronized (this.field3311) {
            this.field3311.method1563(97);
        }
        field3313++;
        if (arg0 >= -67) {
            this.method1522(-5, -3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 178)
    public static final void method1524(int arg0) {
        field3316++;
        class710.field9911 = new class108();
        if (arg0 != -1) {
            field3322 = false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 190)
    public static void method1525(int arg0) {
        field3310 = null;
        field3321 = null;
        if (arg0 != -1) {
            field3321 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(JB)V", line = 207)
    public static final void method1526(long arg0, byte arg1) {
        field3323++;
        int var3 = class622.field8708 + class653.field9086.field2170;
        int var4 = -83 / ((arg1 + 27) / 43);
        int var5 = class653.field9086.field2165 + class314.field4238;
        if ((class558.field7855 - var3) < -2000 || (class558.field7855 - var3) > 2000 || class420.field5892 - var5 < -2000 || (class420.field5892 - var5) > 2000) {
            class558.field7855 = var3;
            class420.field5892 = var5;
        }
        if (class558.field7855 != var3) {
            int var6 = var3 - class558.field7855;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var7 < var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var7 > var6) {
                var7 = var6;
            }
            class558.field7855 += var7;
        }
        if (class420.field5892 != var5) {
            int var8 = var5 - class420.field5892;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class420.field5892 += var9;
        }
        class255.field3307 += (float) arg0 * class285.field3771 / 6.0F;
        class183.field2237 += (float) arg0 * class471.field6528 / 6.0F;
        class132.method831(true);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 296)
    public class256(class242 arg0, int arg1, class522 arg2) {
        this.field3318 = arg2;
        this.field3318.method2901(0, 1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)I", line = 311)
    public static final int method1527(int arg0, boolean arg1) {
        field3312++;
        if (arg1) {
            field3310 = null;
        }
        return arg0 >>> 8;
    }
}
