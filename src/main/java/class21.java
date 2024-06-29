import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class21 extends class175 {

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    private int field342 = 2000;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    private int field347 = 0;

    @OriginalMember(owner = "client!mk", name = "ib", descriptor = "I")
    private int field359 = 0;

    @OriginalMember(owner = "client!mk", name = "kb", descriptor = "I")
    private int field361 = 4096;

    @OriginalMember(owner = "client!mk", name = "gb", descriptor = "I")
    private int field357 = 16;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "[I")
    public static int[] field348 = new int[2000];

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field345 = 0;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!mk", name = "eb", descriptor = "I")
    public static int field355 = -1;

    @OriginalMember(owner = "client!mk", name = "ab", descriptor = "Lmb;")
    private static class96 field351 = class243.method1708("Allocating memory", (byte) 122);

    @OriginalMember(owner = "client!mk", name = "hb", descriptor = "Lmb;")
    private static class96 field358 = class243.method1708("Loaded config", (byte) 102);

    @OriginalMember(owner = "client!mk", name = "lb", descriptor = "[S")
    public static short[] field362 = new short[256];

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!mk", name = "mb", descriptor = "Lmb;")
    public static class96 field363 = field351;

    @OriginalMember(owner = "client!mk", name = "fb", descriptor = "Lmb;")
    public static class96 field356 = class243.method1708(" loggt sich ein)3", (byte) 102);

    @OriginalMember(owner = "client!mk", name = "jb", descriptor = "Lmb;")
    public static class96 field360 = field358;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!mk", name = "bb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!mk", name = "cb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!mk", name = "db", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!mk", name = "nb", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!mk", name = "ob", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V")
    public static final void method149(int arg0) {
        if (arg0 < 47) {
            field362 = null;
        }
        class167.field2946.method96(false);
        class34.field604.method96(false);
        class241.field4190.method96(false);
        ++field341;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field365;
        int[] var3 = super.field3044.method904((byte) -75, arg1);
        int var4 = -7 / ((arg0 - 62) / 54);
        if (super.field3044.field2150) {
            int var5 = this.field361 >> 1;
            int[][] var6 = super.field3044.method910(-14451);
            Random var7 = new Random((long) this.field347);
            for (int var8 = 0; var8 < this.field342; ++var8) {
                int var9 = ~this.field361 < -1 ? this.field359 - -class50.method379(this.field361, var7, (byte) 26) + -var5 : this.field359;
                int var10 = (4095 & var9) >> 4;
                int var11 = class50.method379(class1.field11, var7, (byte) 26);
                int var12 = class50.method379(class85.field1440, var7, (byte) 26);
                int var13 = (class103.field1741[var10] * this.field357 >> 12) + var11;
                int var14 = (class153.field2681[var10] * this.field357 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (var16 != 0 || var15 != 0) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var17 = ~var16 > ~var15;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var13 = var14;
                        var11 = var12;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (~var11 < ~var13) {
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        int var21 = var12;
                        var12 = var14;
                        var14 = var21;
                    }
                    int var22 = -var11 + var13;
                    int var23 = var14 - var12;
                    int var24 = -var22 / 2;
                    int var25 = var12;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = 1024 - (class50.method379(4096, var7, (byte) 26) >> 2);
                    int var27 = var12 >= var14 ? -1 : 1;
                    int var28 = 2048 / var22;
                    for (int var29 = var11; ~var29 > ~var13; ++var29) {
                        var24 += var23;
                        int var30 = var29 & class194.field3343;
                        int var31 = var25 & class92.field1520;
                        if (var24 > 0) {
                            var24 -= var22;
                            var25 += var27;
                        }
                        int var32 = var26 - (-1024 - (-var11 + var29) * var28);
                        if (var17) {
                            var6[var31][var30] = var32;
                        } else {
                            var6[var30][var31] = var32;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field352;
        class29.method189(4096);
        if (arg0 != 2) {
            field360 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field361 = arg2.method1663((byte) 103);
                        }
                    } else {
                        this.field359 = arg2.method1663((byte) 107);
                    }
                } else {
                    this.field357 = arg2.method1651(4139);
                }
            } else {
                this.field342 = arg2.method1663((byte) -43);
            }
        } else {
            this.field347 = arg2.method1651(4139);
        }
        int var5 = 75 / ((arg0 - -22) / 58);
        ++field346;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)I")
    public static final int method151(int arg0, int arg1) {
        ++field340;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        if (arg1 != 1880702124) {
            method152(87);
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public static void method152(int arg0) {
        field362 = null;
        field348 = null;
        field351 = null;
        if (arg0 <= -126) {
            field363 = null;
            field360 = null;
            field358 = null;
            field356 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)Lab;")
    public static final class252 method153(int arg0) {
        ++field364;
        try {
            if (arg0 != -22088) {
                field351 = null;
            }
            return (class252) Class.forName("sf").newInstance();
        } catch (Throwable var1) {
            return new class57();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIZ)V")
    public static final void method154(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field354;
        if (arg0 < -93) {
            if (class225.method1534(-1, arg2)) {
                class135.method1010(class100.field1704[arg2], arg3, arg4, -1, (byte) -97, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, true);
    }
}
