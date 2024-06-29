import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class35 {

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "[I")
    private int[] field439;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Lh;")
    public static class15 field438 = class18.method153("Saw Mill", 1);

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lh;")
    public static class15 field437 = class18.method153("Candle Shop", 1);

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Lh;")
    public static class15 field441 = class18.method153("Kebab Seller", 1);

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Lh;")
    public static class15 field442 = class18.method153("overlay2)3dat", 1);

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Lh;")
    public static class15 field443 = class18.method153("Enter place name to find", 1);

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "[[[I")
    public static int[][][] field440;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 37)
    public static final void method233(byte arg0) {
        if (arg0 <= 116) {
            method235((byte) -115);
        }
        if (++class24.field321 >= 64) {
            class24.field321 = 0;
            class9.field123++;
            if (class9.field123 < class28.field357 >> 6) {
                class18.method151(false);
            }
        }
        class15.field220 = (class24.field321 << 6) + class9.field119;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IZ)I", line = 62)
    public final int method234(int arg0, boolean arg1) {
        int var3 = this.field439.length - 2;
        if (arg1) {
            return 70;
        }
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field439[var4];
            if (arg0 == var5) {
                return this.field439[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(B)V", line = 97)
    public static void method235(byte arg0) {
        field441 = null;
        field438 = null;
        field440 = null;
        field443 = null;
        field442 = null;
        if (arg0 < 12) {
            method233((byte) -12);
        }
        field437 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "([I)V", line = 110)
    public class35(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field439 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field439[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field439[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field439[var5 + var5] = arg0[var4];
            this.field439[var5 + var5 + 1] = var4++;
        }
    }
}
