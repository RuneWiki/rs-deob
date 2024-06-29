import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class192 {

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
    public static int[] field2982 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "F")
    public static float field2983;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method1356(int[] arg0, byte arg1) {
        field2985++;
        StringBuffer var2 = new StringBuffer();
        int var3 = -73 / ((arg1 - 58) / 37);
        int var4 = class8.field100;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class423 var6 = class659.field9287.method2878(arg0[var5], 0);
            if (var6.field6047 != -1) {
                class257 var7 = (class257) class527.field7721.method941((long) var6.field6047, 0);
                if (var7 == null) {
                    class628 var8 = class628.method3550(class468.field6754, var6.field6047, 0);
                    if (var8 != null) {
                        var7 = class637.field9048.method772(var8, true);
                        class527.field7721.method949((long) var6.field6047, true, var7);
                    }
                }
                if (var7 != null) {
                    class252.field3646[var4] = var7;
                    var2.append(" <img=").append(var4).append(">");
                    var4++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public static void method1357(int arg0) {
        if (arg0 != 0) {
            field2983 = -0.9941491F;
        }
        field2982 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBLufa;)V")
    public static final void method1358(int arg0, byte arg1, class141 arg2) {
        if (arg2.field2438 != null) {
            int var3 = arg2.field2438[arg0 + 1];
            if (arg2.field2371 != var3) {
                arg2.field2358 = 0;
                arg2.field2462 = arg2.field2452;
                arg2.field2423 = 0;
                arg2.field2428 = 1;
                arg2.field2371 = var3;
                arg2.field2444 = 0;
                if (arg2.field2371 != -1) {
                    class150.method1144(arg2.field2444, (byte) 50, arg2, class480.field6871.method1417(-3585, arg2.field2371));
                }
            }
        }
        field2986++;
        if (arg1 != 98) {
            field2983 = -0.5189097F;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)Lsca;")
    public static final class225 method1359(byte arg0) {
        if (arg0 != 62) {
            field2983 = -0.68638957F;
        }
        field2984++;
        try {
            return (class225) Class.forName("bq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
