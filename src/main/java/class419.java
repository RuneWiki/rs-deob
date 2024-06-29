import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class419 extends class650 {

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    public int field5826 = -1;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public int field5839 = -1;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "[I")
    public static int[] field5830 = new int[13];

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "J")
    public static long field5836 = 0L;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "[I")
    public static int[] field5842 = new int[128];

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public int field5825;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public int field5834;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "Lxa;")
    public static class424 field5833;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nu", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field5845;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method2431(byte arg0, Class arg1, String arg2) {
        ++field5841;
        Class var3 = (Class) class355.field5166.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        } else {
            Object var4 = null;
            if (arg0 != -8) {
                method2435((class73) null, false);
            }
            File var5 = (File) class285.field3858.get(arg2);
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class355.field5166.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class355.field5166.put(arg2, field5845 != null ? field5845 : (field5845 = method2437("ai")));
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        ++field5837;
        class111 var3 = arg0.method1972();
        var3.method609(super.field9205, super.field9204 + -10, super.field9213);
        class95 var4 = class429.method2472(3, (byte) -67);
        if (~this.field5826 != 0) {
            class629 var5 = class237.field3088.method1349(-1, this.field5826).method3653(2048, arg0, this.field5834, 0, -1, -4039, 0, (class351) null, (class463) null);
            if (var5 != null) {
                var5.method665(var3, var4.field1175[2], 0);
            }
        }
        if (~this.field5839 != 0) {
            class629 var6 = class237.field3088.method1349(-1, this.field5839).method3653(2048, arg0, this.field5838, 0, -1, -4039, 0, (class351) null, (class463) null);
            if (var6 != null) {
                var6.method665(var3, var4.field1175[1], 0);
            }
        }
        class629 var7 = class237.field3088.method1349(-1, this.field5829).method3653(2048, arg0, this.field5825, 0, -1, -4039, 0, (class351) null, (class463) null);
        if (var7 != null) {
            var7.method665(var3, var4.field1175[0], 0);
        }
        if (arg1 > -47) {
            method2433(88, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "(I)V")
    public static void method2432(int arg0) {
        field5842 = null;
        field5833 = null;
        if (arg0 == 0) {
            field5830 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        ++field5835;
        if (arg0 < 91) {
            field5833 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        if (arg0 <= 121) {
            return null;
        } else {
            ++field5843;
            return null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZ)V")
    public static final void method2433(int arg0, boolean arg1) {
        class389.method2326((byte) 118, class301.field4015);
        ++class475.field6407;
        ++field5840;
        for (class524 var2 = (class524) class54.field742.method2499(-117); var2 != null; var2 = (class524) class54.field742.method2503(0)) {
            if (!var2.method174(64)) {
                var2 = (class524) class54.field742.method2499(-122);
                if (var2 == null) {
                    break;
                }
            }
            if (~var2.field7255 == -1) {
                class63.method389(true, arg1, var2, -101);
            }
        }
        if (arg0 == -1) {
            if (class12.field114 != null) {
                class553.method3100(class12.field114, 0);
                class12.field114 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field5828;
        class111 var5 = arg3.method1972();
        var5.method609(super.field9205, super.field9204, super.field9213);
        if (arg2 < 117) {
            return false;
        } else {
            class629 var6 = class237.field3088.method1349(-1, this.field5829).method3653(131072, arg3, this.field5825, 0, -1, -4039, 0, (class351) null, (class463) null);
            if (var6 != null && var6.method695(arg0, arg1, var5, true)) {
                return true;
            } else {
                if (this.field5839 != -1) {
                    class629 var7 = class237.field3088.method1349(-1, this.field5839).method3653(131072, arg3, this.field5838, 0, -1, -4039, 0, (class351) null, (class463) null);
                    if (var7 != null && var7.method695(arg0, arg1, var5, true)) {
                        return true;
                    }
                }
                if (this.field5826 != -1) {
                    class629 var8 = class237.field3088.method1349(-1, this.field5826).method3653(131072, arg3, this.field5834, 0, -1, -4039, 0, (class351) null, (class463) null);
                    if (var8 != null && var8.method695(arg0, arg1, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public static final void method2434(byte arg0) {
        class606.field8280.method851(class575.field7956, class38.field420, class436.field6017);
        ++field5827;
        if (arg0 != 22) {
            method2434((byte) -14);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ltk;Z)I")
    public static final int method2435(class73 arg0, boolean arg1) {
        ++field5831;
        if (!arg1) {
            method2435((class73) null, false);
        }
        if (class322.field4722 != arg0) {
            if (class275.field3735 != arg0) {
                if (class668.field9495 == arg0) {
                    return 34168;
                } else if (class577.field7974 == arg0) {
                    return 34166;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34167;
            }
        } else {
            return 5890;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
    public static final boolean method2436(int arg0, int arg1, int arg2) {
        ++field5832;
        if (arg1 != 2048) {
            return true;
        } else {
            return ~(arg2 & 2048) != -1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2437(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; field5842.length > var0; ++var0) {
            field5842[var0] = -1;
        }
        for (int var1 = 65; ~var1 >= -91; ++var1) {
            field5842[var1] = var1 + -65;
        }
        for (int var2 = 97; var2 <= 122; ++var2) {
            field5842[var2] = var2 + -71;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field5842[var3] = var3 - -4;
        }
        field5842[45] = field5842[47] = 63;
        field5842[42] = field5842[43] = 62;
        field5844 = 0;
    }
}
