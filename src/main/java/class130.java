import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class130 {

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "B")
    public byte field1902;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Ljf;")
    public class130 field1905;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
    public static int[] field1919 = new int[500];

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Z")
    public static boolean field1907 = false;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field1924;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field1925;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field1926;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field1927;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
    public static int[] field1918;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method794(int arg0) {
        field1918 = null;
        field1919 = null;
        if (arg0 <= 102) {
            method798(121);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z")
    public static final boolean method795(boolean arg0) {
        for (int var1 = class466.field6459; var1 < class142.field2056; var1++) {
            class491[][] var2 = class289.field3897[var1];
            for (int var3 = -class314.field4169; var3 <= 0; var3++) {
                int var4 = class121.field1779 + var3;
                int var5 = class121.field1779 - var3;
                if (var4 >= class100.field1461 || var5 < class86.field1188) {
                    for (int var6 = -class314.field4169; var6 <= 0; var6++) {
                        int var7 = class412.field5643 + var6;
                        int var8 = class412.field5643 - var6;
                        if (var4 >= class100.field1461) {
                            if (var7 >= class492.field6879) {
                                class491 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6863) {
                                    class69.field955 = arg0;
                                    class67.field913.method1107(var9, 0);
                                    class67.field913.method1111(0);
                                }
                            }
                            if (var8 < class66.field884) {
                                class491 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6863) {
                                    class69.field955 = arg0;
                                    class67.field913.method1107(var10, 0);
                                    class67.field913.method1111(0);
                                }
                            }
                        }
                        if (var5 < class86.field1188) {
                            if (var7 >= class492.field6879) {
                                class491 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6863) {
                                    class69.field955 = arg0;
                                    class67.field913.method1107(var11, 0);
                                    class67.field913.method1111(0);
                                }
                            }
                            if (var8 < class66.field884) {
                                class491 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6863) {
                                    class69.field955 = arg0;
                                    class67.field913.method1107(var12, 0);
                                    class67.field913.method1111(0);
                                }
                            }
                        }
                        if (class247.field3295 == 0) {
                            if (class205.field2781) {
                                class67.field913.method1108(24, 0);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(CB)Z")
    public static final boolean method796(char arg0, byte arg1) {
        field1906++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class387.method2379(28407, arg0)) {
            return true;
        } else {
            int var2 = -36 / ((arg1 + 55) / 39);
            char[] var3 = class244.field3248;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var8 = var3[var4];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var5 = class413.field5650;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIB)V")
    public class130(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1910 = arg3;
        this.field1902 = arg4;
        this.field1908 = arg1;
        this.field1916 = arg2;
        this.field1922 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Canvas;Lml;ILci;II)Lwm;")
    public static final class364 method797(Canvas arg0, class241 arg1, int arg2, class287 arg3, int arg4, int arg5) {
        field1913++;
        try {
            Class var6 = Class.forName("bf");
            if (arg2 != 30226) {
                method799(-12, -123);
            }
            Constructor var7 = var6.getConstructor(field1925 == null ? (field1925 = method800("java.awt.Canvas")) : field1925, field1926 == null ? (field1926 = method800("ci")) : field1926, Integer.TYPE, Integer.TYPE, field1927 == null ? (field1927 = method800("ml")) : field1927);
            return (class364) var7.newInstance(arg0, arg3, Integer.valueOf(arg5), new Integer(arg4), arg1);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method798(int arg0) {
        field1924++;
        class475.field6540 = 0;
        class450.field6121.method645(0);
        class385.field5334 = false;
        if (arg0 != 8699) {
            method797((Canvas) null, (class241) null, 44, (class287) null, 101, -113);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljf;I)V")
    public class130(class130 arg0, int arg1) {
        this.field1905 = arg0;
        this.field1910 = this.field1905.field1910 + arg1;
        this.field1902 = this.field1905.field1902;
        this.field1916 = this.field1905.field1916 + arg1;
        this.field1922 = this.field1905.field1922;
        this.field1908 = this.field1905.field1908 + arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method799(int arg0, int arg1) {
        field1917++;
        if (!class492.method2867(arg1, (byte) 89)) {
            return;
        }
        class464[] var2 = class146.field2099[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class464 var4 = var2[var3];
            if (var4 != null) {
                var4.field6307 = 0;
                var4.field6370 = 0;
                var4.field6438 = 1;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method800(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
