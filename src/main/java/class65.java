import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XTUDEFUJ")
public class class65 extends class16 {

    @OriginalMember(owner = "client!XTUDEFUJ", name = "m", descriptor = "Z")
    private boolean field1585 = true;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "n", descriptor = "Z")
    public boolean field1586 = false;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "u", descriptor = "LTGYZPJQJ;")
    private class55 field1593;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "q", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "r", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "s", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "t", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "l", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "o", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "p", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "v", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!XTUDEFUJ", name = "<init>", descriptor = "(IZIIIIII)V")
    public class65(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1593 = class55.field1321[arg0];
        this.field1589 = arg6;
        this.field1590 = arg4;
        if (arg1) {
            throw new NullPointerException();
        }
        this.field1591 = arg2;
        this.field1592 = arg5;
        this.field1584 = arg3 + arg7;
        this.field1586 = false;
    }

    @OriginalMember(owner = "client!XTUDEFUJ", name = "a", descriptor = "(ZI)V")
    public final void method536(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1588 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1588 <= this.field1593.field1325.method301(this.field1587, this.field1594)) {
                        return;
                    }
                    this.field1588 -= this.field1593.field1325.method301(this.field1587, this.field1594) + 1;
                    this.field1587++;
                } while (this.field1587 < this.field1593.field1325.field964);
            } while (this.field1587 >= 0 && this.field1587 < this.field1593.field1325.field964);
            this.field1587 = 0;
            this.field1586 = true;
        }
    }

    @OriginalMember(owner = "client!XTUDEFUJ", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public final class61 method174(boolean arg0) {
        class61 var2 = this.field1593.method444();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1593.field1325.field965[this.field1587];
        if (arg0) {
            this.field1594 = 452;
        }
        class61 var4 = new class61(var2, true, false, class44.method338(var3, (byte) 6), (byte) 0);
        if (!this.field1586) {
            var4.method473(39018);
            var4.method474(false, var3);
            var4.field1478 = null;
            var4.field1477 = null;
        }
        if (this.field1593.field1328 != 128 || this.field1593.field1329 != 128) {
            var4.method482(this.field1585, this.field1593.field1328, this.field1593.field1328, this.field1593.field1329);
        }
        if (this.field1593.field1330 != 0) {
            if (this.field1593.field1330 == 90) {
                var4.method477(1);
            }
            if (this.field1593.field1330 == 180) {
                var4.method477(1);
                var4.method477(1);
            }
            if (this.field1593.field1330 == 270) {
                var4.method477(1);
                var4.method477(1);
                var4.method477(1);
            }
        }
        var4.method483(this.field1593.field1331 + 64, this.field1593.field1332 + 850, -30, -50, -30, true);
        return var4;
    }
}
