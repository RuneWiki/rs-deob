import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class13 extends class425 {

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public int field204 = 0;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field202 = 0;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Lfa;")
    public class128 field194;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lad;")
    public class244 field178;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lad;")
    public class244 field183;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Lvj;")
    public static class256 field187;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lbi;")
    public class282 field182;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "Lpn;")
    public class446 field200;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Z")
    public boolean field201;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
    public int[] field190;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public final void method71(boolean arg0) {
        field184++;
        if (!arg0) {
            this.field182 = null;
        }
        int var2 = this.field188;
        if (this.field182 != null) {
            class282 var5 = this.field182.method1942(4096);
            if (var5 == null) {
                this.field195 = 0;
                this.field185 = 0;
                this.field190 = null;
                this.field193 = 0;
                this.field188 = -1;
                this.field192 = 0;
            } else {
                this.field193 = var5.field4060;
                this.field195 = var5.field4110 * 128;
                this.field188 = var5.field4034;
                this.field190 = var5.field4035;
                this.field192 = var5.field4112;
                this.field185 = var5.field4106;
            }
        } else if (this.field200 != null) {
            int var3 = class185.method1325((byte) -110, this.field200);
            if (var2 != var3) {
                this.field188 = var3;
                class346 var4 = this.field200.field6375;
                if (var4.field5023 != null) {
                    var4 = var4.method2273(-1);
                }
                if (var4 == null) {
                    this.field192 = this.field195 = 0;
                } else {
                    this.field192 = var4.field4995;
                    this.field195 = var4.field5026 * 128;
                }
            }
        } else if (this.field194 != null) {
            this.field188 = class6.method26(this.field194, 9251);
            this.field195 = this.field194.field1800 * 128;
            this.field192 = this.field194.field1812;
        }
        if (this.field188 != var2 && this.field178 != null) {
            class378.field5380.method2296(this.field178);
            this.field178 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method72(int arg0) {
        if (arg0 != 0) {
            field186 = 79;
        }
        field187 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
    public static final void method73(boolean arg0) {
        field197++;
        class15 var1 = class287.field4179;
        synchronized (class287.field4179) {
            if (arg0) {
                class287.field4179.method102((byte) -128);
            }
        }
    }
}
