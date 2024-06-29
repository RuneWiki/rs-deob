import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class114 extends class38 {

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[Ls;")
    private class108[] field2810 = new class108[8];

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private int field2811 = 16;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Ls;")
    private class108 field2812 = new class108();

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field2813 = 0;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    private int field2815 = 0;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    private int field2814 = -1;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lad;)V", line = 8)
    private final void method869(class5 arg0) {
        arg0.method714((byte) -104);
        arg0.method39();
        class96 var2 = this.field2812.field2619.field2327;
        if (this.field2812.field2619 == var2) {
            this.field2814 = -1;
        } else {
            this.field2814 = ((class5) var2).field197;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 21)
    private final void method870() {
        if (this.field2815 <= 0) {
            return;
        }
        for (class5 var1 = (class5) this.field2812.method813(94); var1 != null; var1 = (class5) this.field2812.method814((byte) -19)) {
            var1.field197 -= this.field2815;
        }
        this.field2814 -= this.field2815;
        this.field2815 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)I", line = 40)
    public final synchronized int method382(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field2814 < 0) {
                return this.method871(arg0, arg1, arg2);
            }
            if (this.field2815 + arg2 < this.field2814) {
                this.field2815 += arg2;
                return this.method871(arg0, arg1, arg2);
            }
            int var4 = this.field2814 - this.field2815;
            var5 = this.method871(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2815 += var4;
            this.method870();
            class5 var6 = (class5) this.field2812.method813(-117);
            synchronized (var6) {
                int var8 = var6.method40(this);
                if (var8 < 0) {
                    var6.field197 = 0;
                    this.method869(var6);
                } else {
                    var6.field197 = var8;
                    this.method874(var6.field2327, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)I", line = 85)
    private final int method871(int[] arg0, int arg1, int arg2) {
        this.field2813 -= arg2;
        if (this.field2813 <= 0) {
            this.field2813 += class48.field1298 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class108 var5 = this.field2810[var4];
                for (class38 var6 = (class38) var5.method813(-85); var6 != null; var6 = (class38) var5.method814((byte) -19)) {
                    int var7 = method875(var6);
                    if (var4 != var7) {
                        this.field2810[var7].method810(var6, -30206);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class108 var19 = this.field2810[var8];
            for (class38 var20 = (class38) var19.method813(94); var20 != null; var20 = (class38) var19.method814((byte) -19)) {
                var20.field1096 = false;
                if (var20.field1097 != null) {
                    var20.field1097.field735 = 0;
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
                    class108 var15 = this.field2810[var12];
                    for (class38 var16 = (class38) var15.method813(74); var16 != null; var16 = (class38) var15.method814((byte) -19)) {
                        if (!var16.field1096) {
                            class25 var17 = var16.field1097;
                            if (var17 == null || var17.field735 <= var13) {
                                if (var9 < this.field2811) {
                                    int var18 = var16.method382(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field735 += var18;
                                    }
                                } else {
                                    var16.method383(arg2);
                                }
                                var16.field1096 = true;
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

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 331)
    public class114() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field2810[var1] = new class108();
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 220)
    private final void method872(int arg0) {
        this.field2813 -= arg0;
        if (this.field2813 < 0) {
            this.field2813 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class108 var3 = this.field2810[var2];
            for (class38 var4 = (class38) var3.method813(-99); var4 != null; var4 = (class38) var3.method814((byte) -19)) {
                var4.method383(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lga;)V", line = 249)
    public final synchronized void method873(class38 arg0) {
        arg0.method714((byte) -124);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 255)
    public final synchronized void method383(int arg0) {
        do {
            if (this.field2814 < 0) {
                this.method872(arg0);
                return;
            }
            if (this.field2815 + arg0 < this.field2814) {
                this.field2815 += arg0;
                this.method872(arg0);
                return;
            }
            int var2 = this.field2814 - this.field2815;
            this.method872(var2);
            arg0 -= var2;
            this.field2815 += var2;
            this.method870();
            class5 var3 = (class5) this.field2812.method813(-103);
            synchronized (var3) {
                int var5 = var3.method40(this);
                if (var5 < 0) {
                    var3.field197 = 0;
                    this.method869(var3);
                } else {
                    var3.field197 = var5;
                    this.method874(var3.field2327, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lq;Lad;)V", line = 302)
    private final void method874(class96 arg0, class5 arg1) {
        while (this.field2812.field2619 != arg0 && ((class5) arg0).field197 <= arg1.field197) {
            arg0 = arg0.field2327;
        }
        this.field2812.method818(arg0, arg1, 0);
        this.field2814 = ((class5) this.field2812.field2619.field2327).field197;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lga;)I", line = 309)
    private static final int method875(class38 arg0) {
        return arg0.method381() >> 5;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lga;)V", line = 316)
    public final synchronized void method876(class38 arg0) {
        class108 var2 = this.field2810[method875(arg0)];
        var2.method810(arg0, -30206);
    }
}
