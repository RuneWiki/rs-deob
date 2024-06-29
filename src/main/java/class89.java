import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class89 extends class406 {

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "[B")
    public static byte[] field1083;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field1087;

    static {
        new class362("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field1086 = 0;
        int var0 = 0;
        field1083 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1083[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1088 = 0;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V", line = 3)
    public static final void method491(int arg0) {
        field1082++;
        class45.method268();
        if (arg0 < 50) {
            method492(-31);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class102.field1247[var1].method741(false);
        }
        class193.method1307(false);
        class440.method2744(-19093);
        System.gc();
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)J", line = 27)
    public static final long method492(int arg0) {
        field1080++;
        if (arg0 <= 4) {
            field1083 = null;
        }
        return class97.field1172.method399(1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(JBLae;)V", line = 39)
    public static final void method493(long arg0, byte arg1, class134 arg2) {
        class146.field1791 = class330.field4665;
        field1081++;
        class129.field1572 = 0;
        class330.field4665 = 0;
        long var4 = class175.method1195(arg1 ^ 0xFFFFFF84);
        if (arg1 != -96) {
            field1086 = 94;
        }
        for (class209 var6 = (class209) class257.field3687.method2509((byte) 51); var6 != null; var6 = (class209) class257.field3687.method2515(0)) {
            if (var6.method1368(arg2, arg0)) {
                class129.field1572++;
            }
        }
        if (class423.field6055 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class257.field3687.method2510(arg1 + 96) + ", running: " + class129.field1572 + ". Particles: " + class330.field4665 + ". Time taken: " + (class175.method1195(88) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V", line = 79)
    public static void method494(byte arg0) {
        field1083 = null;
        int var1 = -21 % ((arg0 - 65) / 57);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V", line = 88)
    public static final void method495(int arg0, int arg1) {
        field1087++;
        if (!class98.method545(arg0, (byte) 11) || arg1 <= 96) {
            return;
        }
        class184[] var2 = class98.field1194[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class184 var4 = var2[var3];
            if (var4 != null) {
                var4.field2550 = 0;
                var4.field2566 = 0;
                var4.field2541 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(II)V", line = 124)
    public class89(int arg0, int arg1) {
        this.field1084 = arg0;
        this.field1085 = arg1;
    }
}
