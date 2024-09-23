import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QFKXENAK")
public class class48 extends class66 {

    @OriginalMember(owner = "QFKXENAK", name = "m", descriptor = "Z")
    public boolean field1276 = false;

    @OriginalMember(owner = "QFKXENAK", name = "n", descriptor = "Z")
    private boolean field1277 = false;

    @OriginalMember(owner = "QFKXENAK", name = "l", descriptor = "LNGIGHQOG;")
    private class37 field1275;

    @OriginalMember(owner = "QFKXENAK", name = "r", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "QFKXENAK", name = "s", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "QFKXENAK", name = "t", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "QFKXENAK", name = "u", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "QFKXENAK", name = "o", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "QFKXENAK", name = "p", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "QFKXENAK", name = "q", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "QFKXENAK", name = "<init>", descriptor = "(ZIIIIIII)V")
    public class48(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1275 = class37.field1137[arg1];
        this.field1281 = arg5;
        this.field1282 = arg6;
        this.field1283 = arg4;
        if (arg0) {
            this.field1277 = !this.field1277;
        }
        this.field1284 = arg3;
        this.field1278 = arg2 + arg7;
        this.field1276 = false;
    }

    @OriginalMember(owner = "QFKXENAK", name = "a", descriptor = "(IZ)V")
    public final void method392(int arg0, boolean arg1) {
        this.field1280 += arg0;
        if (arg1) {
            this.field1277 = !this.field1277;
        }
        while (true) {
            do {
                do {
                    if (this.field1280 <= this.field1275.field1141.method598(this.field1279, -818)) {
                        return;
                    }
                    this.field1280 -= this.field1275.field1141.method598(this.field1279, -818) + 1;
                    this.field1279++;
                } while (this.field1279 < this.field1275.field1141.field1728);
            } while (this.field1279 >= 0 && this.field1279 < this.field1275.field1141.field1728);
            this.field1279 = 0;
            this.field1276 = true;
        }
    }

    @OriginalMember(owner = "QFKXENAK", name = "a", descriptor = "(B)LSNMMQNPZ;")
    public final class55 method175(byte arg0) {
        if (arg0 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class55 var3 = this.field1275.method351();
        if (var3 == null) {
            return null;
        }
        int var4 = this.field1275.field1141.field1729[this.field1279];
        class55 var5 = new class55(var3, 707, false, true, class39.method356((byte) 68, var4));
        if (!this.field1276) {
            var5.method425(false);
            var5.method426(var4, (byte) 1);
            var5.field1370 = null;
            var5.field1369 = null;
        }
        if (this.field1275.field1144 != 128 || this.field1275.field1145 != 128) {
            var5.method434(2985, this.field1275.field1144, this.field1275.field1144, this.field1275.field1145);
        }
        if (this.field1275.field1146 != 0) {
            if (this.field1275.field1146 == 90) {
                var5.method429(3);
            }
            if (this.field1275.field1146 == 180) {
                var5.method429(3);
                var5.method429(3);
            }
            if (this.field1275.field1146 == 270) {
                var5.method429(3);
                var5.method429(3);
                var5.method429(3);
            }
        }
        var5.method435(this.field1275.field1147 + 64, this.field1275.field1148 + 850, -30, -50, -30, true);
        return var5;
    }
}
