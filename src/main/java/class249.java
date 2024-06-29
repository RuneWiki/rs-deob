import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class249 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field3618 = -1;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field3620 = 2;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1603(byte arg0, String arg1) {
        field3619++;
        if (arg0 != 46) {
            method1605(13, (class216) null);
        }
        String var2 = class200.method1287(false, class60.method370((byte) -8, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1604(String arg0, boolean arg1) {
        field3617++;
        if (!arg1) {
            return -72;
        } else if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class144.field2064; var2++) {
                if (arg0.equalsIgnoreCase(class82.field990[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqi;)V")
    public static final void method1605(int arg0, class216 arg1) {
        field3621++;
        while (true) {
            while (arg1.field3030.length > arg1.field3021) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1407(108) == 1) {
                    var3 = arg1.method1407(103);
                    var4 = arg1.method1407(106);
                    var2 = true;
                }
                int var5 = arg1.method1407(118);
                int var6 = arg1.method1407(118);
                int var7 = class133.field1940 - (1 - (class1.field1 - (var6 * 64)));
                int var8 = var5 * 64 - class230.field3313;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < client.field4446 && var7 < class133.field1940) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < (var3 * 8 + 8) && (var4 * 8) <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method1355(true);
                                if (var13 != 0) {
                                    if (class178.field2533[var10][var9] == null) {
                                        class178.field2533[var10][var9] = new byte[4096];
                                    }
                                    class178.field2533[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1355(true);
                                    if (class141.field2031[var10][var9] == null) {
                                        class141.field2031[var10][var9] = new byte[4096];
                                    }
                                    class141.field2031[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1355(true);
                        if (var16 != 0) {
                            arg1.field3021++;
                        }
                    }
                }
            }
            if (arg0 > -9) {
                method1605(-10, (class216) null);
                return;
            }
            return;
        }
    }
}
