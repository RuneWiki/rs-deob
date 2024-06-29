import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class187 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lie;")
    public static class117 field3245 = new class117(5);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lie;")
    public static class117 field3246 = new class117(64);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lij;")
    public class166 field3242;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lmb;")
    public static class178 field3247;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method1265(int arg0, int arg1) {
        field3243++;
        class151.field2593.method831(arg0, -123);
        if (arg1 > -1) {
            field3246 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILvb;Ls;)V")
    public static final void method1266(int arg0, int arg1, class226 arg2, class229 arg3) {
        byte[] var4 = null;
        field3244++;
        class33 var5 = class34.field659;
        synchronized (class34.field659) {
            for (class108 var6 = (class108) class34.field659.method288(arg0 + 26111); var6 != null; var6 = (class108) class34.field659.method277(1)) {
                if (((long) arg1) == var6.field573 && var6.field2018 == arg3 && var6.field2010 == 0) {
                    var4 = var6.field2016;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg3.method1497(arg0, arg1);
            arg2.method1483(var7, arg1, 127, arg3, true);
        } else {
            arg2.method1483(var4, arg1, 127, arg3, true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method1267(byte arg0) {
        if (arg0 != 49) {
            method1267((byte) -70);
        }
        field3247 = null;
        field3246 = null;
        field3245 = null;
    }
}
