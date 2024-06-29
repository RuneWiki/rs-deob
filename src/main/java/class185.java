import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class185 implements Runnable {

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "Lsa;")
    private class206 field2796 = new class292();

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "Lsa;")
    private class206 field2807 = null;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
    private int field2806;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "J")
    private long field2804;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "J")
    private long field2808;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "Lqo;")
    private class21 field2805;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "Ljava/lang/String;")
    private String field2809;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "Z")
    private boolean field2789;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "Z")
    private volatile boolean field2801;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Lqo;")
    public final class21 method1271(int arg0) {
        if (arg0 != 255) {
            this.field2801 = false;
        }
        field2800++;
        return this.field2805;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)I")
    public final int method1272(byte arg0) {
        field2798++;
        if (arg0 != 43) {
            this.field2805 = null;
        }
        return this.field2806;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)I")
    public final int method1273(int arg0) {
        if (arg0 != 0) {
            this.method1280(null, -17, null, -85L, 40);
        }
        field2788++;
        return this.field2811;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lsa;Z)V")
    public final synchronized void method1274(class206 arg0, boolean arg1) {
        if (arg1) {
            field2791++;
            this.field2807 = this.field2796;
            this.field2796 = arg0;
            this.field2808 = class375.method2193(116);
        }
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
    public final void method1275(int arg0) {
        field2792++;
        if (arg0 == 1) {
            this.field2801 = true;
        }
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)J")
    public final long method1276(byte arg0) {
        if (arg0 > -68) {
            this.method1278((byte) 77);
        }
        field2786++;
        return this.field2804;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ICB)I")
    public static final int method1277(int arg0, char arg1, byte arg2) {
        field2799++;
        int var3 = arg1 << 4;
        int var4 = 27 / ((-arg2 - 54) / 61);
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var5 = Character.toLowerCase(arg1);
            var3 = (var5 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)I")
    public final int method1278(byte arg0) {
        field2795++;
        if (this.field2805 == null) {
            return 0;
        }
        int var2 = this.field2805.method226(4);
        if (this.field2805.field367 && this.field2805.field364 > this.field2806) {
            return this.field2806 + 1;
        } else if (var2 >= 0 && class472.field6456.length - 1 > var2) {
            int var3 = -75 % ((arg0 - 19) / 47);
            return this.field2805.field365 == this.field2806 ? this.field2805.field364 : this.field2805.field365;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)Z")
    public final synchronized boolean method1279(byte arg0) {
        if (arg0 <= 60) {
            this.field2804 = -78L;
        }
        field2787++;
        return this.field2796.method1378(this.field2808, -3650);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/lang/String;ILqo;JI)V")
    public final synchronized void method1280(String arg0, int arg1, class21 arg2, long arg3, int arg4) {
        this.field2806 = arg1;
        this.field2805 = arg2;
        field2790++;
        this.field2809 = arg0;
        if (arg4 == -1484216776) {
            this.field2804 = arg3;
        }
    }

    @OriginalMember(owner = "client!efa", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2801) {
            long var1 = class375.method2193(116);
            synchronized (this) {
                try {
                    this.field2811++;
                    if (this.field2796 instanceof class292) {
                        this.field2796.method1377(this.field2789, (byte) -123);
                    } else {
                        long var4 = class375.method2193(116);
                        if (class341.field4807 == null || this.field2807 == null || this.field2807.method1375(-11222) == 0 || this.field2808 < var4 - (long) this.field2807.method1375(-11222)) {
                            if (this.field2807 != null) {
                                this.field2789 = true;
                                this.field2807.method1376(31639);
                                this.field2807 = null;
                            }
                            if (this.field2789) {
                                class565.method3123(false);
                                if (class341.field4807 != null) {
                                    class341.field4807.method392(0);
                                }
                            }
                            this.field2796.method1377(this.field2789 || class341.field4807 != null && class341.field4807.method414(), (byte) 93);
                        } else {
                            int var6 = (int) ((var4 - this.field2808) * 255L / (long) this.field2807.method1375(-11222));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class565.method3123(false);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class341.field4807.method392(0);
                            class133 var10 = class341.field4807.method418(class228.field3251, class199.field2993, true);
                            class341.field4807.method464(var10, 25109);
                            this.field2807.method1377(true, (byte) -113);
                            class341.field4807.method511();
                            var10.method1045(0, 0, 0, var8, 1);
                            class341.field4807.method464(var10, 25109);
                            class341.field4807.method392(0);
                            this.field2796.method1377(true, (byte) -127);
                            class341.field4807.method511();
                            var10.method1045(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class341.field4807 != null && !(this.field2796 instanceof class292)) {
                                class341.field4807.method498(5);
                            }
                        } catch (class149 var18) {
                            class135.method1056(var18.getMessage() + " (Recovered) " + class243.field3401.method1882(102), var18, 1);
                            class421.method2435(true, 75, 0);
                        }
                    }
                    Container var12;
                    if (class218.field3143 != null) {
                        var12 = class218.field3143;
                    } else if (class514.field6818 == null) {
                        var12 = class670.field9145;
                    } else {
                        var12 = class514.field6818;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class218.field3143 == var12) {
                        class218.field3143.getInsets();
                    }
                    this.field2789 = false;
                    if (class341.field4807 != null && !(this.field2796 instanceof class292) && this.field2805.method226(4) < class21.field386.method226(4)) {
                        class659.method3576(-2);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class375.method2193(116);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class226.method1447((byte) -124, (long) var15);
            }
        }
        field2810++;
    }

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(B)V")
    public final synchronized void method1281(byte arg0) {
        this.field2789 = true;
        if (arg0 == 43) {
            field2793++;
        }
    }

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "(B)Ljava/lang/String;")
    public final String method1282(byte arg0) {
        if (arg0 != 21) {
            field2803 = -96;
        }
        field2785++;
        return this.field2809;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1283(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1283(-6, true, -119);
        }
        field2797++;
        return (arg2 & 0x10000) != 0;
    }
}
