import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class661 {

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lmk;")
    private class321 field9411 = new class321();

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "Loga;")
    private class158 field9422 = new class158();

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    private int field9419;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    private int field9420;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lefa;")
    private class322 field9421;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lps;")
    public static class5 field9418;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lmk;BJ)V", line = 10)
    public final void method3716(class321 arg0, byte arg1, long arg2) {
        if (arg1 != -24) {
            this.field9411 = null;
        }
        field9415++;
        if (this.field9420 == 0) {
            class321 var5 = this.field9422.method1132(-1);
            var5.method2360((byte) 66);
            var5.method1989((byte) 93);
            if (this.field9411 == var5) {
                class321 var6 = this.field9422.method1132(-1);
                var6.method2360((byte) 66);
                var6.method1989((byte) 124);
            }
        } else {
            this.field9420--;
        }
        this.field9421.method2001(arg1 ^ 0x4A, arg0, arg2);
        this.field9422.method1134(arg0, -1);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZLu;Z)V", line = 50)
    public static final void method3717(boolean arg0, class53 arg1, boolean arg2) {
        field9412++;
        if (class373.field5520 >= 400) {
            return;
        }
        class76 var3 = arg1.field805;
        if (var3.field1212 != null) {
            var3 = var3.method443(class308.field4545, (byte) 114);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1169) {
            return;
        }
        String var4 = var3.field1215;
        if (var3.field1179 != 0) {
            String var5 = class478.field6840 == class132.field1922 ? class279.field3655.method1654(-76, class262.field3401) : class279.field3653.method1654(96, class262.field3401);
            var4 = var4 + class617.method3542(class321.field4681.field1123, var3.field1179, false) + " (" + var5 + var3.field1179 + ")";
        }
        if (class240.field3164 && !arg0) {
            class278 var6 = class2.field21 == -1 ? null : class141.field2041.method1503(!arg2, class2.field21);
            if ((class282.field3771 & 0x2) != 0 && (var6 == null || var3.method445((byte) -62, class2.field21, var6.field3615) != var6.field3615)) {
                class621.method3581(class697.field9824, 0, 50, (long) arg1.field7405, 0, (byte) 127, class372.field5508 + " -> <col=ffff00>" + var4, false, -1, class142.field2061, true);
                class66.field1047++;
            }
        }
        if (!arg0) {
            String[] var7 = var3.field1187;
            if (class699.field9841) {
                var7 = class198.method1293(var7, false);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field1219 == 0 || !var7[var8].equalsIgnoreCase(class279.field3648.method1654(110, class262.field3401)))) {
                        byte var9 = 0;
                        int var10 = class379.field5696;
                        if (var8 == 0) {
                            var9 = 47;
                        }
                        if (var8 == 1) {
                            var9 = 13;
                        }
                        if (var8 == 2) {
                            var9 = 58;
                        }
                        if (var8 == 3) {
                            var9 = 16;
                        }
                        if (var3.field1209 == var8) {
                            var10 = var3.field1237;
                        }
                        if (var8 == 4) {
                            var9 = 48;
                        }
                        if (var3.field1235 == var8) {
                            var10 = var3.field1218;
                        }
                        class621.method3581(var7[var8], 0, var9, (long) arg1.field7405, 0, (byte) 127, "<col=ffff00>" + var4, false, -1, var7[var8].equalsIgnoreCase(class279.field3648.method1654(-79, class262.field3401)) ? var3.field1197 : var10, true);
                        class76.field1245++;
                    }
                }
            }
            if (var3.field1219 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class279.field3648.method1654(99, class262.field3401))) {
                        short var12 = 0;
                        if (class321.field4681.field1123 < var3.field1179) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 47;
                        }
                        if (var11 == 1) {
                            var13 = 13;
                        }
                        if (var11 == 2) {
                            var13 = 58;
                        }
                        if (var11 == 3) {
                            var13 = 16;
                        }
                        if (var11 == 4) {
                            var13 = 48;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class621.method3581(var7[var11], 0, var13, (long) arg1.field7405, 0, (byte) 127, "<col=ffff00>" + var4, false, -1, var3.field1197, true);
                        class509.field7191++;
                    }
                }
            }
        }
        class108.field1611++;
        class621.method3581(class279.field3647.method1654(111, class262.field3401), 0, 1006, (long) arg1.field7405, 0, (byte) 127, "<col=ffff00>" + var4, arg0, -1, class13.field307, true);
        if (arg2) {
            field9414 = 93;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 216)
    public static void method3718(byte arg0) {
        field9418 = null;
        int var1 = 9 % ((35 - arg0) / 46);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V", line = 226)
    public final void method3719(boolean arg0) {
        field9413++;
        this.field9422.method1125(arg0);
        this.field9421.method1995((byte) -123);
        if (!arg0) {
            this.method3719(true);
        }
        this.field9411 = new class321();
        this.field9420 = this.field9419;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IJ)Lmk;", line = 240)
    public final class321 method3720(int arg0, long arg1) {
        field9416++;
        if (arg0 > -83) {
            this.method3719(true);
        }
        class321 var4 = (class321) this.field9421.method2002((byte) -112, arg1);
        if (var4 != null) {
            this.field9422.method1134(var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(I)V", line = 277)
    public class661(int arg0) {
        this.field9419 = arg0;
        this.field9420 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field9421 = new class322(var2);
    }
}
