import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class519 {

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "[Lle;")
    private class200[] field7718;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    private int field7717;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "[S")
    public static short[] field7724 = new short[256];

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lrn;")
    public static class174 field7715 = new class174(44, 0);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "J")
    private long field7725;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Ld;")
    public static class102 field7726;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Lle;")
    private class200 field7720;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lng;")
    public static class226 field7714;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Los;")
    public static class304 field7721;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lle;")
    public final class200 method3100(int arg0) {
        field7716++;
        if (arg0 != -1601818136) {
            this.field7725 = 22L;
        }
        if (this.field7720 == null) {
            return null;
        }
        class200 var2 = this.field7718[(int) (this.field7725 & (long) (this.field7717 - 1))];
        while (this.field7720 != var2) {
            if (this.field7720.field2927 == this.field7725) {
                class200 var3 = this.field7720;
                this.field7720 = this.field7720.field2928;
                return var3;
            }
            this.field7720 = this.field7720.field2928;
        }
        this.field7720 = null;
        return null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILck;)V")
    public static final void method3101(int arg0, class452 arg1) {
        int var2 = 64 / ((arg0 - 28) / 35);
        field7723++;
        for (int var3 = 0; var3 < class29.field633; var3++) {
            int var4 = class35.field674[var3];
            class256 var5 = class183.field2747[var4];
            int var6 = arg1.method1063((byte) 113);
            if ((var6 & 0x2) != 0) {
                var6 += arg1.method1063((byte) 114) << 8;
            }
            if ((var6 & 0x200) != 0) {
                var6 += arg1.method1063((byte) -56) << 16;
            }
            class58.method518(var5, arg1, var4, -22471, var6);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BJ)Lle;")
    public final class200 method3102(byte arg0, long arg1) {
        field7713++;
        this.field7725 = arg1;
        if (arg0 != -42) {
            return null;
        }
        class200 var4 = this.field7718[(int) (arg1 & (long) (this.field7717 - 1))];
        for (this.field7720 = var4.field2928; this.field7720 != var4; this.field7720 = this.field7720.field2928) {
            if (this.field7720.field2927 == arg1) {
                class200 var5 = this.field7720;
                this.field7720 = this.field7720.field2928;
                return var5;
            }
        }
        this.field7720 = null;
        return null;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public static void method3103(int arg0) {
        if (arg0 <= 45) {
            method3101(95, null);
        }
        field7715 = null;
        field7726 = null;
        field7721 = null;
        field7714 = null;
        field7724 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BJLle;)V")
    public final void method3104(byte arg0, long arg1, class200 arg2) {
        if (arg2.field2923 != null) {
            arg2.method1382(7218);
        }
        field7722++;
        class200 var5 = this.field7718[(int) (arg1 & (long) (this.field7717 - 1))];
        arg2.field2928 = var5;
        arg2.field2923 = var5.field2923;
        arg2.field2923.field2928 = arg2;
        arg2.field2928.field2923 = arg2;
        arg2.field2927 = arg1;
        if (arg0 != 65) {
            this.method3102((byte) -39, 34L);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
    public class519(int arg0) {
        this.field7718 = new class200[arg0];
        this.field7717 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field7718[var2] = new class200();
            var3.field2928 = var3;
            var3.field2923 = var3;
        }
    }
}
