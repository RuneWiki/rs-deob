import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class197 extends class243 {

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lub;")
    public static class227 field3376 = class257.method1749("<br>(X", 17263);

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "Lrb;")
    public static class254 field3375 = new class254(260);

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "[I")
    public static int[] field3380 = new int[5];

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public static int field3384 = 0;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "Ln;")
    public static class138 field3382;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "Ln;")
    public static class138 field3385;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "[[[B")
    public static byte[][][] field3383;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lkg;B)V")
    public static final void method1264(class49 arg0, byte arg1) {
        field3379++;
        long var2 = 0L;
        int var4 = -1;
        if (arg0.field860 == 0) {
            var2 = class184.method1174(arg0.field873, arg0.field856, arg0.field866);
        }
        if (arg0.field860 == 1) {
            var2 = class141.method896(arg0.field873, arg0.field856, arg0.field866);
        }
        if (arg0.field860 == 2) {
            var2 = class40.method214(arg0.field873, arg0.field856, arg0.field866);
        }
        if (arg1 != -6) {
            return;
        }
        int var5 = 0;
        if (arg0.field860 == 3) {
            var2 = class49.method290(arg0.field873, arg0.field856, arg0.field866);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7ECF0) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field868 = var4;
        arg0.field871 = var6;
        arg0.field864 = var5;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class197() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)Log;")
    public static final class140 method1265(byte arg0) {
        field3374++;
        try {
            if (arg0 != -15) {
                method1266(124);
            }
            return (class140) Class.forName("wd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field3385 = null;
        if (arg0 != -27769) {
            method1265((byte) -15);
        }
        field3382 = null;
        field3375 = null;
        field3383 = null;
        field3376 = null;
        field3380 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ln;Ln;I)V")
    public static final void method1267(class138 arg0, class138 arg1, int arg2) {
        class161.field2708 = arg0;
        field3377++;
        class242.field4206 = arg1;
        if (arg2 < 115) {
            method1265((byte) 95);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = 59 % ((-arg0 - 15) / 51);
        field3378++;
        return class212.field3585;
    }
}
