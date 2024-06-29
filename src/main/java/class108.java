import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class108 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Lvj;")
    private class303 field1788;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "J")
    public long field1787;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Lrn;")
    public static class174 field1789 = new class174(36, -1);

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "[J")
    public static long[] field1791 = new long[256];

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Lrn;")
    public static class174 field1792;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
    public static int[] field1793;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lpi;")
    public static class342 field1794;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method806(int arg0) {
        field1794 = null;
        field1792 = null;
        field1791 = null;
        field1789 = null;
        if (arg0 >= -122) {
            method807(5, 58, -86, -52, 35, 80, (byte) 83, 78);
        }
        field1793 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1786++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class309.field4716 - class261.field3796) * var8 / 100 + class261.field3796;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        if (arg6 <= 50) {
            method807(38, 43, -64, 112, 53, 22, (byte) -110, 118);
        }
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class528.field7783[var11] * -var10 >> 15;
            var15 = class528.field7786[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class528.field7783[var12] * var15 >> 15;
            var15 = class528.field7786[var12] * var15 >> 15;
        }
        class222.field3184 = arg7 - var14;
        class291.field4137 = 0;
        class291.field4148 = arg1;
        class122.field1982 = arg0;
        class40.field732 = arg5 - var13;
        class405.field6075 = arg3 - var15;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lvj;JI)V")
    public class108(class303 arg0, long arg1, int arg2) {
        this.field1788 = arg0;
        this.field1787 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1790++;
        this.field1788.method1972(2, this.field1787);
        super.finalize();
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1791[var0] = var1;
        }
        field1792 = new class174(22, 3);
        field1793 = new int[14];
        field1794 = new class342("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
    }
}
