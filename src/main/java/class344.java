import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class344 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Z")
    public boolean field4682 = true;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    private int field4686 = -1;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lhr;")
    private class308 field4681;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Ltb;")
    private class227 field4684;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    private int field4688;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private int field4680;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Lim;")
    private class342 field4683;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lok;")
    private class138 field4685;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Lsr;")
    private class136 field4687;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "[B")
    private static byte[] field4689 = new byte[16384];

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBI[B)V")
    public final void method2176(int arg0, byte arg1, int arg2, byte[] arg3) {
        this.field4687.method390(arg2, arg3, arg0 * this.field4684.method1532(arg2));
        this.method2177(-87, arg0, this.field4687);
        if (arg1 != -67) {
            this.field4684 = (class227) null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILok;)V")
    private final void method2177(int arg0, int arg1, class138 arg2) {
        if (arg1 == 0) {
            return;
        }
        if (arg0 > -70) {
            this.field4688 = -67;
        }
        this.method2179(0);
        this.field4684.method1559(this.field4683);
        this.field4684.method1567(arg2, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public final void method2178(int arg0) {
        this.method2177(arg0 - 108, this.field4680, this.field4685);
        if (arg0 != 0) {
            this.method2177(-25, -122, (class138) null);
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    private final void method2179(int arg0) {
        if (!this.field4682) {
            return;
        }
        this.field4682 = false;
        byte[] var2 = this.field4681.field4243;
        byte[] var3 = field4689;
        int var4 = 0;
        int var5 = this.field4681.field4241;
        int var6 = this.field4681.field4241 * this.field4690 + this.field4688;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4683 != null && this.field4686 == var4) {
            this.field4682 = false;
            return;
        }
        this.field4686 = var4;
        int var9 = arg0;
        int var10 = this.field4690 * var5 + this.field4688;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field4681.field4241 - 128;
        }
        if (this.field4683 == null) {
            this.field4683 = new class342(this.field4684, 3553, 6406, 128, 128, false, field4689, 6406, false);
            this.field4683.method2174(false, false);
            this.field4683.method868(true);
        } else {
            this.field4683.method2172(0, 0, 128, 128, field4689, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ltb;Lhr;Lfq;IIIII)V")
    public class344(class227 arg0, class308 arg1, class111 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4681 = arg1;
        this.field4684 = arg0;
        this.field4690 = arg7;
        this.field4688 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field3434 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field1600[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field4680 = var10;
        if (var10 <= 0) {
            this.field4683 = null;
        } else {
            class11 var17 = new class11(var10 * 2);
            if (this.field4684.field3229) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field3434 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field1600[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method191(var21[var22] & 0xFFFF, -123);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field3434 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field1600[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method210(var26[var27] & 0xFFFF, 13579);
                            }
                        }
                    }
                }
            }
            this.field4685 = this.field4684.method1535(5123, var17.field230, var17.field191, false);
            this.field4687 = new class136(this.field4684, 5123, (byte[]) null, 1);
        }
    }
}
