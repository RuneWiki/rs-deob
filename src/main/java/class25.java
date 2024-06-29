import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class25 {

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Ls;")
    public static class34 field258 = class9.method35("Crafting Shop", 220);

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Ls;")
    public static class34 field259 = class9.method35("-5bersicht", 220);

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Ls;")
    public static class34 field260 = class9.method35("Quest Start", 220);

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "J")
    public static volatile long field262 = 0L;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Ls;")
    public static class34 field263 = class9.method35("details)3dat", 220);

    @OriginalMember(owner = "mapview!m", name = "l", descriptor = "Ls;")
    public static class34 field266 = class9.method35("sprites", 220);

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "Ls;")
    public static class34 field264 = class9.method35("Loading )3)3)3", 220);

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "J")
    public long field265;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lm;")
    public class25 field255;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lm;")
    public class25 field257;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "[B")
    public static byte[] field256;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 21)
    public final void method134(int arg0) {
        if (this.field257 == null) {
            return;
        }
        this.field257.field255 = this.field255;
        if (arg0 != 0) {
            field263 = null;
        }
        this.field255.field257 = this.field257;
        this.field255 = null;
        this.field257 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z)V", line = 45)
    public static void method135(boolean arg0) {
        field266 = null;
        field263 = null;
        field264 = null;
        field259 = null;
        field256 = null;
        if (arg0) {
            field258 = null;
            field260 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(II[Ls;B)Ls;", line = 69)
    public static final class34 method136(int arg0, int arg1, class34[] arg2, byte arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class10.field97;
            }
            var4 += arg2[arg0 + var5].field478;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = 0;
        int var9 = 33 / ((arg3 + 61) / 45);
        while (arg1 > var8) {
            class34 var10 = arg2[arg0 + var8];
            class5.method16(var10.field475, 0, var6, var7, var10.field478);
            var7 += var10.field478;
            var8++;
        }
        class34 var11 = new class34();
        var11.field475 = var6;
        var11.field478 = var4;
        return var11;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IBLda;ILda;)Lr;", line = 122)
    public static final class33 method137(int arg0, byte arg1, class8 arg2, int arg3, class8 arg4) {
        int var5 = -21 % ((-arg1 - 56) / 55);
        return method138(arg2, -89, arg0, arg3) ? class37.method255((byte) -56, arg4.method26(arg3, -2, arg0)) : null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lda;III)Z", line = 145)
    public static final boolean method138(class8 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method26(arg3, -2, arg2);
        if (var4 == null) {
            return false;
        }
        class37.method254(var4, 0);
        if (arg1 > -41) {
            field264 = null;
        }
        return true;
    }
}
