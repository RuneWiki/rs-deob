import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class245 {

    @OriginalMember(owner = "client!uha", name = "m", descriptor = "Z")
    public boolean field3549 = false;

    @OriginalMember(owner = "client!uha", name = "h", descriptor = "Ljr;")
    private class112 field3544 = new class112(64);

    @OriginalMember(owner = "client!uha", name = "r", descriptor = "Ljr;")
    public class112 field3554 = new class112(500);

    @OriginalMember(owner = "client!uha", name = "s", descriptor = "Ljr;")
    public class112 field3555 = new class112(30);

    @OriginalMember(owner = "client!uha", name = "t", descriptor = "Ljr;")
    public class112 field3556 = new class112(50);

    @OriginalMember(owner = "client!uha", name = "q", descriptor = "Z")
    public boolean field3553;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "Lin;")
    public class91 field3539;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "Lin;")
    private class91 field3537;

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "[I")
    public static int[] field3541 = new int[1000];

    @OriginalMember(owner = "client!uha", name = "j", descriptor = "[C")
    private static char[] field3546 = new char[64];

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!uha", name = "i", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!uha", name = "k", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!uha", name = "l", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!uha", name = "n", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!uha", name = "o", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!uha", name = "p", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
    public int field3557;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3546[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3546[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3546[var2] = (char) (var2 + 48 - 52);
        }
        field3546[62] = '+';
        field3546[63] = '/';
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method1679(boolean arg0, byte arg1) {
        field3540++;
        if (arg0 == this.field3553) {
            return;
        }
        this.field3553 = arg0;
        if (arg1 != 25) {
            this.field3544 = null;
        }
        this.method1687(arg1 - 23853);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)Liv;", line = 20)
    public final class99 method1680(int arg0, int arg1) {
        field3545++;
        class112 var3 = this.field3544;
        class99 var4;
        synchronized (this.field3544) {
            var4 = (class99) this.field3544.method992((long) arg1, arg0 ^ 0x32);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field3537;
        byte[] var6;
        synchronized (this.field3537) {
            var6 = this.field3537.method863(arg0 - 1860, class123.method1056(arg1, 111), class311.method2024(arg1, (byte) -90));
        }
        class99 var7 = new class99();
        var7.field1776 = arg1;
        var7.field1768 = this;
        if (var6 != null) {
            var7.method924((byte) 0, new class215(var6));
        }
        var7.method933(-105);
        if (arg0 != 0) {
            this.field3555 = null;
        }
        if (!this.field3553 && var7.field1777) {
            var7.field1752 = null;
            var7.field1748 = null;
        }
        if (var7.field1711) {
            var7.field1755 = 0;
            var7.field1731 = false;
        }
        class112 var8 = this.field3544;
        synchronized (this.field3544) {
            this.field3544.method991(var7, (long) arg1, (byte) -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V", line = 69)
    public final void method1681(int arg0) {
        if (arg0 < 68) {
            return;
        }
        field3547++;
        class112 var2 = this.field3544;
        synchronized (this.field3544) {
            this.field3544.method996(-106);
        }
        class112 var3 = this.field3554;
        synchronized (this.field3554) {
            this.field3554.method996(-125);
        }
        class112 var4 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method996(-122);
        }
        class112 var5 = this.field3556;
        synchronized (this.field3556) {
            this.field3556.method996(-101);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIILfe;IIIIIII)Z", line = 91)
    public static final boolean method1682(int arg0, int arg1, int arg2, class570 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3548++;
        int var11 = arg9;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        int var16 = arg5 - var14;
        class184.field2786[var13][var14] = 99;
        if (arg1 >= -27) {
            method1686((byte) 103);
        }
        class426.field6133[var13][var14] = 0;
        byte var17 = 0;
        class641.field8811[var17] = arg9;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class201.field2919[var10001] = arg5;
        int[][] var19 = arg3.field7832;
        while (var26 != var18) {
            var12 = class201.field2919[var18];
            var11 = class641.field8811[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg3.field7847;
            int var23 = var12 - arg3.field7835;
            if (arg0 == -4) {
                if (arg4 == var11 && arg2 == var12) {
                    class443.field6294 = var11;
                    class375.field5309 = var12;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class555.method3192(arg6, arg2, -1, 2, var11, var12, arg4, 2, arg7)) {
                    class375.field5309 = var12;
                    class443.field6294 = var11;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg3.method3295(-28388, arg4, arg8, 2, arg7, var11, 2, var12, arg2, arg6)) {
                    class443.field6294 = var11;
                    class375.field5309 = var12;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg3.method3301(var11, (byte) -82, arg2, 2, arg7, arg6, arg8, var12, arg4)) {
                    class443.field6294 = var11;
                    class375.field5309 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg3.method3293(arg4, var12, 2, arg10, var11, arg2, arg0, -53)) {
                    class443.field6294 = var11;
                    class375.field5309 = var12;
                    return true;
                }
            } else if (arg3.method3302(arg2, var12, arg4, var11, arg0, 1, arg10, 2)) {
                class443.field6294 = var11;
                class375.field5309 = var12;
                return true;
            }
            int var25 = class426.field6133[var20][var21] + 1;
            if (var20 > 0 && class184.field2786[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class641.field8811[var26] = var11 - 1;
                class201.field2919[var26] = var12;
                class184.field2786[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class426.field6133[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class184.field2786[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class641.field8811[var26] = var11 + 1;
                class201.field2919[var26] = var12;
                class184.field2786[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class426.field6133[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class184.field2786[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class641.field8811[var26] = var11;
                class201.field2919[var26] = var12 - 1;
                class184.field2786[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class426.field6133[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class184.field2786[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class641.field8811[var26] = var11;
                class201.field2919[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class184.field2786[var20][var21 + 1] = 4;
                class426.field6133[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class184.field2786[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class641.field8811[var26] = var11 - 1;
                class201.field2919[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class184.field2786[var20 - 1][var21 - 1] = 3;
                class426.field6133[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class184.field2786[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class641.field8811[var26] = var11 + 1;
                class201.field2919[var26] = var12 - 1;
                class184.field2786[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class426.field6133[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class184.field2786[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class641.field8811[var26] = var11 - 1;
                class201.field2919[var26] = var12 + 1;
                class184.field2786[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class426.field6133[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class184.field2786[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class641.field8811[var26] = var11 + 1;
                class201.field2919[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class184.field2786[var20 + 1][var21 + 1] = 12;
                class426.field6133[var20 + 1][var21 + 1] = var25;
            }
        }
        class443.field6294 = var11;
        class375.field5309 = var12;
        return false;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IZ)V", line = 445)
    public final void method1683(int arg0, boolean arg1) {
        field3538++;
        if (this.field3549 == arg1) {
            return;
        }
        this.field3549 = arg1;
        if (arg0 >= -27) {
            this.field3555 = null;
        }
        this.method1687(-23828);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IB)V", line = 461)
    public final void method1684(int arg0, byte arg1) {
        this.field3557 = arg0;
        field3542++;
        class112 var3 = this.field3554;
        synchronized (this.field3554) {
            this.field3554.method999(0);
        }
        class112 var4 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method999(0);
        }
        if (arg1 < 94) {
            field3541 = null;
        }
        class112 var5 = this.field3556;
        synchronized (this.field3556) {
            this.field3556.method999(0);
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)V", line = 485)
    public final void method1685(int arg0, int arg1) {
        field3543++;
        class112 var3 = this.field3544;
        synchronized (this.field3544) {
            this.field3544.method987(2, arg0);
        }
        class112 var4 = this.field3554;
        synchronized (this.field3554) {
            this.field3554.method987(arg1 ^ 0xFFFFFFFD, arg0);
        }
        class112 var5 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method987(arg1 ^ 0xFFFFFFFD, arg0);
        }
        class112 var6 = this.field3556;
        synchronized (this.field3556) {
            this.field3556.method987(2, arg0);
            if (arg1 != -1) {
                method1688(null, (byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V", line = 512)
    public static void method1686(byte arg0) {
        field3541 = null;
        if (arg0 > -19) {
            field3546 = null;
        }
        field3546 = null;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V", line = 523)
    public final void method1687(int arg0) {
        class112 var2 = this.field3544;
        synchronized (this.field3544) {
            this.field3544.method999(0);
        }
        field3550++;
        class112 var3 = this.field3554;
        synchronized (this.field3554) {
            this.field3554.method999(arg0 ^ arg0);
        }
        class112 var4 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method999(0);
        }
        class112 var5 = this.field3556;
        synchronized (this.field3556) {
            this.field3556.method999(0);
        }
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lsj;IZLin;Lin;)V", line = 684)
    public class245(class460 arg0, int arg1, boolean arg2, class91 arg3, class91 arg4) {
        this.field3553 = arg2;
        this.field3539 = arg4;
        this.field3537 = arg3;
        if (this.field3537 != null) {
            int var6 = this.field3537.method867(-1) - 1;
            this.field3537.method860(0, var6);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "([BB)V", line = 557)
    public static final void method1688(byte[] arg0, byte arg1) {
        if (arg1 != 112) {
            method1682(84, 119, -100, null, 92, -110, 96, 62, 31, 11, 62);
        }
        field3551++;
        class215 var2 = new class215(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var3 = var2.method1535(255);
                    if (var3 == 0) {
                        return;
                    }
                    if (var3 == 1) {
                        int[] var8 = class542.field7485 = new int[6];
                        var8[0] = var2.method1478(arg1 + 842397832);
                        var8[1] = var2.method1478(arg1 + 842397832);
                        var8[2] = var2.method1478(842397944);
                        var8[3] = var2.method1478(842397944);
                        var8[4] = var2.method1478(842397944);
                        var8[5] = var2.method1478(842397944);
                    } else if (var3 == 4) {
                        int var4 = var2.method1535(255);
                        class274.field3857 = new int[var4];
                        for (int var5 = 0; var5 < var4; var5++) {
                            class274.field3857[var5] = var2.method1478(842397944);
                            if (class274.field3857[var5] == 65535) {
                                class274.field3857[var5] = -1;
                            }
                        }
                    } else if (var3 == 5) {
                        int var6 = var2.method1535(255);
                        class442.field6281 = new int[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            class442.field6281[var7] = var2.method1478(842397944);
                            if (class442.field6281[var7] == 65535) {
                                class442.field6281[var7] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(IZ)V", line = 636)
    public final void method1689(int arg0, boolean arg1) {
        this.field3544 = new class112(arg0);
        field3552++;
        if (!arg1) {
            this.field3556 = null;
        }
    }
}
