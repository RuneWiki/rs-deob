import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class43 extends class222 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field677 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lcf;")
    public static class93 field678 = class147.method1066("b12_full", -48);

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lcf;")
    private static class93 field686 = class147.method1066("Opened title screen", -48);

    @OriginalMember(owner = "client!le", name = "C", descriptor = "[Lph;")
    public static class78[] field691 = new class78[6];

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Lcf;")
    public static class93 field696 = field686;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lui;")
    public class227 field684;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Ls;")
    public class237 field688;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lfl;")
    public class240 field685;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lja;")
    public class59 field671;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lja;")
    public class59 field690;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Z")
    public boolean field694;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[I")
    public int[] field675;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method241(int arg0) {
        field676++;
        class45.field712.method139(arg0 ^ arg0);
        class40.field614.method1191(-27254);
        class165.field2914.method1191(arg0 - 53855);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method242(boolean arg0) {
        field678 = null;
        field691 = null;
        field696 = null;
        field686 = null;
        if (!arg0) {
            method242(false);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public final void method243(int arg0) {
        field683++;
        if (arg0 != 24946) {
            return;
        }
        int var2 = this.field687;
        if (this.field685 != null) {
            class240 var5 = this.field685.method1631(0);
            if (var5 == null) {
                this.field672 = 0;
                this.field681 = 0;
                this.field687 = -1;
                this.field693 = 0;
                this.field675 = null;
            } else {
                this.field672 = var5.field4283;
                this.field693 = var5.field4319 * 128;
                this.field675 = var5.field4296;
                this.field687 = var5.field4332;
                this.field681 = var5.field4320;
            }
        } else if (this.field684 != null) {
            int var3 = class267.method1786(109, this.field684);
            if (var2 != var3) {
                this.field687 = var3;
                class145 var4 = this.field684.field4062;
                if (var4.field2523 != null) {
                    var4 = var4.method1058(249);
                }
                if (var4 == null) {
                    this.field693 = 0;
                } else {
                    this.field693 = var4.field2513 * 128;
                }
            }
        } else if (this.field688 != null) {
            this.field687 = class68.method461(this.field688, 786864876);
            this.field693 = this.field688.field4224 * 128;
        }
        if (this.field687 != var2 && this.field671 != null) {
            class35.field543.method1657(this.field671);
            this.field671 = null;
        }
    }
}
