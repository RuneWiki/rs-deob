import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class124 extends class481 {

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lpga;")
    private class492 field1696;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private int field1698;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "J")
    public static long field1697 = 0L;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Leq;")
    public static class140 field1690;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Luia;")
    private class273 field1694;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Luia;", line = 6)
    public final class273 method796(int arg0) {
        field1692++;
        if (this.field1694 == null) {
            class703.field9782[4] = this.field1693;
            class703.field9782[1] = this.field1691;
            class703.field9782[0] = this.field1698;
            class703.field9782[5] = this.field1699;
            class703.field9782[2] = this.field1689;
            class268 var2 = this.field1696.field7694;
            class703.field9782[3] = this.field1695;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method86((byte) 117, class703.field9782[var5])) {
                    return null;
                }
                class468 var7 = var2.method91(class703.field9782[var5], -22805);
                int var8 = var7.field6391 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field6397 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class282.field3744[var6] = var2.method87(false, var4, 1.0F, var4, true, class703.field9782[var6]);
            }
            this.field1694 = this.field1696.method626(var4, class282.field3744, arg0 - 1, var3);
        }
        if (arg0 != 1) {
            field1690 = null;
        }
        return this.field1694;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 68)
    public static void method797(byte arg0) {
        if (arg0 <= 82) {
            method797((byte) -76);
        }
        field1690 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lpga;IIIIII)V", line = 87)
    public class124(class492 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1696 = arg0;
        this.field1695 = arg4;
        this.field1698 = arg1;
        this.field1693 = arg5;
        this.field1689 = arg3;
        this.field1699 = arg6;
        this.field1691 = arg2;
    }
}
