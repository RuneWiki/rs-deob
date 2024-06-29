import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class172 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field2349;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Lek;", line = 6)
    public static final class507 method1105(boolean arg0) {
        field2343++;
        if (class678.field9278 == null || class48.field560 == null) {
            return null;
        }
        if (!arg0) {
            field2348 = -26;
        }
        for (class507 var1 = (class507) class48.field560.method2434(146800640); var1 != null; var1 = (class507) class48.field560.method2434(146800640)) {
            class344 var2 = class678.field9273.method3088((byte) -112, var1.field7257);
            if (var2 != null && var2.field4806 && var2.method2223(class678.field9274, 2)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V", line = 35)
    public static void method1106(boolean arg0) {
        if (arg0) {
            field2348 = -2;
        }
        field2349 = null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V", line = 45)
    public class172(int arg0) {
        this.field2344 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;IIZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 54)
    public static final void method1107(String arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5, String arg6, String arg7, String arg8) {
        field2347++;
        class533 var9 = class237.field3176[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class237.field3176[var10] = class237.field3176[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class533(arg1, arg2, arg6, arg8, arg7, arg4, arg5, arg0);
        } else {
            var9.method3102(arg2, arg1, arg7, arg4, arg6, arg5, arg0, (byte) -98, arg8);
        }
        class237.field3176[0] = var9;
        class219.field2860++;
        if (arg3) {
            class312.field4326 = class2.field13;
        }
    }

    @OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;", line = 81)
    public final String toString() {
        field2345++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V", line = 89)
    public static final void method1108(int arg0, byte arg1) {
        field2351++;
        if (!class393.method2476(127, arg0)) {
            return;
        }
        if (arg1 > -31) {
            field2348 = -121;
        }
        class493[] var2 = class37.field475[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class493 var4 = var2[var3];
            if (var4 != null) {
                var4.field6987 = 0;
                var4.field7030 = 1;
                var4.field7024 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)V", line = 124)
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2342++;
        if (arg5 < 11) {
            method1107(null, -49, -91, false, null, -54, null, null, null);
        }
        int var6 = arg2 - arg0;
        int var7 = arg4 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class218.method1338(arg1, arg2, arg3, arg0, -8220);
            }
        } else if (var6 == 0) {
            class366.method2341(arg1, arg0, (byte) 87, arg3, arg4);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                int var10 = arg4;
                arg1 = arg0;
                arg0 = var9;
                arg4 = arg2;
                arg2 = var10;
            }
            if (arg4 < arg1) {
                int var11 = arg1;
                int var12 = arg0;
                arg1 = arg4;
                arg4 = var11;
                arg0 = arg2;
                arg2 = var12;
            }
            int var13 = arg0;
            int var14 = arg4 - arg1;
            int var15 = arg2 - arg0;
            int var16 = -(var14 >> 1);
            int var17 = arg0 >= arg2 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg1; var18 <= arg4; var18++) {
                    var16 += var15;
                    class445.field6320[var18][var13] = arg3;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg4; var19++) {
                    class445.field6320[var13][var19] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)[Lvl;", line = 241)
    public static final class13[] method1110(byte arg0) {
        int var1 = 118 % ((82 - arg0) / 37);
        field2350++;
        return new class13[] { class408.field5781, class271.field3885, class713.field9915, class440.field6257, class209.field2756, class323.field4490 };
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILee;)Loq;", line = 257)
    public static final class358 method1111(int arg0, class675 arg1) {
        field2346++;
        class220 var2 = class283.method1855(arg1, (byte) -83);
        int var3 = arg1.method3757((byte) -65);
        int var4 = arg1.method3757((byte) -65);
        int var5 = arg1.method3757((byte) -65);
        int var6 = arg1.method3757((byte) -65);
        int var7 = arg1.method3757((byte) -65);
        int var8 = arg1.method3757((byte) -65);
        int var9 = 66 / ((arg0 + 29) / 62);
        return new class358(var2.field2867, var2.field2876, var2.field2871, var2.field2875, var2.field2873, var2.field2874, var2.field2865, var2.field2864, var2.field2872, var3, var4, var5, var6, var7, var8);
    }
}
