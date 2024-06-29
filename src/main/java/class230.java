import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class230 implements Runnable {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lfp;")
    private class299 field3222 = new class688();

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lfp;")
    private class299 field3229 = null;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field3224 = 2;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "J")
    private long field3235;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "J")
    private long field3238;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lbi;")
    public static class449 field3220;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lkq;")
    private class555 field3239;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Ljava/lang/String;")
    private String field3237;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
    private volatile boolean field3216;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Z")
    private boolean field3218;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgf;I)I")
    public static final int method1431(class256 arg0, int arg1) {
        field3219++;
        int var2 = -93 % ((arg1 + 1) / 53);
        if (class350.field4792 == arg0) {
            return 5890;
        } else if (class681.field9596 == arg0) {
            return 34167;
        } else if (class291.field4117 == arg0) {
            return 34168;
        } else if (class149.field2382 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
    public final synchronized boolean method1432(byte arg0) {
        if (arg0 <= 60) {
            this.method1436(null, (byte) 67, null, -52, 34L);
        }
        field3227++;
        return this.field3222.method1823(-29765, this.field3235);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final synchronized void method1433(int arg0) {
        if (arg0 != 0) {
            this.method1439(69);
        }
        field3234++;
        this.field3218 = true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfp;B)V")
    public final synchronized void method1434(class299 arg0, byte arg1) {
        int var3 = 59 % ((arg1 - 66) / 59);
        field3225++;
        this.field3229 = this.field3222;
        this.field3222 = arg0;
        this.field3235 = class681.method3802(-23600);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)I")
    public final int method1435(byte arg0) {
        field3215++;
        if (arg0 <= 53) {
            this.field3222 = null;
        }
        return this.field3230;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;BLkq;IJ)V")
    public final synchronized void method1436(String arg0, byte arg1, class555 arg2, int arg3, long arg4) {
        this.field3239 = arg2;
        this.field3238 = arg4;
        field3236++;
        if (arg1 != 40) {
            field3220 = null;
        }
        this.field3237 = arg0;
        this.field3230 = arg3;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method1437(byte arg0) {
        if (arg0 > -44) {
            return null;
        } else {
            field3231++;
            return this.field3237;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
    public final int method1438(int arg0) {
        if (arg0 != -1) {
            this.method1432((byte) 4);
        }
        field3214++;
        return this.field3233;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public final void method1439(int arg0) {
        field3226++;
        this.field3216 = true;
        if (arg0 != 2) {
            this.method1436(null, (byte) -120, null, 55, -126L);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1440(boolean arg0) {
        field3220 = null;
        if (arg0) {
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1441(boolean arg0, int arg1) {
        field3228++;
        if (!arg0) {
            method1443(null, (byte) 114, false);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)I")
    public final int method1442(int arg0) {
        if (arg0 != 100) {
            this.field3237 = null;
        }
        field3212++;
        if (this.field3239 == null) {
            return 0;
        }
        int var2 = this.field3239.method3070((byte) -56);
        if (this.field3239.field7356 && this.field3239.field7365 > this.field3230) {
            return this.field3230 + 1;
        } else if (var2 >= 0 && var2 < class263.field3647.length - 1) {
            return this.field3239.field7363 == this.field3230 ? this.field3239.field7365 : this.field3239.field7363;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method1443(byte[] arg0, byte arg1, boolean arg2) {
        field3232++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -106) {
            if (arg0.length > 136 && !class497.field6672) {
                try {
                    class711 var3 = (class711) Class.forName("nu").getDeclaredConstructor().newInstance();
                    var3.method3067((byte) 73, arg0);
                    return var3;
                } catch (Throwable var4) {
                    class497.field6672 = true;
                }
            }
            return arg2 ? class546.method3034(arg0, arg1 ^ 0x69) : arg0;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)J")
    public final long method1444(boolean arg0) {
        if (!arg0) {
            this.field3233 = 83;
        }
        field3217++;
        return this.field3238;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lkq;")
    public final class555 method1445(int arg0) {
        field3221++;
        int var2 = -127 / ((-arg0 - 17) / 53);
        return this.field3239;
    }

    @OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
    public final void run() {
        field3213++;
        while (!this.field3216) {
            long var1 = class681.method3802(-23600);
            synchronized (this) {
                try {
                    if (this.field3222 instanceof class688) {
                        this.field3222.method1824(this.field3218, (byte) -110);
                    } else {
                        this.field3233++;
                        long var4 = class681.method3802(-23600);
                        if (class10.field197 == null || this.field3229 == null || this.field3229.method1827(8717) == 0 || this.field3235 < var4 - ((long) this.field3229.method1827(8717))) {
                            if (this.field3229 != null) {
                                this.field3218 = true;
                                this.field3229.method1825((byte) 57);
                                this.field3229 = null;
                            }
                            if (this.field3218) {
                                class428.method2445(116);
                                if (class10.field197 != null) {
                                    class10.field197.method87(0);
                                }
                            }
                            this.field3222.method1824(this.field3218 || class10.field197 != null && class10.field197.method380(), (byte) -125);
                        } else {
                            int var6 = (int) ((var4 - this.field3235) * 255L / (long) this.field3229.method1827(8717));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class428.method2445(113);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class10.field197.method87(0);
                            class468 var10 = class10.field197.method398(class627.field8461, class149.field2387, true);
                            class10.field197.method3573((byte) -47, var10);
                            this.field3229.method1824(true, (byte) -120);
                            class10.field197.method107();
                            var10.method271(0, 0, 0, var8, 1);
                            class10.field197.method3573((byte) 114, var10);
                            class10.field197.method87(0);
                            this.field3222.method1824(true, (byte) -112);
                            class10.field197.method107();
                            var10.method271(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class10.field197 != null && !(this.field3222 instanceof class688)) {
                                class10.field197.method97();
                            }
                        } catch (class26 var17) {
                            class259.method1586(var17, var17.getMessage() + " (Recovered) " + class139.field2244.method1703(256), (byte) 8);
                            class405.method2326(0, -67);
                        }
                    }
                    this.field3218 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class681.method3802(-23600);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class486.method2722(0, (long) var14);
            }
        }
    }
}
