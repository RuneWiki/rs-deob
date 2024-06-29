import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class103 {

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "Lwg;")
    private class58 field1350 = new class58(256);

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Luq;")
    private class313 field1352;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "Ln;")
    private class473 field1356;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "Ljq;")
    public static class447 field1353 = null;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "Lvt;")
    public static class344 field1358 = new class344("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
    public static final int method565(int arg0, int arg1) {
        field1357++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg0 != 32085) {
            field1358 = null;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -76) {
            return;
        }
        if (class594.field8575 <= arg0 && class355.field4972 >= arg0) {
            int var5 = class69.method398((byte) 38, arg3, class113.field1453, class535.field7467);
            int var6 = class69.method398((byte) -108, arg4, class113.field1453, class535.field7467);
            class78.method447(var6, var5, arg2, (byte) -115, arg0);
        }
        field1351++;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)V")
    public static final void method567(int arg0, int arg1) {
        class2.field20 = arg0;
        field1354++;
        if (arg1 <= -106) {
            class124.field1543 = -1;
            class124.field1543 = -1;
            class168.method1000((byte) -27);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZIB)V")
    public static final void method568(boolean arg0, int arg1, byte arg2) {
        field1355++;
        class554.field7754 = 3;
        class419.field5730 = arg1;
        if (arg2 <= 85) {
            return;
        }
        class489.method2749(class540.field7557.field3702, class540.field7557.field3700, 3);
        if (arg0) {
            class492.method2763("", false, 0, "");
        } else {
            class154.method834(-124);
            class492.method2763(class405.field5567, false, 0, class284.field3703);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public static void method569(int arg0) {
        field1358 = null;
        if (arg0 == -4342) {
            field1353 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
    public final void method570(byte arg0) {
        field1348++;
        if (arg0 <= -98) {
            this.field1350.method320(5, -306674912);
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(II)Lku;")
    public final class495 method571(int arg0, int arg1) {
        field1347++;
        Object var3 = this.field1350.method323((long) arg1, -19814);
        if (var3 != null) {
            return (class495) var3;
        } else if (this.field1356.method2144(-122, arg1)) {
            if (arg0 != 6408) {
                method566(101, -47, -64, -36, 122);
            }
            class41 var4 = this.field1356.method2151(true, arg1);
            int var5 = var4.field613 ? 64 : this.field1352.field4180;
            class495 var7;
            if (var4.field619 && this.field1352.method912()) {
                float[] var6 = this.field1356.method2150(arg0 - 24048, var5, arg1, var5, false, 0.7F);
                var7 = new class495(this.field1352, 3553, 34842, var5, var5, var4.field606 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field603) {
                    var8 = this.field1356.method2146(-20243, var5, arg1, var5, false, 0.7F);
                } else {
                    var8 = this.field1356.method2143(arg1, (byte) 15, true, var5, 0.7F, var5);
                }
                var7 = new class495(this.field1352, 3553, 6408, var5, var5, var4.field606 != 0, var8, false);
            }
            var7.method2776(-96, var4.field616, var4.field607);
            this.field1350.method316((long) arg1, (byte) -117, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Luq;Ln;)V")
    public class103(class313 arg0, class473 arg1) {
        this.field1352 = arg0;
        this.field1356 = arg1;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)V")
    public final void method572(byte arg0) {
        this.field1350.method315(1);
        if (arg0 == 62) {
            field1346++;
        }
    }
}
