import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class264 {

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field3620 = 104;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field3628 = 0;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1689(String arg0, byte arg1) {
        field3623++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != 110) {
            return -55L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1690(boolean arg0, int arg1, int arg2, String[] arg3) {
        field3626++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            if (!arg0) {
                field3624 = 93;
            }
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[II)[I")
    public static final int[] method1691(int arg0, int[] arg1, int arg2) {
        field3625++;
        int[] var3 = new int[1152];
        int var4 = arg0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg1[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg1[var4 - 1] != 0) {
                        var7 = arg2;
                    } else if (var5 > 0 && arg1[var4 - 36] != 0) {
                        var7 = arg2;
                    } else if (var6 < 35 && arg1[var4 + 1] != 0) {
                        var7 = arg2;
                    } else if (var5 < 31 && arg1[var4 + 36] != 0) {
                        var7 = arg2;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIB)V")
    public static final void method1692(int arg0, int arg1, byte arg2) {
        class352.field4742++;
        field3627++;
        class88.field1232.method1151(88, (byte) 120);
        class88.field1232.method2275(124, arg1);
        class88.field1232.method2261(arg0, -176);
        if (arg2 != 91) {
            field3628 = -74;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static final void method1693(int arg0) {
        class195.method1347();
        field3622++;
        if (arg0 != 31) {
            method1692(71, -126, (byte) -42);
        }
    }
}
