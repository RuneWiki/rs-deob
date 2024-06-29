import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class702 {

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    private int field9892 = -1;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "Z")
    public boolean field9896 = true;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    private int field9890;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lch;")
    private class38 field9902;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Llba;")
    private class90 field9893;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    private int field9908;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    private int field9907;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "I")
    private int field9904;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "Lrr;")
    private class33 field9906;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public int field9901;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lug;")
    private class60 field9894;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "[F")
    public static float[] field9895 = new float[2];

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "Lsda;")
    public static class748 field9899;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public final void method3943(int arg0) {
        field9905++;
        this.method3946(arg0, this.field9906, this.field9901);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    private final void method3944(byte arg0) {
        field9897++;
        if (!this.field9896 || arg0 != -48) {
            return;
        }
        this.field9896 = false;
        byte[] var2 = this.field9893.field1275;
        int var3 = 0;
        int var4 = this.field9893.field1288;
        int var5 = this.field9890 + (this.field9893.field1288 * this.field9908);
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field9894 != null && this.field9892 == var3) {
            this.field9896 = false;
            return;
        }
        this.field9892 = var3;
        int var7 = 0;
        int var8 = this.field9890 + (this.field9908 * var4);
        if (!this.field9902.method256(arg0 ^ 0xFFFFFFD0, class315.field4259, class674.field9590)) {
            if (class230.field3428 == null) {
                class230.field3428 = new int[16384];
            }
            int[] var13 = class230.field3428;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field9893.field1288 - 128;
            }
            if (this.field9894 == null) {
                this.field9894 = this.field9902.method303(false, 128, 128, class230.field3428, arg0 ^ 0x2B);
                this.field9894.method560(false, 16609, false);
            } else {
                this.field9894.method562(class230.field3428, 128, 128, 0, (byte) 103, 128, 0, 0);
            }
            return;
        }
        if (class612.field8751 == null) {
            class612.field8751 = new byte[16384];
        }
        byte[] var9 = class612.field8751;
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
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field9893.field1288 - 128;
        }
        if (this.field9894 == null) {
            this.field9894 = this.field9902.method350(128, class612.field8751, false, -110, 128, class315.field4259);
            this.field9894.method560(false, 16609, false);
        } else {
            this.field9894.method565(class315.field4259, class612.field8751, 128, 0, 128, 128, 0, 0, arg0 ^ 0x4C39);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
    public static void method3945(int arg0) {
        field9899 = null;
        field9895 = null;
        if (arg0 <= 45) {
            method3947((byte) -4);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILrr;I)V")
    public final void method3946(int arg0, class33 arg1, int arg2) {
        if (arg0 > ~arg2) {
            this.method3944((byte) -48);
            this.field9902.method264(this.field9894, arg0 ^ 0x1);
            this.field9902.method354(class262.field3771, this.field9907, 126, this.field9904 + 1 - this.field9907, arg1, arg2, 0);
        }
        field9903++;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)Lkda;")
    public static final class64 method3947(byte arg0) {
        field9900++;
        try {
            if (arg0 != 68) {
                method3947((byte) -96);
            }
            return (class64) Class.forName("pfa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class359();
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lhga;ILjava/awt/Frame;)V")
    public static final void method3948(class300 arg0, int arg1, Frame arg2) {
        if (arg1 != 0) {
            return;
        }
        field9891++;
        while (true) {
            class432 var3 = arg0.method1867(7, arg2);
            while (var3.field6198 == 0) {
                class363.method2283(10L, -24244);
            }
            if (var3.field6198 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class363.method2283(100L, -24244);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lch;Llba;Lcj;IIIII)V")
    public class702(class38 arg0, class90 arg1, class443 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9890 = arg6;
        this.field9902 = arg0;
        this.field9893 = arg1;
        this.field9908 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4679 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field6306[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field9901 = 0;
            this.field9894 = null;
        } else {
            this.field9907 = Integer.MAX_VALUE;
            this.field9904 = Integer.MIN_VALUE;
            this.field9906 = this.field9902.method366((byte) 86, false);
            this.field9906.method174(var10, (byte) 39);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field9906.method177(true, (byte) -105);
                if (var15 != null) {
                    Stream var16 = this.field9902.method325((byte) -120, var15);
                    if (Stream.method2551()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4679 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field6306[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field9904) {
                                            this.field9904 = var22;
                                        }
                                        if (this.field9907 > var22) {
                                            this.field9907 = var22;
                                        }
                                        var16.method2561(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4679 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field6306[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field9904) {
                                            this.field9904 = var28;
                                        }
                                        if (var28 < this.field9907) {
                                            this.field9907 = var28;
                                        }
                                        var16.method2560(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2554();
                    if (this.field9906.method178((byte) -104)) {
                        break;
                    }
                }
            }
            this.field9901 = var10 / 3;
        }
    }
}
