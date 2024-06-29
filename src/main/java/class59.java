import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class59 extends class89 {

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    private int field990 = 204;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    private int field992 = 1;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    private int field998 = 1;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "Lda;")
    public static class275 field988 = class255.method1672(102, "Weiter");

    @OriginalMember(owner = "client!si", name = "R", descriptor = "Lda;")
    public static class275 field989 = class255.method1672(112, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!si", name = "T", descriptor = "Lda;")
    public static class275 field991 = class255.method1672(123, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!si", name = "W", descriptor = "[Lai;")
    public static class53[] field994 = new class53[27];

    @OriginalMember(owner = "client!si", name = "V", descriptor = "Z")
    public static boolean field993 = false;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "Lda;")
    public static class275 field999 = class255.method1672(97, "<col=c0ff00>");

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "[I")
    public static int[] field996;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field1001;
        int[] var3 = super.field1503.method229(arg0, (byte) -102);
        if (super.field1503.field664) {
            for (int var4 = 0; ~class65.field1070 < ~var4; ++var4) {
                int var5 = class185.field3172[var4];
                int var6 = class91.field1552[arg0];
                int var7 = this.field998 * var6 >> 12;
                int var8 = this.field992 * var5 >> 12;
                int var9 = var5 % (4096 / this.field992) * this.field992;
                int var10 = var6 % (4096 / this.field998) * this.field998;
                if (~var10 > ~this.field990) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (~var8 < -4) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field990 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field990) {
                    int var11;
                    for (var11 = var8 - var7; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
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
        if (arg1) {
            field999 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field997;
        if (arg0 != -20503) {
            this.field990 = -56;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field990 = arg1.method608(111);
                }
            } else {
                this.field998 = arg1.method564((byte) 94);
            }
        } else {
            this.field992 = arg1.method564((byte) 75);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V")
    public static void method376(int arg0) {
        if (arg0 != 0) {
            field989 = null;
        }
        field989 = null;
        field988 = null;
        field994 = null;
        field991 = null;
        field999 = null;
        field996 = null;
    }
}
