import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class308 {

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    private int field4181 = -1;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    private int field4188 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lmg;")
    private class530 field4176 = new class530();

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Z")
    public boolean field4191 = false;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    private int field4185;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    private int field4177;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[[I")
    private int[][] field4178;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lbq;")
    private class341[] field4182;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lkc;")
    public static class157 field4180 = new class157("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lhi;")
    public static class45 field4184 = new class45(47, -1);

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4187 = new String[100];

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lkc;")
    public static class157 field4186 = new class157("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Lad;")
    public static class12 field4192 = new class12("stellardawn", 1);

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "[Z")
    public static boolean[] field4189;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 3)
    public static void method1779(byte arg0) {
        field4187 = null;
        field4192 = null;
        int var1 = 37 % ((arg0 - 63) / 33);
        field4180 = null;
        field4184 = null;
        field4186 = null;
        field4189 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[I", line = 17)
    public final int[] method1780(int arg0, byte arg1) {
        field4183++;
        if (arg1 < 23) {
            this.method1780(123, (byte) -34);
        }
        if (this.field4185 == this.field4177) {
            this.field4191 = this.field4182[arg0] == null;
            this.field4182[arg0] = class12.field131;
            return this.field4178[arg0];
        } else if (this.field4185 == 1) {
            this.field4191 = this.field4181 != arg0;
            this.field4181 = arg0;
            return this.field4178[0];
        } else {
            class341 var3 = this.field4182[arg0];
            if (var3 == null) {
                this.field4191 = true;
                if (this.field4188 >= this.field4185) {
                    class341 var4 = (class341) this.field4176.method3145(0);
                    var3 = new class341(arg0, var4.field4935);
                    this.field4182[var4.field4934] = null;
                    var4.method2791((byte) 112);
                } else {
                    var3 = new class341(arg0, this.field4188);
                    this.field4188++;
                }
                this.field4182[arg0] = var3;
            } else {
                this.field4191 = false;
            }
            this.field4176.method3141(108, var3);
            return this.field4178[var3.field4935];
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)[[I", line = 84)
    public final int[][] method1781(boolean arg0) {
        field4179++;
        if (this.field4185 != this.field4177) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4185; var2++) {
            this.field4182[var2] = class12.field131;
        }
        if (arg0) {
            field4184 = null;
        }
        return this.field4178;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 108)
    public static final int method1782(int arg0, int arg1) {
        return class34.field526 == null ? 0 : class34.field526[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 114)
    public final void method1783(int arg0) {
        for (int var2 = arg0; var2 < this.field4185; var2++) {
            this.field4178[var2] = null;
        }
        field4190++;
        this.field4182 = null;
        this.field4178 = null;
        this.field4176.method3143(true);
        this.field4176 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(III)V", line = 173)
    public class308(int arg0, int arg1, int arg2) {
        this.field4185 = arg0;
        this.field4177 = arg1;
        this.field4178 = new int[this.field4185][arg2];
        this.field4182 = new class341[this.field4177];
    }
}
