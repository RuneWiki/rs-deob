import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class28 extends class33 {

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    private int field608 = 16;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "[Loe;")
    private class89[] field607 = new class89[8];

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Loe;")
    private class89 field609 = new class89();

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    private int field610 = 0;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    private int field612 = 0;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    private int field611 = -1;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lfc;)V", line = 6)
    public final synchronized void method174(class33 arg0) {
        arg0.method833(4);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lfc;)V", line = 10)
    public final synchronized void method175(class33 arg0) {
        class89 var2 = this.field607[method178(arg0)];
        var2.method591(arg0, -89);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 331)
    public class28() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field607[var1] = new class89();
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 23)
    public final synchronized void method176(int arg0) {
        do {
            if (this.field611 < 0) {
                this.method182(arg0);
                return;
            }
            if (this.field610 + arg0 < this.field611) {
                this.field610 += arg0;
                this.method182(arg0);
                return;
            }
            int var2 = this.field611 - this.field610;
            this.method182(var2);
            arg0 -= var2;
            this.field610 += var2;
            this.method181();
            class19 var3 = (class19) this.field609.method593(0);
            synchronized (var3) {
                int var5 = var3.method119(this);
                if (var5 < 0) {
                    var3.field477 = 0;
                    this.method177(var3);
                } else {
                    var3.field477 = var5;
                    this.method183(var3.field2621, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lda;)V", line = 67)
    private final void method177(class19 arg0) {
        arg0.method833(4);
        arg0.method120();
        class108 var2 = this.field609.field2011.field2621;
        if (this.field609.field2011 == var2) {
            this.field611 = -1;
        } else {
            this.field611 = ((class19) var2).field477;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Lfc;)I", line = 81)
    private static final int method178(class33 arg0) {
        return arg0.method212() >> 5;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([III)I", line = 85)
    private final int method179(int[] arg0, int arg1, int arg2) {
        this.field612 -= arg2;
        if (this.field612 <= 0) {
            this.field612 += class131.field3171 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class89 var5 = this.field607[var4];
                for (class33 var6 = (class33) var5.method593(0); var6 != null; var6 = (class33) var5.method582(false)) {
                    int var7 = method178(var6);
                    if (var4 != var7) {
                        this.field607[var7].method591(var6, -73);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class89 var19 = this.field607[var8];
            for (class33 var20 = (class33) var19.method593(0); var20 != null; var20 = (class33) var19.method582(false)) {
                var20.field851 = false;
                if (var20.field850 != null) {
                    var20.field850.field1700 = 0;
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
                    class89 var15 = this.field607[var12];
                    for (class33 var16 = (class33) var15.method593(0); var16 != null; var16 = (class33) var15.method582(false)) {
                        if (!var16.field851) {
                            class71 var17 = var16.field850;
                            if (var17 == null || var17.field1700 <= var13) {
                                if (var9 < this.field608) {
                                    int var18 = var16.method180(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1700 += var18;
                                    }
                                } else {
                                    var16.method176(arg2);
                                }
                                var16.field851 = true;
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([III)I", line = 219)
    public final synchronized int method180(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field611 < 0) {
                return this.method179(arg0, arg1, arg2);
            }
            if (this.field610 + arg2 < this.field611) {
                this.field610 += arg2;
                return this.method179(arg0, arg1, arg2);
            }
            int var4 = this.field611 - this.field610;
            var5 = this.method179(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field610 += var4;
            this.method181();
            class19 var6 = (class19) this.field609.method593(0);
            synchronized (var6) {
                int var8 = var6.method119(this);
                if (var8 < 0) {
                    var6.field477 = 0;
                    this.method177(var6);
                } else {
                    var6.field477 = var8;
                    this.method183(var6.field2621, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V", line = 263)
    private final void method181() {
        if (this.field610 <= 0) {
            return;
        }
        for (class19 var1 = (class19) this.field609.method593(0); var1 != null; var1 = (class19) this.field609.method582(false)) {
            var1.field477 -= this.field610;
        }
        this.field611 -= this.field610;
        this.field610 = 0;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 282)
    private final void method182(int arg0) {
        this.field612 -= arg0;
        if (this.field612 < 0) {
            this.field612 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class89 var3 = this.field607[var2];
            for (class33 var4 = (class33) var3.method593(0); var4 != null; var4 = (class33) var3.method582(false)) {
                var4.method176(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lsa;Lda;)V", line = 322)
    private final void method183(class108 arg0, class19 arg1) {
        while (this.field609.field2011 != arg0 && ((class19) arg0).field477 <= arg1.field477) {
            arg0 = arg0.field2621;
        }
        this.field609.method590(4, arg0, arg1);
        this.field611 = ((class19) this.field609.field2011.field2621).field477;
    }
}
