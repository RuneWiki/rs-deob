import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class284 {

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "Z")
    public boolean field3974 = true;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    private int field3969 = -1;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    private int field3972;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Lap;")
    private class408 field3979;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lcb;")
    private class444 field3966;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    private int field3975;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Ljb;")
    private class422 field3977;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "Laf;")
    private class370 field3971;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "[I")
    public static int[] field3973 = new int[500];

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 4)
    public static void method1765(int arg0) {
        if (arg0 == -1) {
            field3973 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 20)
    private final void method1766(int arg0) {
        field3965++;
        int var2 = -59 / ((arg0 - 83) / 34);
        if (!this.field3974) {
            return;
        }
        this.field3974 = false;
        byte[] var3 = this.field3979.field5575;
        int var4 = 0;
        int var5 = this.field3979.field5555;
        int var6 = this.field3972 + (this.field3979.field5555 * this.field3975);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var18 = -128; var18 < 0; var18++) {
                if (var3[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3977 != null && this.field3969 == var4) {
            this.field3974 = false;
            return;
        }
        this.field3969 = var4;
        int var8 = 0;
        int var9 = this.field3975 * var5 + this.field3972;
        if (!this.field3966.method2633((byte) 127, class194.field2874, class613.field9072)) {
            if (class624.field9193 == null) {
                class624.field9193 = new int[16384];
            }
            int[] var10 = class624.field9193;
            for (int var11 = -128; var11 < 0; var11++) {
                for (int var12 = -128; var12 < 0; var12++) {
                    if (var3[var9] == 0) {
                        int var13 = 0;
                        if (var3[var9 - 1] != 0) {
                            var13++;
                        }
                        if (var3[var9 + 1] != 0) {
                            var13++;
                        }
                        if (var3[var9 - var5] != 0) {
                            var13++;
                        }
                        if (var3[var9 + var5] != 0) {
                            var13++;
                        }
                        var10[var8++] = var13 * 17 << 24;
                    } else {
                        var10[var8++] = 1140850688;
                    }
                    var9++;
                }
                var9 += this.field3979.field5555 - 128;
            }
            if (this.field3977 == null) {
                this.field3977 = this.field3966.method2631(128, class624.field9193, false, false, 128);
                this.field3977.method1648(false, false, true);
            } else {
                this.field3977.method1654(128, 0, 128, class624.field9193, 0, 0, 128, true);
            }
            return;
        }
        if (class369.field5080 == null) {
            class369.field5080 = new byte[16384];
        }
        byte[] var14 = class369.field5080;
        for (int var15 = -128; var15 < 0; var15++) {
            for (int var16 = -128; var16 < 0; var16++) {
                if (var3[var9] == 0) {
                    int var17 = 0;
                    if (var3[var9 - 1] != 0) {
                        var17++;
                    }
                    if (var3[var9 + 1] != 0) {
                        var17++;
                    }
                    if (var3[var9 - var5] != 0) {
                        var17++;
                    }
                    if (var3[var5 + var9] != 0) {
                        var17++;
                    }
                    var14[var8++] = (byte) (var17 * 17);
                } else {
                    var14[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field3979.field5555 - 128;
        }
        if (this.field3977 == null) {
            this.field3977 = this.field3966.method2622(false, 128, 3000, class369.field5080, 128, class613.field9072);
            this.field3977.method1648(false, false, true);
        } else {
            this.field3977.method1647(128, 0, class369.field5080, 0, 0, 128, class613.field9072, 128, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 197)
    public static final void method1767(byte arg0) {
        field3980++;
        if (class309.field4268) {
            return;
        }
        if (class56.field668.field6852) {
            class539.field8023 = ((int) class539.field8023 + 191 & 0xFFFFFF80);
        } else {
            class308.field4258 += (24.0F - class308.field4258) / 2.0F;
        }
        class24.field226 = true;
        if (arg0 <= -102) {
            class309.field4268 = true;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V", line = 222)
    public final void method1768(int arg0) {
        field3976++;
        if (arg0 <= 53) {
            this.field3978 = -67;
        }
        this.method1769(this.field3971, this.field3978, -5840);
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lcb;Lap;Lih;IIIII)V", line = 242)
    public class284(class444 arg0, class408 arg1, class600 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3972 = arg6;
        this.field3979 = arg1;
        this.field3966 = arg0;
        this.field3975 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field2697 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field8856[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field3977 = null;
            this.field3978 = 0;
        } else {
            this.field3970 = Integer.MIN_VALUE;
            this.field3967 = Integer.MAX_VALUE;
            this.field3971 = this.field3966.method2638(false, false);
            this.field3971.method287(-103, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field3971.method282(-13803, true);
                if (var15 != null) {
                    Stream var16 = this.field3966.method2597(var15, 1);
                    if (Stream.method3454()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field2697 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field8856[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field3970 < var22) {
                                            this.field3970 = var22;
                                        }
                                        if (this.field3967 > var22) {
                                            this.field3967 = var22;
                                        }
                                        var16.method3447(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field2697 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field8856[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field3967) {
                                            this.field3967 = var28;
                                        }
                                        if (this.field3970 < var28) {
                                            this.field3970 = var28;
                                        }
                                        var16.method3452(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3448();
                    if (this.field3971.method280(28596)) {
                        break;
                    }
                }
            }
            this.field3978 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Laf;II)V", line = 411)
    public final void method1769(class370 arg0, int arg1, int arg2) {
        if (arg2 != -5840) {
            field3973 = null;
        }
        if (arg1 > 0) {
            this.method1766(arg2 ^ 0xFFFFE949);
            this.field3966.method2632(this.field3977, 0);
            this.field3966.method2578((byte) 49, class569.field8396, this.field3967, 0, this.field3970 + 1 - this.field3967, arg1, arg0);
        }
        field3968++;
    }
}
