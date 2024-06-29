import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class229 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lco;")
    private class210 field3169 = new class210(64);

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lco;")
    private class210 field3179 = new class210(100);

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lg;")
    private class470 field3178;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lec;")
    public static class40 field3175 = new class40("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lsd;")
    public static class74 field3177;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lec;")
    public static class40 field3181;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field3176;

    static {
        new class40("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field3180 = 0;
        field3177 = new class74(79, -1);
        field3181 = new class40("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1262(int arg0, byte arg1) {
        field3173++;
        class210 var3 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method1166(arg0, (byte) -52);
        }
        class210 var4 = this.field3179;
        synchronized (this.field3179) {
            this.field3179.method1166(arg0, (byte) -52);
        }
        if (arg1 != 23) {
            this.method1262(28, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1263(int arg0) {
        class413.field5890++;
        if (arg0 != 1) {
            method1268((class280) null, (class78) null, -51, 62, -48, 75, 43);
        }
        field3170++;
        class244.method1332((byte) -35, class292.field4347);
        class230.field3185.method884(class315.field4613, true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 34)
    public static void method1264(byte arg0) {
        field3177 = null;
        field3181 = null;
        field3175 = null;
        if (arg0 < 79) {
            field3175 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Ljj;", line = 48)
    public final class170 method1265(int arg0, int arg1) {
        field3171++;
        class210 var3 = this.field3179;
        class170 var4;
        synchronized (this.field3179) {
            var4 = (class170) this.field3179.method1163((byte) 121, (long) arg0);
            if (arg1 != -8990) {
                field3181 = null;
            }
            if (var4 == null) {
                var4 = new class170(arg0);
                this.field3179.method1172((long) arg0, 1, var4);
            }
        }
        synchronized (var4) {
            return var4.method830(arg1 ^ 0xFFFFDC84) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 84)
    public final void method1266(int arg0) {
        class210 var2 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method1169(1076);
        }
        field3172++;
        class210 var3 = this.field3179;
        synchronized (this.field3179) {
            int var4 = -82 % ((arg0 + 33) / 61);
            this.field3179.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Lhu;", line = 99)
    public final class207 method1267(int arg0, int arg1) {
        field3174++;
        class210 var3 = this.field3169;
        class207 var4;
        synchronized (this.field3169) {
            var4 = (class207) this.field3169.method1163((byte) 123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3178.method2768(-20472, class46.method246(14, arg1), class248.method1511(arg1, (byte) 127));
        class207 var6 = new class207();
        var6.field2842 = this;
        if (arg0 > -20) {
            method1264((byte) -109);
        }
        var6.field2838 = arg1;
        if (var5 != null) {
            var6.method1147(new class179(var5), (byte) -32);
        }
        var6.method1146(2);
        class210 var7 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method1172((long) arg1, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Loj;La;IIIII)V", line = 135)
    public static final void method1268(class280 arg0, class78 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class346.field4937 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class176.field2122) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class225.field3116 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class263 var15 = class293.field4356[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class398.field5667[var12].method1861(var13, var14) + class398.field5667[var12].method1861(var13 + 1, var14) + class398.field5667[var12].method1861(var13, var14 + 1) + class398.field5667[var12].method1861(var13 + 1, var14 + 1)) / 4 - (class398.field5667[arg2].method1861(arg3, arg4) + class398.field5667[arg2].method1861(arg3 + 1, arg4) + class398.field5667[arg2].method1861(arg3, arg4 + 1) + class398.field5667[arg2].method1861(arg3 + 1, arg4 + 1)) / 4;
                                    class261 var17 = var15.field3783;
                                    class261 var18 = var15.field3780;
                                    if (var17 != null && var17.method33(1957)) {
                                        arg1.method23((var13 - arg3) * class200.field2777 + (1 - arg5) * class137.field1663, var16, var7, var17, (var14 - arg4) * class200.field2777 + (1 - arg6) * class137.field1663, (byte) -65, arg0);
                                    }
                                    if (var18 != null && var18.method33(1957)) {
                                        arg1.method23((var13 - arg3) * class200.field2777 + (1 - arg5) * class137.field1663, var16, var7, var18, (var14 - arg4) * class200.field2777 + (1 - arg6) * class137.field1663, (byte) -65, arg0);
                                    }
                                    for (class248 var19 = var15.field3801; var19 != null; var19 = var19.field3490) {
                                        class83 var20 = var19.field3487;
                                        if (var20 != null && var20.method33(1957) && (var20.field999 == var13 || var8 == var13) && (var20.field1004 == var14 || var10 == var14)) {
                                            int var21 = var20.field1011 + 1 - var20.field999;
                                            int var22 = var20.field997 + 1 - var20.field1004;
                                            arg1.method23((var20.field999 - arg3) * class200.field2777 + (var21 - arg5) * class137.field1663, var16, var7, var20, (var20.field1004 - arg4) * class200.field2777 + (var22 - arg6) * class137.field1663, (byte) -65, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V", line = 225)
    public static final void method1269(byte arg0, int arg1, int arg2) {
        field3168++;
        class89 var3 = class146.method695(16, arg2, (byte) -91);
        int var4 = -45 / ((arg0 - 73) / 32);
        var3.method449(true);
        var3.field1106 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 245)
    public final void method1270(byte arg0) {
        class210 var2 = this.field3169;
        synchronized (this.field3169) {
            this.field3169.method1165((byte) 118);
        }
        field3176++;
        if (arg0 > -48) {
            this.field3169 = null;
        }
        class210 var3 = this.field3179;
        synchronized (this.field3179) {
            this.field3179.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lci;ILg;Lg;Lg;)V", line = 271)
    public class229(class421 arg0, int arg1, class470 arg2, class470 arg3, class470 arg4) {
        this.field3178 = arg2;
        if (this.field3178 != null) {
            int var6 = this.field3178.method2756(true) - 1;
            this.field3178.method2755(-110, var6);
        }
        class311.method1929(-256, arg4, arg3);
    }
}
