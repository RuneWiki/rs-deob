import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class125 extends class107 {

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    private int field2190 = 1;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    private int field2192 = 1;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    private int field2196 = 204;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "[I")
    public static int[] field2189 = new int[128];

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "Lpj;")
    public static class237 field2197 = class33.method353("underlay", 108);

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            ++field2195;
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            if (super.field1921.field3539) {
                for (int var4 = 0; var4 < class106.field1862; ++var4) {
                    int var5 = class182.field3199[var4];
                    int var6 = class185.field3233[arg1];
                    int var7 = var5 % (4096 / this.field2192) * this.field2192;
                    int var8 = this.field2192 * var5 >> 12;
                    int var9 = this.field2190 * var6 >> 12;
                    int var10 = var6 % (4096 / this.field2190) * this.field2190;
                    if (this.field2196 > var10) {
                        for (var8 -= var9; var8 < 0; var8 += 4) {
                        }
                        while (var8 > 3) {
                            var8 -= 4;
                        }
                        if (var8 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field2196 < ~var7) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field2196 > var7) {
                        int var11;
                        for (var11 = var8 - var9; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public static void method890(boolean arg0) {
        field2197 = null;
        if (!arg0) {
            field2193 = -40;
        }
        field2189 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfa;ILfa;)V")
    public static final void method891(class239 arg0, int arg1, class239 arg2) {
        class215.field3685 = arg0;
        if (arg1 > 62) {
            ++field2191;
            class90.field1642 = arg2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 == -32513) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field2196 = arg0.method339(-16777216);
                    }
                } else {
                    this.field2190 = arg0.method316((byte) 103);
                }
            } else {
                this.field2192 = arg0.method316((byte) -13);
            }
            ++field2194;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)J")
    public static final long method892(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        return var3 != null && var3.field753 != null ? var3.field753.field4014 : 0L;
    }
}
