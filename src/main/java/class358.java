import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class358 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[Lui;")
    private class426[] field5272;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Loa;")
    public static class149 field5273 = new class149(64);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lnn;")
    public static class151 field5277 = new class151(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5279 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Ljg;")
    public static class241 field5281 = new class241(500);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "J")
    private long field5270;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lui;")
    private class426 field5282;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Lui;")
    public final class426 method2150(int arg0) {
        field5271++;
        if (this.field5282 == null) {
            return null;
        } else if (arg0 == -10958) {
            class426 var2 = this.field5272[(int) (this.field5270 & (long) (this.field5274 - 1))];
            while (this.field5282 != var2) {
                if (this.field5282.field6254 == this.field5270) {
                    class426 var3 = this.field5282;
                    this.field5282 = this.field5282.field6251;
                    return var3;
                }
                this.field5282 = this.field5282.field6251;
            }
            this.field5282 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JLui;I)V")
    public final void method2151(long arg0, class426 arg1, int arg2) {
        if (arg1.field6257 != null) {
            arg1.method2627(0);
        }
        field5280++;
        class426 var5 = this.field5272[(int) ((long) (this.field5274 - 1) & arg0)];
        arg1.field6257 = var5.field6257;
        if (arg2 != 9286) {
            method2153((class141) null, (byte) 123, -44);
        }
        arg1.field6251 = var5;
        arg1.field6257.field6251 = arg1;
        arg1.field6251.field6257 = arg1;
        arg1.field6254 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
    public static final void method2152(int arg0, boolean arg1) {
        if (arg1) {
            class359.field5313.method1481(3, arg0);
            field5276++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lbs;BI)Lam;")
    public static final class466 method2153(class141 arg0, byte arg1, int arg2) {
        field5283++;
        int var3 = -4 / ((arg1 - 30) / 35);
        class466 var4;
        if (class408.field6076 == null) {
            var4 = new class466();
        } else {
            var4 = class408.field6076;
            class408.field6076 = class408.field6076.field6853;
            class312.field4706--;
            var4.field6853 = null;
        }
        var4.field6856 = arg2;
        var4.field6862 = arg0;
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static void method2154(int arg0) {
        field5281 = null;
        field5279 = null;
        field5277 = null;
        field5273 = null;
        if (arg0 != 23202) {
            field5281 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JB)Lui;")
    public final class426 method2155(long arg0, byte arg1) {
        int var4 = -33 / ((arg1 - 8) / 49);
        field5275++;
        this.field5270 = arg0;
        class426 var5 = this.field5272[(int) (arg0 & (long) (this.field5274 - 1))];
        for (this.field5282 = var5.field6251; this.field5282 != var5; this.field5282 = this.field5282.field6251) {
            if (this.field5282.field6254 == arg0) {
                class426 var6 = this.field5282;
                this.field5282 = this.field5282.field6251;
                return var6;
            }
        }
        this.field5282 = null;
        return null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
    public class358(int arg0) {
        this.field5272 = new class426[arg0];
        this.field5274 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class426 var3 = this.field5272[var2] = new class426();
            var3.field6257 = var3;
            var3.field6251 = var3;
        }
    }

    static {
        new class151("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
