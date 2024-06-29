import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class456 extends class96 {

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Luk;")
    public class163 field6644;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Lwt;")
    public static class194 field6641 = new class194("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "Lhe;")
    public static class239 field6643;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Lsn;")
    public static class427 field6646;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "[Lau;")
    public static class497[] field6642;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
    public static void method2657(byte arg0) {
        field6646 = null;
        field6642 = null;
        int var1 = 104 % ((arg0 + 7) / 37);
        field6641 = null;
        field6643 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2658(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6649++;
        int var8 = class372.method2266(class7.field131, -20228, class92.field1252, arg6);
        int var9 = class372.method2266(class7.field131, -20228, class92.field1252, arg1);
        int var10 = class372.method2266(class473.field6839, -20228, class63.field933, arg3);
        int var11 = class372.method2266(class473.field6839, -20228, class63.field933, arg4);
        int var12 = class372.method2266(class7.field131, -20228, class92.field1252, arg2 + arg6);
        int var13 = class372.method2266(class7.field131, arg0 - 20244, class92.field1252, arg1 - arg2);
        for (int var14 = var8; var14 < var12; var14++) {
            class238.method1440(class41.field629[var14], arg7, var11, var10, -14726);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class238.method1440(class41.field629[var15], arg7, var11, var10, -14726);
        }
        int var16 = class372.method2266(class473.field6839, -20228, class63.field933, arg2 + arg3);
        int var17 = class372.method2266(class473.field6839, arg0 ^ 0xFFFFB0EC, class63.field933, arg4 - arg2);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class41.field629[var18];
            class238.method1440(var19, arg7, var16, var10, arg0 ^ 0xFFFFC66A);
            class238.method1440(var19, arg5, var17, var16, -14726);
            class238.method1440(var19, arg7, var11, var17, arg0 ^ 0xFFFFC66A);
        }
        if (arg0 != 16) {
            method2658((byte) 127, 5, -24, -108, 19, -15, -42, -76);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IC)Z")
    public static final boolean method2659(int arg0, char arg1) {
        field6640++;
        if (arg0 <= 62) {
            field6647 = -90;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
    public static final void method2660(int arg0, int arg1, int arg2) {
        boolean var3 = class358.field5312[0][arg1][arg2] != null && class358.field5312[0][arg1][arg2].field6779 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class358.field5312[var4][arg1][arg2] == null) {
                class468 var5 = class358.field5312[var4][arg1][arg2] = new class468(var4, arg1, arg2);
                if (var3) {
                    var5.field6773++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Luk;)V")
    public class456(class163 arg0) {
        this.field6644 = arg0;
    }
}
