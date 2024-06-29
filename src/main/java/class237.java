import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class237 extends class43 {

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public int field3118 = 0;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3109 = -1;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Lbe;")
    public class131 field3126;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Lpi;")
    public class298 field3115;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lnd;")
    public class446 field3110;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lnp;")
    public class77 field3108;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Lnp;")
    public class77 field3116;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Z")
    public boolean field3111;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "[I")
    public int[] field3117;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
    public static final int method1520(int arg0, int arg1, int arg2) {
        field3113++;
        int var3 = arg2 >>> 24;
        int var4 = 255 - var3;
        if (arg0 != -7965) {
            field3109 = -88;
        }
        int var5 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method1521(int arg0) {
        field3105++;
        if (arg0 != -18541) {
            this.field3123 = -58;
        }
        int var2 = this.field3125;
        if (this.field3110 != null) {
            class446 var3 = this.field3110.method2759(arg0 + 43505);
            if (var3 == null) {
                this.field3119 = 0;
                this.field3117 = null;
                this.field3107 = 0;
                this.field3120 = 0;
                this.field3125 = -1;
                this.field3121 = 0;
            } else {
                this.field3121 = var3.field6211;
                this.field3107 = var3.field6234;
                this.field3120 = var3.field6201 * 128;
                this.field3119 = var3.field6194;
                this.field3125 = var3.field6173;
                this.field3117 = var3.field6175;
            }
        } else if (this.field3115 != null) {
            int var4 = class406.method2527(-117, this.field3115);
            if (var2 != var4) {
                this.field3125 = var4;
                class307 var5 = this.field3115.field3971;
                if (var5.field4113 != null) {
                    var5 = var5.method1946((byte) -2);
                }
                if (var5 == null) {
                    this.field3107 = this.field3120 = 0;
                } else {
                    this.field3107 = var5.field4122;
                    this.field3120 = var5.field4179 * 128;
                }
            }
        } else if (this.field3126 != null) {
            this.field3125 = class414.method2557(this.field3126, (byte) 74);
            this.field3120 = this.field3126.field1464 * 128;
            this.field3107 = this.field3126.field1467;
        }
        if (this.field3125 != var2 && this.field3116 != null) {
            class352.field4781.method1866(this.field3116);
            this.field3116 = null;
        }
    }
}
