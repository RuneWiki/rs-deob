import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class116 {

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "[Lcf;")
    public class21[] field182 = new class21[5];

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public int field192 = 0;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "[I")
    public int[] field205 = new int[5];

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lic;")
    public static class59 field183 = class59.method433(0, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lic;")
    public static class59 field177 = class59.method433(0, ": ");

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lic;")
    private static class59 field175 = class59.method433(0, "Unable to find ");

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lic;")
    public static class59 field178 = field175;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field179 = 1;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Lrb;")
    public class120 field191;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Ltc;")
    public class135 field190;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lte;")
    public class137 field184;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "Lva;")
    public class147 field195;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Lcb;")
    public class17 field202;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Lec;")
    public class32 field204;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lkc;")
    public static class72 field180;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lmd;")
    public static class87 field189;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Lba;")
    public class9 field203;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Z")
    public boolean field185;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Z")
    public boolean field187;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Z")
    public boolean field206;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "[I")
    public static int[] field200;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static void method44(int arg0) {
        if (arg0 != -8) {
            field179 = -20;
        }
        field189 = null;
        field178 = null;
        field175 = null;
        field183 = null;
        field180 = null;
        field177 = null;
        field200 = null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(III)V")
    public class9(int arg0, int arg1, int arg2) {
        this.field196 = arg1;
        this.field186 = arg2;
        this.field199 = this.field201 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class18.field364 == 1) {
            class152.field3298[class158.field3500 / 100].method1023(class157.field3416 - 8, class88.field2220 - 8);
        }
        field176++;
        if (class18.field364 == 2) {
            class152.field3298[class158.field3500 / 100 + 4].method1023(class157.field3416 - 8, class88.field2220 + -8);
        }
        class107.method832(127);
        if (class1.field11) {
            int var5 = arg4 + 512 - 5;
            int var6 = arg3 + 20;
            class88.field2222.method1135(class46.method358(new class59[] { class75.field1846, class46.method361(class85.field2127, arg1 + 13058) }, (byte) -75), var5, var6, 16776960, -1);
            Runtime var7 = Runtime.getRuntime();
            int var8 = 16776960;
            int var10 = var6 + 15;
            int var9 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            if (var9 > 32768 && class127.field2882) {
                var8 = 16711680;
            }
            if (var9 > 65536 && !class127.field2882) {
                var8 = 16711680;
            }
            class88.field2222.method1135(class46.method358(new class59[] { class79.field1948, class46.method361(var9, arg1 ^ 0x32FC), class126.field2859 }, (byte) -75), var5, var10, var8, -1);
            var6 = var10 + 15;
        }
        if (arg1 != -12979) {
            method44(127);
        }
    }
}
