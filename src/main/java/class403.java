import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class403 {

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Z")
    public boolean field5696 = true;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    private int field5702 = -1;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private int field5700;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lac;")
    private class541 field5698;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lcg;")
    private class139 field5691;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private int field5697;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Ldw;")
    private class718 field5688;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lqs;")
    private class604 field5687;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Laaa;")
    private class616 field5695;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "F")
    public static float field5689;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BILdw;)V")
    private final void method2329(byte arg0, int arg1, class718 arg2) {
        if (arg0 <= 35) {
            this.method2334(-46, -60, 86, null);
        }
        field5694++;
        if (arg1 != 0) {
            this.method2330(0);
            this.field5698.method3006(1, this.field5695);
            this.field5698.method3008(arg1, 4, arg2, false, 0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    private final void method2330(int arg0) {
        field5701++;
        if (!this.field5696) {
            return;
        }
        this.field5696 = false;
        byte[] var2 = this.field5691.field1793;
        byte[] var3 = this.field5698.field7680;
        int var4 = 0;
        int var5 = this.field5691.field1782;
        int var6 = this.field5692 + (this.field5691.field1782 * this.field5700);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field5695 != null && this.field5702 == var4) {
            this.field5696 = false;
            return;
        }
        this.field5702 = var4;
        int var8 = this.field5700 * var5 + this.field5692;
        int var9 = arg0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field5691.field1782 - 128;
        }
        if (this.field5695 == null) {
            this.field5695 = new class616(this.field5698, 3553, 6406, 128, 128, false, this.field5698.field7680, 6406, false);
            this.field5695.method3471(false, arg0 + 10242, false);
            this.field5695.method1258(arg0 ^ 0xFFFF929D, true);
        } else {
            this.field5695.method3466(128, 6406, false, 0, this.field5698.field7680, 0, (byte) -80, 0, 0, 128);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method2331(byte arg0) {
        field5699++;
        for (class756 var1 = (class756) class526.field7066.method2348(-1); var1 != null; var1 = (class756) class526.field7066.method2343(0)) {
            if (var1.field10556 > 1) {
                var1.field10556 = 0;
                class452.field6304.method1574(((class227) var1.field10553.field5735.field5555).field2949, var1, (byte) -80);
                var1.field10553.method2342(16711680);
            }
        }
        class331.field4464 = 0;
        if (arg0 < 70) {
            return;
        }
        class43.field470 = 0;
        class139.field1783.method728((byte) 47);
        class513.field6948.method2556(-96);
        class526.field7066.method2342(16711680);
        class192.method1075(127, class449.field6276);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([Ljava/lang/Object;Z[J)V")
    public static final void method2332(Object[] arg0, boolean arg1, long[] arg2) {
        class294.method1755(arg2, 0, (byte) -116, arg2.length - 1, arg0);
        if (arg1) {
            field5689 = 1.1995486F;
        }
        field5703++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public final void method2333(int arg0) {
        if (arg0 != 6401) {
            field5689 = 0.89933157F;
        }
        this.method2329((byte) 87, this.field5697, this.field5688);
        field5693++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III[B)V")
    public final void method2334(int arg0, int arg1, int arg2, byte[] arg3) {
        field5690++;
        if (arg1 != 0) {
            this.field5702 = -35;
        }
        this.field5687.method3342((byte) -47, arg3, arg0 * this.field5698.method2982(arg2, -5122), arg2);
        this.method2329((byte) 63, arg0, this.field5687);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method2335(int arg0) {
        class170.field2119 = arg0;
        for (int var1 = 0; var1 < class68.field743; var1++) {
            for (int var2 = 0; var2 < class480.field6629; var2++) {
                if (class77.field947[arg0][var1][var2] == null) {
                    class77.field947[arg0][var1][var2] = new class624(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lac;Lcg;Lok;IIIII)V")
    public class403(class541 arg0, class139 arg1, class257 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5692 = arg6;
        this.field5700 = arg7;
        this.field5698 = arg0;
        this.field5691 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3727 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3336[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field5697 = var10;
        if (var10 <= 0) {
            this.field5695 = null;
        } else {
            class611 var14 = new class611(var10 * 2);
            if (this.field5698.field7608) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3727 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3336[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3423(var23[var24] & 0xFFFF, 1571862888);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3727 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3336[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3446(var18[var19] & 0xFFFF, 4);
                            }
                        }
                    }
                }
            }
            this.field5688 = this.field5698.method2981(5123, var14.field8529, 7, false, var14.field8520);
            this.field5687 = new class604(this.field5698, 5123, null, 1);
        }
    }
}
