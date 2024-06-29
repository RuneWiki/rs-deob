import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class308 extends class137 {

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[B")
    public byte[] field4996;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field4997;

    // $FF: synthetic field
    @OriginalMember(owner = "client!p", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field4998;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public static final void method2091(int arg0) {
        if (arg0 != 0) {
            method2094((class119) null, -66, (class125) null, -37, (byte) 51, 48, true, (class51) null);
        }
        class89.field1388.method1876((byte) 119);
        field4993++;
        class174.field2911.method1876((byte) 126);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lug;")
    public static final class215 method2092(int arg0, int arg1) {
        field4997++;
        class215 var2 = (class215) class103.field1626.method1879(8887, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -5) {
            byte[] var3 = class61.field889.method1156(29, arg0, (byte) -16);
            class215 var4 = new class215();
            if (var3 != null) {
                var4.method1480(new class274(var3), arg0, false);
            }
            class103.field1626.method1883((long) arg0, 55, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public static final void method2093(int arg0) {
        if (arg0 != 0) {
            return;
        }
        try {
            Method var1 = (field4998 == null ? (field4998 = method2095("java.lang.Runtime")) : field4998).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class9.field197 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field4995++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lth;ILcj;IBIZLsj;)V")
    public static final void method2094(class119 arg0, int arg1, class125 arg2, int arg3, byte arg4, int arg5, boolean arg6, class51 arg7) {
        field4994++;
        class212 var8 = null;
        if (arg2.field2007 == 0) {
            if ((double) class262.field4270 == 3.0D) {
                var8 = class246.field3874;
            }
            if ((double) class262.field4270 == 4.0D) {
                var8 = class184.field3052;
            }
            if ((double) class262.field4270 == 6.0D) {
                var8 = class117.field1805;
            }
            if ((double) class262.field4270 >= 8.0D) {
                var8 = class134.field2180;
            }
        } else if (arg2.field2007 == 1) {
            if ((double) class262.field4270 == 3.0D) {
                var8 = class117.field1805;
            }
            if ((double) class262.field4270 == 4.0D) {
                var8 = class134.field2180;
            }
            if ((double) class262.field4270 == 6.0D) {
                var8 = class259.field4247;
            }
            if ((double) class262.field4270 >= 8.0D) {
                var8 = class60.field875;
            }
        } else if (arg2.field2007 == 2) {
            if ((double) class262.field4270 == 3.0D) {
                var8 = class259.field4247;
            }
            if ((double) class262.field4270 == 4.0D) {
                var8 = class60.field875;
            }
            if ((double) class262.field4270 == 6.0D) {
                var8 = class193.field3148;
            }
            if ((double) class262.field4270 >= 8.0D) {
                var8 = class102.field1625;
            }
        }
        if (var8 != null) {
            int var9 = arg2.field1990;
            if (arg0.field1893 && arg2.field1987 != -1) {
                var9 = arg2.field1987;
            }
            int var10 = class183.field3043.method525(arg2.field1999, (int[]) null, class253.field4145);
            int var11 = arg0.field1875;
            int var12;
            if (arg6) {
                var12 = var11 - var8.method1461() * var10 / 2;
            } else {
                var12 = var11 - (var8.method1459() * (var10 - 1) + (arg3 + (var8.method1461() / 2)));
            }
            int var13 = 0;
            int var14 = var12 - var8.method1461();
            int var15 = var12 + var8.method1461() / 2;
            for (int var16 = 0; var16 < var10; var16++) {
                String var22 = class253.field4145[var16];
                if ((var10 - 1) > var16) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                int var23 = var8.method1463(var22);
                if (var13 < var23) {
                    var13 = var23;
                }
            }
            arg7.field739 = arg0.field1876 + arg1 - var13 / 2;
            arg7.field736 = arg0.field1876 + arg1 + (var13 / 2);
            arg7.field742 = var14 + arg5;
            int var17 = var14 + 2;
            arg7.field744 = var8.method1459() * var10 + var14 + arg5;
            int var18 = arg0.field1876 - var13 / 2 - 5;
            if (arg2.field2002 != 0) {
                class94.method668(var18, var17, var13 + 10, -var17 + var14 - (-(var8.method1459() * var10) - 1), arg2.field2002, arg2.field2002 >>> 24);
            }
            if (arg2.field2009 != 0) {
                class94.method665(var18, var17, var13 + 10, -var17 + (var14 - (-(var10 * var8.method1459()) - 1)), arg2.field2009, arg2.field2009 >>> 24);
            }
            for (int var19 = 0; var19 < var10; var19++) {
                String var20 = class253.field4145[var19];
                if ((var10 - 1) > var19) {
                    var20 = var20.substring(0, var20.length() - 4);
                }
                int var21 = var8.method1463(var20);
                var8.method1457(var20, arg0.field1876, var15, var9, true);
                if (var13 < var21) {
                    var13 = var21;
                }
                var15 += var8.method1459();
            }
        }
        if (arg4 != -44) {
            method2094((class119) null, 37, (class125) null, -56, (byte) -8, 66, false, (class51) null);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
    public class308(byte[] arg0) {
        this.field4996 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2095(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
