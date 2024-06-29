import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class54 extends class179 {

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Loe;")
    public static class127 field815 = new class127(81, -1);

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "Lbg;")
    public static class310 field826 = new class310(5, -1);

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "[Lig;")
    public static class154[] field820;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 7)
    public static void method373(byte arg0) {
        field815 = null;
        if (arg0 <= 90) {
            method382(73, 83, -114, -21, 8, (byte) 46, null);
        }
        field820 = null;
        field826 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z", line = 19)
    public final boolean method374(int arg0, int arg1) {
        field814++;
        if (arg0 != 797621697) {
            this.field817 = -13;
        }
        return (this.field823 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z", line = 30)
    public final boolean method375(int arg0) {
        field824++;
        int var2 = 32 % ((arg0 - 6) / 62);
        return (this.field823 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)I", line = 49)
    public final int method376(int arg0) {
        field825++;
        if (arg0 != 1) {
            method382(47, -44, 111, -121, 54, (byte) 122, null);
        }
        return class28.method139(0, this.field823);
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I", line = 61)
    public final int method377(int arg0) {
        if (arg0 == 18881) {
            field816++;
            return this.field823 >> 18 & 0x7;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 72)
    public static final void method378(String arg0, int arg1) {
        field819++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class290.method1768(arg0, false);
        if (arg1 <= 126) {
            method382(-1, 39, 2, -82, -120, (byte) 105, null);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class170.field2651; var3++) {
            String var4 = class107.field1868[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class290.method1768(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class170.field2651--;
                for (int var6 = var3; var6 < class170.field2651; var6++) {
                    class107.field1868[var6] = class107.field1868[var6 + 1];
                    class373.field5453[var6] = class373.field5453[var6 + 1];
                    class178.field2791[var6] = class178.field2791[var6 + 1];
                    class241.field3635[var6] = class241.field3635[var6 + 1];
                    class298.field4528[var6] = class298.field4528[var6 + 1];
                }
                class153.field2448 = class298.field4515;
                class191.field3038++;
                class400.method2379((byte) -75, class110.field1894);
                class230.field3508.method221(-1, class220.method1343(arg0, (byte) -82));
                class230.field3508.method240(arg0, 126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILtq;)Z", line = 138)
    public static final boolean method379(int arg0, class427 arg1) {
        field821++;
        if (class157.field2471 == arg1.field6187) {
            class39.field524 = 250;
            return true;
        } else {
            if (arg0 > -16) {
                field826 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z", line = 158)
    public final boolean method380(byte arg0) {
        if (arg0 != -82) {
            this.field817 = 62;
        }
        field812++;
        return (this.field823 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V", line = 170)
    public class54(int arg0, int arg1) {
        this.field817 = arg1;
        this.field823 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)Z", line = 179)
    public final boolean method381(int arg0) {
        if (arg0 != -4551) {
            method378(null, 44);
        }
        field822++;
        return ((this.field823 & 0x6FEC14) >> 22) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIB[B)Z", line = 191)
    public static final boolean method382(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6) {
        field818++;
        int var7 = arg1 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg0 + arg4 - 1) / arg4);
        int var10 = -((arg1 + arg4 - 1) / arg4);
        if (arg5 != 56) {
            method379(-74, null);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg3] == 0) {
                    return true;
                }
                arg3 += arg4;
            }
            int var13 = arg3 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg2 + var13;
        }
        return false;
    }
}
