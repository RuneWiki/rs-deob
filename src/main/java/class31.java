import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 extends class59 {

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field637 = 16;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "[Lnb;")
    private class80[] field638 = new class80[8];

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lnb;")
    private class80 field636 = new class80();

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field639 = 0;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    private int field641 = -1;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    private int field640 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lad;)V")
    private final void method194(class5 arg0) {
        arg0.method502(0);
        arg0.method31();
        class70 var2 = this.field636.field1810.field1550;
        if (this.field636.field1810 == var2) {
            this.field641 = -1;
        } else {
            this.field641 = ((class5) var2).field102;
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    private final void method195(int arg0) {
        this.field640 -= arg0;
        if (this.field640 < 0) {
            this.field640 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class80 var3 = this.field638[var2];
            for (class59 var4 = (class59) var3.method580((byte) 93); var4 != null; var4 = (class59) var3.method576((byte) 81)) {
                var4.method202(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([III)I")
    public final synchronized int method196(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field641 < 0) {
                return this.method201(arg0, arg1, arg2);
            }
            if (this.field639 + arg2 < this.field641) {
                this.field639 += arg2;
                return this.method201(arg0, arg1, arg2);
            }
            int var4 = this.field641 - this.field639;
            var5 = this.method201(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field639 += var4;
            this.method197();
            class5 var6 = (class5) this.field636.method580((byte) -122);
            synchronized (var6) {
                int var8 = var6.method30(this);
                if (var8 < 0) {
                    var6.field102 = 0;
                    this.method194(var6);
                } else {
                    var6.field102 = var8;
                    this.method199(var6.field1550, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
    private final void method197() {
        if (this.field639 <= 0) {
            return;
        }
        for (class5 var1 = (class5) this.field636.method580((byte) -57); var1 != null; var1 = (class5) this.field636.method576((byte) 10)) {
            var1.field102 -= this.field639;
        }
        this.field641 -= this.field639;
        this.field639 = 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lje;)I")
    private static final int method198(class59 arg0) {
        return arg0.method360() >> 5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lld;Lad;)V")
    private final void method199(class70 arg0, class5 arg1) {
        while (this.field636.field1810 != arg0 && ((class5) arg0).field102 <= arg1.field102) {
            arg0 = arg0.field1550;
        }
        this.field636.method572(arg1, -94, arg0);
        this.field641 = ((class5) this.field636.field1810.field1550).field102;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lje;)V")
    public final synchronized void method200(class59 arg0) {
        class80 var2 = this.field638[method198(arg0)];
        var2.method578(0, arg0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([III)I")
    private final int method201(int[] arg0, int arg1, int arg2) {
        this.field640 -= arg2;
        if (this.field640 <= 0) {
            this.field640 += class35.field710 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class80 var5 = this.field638[var4];
                for (class59 var6 = (class59) var5.method580((byte) -84); var6 != null; var6 = (class59) var5.method576((byte) 71)) {
                    int var7 = method198(var6);
                    if (var4 != var7) {
                        this.field638[var7].method578(0, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class80 var19 = this.field638[var8];
            for (class59 var20 = (class59) var19.method580((byte) -111); var20 != null; var20 = (class59) var19.method576((byte) 45)) {
                var20.field1207 = false;
                if (var20.field1208 != null) {
                    var20.field1208.field1131 = 0;
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
                    class80 var15 = this.field638[var12];
                    for (class59 var16 = (class59) var15.method580((byte) 53); var16 != null; var16 = (class59) var15.method576((byte) 58)) {
                        if (!var16.field1207) {
                            class52 var17 = var16.field1208;
                            if (var17 == null || var17.field1131 <= var13) {
                                if (var9 < this.field637) {
                                    int var18 = var16.method196(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1131 += var18;
                                    }
                                } else {
                                    var16.method202(arg2);
                                }
                                var16.field1207 = true;
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

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public final synchronized void method202(int arg0) {
        do {
            if (this.field641 < 0) {
                this.method195(arg0);
                return;
            }
            if (this.field639 + arg0 < this.field641) {
                this.field639 += arg0;
                this.method195(arg0);
                return;
            }
            int var2 = this.field641 - this.field639;
            this.method195(var2);
            arg0 -= var2;
            this.field639 += var2;
            this.method197();
            class5 var3 = (class5) this.field636.method580((byte) -120);
            synchronized (var3) {
                int var5 = var3.method30(this);
                if (var5 < 0) {
                    var3.field102 = 0;
                    this.method194(var3);
                } else {
                    var3.field102 = var5;
                    this.method199(var3.field1550, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class31() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field638[var1] = new class80();
        }
    }
}
