import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class411 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field5693 = 2;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lms;")
    public static class363 field5699 = null;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lsm;")
    public static class249 field5697 = new class249();

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field5702;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field5704;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field5705;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
    public int[] field5701;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1611(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method2407(int arg0) {
        if (arg0 >= -40) {
            field5699 = null;
        }
        for (class99 var1 = (class99) class119.field1669.method2820(0); var1 != null; var1 = (class99) class119.field1669.method2820(0)) {
            class446.method2599(20, var1);
        }
        field5698++;
        int var2;
        int var3;
        if (class410.method2404(-1)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class480.field6794;
            var3 = class480.field6794;
        }
        client.method2324();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method2323();
            client.method2337(var4);
            client.method2336(var4);
        }
        client.method2325();
        client.method2327();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public abstract void method1619(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIB[J)V")
    public static final void method2408(int[] arg0, int arg1, int arg2, byte arg3, long[] arg4) {
        field5695++;
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method2408(arg0, arg1, var6 - 1, (byte) -107, arg4);
            method2408(arg0, var6 + 1, arg2, (byte) -66, arg4);
        }
        if (arg3 >= -45) {
            field5703 = -87;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method1615(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIII)V")
    public static final void method2409(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        field5696++;
        int var6 = arg3 + arg5;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class138.field1967 - class410.field5691) * var6 / 100 + class410.field5691;
        if (var7 < class175.field2574) {
            var7 = class175.field2574;
        } else if (var7 > class56.field910) {
            var7 = class56.field910;
        }
        int var8 = var7 * 512 * arg3 / (arg0 * 334);
        if (class5.field105 > var8) {
            short var12 = class5.field105;
            var7 = arg0 * var12 * 334 / (arg3 * 512);
            if (class56.field910 < var7) {
                var7 = class56.field910;
                int var13 = arg3 * var7 * 512 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class338.field4636.method1137();
                    class338.field4636.method2860(arg3, var14, arg4, -16777216, arg1, 1);
                    class338.field4636.method2860(arg3, var14, arg0 + arg4 - var14, -16777216, arg1, 1);
                }
                arg0 -= var14 * 2;
                arg4 += var14;
            }
        } else if (class290.field3987 < var8) {
            short var9 = class290.field3987;
            var7 = arg0 * 334 * var9 / (arg3 * 512);
            if (var7 < class175.field2574) {
                var7 = class175.field2574;
                int var10 = arg0 * 334 * var9 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg2) {
                    class338.field4636.method1137();
                    class338.field4636.method2860(var11, arg0, arg4, -16777216, arg1, 1);
                    class338.field4636.method2860(var11, arg0, arg4, -16777216, arg1 + arg3 - var11, arg5 + 335);
                }
                arg1 += var11;
                arg3 -= var11 * 2;
            }
        }
        class107.field1536 = arg1;
        class27.field455 = (short) arg3;
        class205.field2950 = (short) arg0;
        class254.field3555 = arg4;
        class155.field2234 = arg3 * var7 / 334;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method2410(int arg0) {
        if (arg0 != -29035) {
            method2409(-40, 40, false, -115, -126, -29);
        }
        field5697 = null;
        field5699 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2411(int arg0, int arg1, int arg2, int arg3) {
        field5700++;
        class278 var4 = (class278) class37.method309(arg3, arg0, arg2);
        if (arg1 != 2) {
            return true;
        }
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class7.method91(var4, (byte) -89);
        }
        class278 var6 = (class278) class75.method518(arg3, arg0, arg2, field5705 == null ? (field5705 = method2412("wk")) : field5705);
        if (var6 != null) {
            var5 &= class7.method91(var6, (byte) -94);
        }
        class278 var7 = (class278) class292.method1807(arg3, arg0, arg2);
        if (var7 != null) {
            var5 &= class7.method91(var7, (byte) -83);
        }
        return var5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2412(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
