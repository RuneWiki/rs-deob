import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class123 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[I")
    public static int[] field2153 = new int[32];

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[Lnp;")
    public static class115[] field2158;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[Lo;")
    public static class138[] field2157;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)Lui;")
    public static final class378 method972(int arg0, byte arg1) {
        field2154++;
        class378[] var2 = class348.method2246(arg1 ^ 0x69);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class378 var4 = var2[var3];
            if (var4.field5872 == arg0) {
                return var4;
            }
        }
        if (arg1 != 105) {
            field2157 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
    public static final int method973(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        field2155++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        if (arg0 > -38) {
            return 45;
        } else {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method974(byte arg0) {
        field2158 = null;
        int var1 = -19 % ((-arg0 - 59) / 62);
        field2153 = null;
        field2157 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
    public static final void method975(boolean arg0) {
        for (int var1 = 0; var1 < class412.field6247.length; var1++) {
            for (int var2 = 0; var2 < class412.field6247[var1].length; var2++) {
                class412.field6247[var1][var2] = class446.field6659;
            }
        }
        if (!arg0) {
            field2153 = null;
        }
        field2156++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2153[var1] = var0 - 1;
            var0 += var0;
        }
        new class306("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2158 = new class115[16];
    }
}
