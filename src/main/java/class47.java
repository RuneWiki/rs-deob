import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class47 extends class535 {

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    private int field891 = 204;

    @OriginalMember(owner = "client!qr", name = "R", descriptor = "I")
    private int field902 = 1;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    private int field897 = 1;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "Z")
    public static boolean field890 = false;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!qr", name = "P", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!qr", name = "O", descriptor = "Lci;")
    public static class320 field899;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "[[[Lmm;")
    public static class188[][][] field898;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLci;)V", line = 11)
    public static final void method436(byte arg0, class320 arg1) {
        class473.field6896 = arg1.method2043((byte) 73, "titlebg");
        if (arg0 >= 104) {
            ++field893;
            class322.field4797 = arg1.method2043((byte) -102, "logo");
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V", line = 26)
    public static void method437(int arg0) {
        field899 = null;
        field898 = null;
        if (arg0 != -8285) {
            method440(-70);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILwn;)Ljm;", line = 38)
    public static final class495 method438(int arg0, class519 arg1) {
        ++field900;
        if (arg0 != 0) {
            method439((class320) null, (class320) null, -54);
        }
        return new class495(arg1.method3044((byte) -108), arg1.method3044((byte) -121), arg1.method3044((byte) -112), arg1.method3044((byte) -116), arg1.method3040((byte) -3), arg1.method3040((byte) -3), arg1.method3072((byte) -127));
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V", line = 49)
    public class47() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILwn;I)V", line = 53)
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field895;
        if (arg2 != -6232) {
            this.field891 = -7;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field891 = arg1.method3018(566990904);
                }
            } else {
                this.field902 = arg1.method3072((byte) -128);
            }
        } else {
            this.field897 = arg1.method3072((byte) -128);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lci;Lci;I)V", line = 103)
    public static final void method439(class320 arg0, class320 arg1, int arg2) {
        if (arg2 == 0) {
            field899 = arg0;
            class28.field396 = arg1;
            ++field894;
        }
    }

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)V", line = 118)
    public static final void method440(int arg0) {
        class290.field4315 = null;
        class7.field40 = null;
        class102.field1574 = null;
        class108.field1622 = null;
        class482.field7005 = null;
        class366.field5298 = null;
        class200.field3060 = null;
        if (arg0 != 14490) {
            method439((class320) null, (class320) null, -78);
        }
        class133.field2075 = null;
        class118.field1847 = null;
        ++field901;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)[I", line = 139)
    public final int[] method65(int arg0, int arg1) {
        ++field896;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            for (int var4 = 0; ~var4 > ~class174.field2597; ++var4) {
                int var5 = class539.field7939[var4];
                int var6 = class448.field6442[arg0];
                int var7 = this.field897 * var5 >> 12;
                int var8 = this.field902 * var6 >> 12;
                int var9 = var5 % (4096 / this.field897) * this.field897;
                int var10 = var6 % (4096 / this.field902) * this.field902;
                if (~this.field891 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field891 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field891 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 1) {
            method440(36);
        }
        return var3;
    }
}
