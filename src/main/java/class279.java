import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class279 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Lcq;")
    public static class72 field3614 = new class72(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field3618 = 1;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "F")
    public static float field3616;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lwo;")
    public static class285 field3615;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3617;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    public abstract void method1042(int arg0, int arg1);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lgi;IIIIZ)V")
    public abstract void method1044(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILge;IIZIIIIILuo;)Lge;")
    public static final class386 method1745(int arg0, class386 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
        field3613++;
        long var11 = (long) arg6;
        class386 var13 = (class386) class392.field5344.method2295(var11, (byte) 74);
        short var14 = 1031;
        if (var13 == null) {
            class402 var15 = class147.method952((byte) -81, arg6, class363.field4936, 0);
            if (var15 == null) {
                return null;
            }
            var13 = arg10.method701(var15, var14, class286.field3776, 64, 768);
            class392.field5344.method2294(var13, (byte) 47, var11);
        }
        if (arg4) {
            method1747(false);
        }
        class386 var16 = var13.method1459((byte) 2, var14, true);
        if (arg2 != 0) {
            var16.method1487(arg2);
        }
        if (arg5 != 0) {
            var16.method1485(arg5);
        }
        if (arg3 != 0) {
            var16.method1445(arg3);
        }
        if (arg9 != 0) {
            var16.method1492(0, arg9, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILgi;)Lgi;")
    public abstract class416 method1055(int arg0, int arg1, class416 arg2);

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)I")
    public abstract int method1050(int arg0, int arg1);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lsi;[I)V")
    public abstract void method1047(class92 arg0, int[] arg1);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
    public abstract void method1053();

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Lgi;IIIIZ)V")
    public abstract void method1051(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1058(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1046(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(II)V")
    public class279(int arg0, int arg1) {
        this.field3611 = arg1;
        this.field3612 = arg0;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(II)I")
    public abstract int method1054(int arg0, int arg1);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
    public abstract void method1045(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1049(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method1746(int arg0) {
        if (arg0 != 0) {
            field3616 = -0.7891751F;
        }
        field3617 = null;
        field3615 = null;
        field3614 = null;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(Lgi;IIIIZ)Z")
    public abstract boolean method1059(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static final void method1747(boolean arg0) {
        field3610++;
        class365 var1 = class414.field5683;
        synchronized (class414.field5683) {
            class414.field5683.method2298(0);
        }
        if (arg0) {
            method1746(120);
        }
        class365 var2 = class264.field3384;
        synchronized (class264.field3384) {
            class264.field3384.method2298(0);
        }
    }
}
