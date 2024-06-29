import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class293 extends class98 {

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    private int field4092 = 204;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
    private int field4097 = 1;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    private int field4091 = 1;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4093;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field4092 = arg1.method1617((byte) 48);
                }
            } else {
                this.field4091 = arg1.method1574(-67);
            }
        } else {
            this.field4097 = arg1.method1574(-3);
        }
        if (arg2 != 0) {
            this.field4097 = 63;
        }
        ++field4096;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field4094;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            this.field4091 = -1;
        }
        if (super.field1177.field1610) {
            for (int var4 = 0; ~var4 > ~class268.field3811; ++var4) {
                int var5 = class189.field2722[var4];
                int var6 = class163.field2285[arg1];
                int var7 = this.field4097 * var5 >> 12;
                int var8 = this.field4091 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4097) * this.field4097;
                int var10 = var6 % (4096 / this.field4091) * this.field4091;
                if (~this.field4092 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4092 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4092 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
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

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class293() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
    public static void method1938(int arg0) {
        field4093 = null;
        if (arg0 >= -30) {
            field4093 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
    public static final void method1939(int arg0) {
        ++field4095;
        class237 var1 = class135.field1670;
        synchronized (class135.field1670) {
            if (arg0 == -20907) {
                class135.field1670.method1626((byte) 106);
            }
        }
    }

    static {
        new class362(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field4093 = new String[] { "en", "de", "fr", "pt", "nl" };
    }
}
