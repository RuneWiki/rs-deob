import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class39 {

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[I")
    private int[] field621;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lph;")
    private static class229 field617 = class266.method1858("Examine", 0);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lph;")
    public static class229 field618 = field617;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lvm;")
    public static class202 field614 = new class202(4);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field624 = -1;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lph;")
    private static class229 field623 = class266.method1858(")3fr", 0);

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lph;")
    private static class229 field625 = class266.method1858("pt", 0);

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lph;")
    private static class229 field627 = class266.method1858("de", 0);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Z")
    public static boolean field629 = false;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lph;")
    private static class229 field632 = class266.method1858(")3de", 0);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lph;")
    private static class229 field628 = class266.method1858("en", 0);

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lph;")
    private static class229 field633 = class266.method1858(")3pt", 0);

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lph;")
    private static class229 field631 = class266.method1858(")3en", 0);

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lph;")
    private static class229 field634 = class266.method1858("fr", 0);

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "[Lph;")
    public static class229[] field630 = new class229[] { field628, field627, field634, field625 };

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[Lph;")
    private static class229[] field626 = new class229[] { field631, field632, field623, field633 };

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "[[I")
    public static int[][] field622;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIJ)Lph;", line = 20)
    public static final class229 method297(int arg0, int[] arg1, int arg2, long arg3) {
        field619++;
        if (class255.field4260 != null) {
            class229 var5 = class255.field4260.method331(arg1, arg3, arg0 ^ 0xFFFFBCAB, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg2 == 5) {
            return class100.method767((byte) 30, arg3).method1628(-32);
        } else if (arg0 == -17194) {
            return class263.method1829(true, arg3);
        } else {
            return (class229) null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI[Loi;[BIZ)V", line = 62)
    public static final void method298(boolean arg0, int arg1, class108[] arg2, byte[] arg3, int arg4, boolean arg5) {
        if (!arg5) {
            method299(-78);
        }
        class164 var6 = new class164(arg3);
        field620++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1154((byte) 97);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1209(-128);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = (var9 & 0xFE7) >> 6;
                int var14 = var6.method1178(8);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var13 + arg4;
                int var18 = arg1 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class108 var19 = null;
                    if (!arg0) {
                        int var20 = var12;
                        if ((class245.field4050[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class213.method1509(var16, arg0, !arg5, var17, var18, var15, !arg0, var12, var12, var19, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([I)V", line = 134)
    public class39(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field621 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field621[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field621[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field621[var5 + var5] = arg0[var4];
            this.field621[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 170)
    public static final void method299(int arg0) {
        if (class326.field5571 != null) {
            class253 var1 = class326.field5571;
            synchronized (class326.field5571) {
                class326.field5571 = null;
            }
        }
        field615++;
        if (arg0 < 0) {
            method298(false, 70, (class108[]) null, (byte[]) null, 90, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I", line = 192)
    public final int method300(int arg0, int arg1) {
        field616++;
        int var3 = (this.field621.length >> 1) + arg1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field621[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field621[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 265)
    public static void method301(byte arg0) {
        field625 = null;
        field633 = null;
        field617 = null;
        field627 = null;
        field632 = null;
        field618 = null;
        field614 = null;
        field630 = null;
        field623 = null;
        field631 = null;
        field622 = (int[][]) null;
        field628 = null;
        if (arg0 <= 14) {
            method299(41);
        }
        field626 = null;
        field634 = null;
    }
}
