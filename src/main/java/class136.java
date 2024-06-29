import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class136 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[Llh;")
    private class55[] field1974;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1979 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
    public static int[] field1978 = new int[128];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lef;")
    public static class241 field1976 = new class241(64);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Ltb;")
    public static class185 field1980;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lbc;")
    public static class282 field1982;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lsi;")
    public static class56 field1981;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[[I")
    public static int[][] field1984;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method885(int arg0) {
        field1975++;
        if (class49.field561) {
            return;
        }
        class49.field561 = true;
        if (class254.field3666) {
            class159.field2310 = (float) ((int) class159.field2310 + 47 & 0xFFFFFFF0);
        } else {
            class154.field2232 += (12.0F - class154.field2232) / 2.0F;
        }
        if (arg0 < 30) {
            field1984 = null;
        }
        class200.field2855 = true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqi;II)V")
    public static final void method886(class216 arg0, int arg1, int arg2) {
        if (class259.field3779 != null) {
            try {
                class259.field3779.method605(false, 0L);
                class259.field3779.method604(arg1, arg0.field3030, 24, 255);
            } catch (Exception var3) {
            }
        }
        if (arg2 > -72) {
            method886((class216) null, -115, -120);
        }
        field1983++;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
    public class136(int arg0) {
        this.field1974 = new class55[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class55 var3 = this.field1974[var2] = new class55();
            var3.field642 = var3;
            var3.field647 = var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method887(int arg0) {
        if (arg0 < 107) {
            return;
        }
        field1984 = null;
        field1981 = null;
        field1982 = null;
        field1976 = null;
        field1980 = null;
        field1978 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lol;")
    public static final class111 method888(int arg0, int arg1) {
        class111 var2 = (class111) class101.field1376.method65((byte) -100, (long) arg0);
        field1977++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field853.method1861(0, arg0, arg1 - 4758);
        class111 var4 = new class111(var3);
        if (arg1 != 4759) {
            method887(-22);
        }
        var4.method523(class36.field420, (int[]) null);
        class101.field1376.method64((long) arg0, -1, var4);
        return var4;
    }
}
