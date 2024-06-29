import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class105 extends class89 {

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "[Lfa;")
    private class32[] field2650 = new class32[8];

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    private int field2651 = 16;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lfa;")
    private class32 field2652 = new class32();

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    private int field2653 = -1;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    private int field2654 = 0;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    private int field2655 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Llc;Lic;)V", line = 3)
    private final void method864(class69 arg0, class51 arg1) {
        while (this.field2652.field724 != arg0 && ((class51) arg0).field1281 <= arg1.field1281) {
            arg0 = arg0.field1760;
        }
        this.field2652.method253(arg1, false, arg0);
        this.field2653 = ((class51) this.field2652.field724.field1760).field1281;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Loe;)V", line = 12)
    public final synchronized void method865(class89 arg0) {
        class32 var2 = this.field2650[method871(arg0)];
        var2.method246(arg0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 19)
    private final void method866(int arg0) {
        this.field2654 -= arg0;
        if (this.field2654 < 0) {
            this.field2654 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class32 var3 = this.field2650[var2];
            for (class89 var4 = (class89) var3.method248(32); var4 != null; var4 = (class89) var3.method252(95)) {
                var4.method738(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 331)
    public class105() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field2650[var1] = new class32();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V", line = 53)
    private final void method867() {
        if (this.field2655 <= 0) {
            return;
        }
        for (class51 var1 = (class51) this.field2652.method248(32); var1 != null; var1 = (class51) this.field2652.method252(119)) {
            var1.field1281 -= this.field2655;
        }
        this.field2653 -= this.field2655;
        this.field2655 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V", line = 73)
    public final synchronized void method738(int arg0) {
        do {
            if (this.field2653 < 0) {
                this.method866(arg0);
                return;
            }
            if (this.field2655 + arg0 < this.field2653) {
                this.field2655 += arg0;
                this.method866(arg0);
                return;
            }
            int var2 = this.field2653 - this.field2655;
            this.method866(var2);
            arg0 -= var2;
            this.field2655 += var2;
            this.method867();
            class51 var3 = (class51) this.field2652.method248(32);
            synchronized (var3) {
                int var5 = var3.method398(this);
                if (var5 < 0) {
                    var3.field1281 = 0;
                    this.method870(var3);
                } else {
                    var3.field1281 = var5;
                    this.method864(var3.field1760, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Loe;)V", line = 119)
    public final synchronized void method868(class89 arg0) {
        arg0.method589(true);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([III)I", line = 123)
    private final int method869(int[] arg0, int arg1, int arg2) {
        this.field2654 -= arg2;
        if (this.field2654 <= 0) {
            this.field2654 += class10.field221 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class32 var5 = this.field2650[var4];
                for (class89 var6 = (class89) var5.method248(32); var6 != null; var6 = (class89) var5.method252(95)) {
                    int var7 = method871(var6);
                    if (var4 != var7) {
                        this.field2650[var7].method246(var6, 0);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class32 var19 = this.field2650[var8];
            for (class89 var20 = (class89) var19.method248(32); var20 != null; var20 = (class89) var19.method252(90)) {
                var20.field2180 = false;
                if (var20.field2179 != null) {
                    var20.field2179.field2656 = 0;
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
                    class32 var15 = this.field2650[var12];
                    for (class89 var16 = (class89) var15.method248(32); var16 != null; var16 = (class89) var15.method252(123)) {
                        if (!var16.field2180) {
                            class106 var17 = var16.field2179;
                            if (var17 == null || var17.field2656 <= var13) {
                                if (var9 < this.field2651) {
                                    int var18 = var16.method739(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field2656 += var18;
                                    }
                                } else {
                                    var16.method738(arg2);
                                }
                                var16.field2180 = true;
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

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lic;)V", line = 258)
    private final void method870(class51 arg0) {
        arg0.method589(true);
        arg0.method397();
        class69 var2 = this.field2652.field724.field1760;
        if (this.field2652.field724 == var2) {
            this.field2653 = -1;
        } else {
            this.field2653 = ((class51) var2).field1281;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([III)I", line = 275)
    public final synchronized int method739(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field2653 < 0) {
                return this.method869(arg0, arg1, arg2);
            }
            if (this.field2655 + arg2 < this.field2653) {
                this.field2655 += arg2;
                return this.method869(arg0, arg1, arg2);
            }
            int var4 = this.field2653 - this.field2655;
            var5 = this.method869(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2655 += var4;
            this.method867();
            class51 var6 = (class51) this.field2652.method248(32);
            synchronized (var6) {
                int var8 = var6.method398(this);
                if (var8 < 0) {
                    var6.field1281 = 0;
                    this.method870(var6);
                } else {
                    var6.field1281 = var8;
                    this.method864(var6.field1760, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Loe;)I", line = 317)
    private static final int method871(class89 arg0) {
        return arg0.method740() >> 5;
    }
}
