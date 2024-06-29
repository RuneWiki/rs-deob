import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class7 extends class87 {

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    private int field241 = 16;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "[Lpb;")
    private class92[] field242 = new class92[8];

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lpb;")
    private class92 field243 = new class92();

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    private int field244 = 0;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    private int field245 = -1;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    private int field246 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Loc;)V", line = 9)
    public final synchronized void method127(class87 arg0) {
        class92 var2 = this.field242[method131(arg0)];
        var2.method808(0, arg0);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 16)
    public final synchronized void method128(int arg0) {
        do {
            if (this.field245 < 0) {
                this.method133(arg0);
                return;
            }
            if (this.field246 + arg0 < this.field245) {
                this.field246 += arg0;
                this.method133(arg0);
                return;
            }
            int var2 = this.field245 - this.field246;
            this.method133(var2);
            arg0 -= var2;
            this.field246 += var2;
            this.method134();
            class83 var3 = (class83) this.field243.method805((byte) -90);
            synchronized (var3) {
                int var5 = var3.method746(this);
                if (var5 < 0) {
                    var3.field2117 = 0;
                    this.method132(var3);
                } else {
                    var3.field2117 = var5;
                    this.method129(var3.field2090, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lnd;Lne;)V", line = 60)
    private final void method129(class82 arg0, class83 arg1) {
        while (this.field243.field2279 != arg0 && ((class83) arg0).field2117 <= arg1.field2117) {
            arg0 = arg0.field2090;
        }
        this.field243.method814(-31793, arg0, arg1);
        this.field245 = ((class83) this.field243.field2279.field2090).field2117;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([III)I", line = 68)
    private final int method130(int[] arg0, int arg1, int arg2) {
        this.field244 -= arg2;
        if (this.field244 <= 0) {
            this.field244 += class5.field193 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class92 var5 = this.field242[var4];
                for (class87 var6 = (class87) var5.method805((byte) -90); var6 != null; var6 = (class87) var5.method812(-4)) {
                    int var7 = method131(var6);
                    if (var4 != var7) {
                        this.field242[var7].method808(0, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class92 var19 = this.field242[var8];
            for (class87 var20 = (class87) var19.method805((byte) -90); var20 != null; var20 = (class87) var19.method812(-4)) {
                var20.field2170 = false;
                if (var20.field2171 != null) {
                    var20.field2171.field3083 = 0;
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
                    class92 var15 = this.field242[var12];
                    for (class87 var16 = (class87) var15.method805((byte) -90); var16 != null; var16 = (class87) var15.method812(-4)) {
                        if (!var16.field2170) {
                            class124 var17 = var16.field2171;
                            if (var17 == null || var17.field3083 <= var13) {
                                if (var9 < this.field241) {
                                    int var18 = var16.method135(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field3083 += var18;
                                    }
                                } else {
                                    var16.method128(arg2);
                                }
                                var16.field2170 = true;
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

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Loc;)I", line = 200)
    private static final int method131(class87 arg0) {
        return arg0.method591() >> 5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lne;)V", line = 204)
    private final void method132(class83 arg0) {
        arg0.method742(-1);
        arg0.method745();
        class82 var2 = this.field243.field2279.field2090;
        if (this.field243.field2279 == var2) {
            this.field245 = -1;
        } else {
            this.field245 = ((class83) var2).field2117;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 331)
    public class7() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field242[var1] = new class92();
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 226)
    private final void method133(int arg0) {
        this.field244 -= arg0;
        if (this.field244 < 0) {
            this.field244 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class92 var3 = this.field242[var2];
            for (class87 var4 = (class87) var3.method805((byte) -90); var4 != null; var4 = (class87) var3.method812(-4)) {
                var4.method128(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 250)
    private final void method134() {
        if (this.field246 <= 0) {
            return;
        }
        for (class83 var1 = (class83) this.field243.method805((byte) -90); var1 != null; var1 = (class83) this.field243.method812(-4)) {
            var1.field2117 -= this.field246;
        }
        this.field245 -= this.field246;
        this.field246 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([III)I", line = 269)
    public final synchronized int method135(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field245 < 0) {
                return this.method130(arg0, arg1, arg2);
            }
            if (this.field246 + arg2 < this.field245) {
                this.field246 += arg2;
                return this.method130(arg0, arg1, arg2);
            }
            int var4 = this.field245 - this.field246;
            var5 = this.method130(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field246 += var4;
            this.method134();
            class83 var6 = (class83) this.field243.method805((byte) -90);
            synchronized (var6) {
                int var8 = var6.method746(this);
                if (var8 < 0) {
                    var6.field2117 = 0;
                    this.method132(var6);
                } else {
                    var6.field2117 = var8;
                    this.method129(var6.field2090, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Loc;)V", line = 310)
    public final synchronized void method136(class87 arg0) {
        arg0.method742(-1);
    }
}
