import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class376 extends class134 {

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public int field4830 = 0;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Lpia;")
    public static class94 field4833 = new class94(80, -1);

    @OriginalMember(owner = "client!at", name = "K", descriptor = "[I")
    public static int[] field4855 = new int[2];

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public int field4834;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public int field4837;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public int field4838;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public int field4839;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public int field4842;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "I")
    public int field4858;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "Lefa;")
    public class183 field4846;

    @OriginalMember(owner = "client!at", name = "F", descriptor = "Lpk;")
    public class197 field4850;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lvc;")
    public class316 field4828;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "Lcba;")
    public class548 field4849;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "Lcba;")
    public class548 field4853;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "Lcr;")
    public class571 field4835;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "Lcr;")
    public class571 field4836;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "Lps;")
    public class95 field4848;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "Lps;")
    public class95 field4859;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "Z")
    public boolean field4829;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Z")
    public boolean field4831;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "Z")
    public boolean field4851;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "[I")
    public int[] field4840;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
    public static int[] field4854;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)I", line = 17)
    public static final int method2188(boolean arg0, int arg1) {
        field4856++;
        if (class7.field55 == null) {
            return 0;
        } else if (arg0 || class256.field3132 == null) {
            int var2 = arg1;
            for (int var3 = 0; var3 < class7.field55.length; var3++) {
                int var4 = class7.field55[var3];
                if (class586.field8270.method2463((byte) 100, var4)) {
                    var2++;
                }
                if (class278.field3417.method2463((byte) 110, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class7.field55.length * 2;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 53)
    public final void method2189(int arg0) {
        field4843++;
        if (arg0 < 116) {
            this.field4829 = true;
        }
        int var2 = this.field4847;
        boolean var3 = this.field4851;
        if (this.field4828 != null) {
            class316 var6 = this.field4828.method1886(class722.field10125, -68);
            if (var6 == null) {
                this.field4851 = false;
                this.field4840 = null;
                this.field4838 = 0;
                this.field4842 = 256;
                this.field4832 = 0;
                this.field4844 = 256;
                this.field4857 = 0;
                this.field4829 = false;
                this.field4847 = -1;
                this.field4841 = 0;
            } else {
                this.field4842 = var6.field3983;
                this.field4847 = var6.field4015;
                this.field4851 = var6.field4007;
                this.field4840 = var6.field4037;
                this.field4857 = var6.field4053;
                this.field4844 = var6.field3979;
                this.field4829 = var6.field4006;
                this.field4832 = var6.field3975 << 9;
                this.field4838 = var6.field4016;
                this.field4841 = var6.field4033;
            }
        } else if (this.field4850 != null) {
            int var4 = class147.method914(-62, this.field4850);
            if (var2 != var4) {
                this.field4847 = var4;
                class326 var5 = this.field4850.field2293;
                if (var5.field4199 != null) {
                    var5 = var5.method1939(true, class722.field10125);
                }
                if (var5 == null) {
                    this.field4851 = this.field4850.field2293.field4198;
                    this.field4844 = 256;
                    this.field4838 = this.field4832 = 0;
                    this.field4842 = 256;
                } else {
                    this.field4832 = var5.field4208 << 9;
                    this.field4844 = var5.field4205;
                    this.field4838 = var5.field4184;
                    this.field4851 = var5.field4198;
                    this.field4842 = var5.field4195;
                }
            }
        } else if (this.field4846 != null) {
            this.field4847 = class183.method1131(122, this.field4846);
            this.field4844 = 256;
            this.field4832 = this.field4846.field2185 << 9;
            this.field4838 = this.field4846.field2156;
            this.field4842 = 256;
            this.field4851 = this.field4846.field2178;
        }
        if (this.field4847 == var2 && this.field4851 == var3) {
            return;
        }
        if (this.field4859 == null) {
            return;
        }
        class597.field8470.method1690(this.field4859);
        this.field4849 = null;
        this.field4835 = null;
        this.field4859 = null;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V", line = 190)
    public static void method2190(int arg0) {
        if (arg0 == 0) {
            field4855 = null;
            field4854 = null;
            field4833 = null;
        }
    }
}
