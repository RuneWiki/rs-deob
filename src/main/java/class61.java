import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class61 extends class155 {

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Lbe;")
    public class133 field1050;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field1053 = 0;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field1056 = 50;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "Laj;")
    public static class151 field1055;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lf;")
    public static final class205 method421(byte arg0) {
        field1052++;
        if (arg0 != 127) {
            method424(false);
        }
        return class148.field2441;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Z")
    public static final boolean method422(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class287.field4745; var3++) {
            class41 var4 = class107.field1752[var3];
            if (var4.field611 == 1) {
                int var5 = var4.field614 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field618 * var5 >> 8) + var4.field620;
                    int var7 = (var4.field626 * var5 >> 8) + var4.field609;
                    int var8 = (var4.field621 * var5 >> 8) + var4.field617;
                    int var9 = (var4.field608 * var5 >> 8) + var4.field627;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field611 == 2) {
                int var10 = arg0 - var4.field614;
                if (var10 > 0) {
                    int var11 = (var4.field618 * var10 >> 8) + var4.field620;
                    int var12 = (var4.field626 * var10 >> 8) + var4.field609;
                    int var13 = (var4.field621 * var10 >> 8) + var4.field617;
                    int var14 = (var4.field608 * var10 >> 8) + var4.field627;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field611 == 3) {
                int var15 = var4.field620 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field622 * var15 >> 8) + var4.field614;
                    int var17 = (var4.field612 * var15 >> 8) + var4.field610;
                    int var18 = (var4.field621 * var15 >> 8) + var4.field617;
                    int var19 = (var4.field608 * var15 >> 8) + var4.field627;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field611 == 4) {
                int var20 = arg2 - var4.field620;
                if (var20 > 0) {
                    int var21 = (var4.field622 * var20 >> 8) + var4.field614;
                    int var22 = (var4.field612 * var20 >> 8) + var4.field610;
                    int var23 = (var4.field621 * var20 >> 8) + var4.field617;
                    int var24 = (var4.field608 * var20 >> 8) + var4.field627;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field611 == 5) {
                int var25 = arg1 - var4.field617;
                if (var25 > 0) {
                    int var26 = (var4.field622 * var25 >> 8) + var4.field614;
                    int var27 = (var4.field612 * var25 >> 8) + var4.field610;
                    int var28 = (var4.field618 * var25 >> 8) + var4.field620;
                    int var29 = (var4.field626 * var25 >> 8) + var4.field609;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;IZZ)Z")
    public static final boolean method423(String arg0, int arg1, boolean arg2, boolean arg3) {
        field1054++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = arg3;
        boolean var5 = false;
        int var6 = arg0.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var7 + var11;
            if (var10 / arg1 != var7) {
                return false;
            }
            var5 = true;
            var7 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method424(boolean arg0) {
        field1055 = null;
        if (arg0) {
            field1051 = 62;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lbe;)V")
    public class61(class133 arg0) {
        this.field1050 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lab;B)V")
    public static final void method425(class249 arg0, byte arg1) {
        int var2 = 0;
        if (arg1 > -60) {
            field1056 = -88;
        }
        while (class42.field636 > var2) {
            int var3 = arg0.method1819(-1741461848);
            int var4 = arg0.method1821((byte) 51);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class187.field2992[var3] != null) {
                class187.field2992[var3].field1951 = var4;
            }
            var2++;
        }
        field1049++;
    }
}
