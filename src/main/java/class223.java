import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class223 extends class222 {

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lcf;")
    public static class93 field4019 = class147.method1066("Hierhin gehen", -48);

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lcf;")
    public static class93 field4021 = class147.method1066("Chargement en cours)3)3)3", -48);

    @OriginalMember(owner = "client!me", name = "y", descriptor = "[J")
    public static long[] field4025 = new long[100];

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ltg;")
    public class181 field4016;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Ltg;")
    public class181 field4017;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lcf;")
    public class93 field4012;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
    public boolean field4011;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Z")
    public static boolean field4026;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field4015;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lkg;")
    public static final class136 method1545(int arg0, int arg1) {
        class136 var2 = (class136) class50.field815.method302((long) arg0, 0);
        field4024++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field572.method1271(arg1, -2154, arg0);
        class136 var4 = new class136();
        if (var3 != null) {
            var4.method990(arg0, new class280(var3), 4002);
        }
        class50.field815.method297((long) arg0, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method1546(int arg0) {
        if (arg0 != 32) {
            method1548(55);
        }
        field4021 = null;
        field4025 = null;
        field4019 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z")
    public static final boolean method1547(int arg0, int arg1) {
        field4009++;
        if (arg1 >= 32 && arg1 <= 126) {
            return true;
        } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
        } else if (arg1 == 128 || arg1 == 140 || arg1 == 151 || arg1 == 156 || arg1 == 159) {
            return true;
        } else if (arg0 == 159) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static final void method1548(int arg0) {
        field4018++;
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class104.field1804[var1][var6] = 0;
            }
        }
        if (arg0 != -25755) {
            return;
        }
        for (int var2 = 0; var2 < class252.field4543; var2++) {
            class237 var5 = class224.field4031[class234.field4166[var2]];
            if (var5 != null) {
                var5.field3834 = false;
            }
        }
        for (int var3 = 0; var3 < class72.field1299; var3++) {
            class227 var4 = class155.field2709[class58.field995[var3]];
            if (var4 != null) {
                var4.field3834 = false;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)I")
    public static final int method1549(int arg0) {
        if (arg0 == -18123) {
            field4020++;
            return class164.field2888;
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
