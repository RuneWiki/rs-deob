import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class171 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lre;")
    public static class262 field2879 = null;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lwa;")
    public static class75 field2882 = class66.method560("::", false);

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    public static int[] field2884 = new int[500];

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lwa;")
    public static class75 field2880 = class66.method560("Starte 3D)2Softwarebibliothek)3", false);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lbh;")
    public static class258 field2877;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()V", line = 6)
    public static final void method1264() {
        class91.field1501 = (class242[][][]) null;
        class259.field4342 = (int[][]) null;
        class156.field2669 = (int[][][]) null;
        class267.field4612 = (class38[][]) null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 16)
    public static void method1265(int arg0) {
        field2877 = null;
        field2879 = null;
        field2882 = null;
        if (arg0 != 0) {
            method1264();
        }
        field2884 = null;
        field2880 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZII[Lre;I)V", line = 30)
    public static final void method1266(int arg0, boolean arg1, int arg2, int arg3, class262[] arg4, int arg5) {
        field2875++;
        for (int var6 = arg3; var6 < arg4.length; var6++) {
            class262 var7 = arg4[var6];
            if (var7 != null && var7.field4446 == arg0) {
                class255.method1822(arg1, var7, arg3 - 88, arg2, arg5);
                class28.method188(var7, arg3 + 2, arg2, arg5);
                if (var7.field4430 > (var7.field4503 - var7.field4531)) {
                    var7.field4430 = var7.field4503 - var7.field4531;
                }
                if (var7.field4501 > var7.field4384 - var7.field4517) {
                    var7.field4501 = var7.field4384 - var7.field4517;
                }
                if (var7.field4430 < 0) {
                    var7.field4430 = 0;
                }
                if (var7.field4501 < 0) {
                    var7.field4501 = 0;
                }
                if (var7.field4441 == 0) {
                    class180.method1324(arg1, var7, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBI)V", line = 74)
    public void method1267(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = -20 % ((arg3 + 47) / 33);
        field2881++;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()Z", line = 86)
    public boolean method420() {
        field2878++;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 94)
    public static final void method1268(byte arg0) {
        if (arg0 <= 38) {
            method1265(-31);
        }
        field2883++;
        class173.field2913.method1201(-20111);
        class178.field3003.method1201(-20111);
        class130.field2243.method1201(-20111);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lpj;IIIZ)V", line = 117)
    public void method447(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2874++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lpj;", line = 140)
    public class171 method433(int arg0, int arg1, int arg2) {
        field2876++;
        return this;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()I")
    public abstract int method443();

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
