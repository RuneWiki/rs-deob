import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class280 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    private int field3902 = -1;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    private int field3910 = 0;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "Leea;")
    private class114 field3914 = new class114();

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "Z")
    public boolean field3917 = false;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    private int field3908;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    private int field3912;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "[Lak;")
    private class295[] field3916;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "[[[I")
    private int[][][] field3911;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "Lkca;")
    public static class73 field3909 = new class73(77, 2);

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "Lkca;")
    public static class73 field3913 = new class73(20, 3);

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Lta;")
    public static class181 field3903;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "Lnr;")
    public static class52 field3915;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1824(int arg0) {
        field3906++;
        if (this.field3912 != this.field3908) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3912; var2++) {
            this.field3916[var2] = class154.field1913;
        }
        return this.field3911;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field3915 = null;
        field3913 = null;
        field3909 = null;
        if (arg0 != 2) {
            method1825(-83);
        }
        field3903 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)[[I")
    public final int[][] method1826(int arg0, int arg1) {
        field3907++;
        if (arg1 != -16486) {
            this.field3911 = null;
        }
        if (this.field3912 == this.field3908) {
            this.field3917 = this.field3916[arg0] == null;
            this.field3916[arg0] = class154.field1913;
            return this.field3911[arg0];
        } else if (this.field3912 == 1) {
            this.field3917 = this.field3902 != arg0;
            this.field3902 = arg0;
            return this.field3911[0];
        } else {
            class295 var3 = this.field3916[arg0];
            if (var3 == null) {
                this.field3917 = true;
                if (this.field3910 >= this.field3912) {
                    class295 var4 = (class295) this.field3914.method711(arg1 - 15243);
                    var3 = new class295(arg0, var4.field4385);
                    this.field3916[var4.field4388] = null;
                    var4.method2108(true);
                } else {
                    var3 = new class295(arg0, this.field3910);
                    this.field3910++;
                }
                this.field3916[arg0] = var3;
            } else {
                this.field3917 = false;
            }
            this.field3914.method710(var3, 60);
            return this.field3911[var3.field4385];
        }
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)V")
    public final void method1827(int arg0) {
        for (int var2 = 0; var2 < this.field3912; var2++) {
            this.field3911[var2][0] = null;
            this.field3911[var2][1] = null;
            this.field3911[var2][2] = null;
            this.field3911[var2] = null;
        }
        if (arg0 <= 101) {
            this.method1824(-104);
        }
        field3904++;
        this.field3911 = null;
        this.field3916 = null;
        this.field3914.method718(-127);
        this.field3914 = null;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(III)V")
    public class280(int arg0, int arg1, int arg2) {
        this.field3908 = arg1;
        this.field3912 = arg0;
        this.field3916 = new class295[this.field3908];
        this.field3911 = new int[this.field3912][3][arg2];
    }
}
