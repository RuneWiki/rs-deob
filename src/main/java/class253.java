import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class253 {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Z")
    public boolean field4127 = false;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
    public static boolean field4120 = true;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lte;")
    public static class244 field4118 = new class244(4);

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Leh;")
    public static class137 field4117;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 94) {
            method1735(-103, 46, -38, 85, 61, -5, -47);
        }
        int var7 = arg0 + arg4;
        int var8 = arg5 - arg0;
        int var9 = arg0 + arg6;
        field4121++;
        for (int var10 = arg4; var10 < var7; var10++) {
            class78.method433(arg2, arg6, class14.field186[var10], arg1, (byte) 123);
        }
        int var11 = arg2 - arg0;
        for (int var12 = arg5; var12 > var8; var12--) {
            class78.method433(arg2, arg6, class14.field186[var12], arg1, (byte) 123);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class14.field186[var13];
            class78.method433(var9, arg6, var14, arg1, (byte) 123);
            class78.method433(arg2, var11, var14, arg1, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpd;II)V")
    public final void method1736(class96 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method584(arg1 + 256);
            if (var4 == 0) {
                if (arg1 != -1) {
                    method1737(-124);
                }
                field4123++;
                return;
            }
            this.method1738(arg0, 2, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method1737(int arg0) {
        field4118 = null;
        int var1 = -78 % ((arg0 - 50) / 51);
        field4117 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpd;III)V")
    private final void method1738(class96 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 1) {
            this.field4126 = arg0.method549(255);
        } else if (arg2 == 2) {
            this.field4119 = arg0.method598(-1235752501);
        } else if (arg2 == 3) {
            this.field4127 = true;
        } else if (arg2 == 4) {
            this.field4126 = -1;
        }
        field4124++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZII)Lwj;")
    public final class149 method1739(boolean arg0, int arg1, int arg2) {
        field4122++;
        class149 var4 = (class149) class234.field3867.method1693((long) ((arg0 ? 262144 : 0) | this.field4126 | arg2 << 16), arg1 ^ 0xDABA772E);
        if (arg1 != -625313968) {
            return null;
        } else if (var4 == null) {
            class240.field3963.method938(this.field4126, 843075268);
            class149 var5 = class106.method640(false, class240.field3963, 0, this.field4126);
            if (var5 != null) {
                var5.method1029(class274.field4385, class108.field1451, class182.field2902);
                var5.field2134 = var5.field2137;
                var5.field2142 = var5.field2139;
                if (arg0) {
                    var5.method1030();
                }
                for (int var6 = 0; var6 < arg2; var6++) {
                    var5.method1026();
                }
                class234.field3867.method1694(true, (long) (this.field4126 | arg2 << 16 | (arg0 ? 262144 : 0)), var5);
            }
            return var5;
        } else {
            return var4;
        }
    }
}
