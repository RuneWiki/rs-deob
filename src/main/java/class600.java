import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class600 implements class617 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lin;")
    private class91 field8224;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lin;")
    public class91 field8225;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lfn;")
    public class140 field8228;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljr;")
    public static class112 field8229 = new class112(64);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    private int field8223;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "J")
    private long field8233;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Lda;")
    private class60 field8230;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZBI)V")
    public abstract void method2027(int arg0, boolean arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
    public boolean method1470(byte arg0) {
        int var2 = -94 % ((arg0 - 25) / 52);
        field8234++;
        boolean var3 = true;
        if (!this.field8225.method874(false, this.field8228.field2319)) {
            var3 = false;
        }
        if (!this.field8224.method874(false, this.field8228.field2319)) {
            var3 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public void method1474(int arg0) {
        field8232++;
        if (arg0 == 10286) {
            class597 var2 = class507.method2982((byte) -85, this.field8228.field2319, this.field8224);
            this.field8230 = class272.field3822.method216(var2, class267.method1782(this.field8225, this.field8228.field2319), true);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILcea;)Lkh;")
    public static final class15 method3412(int arg0, class215 arg1) {
        field8222++;
        class140 var2 = class30.method412((byte) -127, arg1);
        int var3 = arg1.method1533((byte) -126);
        int var4 = arg1.method1533((byte) -126);
        if (arg0 != 16533) {
            field8229 = null;
        }
        int var5 = arg1.method1478(842397944);
        return new class15(var2.field2322, var2.field2327, var2.field2324, var2.field2313, var2.field2325, var2.field2317, var2.field2320, var2.field2319, var2.field2315, var3, var4, var5);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static void method3413(int arg0) {
        field8229 = null;
        if (arg0 != -19960) {
            method3413(-71);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLff;)V")
    public static final void method3414(boolean arg0, class9 arg1) {
        if (!arg0) {
            method3413(54);
        }
        field8220++;
        for (class397 var2 = (class397) client.field4233.method1269(4); var2 != null; var2 = (class397) client.field4233.method1264((byte) 78)) {
            if (var2.field5825 == arg1) {
                if (var2.field5810 != null) {
                    class326.field4510.method1321(var2.field5810);
                    var2.field5810 = null;
                }
                var2.method2314((byte) 27);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIZ)V")
    public abstract void method2030(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
    public final int method3415(int arg0) {
        field8226++;
        if (arg0 <= 16) {
            this.field8228 = null;
        }
        int var2 = class99.field1732.method1713((byte) 106);
        int var3 = var2 * 100;
        if (this.field8223 == var2 && var2 != 0) {
            int var4 = class99.field1732.method1708((byte) 121);
            if (var2 < var4) {
                long var5 = this.field8233 - class99.field1732.method1716(0);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class554.method3190(-89) - this.field8233) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field8223 = var2;
            this.field8233 = class554.method3190(-125);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BZ)V")
    public final void method1475(byte arg0, boolean arg1) {
        if (arg0 != -49) {
            return;
        }
        field8227++;
        int var3 = this.field8228.field2322.method892(class478.field6661, this.field8228.field2325, (byte) -123) + this.field8228.field2324;
        int var4 = this.field8228.field2327.method1644(class22.field488, this.field8228.field2317, arg0 ^ 0xFFFFF9F4) + this.field8228.field2313;
        this.method2027(var3, arg1, (byte) -84, var4);
        this.method2030(63, var4, var3, arg1);
        String var5 = class99.field1732.method1711(arg0 ^ 0x245B);
        if (class554.method3190(-100) - this.field8233 > 10000L) {
            var5 = var5 + " (" + class99.field1732.method1717(arg0 + 149).method1042(-117) + ")";
        }
        this.field8230.method638((byte) 115, this.field8228.field2325 / 2 + var3, this.field8228.field2315, var5, -1, var4 + (this.field8228.field2317 / 2) + this.field8228.field2320 + 4);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lin;Lin;Lfn;)V")
    public class600(class91 arg0, class91 arg1, class140 arg2) {
        this.field8224 = arg1;
        this.field8225 = arg0;
        this.field8228 = arg2;
    }
}
