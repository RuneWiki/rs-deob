import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class340 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field5370;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lpg;")
    public static class492 field5367 = new class492(99, -1);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field5371 = false;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lwi;")
    public static class340 field5374 = new class340(12, 0, 1, 0);

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!wi", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field5373++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 29)
    public static void method2192(int arg0) {
        if (arg0 < 119) {
            field5367 = null;
        }
        field5367 = null;
        field5374 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILbp;)V", line = 44)
    public static final void method2193(int arg0, int arg1, int arg2, class322 arg3) {
        field5372++;
        if (arg3.field5240 == arg1 && arg1 != -1) {
            class270 var4 = class260.field3621.method1934(118, arg1);
            int var5 = var4.field3735;
            if (var5 == 1) {
                arg3.field5269 = 0;
                arg3.field5266 = 1;
                arg3.field5301 = arg0;
                arg3.field5256 = 0;
                arg3.field5322 = 0;
                class445.method2678(class339.field5365 == arg3, arg3.field5269, arg3.field2210, var4, arg3.field2217, (byte) 10, arg3.field2215);
            }
            if (var5 == 2) {
                arg3.field5322 = 0;
            }
        } else if (arg1 == -1 || arg3.field5240 == -1 || class260.field3621.method1934(127, arg1).field3756 >= class260.field3621.method1934(117, arg3.field5240).field3756) {
            arg3.field5338 = arg3.field5343;
            arg3.field5240 = arg1;
            arg3.field5322 = 0;
            arg3.field5256 = 0;
            arg3.field5266 = 1;
            arg3.field5269 = 0;
            arg3.field5301 = arg0;
            if (arg3.field5240 != -1) {
                class445.method2678(class339.field5365 == arg3, arg3.field5269, arg3.field2210, class260.field3621.method1934(123, arg3.field5240), arg3.field2217, (byte) -120, arg3.field2215);
            }
        }
        if (arg2 > -22) {
            method2192(52);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(IIII)V", line = 95)
    public class340(int arg0, int arg1, int arg2, int arg3) {
        this.field5370 = arg2;
        this.field5368 = arg1;
        this.field5369 = arg3;
        this.field5375 = arg0;
    }
}
