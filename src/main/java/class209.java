import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public abstract class class209 extends class184 {

    @OriginalMember(owner = "client!uga", name = "x", descriptor = "Lwh;")
    public class148 field3065;

    @OriginalMember(owner = "client!uga", name = "p", descriptor = "I")
    public static int field3057 = -2;

    @OriginalMember(owner = "client!uga", name = "w", descriptor = "Z")
    public static boolean field3064 = false;

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "Lada;")
    public static class164 field3054 = new class164();

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "I")
    public static int field3067 = -1;

    @OriginalMember(owner = "client!uga", name = "A", descriptor = "Z")
    public static boolean field3068 = false;

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!uga", name = "q", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!uga", name = "r", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!uga", name = "s", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!uga", name = "t", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!uga", name = "v", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!uga", name = "y", descriptor = "Lth;")
    public static class598 field3066;

    @OriginalMember(owner = "client!uga", name = "u", descriptor = "Z")
    public boolean field3062;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIBIIIII)V", line = 15)
    public static final void method1410(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3055++;
        int var8 = class462.method2818(class432.field6446, class166.field2622, arg1, 8373);
        int var9 = -7 % ((42 - arg2) / 50);
        int var10 = class462.method2818(class432.field6446, class166.field2622, arg6, 8373);
        int var11 = class462.method2818(class391.field5895, class497.field7073, arg3, 8373);
        int var12 = class462.method2818(class391.field5895, class497.field7073, arg4, 8373);
        int var13 = class462.method2818(class432.field6446, class166.field2622, arg1 + arg5, 8373);
        int var14 = class462.method2818(class432.field6446, class166.field2622, arg6 - arg5, 8373);
        for (int var15 = var8; var15 < var13; var15++) {
            class238.method1577(arg0, class664.field9322[var15], var12, var11, (byte) -80);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class238.method1577(arg0, class664.field9322[var16], var12, var11, (byte) 125);
        }
        int var17 = class462.method2818(class391.field5895, class497.field7073, arg3 + arg5, 8373);
        int var18 = class462.method2818(class391.field5895, class497.field7073, arg4 - arg5, 8373);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class664.field9322[var19];
            class238.method1577(arg0, var20, var17, var11, (byte) 24);
            class238.method1577(arg7, var20, var18, var17, (byte) 127);
            class238.method1577(arg0, var20, var12, var18, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)Z", line = 67)
    public final boolean method1411(byte arg0) {
        field3056++;
        if (arg0 != -62) {
            field3064 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)V", line = 78)
    public static void method1412(int arg0) {
        field3066 = null;
        field3054 = null;
        if (arg0 != -2) {
            field3066 = null;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 93)
    public static final String method1413(int arg0, boolean arg1) {
        field3058++;
        String var2 = Integer.toString(arg0);
        if (arg1) {
            field3054 = null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class430.field6403.method2679(class650.field9160, -94) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class430.field6405.method2679(class650.field9160, -111) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "(B)I", line = 126)
    public final int method1415(byte arg0) {
        if (arg0 != 99) {
            field3067 = -37;
        }
        field3060++;
        return 1;
    }

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "(I)Z", line = 137)
    public final boolean method1416(int arg0) {
        if (arg0 != 0) {
            field3057 = -51;
        }
        field3063++;
        return this.field3062;
    }

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "(I)I", line = 154)
    public int method1419(int arg0) {
        field3059++;
        if (arg0 < 40) {
            this.method1415((byte) 6);
        }
        return 0;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lwh;)V", line = 164)
    public class209(class148 arg0) {
        this.field3065 = arg0;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)Z")
    public abstract boolean method1407(int arg0);

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
    public abstract void method1408(byte arg0);

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)Z")
    public abstract boolean method1409(int arg0);

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(IZ)V")
    public abstract void method1414(int arg0, boolean arg1);

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IILaw;Law;)V")
    public abstract void method1417(int arg0, int arg1, class76 arg2, class76 arg3);

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)V")
    public abstract void method1418(int arg0, int arg1, int arg2);
}
