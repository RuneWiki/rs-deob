import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VXTLNFMD")
public class class62 extends class31 {

    @OriginalMember(owner = "client!VXTLNFMD", name = "s", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!VXTLNFMD", name = "t", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!VXTLNFMD", name = "u", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!VXTLNFMD", name = "n", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!VXTLNFMD", name = "o", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!VXTLNFMD", name = "p", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!VXTLNFMD", name = "w", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!VXTLNFMD", name = "q", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client!VXTLNFMD", name = "v", descriptor = "LSPUHKLMC;")
    private class50 field1568;

    @OriginalMember(owner = "client!VXTLNFMD", name = "x", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!VXTLNFMD", name = "r", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!VXTLNFMD", name = "l", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!VXTLNFMD", name = "m", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!VXTLNFMD", name = "y", descriptor = "[I")
    public int[] field1571;

    @OriginalMember(owner = "client!VXTLNFMD", name = "z", descriptor = "Lclient;")
    public static client field1572;

    @OriginalMember(owner = "client!VXTLNFMD", name = "b", descriptor = "(B)LYCVHWRKK;")
    public final class68 method533(byte arg0) {
        if (arg0 != -70) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1558 != -1) {
            class56 var3 = class56.field1489[this.field1558];
            int var4 = var3.field1491;
            int var5 = var3.field1492;
            int var6 = var3.field1493;
            int var7 = client.field307[var6 - var5];
            var2 = field1572.field599[var4] >> var5 & var7;
        } else if (this.field1559 != -1) {
            var2 = field1572.field599[this.field1559];
        }
        return var2 < 0 || var2 >= this.field1571.length || this.field1571[var2] == -1 ? null : class68.method575(this.field1571[var2]);
    }

    @OriginalMember(owner = "client!VXTLNFMD", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method39(byte arg0) {
        int var2 = -1;
        if (this.field1568 != null) {
            int var3 = client.field564 - this.field1564;
            if (var3 > 100 && this.field1568.field1397 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field1568.method507(this.field1570, 196)) {
                            break label45;
                        }
                        var3 -= this.field1568.method507(this.field1570, 196);
                        this.field1570++;
                    } while (this.field1570 < this.field1568.field1393);
                    this.field1570 -= this.field1568.field1397;
                } while (this.field1570 >= 0 && this.field1570 < this.field1568.field1393);
                this.field1568 = null;
            }
            this.field1564 = client.field564 - var3;
            if (this.field1568 != null) {
                var2 = this.field1568.field1394[this.field1570];
            }
        }
        class68 var4;
        if (this.field1571 == null) {
            var4 = class68.method575(this.field1565);
        } else {
            var4 = this.method533((byte) -70);
        }
        if (var4 == null) {
            return null;
        }
        class65 var5 = var4.method580(this.field1566, this.field1567, this.field1560, this.field1561, this.field1562, this.field1563, var2);
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        return var5;
    }

    @OriginalMember(owner = "client!VXTLNFMD", name = "<init>", descriptor = "(IIIZIIIIII)V")
    public class62(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1565 = arg1;
        this.field1566 = arg8;
        this.field1567 = arg5;
        this.field1560 = arg4;
        this.field1561 = arg6;
        this.field1562 = arg7;
        if (arg2 != 7) {
            this.field1569 = -429;
        }
        this.field1563 = arg0;
        if (arg9 != -1) {
            this.field1568 = class50.field1392[arg9];
            this.field1570 = 0;
            this.field1564 = client.field564;
            if (arg3 && this.field1568.field1397 != -1) {
                this.field1570 = (int) (Math.random() * (double) this.field1568.field1393);
                this.field1564 -= (int) (Math.random() * (double) this.field1568.method507(this.field1570, 196));
            }
        }
        class68 var11 = class68.method575(this.field1565);
        this.field1558 = var11.field1710;
        this.field1559 = var11.field1712;
        this.field1571 = var11.field1695;
    }
}
