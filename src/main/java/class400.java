import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class400 extends class337 {

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public int field5292 = 0;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Ljava/lang/String;")
    public String field5299 = null;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "Z")
    private boolean field5301 = true;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field5291 = -1;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Luw;")
    public static class208 field5294 = new class208(1, 8);

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "B")
    public byte field5287;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "B")
    public byte field5289;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "J")
    public long field5290;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Lwm;")
    public static class30 field5300;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
    private boolean field5302;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[I")
    private int[] field5281;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[Lfv;")
    public class746[] field5293;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V", line = 7)
    public final void method2309(int arg0, int arg1) {
        ++field5283;
        --this.field5292;
        if (arg1 != 24105) {
            field5294 = null;
        }
        if (this.field5292 == 0) {
            this.field5293 = null;
        } else {
            class642.method3474(this.field5293, arg0 + 1, this.field5293, arg0, -arg0 + this.field5292);
        }
        this.field5281 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lmc;I)V", line = 30)
    private final void method2310(class234 arg0, int arg1) {
        ++field5297;
        int var3 = arg0.method1509(true);
        if ((var3 & 1) != 0) {
            this.field5302 = true;
        }
        if (~(var3 & 2) != -1) {
            this.field5301 = true;
        }
        super.field4108 = arg0.method1516(-11290);
        this.field5290 = arg0.method1516(-11290);
        this.field5299 = arg0.method1540((byte) -122);
        if (arg1 == 19503) {
            arg0.method1509(true);
            this.field5289 = arg0.method1554(27806);
            this.field5287 = arg0.method1554(arg1 ^ 8369);
            this.field5292 = arg0.method1553((byte) 77);
            if (~this.field5292 < -1) {
                this.field5293 = new class746[this.field5292];
                for (int var4 = 0; this.field5292 > var4; ++var4) {
                    class746 var5 = new class746();
                    if (this.field5302) {
                        arg0.method1516(-11290);
                    }
                    if (this.field5301) {
                        var5.field10194 = arg0.method1540((byte) -126);
                    }
                    var5.field10192 = arg0.method1554(27806);
                    var5.field10201 = arg0.method1553((byte) 89);
                    this.field5293[var4] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)V", line = 86)
    private final void method2311(int arg0, int arg1) {
        if (this.field5293 == null) {
            this.field5293 = new class746[arg0];
        } else {
            class642.method3474(this.field5293, 0, this.field5293 = new class746[arg0], 0, this.field5292);
        }
        int var3 = 37 % ((arg1 - 34) / 37);
        ++field5286;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)[I", line = 103)
    public final int[] method2312(byte arg0) {
        ++field5282;
        if (arg0 > -32) {
            this.method2316((class746) null, 111);
        }
        if (this.field5281 == null) {
            String[] var2 = new String[this.field5292];
            this.field5281 = new int[this.field5292];
            int var3 = 0;
            while (~this.field5292 < ~var3) {
                var2[var3] = this.field5293[var3].field10194;
                this.field5281[var3] = var3++;
            }
            class347.method2012(this.field5281, (byte) 41, var2);
        }
        return this.field5281;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I", line = 134)
    public static final int method2313(byte arg0) {
        ++field5279;
        if (class9.field80 != null) {
            return 3;
        } else {
            if (arg0 != -101) {
                method2313((byte) 9);
            }
            return class317.field3950 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 154)
    public static final void method2314(int arg0) {
        if (arg0 < -29) {
            for (int var1 = 0; ~var1 > ~class349.field4271; ++var1) {
                int var2 = class88.field1224[var1];
                class232 var3 = (class232) class444.field5811.method2616((long) var2, (byte) 101);
                if (var3 != null) {
                    class727 var4 = var3.field3125;
                    class102.method586(false, var4.field9545.field3314, var4);
                }
            }
            ++field5280;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 184)
    public final int method2315(String arg0, byte arg1) {
        ++field5296;
        for (int var3 = 0; ~this.field5292 < ~var3; ++var3) {
            if (this.field5293[var3].field10194.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        if (arg1 < 89) {
            this.method2309(78, 76);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lfv;I)V", line = 209)
    public final void method2316(class746 arg0, int arg1) {
        if (this.field5293 == null || this.field5293.length <= this.field5292) {
            this.method2311(this.field5292 + 5, 102);
        }
        int var3 = 0 / ((arg1 - -12) / 54);
        ++field5298;
        this.field5293[this.field5292++] = arg0;
        this.field5281 = null;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V", line = 235)
    public static final void method2317(byte arg0) {
        ++field5295;
        int var1 = -10 % ((-40 - arg0) / 32);
        if (class288.field3676) {
            while (true) {
                while (~class292.field3719 > ~class21.field199.length) {
                    class230 var2 = class21.field199[class292.field3719];
                    if (var2 != null && var2.field3099 == -1) {
                        if (class500.field6432 == null) {
                            class500.field6432 = class129.field1729.method4315(-3, var2.field3101);
                        }
                        int var3 = class500.field6432.field2820;
                        if (var3 == -1) {
                            return;
                        }
                        ++class292.field3719;
                        var2.field3099 = var3;
                        class500.field6432 = null;
                    } else {
                        ++class292.field3719;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lmc;)V", line = 305)
    public class400(class234 arg0) {
        this.method2310(arg0, 19503);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 286)
    public static void method2318(int arg0) {
        field5294 = null;
        if (arg0 != -101) {
            method2317((byte) 25);
        }
        field5300 = null;
    }
}
