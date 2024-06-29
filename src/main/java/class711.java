import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class711 implements class537 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public int field9387;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field9390;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "[F")
    public float[] field9391;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field9393 = 0;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
    public static boolean field9392 = false;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(II)V", line = 8)
    public class711(int arg0, int arg1) {
        this.field9387 = arg1;
        this.field9390 = arg0;
        this.field9391 = new float[arg0 * arg1];
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILha;IZ)Ldr;", line = 23)
    public static final class25 method3839(int arg0, class570 arg1, int arg2, boolean arg3) {
        field9388++;
        if (arg2 == -1) {
            return null;
        }
        if (class207.field2852 != null) {
            for (int var4 = 0; var4 < class207.field2852.length; var4++) {
                if (class207.field2852[var4] == arg2) {
                    return class773.field10527[var4];
                }
            }
        }
        class25 var5 = (class25) class299.field3785.method2931((long) arg2, (byte) -96);
        if (var5 != null) {
            if (arg3 && var5.field214 == null) {
                class166 var6 = class663.method3610(class633.field8028, arg2, -118);
                if (var6 == null) {
                    return null;
                }
                var5.field214 = var6;
            }
            return var5;
        } else if (arg0 == 0) {
            class388[] var7 = class388.method2237(class467.field6057, arg2);
            if (var7 == null) {
                return null;
            }
            class166 var8 = class663.method3610(class633.field8028, arg2, -119);
            if (var8 == null) {
                return null;
            }
            class25 var9;
            if (arg3) {
                var9 = new class25(arg1.method1002(var8, var7, true), var8);
            } else {
                var9 = new class25(arg1.method1002(var8, var7, true));
            }
            class299.field3785.method2918((long) arg2, var9, 102);
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z", line = 89)
    public static final boolean method3840(int arg0, int arg1, int arg2) {
        field9389++;
        if (arg0 != 0) {
            field9393 = 91;
        }
        return class678.method3642(false, arg1, arg2) || class264.method1672(arg1, arg0 - 32107, arg2);
    }
}
