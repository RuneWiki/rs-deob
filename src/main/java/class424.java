import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class424 extends class179 {

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
    public int[] field6082;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "[I")
    public int[] field6088;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[[I")
    public int[][] field6080;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[Z")
    public boolean[] field6084;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Loe;")
    public static class127 field6081 = new class127(59, 12);

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lsk;")
    public static class423 field6090;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field6087;

    static {
        new class423("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field6090 = new class423("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V", line = 3)
    public static final void method2492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= class355.field5296 && arg4 <= class320.field4818 && class355.field5296 <= arg6 && arg6 <= class320.field4818 && arg2 >= class355.field5296 && arg2 <= class320.field4818 && class355.field5296 <= arg9 && arg9 <= class320.field4818 && arg0 >= class248.field3808 && arg0 <= class478.field7310 && class248.field3808 <= arg1 && class478.field7310 >= arg1 && arg3 >= class248.field3808 && class478.field7310 >= arg3 && arg7 >= class248.field3808 && class478.field7310 >= arg7) {
            class158.method1012(arg1, arg9, arg4, arg7, arg2, arg5, arg6, arg0, arg3, -9499);
        } else {
            class334.method2075(arg1, arg9, arg3, arg5, arg6, arg7, (byte) -32, arg4, arg2, arg0);
        }
        field6085++;
        if (arg8 != 1) {
            field6090 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIJIIIZLjava/lang/String;ZLjava/lang/String;Z)V", line = 25)
    public static final void method2493(int arg0, int arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6, String arg7, boolean arg8, String arg9, boolean arg10) {
        field6087++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class40 var14 = new class40(128);
        var14.method221(-1, 10);
        var14.method246((byte) -105, (arg6 ? 4 : 0) | (arg10 ? 1 : 0) | (arg8 ? 2 : 0));
        var14.method261((byte) 98, arg2);
        var14.method253(-72, var12[0]);
        var14.method240(arg7, 123);
        var14.method253(-75, var12[1]);
        var14.method246((byte) -87, class90.field1620);
        var14.method221(-1, arg1);
        var14.method221(-1, arg5);
        var14.method253(-122, var12[2]);
        var14.method246((byte) -80, arg0);
        var14.method246((byte) -49, arg3);
        var14.method253(-111, var12[3]);
        var14.method233(class295.field4486, (byte) 107, class378.field5534);
        class40 var15 = new class40(350);
        var15.method240(arg9, 124);
        int var16 = 8 - (class220.method1343(arg9, (byte) -82) % 8);
        if (arg4 <= 4) {
            return;
        }
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method221(-1, (int) (Math.random() * 255.0D));
        }
        var15.method222((byte) -45, var12);
        class230.field3508.field585 = 0;
        class230.field3508.method221(-1, class247.field3794.field3849);
        class230.field3508.method246((byte) -51, var14.field585 + var15.field585 + 2);
        class230.field3508.method246((byte) -30, 581);
        class230.field3508.method281(var14.field585, var14.field536, 0, 44);
        class230.field3508.method281(var15.field585, var15.field536, 0, 97);
        class407.field5909 = -3;
        class284.field4292 = 0;
        class74.field1320 = 1;
        class390.field5712 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 83)
    public static void method2494(int arg0) {
        field6090 = null;
        if (arg0 != 59) {
            method2494(94);
        }
        field6081 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[B)[B", line = 97)
    public static final byte[] method2495(byte arg0, byte[] arg1) {
        field6086++;
        class40 var2 = new class40(arg1);
        int var3 = var2.method257((byte) 81);
        int var4 = var2.method255((byte) 96);
        if (var4 < 0 || !(class254.field3882 == 0 || class254.field3882 >= var4)) {
            throw new RuntimeException();
        }
        if (arg0 != 35) {
            field6090 = null;
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method273(0, 49152, var5, var4);
            return var5;
        }
        int var6 = var2.method255((byte) 96);
        if (var6 < 0 || !(class254.field3882 == 0 || class254.field3882 >= var6)) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class259.method1555(var7, var6, arg1, var4, 9);
        } else {
            class160.field2523.method2892(var7, 116, var2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[B)V", line = 162)
    public class424(int arg0, byte[] arg1) {
        this.field6083 = arg0;
        class40 var3 = new class40(arg1);
        this.field6089 = var3.method257((byte) 48);
        this.field6082 = new int[this.field6089];
        this.field6088 = new int[this.field6089];
        this.field6080 = new int[this.field6089][];
        this.field6084 = new boolean[this.field6089];
        for (int var4 = 0; var4 < this.field6089; var4++) {
            this.field6088[var4] = var3.method257((byte) 26);
        }
        for (int var5 = 0; var5 < this.field6089; var5++) {
            this.field6084[var5] = var3.method257((byte) 113) == 1;
        }
        for (int var6 = 0; var6 < this.field6089; var6++) {
            this.field6082[var6] = var3.method254((byte) -95);
        }
        for (int var7 = 0; var7 < this.field6089; var7++) {
            this.field6080[var7] = new int[var3.method257((byte) 46)];
        }
        for (int var8 = 0; var8 < this.field6089; var8++) {
            for (int var9 = 0; var9 < this.field6080[var8].length; var9++) {
                this.field6080[var8][var9] = var3.method257((byte) 108);
            }
        }
    }
}
