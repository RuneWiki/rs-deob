import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class46 {

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    private int field649 = -1;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Z")
    public boolean field650 = true;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "Lnf;")
    private class256 field651;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lom;")
    private class128 field648;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Lko;")
    private class19 field646;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Lir;")
    private class216 field644;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "[B")
    private static byte[] field647 = new byte[16384];

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZILko;)V")
    public final void method327(boolean arg0, int arg1, class19 arg2) {
        if (arg1 == 0) {
            return;
        }
        this.method328(18643);
        if (!arg0) {
            this.field648 = (class128) null;
        }
        this.field651.method1669(this.field644);
        this.field651.method1668(arg2, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    private final void method328(int arg0) {
        if (!this.field650) {
            return;
        }
        this.field650 = false;
        byte[] var2 = this.field648.field1776;
        byte[] var3 = field647;
        int var4 = 0;
        int var5 = this.field648.field1775;
        int var6 = this.field648.field1775 * this.field652 + this.field645;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (arg0 != 18643) {
            this.field652 = 105;
        }
        if (this.field644 != null && this.field649 == var4) {
            this.field650 = false;
            return;
        }
        this.field649 = var4;
        int var9 = 0;
        int var10 = this.field652 * var5 + this.field645;
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
            var10 += this.field648.field1775 - 128;
        }
        if (this.field644 == null) {
            this.field644 = new class216(this.field651, 3553, 6406, 128, 128, false, field647, 6406, false);
            this.field644.method1271(false, false);
            this.field644.method2351(true);
        } else {
            this.field644.method1270(0, 0, 128, 128, field647, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    public final void method329(int arg0) {
        int var2 = -97 / ((arg0 + 90) / 36);
        this.method327(true, this.field653, this.field646);
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lnf;Lom;Lkk;IIIII)V")
    public class46(class256 arg0, class128 arg1, class371 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field645 = arg6;
        this.field652 = arg7;
        this.field651 = arg0;
        this.field648 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field5084 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field5374[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field653 = var10;
        if (var10 > 0) {
            class228 var17 = new class228(var10 * 2);
            if (this.field651.field3663) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field5084 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field5374[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1326(var26[var27], -67);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field5084 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field5374[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1359((byte) -128, var21[var22]);
                            }
                        }
                    }
                }
            }
            this.field646 = this.field651.method1687(5123, var17.field3040, var17.field3029, false);
        } else {
            this.field644 = null;
        }
    }
}
