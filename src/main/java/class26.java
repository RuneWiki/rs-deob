import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class26 {

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "[I")
    private int[] field373;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Lia;")
    public static class15 field366 = class28.method196("Sandpit", false);

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Lia;")
    public static class15 field368 = class28.method196("Transportation", false);

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Lia;")
    public static class15 field371 = class28.method196("Enter place name to find", false);

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "J")
    public static long field372 = 0L;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "[[Ld;")
    public static class6[][] field370;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)B", line = 18)
    public static final byte method178(byte arg0) {
        if (arg0 != 106) {
            method181(false);
        }
        return class39.field517 == null ? 0 : class39.field517[class13.field111];
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(II)I", line = 51)
    public final int method179(int arg0, int arg1) {
        int var3 = (this.field373.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 != 5813) {
            return 56;
        }
        while (true) {
            int var5 = this.field373[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field373[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)Z", line = 78)
    public static final boolean method180(int arg0) {
        class36 var1 = class12.field105;
        synchronized (class12.field105) {
            if (class3.field31 == class17.field164) {
                return false;
            } else {
                mapview.field312 = class27.field391[class17.field164];
                class20.field231 = class2.field23[class17.field164];
                class17.field164 = arg0 & class17.field164 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Z)V", line = 103)
    public static void method181(boolean arg0) {
        field368 = null;
        field366 = null;
        if (arg0) {
            field371 = null;
        }
        field371 = null;
        field370 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(B)I", line = 125)
    public static final int method182(byte arg0) {
        int var1 = -23 / ((-arg0 - 52) / 46);
        if (class12.field101 == null) {
            return 0;
        } else if (class12.field101.field57 == null) {
            return class18.field187[class12.field101.field51 & 0xFF];
        } else {
            return class18.field187[class12.field101.field57[class13.field111] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([I)V", line = 151)
    public class26(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field373 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field373[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field373[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field373[var5 + var5] = arg0[var4];
            this.field373[var5 + var5 + 1] = var4++;
        }
    }
}
