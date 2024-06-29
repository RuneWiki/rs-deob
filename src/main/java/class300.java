import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class300 extends class476 {

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "S")
    public short field4105;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Lkc;")
    public static class157 field4102 = new class157("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Z")
    public static boolean field4108 = false;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Ldk;")
    public static class421 field4107;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field4109;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
    public class300() {
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(S)V")
    public class300(short arg0) {
        this.field4105 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1746(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4103++;
        if (arg5 >= 0 && arg7 >= 0 && arg5 < class9.field111 - 1 && arg7 < class192.field2809 - 1) {
            if (class103.field1632 == null) {
                return;
            }
            if (arg4 == 0) {
                class303 var8 = (class303) class191.method1267(arg0, arg5, arg7);
                class303 var9 = (class303) class222.method1383(arg0, arg5, arg7);
                if (var8 != null && arg2 != 2) {
                    if (var8 instanceof class172) {
                        ((class172) var8).field2594.method1053(arg6, (byte) -108);
                    } else {
                        class83.method644(arg0, arg7, arg4, arg5, arg2, var8.method170((byte) -119), arg1, -79, arg6);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class172) {
                        ((class172) var9).field2594.method1053(arg6, (byte) -108);
                    } else {
                        class83.method644(arg0, arg7, arg4, arg5, arg2, var9.method170((byte) -93), arg1, -99, arg6);
                    }
                }
            } else if (arg4 == 1) {
                class303 var10 = (class303) class506.method3004(arg0, arg5, arg7);
                if (var10 != null) {
                    if ((var10 instanceof class68)) {
                        ((class68) var10).field975.method1053(arg6, (byte) -108);
                    } else {
                        int var11 = var10.method170((byte) -59);
                        if (arg2 == 4 || arg2 == 5) {
                            class83.method644(arg0, arg7, arg4, arg5, 4, var11, arg1, -75, arg6);
                        } else if (arg2 == 6) {
                            class83.method644(arg0, arg7, arg4, arg5, 4, var11, arg1 + 4, -93, arg6);
                        } else if (arg2 == 7) {
                            class83.method644(arg0, arg7, arg4, arg5, 4, var11, (arg1 + 2 & 0x3) + 4, -12, arg6);
                        } else if (arg2 == 8) {
                            class83.method644(arg0, arg7, arg4, arg5, 4, var11, arg1 + 4, -39, arg6);
                            class83.method644(arg0, arg7, arg4, arg5, 4, var11, (arg1 + 2 & 0x3) + 4, -81, arg6);
                        }
                    }
                }
            } else if (arg4 == 2) {
                class303 var12 = (class303) class377.method2254(arg0, arg5, arg7, field4109 == null ? (field4109 = method1748("bn")) : field4109);
                if (var12 != null) {
                    if (arg2 == 11) {
                        arg2 = 10;
                    }
                    if (var12 instanceof class276) {
                        ((class276) var12).field3747.method1053(arg6, (byte) -108);
                    } else {
                        class83.method644(arg0, arg7, arg4, arg5, arg2, var12.method170((byte) 109), arg1, -54, arg6);
                    }
                }
            } else if (arg4 == 3) {
                class303 var13 = (class303) class126.method913(arg0, arg5, arg7);
                if (var13 != null) {
                    if ((var13 instanceof class133)) {
                        ((class133) var13).field2017.method1053(arg6, (byte) -108);
                    } else {
                        class83.method644(arg0, arg7, arg4, arg5, arg2, var13.method170((byte) 115), arg1, -52, arg6);
                    }
                }
            }
        }
        if (!arg3) {
            field4106 = 95;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public static void method1747(int arg0) {
        field4102 = null;
        field4107 = null;
        if (arg0 != 2) {
            method1746(-88, 61, -104, false, 92, 101, -116, 2);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1748(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
