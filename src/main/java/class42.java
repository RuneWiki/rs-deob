import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class42 extends class60 {

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public int field657 = 0;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "[Lvd;")
    public class144[] field659 = new class144[5];

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "[I")
    public int[] field673 = new int[5];

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
    public static int[] field647 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field663 = -2;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Lq;")
    public class105 field665;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "Lca;")
    public class106 field674;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "Lbc;")
    public class127 field669;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "Lkj;")
    public class188 field664;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lnj;")
    public class241 field655;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Lre;")
    public class293 field666;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "Lsg;")
    public class42 field670;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Z")
    public boolean field648;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Z")
    public boolean field653;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
    public boolean field667;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(III)V", line = 6)
    public class42(int arg0, int arg1, int arg2) {
        this.field668 = this.field658 = arg0;
        this.field656 = arg1;
        this.field652 = arg2;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)J", line = 24)
    public static final long method380(byte arg0) {
        if (arg0 != -113) {
            field650 = 4;
        }
        field661++;
        return class19.field357.method186((byte) -115);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 63)
    public static final void method381() {
        if (class340.field5243 != null) {
            for (int var0 = 0; var0 < class340.field5243.length; var0++) {
                for (int var1 = 0; var1 < class91.field1449; var1++) {
                    for (int var2 = 0; var2 < class327.field5110; var2++) {
                        class340.field5243[var0][var1][var2] = null;
                    }
                }
            }
        }
        class12.field267 = (class256[][]) null;
        if (class104.field1716 != null) {
            for (int var3 = 0; var3 < class104.field1716.length; var3++) {
                for (int var4 = 0; var4 < class91.field1449; var4++) {
                    for (int var5 = 0; var5 < class327.field5110; var5++) {
                        class104.field1716[var3][var4][var5] = null;
                    }
                }
            }
        }
        class149.field2441 = (class256[][]) null;
        class55.field844 = 0;
        if (class118.field1909 != null) {
            for (int var6 = 0; var6 < class55.field844; var6++) {
                class118.field1909[var6] = null;
            }
        }
        if (class124.field2008 != null) {
            for (int var7 = 0; var7 < class11.field252; var7++) {
                class124.field2008[var7] = null;
            }
            class11.field252 = 0;
        }
        if (class3.field97 != null) {
            for (int var8 = 0; var8 < class3.field97.length; var8++) {
                class3.field97[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V", line = 182)
    public static void method382(byte arg0) {
        field647 = null;
        if (arg0 != -6) {
            field647 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lb;", line = 195)
    public static final class66 method383(int arg0, int arg1) {
        field651++;
        class66 var2 = (class66) class247.field3680.method2288((long) arg1, (byte) 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field1690.method967(arg0, arg1, arg0 + 65248);
        class66 var4 = new class66();
        if (var3 != null) {
            var4.method529(new class1(var3), arg0 ^ 0x20);
        }
        var4.method525((byte) -17);
        class247.field3680.method2281(arg0 - 32, (long) arg1, var4);
        return var4;
    }
}
