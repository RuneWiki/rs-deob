import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class274 extends RuntimeException {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/lang/String;")
    public String field3848;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3849;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field3854 = 52;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Z")
    public static boolean field3853 = true;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3850 = -1;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[F")
    public static float[] field3856 = new float[4];

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Z")
    public static boolean field3858 = false;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lej;")
    public static class124 field3855 = new class124(65, 3);

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[I")
    public static int[] field3857;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[I[IILqo;I)Lag;")
    public static final class683 method1807(int arg0, int[] arg1, int[] arg2, int arg3, class22 arg4, int arg5) {
        field3851++;
        byte[] var6 = new byte[arg0 * arg5];
        for (int var7 = arg3; var7 < arg5; var7++) {
            int var8 = arg0 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class683(arg4, arg0, arg5, var6);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1808(int arg0) {
        if (arg0 == -3) {
            field3857 = null;
            field3856 = null;
            field3855 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class274(Throwable arg0, String arg1) {
        this.field3848 = arg1;
        this.field3849 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILin;)V")
    public static final void method1809(int arg0, class91 arg1) {
        field3852++;
        if (arg0 != 1024) {
            method1810(null, (byte) 68);
        }
        client.field4219 = 0;
        class465.field6524 = 0;
        class286.field3996 = new class174();
        class134.field2248 = new class97[1024];
        class322.field4446 = new class385[class338.field4761[class667.field9109] + 1];
        class533.field7337 = 0;
        class347.field4864 = 0;
        class544.method3145(arg1, (byte) -107);
        class351.method2198(30284, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BB)V")
    public static final void method1810(byte[] arg0, byte arg1) {
        field3859++;
        class215 var2 = new class215(arg0);
        int var3 = -91 % ((arg1 + 51) / 42);
        boolean var4 = false;
        while (true) {
            while (true) {
                int var5 = var2.method1535(255);
                if (var5 == 0) {
                    if (var4) {
                        return;
                    }
                    if (class712.field9646 == null) {
                        class712.field9646 = new int[4];
                        class62.field1235 = new int[4];
                        class58.field1145 = 4;
                    }
                    for (int var7 = 0; var7 < class712.field9646.length; var7++) {
                        class712.field9646[var7] = 0;
                        class62.field1235[var7] = var7 * 20;
                    }
                    return;
                }
                if (var5 == 1) {
                    if (class712.field9646 == null) {
                        class712.field9646 = new int[4];
                        class58.field1145 = 4;
                        class62.field1235 = new int[4];
                    }
                    for (int var6 = 0; var6 < class712.field9646.length; var6++) {
                        class712.field9646[var6] = var2.method1520(13638);
                        class62.field1235[var6] = var2.method1520(13638);
                    }
                    var4 = true;
                } else if (var5 == 2) {
                    class498.field6966 = var2.method1478(842397944);
                } else if (var5 == 3) {
                    class58.field1145 = var2.method1535(255);
                    class712.field9646 = new int[class58.field1145];
                    class62.field1235 = new int[class58.field1145];
                }
            }
        }
    }
}
