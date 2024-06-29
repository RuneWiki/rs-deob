import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class193 {

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "B")
    public byte field2770 = 0;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "S")
    public short field2766;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "S")
    public short field2765;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "B")
    public byte field2777;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "B")
    public byte field2789;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Liq;")
    public static class362 field2764 = new class362("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "Liq;")
    public static class362 field2791 = new class362("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Liq;")
    public static class362 field2794 = new class362("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "B")
    public byte field2768;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "B")
    public byte field2778;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "B")
    public byte field2783;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "B")
    public byte field2797;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Lak;")
    public class193 field2773;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Loj;")
    public class212 field2769;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Lrp;")
    public class250 field2779;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lmj;")
    public class394 field2771;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lmj;")
    public class394 field2784;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "Lkl;")
    public class46 field2790;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Ltn;")
    public class48 field2786;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "Ltn;")
    public class48 field2788;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Lgm;")
    public class63 field2785;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "S")
    public short field2776;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Z")
    public boolean field2782;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "Z")
    public boolean field2795;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Z")
    public boolean field2796;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[[B")
    public static byte[][] field2798;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[[I")
    public static int[][] field2775;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
    public static final void method1305(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2781++;
        int var5 = arg0;
        int var6 = arg3;
        int var7 = -arg3;
        class296.method1954(arg1, arg4 + arg3, class291.field4067[arg2], arg4 - arg3, -1);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class291.field4067[arg2 + var6];
                int[] var10 = class291.field4067[arg2 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class296.method1954(arg1, var11, var9, var12, -1);
                class296.method1954(arg1, var11, var10, var12, -1);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class291.field4067[arg2 + var5];
            int[] var16 = class291.field4067[arg2 - var5];
            class296.method1954(arg1, var13, var15, var14, -1);
            class296.method1954(arg1, var13, var16, var14, -1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
    public class193(int arg0, int arg1, int arg2) {
        this.field2766 = (short) arg2;
        this.field2765 = (short) arg1;
        this.field2789 = this.field2777 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method1306(byte arg0) {
        field2767++;
        while (this.field2779 != null) {
            class250 var3 = this.field2779.field3568;
            this.field2779.method1700(9);
            this.field2779 = var3;
        }
        int var2 = 102 / ((-arg0 - 1) / 59);
        this.field2770 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static final void method1307(boolean arg0) {
        field2780++;
        class35.field405 = -1;
        class295.field4112 = null;
        if (arg0) {
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lfo;")
    public static final class303 method1308(int arg0, int arg1) {
        int var2 = -64 % ((34 - arg0) / 33);
        field2763++;
        class303 var3 = (class303) class327.field4640.method856((long) arg1, (byte) 123);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = class99.field1211.method2431((byte) 84, 1, arg1);
        } else {
            var4 = class288.field4045.method2431((byte) 77, 1, arg1 & 0x7FFF);
        }
        class303 var5 = new class303();
        if (var4 != null) {
            var5.method2002(new class236(var4), (byte) 31);
        }
        if (arg1 >= 32768) {
            var5.method2000(-1);
        }
        class327.field4640.method849((byte) 63, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method1309(int arg0) {
        field2791 = null;
        field2775 = null;
        field2794 = null;
        field2798 = null;
        if (arg0 == -58) {
            field2764 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1310(String arg0, byte arg1) {
        field2792++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 < 111) {
            return 33L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZLtq;Ltq;)V")
    public static final void method1311(int arg0, int arg1, boolean arg2, class376 arg3, class376 arg4) {
        class334.field4726 = arg1;
        field2774++;
        if (arg0 != 9330) {
            field2798 = null;
        }
        class215.field3044 = arg3;
        class279.field3949 = arg4;
        class435.field6250 = arg2;
        int var5 = class279.field3949.method2432(true) - 1;
        class237.field3379 = var5 * 256 + class279.field3949.method2415(var5, (byte) 56);
        class1.field5 = new String[] { null, null, class313.field4416.method2331(25, class334.field4726), null, null };
        class203.field2910 = new String[] { null, null, null, null, class126.field1536.method2331(25, class334.field4726) };
    }

    static {
        new class362("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
