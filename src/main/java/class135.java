import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class135 extends class95 {

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Lsf;")
    public static class108 field2334 = class140.method973(255, "um");

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "Lsf;")
    public static class108 field2340 = class140.method973(255, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lsf;")
    public static class108 field2331 = class140.method973(255, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "Lsf;")
    private static class108 field2344 = class140.method973(255, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lsf;")
    public static class108 field2327 = field2344;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 8)
    public final void method922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2341++;
        int var6 = this.field2336 << 3;
        int var7 = this.field2342 << 3;
        if (arg1 <= -3) {
            int var8 = (arg0 << 4) + (var7 & 0xF);
            int var9 = (arg4 << 4) + (var6 & 0xF);
            this.method67(var7, var6, var8, var9, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V", line = 31)
    public static final void method923(int arg0, int arg1, int arg2) {
        field2332++;
        class182.field3336++;
        class256.field4471.method1427(87, 0);
        class256.field4471.method1707(arg1, 255);
        class256.field4471.method1729(arg2, 4110);
        if (arg0 > -98) {
            method926(-72, -50);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 62)
    public static void method924(int arg0) {
        field2340 = null;
        field2344 = null;
        field2334 = null;
        field2327 = null;
        if (arg0 < 37) {
            field2334 = (class108) null;
        }
        field2331 = null;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)Lvf;", line = 82)
    public static final class312 method925(int arg0, int arg1) {
        if (arg1 <= 64) {
            field2344 = (class108) null;
        }
        field2337++;
        class312 var2 = (class312) class63.field1008.method466((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class295.field5158.method1868(12236, 0, arg0);
        } else {
            var3 = class128.field2183.method1868(12236, 0, arg0 & 0x7FFF);
        }
        class312 var4 = new class312();
        if (var3 != null) {
            var4.method2176(new class249(var3), 11560);
        }
        if (arg0 >= 32768) {
            var4.method2178((byte) 107);
        }
        class63.field1008.method468((long) arg0, (byte) -113, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(II)La;", line = 116)
    public static final class278 method926(int arg0, int arg1) {
        if (arg1 != 846281444) {
            field2345 = -32;
        }
        field2339++;
        return class320.field5487 && arg0 >= class5.field68 && class110.field1931 >= arg0 ? class184.field3388[arg0 - class5.field68] : null;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(II)[B", line = 132)
    public static final byte[] method927(int arg0, int arg1) {
        if (arg1 != 0) {
            field2334 = (class108) null;
        }
        field2328++;
        class183 var2 = (class183) class301.field5232.method466((long) arg0, 1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class109.method792(arg1 ^ 0xFFFFD465, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class183(var3);
            class301.field5232.method468((long) arg0, (byte) -119, var2);
        }
        return var2.field3363;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)V")
    public abstract void method63(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)V")
    public abstract void method68(int arg0, int arg1);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
    public abstract void method72(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(II)V")
    public abstract void method81(int arg0, int arg1);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public abstract void method61(int arg0, int arg1, int arg2);
}
