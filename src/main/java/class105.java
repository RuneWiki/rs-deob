import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class105 extends class118 {

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[Lie;")
    private class53[] field2695 = new class53[8];

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    private int field2696 = 16;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lie;")
    private class53 field2697 = new class53();

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    private int field2699 = 0;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    private int field2698 = 0;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    private int field2700 = -1;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([III)I", line = 5)
    public final synchronized int method213(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field2700 < 0) {
                return this.method869(arg0, arg1, arg2);
            }
            if (this.field2698 + arg2 < this.field2700) {
                this.field2698 += arg2;
                return this.method869(arg0, arg1, arg2);
            }
            int var4 = this.field2700 - this.field2698;
            var5 = this.method869(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2698 += var4;
            this.method864();
            class42 var6 = (class42) this.field2697.method421(1);
            synchronized (var6) {
                int var8 = var6.method371(this);
                if (var8 < 0) {
                    var6.field1125 = 0;
                    this.method868(var6);
                } else {
                    var6.field1125 = var8;
                    this.method865(var6.field353, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V", line = 46)
    private final void method862(int arg0) {
        this.field2699 -= arg0;
        if (this.field2699 < 0) {
            this.field2699 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class53 var3 = this.field2695[var2];
            for (class118 var4 = (class118) var3.method421(1); var4 != null; var4 = (class118) var3.method428(22743)) {
                var4.method212(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 72)
    public final synchronized void method212(int arg0) {
        do {
            if (this.field2700 < 0) {
                this.method862(arg0);
                return;
            }
            if (this.field2698 + arg0 < this.field2700) {
                this.field2698 += arg0;
                this.method862(arg0);
                return;
            }
            int var2 = this.field2700 - this.field2698;
            this.method862(var2);
            arg0 -= var2;
            this.field2698 += var2;
            this.method864();
            class42 var3 = (class42) this.field2697.method421(1);
            synchronized (var3) {
                int var5 = var3.method371(this);
                if (var5 < 0) {
                    var3.field1125 = 0;
                    this.method868(var3);
                } else {
                    var3.field1125 = var5;
                    this.method865(var3.field353, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lub;)V", line = 122)
    public final synchronized void method863(class118 arg0) {
        class53 var2 = this.field2695[method867(arg0)];
        var2.method427(arg0, 83);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V", line = 126)
    private final void method864() {
        if (this.field2698 <= 0) {
            return;
        }
        for (class42 var1 = (class42) this.field2697.method421(1); var1 != null; var1 = (class42) this.field2697.method428(22743)) {
            var1.field1125 -= this.field2698;
        }
        this.field2700 -= this.field2698;
        this.field2698 = 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lcd;Lha;)V", line = 144)
    private final void method865(class17 arg0, class42 arg1) {
        while (this.field2697.field1358 != arg0 && ((class42) arg0).field1125 <= arg1.field1125) {
            arg0 = arg0.field353;
        }
        this.field2697.method424(0, arg0, arg1);
        this.field2700 = ((class42) this.field2697.field1358.field353).field1125;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Lub;)V", line = 154)
    public final synchronized void method866(class118 arg0) {
        arg0.method133(2);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Lub;)I", line = 158)
    private static final int method867(class118 arg0) {
        return arg0.method209() >> 5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lha;)V", line = 161)
    private final void method868(class42 arg0) {
        arg0.method133(2);
        arg0.method370();
        class17 var2 = this.field2697.field1358.field353;
        if (this.field2697.field1358 == var2) {
            this.field2700 = -1;
        } else {
            this.field2700 = ((class42) var2).field1125;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 331)
    public class105() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field2695[var1] = new class53();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "([III)I", line = 186)
    private final int method869(int[] arg0, int arg1, int arg2) {
        this.field2699 -= arg2;
        if (this.field2699 <= 0) {
            this.field2699 += class66.field1776 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class53 var5 = this.field2695[var4];
                for (class118 var6 = (class118) var5.method421(1); var6 != null; var6 = (class118) var5.method428(22743)) {
                    int var7 = method867(var6);
                    if (var4 != var7) {
                        this.field2695[var7].method427(var6, -106);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class53 var19 = this.field2695[var8];
            for (class118 var20 = (class118) var19.method421(1); var20 != null; var20 = (class118) var19.method428(22743)) {
                var20.field2945 = false;
                if (var20.field2946 != null) {
                    var20.field2946.field1657 = 0;
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
                    class53 var15 = this.field2695[var12];
                    for (class118 var16 = (class118) var15.method421(1); var16 != null; var16 = (class118) var15.method428(22743)) {
                        if (!var16.field2945) {
                            class63 var17 = var16.field2946;
                            if (var17 == null || var17.field1657 <= var13) {
                                if (var9 < this.field2696) {
                                    int var18 = var16.method213(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1657 += var18;
                                    }
                                } else {
                                    var16.method212(arg2);
                                }
                                var16.field2945 = true;
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
}
