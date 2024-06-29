import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class418 {

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Lvm;")
    private class589 field5664 = new class589();

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "Lvm;")
    private class589 field5669 = new class589();

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "Lvm;")
    private class589 field5671 = new class589();

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "Lvm;")
    private class589 field5672 = new class589();

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "Lgw;")
    private class148 field5674 = new class148(4);

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "B")
    private byte field5678 = 0;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "I")
    public volatile int field5677 = 0;

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "I")
    public volatile int field5680 = 0;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "Lgw;")
    private class148 field5679 = new class148(8);

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "Lpn;")
    public static class635 field5656 = null;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Llu;")
    public static class610 field5655 = new class610(65, -1);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
    private int field5673;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "J")
    private long field5676;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "Lud;")
    private class32 field5681;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "Lde;")
    private class455 field5675;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Z")
    public final boolean method2458(int arg0) {
        field5668++;
        int var2 = -115 / ((arg0 + 13) / 58);
        return this.method2462(0) >= 20;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)Z")
    public final boolean method2459(boolean arg0) {
        field5670++;
        if (arg0) {
            return true;
        } else {
            return this.method2463(false) >= 20;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIZBI)Lud;")
    public final class32 method2460(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field5667++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class32 var8 = new class32();
        var8.field3179 = arg2;
        var8.field7109 = var6;
        var8.field392 = arg3;
        if (arg4 >= -16) {
            field5655 = null;
        }
        if (arg2) {
            if (this.method2462(0) >= 20) {
                throw new RuntimeException();
            }
            this.field5664.method3500(var8, false);
        } else if (this.method2463(false) < 20) {
            this.field5671.method3500(var8, false);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
    public final void method2461(int arg0) {
        field5659++;
        if (arg0 == -12492 && this.field5675 != null) {
            this.field5675.method2767(0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)I")
    public final int method2462(int arg0) {
        field5657++;
        if (arg0 != 0) {
            this.field5678 = -113;
        }
        return this.field5664.method3499((byte) -120) + this.field5669.method3499((byte) 125);
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)I")
    private final int method2463(boolean arg0) {
        field5662++;
        if (arg0) {
            this.field5664 = null;
        }
        return this.field5671.method3499((byte) -75) + this.field5672.method3499((byte) 10);
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V")
    public static void method2464(int arg0) {
        if (arg0 != 3) {
            field5653 = -20;
        }
        field5655 = null;
        field5656 = null;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(Z)V")
    public final void method2465(boolean arg0) {
        field5661++;
        try {
            if (!arg0) {
                this.field5678 = 56;
            }
            this.field5675.method2761((byte) 107);
        } catch (Exception var2) {
        }
        this.field5677++;
        this.field5678 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5675 = null;
        this.field5680 = -1;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILde;Z)V")
    public final void method2466(int arg0, class455 arg1, boolean arg2) {
        if (this.field5675 != null) {
            try {
                this.field5675.method2761((byte) 110);
            } catch (Exception var8) {
            }
            this.field5675 = null;
        }
        field5665++;
        this.field5675 = arg1;
        this.method2470(0);
        this.method2467((byte) 127, arg2);
        this.field5681 = null;
        this.field5679.field2177 = arg0;
        while (true) {
            class32 var4 = (class32) this.field5669.method3506(0);
            if (var4 == null) {
                while (true) {
                    class32 var5 = (class32) this.field5672.method3506(arg0);
                    if (var5 == null) {
                        if (this.field5678 != 0) {
                            try {
                                this.field5674.field2177 = 0;
                                this.field5674.method1049(-1, 4);
                                this.field5674.method1049(-1, this.field5678);
                                this.field5674.method1027(arg0 + 255, 0);
                                this.field5675.method2765(-116, 0, 4, this.field5674.field2146);
                            } catch (IOException var7) {
                                try {
                                    this.field5675.method2761((byte) 109);
                                } catch (Exception var6) {
                                }
                                this.field5675 = null;
                                this.field5680 = -2;
                                this.field5677++;
                            }
                        }
                        this.field5673 = 0;
                        this.field5676 = class598.method3538(true);
                        return;
                    }
                    this.field5671.method3500(var5, false);
                }
            }
            this.field5664.method3500(var4, false);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BZ)V")
    public final void method2467(byte arg0, boolean arg1) {
        field5663++;
        if (this.field5675 == null) {
            return;
        }
        try {
            this.field5674.field2177 = 0;
            this.field5674.method1049(-1, arg1 ? 2 : 3);
            this.field5674.method1056(0, false);
            this.field5675.method2765(-61, 0, 4, this.field5674.field2146);
            if (arg0 <= 126) {
                this.method2469((byte) -100);
            }
        } catch (IOException var4) {
            try {
                this.field5675.method2761((byte) 24);
            } catch (Exception var3) {
            }
            this.field5680 = -2;
            this.field5677++;
            this.field5675 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
    public final boolean method2468(byte arg0) {
        if (this.field5675 != null) {
            long var2 = class598.method3538(true);
            int var4 = (int) (var2 - this.field5676);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5676 = var2;
            this.field5673 += var4;
            if (this.field5673 > 30000) {
                try {
                    this.field5675.method2761((byte) 78);
                } catch (Exception var27) {
                }
                this.field5675 = null;
            }
        }
        field5658++;
        if (this.field5675 == null) {
            return this.method2462(0) == 0 && this.method2463(false) == 0;
        }
        try {
            this.field5675.method2764((byte) -98);
            if (arg0 < 122) {
                this.field5679 = null;
            }
            for (class32 var5 = (class32) this.field5664.method3505(-107); var5 != null; var5 = (class32) this.field5664.method3501((byte) 111)) {
                this.field5674.field2177 = 0;
                this.field5674.method1049(-1, 1);
                this.field5674.method1056((int) var5.field7109, false);
                this.field5675.method2765(-91, 0, 4, this.field5674.field2146);
                this.field5669.method3500(var5, false);
            }
            for (class32 var6 = (class32) this.field5671.method3505(-49); var6 != null; var6 = (class32) this.field5671.method3501((byte) 41)) {
                this.field5674.field2177 = 0;
                this.field5674.method1049(-1, 0);
                this.field5674.method1056((int) var6.field7109, false);
                this.field5675.method2765(-126, 0, 4, this.field5674.field2146);
                this.field5672.method3500(var6, false);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5675.method2762(13074);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5673 = 0;
                byte var9 = 0;
                if (this.field5681 == null) {
                    var9 = 8;
                } else if (this.field5681.field394 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field5681.field390.field2146.length - this.field5681.field392;
                    int var11 = 512 - this.field5681.field394;
                    if (var11 > (var10 - this.field5681.field390.field2177)) {
                        var11 = var10 - this.field5681.field390.field2177;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field5675.method2769(this.field5681.field390.field2177, this.field5681.field390.field2146, -2, var11);
                    if (this.field5678 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field5681.field390.field2146[this.field5681.field390.field2177 + var12] = (byte) class354.method2138(this.field5681.field390.field2146[this.field5681.field390.field2177 + var12], this.field5678);
                        }
                    }
                    this.field5681.field394 += var11;
                    this.field5681.field390.field2177 += var11;
                    if (this.field5681.field390.field2177 == var10) {
                        this.field5681.method2987(-1);
                        this.field5681.field3178 = false;
                        this.field5681 = null;
                    } else if (this.field5681.field394 == 512) {
                        this.field5681.field394 = 0;
                    }
                } else {
                    int var13 = var9 - this.field5679.field2177;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field5675.method2769(this.field5679.field2177, this.field5679.field2146, -2, var13);
                    if (this.field5678 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field5679.field2146[this.field5679.field2177 + var14] = (byte) class354.method2138(this.field5679.field2146[this.field5679.field2177 + var14], this.field5678);
                        }
                    }
                    this.field5679.field2177 += var13;
                    if (this.field5679.field2177 >= var9) {
                        if (this.field5681 == null) {
                            this.field5679.field2177 = 0;
                            int var15 = this.field5679.method1032((byte) -33);
                            int var16 = this.field5679.method1045(true);
                            int var17 = this.field5679.method1032((byte) -33);
                            int var18 = this.field5679.method1026(-917302120);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class32 var24;
                            if (var20) {
                                for (var24 = (class32) this.field5672.method3505(91); var24 != null && var24.field7109 != var21; var24 = (class32) this.field5672.method3501((byte) 95)) {
                                }
                            } else {
                                for (var24 = (class32) this.field5669.method3505(-104); var24 != null && var24.field7109 != var21; var24 = (class32) this.field5669.method3501((byte) 38)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field5681 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field5681.field390 = new class148(this.field5681.field392 + var18 + var25);
                            this.field5681.field390.method1049(-1, var19);
                            this.field5681.field390.method1058(602643080, var18);
                            this.field5681.field394 = 8;
                            this.field5679.field2177 = 0;
                        } else if (this.field5681.field394 != 0) {
                            throw new IOException();
                        } else if (this.field5679.field2146[0] == -1) {
                            this.field5679.field2177 = 0;
                            this.field5681.field394 = 1;
                        } else {
                            this.field5681 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5675.method2761((byte) 107);
            } catch (Exception var26) {
            }
            this.field5675 = null;
            this.field5680 = -2;
            this.field5677++;
            return this.method2462(0) == 0 && this.method2463(false) == 0;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
    public final void method2469(byte arg0) {
        if (this.field5675 != null) {
            this.field5675.method2761((byte) 43);
        }
        field5654++;
        int var2 = 47 % ((-arg0 - 7) / 37);
    }

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "(I)V")
    private final void method2470(int arg0) {
        field5666++;
        if (this.field5675 == null) {
            return;
        }
        try {
            this.field5674.field2177 = arg0;
            this.field5674.method1049(-1, 6);
            this.field5674.method1056(3, false);
            this.field5675.method2765(-104, 0, 4, this.field5674.field2146);
        } catch (IOException var3) {
            try {
                this.field5675.method2761((byte) 86);
            } catch (Exception var2) {
            }
            this.field5677++;
            this.field5680 = -2;
            this.field5675 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
    public final void method2471(byte arg0) {
        field5660++;
        if (this.field5675 == null) {
            return;
        }
        try {
            this.field5674.field2177 = 0;
            this.field5674.method1049(-1, 7);
            if (arg0 < 99) {
                this.method2468((byte) -57);
            }
            this.field5674.method1056(0, false);
            this.field5675.method2765(-99, 0, 4, this.field5674.field2146);
        } catch (IOException var3) {
            try {
                this.field5675.method2761((byte) 83);
            } catch (Exception var2) {
            }
            this.field5675 = null;
            this.field5677++;
            this.field5680 = -2;
        }
    }
}
