import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class65 {

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public int field833 = 128;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public int field839 = 128;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lla;")
    public static class418 field841;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lar;")
    public static class634 field826;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lf;")
    public static class702 field834;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method700(int arg0) {
        if (arg0 == 0) {
            if (class261.field4273 == 2) {
                class458.field6856[0].method3190(class235.field3744[0]);
                class458.field6856[1].method3190(class235.field3744[1]);
            } else if (class261.field4273 == 3) {
                class458.field6856[0].method3190(class235.field3744[0]);
                class458.field6856[1].method3190(class235.field3744[1]);
                class458.field6856[2].method3190(class235.field3744[2]);
            } else {
                class458.field6856[0].method3190(class235.field3744[0]);
                class458.field6856[1].method3190(class235.field3744[1]);
                class458.field6856[2].method3190(class235.field3744[2]);
                class458.field6856[3].method3190(class235.field3744[3]);
            }
        } else if (arg0 == 1) {
            if (class261.field4273 == 2) {
                class458.field6856[0].method3190(class235.field3744[2]);
            } else if (class261.field4273 == 3) {
                class458.field6856[0].method3190(class235.field3744[3]);
                class458.field6856[1].method3190(class235.field3744[4]);
            } else {
                class458.field6856[0].method3190(class235.field3744[4]);
                class458.field6856[1].method3190(class235.field3744[5]);
                class458.field6856[2].method3190(class235.field3744[6]);
            }
        } else if (arg0 == 2) {
            if (class261.field4273 == 2) {
                class458.field6856[0].method3190(class235.field3744[3]);
                return;
            }
            if (class261.field4273 == 3) {
                class458.field6856[0].method3190(class235.field3744[5]);
                return;
            }
            class458.field6856[0].method3190(class235.field3744[7]);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Loi;")
    public final class65 method701(int arg0) {
        if (arg0 == 5361) {
            field842++;
            return new class65(this.field827, this.field839, this.field833, this.field830, this.field828, this.field840);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)S")
    public static final short method702(int arg0, int arg1) {
        field835++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7 = 108 % ((-arg0 - 16) / 62);
        int var8;
        if (var6 == 0) {
            var8 = var5 << 1;
        } else {
            var8 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var8 >> 4 << 7);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Loi;I)V")
    public final void method703(class65 arg0, int arg1) {
        this.field827 = arg0.field827;
        if (arg1 <= 65) {
            return;
        }
        this.field840 = arg0.field840;
        field838++;
        this.field833 = arg0.field833;
        this.field828 = arg0.field828;
        this.field830 = arg0.field830;
        this.field839 = arg0.field839;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method704(byte arg0) {
        field826 = null;
        field834 = null;
        field841 = null;
        int var1 = -63 % ((-arg0 - 39) / 53);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
    public class65(int arg0) {
        this.field827 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIIII)V")
    private class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field827 = arg0;
        this.field833 = arg2;
        this.field840 = arg5;
        this.field839 = arg1;
        this.field830 = arg3;
        this.field828 = arg4;
    }
}
