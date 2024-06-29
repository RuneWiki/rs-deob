import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "Lnc;")
    private class200 field366 = new class503();

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "Lnc;")
    private class200 field374 = null;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field352 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "F")
    public static float field362;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "J")
    private long field376;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "J")
    private long field379;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "Lvo;")
    public static class345 field371;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "Lei;")
    private class508 field375;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Ljava/lang/String;")
    private String field378;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "Z")
    private volatile boolean field360;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Z")
    private boolean field372;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IBI)V", line = 3)
    public static final void method247(int arg0, byte arg1, int arg2) {
        if (arg1 != 84) {
            method247(95, (byte) 16, -54);
        }
        field356++;
        class63 var3 = class119.field1958[arg2][arg0];
        if (var3 != null) {
            class125.field2059 = var3.field913;
            class526.field7715 = var3.field919;
            class39.field533 = var3.field901;
        }
        class295.method1834(true);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lnc;I)V", line = 25)
    private final synchronized void method248(class200 arg0, int arg1) {
        this.field374 = this.field366;
        field357++;
        if (arg1 < -120) {
            this.field366 = arg0;
            this.field379 = class254.method1619(true);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;JILei;)V", line = 38)
    public final synchronized void method249(byte arg0, String arg1, long arg2, int arg3, class508 arg4) {
        this.field377 = arg3;
        field368++;
        this.field376 = arg2;
        this.field375 = arg4;
        if (arg0 > -117) {
            this.method250((byte) -37);
        }
        this.field378 = arg1;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I", line = 55)
    public final int method250(byte arg0) {
        if (arg0 >= -109) {
            this.field360 = false;
        }
        field364++;
        return this.field373;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 68)
    public static final void method251(int arg0) {
        if (class242.field3547 == null) {
            class242.field3547 = class508.method3024(13);
            class230.field3406 = class242.field3547[0];
            class173.field2789 = class254.method1619(true);
        }
        field369++;
        if (class406.field5827 == null) {
            class330.method1957((byte) -111);
        }
        if (arg0 > -13) {
            field352 = null;
        }
        class508 var1 = class230.field3406;
        int var2 = class348.method2116(false);
        if (class230.field3406 == var1) {
            class132.field2143 = class230.field3406.field7540.method2059(class238.field3511, true);
            if (class230.field3406.field7547) {
                class81.field1237 = (class230.field3406.field7544 - class230.field3406.field7534) * var2 / 100 + class230.field3406.field7534;
            }
            if (class230.field3406.field7539) {
                class132.field2143 = class132.field2143 + class81.field1237 + "%";
            }
        } else if (class508.field7565 == class230.field3406) {
            class406.field5827 = null;
            class595.method3408((byte) 101, 3);
        } else {
            class132.field2143 = var1.field7538.method2059(class238.field3511, true);
            if (class230.field3406.field7539) {
                class132.field2143 = class132.field2143 + var1.field7544 + "%";
            }
            class81.field1237 = var1.field7544;
            if (class230.field3406.field7547 || var1.field7547) {
                class173.field2789 = class254.method1619(true);
            }
        }
        if (class406.field5827 == null) {
            return;
        }
        class406.field5827.method249((byte) -122, class132.field2143, class173.field2789, class81.field1237, class230.field3406);
        if (class565.field8275 == null) {
            return;
        }
        for (int var3 = class598.field8644 + 1; var3 < class565.field8275.length; var3++) {
            if (class565.field8275[var3].method1143(-12150) >= 100 && var3 - 1 == class598.field8644 && class515.field7636 >= 1 && class406.field5827.method259(true)) {
                try {
                    class565.field8275[var3].method1141((byte) 118);
                } catch (Exception var4) {
                    class565.field8275 = null;
                    return;
                }
                class406.field5827.method248(class565.field8275[var3], -124);
                class598.field8644++;
                if ((class565.field8275.length - 1) <= class598.field8644 && class565.field8275.length > 1) {
                    class598.field8644 = class455.field6541.method2559((byte) -124) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V", line = 164)
    public final void method252(boolean arg0) {
        field358++;
        this.field360 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)V", line = 172)
    public final synchronized void method253(boolean arg0) {
        this.field372 = arg0;
        field355++;
    }

    @OriginalMember(owner = "client!ov", name = "run", descriptor = "()V", line = 180)
    public final void run() {
        field365++;
        while (!this.field360) {
            long var1 = class254.method1619(true);
            synchronized (this) {
                try {
                    if (this.field366 instanceof class503) {
                        this.field366.method1138((byte) 26, this.field372);
                    } else {
                        this.field373++;
                        long var4 = class254.method1619(true);
                        if (class637.field9048 == null || this.field374 == null || this.field374.method1145(true) == 0 || this.field379 < (var4 - (long) this.field374.method1145(true))) {
                            if (this.field374 != null) {
                                this.field372 = true;
                                this.field374.method1139(27);
                                this.field374 = null;
                            }
                            if (this.field372) {
                                class461.method2680(true);
                                if (class637.field9048 != null) {
                                    class637.field9048.method118(0);
                                }
                            }
                            this.field366.method1138((byte) 124, this.field372 || class637.field9048 != null && class637.field9048.method816());
                        } else {
                            int var6 = (int) ((var4 - this.field379) * 255L / (long) this.field374.method1145(true));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class461.method2680(true);
                            class637.field9048.method118(0);
                            class257 var10 = class637.field9048.method825(class465.field6689, class597.field8633, true);
                            class637.field9048.method745((byte) 39, var10);
                            this.field374.method1138((byte) 123, true);
                            class637.field9048.method88();
                            var10.method3(0, 0, 0, var9, 1);
                            class637.field9048.method745((byte) 39, var10);
                            class637.field9048.method118(0);
                            this.field366.method1138((byte) -112, true);
                            class637.field9048.method88();
                            var10.method3(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class637.field9048 != null && !(this.field366 instanceof class503)) {
                                class637.field9048.method87();
                            }
                        } catch (class300 var17) {
                            class18.method200(var17.getMessage() + " (Recovered) " + class573.field8424.method695(50), var17, 10296);
                            class251.method1604(98, 0);
                        }
                    }
                    this.field372 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class254.method1619(true);
            int var14 = (int) (var1 - (var12 - 20L));
            if (var14 > 0) {
                class564.method3300((byte) 116, (long) var14);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)Lei;", line = 273)
    public final class508 method254(byte arg0) {
        if (arg0 != 78) {
            this.field373 = -47;
        }
        field361++;
        return this.field375;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Ljava/lang/String;", line = 286)
    public final String method255(int arg0) {
        if (arg0 != 100) {
            this.field360 = true;
        }
        field367++;
        return this.field378;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)J", line = 297)
    public final long method256(int arg0) {
        field354++;
        return arg0 == 0 ? this.field376 : 31L;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)V", line = 310)
    public static void method257(byte arg0) {
        if (arg0 <= -126) {
            field371 = null;
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(Z)I", line = 327)
    public final int method258(boolean arg0) {
        field353++;
        if (this.field375 == null) {
            return 0;
        }
        if (arg0) {
            field352 = null;
        }
        int var2 = this.field375.method3023((byte) 9);
        if (this.field375.field7547 && this.field375.field7544 > this.field377) {
            return this.field377 + 1;
        } else if (var2 >= 0 && (class242.field3547.length - 1) > var2) {
            return this.field375.field7534 == this.field377 ? this.field375.field7544 : this.field375.field7534;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(Z)Z", line = 355)
    private final synchronized boolean method259(boolean arg0) {
        if (!arg0) {
            this.method259(true);
        }
        field370++;
        return this.field366.method1146(this.field379, (byte) -46);
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)I", line = 379)
    public final int method260(int arg0) {
        field359++;
        if (arg0 != 0) {
            this.field374 = null;
        }
        return this.field377;
    }
}
