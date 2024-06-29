import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class32 {

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "Lu;")
    public static class38 field398 = class28.method177("Rare Trees", (byte) -84);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lu;")
    public static class38 field397 = class28.method177("Loom", (byte) -84);

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "Lu;")
    public static class38 field399 = class28.method177("details)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Lu;")
    public static class38 field401 = class28.method177(" map", (byte) -84);

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "Lu;")
    public static class38 field403 = class28.method177("75(U", (byte) -84);

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Lu;")
    public static class38 field405 = class28.method177("fonts", (byte) -84);

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "I")
    public static int field404 = 0;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "B")
    public byte field400;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "[B")
    public byte[] field395;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "[Lra;")
    public static class35[] field402;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)[Lra;", line = 7)
    public static final class35[] method191(byte arg0) {
        if (arg0 != 38) {
            return (class35[]) null;
        }
        class35[] var1 = new class35[class38.field479];
        for (int var2 = 0; var2 < class38.field479; var2++) {
            class35 var3 = var1[var2] = new class35();
            var3.field462 = class17.field171[var2];
            var3.field461 = class18.field175[var2];
            var3.field458 = mapview.field339[var2];
            var3.field460 = class38.field485[var2];
            int var4 = var3.field460 * var3.field458;
            byte[] var5 = class16.field159[var2];
            var3.field459 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field459[var6] = class7.field62[class33.method199(255, var5[var6])];
            }
        }
        class24.method133((byte) -76);
        return var1;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(ILb;II)[Lca;", line = 49)
    public static final class6[] method192(int arg0, class3 arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return class7.method39(arg1, (byte) -19, arg0, arg2) ? class25.method140((byte) -6) : null;
        } else {
            return (class6[]) null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)V", line = 70)
    public final void method193(boolean arg0) {
        boolean var2 = arg0;
        if (this.field395 == null) {
            return;
        }
        this.field400 = this.field395[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field395[var3] != this.field400) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field395 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(Z)V", line = 120)
    public static void method194(boolean arg0) {
        field399 = null;
        field401 = null;
        field397 = null;
        if (arg0) {
            method194(true);
        }
        field402 = null;
        field398 = null;
        field405 = null;
        field403 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I[B)[B", line = 138)
    public static final byte[] method195(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class13.method63(arg1, arg0, var3, 0, var2);
        return var3;
    }
}
