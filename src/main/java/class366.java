import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class366 extends class98 {

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    private int field5191 = 16;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    private int field5194 = 0;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    private int field5196 = 4096;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    private int field5198 = 2000;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    private int field5190 = 0;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field5192 = 0;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "[[I")
    public static int[][] field5197 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field5201 = "";

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "[[B")
    public static byte[][] field5187;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method188(-77);
        }
        ++field5193;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = this.field5196 >> 1;
            int[][] var5 = super.field1177.method816(-124);
            Random var6 = new Random((long) this.field5194);
            for (int var7 = 0; ~this.field5198 < ~var7; ++var7) {
                int var8 = this.field5196 <= 0 ? this.field5190 : this.field5190 - -class211.method1428(var6, this.field5196, 48) - var4;
                int var9 = var8 >> 4 & 255;
                int var10 = class211.method1428(var6, class268.field3811, -105);
                int var11 = class211.method1428(var6, class140.field1737, 90);
                int var12 = (class247.field3531[var9] * this.field5191 >> 12) + var10;
                int var13 = (class299.field4191[var9] * this.field5191 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class211.method1428(var6, 4096, 68) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = var26 - -1024 - -((var28 - var10) * var25);
                        int var30 = var28 & class210.field2995;
                        int var31 = class225.field3153 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
    public static final void method2339(int arg0, boolean arg1) {
        if (arg1) {
            if (~arg0 > -1 || ~arg0 < -3) {
                arg0 = 0;
            }
            ++field5200;
            class192.field2761 = arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLli;)Z")
    public static final boolean method2340(byte arg0, class246 arg1) {
        ++field5188;
        if (arg1 == null) {
            return false;
        } else if (arg0 >= -98) {
            return true;
        } else if (!arg1.field3506) {
            return false;
        } else if (!arg1.method1676(-1)) {
            return false;
        } else if (class288.field4024.method1888((long) arg1.field3479, (byte) -30) != null) {
            return false;
        } else {
            return class305.field4286.method1888((long) arg1.field3481, (byte) -30) == null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public final void method188(int arg0) {
        class55.method315((byte) 42);
        if (arg0 != 1) {
            method2340((byte) -35, (class246) null);
        }
        ++field5189;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class366() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field5196 = arg1.method1617((byte) 48);
                        }
                    } else {
                        this.field5190 = arg1.method1617((byte) 48);
                    }
                } else {
                    this.field5191 = arg1.method1574(-20);
                }
            } else {
                this.field5198 = arg1.method1617((byte) 48);
            }
        } else {
            this.field5194 = arg1.method1574(-38);
        }
        if (arg2 != 0) {
            method2340((byte) 65, (class246) null);
        }
        ++field5195;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(B)V")
    public static void method2341(byte arg0) {
        field5187 = null;
        field5197 = null;
        field5201 = null;
        if (arg0 != 79) {
            field5201 = null;
        }
    }
}
