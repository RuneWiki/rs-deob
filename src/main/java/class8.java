import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 {

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Z")
    public boolean field247 = true;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lhe;")
    public static class54 field228 = class6.method58("(U0a )2 non)2existant gosub script)2num: ", false);

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Lhe;")
    public static class54 field231 = class6.method58("Ihr Charakter)2Profil wird in:", false);

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lhe;")
    public static class54 field246 = null;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field245 = 50;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    public static int[] field226 = new int[field245];

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
    public static int[] field233 = new int[field245];

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[Lhe;")
    public static class54[] field239 = new class54[field245];

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
    public static int[] field236 = new int[field245];

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
    public static int[] field242 = new int[field245];

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field248 = 50;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[I")
    public static int[] field237 = new int[field245];

    @OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
    public static int[] field250 = new int[field245];

    @OriginalMember(owner = "client!b", name = "j", descriptor = "[I")
    public static int[] field232 = new int[field245];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "[S")
    public static short[] field229;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(JB)V")
    public static final void method66(long arg0, byte arg1) {
        field241++;
        if (arg0 == 0L || arg1 != 68) {
            return;
        }
        for (int var3 = 0; var3 < class158.field3609; var3++) {
            if (class129.field2920[var3] == arg0) {
                class158.field3609--;
                for (int var4 = var3; var4 < class158.field3609; var4++) {
                    class40.field1054[var4] = class40.field1054[var4 + 1];
                    class94.field2368[var4] = class94.field2368[var4 + 1];
                    class129.field2920[var4] = class129.field2920[var4 + 1];
                    class66.field1583[var4] = class66.field1583[var4 + 1];
                }
                class121.field2803++;
                class3.field60 = class84.field2084;
                class131.field2969.method454(133, -38);
                class131.field2969.method677(189354448, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lhe;Z)V")
    public static final void method67(class54 arg0, boolean arg1) {
        field223++;
        if (class28.field755 >= 2) {
            if (arg0.method397(class132.field2985, (byte) -105)) {
                System.gc();
            }
            if (arg0.method397(class57.field1440, (byte) -105)) {
                class18.method156(-1);
            }
            if (arg0.method397(class40.field1047, (byte) -105)) {
                class75.field1863 = true;
            }
            if (arg0.method397(class62.field1512, (byte) -105)) {
                class75.field1863 = false;
            }
            if (arg0.method397(class12.field329, (byte) -105)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class111.field2652[var2].field117[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method397(class134.field3048, (byte) -105) && class19.field543 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method387(class147.field3325, (byte) -95)) {
                class102.field2546 = arg0.method384(12, 86).method394(126).method383((byte) -128);
                class80.method612(class143.method1105(new class54[] { class32.field831, class147.method1117(-41, class102.field2546) }, -842), null, (byte) 118, 0);
            }
            if (arg0.method397(class48.field1158, (byte) -105)) {
                class31.field804 = true;
            }
        }
        if (arg1) {
            method69((byte) 55, -24);
        }
        class120.field2785++;
        class131.field2969.method454(165, 117);
        class131.field2969.method649((byte) -27, arg0.method404(-97) - 1);
        class131.field2969.method681(arg0.method384(2, 96), 18601);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method68(int arg0) {
        field229 = null;
        field237 = null;
        field246 = null;
        field228 = null;
        field233 = null;
        field236 = null;
        field250 = null;
        field226 = null;
        field242 = null;
        field231 = null;
        field239 = null;
        field232 = null;
        if (arg0 != 0) {
            method69((byte) 10, -47);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)Z")
    public static final boolean method69(byte arg0, int arg1) {
        field243++;
        if (arg0 != -108) {
            method68(-121);
        }
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILef;Lef;)V")
    public static final void method70(int arg0, class35 arg1, class35 arg2) {
        class130.field2932 = arg2;
        class1.field21 = arg1;
        if (arg0 <= 51) {
            method67(null, false);
        }
        field238++;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field235 = arg1;
        this.field249 = arg3;
        this.field230 = arg2;
        this.field247 = arg6;
        this.field224 = arg4;
        this.field244 = arg5;
        this.field225 = arg0;
    }
}
