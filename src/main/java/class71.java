import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 extends class126 {

    @OriginalMember(owner = "client!le", name = "K", descriptor = "[Ldd;")
    private class23[] field1712 = new class23[8];

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    private int field1713 = 16;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "Ldd;")
    private class23 field1711 = new class23();

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    private int field1715 = 0;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    private int field1714 = -1;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    private int field1716 = 0;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 6)
    public final synchronized void method201(int arg0) {
        do {
            if (this.field1714 < 0) {
                this.method563(arg0);
                return;
            }
            if (this.field1715 + arg0 < this.field1714) {
                this.field1715 += arg0;
                this.method563(arg0);
                return;
            }
            int var2 = this.field1714 - this.field1715;
            this.method563(var2);
            arg0 -= var2;
            this.field1715 += var2;
            this.method562();
            class125 var3 = (class125) this.field1711.method180(0);
            synchronized (var3) {
                int var5 = var3.method979(this);
                if (var5 < 0) {
                    var3.field3029 = 0;
                    this.method565(var3);
                } else {
                    var3.field3029 = var5;
                    this.method567(var3.field372, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([III)I", line = 53)
    private final int method561(int[] arg0, int arg1, int arg2) {
        this.field1716 -= arg2;
        if (this.field1716 <= 0) {
            this.field1716 += class102.field2503 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class23 var5 = this.field1712[var4];
                for (class126 var6 = (class126) var5.method180(0); var6 != null; var6 = (class126) var5.method181(0)) {
                    int var7 = method564(var6);
                    if (var4 != var7) {
                        this.field1712[var7].method179(false, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class23 var19 = this.field1712[var8];
            for (class126 var20 = (class126) var19.method180(0); var20 != null; var20 = (class126) var19.method181(0)) {
                var20.field3030 = false;
                if (var20.field3031 != null) {
                    var20.field3031.field2699 = 0;
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
                    class23 var15 = this.field1712[var12];
                    for (class126 var16 = (class126) var15.method180(0); var16 != null; var16 = (class126) var15.method181(0)) {
                        if (!var16.field3030) {
                            class107 var17 = var16.field3031;
                            if (var17 == null || var17.field2699 <= var13) {
                                if (var9 < this.field1713) {
                                    int var18 = var16.method195(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field2699 += var18;
                                    }
                                } else {
                                    var16.method201(arg2);
                                }
                                var16.field3030 = true;
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

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([III)I", line = 187)
    public final synchronized int method195(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field1714 < 0) {
                return this.method561(arg0, arg1, arg2);
            }
            if (this.field1715 + arg2 < this.field1714) {
                this.field1715 += arg2;
                return this.method561(arg0, arg1, arg2);
            }
            int var4 = this.field1714 - this.field1715;
            var5 = this.method561(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1715 += var4;
            this.method562();
            class125 var6 = (class125) this.field1711.method180(0);
            synchronized (var6) {
                int var8 = var6.method979(this);
                if (var8 < 0) {
                    var6.field3029 = 0;
                    this.method565(var6);
                } else {
                    var6.field3029 = var8;
                    this.method567(var6.field372, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 231)
    private final void method562() {
        if (this.field1715 <= 0) {
            return;
        }
        for (class125 var1 = (class125) this.field1711.method180(0); var1 != null; var1 = (class125) this.field1711.method181(0)) {
            var1.field3029 -= this.field1715;
        }
        this.field1714 -= this.field1715;
        this.field1715 = 0;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 331)
    public class71() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field1712[var1] = new class23();
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 253)
    private final void method563(int arg0) {
        this.field1716 -= arg0;
        if (this.field1716 < 0) {
            this.field1716 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class23 var3 = this.field1712[var2];
            for (class126 var4 = (class126) var3.method180(0); var4 != null; var4 = (class126) var3.method181(0)) {
                var4.method201(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lv;)I", line = 278)
    private static final int method564(class126 arg0) {
        return arg0.method199() >> 5;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lue;)V", line = 283)
    private final void method565(class125 arg0) {
        arg0.method114(-3789);
        arg0.method980();
        class12 var2 = this.field1711.field587.field372;
        if (this.field1711.field587 == var2) {
            this.field1714 = -1;
        } else {
            this.field1714 = ((class125) var2).field3029;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Lv;)V", line = 298)
    public final synchronized void method566(class126 arg0) {
        class23 var2 = this.field1712[method564(arg0)];
        var2.method179(false, arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lbe;Lue;)V", line = 303)
    private final void method567(class12 arg0, class125 arg1) {
        while (this.field1711.field587 != arg0 && ((class125) arg0).field3029 <= arg1.field3029) {
            arg0 = arg0.field372;
        }
        this.field1711.method185(0, arg1, arg0);
        this.field1714 = ((class125) this.field1711.field587.field372).field3029;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Lv;)V", line = 317)
    public final synchronized void method568(class126 arg0) {
        arg0.method114(-3789);
    }
}
