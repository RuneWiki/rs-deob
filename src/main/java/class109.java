import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class109 {

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    private int field1795 = 0;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Luc;")
    private class39 field1783;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field1790 = -1;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lek;")
    private class166 field1792;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lhc;")
    public static class235 field1784;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lhc;")
    public static class235 field1797;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field1787;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Z")
    public static boolean field1782;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([IB[ILwc;[I)V")
    public static final void method776(int[] arg0, byte arg1, int[] arg2, class236 arg3, int[] arg4) {
        int var5 = 0;
        if (arg1 >= -3) {
            field1789 = -106;
        }
        while (var5 < arg0.length) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var8 != 0 && var9 < arg3.field2273.length; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2273[var9] = null;
                    } else {
                        class30 var10 = class148.method996(-106, var6);
                        int var11 = var10.field450;
                        class65 var12 = arg3.field2273[var9];
                        if (var12 != null) {
                            if (var12.field1094 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2273[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1088 = 0;
                                    var12.field1097 = var7;
                                    var12.field1087 = 1;
                                    var12.field1086 = 0;
                                    var12.field1095 = 0;
                                    class52.method390(class283.field4473 == arg3, var10, 0, 109, arg3.field2278, arg3.field2240);
                                } else if (var11 == 2) {
                                    var12.field1086 = 0;
                                }
                            } else if (var10.field440 >= class148.method996(-51, var12.field1094).field440) {
                                var12 = arg3.field2273[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class65 var13 = arg3.field2273[var9] = new class65();
                            var13.field1097 = var7;
                            var13.field1095 = 0;
                            var13.field1094 = var6;
                            var13.field1088 = 0;
                            var13.field1087 = 1;
                            var13.field1086 = 0;
                            class52.method390(class283.field4473 == arg3, var10, 0, 121, arg3.field2278, arg3.field2240);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
            var5++;
        }
        field1786++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lek;")
    public final class166 method777(int arg0) {
        this.field1795 = arg0;
        field1796++;
        return this.method779((byte) -122);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method778(byte arg0) {
        if (arg0 != -59) {
            field1787 = null;
        }
        field1797 = null;
        field1787 = null;
        field1784 = null;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lek;")
    public final class166 method779(byte arg0) {
        if (arg0 > -91) {
            this.field1795 = 54;
        }
        field1794++;
        if (this.field1795 > 0 && this.field1783.field546[this.field1795 - 1] != this.field1792) {
            class166 var2 = this.field1792;
            this.field1792 = var2.field2608;
            return var2;
        }
        while (this.field1795 < this.field1783.field552) {
            class166 var3 = this.field1783.field546[this.field1795++].field2608;
            if (this.field1783.field546[this.field1795 - 1] != var3) {
                this.field1792 = var3.field2608;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)[Lch;")
    public static final class290[] method780(byte arg0) {
        field1791++;
        int var1 = -63 / ((26 - arg0) / 62);
        class290[] var2 = new class290[class293.field4626];
        for (int var3 = 0; var3 < class293.field4626; var3++) {
            var2[var3] = new class290(class213.field3317, class130.field2056, class193.field3066[var3], class108.field1779[var3], class28.field390[var3], class171.field2679[var3], class198.field3123[var3], class94.field1601);
        }
        class19.method179(8);
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static final void method781(int arg0) {
        class258.field4122.method1888(96);
        int var1 = 8 / ((arg0 - 51) / 62);
        field1785++;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Luc;)V")
    public class109(class39 arg0) {
        this.field1783 = arg0;
    }
}
