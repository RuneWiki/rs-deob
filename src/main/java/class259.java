import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class259 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ljp;")
    private class236 field3421 = new class236(256);

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lm;")
    private class126 field3430;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lbo;")
    private class511 field3426;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[[Lem;")
    public static class149[][] field3425;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1563(int arg0) {
        field3425 = null;
        if (arg0 != -9332) {
            method1563(10);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
    public static final void method1564(int arg0, byte arg1) {
        if (arg1 >= -109) {
            return;
        }
        field3424++;
        if (!class28.method230(arg0, 125)) {
            return;
        }
        class403[] var2 = class238.field3185[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class403 var4 = var2[var3];
            if (var4 != null) {
                var4.field5543 = 0;
                var4.field5484 = 1;
                var4.field5477 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method1565(byte arg0) {
        if (arg0 != -84) {
            this.method1567(-10);
        }
        this.field3421.method1461(-5, 5);
        field3422++;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IB)Lwr;")
    public final class316 method1566(int arg0, byte arg1) {
        field3428++;
        Object var3 = this.field3421.method1456((long) arg0, 110);
        if (var3 != null) {
            return (class316) var3;
        } else if (this.field3430.method680(arg1 ^ 0xFFFFBF78, arg0)) {
            class278 var4 = this.field3430.method677(2459, arg0);
            int var5 = var4.field3632 ? 64 : this.field3426.field7389;
            if (arg1 != 56) {
                this.field3426 = null;
            }
            class316 var7;
            if (var4.field3635 && this.field3426.method581()) {
                float[] var6 = this.field3430.method676(true, false, var5, var5, 0.7F, arg0);
                var7 = new class316(this.field3426, 3553, 34842, var5, var5, var4.field3650 != 0, var6, 6408);
            } else {
                short var8;
                int[] var9;
                if (var4.field3637 && class431.method2487(var4.field3651, (byte) 59)) {
                    var8 = 6407;
                    var9 = this.field3430.method678(0.7F, arg0, 24201, false, var5, var5);
                } else {
                    var8 = 6408;
                    var9 = this.field3430.method681(0.7F, false, var5, var5, 1519, arg0);
                }
                var7 = new class316(this.field3426, 3553, var8, var5, var5, var4.field3650 != 0, var9, false);
            }
            var7.method1831(true, var4.field3641, var4.field3636);
            this.field3421.method1462(var7, (long) arg0, -11);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public final void method1567(int arg0) {
        int var2 = -97 % ((arg0 - 59) / 49);
        this.field3421.method1458((byte) 96);
        field3423++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public static final void method1568(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class154.field2244.field7767 != arg0 && arg2 != 0 && class104.field1527 < 50 && arg4 != -1) {
            class520.field7703[class104.field1527++] = new class231((byte) 1, arg4, arg2, arg3, arg1, 0);
        }
        field3427++;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lbo;Lm;)V")
    public class259(class511 arg0, class126 arg1) {
        this.field3430 = arg1;
        this.field3426 = arg0;
    }
}
