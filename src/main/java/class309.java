import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class309 extends class154 {

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field4967 = 0;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4963 = new String[1000];

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field4960;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public int field4981;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Ljb;")
    public static class224 field4970;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Lnj;")
    public class240 field4975;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lva;")
    public class287 field4978;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lva;")
    public class287 field4979;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lrl;")
    public class310 field4966;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "Lam;")
    public class314 field4983;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
    public boolean field4962;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[I")
    public int[] field4973;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method2099(boolean arg0) {
        class54.field776 = -1;
        field4965++;
        class108.field1546 = -1;
        class271.field4318 = 0;
        class231.field3614.field3280 = 0;
        class171.field2447 = false;
        class114.field1632 = 0;
        class281.field4457 = 0;
        class131.field1830.field3280 = 0;
        class163.field2311 = -1;
        class179.field2721 = 0;
        class154.field2138 = -1;
        class63.method394(false);
        if (!arg0) {
            method2099(true);
        }
        for (int var1 = 0; var1 < class48.field689.length; var1++) {
            if (class48.field689[var1] != null) {
                class48.field689[var1].field4047 = -1;
            }
        }
        for (int var2 = 0; var2 < class88.field1274.length; var2++) {
            if (class88.field1274[var2] != null) {
                class88.field1274[var2].field4047 = -1;
            }
        }
        class166.method1061(-29);
        class12.field203 = 1;
        class82.method519(-125, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class274.field4355[var3] = true;
        }
        class276.method1796(false);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
    public final void method2100(boolean arg0) {
        field4961++;
        if (!arg0) {
            this.field4971 = 76;
        }
        int var2 = this.field4960;
        if (this.field4975 != null) {
            class240 var3 = this.field4975.method1567(-1);
            if (var3 == null) {
                this.field4976 = 0;
                this.field4960 = -1;
                this.field4981 = 0;
                this.field4974 = 0;
                this.field4973 = null;
                this.field4972 = 0;
            } else {
                this.field4960 = var3.field3742;
                this.field4974 = var3.field3728;
                this.field4973 = var3.field3743;
                this.field4981 = var3.field3716;
                this.field4972 = var3.field3698;
                this.field4976 = var3.field3749 * 128;
            }
        } else if (this.field4966 != null) {
            int var4 = class157.method974(102, this.field4966);
            if (var2 != var4) {
                this.field4960 = var4;
                class211 var5 = this.field4966.field4993;
                if (var5.field3173 != null) {
                    var5 = var5.method1316((byte) -8);
                }
                if (var5 == null) {
                    this.field4974 = this.field4976 = 0;
                } else {
                    this.field4974 = var5.field3163;
                    this.field4976 = var5.field3142 * 128;
                }
            }
        } else if (this.field4983 != null) {
            this.field4960 = class58.method366(3640, this.field4983);
            this.field4976 = this.field4983.field5030 * 128;
            this.field4974 = this.field4983.field5042;
        }
        if (this.field4960 != var2 && this.field4979 != null) {
            class116.field1671.method910(this.field4979);
            this.field4979 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method2101(int arg0) {
        field4970 = null;
        field4963 = null;
        if (arg0 != -1) {
            field4977 = -13;
        }
    }
}
