import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class354 {

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Llf;")
    public static class251 field4404 = new class251(5, 1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "[B")
    public byte[] field4401;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[S")
    public short[] field4399;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "[S")
    public short[] field4400;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[S")
    public short[] field4402;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method2082(int arg0) {
        field4404 = null;
        if (arg0 <= 104) {
            field4398 = -82;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2083(String arg0, int arg1) {
        field4403++;
        if (!class104.field1336 || (class667.field9161 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class235.field2787;
        int[] var4 = class75.field1040;
        for (int var5 = 0; var5 < var3; var5++) {
            class521 var6 = class61.field825[var4[var5]];
            if (var6.field7399 != null && var6.field7399.equalsIgnoreCase(arg0) && (class300.field3596 == var6 && (class667.field9161 & 0x10) != 0 || var6 != null && (class667.field9161 & 0x8) != 0)) {
                class345.field4318++;
                class336 var7 = class512.method3076(class243.field2872, class591.field8030, (byte) 104);
                var7.field4150.method2380((byte) -9, var4[var5]);
                var7.field4150.method2369(-18090, class520.field7344);
                var7.field4150.method2420(2760, 0);
                var7.field4150.method2369(arg1 ^ 0xFFFFB94E, class351.field4370);
                var7.field4150.method2376(class215.field2531, -591802824);
                class578.method3334(arg1 ^ 0x1C, var7);
                class96.method834(true, -2, (byte) 122, var6.field3455[0], 0, var6.method1665(1720746760), 0, var6.field3453[0], var6.method1665(1720746760));
                var2 = true;
                break;
            }
        }
        if (arg1 != 24) {
            field4398 = -51;
        }
        if (!var2) {
            class619.method3512(class637.field8696.method3584(class770.field10592, true) + arg0, 4, false);
        }
        if (class104.field1336) {
            class118.method926(-50);
        }
    }
}
