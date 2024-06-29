import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class91 {

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public int field1660 = 128;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public int field1657 = 128;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "[I")
    public static int[] field1665 = new int[13];

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "[[Llk;")
    public static class545[][] field1668;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Lkba;")
    public final class91 method880(byte arg0) {
        if (arg0 < 101) {
            return null;
        } else {
            field1669++;
            return new class91(this.field1661, this.field1657, this.field1660, this.field1667, this.field1662, this.field1666);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIZ)I")
    public static final int method881(int arg0, int arg1, int arg2, boolean arg3) {
        field1658++;
        class430 var4 = class605.method3470((byte) -96, arg3, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = -33 % ((-arg1 - 23) / 35);
            int var6 = 0;
            for (int var7 = 0; var7 < var4.field6218.length; var7++) {
                if (var4.field6215[var7] == arg2) {
                    var6 += var4.field6218[var7];
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lqh;I)V")
    public static final void method882(class61 arg0, int arg1) {
        field1664++;
        if (arg0.field1397.length - arg0.field1393 < 1) {
            return;
        }
        int var2 = arg0.method732(-559537960);
        if (var2 < 0 || var2 > 1 || arg0.field1397.length - arg0.field1393 < 2) {
            return;
        }
        int var3 = -63 % ((arg1 + 60) / 47);
        int var4 = arg0.method723((byte) -25);
        if ((arg0.field1397.length - arg0.field1393) < (var4 * 6)) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method723((byte) -25);
            int var7 = arg0.method730(104);
            if (class650.field9383.length > var6 && class302.field4501[var6] && (class458.field6534.method492(19, var6).field2524 != '1' || var7 >= -1 && var7 <= 1)) {
                class650.field9383[var6] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILkba;)V")
    public final void method883(int arg0, class91 arg1) {
        this.field1657 = arg1.field1657;
        field1663++;
        if (arg0 != 0) {
            return;
        }
        this.field1661 = arg1.field1661;
        this.field1666 = arg1.field1666;
        this.field1667 = arg1.field1667;
        this.field1662 = arg1.field1662;
        this.field1660 = arg1.field1660;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public static void method884(int arg0) {
        if (arg0 == 0) {
            field1668 = null;
            field1665 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(I)V")
    public class91(int arg0) {
        this.field1661 = arg0;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIII)V")
    private class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1660 = arg2;
        this.field1666 = arg5;
        this.field1667 = arg3;
        this.field1661 = arg0;
        this.field1662 = arg4;
        this.field1657 = arg1;
    }
}
