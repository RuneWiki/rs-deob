import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class380 {

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Ljava/lang/String;")
    private String field5781 = "null";

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "Lla;")
    public static class319 field5791;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "Lla;")
    public static class319 field5792;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "C")
    public char field5775;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "C")
    public char field5780;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    private int field5788;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Llp;")
    public class272 field5782;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "Llp;")
    private class272 field5786;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Z")
    public final boolean method2378(int arg0, int arg1) {
        field5784++;
        if (this.field5782 == null) {
            return false;
        }
        if (this.field5786 == null) {
            this.method2388(false);
        }
        class160 var3 = (class160) this.field5786.method1747((long) arg0, false);
        if (arg1 != -18233) {
            this.field5780 = (char) 65443;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method2379(String arg0, boolean arg1) {
        field5776++;
        if (this.field5782 == null) {
            return false;
        }
        if (this.field5786 == null) {
            this.method2383(72);
        }
        if (!arg1) {
            return false;
        }
        for (class383 var3 = (class383) this.field5786.method1747(class159.method1035(arg0, 21879), false); var3 != null; var3 = (class383) this.field5786.method1748(0)) {
            if (var3.field5828.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIBI)V")
    public static final void method2380(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            class291.field4256++;
            class424.method2582(class120.field1648, -1);
        }
        field5778++;
        if (arg3 == 1) {
            class410.field6220++;
            class424.method2582(class2.field11, -1);
        }
        class538.field7879.method1114(class328.field5099 + arg0, 98);
        class538.field7879.method1068(arg2 ^ 0xFFFFFF96, arg1 + class331.field5162);
        if (arg2 != -37) {
            method2385((byte) 66);
        }
        class538.field7879.method1081(class35.field515.method1970(true, 82) ? 1 : 0, arg2 - 75);
        class75.field1103 = arg1;
        class309.field4501 = arg0;
        class176.field2357 = false;
        class48.method374((byte) -76);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2381(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5785++;
        if (!arg0) {
            method2381(false, 99, 35, 22, 48, 35);
        }
        int var6 = class33.method289(261104, class463.field6924, class369.field5628, arg1);
        int var7 = class33.method289(261104, class463.field6924, class369.field5628, arg3);
        int var8 = class33.method289(261104, class377.field5760, class49.field701, arg2);
        int var9 = class33.method289(261104, class377.field5760, class49.field701, arg4);
        for (int var10 = var6; var10 <= var7; var10++) {
            class221.method1489(class466.field6955[var10], var8, var9, (byte) -30, arg5);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILnj;)V")
    public final void method2382(int arg0, class164 arg1) {
        if (arg0 != -9196) {
            method2385((byte) -68);
        }
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                field5790++;
                return;
            }
            this.method2384(var3, 472657122, arg1);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    private final void method2383(int arg0) {
        field5783++;
        this.field5786 = new class272(this.field5782.method1744(-120));
        if (arg0 != 72) {
            this.method2379(null, true);
        }
        for (class344 var2 = (class344) this.field5782.method1743(false); var2 != null; var2 = (class344) this.field5782.method1742(arg0 - 84)) {
            class383 var3 = new class383(var2.field5312, (int) var2.field35);
            this.field5786.method1751(class159.method1035(var2.field5312, 21879), arg0 - 197, var3);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILnj;)V")
    private final void method2384(int arg0, int arg1, class164 arg2) {
        field5787++;
        if (arg0 == 1) {
            this.field5775 = class165.method1122((byte) -84, arg2.method1088((byte) -112));
        } else if (arg0 == 2) {
            this.field5780 = class165.method1122((byte) -68, arg2.method1088((byte) -98));
        } else if (arg0 == 3) {
            this.field5781 = arg2.method1064(false);
        } else if (arg0 == 4) {
            this.field5788 = arg2.method1099(-126);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1074(-635989152);
            this.field5782 = new class272(class475.method2835(var4, -1));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1099(126);
                class5 var7;
                if (arg0 == 5) {
                    var7 = new class344(arg2.method1064(false));
                } else {
                    var7 = new class160(arg2.method1099(arg1 ^ 0x1C2C2CAB));
                }
                this.field5782.method1751((long) var6, -123, var7);
            }
        }
        if (arg1 != 472657122) {
            method2381(false, -85, -68, -54, -89, 96);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public static void method2385(byte arg0) {
        int var1 = 2 / ((-arg0 - 63) / 32);
        field5791 = null;
        field5792 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ldq;I)[Lsd;")
    public static final class62[] method2386(class500 arg0, int arg1) {
        if (arg1 != 3) {
            field5792 = null;
        }
        field5774++;
        if (!arg0.method2983((byte) 12)) {
            return new class62[0];
        }
        class234 var2 = arg0.method2995(false);
        while (var2.field3322 == 0) {
            class388.method2433(10L, 108);
        }
        if (var2.field3322 == 2) {
            return new class62[0];
        }
        int[] var3 = (int[]) var2.field3324;
        class62[] var4 = new class62[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class62 var6 = new class62();
            var4[var5] = var6;
            var6.field886 = var3[var5 << 2];
            var6.field887 = var3[(var5 << 2) + 1];
            var6.field889 = var3[(var5 << 2) + 2];
            var6.field884 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)I")
    public final int method2387(boolean arg0, int arg1) {
        field5789++;
        if (!arg0) {
            field5792 = null;
        }
        if (this.field5782 == null) {
            return this.field5788;
        } else {
            class160 var3 = (class160) this.field5782.method1747((long) arg1, false);
            return var3 == null ? this.field5788 : var3.field2088;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
    private final void method2388(boolean arg0) {
        field5779++;
        this.field5786 = new class272(this.field5782.method1744(28));
        for (class160 var2 = (class160) this.field5782.method1743(arg0); var2 != null; var2 = (class160) this.field5782.method1742(123)) {
            class160 var3 = new class160((int) var2.field35);
            this.field5786.method1751((long) var2.field2088, -91, var3);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method2389(boolean arg0, int arg1) {
        field5777++;
        if (this.field5782 == null) {
            return this.field5781;
        }
        if (!arg0) {
            this.field5788 = 96;
        }
        class344 var3 = (class344) this.field5782.method1747((long) arg1, !arg0);
        return var3 == null ? this.field5781 : var3.field5312;
    }

    static {
        new class446("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field5791 = new class319(72, 28);
        field5793 = 0;
        field5792 = new class319(33, 6);
    }
}
