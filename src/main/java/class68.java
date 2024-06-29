import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YUINHFWF")
public class class68 extends class56 {

    @OriginalMember(owner = "client!YUINHFWF", name = "p", descriptor = "Z")
    private boolean field1676 = false;

    @OriginalMember(owner = "client!YUINHFWF", name = "t", descriptor = "B")
    private byte field1680 = -97;

    @OriginalMember(owner = "client!YUINHFWF", name = "m", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!YUINHFWF", name = "n", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client!YUINHFWF", name = "o", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!YUINHFWF", name = "v", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!YUINHFWF", name = "w", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!YUINHFWF", name = "x", descriptor = "I")
    private int field1684;

    @OriginalMember(owner = "client!YUINHFWF", name = "y", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!YUINHFWF", name = "u", descriptor = "LXTKQUJNF;")
    private class65 field1681;

    @OriginalMember(owner = "client!YUINHFWF", name = "A", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client!YUINHFWF", name = "B", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!YUINHFWF", name = "q", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!YUINHFWF", name = "r", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!YUINHFWF", name = "z", descriptor = "[I")
    public int[] field1686;

    @OriginalMember(owner = "client!YUINHFWF", name = "s", descriptor = "Lclient;")
    public static client field1679;

    @OriginalMember(owner = "client!YUINHFWF", name = "b", descriptor = "(B)LMCFQOEAW;")
    public final class35 method576(byte arg0) {
        int var2 = -1;
        if (arg0 != -97) {
            throw new NullPointerException();
        }
        if (this.field1677 != -1) {
            class13 var3 = class13.field697[this.field1677];
            int var4 = var3.field699;
            int var5 = var3.field700;
            int var6 = var3.field701;
            int var7 = client.field341[var6 - var5];
            var2 = field1679.field167[var4] >> var5 & var7;
        } else if (this.field1678 != -1) {
            var2 = field1679.field167[this.field1678];
        }
        return var2 < 0 || var2 >= this.field1686.length || this.field1686[var2] == -1 ? null : class35.method341(this.field1686[var2]);
    }

    @OriginalMember(owner = "client!YUINHFWF", name = "<init>", descriptor = "(IIBIIZIIII)V")
    public class68(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 7) {
            this.field1676 = !this.field1676;
        }
        this.field1673 = arg8;
        this.field1674 = arg4;
        this.field1675 = arg9;
        this.field1682 = arg7;
        this.field1683 = arg6;
        this.field1684 = arg1;
        this.field1685 = arg0;
        if (arg3 != -1) {
            this.field1681 = class65.field1628[arg3];
            this.field1687 = 0;
            this.field1688 = client.field343 - 1;
            if (arg5 && this.field1681.field1633 != -1) {
                this.field1687 = (int) (Math.random() * (double) this.field1681.field1629);
                this.field1688 -= (int) (Math.random() * (double) this.field1681.method532(this.field1687, (byte) 6));
            }
        }
        class35 var11 = class35.method341(this.field1673);
        this.field1677 = var11.field1064;
        this.field1678 = var11.field1065;
        this.field1686 = var11.field1046;
    }

    @OriginalMember(owner = "client!YUINHFWF", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public final class29 method214(byte arg0) {
        int var2 = -1;
        if (this.field1681 != null) {
            int var3 = client.field343 - this.field1688;
            if (var3 > 100 && this.field1681.field1633 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field1681.method532(this.field1687, (byte) 6)) {
                            break label50;
                        }
                        var3 -= this.field1681.method532(this.field1687, (byte) 6);
                        this.field1687++;
                    } while (this.field1687 < this.field1681.field1629);
                    this.field1687 -= this.field1681.field1633;
                } while (this.field1687 >= 0 && this.field1687 < this.field1681.field1629);
                this.field1681 = null;
            }
            this.field1688 = client.field343 - var3;
            if (this.field1681 != null) {
                var2 = this.field1681.field1630[this.field1687];
            }
        }
        class35 var4;
        if (this.field1686 == null) {
            var4 = class35.method341(this.field1673);
        } else {
            var4 = this.method576(this.field1680);
        }
        if (var4 == null) {
            return null;
        }
        class29 var5 = var4.method338(this.field1674, this.field1675, this.field1682, this.field1683, this.field1684, this.field1685, var2);
        if (arg0 != 7) {
            this.field1676 = !this.field1676;
        }
        return var5;
    }
}
