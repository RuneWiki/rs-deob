import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class693 {

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Ljava/lang/String;")
    public String field9737;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public int field9738;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Lso;")
    public static class433 field9736 = new class433();

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "[Lcfa;")
    public static class152[] field9739 = new class152[16];

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field9734++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 16)
    public static void method3808(int arg0) {
        int var1 = -33 % ((-arg0 - 28) / 62);
        field9739 = null;
        field9736 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;ZI)V", line = 27)
    public static final void method3809(int arg0, String arg1, boolean arg2, int arg3, String arg4, boolean arg5, int arg6) {
        field9740++;
        class386.field5439.field7369 = 1;
        String var7 = arg4.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class262 var11 = class329.field4869.method3552(arg3, -89);
            if (var11 == null || var11.method1719(-126) != arg2) {
                return;
            }
            if (var11.method1719(-121)) {
                var10 = var11.field3981;
            } else {
                var9 = var11.field3986;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class41.field682.field5251; var13++) {
            class186 var16 = class41.field682.method2228(var13, 0);
            if ((!arg5 || var16.field2663) && var16.field2683 == -1 && var16.field2622 == -1 && var16.field2674 == 0 && var16.field2629.toLowerCase().indexOf(var7) != -1) {
                if (arg3 != -1) {
                    if (arg2) {
                        if (!arg1.equals(var16.method1242(arg0 - 20604, var10, arg3))) {
                            continue;
                        }
                    } else if (var16.method1246(arg3, var9, (byte) 20) != arg6) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class462.field6664 = null;
                    class111.field1687 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        if (arg0 != 20644) {
            field9739 = null;
        }
        class111.field1687 = var12;
        class35.field615 = 0;
        class462.field6664 = var8;
        String[] var14 = new String[class111.field1687];
        for (int var15 = 0; var15 < class111.field1687; var15++) {
            var14[var15] = class41.field682.method2228(var8[var15], 0).field2629;
        }
        class318.method1998(class462.field6664, (byte) -124, var14);
        class386.field5439.method2993(-1);
        class386.field5439.field7369 = 2;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZIIIIIII)V", line = 139)
    public static final void method3810(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9741++;
        if (class312.method1978(false, arg7)) {
            if (class277.field4197[arg7] == null) {
                class664.method3671(class181.field2558[arg7], arg3, arg4, arg5, arg0, arg2, -1, arg6, arg8, -127);
            } else {
                class664.method3671(class277.field4197[arg7], arg3, arg4, arg5, arg0, arg2, -1, arg6, arg8, -127);
            }
            if (!arg1) {
                method3808(-43);
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class508.field7177[var9] = true;
            }
        } else {
            class508.field7177[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 179)
    public class693(String arg0, int arg1) {
        this.field9737 = arg0;
        this.field9738 = arg1;
    }
}
