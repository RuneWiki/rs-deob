import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class204 extends class245 {

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    private int field2998;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Lh;")
    public static class572 field3005 = new class572("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3007 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lj;")
    public static class464 field3008;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Lj;")
    public static class464 field3010;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lj;")
    public static class464 field3011;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Lj;")
    public static class464 field3012;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Lj;")
    public static class464 field3013;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Lj;")
    public static class464 field3014;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "Lj;")
    public static class464 field3015;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Lj;")
    public static class464 field3016;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Lj;")
    public static class464 field3017;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Lj;")
    public static class464 field3018;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Lj;")
    public static class464 field3019;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lj;")
    public static class464 field3020;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Lj;")
    public static class464 field3021;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "Lj;")
    public static class464 field3022;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[Lj;")
    private static class464[] field3023;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "Lrn;")
    public static class226 field3024;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public static final int method1348(int arg0, int arg1) {
        ++field3002;
        if (arg1 != 2929) {
            method1349(-43);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIIII)V")
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3004 = arg3;
        this.field2998 = arg2;
        this.field3000 = arg1;
        this.field3001 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1349(int arg0) {
        field3018 = null;
        field3021 = null;
        field3014 = null;
        field3024 = null;
        field3010 = null;
        field3015 = null;
        field3008 = null;
        field3016 = null;
        field3022 = null;
        field3011 = null;
        field3019 = null;
        field3005 = null;
        if (arg0 != 22945) {
            method1348(81, 50);
        }
        field3023 = null;
        field3007 = null;
        field3020 = null;
        field3013 = null;
        field3012 = null;
        field3017 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)V")
    public final void method1350(int arg0, byte arg1, int arg2) {
        int var4 = 16 % ((-23 - arg1) / 57);
        ++field3006;
        int var5 = this.field3001 * arg2 >> 12;
        int var6 = this.field2998 * arg2 >> 12;
        int var7 = this.field3000 * arg0 >> 12;
        int var8 = this.field3004 * arg0 >> 12;
        class312.method1900(var7, super.field3527, super.field3526, super.field3529, var8, var5, var6, (byte) -81);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
    public final void method1351(int arg0, int arg1, int arg2) {
        ++field2999;
        int var4 = this.field3001 * arg2 >> 12;
        int var5 = this.field2998 * arg2 >> 12;
        if (arg1 == 0) {
            int var6 = this.field3000 * arg0 >> 12;
            int var7 = this.field3004 * arg0 >> 12;
            class14.method101(true, var6, super.field3529, var5, var7, super.field3527, var4);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)V")
    public final void method1352(byte arg0, int arg1, int arg2) {
        ++field3003;
        int var4 = 121 % ((arg0 - 43) / 54);
        int var5 = this.field3001 * arg1 >> 12;
        int var6 = this.field2998 * arg1 >> 12;
        int var7 = this.field3000 * arg2 >> 12;
        int var8 = this.field3004 * arg2 >> 12;
        class188.method1294(16, var8, var6, var5, var7, super.field3526);
    }

    static {
        new class572("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field3008 = new class464(14, 1);
        field3010 = new class464(15, 4);
        field3011 = new class464(16, -2);
        field3012 = new class464(17, 0);
        field3013 = new class464(18, -2);
        field3014 = new class464(19, -2);
        field3015 = new class464(20, 6);
        field3016 = new class464(21, 9);
        field3017 = new class464(22, -2);
        field3018 = new class464(23, 4);
        field3019 = new class464(24, -1);
        field3020 = new class464(25, -2);
        field3021 = new class464(26, 0);
        field3022 = new class464(27, 0);
        field3023 = new class464[32];
        class464[] var0 = class440.method2559((byte) 30);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field3023[var0[var1].field6526] = var0[var1];
        }
        field3024 = new class226();
    }
}
