import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class771 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "Lod;")
    private class534 field10603 = new class9();

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "Lod;")
    private class534 field10623 = null;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lwt;")
    public static class330 field10604 = new class330();

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "[I")
    public static int[] field10615 = new int[8];

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "F")
    public static float field10613;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field10606;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field10610;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field10620;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    private int field10624;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    private int field10625;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "J")
    private long field10622;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "J")
    private long field10626;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "Lbu;")
    private class21 field10628;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "Ljava/lang/String;")
    private String field10627;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "Z")
    private volatile boolean field10617;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "Z")
    private boolean field10621;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I", line = 3)
    public final int method4259(int arg0) {
        field10618++;
        return arg0 <= 15 ? 36 : this.field10624;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)I", line = 14)
    public final int method4260(boolean arg0) {
        if (!arg0) {
            this.method4271(-128);
        }
        field10616++;
        if (this.field10628 == null) {
            return 0;
        }
        int var2 = this.field10628.method167(-10247);
        if (this.field10628.field307 && this.field10624 < this.field10628.field299) {
            return this.field10624 + 1;
        } else if (var2 >= 0 && (class127.field1916.length - 1) > var2) {
            return this.field10628.field309 == this.field10624 ? this.field10628.field299 : this.field10628.field309;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lod;B)V", line = 49)
    public final synchronized void method4261(class534 arg0, byte arg1) {
        field10612++;
        this.field10623 = this.field10603;
        this.field10603 = arg0;
        this.field10622 = class302.method1910(0);
        if (arg1 <= 0) {
            field10613 = -0.56085336F;
        }
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V", line = 62)
    public final void run() {
        while (!this.field10617) {
            long var1 = class302.method1910(0);
            synchronized (this) {
                try {
                    this.field10625++;
                    if (this.field10603 instanceof class9) {
                        this.field10603.method80(true, this.field10621);
                    } else {
                        long var4 = class302.method1910(0);
                        if (class379.field5542 == null || this.field10623 == null || this.field10623.method79(-4076) == 0 || this.field10622 < (var4 - ((long) this.field10623.method79(-4076)))) {
                            if (this.field10623 != null) {
                                this.field10621 = true;
                                this.field10623.method68(true);
                                this.field10623 = null;
                            }
                            if (this.field10621) {
                                class59.method415(true);
                                if (class379.field5542 != null) {
                                    class379.field5542.method458(0);
                                }
                            }
                            this.field10603.method80(true, this.field10621 || class379.field5542 != null && class379.field5542.method535());
                        } else {
                            int var6 = (int) ((var4 - this.field10622) * 255L / (long) this.field10623.method79(-4076));
                            int var7 = 255 - var6;
                            class59.method415(true);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class379.field5542.method458(0);
                            class147 var10 = class379.field5542.method508(class593.field8019, class140.field2048, true);
                            class379.field5542.method495(true, var10);
                            this.field10623.method80(true, true);
                            class379.field5542.method511();
                            var10.method1086(0, 0, 0, var8, 1);
                            class379.field5542.method495(true, var10);
                            class379.field5542.method458(0);
                            this.field10603.method80(true, true);
                            class379.field5542.method511();
                            var10.method1086(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class379.field5542 != null && !(this.field10603 instanceof class9)) {
                                class379.field5542.method548((byte) -93);
                            }
                        } catch (class566 var18) {
                            class664.method3681((byte) 124, var18.getMessage() + " (Recovered) " + class627.field8774.method1919(31), var18);
                            class793.method4365((byte) -41, true, 0);
                        }
                    }
                    Container var12;
                    if (class388.field5642 != null) {
                        var12 = class388.field5642;
                    } else if (class735.field10183 == null) {
                        var12 = class189.field2512;
                    } else {
                        var12 = class735.field10183;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class388.field5642 == var12) {
                        class388.field5642.getInsets();
                    }
                    this.field10621 = false;
                    if (class379.field5542 != null && !(this.field10603 instanceof class9) && this.field10628.method167(-10247) < class21.field329.method167(-10247)) {
                        class133.method1055(2445);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class302.method1910(0);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class438.method2636(true, (long) var15);
            }
        }
        field10611++;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 192)
    public final synchronized void method4262(int arg0) {
        if (arg0 == 26977) {
            this.field10621 = true;
            field10614++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Z", line = 208)
    public final synchronized boolean method4263(byte arg0) {
        field10606++;
        if (arg0 >= -115) {
            this.field10603 = null;
        }
        return this.field10603.method78(-18419, this.field10622);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIILjava/lang/Class;)Lnb;", line = 223)
    public static final class319 method4264(int arg0, int arg1, int arg2, Class arg3) {
        class243 var4 = class626.field8501[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class48 var5 = var4.field3272; var5 != null; var5 = var5.field726) {
            class319 var6 = var5.field725;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4600 == arg1 && var6.field4590 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Ljava/lang/String;", line = 248)
    public final String method4265(int arg0) {
        if (arg0 >= -94) {
            return null;
        } else {
            field10610++;
            return this.field10627;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I", line = 259)
    public final int method4266(byte arg0) {
        field10607++;
        int var2 = 98 / ((1 - arg0) / 44);
        return this.field10625;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I", line = 273)
    public static final int method4267(int arg0) {
        field10605++;
        if (arg0 != 1) {
            field10604 = null;
        }
        return class74.method660(false, (byte) 6);
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)Lbu;", line = 288)
    public final class21 method4268(byte arg0) {
        if (arg0 != -9) {
            this.field10624 = 9;
        }
        field10609++;
        return this.field10628;
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V", line = 299)
    public final void method4269(int arg0) {
        this.field10617 = true;
        if (arg0 != -1) {
            this.method4263((byte) -24);
        }
        field10619++;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V", line = 310)
    public static void method4270(byte arg0) {
        field10615 = null;
        field10604 = null;
        if (arg0 != -31) {
            field10604 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)J", line = 322)
    public final long method4271(int arg0) {
        if (arg0 != 1) {
            this.field10603 = null;
        }
        field10608++;
        return this.field10626;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;Lbu;IJ)V", line = 344)
    public final synchronized void method4272(int arg0, String arg1, class21 arg2, int arg3, long arg4) {
        if (arg0 != 0) {
            this.run();
        }
        this.field10628 = arg2;
        this.field10624 = arg3;
        this.field10626 = arg4;
        this.field10627 = arg1;
        field10620++;
    }
}
