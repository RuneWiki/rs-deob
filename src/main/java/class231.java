import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class231 extends class189 {

    @OriginalMember(owner = "client!dia", name = "J", descriptor = "I")
    public int field3132 = 0;

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!dia", name = "y", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!dia", name = "C", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!dia", name = "F", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!dia", name = "G", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!dia", name = "M", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!dia", name = "N", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!dia", name = "K", descriptor = "Lhba;")
    public class10 field3133;

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "Ldfa;")
    public class163 field3118;

    @OriginalMember(owner = "client!dia", name = "H", descriptor = "Ldfa;")
    public class163 field3130;

    @OriginalMember(owner = "client!dia", name = "L", descriptor = "Lkd;")
    public class280 field3134;

    @OriginalMember(owner = "client!dia", name = "A", descriptor = "Loj;")
    public class379 field3123;

    @OriginalMember(owner = "client!dia", name = "I", descriptor = "Loj;")
    public class379 field3131;

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "Lbe;")
    public static class37 field3108;

    @OriginalMember(owner = "client!dia", name = "O", descriptor = "Lvaa;")
    public class468 field3137;

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "Lso;")
    public static class469 field3110;

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "Lnp;")
    public class490 field3106;

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "Lnp;")
    public class490 field3117;

    @OriginalMember(owner = "client!dia", name = "B", descriptor = "Z")
    public boolean field3124;

    @OriginalMember(owner = "client!dia", name = "D", descriptor = "Z")
    public boolean field3126;

    @OriginalMember(owner = "client!dia", name = "E", descriptor = "Z")
    public boolean field3127;

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "[I")
    public int[] field3109;

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "[I")
    public static int[] field3111;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I", line = 10)
    public static final int method1495(int arg0) {
        field3136++;
        return ~class221.field2883 == arg0 ? class414.field5838 : class260.field3746;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V", line = 28)
    public final void method1496(int arg0) {
        field3122++;
        int var2 = this.field3135;
        boolean var3 = this.field3127;
        if (this.field3133 != null) {
            class10 var4 = this.field3133.method67(class101.field1201, 0);
            if (var4 == null) {
                this.field3115 = 0;
                this.field3113 = 0;
                this.field3127 = false;
                this.field3129 = 0;
                this.field3114 = 0;
                this.field3109 = null;
                this.field3126 = false;
                this.field3128 = 256;
                this.field3119 = 256;
                this.field3135 = -1;
            } else {
                this.field3115 = var4.field211;
                this.field3129 = var4.field152;
                this.field3114 = var4.field232 << 9;
                this.field3119 = var4.field141;
                this.field3135 = var4.field223;
                this.field3128 = var4.field194;
                this.field3109 = var4.field174;
                this.field3127 = var4.field156;
                this.field3113 = var4.field160;
                this.field3126 = var4.field146;
            }
        } else if (this.field3137 != null) {
            int var5 = class153.method1035((byte) -87, this.field3137);
            if (var2 != var5) {
                this.field3135 = var5;
                class353 var6 = this.field3137.field6632;
                if (var6.field5026 != null) {
                    var6 = var6.method2273((byte) 29, class101.field1201);
                }
                if (var6 == null) {
                    this.field3128 = 256;
                    this.field3127 = this.field3137.field6632.field5012;
                    this.field3129 = this.field3114 = 0;
                    this.field3119 = 256;
                } else {
                    this.field3114 = var6.field4999 << 9;
                    this.field3127 = var6.field5012;
                    this.field3129 = var6.field5010;
                    this.field3119 = var6.field5011;
                    this.field3128 = var6.field5003;
                }
            }
        } else if (this.field3134 != null) {
            this.field3135 = class243.method1552(this.field3134, -23426);
            this.field3128 = 256;
            this.field3127 = this.field3134.field3971;
            this.field3119 = 256;
            this.field3114 = this.field3134.field3948 << 9;
            this.field3129 = this.field3134.field3959;
        }
        if ((this.field3135 != var2 || var3 != this.field3127) && this.field3123 != null) {
            class192.field2560.method1733(this.field3123);
            this.field3123 = null;
            this.field3117 = null;
            this.field3118 = null;
        }
        if (arg0 < 4) {
            this.field3113 = -24;
        }
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)V", line = 151)
    public static void method1497(int arg0) {
        field3108 = null;
        field3110 = null;
        if (arg0 != 256) {
            field3111 = null;
        }
        field3111 = null;
    }
}
