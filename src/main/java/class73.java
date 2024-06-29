import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public abstract class class73 extends class419 {

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "Ljc;")
    public static class305 field916 = new class305("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "Z")
    public boolean field918;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIZILot;Lza;)V")
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        int var8 = 86 / ((61 - arg0) / 47);
        field924++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method427(int arg0) {
        field916 = null;
        if (arg0 != 127) {
            method427(-65);
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        if (arg0 == -62) {
            field923++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)V")
    public final void method42(byte arg0) {
        field922++;
        if (arg0 != 92) {
            this.field921 = 122;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIII)I")
    public static final int method428(int arg0, int arg1, int arg2, int arg3) {
        field920++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = 128 - arg1;
        int var5 = (arg2 & 0x7F) * var4 + (arg3 & 0x7F) * arg1 >> 7;
        if (arg0 <= 24) {
            field916 = null;
        }
        int var6 = (arg2 & 0x380) * var4 + (arg3 & 0x380) * arg1 >> 7;
        int var7 = (arg2 & 0xFC00) * var4 + ((arg3 & 0xFC00) * arg1) >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lkh;B)V")
    public static final void method429(class13 arg0, byte arg1) {
        arg0.method73(arg1 + 223);
        field917++;
        int var2 = class308.field4121;
        class531 var3 = class96.field1170 = class29.field272[var2] = new class531();
        var3.field1211 = var2;
        int var4 = arg0.method80(30, 255);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFC053) >> 14;
        var3.field1249[0] = var6 - class357.field4867;
        int var7 = var4 & 0x3FFF;
        var3.field3704 = (var3.field1249[0] << 7) + (var3.method546(24273) << 6);
        var3.field1251[0] = var7 - class418.field6074;
        var3.field3694 = (var3.field1251[0] << 7) + (var3.method546(24273) << 6);
        class210.field2808 = var3.field3695 = var5;
        if (arg1 != -114) {
            return;
        }
        if (class484.field7127[var2] != null) {
            var3.method3159(class484.field7127[var2], 33);
        }
        class461.field6877 = 0;
        class342.field4589[class461.field6877++] = var2;
        class424.field6169[var2] = 0;
        class95.field1146 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method80(18, 255);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class228 var13 = class362.field4936[var8] = new class228();
                var13.field3076 = 0;
                var13.field3074 = -1;
                var13.field3071 = false;
                var13.field3073 = (var10 << 28) + (var11 << 14) + var12;
                class100.field1376[class95.field1146++] = var8;
                class424.field6169[var8] = 0;
            }
        }
        arg0.method79(false);
    }
}
