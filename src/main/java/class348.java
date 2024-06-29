import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class348 {

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lgg;")
    private class114 field4513 = new class114(64);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lkha;")
    private class687 field4514;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lkha;")
    private class687 field4506;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lsea;")
    public static class399 field4507 = new class399();

    @OriginalMember(owner = "client!df", name = "c", descriptor = "F")
    public static float field4508;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Luh;")
    public static class153 field4512;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZBLdv;)V", line = 5)
    public static final void method2038(boolean arg0, byte arg1, class124 arg2) {
        if (arg1 < 117) {
            field4510 = 83;
        }
        field4509++;
        if (class573.field8011 >= 400) {
            return;
        }
        class155 var3 = arg2.field1486;
        if (var3.field1929 != null) {
            var3 = var3.method968((byte) -76, class461.field6637);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1925) {
            return;
        }
        String var4 = var3.field1900;
        if (var3.field1946 != 0) {
            String var5 = class737.field10321 == class702.field9902 ? class586.field8155.method3261(class416.field5920, (byte) 82) : class586.field8153.method3261(class416.field5920, (byte) 82);
            var4 = var4 + class714.method3956(var3.field1946, class339.field4374.field7702, 20543) + " (" + var5 + var3.field1946 + ")";
        }
        if (class138.field1656 && !arg0) {
            class49 var6 = class652.field8984 == -1 ? null : class188.field2466.method3449(2529, class652.field8984);
            if ((class337.field4352 & 0x2) != 0 && (var6 == null || var3.method973(-119, class652.field8984, var6.field720) != var6.field720)) {
                class317.field4081++;
                class425.method2528(58, class741.field10370 + " -> <col=ffff00>" + var4, -1, true, -103, (long) arg2.field354, class556.field7800, (long) arg2.field354, false, 0, 0, false, class586.field8192);
            }
        }
        if (!arg0) {
            String[] var7 = var3.field1905;
            if (class216.field2730) {
                var7 = class538.method3065(-7932, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field1959 == 0 || !var7[var8].equalsIgnoreCase(class586.field8148.method3261(class416.field5920, (byte) 82)))) {
                        byte var9 = 0;
                        int var10 = class423.field6015;
                        if (var8 == 0) {
                            var9 = 15;
                        }
                        if (var8 == 1) {
                            var9 = 60;
                        }
                        if (var8 == 2) {
                            var9 = 17;
                        }
                        if (var8 == 3) {
                            var9 = 22;
                        }
                        if (var3.field1939 == var8) {
                            var10 = var3.field1943;
                        }
                        if (var8 == 4) {
                            var9 = 8;
                        }
                        if (var3.field1917 == var8) {
                            var10 = var3.field1903;
                        }
                        class281.field3570++;
                        class425.method2528(var9, "<col=ffff00>" + var4, -1, true, -94, (long) arg2.field354, var7[var8], (long) arg2.field354, false, 0, 0, false, var7[var8].equalsIgnoreCase(class586.field8148.method3261(class416.field5920, (byte) 82)) ? var3.field1914 : var10);
                    }
                }
            }
            if (var3.field1959 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class586.field8148.method3261(class416.field5920, (byte) 82))) {
                        short var12 = 0;
                        if (var3.field1946 > class339.field4374.field7702) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 15;
                        }
                        if (var11 == 1) {
                            var13 = 60;
                        }
                        if (var11 == 2) {
                            var13 = 17;
                        }
                        if (var11 == 3) {
                            var13 = 22;
                        }
                        if (var11 == 4) {
                            var13 = 8;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class135.field1592++;
                        class425.method2528(var13, "<col=ffff00>" + var4, -1, true, -119, (long) arg2.field354, var7[var11], (long) arg2.field354, false, 0, 0, false, var3.field1914);
                    }
                }
            }
        }
        class718.field10133++;
        class425.method2528(1012, "<col=ffff00>" + var4, -1, true, -103, (long) arg2.field354, class586.field8147.method3261(class416.field5920, (byte) 82), (long) arg2.field354, arg0, 0, 0, false, class464.field6716);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Lcw;", line = 171)
    public final class138 method2039(int arg0, int arg1) {
        field4511++;
        if (arg0 != 3) {
            field4512 = null;
        }
        class138 var3 = (class138) this.field4513.method778((long) arg1, -76);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field4514.method3810(0, arg0 ^ 0xFFFFA4C3, arg1);
        } else {
            var4 = this.field4506.method3810(0, -23360, arg1 & 0x7FFF);
        }
        class138 var5 = new class138();
        if (var4 != null) {
            var5.method861(arg0 ^ 0x3D, new class179(var4));
        }
        if (arg1 >= 32768) {
            var5.method859(-121);
        }
        this.field4513.method774((long) arg1, arg0 ^ 0xFFFFFF8B, var5);
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 214)
    public static final void method2040(byte arg0) {
        int var1 = 80 % ((-arg0 - 40) / 57);
        class721.field10159 = -1;
        field4516++;
        class67.field886 = 0;
        class333.field4292 = -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 228)
    public static void method2041(int arg0) {
        field4507 = null;
        if (arg0 != 60) {
            field4510 = 68;
        }
        field4512 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 239)
    public static final String method2042(byte arg0, String arg1) {
        field4515++;
        if (arg0 < 8) {
            return null;
        }
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(ILkha;Lkha;)V", line = 306)
    public class348(int arg0, class687 arg1, class687 arg2) {
        this.field4514 = arg1;
        this.field4506 = arg2;
        if (this.field4514 != null) {
            this.field4514.method3812(0, 0);
        }
        if (this.field4506 != null) {
            this.field4506.method3812(0, 0);
        }
    }
}
