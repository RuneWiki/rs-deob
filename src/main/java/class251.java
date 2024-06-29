import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class251 extends class365 {

    @OriginalMember(owner = "client!om", name = "Gb", descriptor = "Lfg;")
    public static class83 field3488 = new class83("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!om", name = "Hb", descriptor = "Z")
    public static boolean field3489 = true;

    @OriginalMember(owner = "client!om", name = "Cb", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!om", name = "Db", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!om", name = "Eb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!om", name = "Fb", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
    public class251(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IF)V")
    public final void method1476(int arg0, float arg1) {
        ++field3487;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        int var4 = 68 / ((arg0 - -52) / 48);
        super.field5073[super.field5069++] = (byte) var3;
        super.field5073[super.field5069++] = (byte) (var3 >> 8);
        super.field5073[super.field5069++] = (byte) (var3 >> 16);
        super.field5073[super.field5069++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FB)V")
    public final void method1477(float arg0, byte arg1) {
        ++field3486;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field5073[super.field5069++] = (byte) (var3 >> 24);
        super.field5073[super.field5069++] = (byte) (var3 >> 16);
        int var4 = -121 % ((arg1 - 72) / 45);
        super.field5073[super.field5069++] = (byte) (var3 >> 8);
        super.field5073[super.field5069++] = (byte) var3;
    }

    @OriginalMember(owner = "client!om", name = "n", descriptor = "(B)V")
    public static void method1478(byte arg0) {
        if (arg0 > -79) {
            field3489 = false;
        }
        field3488 = null;
    }

    @OriginalMember(owner = "client!om", name = "k", descriptor = "(II)V")
    public static final void method1479(int arg0, int arg1) {
        ++field3485;
        int var2 = class393.field5484 - class374.field5279;
        if (~var2 <= -101) {
            class128.field1742 = 1;
        } else {
            int var3 = (int) class510.field7495;
            if (var3 < class277.field3741 >> 8) {
                var3 = class277.field3741 >> 8;
            }
            if (class223.field3131[4] && ~var3 > ~(class384.field5403[4] + 128)) {
                var3 = class384.field5403[4] + 128;
            }
            int var4 = 16383 & (int) class40.field553 + class65.field893;
            if (arg0 != 128) {
                method1478((byte) 27);
            }
            class159.method985(-50 + class186.method1118(class75.field1089.field466, class75.field1089.field461, 12840, class400.field5571), (var3 >> 3) * 3 + 600 << 0, class67.field934, class254.field3530, arg1, var3, var4, 16384);
            float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
            class132.field1901 = (int) ((float) (-class1.field8 + class132.field1901) * var5 + (float) class1.field8);
            class476.field6958 = (int) ((float) (-class124.field1700 + class476.field6958) * var5 + (float) class124.field1700);
            class310.field4240 = (int) ((float) (class310.field4240 - class300.field4119) * var5 + (float) class300.field4119);
            class526.field7729 = (int) ((float) (-class347.field4761 + class526.field7729) * var5 + (float) class347.field4761);
            int var6 = class208.field2951 - class410.field5844;
            if (var6 <= 8192) {
                if (~var6 > 8191) {
                    var6 += 16384;
                }
            } else {
                var6 -= 16384;
            }
            class208.field2951 = (int) ((float) var6 * var5 + (float) class410.field5844);
            class208.field2951 &= 16383;
        }
    }
}
