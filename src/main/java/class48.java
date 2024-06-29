import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lim;")
    public static class353 field654 = new class353(53, 8);

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lim;")
    public static class353 field657 = new class353(27, 4);

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    public static int[] field660;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZII)Z")
    public static final boolean method261(boolean arg0, int arg1, int arg2) {
        field655++;
        if (arg0) {
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method262(byte arg0) {
        field660 = null;
        field654 = null;
        if (arg0 <= 54) {
            field659 = -43;
        }
        field657 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lkg;IIIII)V")
    public static final void method263(class57 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field759 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class238.field3050[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class597 var13 = class256.field3175[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field759; var14++) {
                            if (arg0.field756[var14] == var13.field8621) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field756[arg0.field759++] = var13.field8621;
                        if (arg0.field759 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field759; var15 < 4; var15++) {
            arg0.field756[var15] = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[[[Lrg;)V")
    public static final void method264(int arg0, class563[][][] arg1) {
        field653++;
        if (arg0 >= -79) {
            method262((byte) 78);
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class563[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class563 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7891 instanceof class246) {
                            ((class246) var6.field7891).method65(-73);
                        }
                        if (var6.field7885 instanceof class246) {
                            ((class246) var6.field7885).method65(-52);
                        }
                        if (var6.field7889 instanceof class246) {
                            ((class246) var6.field7889).method65(-77);
                        }
                        if (var6.field7896 instanceof class246) {
                            ((class246) var6.field7896).method65(-95);
                        }
                        if (var6.field7884 instanceof class246) {
                            ((class246) var6.field7884).method65(46);
                        }
                        for (class15 var7 = var6.field7894; var7 != null; var7 = var7.field158) {
                            class450 var8 = var7.field161;
                            if (var8 instanceof class246) {
                                ((class246) var8).method65(-64);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > arg3) {
            class373.method2275((byte) -9, arg1, arg0, arg3, class256.field3173[arg2]);
        } else {
            class373.method2275((byte) -9, arg3, arg0, arg1, class256.field3173[arg2]);
        }
        if (arg4 != 4) {
            field654 = null;
        }
        field656++;
    }

    static {
        new class344("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field659 = -1;
        field658 = 1338;
        field660 = new int[8];
    }
}
