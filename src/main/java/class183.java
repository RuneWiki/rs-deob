import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class183 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lah;")
    private class190[] field2707 = new class190[10];

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final int method1243() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2707[var2] != null && this.field2707[var2].field2770 / 20 < var1) {
                var1 = this.field2707[var2].field2770 / 20;
            }
        }
        if (this.field2709 < this.field2708 && this.field2709 / 20 < var1) {
            var1 = this.field2709 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2707[var3] != null) {
                this.field2707[var3].field2770 -= var1 * 20;
            }
        }
        if (this.field2709 < this.field2708) {
            this.field2709 -= var1 * 20;
            this.field2708 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lok;II)Lbf;")
    public static final class183 method1244(class74 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method541(arg2, arg1, (byte) -122);
        return var3 == null ? null : new class183(new class468(var3));
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lgk;)V")
    private class183(class468 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2765(119);
            if (var3 != 0) {
                arg0.field6830--;
                this.field2707[var2] = new class190();
                this.field2707[var2].method1268(arg0);
            }
        }
        this.field2709 = arg0.method2727((byte) 43);
        this.field2708 = arg0.method2727((byte) 43);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()[B")
    private final byte[] method1245() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2707[var2] != null && this.field2707[var2].field2771 + this.field2707[var2].field2770 > var1) {
                var1 = this.field2707[var2].field2771 + this.field2707[var2].field2770;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2707[var5] != null) {
                int var6 = this.field2707[var5].field2771 * 22050 / 1000;
                int var7 = this.field2707[var5].field2770 * 22050 / 1000;
                int[] var8 = this.field2707[var5].method1267(var6, this.field2707[var5].field2771);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Llv;")
    public final class528 method1246() {
        byte[] var1 = this.method1245();
        return new class528(22050, var1, this.field2709 * 22050 / 1000, this.field2708 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    private class183() {
    }
}
