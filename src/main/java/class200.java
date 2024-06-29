import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class200 extends class196 {

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3247 = null;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Ljava/util/Random;")
    public static Random field3244 = new Random();

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lak;")
    public static class172 field3255;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Lbf;", line = 8)
    public static final class58 method1464(boolean arg0) {
        field3253++;
        int var1 = class184.field3046[0] * class102.field1489[0];
        int[] var2 = new int[var1];
        byte[] var3 = class278.field4481[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class205.field3370[client.method767(255, var3[var4])];
        }
        class58 var5;
        if (class232.field3690) {
            var5 = new class314(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], var2);
        } else {
            var5 = new class220(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], var2);
        }
        class106.method727(arg0);
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 38)
    public static void method1465(byte arg0) {
        int var1 = -97 / ((arg0 - 9) / 62);
        field3244 = null;
        field3255 = null;
        field3247 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V", line = 50)
    public static final void method1466(boolean arg0) {
        if (!arg0) {
            field3257 = 90;
        }
        class270.field4360 = null;
        class43.method215(0, 0, class20.field276, 0, -1, class147.field2287, 0, class133.field2095, 0);
        if (class270.field4360 != null) {
            class98.method668(class39.field496, class194.field3181.field2512, class287.field4597, class133.field2095, class20.field276, 0, -1412584499, 0, class270.field4360, -1);
            class270.field4360 = null;
        }
        field3254++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V", line = 75)
    public final void method1081(int arg0, int arg1, int arg2) {
        int var4 = this.field3250 * arg0 >> 12;
        field3246++;
        int var5 = this.field3249 * arg1 >> 12;
        if (arg2 != 31947) {
            method1465((byte) 59);
        }
        int var6 = this.field3243 * arg0 >> 12;
        int var7 = this.field3251 * arg1 >> 12;
        class31.method172(var6, var7, var4, this.field3203, var5, -25939);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZ)V", line = 98)
    public final void method1083(int arg0, int arg1, boolean arg2) {
        field3252++;
        int var4 = this.field3243 * arg1 >> 12;
        int var5 = this.field3250 * arg1 >> 12;
        if (!arg2) {
            field3255 = (class172) null;
        }
        int var6 = this.field3249 * arg0 >> 12;
        int var7 = this.field3251 * arg0 >> 12;
        class80.method548(92, this.field3200, var6, this.field3203, this.field3196, var4, var7, var5);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 118)
    public final void method1080(int arg0, int arg1, int arg2) {
        field3256++;
        int var4 = this.field3243 * arg0 >> 12;
        if (arg1 != -6577) {
            field3257 = 89;
        }
        int var5 = this.field3249 * arg2 >> 12;
        int var6 = this.field3250 * arg0 >> 12;
        int var7 = this.field3251 * arg2 >> 12;
        class13.method75((byte) -85, var6, var7, var5, var4, this.field3200, this.field3196);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIII)V", line = 140)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3243 = arg2;
        this.field3250 = arg0;
        this.field3249 = arg1;
        this.field3251 = arg3;
    }
}
