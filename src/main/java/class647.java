import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class647 implements Runnable {

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lsn;")
    private class658 field8812 = new class30();

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Lsn;")
    private class658 field8825 = null;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8807 = 0;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "B")
    public static byte field8813 = -6;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    private int field8830;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    private int field8831;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "J")
    private long field8823;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "J")
    private long field8829;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Lnc;")
    private class26 field8826;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field8810;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Ljava/lang/String;")
    private String field8827;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
    private volatile boolean field8816;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Z")
    private boolean field8821;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3639(int arg0, int arg1, byte arg2) {
        if (arg2 <= 31) {
            field8807 = 81;
        }
        field8828++;
        return class411.method2454(256, arg1, arg0) | (arg0 & 0x40000) != 0 || class217.method1352(arg1, arg0, -33);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method3640(int arg0) {
        if (arg0 != 0) {
            this.field8812 = null;
        }
        field8805++;
        return this.field8827;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)J")
    public final long method3641(int arg0) {
        if (arg0 != 0) {
            this.field8831 = -101;
        }
        field8809++;
        return this.field8829;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lnc;JILjava/lang/String;I)V")
    public final synchronized void method3642(class26 arg0, long arg1, int arg2, String arg3, int arg4) {
        this.field8831 = arg2;
        this.field8829 = arg1;
        if (arg4 == 0) {
            this.field8827 = arg3;
            this.field8826 = arg0;
            field8817++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lsn;I)V")
    public final synchronized void method3643(class658 arg0, int arg1) {
        field8815++;
        this.field8825 = this.field8812;
        this.field8812 = arg0;
        this.field8823 = class349.method2069(true);
        if (arg1 != -1) {
            this.field8830 = 38;
        }
    }

    @OriginalMember(owner = "client!tl", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field8816) {
            long var1 = class349.method2069(true);
            synchronized (this) {
                try {
                    this.field8830++;
                    if (this.field8812 instanceof class30) {
                        this.field8812.method293(this.field8821, false);
                    } else {
                        long var4 = class349.method2069(true);
                        if (class363.field4526 == null || this.field8825 == null || this.field8825.method291((byte) 109) == 0 || this.field8823 < (var4 - ((long) this.field8825.method291((byte) 93)))) {
                            if (this.field8825 != null) {
                                this.field8821 = true;
                                this.field8825.method290(-123);
                                this.field8825 = null;
                            }
                            if (this.field8821) {
                                class419.method2502(-16315);
                                if (class363.field4526 != null) {
                                    class363.field4526.method13(0);
                                }
                            }
                            this.field8812.method293(this.field8821 || class363.field4526 != null && class363.field4526.method629(), false);
                        } else {
                            int var6 = (int) ((var4 - this.field8823) * 255L / (long) this.field8825.method291((byte) 123));
                            int var7 = 255 - var6;
                            class419.method2502(-16315);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class363.field4526.method13(0);
                            class312 var10 = class363.field4526.method638(class701.field9880, class705.field9921, true);
                            class363.field4526.method636(var10, (byte) 101);
                            this.field8825.method293(true, false);
                            class363.field4526.method20();
                            var10.method240(0, 0, 0, var8, 1);
                            class363.field4526.method636(var10, (byte) 101);
                            class363.field4526.method13(0);
                            this.field8812.method293(true, false);
                            class363.field4526.method20();
                            var10.method240(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class363.field4526 != null && !(this.field8812 instanceof class30)) {
                                class363.field4526.method591((byte) 86);
                            }
                        } catch (class677 var18) {
                            class705.method4008(var18, var18.getMessage() + " (Recovered) " + class90.field1195.method1874(0), -126);
                            class677.method3810(true, 0, true);
                        }
                    }
                    Container var12;
                    if (class645.field8790 != null) {
                        var12 = class645.field8790;
                    } else if (class345.field4331 == null) {
                        var12 = class672.field9220;
                    } else {
                        var12 = class345.field4331;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class645.field8790 == var12) {
                        class645.field8790.getInsets();
                    }
                    this.field8821 = false;
                    if (class363.field4526 != null && !(this.field8812 instanceof class30) && this.field8826.method256(27) < class26.field411.method256(49)) {
                        class387.method2268((byte) 37);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class349.method2069(true);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class594.method3405((long) var15, 16711680);
            }
        }
        field8824++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
    public final int method3644(byte arg0) {
        field8818++;
        if (this.field8826 == null) {
            return 0;
        } else if (arg0 <= 4) {
            return 1;
        } else {
            int var2 = this.field8826.method256(51);
            if (this.field8826.field381 && this.field8826.field382 > this.field8831) {
                return this.field8831 + 1;
            } else if (var2 >= 0 && var2 < class425.field5638.length - 1) {
                return this.field8826.field389 == this.field8831 ? this.field8826.field382 : this.field8826.field389;
            } else {
                return 100;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
    public static void method3645(int arg0) {
        field8810 = null;
        if (arg0 != -18934) {
            method3649(124, 58, -13, -9);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public final synchronized void method3646(byte arg0) {
        field8806++;
        if (arg0 == 116) {
            this.field8821 = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
    public final void method3647(byte arg0) {
        if (arg0 == -55) {
            field8814++;
            this.field8816 = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)Z")
    public final synchronized boolean method3648(int arg0) {
        if (arg0 <= 89) {
            this.method3646((byte) -59);
        }
        field8820++;
        return this.field8812.method286(this.field8823, -114);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
    public static final void method3649(int arg0, int arg1, int arg2, int arg3) {
        field8819++;
        int var4 = -60 / ((90 - arg3) / 36);
        int var5 = class118.field1503.field10668.method1581(0) * arg2 >> 8;
        if (arg0 == -1 && !class52.field712) {
            class60.method516((byte) 126);
        } else if (arg0 != -1 && (class36.field542 != arg0 || !class728.method4115((byte) 120)) && var5 != 0 && !class52.field712) {
            class550.method3225(false, 0, 0, class599.field8106, arg1, arg0, var5);
            class133.method991(91);
        }
        if (class36.field542 != arg0) {
            class604.field8150 = null;
        }
        class36.field542 = arg0;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)I")
    public final int method3650(byte arg0) {
        if (arg0 <= 114) {
            this.method3647((byte) -31);
        }
        field8804++;
        return this.field8830;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Lnc;")
    public final class26 method3651(byte arg0) {
        if (arg0 < 27) {
            return null;
        } else {
            field8808++;
            return this.field8826;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
    public static final boolean method3652(int arg0, int arg1) {
        field8811++;
        if (class512.field7234[arg0]) {
            return true;
        } else if (class741.field10314.method432(false, arg0)) {
            int var2 = class741.field10314.method431(4, arg0);
            if (var2 == 0) {
                class512.field7234[arg0] = true;
                return true;
            }
            if (class316.field3880[arg0] == null) {
                class316.field3880[arg0] = new class620[var2];
            }
            for (int var3 = arg1; var3 < var2; var3++) {
                if (class316.field3880[arg0][var3] == null) {
                    byte[] var4 = class741.field10314.method437(arg0, (byte) 94, var3);
                    if (var4 != null) {
                        class620 var5 = class316.field3880[arg0][var3] = new class620();
                        var5.field8515 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3518(0, new class403(var4));
                    }
                }
            }
            class512.field7234[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)I")
    public final int method3653(int arg0) {
        if (arg0 != 0) {
            this.method3641(89);
        }
        field8822++;
        return this.field8831;
    }
}
