import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class721 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lal;")
    private class107 field9977 = new class107();

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Ldha;")
    private class83 field9986 = new class83();

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    private int field9982;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    private int field9983;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Ljo;")
    private class353 field9981;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Z")
    public static boolean field9973 = false;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "B")
    public static byte field9980;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[[S")
    public static short[][] field9985;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILit;)Lbt;")
    public static final class48 method4033(int arg0, class672 arg1) {
        field9984++;
        class48 var2;
        if (class330.field4661 == null) {
            var2 = new class48();
        } else {
            var2 = class330.field4661;
            class330.field4661 = class330.field4661.field611;
            class428.field5822--;
            var2.field611 = null;
        }
        if (arg0 > -121) {
            field9980 = 53;
        }
        var2.field605 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method4034(boolean arg0) {
        if (arg0) {
            field9980 = -49;
        }
        field9985 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)V")
    public final void method4035(long arg0, byte arg1) {
        field9976++;
        class107 var4 = (class107) this.field9981.method2242(arg0, -1);
        if (var4 != null) {
            var4.method3387((byte) 114);
            var4.method827(3);
            this.field9982++;
        }
        int var5 = -127 % ((arg1 + 19) / 36);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Z")
    public static final boolean method4036(byte arg0) {
        field9979++;
        if (arg0 >= -118) {
            method4034(false);
        }
        class304 var1 = (class304) class791.field10851.method1731((byte) -115);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field4381; var2++) {
            if (var1.field4377[var2] != null && var1.field4377[var2].field2089 == 0) {
                return false;
            }
            if (var1.field4385[var2] != null && var1.field4385[var2].field2089 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lal;JZ)V")
    public final void method4037(class107 arg0, long arg1, boolean arg2) {
        if (arg2) {
            this.field9983 = 37;
        }
        field9978++;
        if (this.field9982 == 0) {
            class107 var5 = this.field9986.method633(18801);
            var5.method3387((byte) -35);
            var5.method827(3);
            if (this.field9977 == var5) {
                class107 var6 = this.field9986.method633(18801);
                var6.method3387((byte) -36);
                var6.method827(3);
            }
        } else {
            this.field9982--;
        }
        this.field9981.method2241(126, arg1, arg0);
        this.field9986.method626((byte) -117, arg0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method4038(int arg0) {
        this.field9986.method629(false);
        field9974++;
        this.field9981.method2240(70);
        this.field9977 = new class107();
        this.field9982 = this.field9983;
        if (arg0 != -15210) {
            this.field9983 = -78;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IJ)Lal;")
    public final class107 method4039(int arg0, long arg1) {
        if (arg0 != 0) {
            return null;
        }
        field9975++;
        class107 var4 = (class107) this.field9981.method2242(arg1, -1);
        if (var4 != null) {
            this.field9986.method626((byte) -122, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I)V")
    public class721(int arg0) {
        this.field9982 = arg0;
        this.field9983 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field9981 = new class353(var2);
    }
}
