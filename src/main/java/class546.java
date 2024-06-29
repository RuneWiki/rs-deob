import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class546 implements Runnable {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lno;")
    private class525 field7778 = new class425();

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Lno;")
    private class525 field7794 = null;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
    public static boolean field7791 = false;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field7802 = -1;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    private int field7792;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    private int field7795;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "J")
    private long field7797;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "J")
    private long field7801;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "Lir;")
    private class27 field7800;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Ljava/lang/String;")
    private String field7796;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Z")
    private boolean field7781;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Z")
    private volatile boolean field7785;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Z")
    public final synchronized boolean method3087(int arg0) {
        if (arg0 < 42) {
            return true;
        } else {
            field7780++;
            return this.field7778.method2451(-124, this.field7797);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public final synchronized void method3088(byte arg0) {
        if (arg0 != -55) {
            this.method3092(-14);
        }
        field7789++;
        this.field7781 = true;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
    public final int method3089(int arg0) {
        field7793++;
        return arg0 < 68 ? 62 : this.field7795;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method3090(byte arg0) {
        if (arg0 == 98) {
            field7787++;
            return this.field7796;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
    public static final int method3091(int arg0, int arg1) {
        if (arg1 != 802983975) {
            method3091(70, -123);
        }
        field7783++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
    public final void run() {
        field7803++;
        while (!this.field7785) {
            long var1 = class557.method3157(-91);
            synchronized (this) {
                try {
                    if (this.field7778 instanceof class425) {
                        this.field7778.method2452(this.field7781, (byte) 111);
                    } else {
                        this.field7792++;
                        long var4 = class557.method3157(-118);
                        if (class701.field9813 == null || this.field7794 == null || this.field7794.method2447((byte) -93) == 0 || this.field7797 < var4 - ((long) this.field7794.method2447((byte) -93))) {
                            if (this.field7794 != null) {
                                this.field7781 = true;
                                this.field7794.method2450(-4211);
                                this.field7794 = null;
                            }
                            if (this.field7781) {
                                class80.method421(0);
                                if (class701.field9813 != null) {
                                    class701.field9813.method1002(0);
                                }
                            }
                            this.field7778.method2452(this.field7781 || class701.field9813 != null && class701.field9813.method946(), (byte) 120);
                        } else {
                            int var6 = (int) ((var4 - this.field7797) * 255L / (long) this.field7794.method2447((byte) -93));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class80.method421(0);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class701.field9813.method1002(0);
                            class534 var10 = class701.field9813.method1025(class146.field1618, class338.field4244, true);
                            class701.field9813.method3197(-1427211255, var10);
                            this.field7794.method2452(true, (byte) -86);
                            class701.field9813.method1045();
                            var10.method314(0, 0, 0, var8, 1);
                            class701.field9813.method3197(-1427211255, var10);
                            class701.field9813.method1002(0);
                            this.field7778.method2452(true, (byte) -128);
                            class701.field9813.method1045();
                            var10.method314(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class701.field9813 != null && !(this.field7778 instanceof class425)) {
                                class701.field9813.method979();
                            }
                        } catch (class20 var17) {
                            class333.method1923(var17, true, var17.getMessage() + " (Recovered) " + class338.field4252.method2560(false));
                            class434.method2489(0, (byte) 92);
                        }
                    }
                    this.field7781 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class557.method3157(-105);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class452.method2602((long) var14, (byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
    public final int method3092(int arg0) {
        field7790++;
        if (this.field7800 == null) {
            return 0;
        }
        int var2 = this.field7800.method149((byte) 72);
        if (this.field7800.field259 && this.field7800.field257 > this.field7795) {
            return this.field7795 + 1;
        } else if (var2 < 0 || var2 >= class140.field1552.length - 1) {
            return 100;
        } else if (this.field7800.field254 == this.field7795) {
            return this.field7800.field257;
        } else {
            int var3 = -20 % ((arg0 + 29) / 49);
            return this.field7800.field254;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)J")
    public final long method3093(byte arg0) {
        int var2 = 113 % ((53 - arg0) / 58);
        field7784++;
        return this.field7801;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)Lir;")
    public final class27 method3094(int arg0) {
        if (arg0 != 0) {
            this.field7801 = 60L;
        }
        field7779++;
        return this.field7800;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;JBILir;)V")
    public final synchronized void method3095(String arg0, long arg1, byte arg2, int arg3, class27 arg4) {
        this.field7796 = arg0;
        this.field7800 = arg4;
        if (arg2 >= 5) {
            this.field7801 = arg1;
            field7799++;
            this.field7795 = arg3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Z")
    public static final boolean method3096(int arg0, int arg1) {
        field7798++;
        if (arg0 != -4) {
            method3100(-108, 45, 7, -116, -76, -126, 101, 92);
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
    public final int method3097(boolean arg0) {
        field7788++;
        if (arg0) {
            method3096(7, 45);
        }
        return this.field7792;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lno;Z)V")
    public final synchronized void method3098(class525 arg0, boolean arg1) {
        this.field7794 = this.field7778;
        field7782++;
        this.field7778 = arg0;
        if (!arg1) {
            field7791 = true;
        }
        this.field7797 = class557.method3157(-51);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    public final void method3099(byte arg0) {
        int var2 = -99 / ((22 - arg0) / 56);
        field7777++;
        this.field7785 = true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7786++;
        if (arg7 <= 38) {
            field7802 = 36;
        }
        int var8 = arg1 - arg0;
        int var9 = arg0 + arg5;
        for (int var10 = arg5; var10 < var9; var10++) {
            class315.method1809(class557.field7954[var10], arg4, -128, arg6, arg2);
        }
        for (int var11 = arg1; var11 > var8; var11--) {
            class315.method1809(class557.field7954[var11], arg4, -128, arg6, arg2);
        }
        int var12 = arg2 - arg0;
        int var13 = arg0 + arg6;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class557.field7954[var14];
            class315.method1809(var15, arg4, -128, arg6, var13);
            class315.method1809(var15, arg3, -128, var13, var12);
            class315.method1809(var15, arg4, -128, var12, arg2);
        }
    }
}
