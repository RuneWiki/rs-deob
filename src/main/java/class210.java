import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class210 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lff;")
    private class9 field2974 = new class9(64);

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field2981 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lvh;")
    private class240 field2972;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2971 = -1;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
    public static int[] field2975 = new int[14];

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lsi;")
    public static class391 field2984;

    static {
        new class83("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field2983 = -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)[Lub;", line = 3)
    public static final class18[] method1268(int arg0) {
        field2977++;
        if (arg0 <= 96) {
            field2982 = 16;
        }
        return new class18[] { class178.field2525, class320.field4430, class463.field6722 };
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 14)
    public static void method1269(byte arg0) {
        if (arg0 == 19) {
            field2984 = null;
            field2975 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 28)
    public final void method1270(byte arg0) {
        class9 var2 = this.field2974;
        synchronized (this.field2974) {
            if (arg0 > -78) {
                field2984 = null;
            }
            this.field2974.method67(91);
        }
        field2976++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 41)
    public final void method1271(int arg0) {
        if (arg0 != 0) {
            this.method1270((byte) 94);
        }
        class9 var2 = this.field2974;
        synchronized (this.field2974) {
            this.field2974.method65(false);
        }
        field2978++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lvq;", line = 62)
    public static final class320 method1272(int arg0, byte arg1) {
        field2979++;
        if (arg1 == -26) {
            return class510.field7494 && class407.field5643 <= arg0 && arg0 <= class14.field171 ? class377.field5317[arg0 - class407.field5643] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IB)Lmv;", line = 78)
    public final class252 method1273(int arg0, byte arg1) {
        field2969++;
        class9 var3 = this.field2974;
        class252 var4;
        synchronized (this.field2974) {
            var4 = (class252) this.field2974.method56((long) arg0, 72);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2972.method1411(true, arg0, 4);
        class252 var6 = new class252();
        var6.field3497 = arg0;
        var6.field3501 = this;
        if (var5 != null) {
            var6.method1481(new class365(var5), true);
        }
        var6.method1482(7818);
        class9 var7 = this.field2974;
        synchronized (this.field2974) {
            this.field2974.method73((long) arg0, var6, 26425);
        }
        if (arg1 < 93) {
            this.method1270((byte) 125);
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V", line = 111)
    public final void method1274(byte arg0, int arg1) {
        if (arg0 != -18) {
            field2975 = null;
        }
        field2973++;
        class9 var3 = this.field2974;
        synchronized (this.field2974) {
            this.field2974.method61((byte) -67, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLjava/lang/String;ZLvh;)Lte;", line = 128)
    public static final class435 method1275(byte arg0, String arg1, boolean arg2, class240 arg3) {
        field2970++;
        int var4 = arg3.method1396(arg1, (byte) 71);
        if (var4 == -1) {
            return new class435(0);
        }
        int[] var5 = arg3.method1415(arg0 ^ 0x2E, var4);
        if (arg0 != -83) {
            return null;
        }
        class435 var6 = new class435(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field6339 > var7) {
                class365 var9 = new class365(arg3.method1411(true, var5[var8++], var4));
                int var10 = var9.method2056((byte) -112);
                int var11 = var9.method2062((byte) 14);
                int var12 = var9.method2099(255);
                if (!arg2 && var12 == 1) {
                    var6.field6339--;
                } else {
                    var6.field6344[var7] = var10;
                    var6.field6340[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 180)
    public class210(class157 arg0, int arg1, class240 arg2) {
        this.field2972 = arg2;
        this.field2980 = this.field2972.method1397((byte) 2, 4);
    }
}
