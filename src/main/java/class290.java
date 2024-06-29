import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class290 extends class206 {

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field4964 = 0;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Lwa;")
    public static class75 field4976 = class66.method560("null", false);

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Lsi;")
    public static class300 field4973 = new class300(0, 0);

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field4981 = 0;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Lwa;")
    public static class75 field4983 = class66.method560("hitmarks", false);

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public int field4960;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Leb;")
    public class108 field4967;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Lrl;")
    public class183 field4975;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Lrl;")
    public class183 field4978;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lbl;")
    public class295 field4962;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lwc;")
    public class96 field4970;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Z")
    public boolean field4963;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "[I")
    public int[] field4971;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Z", line = 12)
    public static final boolean method2023(int arg0, int arg1) {
        if (arg0 != 0) {
            field4976 = (class75) null;
        }
        field4982++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 26)
    public static void method2024(int arg0) {
        field4976 = null;
        field4973 = null;
        field4983 = null;
        if (arg0 != -9962) {
            method2024(-121);
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 46)
    public final void method2025(int arg0) {
        if (arg0 != 18792) {
            return;
        }
        field4969++;
        int var2 = this.field4961;
        if (this.field4967 != null) {
            class108 var3 = this.field4967.method849(true);
            if (var3 == null) {
                this.field4961 = -1;
                this.field4971 = null;
                this.field4965 = 0;
                this.field4960 = 0;
                this.field4977 = 0;
            } else {
                this.field4961 = var3.field1859;
                this.field4977 = var3.field1815 * 128;
                this.field4965 = var3.field1857;
                this.field4971 = var3.field1828;
                this.field4960 = var3.field1801;
            }
        } else if (this.field4962 != null) {
            int var4 = class213.method1570(this.field4962, (byte) -115);
            if (var2 != var4) {
                this.field4961 = var4;
                class229 var5 = this.field4962.field5070;
                if (var5.field3868 != null) {
                    var5 = var5.method1673(false);
                }
                if (var5 == null) {
                    this.field4977 = 0;
                } else {
                    this.field4977 = var5.field3841 * 128;
                }
            }
        } else if (this.field4970 != null) {
            this.field4961 = class133.method1034((byte) 112, this.field4970);
            this.field4977 = this.field4970.field1582 * 128;
        }
        if (this.field4961 != var2 && this.field4975 != null) {
            class94.field1527.method1790(this.field4975);
            this.field4975 = null;
        }
    }
}
