import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class27 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field359 = 0;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field361 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lkl;")
    public static class64 field357 = new class64();

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[S")
    public static short[] field363 = new short[500];

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Ltl;")
    public static class59 field364 = class85.method639("Starte 3D)2Softwarebibliothek)3", 9588);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 11)
    public static void method173(byte arg0) {
        field357 = null;
        field363 = null;
        if (arg0 != -58) {
            method174((class295) null, false);
        }
        field364 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lme;Z)V", line = 25)
    public static final void method174(class295 arg0, boolean arg1) {
        class185.field3106 = arg0.method2064(123, class72.field1142);
        field355++;
        class9.field126 = arg0.method2064(120, class193.field3201);
        if (arg1) {
            field356 = 77;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 59)
    public static final void method175(int arg0, int arg1) {
        class300.field5137[2] = (float) class93.method680(255, arg1) / 255.0F;
        class300.field5137[0] = (float) (class93.method680(16735911, arg1) >> 16) / 255.0F;
        class300.field5137[1] = (float) class93.method680(arg1 >> 8, 255) / 255.0F;
        field358++;
        class200.method1436(3, -126);
        if (arg0 >= 99) {
            class200.method1436(4, -125);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIII)I", line = 81)
    public static final int method176(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field360++;
        int var5 = arg4 & 0xF;
        if (arg1) {
            field357 = (class64) null;
        }
        int var6 = var5 < 8 ? arg3 : arg0;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg2) : arg0;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }
}
