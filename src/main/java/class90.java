import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class90 extends class132 {

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "[Lre;")
    public class164[] field1686 = new class164[5];

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public int field1682 = 0;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "[I")
    public int[] field1692 = new int[5];

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Z")
    public static boolean field1665 = true;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[B")
    public static byte[] field1670 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Llh;")
    public class113 field1679;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "Lob;")
    public class134 field1684;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lrh;")
    public static class167 field1668;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Lue;")
    public class191 field1681;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lwf;")
    public static class210 field1667;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Ld;")
    public class30 field1691;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Lf;")
    public class50 field1693;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Lja;")
    public class88 field1690;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Ljc;")
    public class90 field1675;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Z")
    public boolean field1671;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Z")
    public boolean field1677;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Z")
    public boolean field1688;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static final void method527(byte arg0) {
        int var1 = -82 / ((-arg0 - 55) / 51);
        if (class136.field2474 == null || class67.field1304 == null) {
            class136.field2474 = new int[256];
            class67.field1304 = new int[256];
            for (int var2 = 0; var2 < 256; var2++) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class136.field2474[var2] = (int) (Math.sin(var3) * 4096.0D);
                class67.field1304[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field1666++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILka;)Ltg;")
    public static final class184 method528(int arg0, int arg1, class97 arg2) {
        field1669++;
        try {
            class184 var3 = new class184();
            var3.field3555 = arg2.method582(-14590);
            if (var3.field3555 > arg1) {
                var3.field3555 = arg1;
            }
            if (arg0 != 13806) {
                method529(-96);
            }
            var3.field3527 = new byte[var3.field3555];
            arg2.field1834 += class118.field2131.method855(arg2.field1809, (byte) 110, 0, arg2.field1834, var3.field3527, var3.field3555);
            return var3;
        } catch (Exception var4) {
            return class162.field2925;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1668 = null;
        if (arg0 < 124) {
            method527((byte) -26);
        }
        field1667 = null;
        field1670 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
    public class90(int arg0, int arg1, int arg2) {
        this.field1685 = this.field1672 = arg0;
        this.field1674 = arg2;
        this.field1683 = arg1;
    }
}
