import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class283 extends class170 {

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    private int field4974 = 16;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    private int field4975 = 0;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
    private int field4977 = 0;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    private int field4973 = 2000;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    private int field4969 = 4096;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "Lqk;")
    public static class207 field4965 = class24.method212(255, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field4968 = 0;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field4966 = 0;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field4967 = 0;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    public static int field4978 = 0;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "Lpk;")
    public static class99 field4972;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)V")
    public static void method1922(boolean arg0) {
        field4972 = null;
        field4965 = null;
        if (arg0) {
            field4965 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            field4972 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field4969 = arg0.method1050(1272006568);
                        }
                    } else {
                        this.field4977 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field4974 = arg0.method1045((byte) -17);
                }
            } else {
                this.field4973 = arg0.method1050(1272006568);
            }
        } else {
            this.field4975 = arg0.method1045((byte) 91);
        }
        ++field4980;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field4971;
        if (arg0 != -30) {
            method1922(false);
        }
        int[] var3 = super.field3001.method1538(110, arg1);
        if (super.field3001.field3835) {
            int var4 = this.field4969 >> 1;
            int[][] var5 = super.field3001.method1540((byte) 4);
            Random var6 = new Random((long) this.field4975);
            for (int var7 = 0; ~var7 > ~this.field4973; ++var7) {
                int var8 = ~this.field4969 >= -1 ? this.field4977 : this.field4977 + -var4 + class93.method667(this.field4969, 15901, var6);
                int var9 = (var8 & 4095) >> 4;
                int var10 = class93.method667(class88.field1595, arg0 + 15931, var6);
                int var11 = class93.method667(class30.field620, arg0 ^ -15873, var6);
                int var12 = (class207.field3689[var9] * this.field4974 >> 12) + var10;
                int var13 = (class95.field1690[var9] * this.field4974 >> 12) + var11;
                int var14 = -var10 + var12;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var10 = var12;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var22 / 2;
                    int var24 = var13 - var11;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class93.method667(4096, 15901, var6) >> 2);
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        var23 += var24;
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = class233.field4294 & var21;
                        int var31 = class94.field1684 & var28;
                        if (~var23 < -1) {
                            var21 += var27;
                            var23 -= var22;
                        }
                        if (!var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        class235.method1681(75);
        ++field4970;
        if (arg0 < 14) {
            this.method31((byte) 82, -92);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZII)V")
    public static final void method1923(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            field4966 = -13;
        }
        ++field4979;
        if (class124.field2158 <= arg0 && ~class88.field1599 <= ~arg0) {
            int var5 = class21.method123(arg3, -15466, class204.field3580, class204.field3602);
            int var6 = class21.method123(arg1, -15466, class204.field3580, class204.field3602);
            class167.method1207(var6, (byte) 47, arg0, var5, arg4);
        }
    }
}
