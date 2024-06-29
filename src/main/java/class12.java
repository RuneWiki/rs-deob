import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class12 {

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Lna;")
    public static class26 field113 = class33.method219("null", 103);

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "Lna;")
    public static class26 field123 = class33.method219("Kebab Seller", 118);

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "Lna;")
    public static class26 field124 = class33.method219("map", 89);

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "[I")
    public static int[] field120 = new int[128];

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lna;")
    public static class26 field112 = class33.method219("Platebody Shop", 113);

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "Lna;")
    public static class26 field114 = class33.method219("Water Source", 78);

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "Lma;")
    public static class24 field121 = null;

    @OriginalMember(owner = "mapview!g", name = "o", descriptor = "I")
    public static volatile int field126 = 0;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Lb;")
    public static class2 field117;

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "[I")
    public static int[] field118;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 5)
    public static final void method61(byte arg0) {
        if (arg0 == 96 && class6.field64 != null) {
            class39 var1 = class6.field64;
            synchronized (class6.field64) {
                class6.field64 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II)I", line = 36)
    public final int method62(int arg0, int arg1) {
        if (arg0 != 1805163361) {
            method63(82);
        }
        int var3 = (this.field116.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field116[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field116[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 88)
    public static void method63(int arg0) {
        field118 = null;
        field112 = null;
        field123 = null;
        field120 = null;
        field117 = null;
        field114 = null;
        field113 = null;
        field124 = null;
        if (arg0 != 1) {
            method61((byte) -100);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([I)V", line = 132)
    public class12(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field116 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field116[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field116[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field116[var5 + var5] = arg0[var4];
            this.field116[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Lp;IILp;I)Lt;", line = 179)
    public static final class37 method64(class29 arg0, int arg1, int arg2, class29 arg3, int arg4) {
        if (arg1 == -7362) {
            return class33.method222(-119, arg2, arg4, arg0) ? class6.method36(arg3.method200(arg2, 11808, arg4), 121) : null;
        } else {
            return (class37) null;
        }
    }
}
