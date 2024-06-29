import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class54 {

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    private int field83 = 16;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[Lhe;")
    private class47[] field84 = new class47[8];

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lhe;")
    private class47 field82 = new class47();

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    private int field85 = 0;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    private int field86 = 0;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private int field87 = -1;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lj;)V", line = 7)
    public final synchronized void method22(class54 arg0) {
        class47 var2 = this.field84[method29(arg0)];
        var2.method440(arg0, (byte) 119);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lw;Lk;)V", line = 11)
    private final void method23(class127 arg0, class60 arg1) {
        while (this.field82.field1183 != arg0 && ((class60) arg0).field1530 <= arg1.field1530) {
            arg0 = arg0.field3059;
        }
        this.field82.method444(arg0, arg1, -28891);
        this.field87 = ((class60) this.field82.field1183.field3059).field1530;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 24)
    public final synchronized void method24(int arg0) {
        do {
            if (this.field87 < 0) {
                this.method27(arg0);
                return;
            }
            if (this.field85 + arg0 < this.field87) {
                this.field85 += arg0;
                this.method27(arg0);
                return;
            }
            int var2 = this.field87 - this.field85;
            this.method27(var2);
            arg0 -= var2;
            this.field85 += var2;
            this.method25();
            class60 var3 = (class60) this.field82.method443((byte) -111);
            synchronized (var3) {
                int var5 = var3.method562(this);
                if (var5 < 0) {
                    var3.field1530 = 0;
                    this.method26(var3);
                } else {
                    var3.field1530 = var5;
                    this.method23(var3.field3059, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 68)
    private final void method25() {
        if (this.field85 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field82.method443((byte) -111); var1 != null; var1 = (class60) this.field82.method434(true)) {
            var1.field1530 -= this.field85;
        }
        this.field87 -= this.field85;
        this.field85 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lk;)V", line = 85)
    private final void method26(class60 arg0) {
        arg0.method948(-63);
        arg0.method561();
        class127 var2 = this.field82.field1183.field3059;
        if (this.field82.field1183 == var2) {
            this.field87 = -1;
        } else {
            this.field87 = ((class60) var2).field1530;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 101)
    private final void method27(int arg0) {
        this.field86 -= arg0;
        if (this.field86 < 0) {
            this.field86 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class47 var3 = this.field84[var2];
            for (class54 var4 = (class54) var3.method443((byte) -111); var4 != null; var4 = (class54) var3.method434(true)) {
                var4.method24(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Lj;)V", line = 124)
    public final synchronized void method28(class54 arg0) {
        arg0.method948(-89);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(Lj;)I", line = 127)
    private static final int method29(class54 arg0) {
        return arg0.method65() >> 5;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([III)I", line = 131)
    private final int method30(int[] arg0, int arg1, int arg2) {
        this.field86 -= arg2;
        if (this.field86 <= 0) {
            this.field86 += class94.field2391 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class47 var5 = this.field84[var4];
                for (class54 var6 = (class54) var5.method443((byte) -111); var6 != null; var6 = (class54) var5.method434(true)) {
                    int var7 = method29(var6);
                    if (var4 != var7) {
                        this.field84[var7].method440(var6, (byte) 114);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class47 var19 = this.field84[var8];
            for (class54 var20 = (class54) var19.method443((byte) -111); var20 != null; var20 = (class54) var19.method434(true)) {
                var20.field1331 = false;
                if (var20.field1332 != null) {
                    var20.field1332.field1529 = 0;
                }
            }
        }
        int var9 = 0;
        int var10 = 255;
        int var11 = 7;
        while (var10 != 0) {
            int var12;
            int var13;
            if (var11 < 0) {
                var12 = var11 & 0x3;
                var13 = -(var11 >> 2);
            } else {
                var12 = var11;
                var13 = 0;
            }
            for (int var14 = var10 >>> var12 & 0x11111111; var14 != 0; var14 >>>= 0x4) {
                if ((var14 & 0x1) != 0) {
                    var10 &= ~(0x1 << var12);
                    class47 var15 = this.field84[var12];
                    for (class54 var16 = (class54) var15.method443((byte) -111); var16 != null; var16 = (class54) var15.method434(true)) {
                        if (!var16.field1331) {
                            class59 var17 = var16.field1332;
                            if (var17 == null || var17.field1529 <= var13) {
                                if (var9 < this.field83) {
                                    int var18 = var16.method31(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1529 += var18;
                                    }
                                } else {
                                    var16.method24(arg2);
                                }
                                var16.field1331 = true;
                            } else {
                                var10 |= 0x1 << var12;
                            }
                        }
                    }
                }
                var12 += 4;
                var13++;
            }
            var11--;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)I", line = 268)
    public final synchronized int method31(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field87 < 0) {
                return this.method30(arg0, arg1, arg2);
            }
            if (this.field85 + arg2 < this.field87) {
                this.field85 += arg2;
                return this.method30(arg0, arg1, arg2);
            }
            int var4 = this.field87 - this.field85;
            var5 = this.method30(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field85 += var4;
            this.method25();
            class60 var6 = (class60) this.field82.method443((byte) -111);
            synchronized (var6) {
                int var8 = var6.method562(this);
                if (var8 < 0) {
                    var6.field1530 = 0;
                    this.method26(var6);
                } else {
                    var6.field1530 = var8;
                    this.method23(var6.field3059, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 331)
    public class3() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field84[var1] = new class47();
        }
    }
}
