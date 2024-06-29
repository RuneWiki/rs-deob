import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class562 implements Runnable {

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "Lhd;")
    private class688 field8118 = new class519();

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "Lhd;")
    private class688 field8137 = null;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    private int field8132;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
    private int field8133;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "J")
    private long field8136;

    @OriginalMember(owner = "client!raa", name = "C", descriptor = "J")
    private long field8138;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "Lfc;")
    private class236 field8134;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "Lvk;")
    public static class337 field8111;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "Lf;")
    public static class701 field8119;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "Ljava/lang/String;")
    private String field8135;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "Z")
    private boolean field8115;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "Z")
    private volatile boolean field8129;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "[I")
    public static int[] field8114;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "[[Lgba;")
    public static class618[][] field8128;

    @OriginalMember(owner = "client!raa", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field8122++;
        while (!this.field8129) {
            long var1 = class301.method1787((byte) -79);
            synchronized (this) {
                try {
                    if (this.field8118 instanceof class519) {
                        this.field8118.method3083((byte) -71, this.field8115);
                    } else {
                        this.field8133++;
                        long var4 = class301.method1787((byte) 49);
                        if (class68.field1045 == null || this.field8137 == null || this.field8137.method3081(false) == 0 || this.field8136 < var4 - ((long) this.field8137.method3081(false))) {
                            if (this.field8137 != null) {
                                this.field8115 = true;
                                this.field8137.method3073(-16775);
                                this.field8137 = null;
                            }
                            if (this.field8115) {
                                class518.method3067(1);
                                if (class68.field1045 != null) {
                                    class68.field1045.method323(0);
                                }
                            }
                            this.field8118.method3083((byte) -43, this.field8115 || class68.field1045 != null && class68.field1045.method316());
                        } else {
                            int var6 = (int) ((var4 - this.field8136) * 255L / (long) this.field8137.method3081(false));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class518.method3067(1);
                            class68.field1045.method323(0);
                            class701 var10 = class68.field1045.method304(class467.field6533, class300.field4038, true);
                            class68.field1045.method1044(var10, (byte) 76);
                            this.field8137.method3083((byte) -79, true);
                            class68.field1045.method250();
                            var10.method3(0, 0, 0, var8, 1);
                            class68.field1045.method1044(var10, (byte) 76);
                            class68.field1045.method323(0);
                            this.field8118.method3083((byte) -60, true);
                            class68.field1045.method250();
                            var10.method3(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class68.field1045 != null && !(this.field8118 instanceof class519)) {
                                class68.field1045.method293();
                            }
                        } catch (class365 var17) {
                            class544.method3184(23383, var17.getMessage() + " (Recovered) " + class683.field9762.method1657(true), var17);
                            class435.method2608(-117, 0);
                        }
                    }
                    this.field8115 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class301.method1787((byte) -111);
            int var14 = (int) (20L - (var12 - var1));
            if (var14 > 0) {
                class151.method974((byte) -102, (long) var14);
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)I", line = 100)
    public final int method3281(byte arg0) {
        field8127++;
        if (arg0 > -21) {
            this.field8135 = null;
        }
        return this.field8132;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I", line = 111)
    public final int method3282(int arg0) {
        field8113++;
        if (this.field8134 == null) {
            return 0;
        }
        int var2 = this.field8134.method1434(10067);
        if (this.field8134.field3154 && this.field8132 < this.field8134.field3147) {
            return this.field8132 + 1;
        } else if (var2 >= 0 && var2 < (class70.field1066.length - 1)) {
            int var3 = -59 / ((arg0 - 1) / 48);
            return this.field8134.field3157 == this.field8132 ? this.field8134.field3147 : this.field8134.field3157;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V", line = 144)
    public final void method3283(int arg0) {
        if (arg0 == -1826593640) {
            field8116++;
            this.field8129 = true;
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)J", line = 155)
    public final long method3284(byte arg0) {
        field8125++;
        if (arg0 <= 80) {
            this.field8115 = false;
        }
        return this.field8138;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILhd;)V", line = 171)
    public final synchronized void method3285(int arg0, class688 arg1) {
        field8123++;
        this.field8137 = this.field8118;
        if (arg0 == 0) {
            this.field8118 = arg1;
            this.field8136 = class301.method1787((byte) -69);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(JIBLfc;Ljava/lang/String;)V", line = 184)
    public final synchronized void method3286(long arg0, int arg1, byte arg2, class236 arg3, String arg4) {
        if (arg2 > -28) {
            return;
        }
        this.field8134 = arg3;
        this.field8132 = arg1;
        this.field8138 = arg0;
        this.field8135 = arg4;
        field8130++;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)I", line = 199)
    public final int method3287(int arg0) {
        if (arg0 != 100) {
            this.field8137 = null;
        }
        field8117++;
        return this.field8133;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)Ljava/lang/String;", line = 210)
    public final String method3288(byte arg0) {
        if (arg0 == -123) {
            field8112++;
            return this.field8135;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(B)Lfc;", line = 221)
    public final class236 method3289(byte arg0) {
        if (arg0 == -81) {
            field8120++;
            return this.field8134;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(JIIZ)V", line = 234)
    public static final void method3290(long arg0, int arg1, int arg2, boolean arg3) {
        field8131++;
        int var5 = ((int) arg0 & 0x7DD0A) >> 14;
        int var6 = ((int) arg0 & 0x38278C) >> 20;
        if (!arg3) {
            field8111 = null;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class674.method3833(var6, -1, arg1, 0, var5, true, 0, arg2, 0);
            return;
        }
        class232 var8 = class37.field703.method807(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field3066;
            var10 = var8.field3105;
        } else {
            var9 = var8.field3105;
            var10 = var8.field3066;
        }
        int var11 = var8.field3073;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class674.method3833(0, -1, arg1, var11, 0, true, var9, arg2, var10);
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)V", line = 277)
    public final synchronized void method3291(int arg0) {
        field8121++;
        if (arg0 != 17335) {
            this.method3291(-24);
        }
        this.field8115 = true;
    }

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "(I)V", line = 288)
    public static void method3292(int arg0) {
        field8128 = null;
        field8111 = null;
        field8119 = null;
        if (arg0 == -2007) {
            field8114 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "(I)Z", line = 309)
    public final synchronized boolean method3293(int arg0) {
        if (arg0 < 76) {
            return false;
        } else {
            field8124++;
            return this.field8118.method3074((byte) 117, this.field8136);
        }
    }
}
