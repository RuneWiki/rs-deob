import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class111 extends class48 {

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    private int field2707 = 16;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "[Lfc;")
    private class34[] field2709 = new class34[8];

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lfc;")
    private class34 field2708 = new class34();

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    private int field2710 = 0;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    private int field2712 = 0;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    private int field2711 = -1;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)I", line = 7)
    private final int method852(int[] arg0, int arg1, int arg2) {
        this.field2710 -= arg2;
        if (this.field2710 <= 0) {
            this.field2710 += client.field447 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class34 var5 = this.field2709[var4];
                for (class48 var6 = (class48) var5.method311((byte) 73); var6 != null; var6 = (class48) var5.method302((byte) -95)) {
                    int var7 = method856(var6);
                    if (var4 != var7) {
                        this.field2709[var7].method301(false, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class34 var19 = this.field2709[var8];
            for (class48 var20 = (class48) var19.method311((byte) 89); var20 != null; var20 = (class48) var19.method302((byte) -103)) {
                var20.field1227 = false;
                if (var20.field1228 != null) {
                    var20.field1228.field2706 = 0;
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
                    class34 var15 = this.field2709[var12];
                    for (class48 var16 = (class48) var15.method311((byte) 127); var16 != null; var16 = (class48) var15.method302((byte) -83)) {
                        if (!var16.field1227) {
                            class110 var17 = var16.field1228;
                            if (var17 == null || var17.field2706 <= var13) {
                                if (var9 < this.field2707) {
                                    int var18 = var16.method205(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field2706 += var18;
                                    }
                                } else {
                                    var16.method209(arg2);
                                }
                                var16.field1227 = true;
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

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 138)
    private final void method853() {
        if (this.field2712 <= 0) {
            return;
        }
        for (class9 var1 = (class9) this.field2708.method311((byte) 89); var1 != null; var1 = (class9) this.field2708.method302((byte) -52)) {
            var1.field208 -= this.field2712;
        }
        this.field2711 -= this.field2712;
        this.field2712 = 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Li;)V", line = 157)
    public final synchronized void method854(class48 arg0) {
        arg0.method249(0);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V", line = 160)
    private final void method855(int arg0) {
        this.field2710 -= arg0;
        if (this.field2710 < 0) {
            this.field2710 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class34 var3 = this.field2709[var2];
            for (class48 var4 = (class48) var3.method311((byte) 74); var4 != null; var4 = (class48) var3.method302((byte) -84)) {
                var4.method209(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Li;)I", line = 185)
    private static final int method856(class48 arg0) {
        return arg0.method211() >> 5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lbb;)V", line = 188)
    private final void method857(class9 arg0) {
        arg0.method249(0);
        arg0.method90();
        class24 var2 = this.field2708.field858.field654;
        if (this.field2708.field858 == var2) {
            this.field2711 = -1;
        } else {
            this.field2711 = ((class9) var2).field208;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Li;)V", line = 203)
    public final synchronized void method858(class48 arg0) {
        class34 var2 = this.field2709[method856(arg0)];
        var2.method301(false, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 331)
    public class111() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field2709[var1] = new class34();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lde;Lbb;)V", line = 218)
    private final void method859(class24 arg0, class9 arg1) {
        while (this.field2708.field858 != arg0 && ((class9) arg0).field208 <= arg1.field208) {
            arg0 = arg0.field654;
        }
        this.field2708.method300(arg0, arg1, 0);
        this.field2711 = ((class9) this.field2708.field858.field654).field208;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 228)
    public final synchronized void method209(int arg0) {
        do {
            if (this.field2711 < 0) {
                this.method855(arg0);
                return;
            }
            if (this.field2712 + arg0 < this.field2711) {
                this.field2712 += arg0;
                this.method855(arg0);
                return;
            }
            int var2 = this.field2711 - this.field2712;
            this.method855(var2);
            arg0 -= var2;
            this.field2712 += var2;
            this.method853();
            class9 var3 = (class9) this.field2708.method311((byte) 109);
            synchronized (var3) {
                int var5 = var3.method91(this);
                if (var5 < 0) {
                    var3.field208 = 0;
                    this.method857(var3);
                } else {
                    var3.field208 = var5;
                    this.method859(var3.field654, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)I", line = 274)
    public final synchronized int method205(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field2711 < 0) {
                return this.method852(arg0, arg1, arg2);
            }
            if (this.field2712 + arg2 < this.field2711) {
                this.field2712 += arg2;
                return this.method852(arg0, arg1, arg2);
            }
            int var4 = this.field2711 - this.field2712;
            var5 = this.method852(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2712 += var4;
            this.method853();
            class9 var6 = (class9) this.field2708.method311((byte) 102);
            synchronized (var6) {
                int var8 = var6.method91(this);
                if (var8 < 0) {
                    var6.field208 = 0;
                    this.method857(var6);
                } else {
                    var6.field208 = var8;
                    this.method859(var6.field654, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }
}
