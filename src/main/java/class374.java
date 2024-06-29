import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class374 extends class272 {

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
    public static int[] field5153 = new int[1000];

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Lh;")
    public static class434 field5163 = null;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Lkk;")
    public static class114 field5160 = new class114("LOCAL", 4);

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field5165 = 999999;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[Lbt;")
    public static class32[] field5166 = new class32[2048];

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lhp;")
    public class197 field5159;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[Lau;")
    public class478[] field5156;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBI)V")
    public static final void method2297(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 << 3;
        field5162++;
        int var5 = arg3 << 3;
        int var6 = arg0 << 3;
        class239.field3186 = (float) var4;
        class270.field3610 = (float) var5;
        if (class56.field772 == 2) {
            class176.field2398 = var6;
            class155.field2171 = var4;
            class348.field4796 = var5;
        }
        if (arg2 != 6) {
            method2299(65, 38, 109);
        }
        class403.method2439((byte) 105);
        class82.field1094 = true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)V")
    public static final void method2298(int arg0, long arg1) {
        field5164++;
        if (arg0 != -28114) {
            method2299(-50, 36, 31);
        }
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class316.method1733((byte) 117, arg1 - 1L);
            class316.method1733((byte) -40, 1L);
        } else {
            class316.method1733((byte) 110, arg1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
    public static final int method2299(int arg0, int arg1, int arg2) {
        field5157++;
        int var3 = arg2 >>> 24;
        int var4 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        int var6 = 85 % ((arg0 + 30) / 32);
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBILwm;)Z")
    public final boolean method2300(int arg0, byte arg1, int arg2, class364 arg3) {
        field5154++;
        if (arg1 != -43) {
            return true;
        }
        if (this.field5156 != null) {
            for (int var5 = 0; var5 < this.field5156.length; var5++) {
                if (this.field5156[var5].method2797(arg2, arg0) && this.field5159.method14(arg2, arg0, (byte) -115, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static void method2301(int arg0) {
        field5166 = null;
        field5160 = null;
        field5153 = null;
        field5163 = null;
        if (arg0 != 8473) {
            method2298(42, -92L);
        }
    }
}
