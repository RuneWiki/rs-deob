import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class114 extends class93 {

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[Lte;")
    private class119[] field2892 = new class119[8];

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field2894 = 16;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Lte;")
    private class119 field2893 = new class119();

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    private int field2895 = -1;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    private int field2896 = 0;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    private int field2897 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lle;)V", line = 3)
    private final void method848(class71 arg0) {
        arg0.method1074((byte) -28);
        arg0.method529();
        class136 var2 = this.field2893.field2953.field3340;
        if (this.field2893.field2953 == var2) {
            this.field2895 = -1;
        } else {
            this.field2895 = ((class71) var2).field1711;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)I", line = 18)
    public final synchronized int method424(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field2895 < 0) {
                return this.method849(arg0, arg1, arg2);
            }
            if (this.field2896 + arg2 < this.field2895) {
                this.field2896 += arg2;
                return this.method849(arg0, arg1, arg2);
            }
            int var4 = this.field2895 - this.field2896;
            var5 = this.method849(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2896 += var4;
            this.method854();
            class71 var6 = (class71) this.field2893.method895(-14156);
            synchronized (var6) {
                int var8 = var6.method530(this);
                if (var8 < 0) {
                    var6.field1711 = 0;
                    this.method848(var6);
                } else {
                    var6.field1711 = var8;
                    this.method852(var6.field3340, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)I", line = 60)
    private final int method849(int[] arg0, int arg1, int arg2) {
        this.field2897 -= arg2;
        if (this.field2897 <= 0) {
            this.field2897 += class43.field1083 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class119 var5 = this.field2892[var4];
                for (class93 var6 = (class93) var5.method895(-14156); var6 != null; var6 = (class93) var5.method893(true)) {
                    int var7 = method855(var6);
                    if (var4 != var7) {
                        this.field2892[var7].method892(var6, (byte) -110);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class119 var19 = this.field2892[var8];
            for (class93 var20 = (class93) var19.method895(-14156); var20 != null; var20 = (class93) var19.method893(true)) {
                var20.field2373 = false;
                if (var20.field2372 != null) {
                    var20.field2372.field3155 = 0;
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
                    class119 var15 = this.field2892[var12];
                    for (class93 var16 = (class93) var15.method895(-14156); var16 != null; var16 = (class93) var15.method893(true)) {
                        if (!var16.field2373) {
                            class125 var17 = var16.field2372;
                            if (var17 == null || var17.field3155 <= var13) {
                                if (var9 < this.field2894) {
                                    int var18 = var16.method424(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field3155 += var18;
                                    }
                                } else {
                                    var16.method423(arg2);
                                }
                                var16.field2373 = true;
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

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 193)
    public final synchronized void method423(int arg0) {
        do {
            if (this.field2895 < 0) {
                this.method851(arg0);
                return;
            }
            if (this.field2896 + arg0 < this.field2895) {
                this.field2896 += arg0;
                this.method851(arg0);
                return;
            }
            int var2 = this.field2895 - this.field2896;
            this.method851(var2);
            arg0 -= var2;
            this.field2896 += var2;
            this.method854();
            class71 var3 = (class71) this.field2893.method895(-14156);
            synchronized (var3) {
                int var5 = var3.method530(this);
                if (var5 < 0) {
                    var3.field1711 = 0;
                    this.method848(var3);
                } else {
                    var3.field1711 = var5;
                    this.method852(var3.field3340, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lp;)V", line = 242)
    public final synchronized void method850(class93 arg0) {
        class119 var2 = this.field2892[method855(arg0)];
        var2.method892(arg0, (byte) 94);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 250)
    private final void method851(int arg0) {
        this.field2897 -= arg0;
        if (this.field2897 < 0) {
            this.field2897 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class119 var3 = this.field2892[var2];
            for (class93 var4 = (class93) var3.method895(-14156); var4 != null; var4 = (class93) var3.method893(true)) {
                var4.method423(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwd;Lle;)V", line = 276)
    private final void method852(class136 arg0, class71 arg1) {
        while (this.field2893.field2953 != arg0 && ((class71) arg0).field1711 <= arg1.field1711) {
            arg0 = arg0.field3340;
        }
        this.field2893.method887(12800, arg0, arg1);
        this.field2895 = ((class71) this.field2893.field2953.field3340).field1711;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lp;)V", line = 283)
    public final synchronized void method853(class93 arg0) {
        arg0.method1074((byte) -28);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 331)
    public class114() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field2892[var1] = new class119();
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 300)
    private final void method854() {
        if (this.field2896 <= 0) {
            return;
        }
        for (class71 var1 = (class71) this.field2893.method895(-14156); var1 != null; var1 = (class71) this.field2893.method893(true)) {
            var1.field1711 -= this.field2896;
        }
        this.field2895 -= this.field2896;
        this.field2896 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lp;)I", line = 317)
    private static final int method855(class93 arg0) {
        return arg0.method418() >> 5;
    }
}
