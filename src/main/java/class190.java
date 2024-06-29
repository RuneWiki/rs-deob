import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class190 implements Runnable {

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "Ldf;")
    private class646 field2633 = new class78();

    @OriginalMember(owner = "client!uja", name = "z", descriptor = "Ldf;")
    private class646 field2658 = null;

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "Luw;")
    public static class208 field2634 = new class208(43, 6);

    @OriginalMember(owner = "client!uja", name = "p", descriptor = "[I")
    public static int[] field2648 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!uja", name = "h", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!uja", name = "j", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!uja", name = "k", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!uja", name = "m", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!uja", name = "n", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!uja", name = "s", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!uja", name = "t", descriptor = "I")
    private int field2652;

    @OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
    private int field2653;

    @OriginalMember(owner = "client!uja", name = "y", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!uja", name = "A", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!uja", name = "w", descriptor = "J")
    private long field2655;

    @OriginalMember(owner = "client!uja", name = "x", descriptor = "J")
    private long field2656;

    @OriginalMember(owner = "client!uja", name = "r", descriptor = "Lob;")
    private class4 field2650;

    @OriginalMember(owner = "client!uja", name = "o", descriptor = "Lg;")
    public static class619 field2647;

    @OriginalMember(owner = "client!uja", name = "v", descriptor = "Ljava/lang/String;")
    private String field2654;

    @OriginalMember(owner = "client!uja", name = "g", descriptor = "Z")
    private boolean field2639;

    @OriginalMember(owner = "client!uja", name = "l", descriptor = "Z")
    private volatile boolean field2644;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1323(boolean arg0) {
        field2647 = null;
        if (arg0) {
            field2634 = null;
            field2648 = null;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILdf;)V", line = 22)
    public final synchronized void method1324(int arg0, class646 arg1) {
        this.field2658 = this.field2633;
        field2637++;
        if (arg0 != 255) {
            this.method1328(20);
        }
        this.field2633 = arg1;
        this.field2655 = class502.method2786(-7114);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)I", line = 37)
    public final int method1325(int arg0) {
        if (arg0 >= -122) {
            this.field2656 = 41L;
        }
        field2651++;
        return this.field2653;
    }

    @OriginalMember(owner = "client!uja", name = "run", descriptor = "()V", line = 48)
    public final void run() {
        while (!this.field2644) {
            long var1 = class502.method2786(-7114);
            synchronized (this) {
                try {
                    this.field2653++;
                    if (this.field2633 instanceof class78) {
                        this.field2633.method489(29, this.field2639);
                    } else {
                        long var4 = class502.method2786(-7114);
                        if (class576.field7320 == null || this.field2658 == null || this.field2658.method492(102) == 0 || this.field2655 < (var4 - ((long) this.field2658.method492(-126)))) {
                            if (this.field2658 != null) {
                                this.field2639 = true;
                                this.field2658.method486(58);
                                this.field2658 = null;
                            }
                            if (this.field2639) {
                                class90.method544((byte) -110);
                                if (class576.field7320 != null) {
                                    class576.field7320.method907(0);
                                }
                            }
                            this.field2633.method489(81, this.field2639 || class576.field7320 != null && class576.field7320.method953());
                        } else {
                            int var6 = (int) ((var4 - this.field2655) * 255L / (long) this.field2658.method492(-124));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class90.method544((byte) -118);
                            class576.field7320.method907(0);
                            class772 var10 = class576.field7320.method990(class372.field4550, class463.field6021, true);
                            class576.field7320.method3077(var10, 25183);
                            this.field2658.method489(37, true);
                            class576.field7320.method962();
                            var10.method616(0, 0, 0, var8, 1);
                            class576.field7320.method3077(var10, 25183);
                            class576.field7320.method907(0);
                            this.field2633.method489(120, true);
                            class576.field7320.method962();
                            var10.method616(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class576.field7320 != null && !(this.field2633 instanceof class78)) {
                                class576.field7320.method3073(0);
                            }
                        } catch (class15 var18) {
                            class416.method2401(1, var18, var18.getMessage() + " (Recovered) " + class102.field1382.method2621((byte) 125));
                            class432.method2483((byte) 76, 0, true);
                        }
                    }
                    Container var12;
                    if (class340.field4176 != null) {
                        var12 = class340.field4176;
                    } else if (class80.field1134 == null) {
                        var12 = class29.field265;
                    } else {
                        var12 = class80.field1134;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class340.field4176 == var12) {
                        class340.field4176.getInsets();
                    }
                    this.field2639 = false;
                    if (class576.field7320 != null && !(this.field2633 instanceof class78) && this.field2650.method11(3) < class4.field48.method11(3)) {
                        class398.method2301(-121);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class502.method2786(-7114);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class591.method3181((long) var15, 0);
            }
        }
        field2641++;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(JLob;IILjava/lang/String;)V", line = 177)
    public final synchronized void method1326(long arg0, class4 arg1, int arg2, int arg3, String arg4) {
        field2645++;
        this.field2650 = arg1;
        this.field2656 = arg0;
        if (arg2 != 0) {
            this.method1329(-101);
        }
        this.field2654 = arg4;
        this.field2652 = arg3;
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(I)I", line = 192)
    public final int method1327(int arg0) {
        int var2 = 3 % ((arg0 - 62) / 50);
        field2638++;
        return this.field2652;
    }

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "(I)Lob;", line = 202)
    public final class4 method1328(int arg0) {
        field2646++;
        return arg0 < 11 ? null : this.field2650;
    }

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "(I)Z", line = 214)
    public final synchronized boolean method1329(int arg0) {
        field2635++;
        return arg0 == 255 ? this.field2633.method478((byte) 90, this.field2655) : true;
    }

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "(I)V", line = 228)
    public final void method1330(int arg0) {
        this.field2644 = true;
        if (arg0 != 255) {
            this.method1328(-38);
        }
        field2657++;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(II)Laca;", line = 239)
    public static final class230 method1331(int arg0, int arg1) {
        field2636++;
        if (arg1 == 7484) {
            return class310.field3881 && arg0 >= class157.field2031 && class410.field5446 >= arg0 ? class425.field5588[arg0 - class157.field2031] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uja", name = "f", descriptor = "(I)I", line = 253)
    public final int method1332(int arg0) {
        field2649++;
        int var2 = 80 % ((35 - arg0) / 42);
        if (this.field2650 == null) {
            return 0;
        }
        int var3 = this.field2650.method11(3);
        if (this.field2650.field28 && this.field2652 < this.field2650.field20) {
            return this.field2652 + 1;
        } else if (var3 >= 0 && class552.field6986.length - 1 > var3) {
            return this.field2650.field26 == this.field2652 ? this.field2650.field20 : this.field2650.field26;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uja", name = "g", descriptor = "(I)V", line = 281)
    public final synchronized void method1333(int arg0) {
        this.field2639 = true;
        field2659++;
        if (arg0 >= -95) {
            this.method1326(4L, null, 24, -11, null);
        }
    }

    @OriginalMember(owner = "client!uja", name = "h", descriptor = "(I)J", line = 293)
    public final long method1334(int arg0) {
        field2640++;
        return arg0 == 25326 ? this.field2656 : -123L;
    }

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "(I)Ljava/lang/String;", line = 320)
    public final String method1335(int arg0) {
        field2642++;
        if (arg0 != 0) {
            this.field2658 = null;
        }
        return this.field2654;
    }
}
