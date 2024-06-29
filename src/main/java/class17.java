import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class17 extends class3 {

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    private int field331 = 32;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "[Lp;")
    private class95[] field332 = new class95[8];

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lp;")
    private class95 field330 = new class95();

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    private int field333 = -1;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    private int field334 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "([III)I", line = 4)
    private final int method169(int[] arg0, int arg1, int arg2) {
        this.field334 -= arg2;
        if (this.field334 <= 0) {
            this.field334 += class24.field603 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class95 var5 = this.field332[var4];
                for (class3 var6 = (class3) var5.method798(false); var6 != null; var6 = (class3) var5.method792((byte) -87)) {
                    int var7 = method176(var6);
                    if (var4 != var7) {
                        this.field332[var7].method795(var6, -76);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class95 var19 = this.field332[var8];
            for (class3 var20 = (class3) var19.method798(false); var20 != null; var20 = (class3) var19.method792((byte) -87)) {
                var20.field29 = false;
                if (var20.field28 != null) {
                    var20.field28.field879 = 0;
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
                    class95 var15 = this.field332[var12];
                    for (class3 var16 = (class3) var15.method798(false); var16 != null; var16 = (class3) var15.method792((byte) -87)) {
                        if (!var16.field29) {
                            class39 var17 = var16.field28;
                            if (var17 == null || var17.field879 <= var13) {
                                if (var9 < this.field331) {
                                    int var18 = var16.method13(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field879 += var18;
                                    }
                                } else {
                                    var16.method15(arg2);
                                }
                                var16.field29 = true;
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

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 137)
    public final synchronized void method15(int arg0) {
        do {
            if (this.field333 < 0) {
                this.method171(arg0);
                return;
            }
            if (this.field335 + arg0 < this.field333) {
                this.field335 += arg0;
                this.method171(arg0);
                return;
            }
            int var2 = this.field333 - this.field335;
            this.method171(var2);
            arg0 -= var2;
            this.field335 += var2;
            this.method170();
            class28 var3 = (class28) this.field330.method798(false);
            synchronized (var3) {
                int var5 = var3.method248(this);
                if (var5 < 0) {
                    var3.field684 = 0;
                    this.method174(var3);
                } else {
                    var3.field684 = var5;
                    this.method173(var3.field1502, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V", line = 184)
    private final void method170() {
        if (this.field335 <= 0) {
            return;
        }
        for (class28 var1 = (class28) this.field330.method798(false); var1 != null; var1 = (class28) this.field330.method792((byte) -87)) {
            var1.field684 -= this.field335;
        }
        this.field333 -= this.field335;
        this.field335 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 208)
    private final void method171(int arg0) {
        this.field334 -= arg0;
        if (this.field334 < 0) {
            this.field334 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class95 var3 = this.field332[var2];
            for (class3 var4 = (class3) var3.method798(false); var4 != null; var4 = (class3) var3.method792((byte) -87)) {
                var4.method15(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lac;)V", line = 232)
    public final synchronized void method172(class3 arg0) {
        class95 var2 = this.field332[method176(arg0)];
        var2.method795(arg0, -85);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 337)
    public class17() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field332[var1] = new class95();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lla;Leb;)V", line = 242)
    private final void method173(class68 arg0, class28 arg1) {
        while (this.field330.field2260 != arg0 && ((class28) arg0).field684 <= arg1.field684) {
            arg0 = arg0.field1502;
        }
        this.field330.method788((byte) -15, arg0, arg1);
        this.field333 = ((class28) this.field330.field2260.field1502).field684;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Leb;)V", line = 251)
    private final void method174(class28 arg0) {
        arg0.method498(106);
        arg0.method249();
        class68 var2 = this.field330.field2260.field1502;
        if (this.field330.field2260 == var2) {
            this.field333 = -1;
        } else {
            this.field333 = ((class28) var2).field684;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)I", line = 266)
    public final synchronized int method13(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field333 < 0) {
                return this.method169(arg0, arg1, arg2);
            }
            if (this.field335 + arg2 < this.field333) {
                this.field335 += arg2;
                return this.method169(arg0, arg1, arg2);
            }
            int var4 = this.field333 - this.field335;
            var5 = this.method169(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field335 += var4;
            this.method170();
            class28 var6 = (class28) this.field330.method798(false);
            synchronized (var6) {
                int var8 = var6.method248(this);
                if (var8 < 0) {
                    var6.field684 = 0;
                    this.method174(var6);
                } else {
                    var6.field684 = var8;
                    this.method173(var6.field1502, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lac;)V", line = 310)
    public final synchronized void method175(class3 arg0) {
        arg0.method498(121);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lac;)I", line = 313)
    private static final int method176(class3 arg0) {
        return arg0.method14() >> 5;
    }
}
