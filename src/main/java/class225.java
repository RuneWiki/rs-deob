import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class225 {

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public int field3619 = 128;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public int field3620 = 128;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field3629;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dea", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field3630;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1656(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([ILsp;[II[I)V", line = 6)
    public static final void method1651(int[] arg0, class589 arg1, int[] arg2, int arg3, int[] arg4) {
        field3618++;
        if (arg3 != 5816) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field4201.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4201[var9] = null;
                    } else {
                        class428 var10 = class636.field8942.method2872((byte) 11, var6);
                        int var11 = var10.field6513;
                        class684 var12 = arg1.field4201[var9];
                        if (var12 != null) {
                            if (var12.field9590 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4201[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9595 = 1;
                                    var12.field9592 = var8;
                                    var12.field9596 = 0;
                                    var12.field9591 = 0;
                                    var12.field9588 = 0;
                                    if (!arg1.field4180) {
                                        class216.method1622(0, arg1, (byte) -109, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field9591 = 0;
                                }
                            } else if (var10.field6527 >= class636.field8942.method2872((byte) 11, var12.field9590).field6527) {
                                var12 = arg1.field4201[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class684 var13 = arg1.field4201[var9] = new class684();
                            var13.field9591 = 0;
                            var13.field9588 = 0;
                            var13.field9596 = 0;
                            var13.field9592 = var8;
                            var13.field9590 = var6;
                            var13.field9595 = 1;
                            if (!arg1.field4180) {
                                class216.method1622(0, arg1, (byte) -57, var10);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I", line = 106)
    public static final int method1652(byte arg0) {
        field3621++;
        if (class573.field8182 == null) {
            if (!class453.field6808 && class52.field693 > 0) {
                if (class159.field2705 && class83.field1024.method1515(81, 106) && class52.field693 > 2) {
                    return ((class295) class307.field4831.field8428.field853.field853).field4625;
                }
                return ((class295) class307.field4831.field8428.field853).field4625;
            }
            int var1 = class464.field6929.method451(1196);
            int var2 = class464.field6929.method454(50);
            int var3 = class492.field7207;
            int var4 = class579.field8257;
            int var5 = class254.field4051;
            if (var3 < var1 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class52.field693; var7++) {
                    if (class374.field5844) {
                        int var11 = var4 + ((class52.field693 - var7 - 1) * 16) + 33;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class52.field693 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class628 var9 = new class628(class307.field4831);
                    for (class295 var10 = (class295) var9.method3663(4); var10 != null; var10 = (class295) var9.method3660(true)) {
                        if (var6 == var8++) {
                            return var10.field4625;
                        }
                    }
                }
            }
        }
        return arg0 >= -60 ? -104 : -1;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILdea;)V", line = 197)
    public final void method1653(int arg0, class225 arg1) {
        this.field3627 = arg1.field3627;
        this.field3623 = arg1.field3623;
        field3628++;
        this.field3619 = arg1.field3619;
        if (arg0 == 1) {
            this.field3622 = arg1.field3622;
            this.field3625 = arg1.field3625;
            this.field3620 = arg1.field3620;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V", line = 256)
    public class225(int arg0) {
        this.field3622 = arg0;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(IIIIII)V", line = 263)
    private class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3619 = arg1;
        this.field3627 = arg4;
        this.field3622 = arg0;
        this.field3620 = arg2;
        this.field3625 = arg3;
        this.field3623 = arg5;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)Ldea;", line = 217)
    public final class225 method1654(int arg0) {
        field3624++;
        return arg0 == 0 ? new class225(this.field3622, this.field3619, this.field3620, this.field3625, this.field3627, this.field3623) : null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lsi;", line = 237)
    public static final class520 method1655(Component arg0, boolean arg1, int arg2) {
        field3626++;
        try {
            Constructor var3 = Class.forName("cga").getDeclaredConstructor(field3630 == null ? (field3630 = method1656("java.awt.Component")) : field3630, Boolean.TYPE);
            return (class520) var3.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            if (arg2 <= 67) {
                method1655(null, false, 121);
            }
            return new class33(arg0, arg1);
        }
    }
}
