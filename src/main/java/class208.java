import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class208 implements Runnable {

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "Lffa;")
    private class187 field2504 = new class206();

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "Lffa;")
    private class187 field2509 = null;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "Lhda;")
    public static class750 field2506 = new class750(1, 2);

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "J")
    private long field2512;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "J")
    private long field2513;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "Les;")
    private class386 field2515;

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "Ljava/lang/String;")
    private String field2510;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "Z")
    private boolean field2491;

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "Z")
    private volatile boolean field2507;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)I", line = 5)
    public final int method1159(int arg0) {
        field2505++;
        return arg0 >= -113 ? 34 : this.field2511;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)Z", line = 17)
    public final synchronized boolean method1160(byte arg0) {
        field2492++;
        int var2 = 127 % ((66 - arg0) / 52);
        return this.field2504.method1054(-105, this.field2513);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)Les;", line = 27)
    public final class386 method1161(byte arg0) {
        if (arg0 != 54) {
            this.method1160((byte) -74);
        }
        field2497++;
        return this.field2515;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)Ljava/lang/String;", line = 38)
    public final String method1162(byte arg0) {
        field2502++;
        if (arg0 != -46) {
            this.method1166(66);
        }
        return this.field2510;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BLffa;)V", line = 49)
    public final synchronized void method1163(byte arg0, class187 arg1) {
        if (arg0 >= -17) {
            this.field2504 = null;
        }
        this.field2509 = this.field2504;
        field2493++;
        this.field2504 = arg1;
        this.field2513 = class538.method2963(-47);
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)J", line = 64)
    public final long method1164(byte arg0) {
        field2500++;
        int var2 = 110 % ((arg0 - 64) / 56);
        return this.field2512;
    }

    @OriginalMember(owner = "client!dga", name = "run", descriptor = "()V", line = 74)
    public final void run() {
        while (!this.field2507) {
            long var1 = class538.method2963(-47);
            synchronized (this) {
                try {
                    this.field2508++;
                    if (this.field2504 instanceof class206) {
                        this.field2504.method1049(32210, this.field2491);
                    } else {
                        long var4 = class538.method2963(-47);
                        if (class21.field142 == null || this.field2509 == null || this.field2509.method1051(-24591) == 0 || this.field2513 < (var4 - ((long) this.field2509.method1051(-24591)))) {
                            if (this.field2509 != null) {
                                this.field2491 = true;
                                this.field2509.method1050(-26363);
                                this.field2509 = null;
                            }
                            if (this.field2491) {
                                class105.method713(14059);
                                if (class21.field142 != null) {
                                    class21.field142.method402(0);
                                }
                            }
                            this.field2504.method1049(32210, this.field2491 || class21.field142 != null && class21.field142.method450());
                        } else {
                            int var6 = (int) ((var4 - this.field2513) * 255L / (long) this.field2509.method1051(-24591));
                            int var7 = 255 - var6;
                            class105.method713(14059);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class21.field142.method402(0);
                            class680 var10 = class21.field142.method338(class546.field7710, class512.field6932, true);
                            class21.field142.method372(-74, var10);
                            this.field2509.method1049(32210, true);
                            class21.field142.method388();
                            var10.method677(0, 0, 0, var8, 1);
                            class21.field142.method372(-123, var10);
                            class21.field142.method402(0);
                            this.field2504.method1049(32210, true);
                            class21.field142.method388();
                            var10.method677(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class21.field142 != null && !(this.field2504 instanceof class206)) {
                                class21.field142.method360(-128);
                            }
                        } catch (class353 var18) {
                            class760.method4223(var18, -121, var18.getMessage() + " (Recovered) " + class58.field623.method1409(0));
                            class479.method2689(0, true, 57);
                        }
                    }
                    Container var12;
                    if (class271.field3587 != null) {
                        var12 = class271.field3587;
                    } else if (class144.field1868 == null) {
                        var12 = class561.field7928;
                    } else {
                        var12 = class144.field1868;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class271.field3587 == var12) {
                        class271.field3587.getInsets();
                    }
                    this.field2491 = false;
                    if (class21.field142 != null && !(this.field2504 instanceof class206) && this.field2515.method2261((byte) -10) < class386.field5448.method2261((byte) -10)) {
                        class716.method4005((byte) -90);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class538.method2963(-47);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class267.method1599(0, (long) var15);
            }
        }
        field2501++;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(JBILes;Ljava/lang/String;)V", line = 200)
    public final synchronized void method1165(long arg0, byte arg1, int arg2, class386 arg3, String arg4) {
        this.field2512 = arg0;
        field2498++;
        this.field2515 = arg3;
        this.field2511 = arg2;
        int var7 = -57 % (-arg1 / 58);
        this.field2510 = arg4;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)I", line = 216)
    public final int method1166(int arg0) {
        if (arg0 != 6119) {
            this.field2508 = -126;
        }
        field2494++;
        if (this.field2515 == null) {
            return 0;
        }
        int var2 = this.field2515.method2261((byte) -10);
        if (this.field2515.field5420 && this.field2511 < this.field2515.field5426) {
            return this.field2511 + 1;
        } else if (var2 >= 0 && var2 < class727.field10142.length - 1) {
            return this.field2515.field5419 == this.field2511 ? this.field2515.field5426 : this.field2515.field5419;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V", line = 242)
    public final void method1167(boolean arg0) {
        this.field2507 = true;
        if (!arg0) {
            field2503++;
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)V", line = 253)
    public static void method1168(int arg0) {
        int var1 = -32 / ((arg0 - 20) / 57);
        field2506 = null;
    }

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "(B)I", line = 262)
    public final int method1169(byte arg0) {
        field2496++;
        return arg0 == 3 ? this.field2508 : -56;
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)[Lqca;", line = 279)
    public static final class118[] method1170(int arg0) {
        if (arg0 < 118) {
            field2506 = null;
        }
        if (class244.field3171 == null) {
            class118[] var1 = class511.method2832(class287.field3823, (byte) -68);
            class118[] var2 = new class118[var1.length];
            int var3 = 0;
            int var4 = class11.field68.field5501.method2405((byte) 123);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class118 var9 = var1[var5];
                if ((var9.field1558 <= 0 || var9.field1558 >= 24) && var9.field1556 >= 800 && var9.field1559 >= 600 && (var4 != 2 || var9.field1556 <= 800 && var9.field1559 <= 600) && (var4 != 1 || var9.field1556 <= 1024 && var9.field1559 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class118 var11 = var2[var10];
                        if (var9.field1556 == var11.field1556 && var9.field1559 == var11.field1559) {
                            if (var9.field1558 > var11.field1558) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class244.field3171 = new class118[var3];
            class373.method2192(var2, 0, class244.field3171, 0, var3);
            int[] var6 = new int[class244.field3171.length];
            for (int var7 = 0; var7 < class244.field3171.length; var7++) {
                class118 var8 = class244.field3171[var7];
                var6[var7] = var8.field1559 * var8.field1556;
            }
            class216.method1205(var6, class244.field3171, 0);
        }
        field2495++;
        return class244.field3171;
    }

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "(I)V", line = 378)
    public final synchronized void method1171(int arg0) {
        field2499++;
        this.field2491 = true;
        if (arg0 != -7423) {
            this.method1161((byte) 77);
        }
    }
}
