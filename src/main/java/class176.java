import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class176 extends class147 {

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "Z")
    public static boolean field2130;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "J")
    public static long field2129;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
    public static int[] field2127;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public int field2128;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field2131;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method867(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class40("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        new class40("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field2130 = false;
        field2129 = 0L;
        field2127 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I", line = 4)
    public static final int method862(int arg0, int arg1, int arg2) {
        field2113++;
        if (arg1 != -7411) {
            method862(27, -121, 119);
        }
        return arg2 == 4 || arg2 == 5 ? class247.field3483[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Loj;II)Lqh;", line = 29)
    public final class352 method863(class280 arg0, int arg1, int arg2) {
        field2117++;
        int var4 = class270.field3870[this.field2112];
        int var5 = 63 % ((62 - arg1) / 36);
        if (var4 == 0) {
            class261 var12 = class63.method320(this.field2124, this.field2111, this.field2125);
            if (var12 instanceof class314) {
                class314 var13 = (class314) var12;
                if (var13.field4578 != null) {
                    return ((class116) var13.field4578).method21(arg2, arg0, (byte) -98);
                }
            }
        } else if (var4 == 1) {
            class183 var6 = class330.method2001(this.field2124, this.field2111, this.field2125);
            if (var6 instanceof class19) {
                class19 var7 = (class19) var6;
                if (var7.field261 != null) {
                    return ((class116) var7.field261).method21(arg2, arg0, (byte) -98);
                }
            }
        } else if (var4 == 2) {
            class83 var10 = class263.method1603(this.field2124, this.field2111, this.field2125, field2131 == null ? (field2131 = method867("td")) : field2131);
            if (var10 instanceof class4) {
                class4 var11 = (class4) var10;
                if (var11.field39 != null) {
                    return ((class116) var11.field39).method21(arg2, arg0, (byte) -98);
                }
            }
        } else if (var4 == 3) {
            class60 var8 = class427.method2542(this.field2124, this.field2111, this.field2125);
            if (var8 instanceof class44) {
                class44 var9 = (class44) var8;
                if (var9.field552 != null) {
                    return ((class116) var9.field552).method21(arg2, arg0, (byte) -98);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z", line = 112)
    public static final boolean method864(int arg0) {
        if (arg0 < 97) {
            return false;
        } else {
            field2118++;
            return class142.field1712 == 0 ? class208.field2882.method944((byte) -122) : true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 127)
    public static void method865(int arg0) {
        if (arg0 != 256) {
            method864(117);
        }
        field2127 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIBII)V", line = 144)
    public static final void method866(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2119++;
        int var6 = arg1 - arg0;
        int var7 = arg4 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class32.method169(arg2, arg5, arg0, true, arg4);
            }
        } else if (var7 == 0) {
            class13.method95(arg5, arg2, arg0, (byte) -18, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg0 * var8 >> 12);
            if (arg3 != 70) {
                field2127 = null;
            }
            int var10;
            int var11;
            if (arg0 < class75.field912) {
                var11 = class75.field912;
                var10 = (class75.field912 * var8 >> 12) + var9;
            } else if (class453.field6396 < arg0) {
                var10 = (class453.field6396 * var8 >> 12) + var9;
                var11 = class453.field6396;
            } else {
                var10 = arg2;
                var11 = arg0;
            }
            int var12;
            int var13;
            if (class75.field912 > arg1) {
                var12 = (class75.field912 * var8 >> 12) + var9;
                var13 = class75.field912;
            } else if (arg1 <= class453.field6396) {
                var12 = arg4;
                var13 = arg1;
            } else {
                var13 = class453.field6396;
                var12 = (class453.field6396 * var8 >> 12) + var9;
            }
            if (var12 < class357.field5123) {
                var12 = class357.field5123;
                var13 = (class357.field5123 - var9 << 12) / var8;
            } else if (class328.field4729 < var12) {
                var13 = (class328.field4729 - var9 << 12) / var8;
                var12 = class328.field4729;
            }
            if (var10 < class357.field5123) {
                var10 = class357.field5123;
                var11 = (class357.field5123 - var9 << 12) / var8;
            } else if (var10 > class328.field4729) {
                var11 = (class328.field4729 - var9 << 12) / var8;
                var10 = class328.field4729;
            }
            class335.method2032(-1, var13, var12, arg5, var11, var10);
        }
    }
}
