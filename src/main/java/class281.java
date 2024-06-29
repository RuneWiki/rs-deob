import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class281 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public int field3845 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field3841 = 0;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Z")
    private boolean field3857 = false;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "[Lht;")
    public static class410[] field3858;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "[F")
    public static float[] field3859;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Lar;")
    public static class479 field3860;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    private int field3855;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "J")
    public long field3840;

    static {
        new class466("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field3858 = new class410[5];
        field3859 = new float[4];
        for (int var0 = 0; var0 < field3858.length; var0++) {
            field3858[var0] = new class410();
        }
        field3860 = new class479();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 4)
    public static void method1672(int arg0) {
        field3860 = null;
        int var1 = -101 / ((arg0 + 78) / 35);
        field3859 = null;
        field3858 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILsi;I)V", line = 15)
    private final void method1673(int arg0, class391 arg1, int arg2) {
        if (arg0 < 105) {
            this.method1673(80, null, 70);
        }
        if (arg2 == 1) {
            this.field3855 = arg1.method2353((byte) 92);
        } else if (arg2 == 2) {
            arg1.method2348(-2);
        } else if (arg2 == 3) {
            this.field3849 = arg1.method2361((byte) -56);
            this.field3848 = arg1.method2361((byte) -56);
            this.field3842 = arg1.method2361((byte) -56);
        } else if (arg2 == 4) {
            this.field3853 = arg1.method2348(-2);
            this.field3846 = arg1.method2361((byte) -56);
        } else if (arg2 == 6) {
            this.field3851 = arg1.method2348(-2);
        } else if (arg2 == 8) {
            this.field3841 = 1;
        } else if (arg2 == 9) {
            this.field3845 = 1;
        } else if (arg2 == 10) {
            this.field3857 = true;
        }
        field3844++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 71)
    public final void method1674(int arg0) {
        field3854++;
        this.field3847 = class183.field2678[this.field3855 << 3];
        this.field3852 = (int) Math.sqrt((double) (this.field3849 * this.field3849 + this.field3842 * this.field3842 + (this.field3848 * this.field3848)));
        if (this.field3846 == 0) {
            this.field3846 = 1;
        }
        if (this.field3853 == 0) {
            this.field3840 = 2147483647L;
        } else if (this.field3853 == 1) {
            this.field3840 = (this.field3852 * 8 / this.field3846);
            this.field3840 *= this.field3840;
        } else if (this.field3853 == 2) {
            this.field3840 = (this.field3852 * 8 / this.field3846);
        }
        if (this.field3857) {
            this.field3852 *= -1;
        }
        int var2 = -54 % ((-arg0 - 53) / 36);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLsi;)V", line = 123)
    public final void method1675(byte arg0, class391 arg1) {
        int var3 = 88 % ((-arg0 - 53) / 32);
        field3856++;
        while (true) {
            int var4 = arg1.method2348(-2);
            if (var4 == 0) {
                return;
            }
            this.method1673(120, arg1, var4);
        }
    }
}
