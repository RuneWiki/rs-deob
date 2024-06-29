import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 extends RuntimeException {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field578;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljava/lang/String;")
    public String field583;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lhe;")
    public static class54 field587 = class6.method58(")4lang)4de", false);

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lhe;")
    public static class54 field586 = class6.method58("(Z", false);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lld;")
    public static class80 field581;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[Lqb;")
    public static class113[] field585;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method165(int arg0) {
        field585 = null;
        if (arg0 != 32768) {
            field586 = null;
        }
        field586 = null;
        field587 = null;
        field581 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lef;Lef;BLjava/awt/Component;)V")
    public static final void method166(class35 arg0, class35 arg1, byte arg2, Component arg3) {
        field584++;
        if (class93.field2304) {
            return;
        }
        class90.method718();
        byte[] var4 = arg1.method272(false, class54.field1344, class66.field1607);
        class133.field3015 = new class113(var4, arg3);
        class66.field1600 = class133.field3015.method857();
        class63.field1529 = class2.method9(24094, class66.field1607, class158.field3611, arg0);
        class49.field1173 = class2.method9(24094, class66.field1607, class2.field33, arg0);
        class38.field964 = class2.method9(24094, class66.field1607, class85.field2121, arg0);
        class156.field3571 = class125.method957(class66.field1607, arg0, 92, class142.field3261);
        class158.field3629 = class125.method957(class66.field1607, arg0, 11, class44.field1120);
        class130.field2948 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class130.field2948[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class130.field2948[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class130.field2948[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class130.field2948[var8 + 192] = 16777215;
        }
        class155.field3506 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class155.field3506[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class155.field3506[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class155.field3506[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class155.field3506[var12 + 192] = 16777215;
        }
        class2.field31 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class2.field31[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class2.field31[var14 + 64] = var14 * 262144 + 255;
        }
        if (arg2 < 13) {
            method165(73);
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class2.field31[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class2.field31[var16 + 192] = 16777215;
        }
        class143.field3279 = new int[256];
        class102.field2553 = new int[32768];
        class130.field2925 = new int[32768];
        class4.method36((byte) 127, null);
        class142.field3253 = new int[32768];
        if (class67.field1682 == 0) {
            class66.field1605 = true;
        } else {
            class66.field1605 = false;
        }
        class66.field1604 = class66.field1607;
        class66.field1608 = class66.field1607;
        class107.field2615 = 0;
        class91.field2211 = false;
        class149.field3370 = new int[32768];
        if (class66.field1605) {
            class64.method501(2, 97);
        } else {
            class63.method498(class15.field449, 2, class105.field2602, false, 255, -90, class66.field1607);
        }
        class70.method553(118, false);
        class93.field2304 = true;
        class133.field3015.method856(0, 0);
        class66.field1600.method856(382, 0);
        class63.field1529.method161(382 - class63.field1529.field574 / 2, 18);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class21(Throwable arg0, String arg1) {
        this.field578 = arg0;
        this.field583 = arg1;
    }
}
