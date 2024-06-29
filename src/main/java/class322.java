import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class322 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lbg;")
    public static class324 field4530 = new class324(7, 0);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lid;")
    public static class412 field4534 = new class412(2);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lfs;")
    public static class387 field4533;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field4536;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static final void method1988(byte arg0) {
        field4531++;
        if (arg0 >= -104) {
            field4530 = null;
        }
        if (class419.field6188 == 2) {
            class352.field4882 = 96;
            return;
        }
        try {
            Method var1 = (field4536 == null ? (field4536 = method1992("java.lang.Runtime")) : field4536).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class352.field4882 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lpe;Z)Z")
    public static final boolean method1989(class431 arg0, boolean arg1) {
        boolean var2 = class52.field578 == class131.field1899;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method885(11264);
        if (arg0.field6332 < 0 || arg0.field6339 < 0 || arg0.field6340 >= class241.field3562 || arg0.field6337 >= class497.field7388) {
            return false;
        }
        for (int var6 = arg0.field6332; var6 <= arg0.field6340; var6++) {
            for (int var9 = arg0.field6339; var9 <= arg0.field6337; var9++) {
                class148 var10 = class453.method2729(arg0.field6328, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6332) {
                        var11++;
                    }
                    if (var6 < arg0.field6340) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6339) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6337) {
                        var11 += 2;
                    }
                    class480 var12 = class439.method2689((byte) -99, var11, arg0);
                    class480 var13 = var10.field2086;
                    if (var13 == null) {
                        var10.field2086 = var12;
                    } else {
                        while (var13.field7058 != null) {
                            var13 = var13.field7058;
                        }
                        var13.field7058 = var12;
                    }
                    var10.field2094 = (byte) (var10.field2094 | var11);
                    if (var2 && (class394.field5789[var6][var9] & 0xFF000000) != 0) {
                        var3 = class394.field5789[var6][var9];
                        var4 = class506.field7486[var6][var9];
                        var5 = class453.field6667[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6332; var7 <= arg0.field6340; var7++) {
                for (int var8 = arg0.field6339; var8 <= arg0.field6337; var8++) {
                    if ((class394.field5789[var7][var8] & 0xFF000000) == 0) {
                        class394.field5789[var7][var8] = var3;
                        class506.field7486[var7][var8] = var4;
                        class453.field6667[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class481.field7063[class435.field6376++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4530 = null;
        field4534 = null;
        field4533 = null;
        int var1 = -24 % ((-arg0 - 25) / 34);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([Ll;I)V")
    public static final void method1991(class16[] arg0, int arg1) {
        field4532++;
        class489.field7188 = arg0.length;
        class517.field7617 = new int[class489.field7188 + arg1];
        class436.field6393 = new class16[class489.field7188 + 10];
        class201.method1414(arg0, 0, class436.field6393, 0, class489.field7188);
        for (int var2 = 0; var2 < class489.field7188; var2++) {
            class517.field7617[var2] = class436.field6393[var2].method117();
        }
        for (int var3 = class489.field7188; var3 < class436.field6393.length; var3++) {
            class517.field7617[var3] = 12;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1992(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class331("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field4535 = 0;
    }
}
