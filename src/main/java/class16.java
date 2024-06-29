import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class20 {

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public int field295 = -1;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public int field300 = 0;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[I")
    public static int[] field288 = new int[256];

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "Lsc;")
    public static class128 field299 = class129.method1017(false, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "Lsc;")
    public static class128 field303;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "Lsc;")
    public static class128 field304;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
    public static int[] field307;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lsc;")
    public static class128 field308;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "[[[B")
    public static byte[][][] field305;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lsc;ILsc;ILsc;)V")
    public static final void method153(class128 arg0, int arg1, class128 arg2, int arg3, class128 arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class72.field1608[var5] = class72.field1608[var5 - 1];
            class37.field709[var5] = class37.field709[var5 - 1];
            class67.field1515[var5] = class67.field1515[var5 - 1];
            class103.field2348[var5] = class103.field2348[var5 - 1];
        }
        class72.field1608[0] = arg1;
        class79.field1784++;
        class37.field724 = class135.field3186;
        class37.field709[0] = arg4;
        if (arg3 == 16799) {
            class67.field1515[0] = arg2;
            class103.field2348[0] = arg0;
            field297++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method154(int arg0) {
        field305 = null;
        if (arg0 != 32188) {
            field298 = -126;
        }
        field303 = null;
        field308 = null;
        field304 = null;
        field299 = null;
        field307 = null;
        field288 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLha;)V")
    public static final void method155(byte arg0, class50 arg1) {
        field294++;
        arg1.field984 = false;
        if (arg1.field958 != -1) {
            class134 var2 = class70.method527(12, arg1.field958);
            if (var2 == null || var2.field3142 == null) {
                arg1.field958 = -1;
            } else {
                arg1.field950++;
                if (arg1.field955 < var2.field3142.length && var2.field3162[arg1.field955] < arg1.field950) {
                    arg1.field955++;
                    arg1.field950 = 1;
                    class93.method724(arg1.field975, arg1.field987, arg1.field955, (byte) 85, var2);
                }
                if (arg1.field955 >= var2.field3142.length) {
                    arg1.field955 = 0;
                    arg1.field950 = 0;
                    class93.method724(arg1.field975, arg1.field987, arg1.field955, (byte) 117, var2);
                }
            }
        }
        if (arg0 != 30) {
            return;
        }
        if (arg1.field968 != -1 && arg1.field1000 <= class29.field554) {
            if (arg1.field998 < 0) {
                arg1.field998 = 0;
            }
            int var3 = class147.method1184(arg1.field968, 13).field2541;
            if (var3 == -1) {
                arg1.field968 = -1;
            } else {
                class134 var4 = class70.method527(12, var3);
                if (var4 == null || var4.field3142 == null) {
                    arg1.field968 = -1;
                } else {
                    arg1.field966++;
                    if (arg1.field998 < var4.field3142.length && var4.field3162[arg1.field998] < arg1.field966) {
                        arg1.field966 = 1;
                        arg1.field998++;
                        class93.method724(arg1.field975, arg1.field987, arg1.field998, (byte) 67, var4);
                    }
                    if (arg1.field998 >= var4.field3142.length && (arg1.field998 < 0 || arg1.field998 >= var4.field3142.length)) {
                        arg1.field968 = -1;
                    }
                }
            }
        }
        if (arg1.field981 != -1 && arg1.field970 <= 1) {
            class134 var5 = class70.method527(12, arg1.field981);
            if (var5.field3148 == 1 && arg1.field1004 > 0 && arg1.field949 <= class29.field554 && arg1.field1014 < class29.field554) {
                arg1.field970 = 1;
                return;
            }
        }
        if (arg1.field981 != -1 && arg1.field970 == 0) {
            class134 var6 = class70.method527(12, arg1.field981);
            if (var6 == null || var6.field3142 == null) {
                arg1.field981 = -1;
            } else {
                arg1.field957++;
                if (arg1.field973 < var6.field3142.length && var6.field3162[arg1.field973] < arg1.field957) {
                    arg1.field973++;
                    arg1.field957 = 1;
                    class93.method724(arg1.field975, arg1.field987, arg1.field973, (byte) 105, var6);
                }
                if (arg1.field973 >= var6.field3142.length) {
                    arg1.field973 -= var6.field3158;
                    arg1.field1015++;
                    if (arg1.field1015 >= var6.field3172) {
                        arg1.field981 = -1;
                    } else if (arg1.field973 >= 0 && var6.field3142.length > arg1.field973) {
                        class93.method724(arg1.field975, arg1.field987, arg1.field973, (byte) 121, var6);
                    } else {
                        arg1.field981 = -1;
                    }
                }
                arg1.field984 = var6.field3156;
            }
        }
        if (arg1.field970 > 0) {
            arg1.field970--;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field288[var0] = var1;
        }
        field303 = class129.method1017(false, "Ein kostenloses Spielkonto erstellen)3");
        field304 = class129.method1017(false, "Ladevorgang )2 bitte warten Sie)3");
        field307 = new int[2000];
        field308 = class129.method1017(false, "gelb:");
    }
}
