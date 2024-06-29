import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "[I")
    private int[] field28;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Lt;")
    public static class31 field26 = class14.method84(121, "Sword Shop");

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "I")
    public static int field27 = 500;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Lt;")
    public static class31 field25 = class14.method84(112, "Requesting map");

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lt;")
    public static class31 field22 = class14.method84(122, "b12_full");

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "I")
    public static int field29 = -1;

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Lt;")
    public static class31 field31 = class14.method84(113, "Silver Shop");

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field24;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)Z", line = 59)
    public static final boolean method16(int arg0) {
        class17 var1 = class11.field78;
        synchronized (class11.field78) {
            if (class18.field156 == class1.field4) {
                return false;
            } else {
                class34.field363 = class20.field179[class1.field4];
                class1.field4 = class1.field4 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BI)I", line = 78)
    public final int method17(byte arg0, int arg1) {
        int var3 = -43 / ((5 - arg0) / 48);
        int var4 = this.field28.length - 2;
        int var5 = var4 & arg1 << 1;
        while (true) {
            int var6 = this.field28[var5];
            if (arg1 == var6) {
                return this.field28[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var5 + 2 & var4;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 117)
    public static void method18(byte arg0) {
        field22 = null;
        field31 = null;
        field25 = null;
        field26 = null;
        field24 = null;
        if (arg0 != -123) {
            method19(6);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "([I)V", line = 133)
    public class4(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field28 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field28[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field28[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field28[var5 + var5] = arg0[var4];
            this.field28[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)V", line = 179)
    public static final void method19(int arg0) {
        class18 var1 = class6.field39;
        synchronized (class6.field39) {
            class25.field289 = class34.field389;
            class24.field204 = class30.field327;
            class20.field178 = class13.field99;
            class34.field364 = class13.field102;
            class24.field201 = class27.field309;
            class11.field81 = class1.field1;
            class13.field102 = arg0;
        }
    }
}
