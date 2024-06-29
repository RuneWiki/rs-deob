import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class180 {

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2611 = new Rectangle[100];

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[Z")
    public static boolean[] field2613;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
    public static int[] field2615;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Ltm;")
    public static class112 field2614;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "J")
    public long field2608;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lag;")
    public class180 field2609;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lag;")
    public class180 field2610;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIB)I")
    public static final int method1179(boolean arg0, int arg1, int arg2, byte arg3) {
        field2605++;
        class459 var4 = class27.method228((byte) -115, arg0, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg3 != 124) {
                method1179(false, 97, 99, (byte) -27);
            }
            for (int var6 = 0; var6 < var4.field6463.length; var6++) {
                if (var4.field6464[var6] == arg1) {
                    var5 += var4.field6463[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lws;II)V")
    public static final void method1180(class38 arg0, int arg1, int arg2) {
        if (class196.field2801) {
            class196.field2801 = false;
            arg1 = 0;
        }
        if (arg2 != -16304) {
            field2615 = null;
        }
        field2607++;
        if (class85.field1287 != null && class85.field1287.method317(arg0, (byte) 76)) {
            return;
        }
        class85.field1287 = arg0;
        class443.field6119 = class193.method1237(arg2 ^ 0x1AC3);
        class238.field3365 = arg1;
        class484.field6820 = arg1;
        if (class484.field6820 == 0) {
            class85.method587((byte) 111);
            return;
        }
        class306.field4187 = class479.field6774;
        class154.field2215 = class236.field3330;
        class215.field3050 = class7.field120;
        class147.field2073 = class374.field5298;
        class407.field5638 = class200.field2866;
        class222.field3131 = class228.field3228;
        class283.field3893 = class466.field6543;
        class280.field3861 = class241.field3412;
        class222.field3134 = class350.field4795;
        class434.field5966 = class465.field6533;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
    public final boolean method1181(int arg0) {
        field2603++;
        if (arg0 != 100) {
            method1179(false, -6, 127, (byte) -45);
        }
        return this.field2609 != null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public final void method1182(int arg0) {
        if (arg0 != 28818) {
            this.field2608 = 5L;
        }
        field2606++;
        if (this.field2609 != null) {
            this.field2609.field2610 = this.field2610;
            this.field2610.field2609 = this.field2609;
            this.field2609 = null;
            this.field2610 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1183(byte arg0) {
        field2614 = null;
        int var1 = -41 % ((38 - arg0) / 33);
        field2613 = null;
        field2611 = null;
        field2615 = null;
        field2616 = null;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2611[var0] = new Rectangle();
        }
        field2612 = -1;
        field2613 = new boolean[100];
        field2615 = new int[4096];
        field2614 = new class112("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");
        field2616 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };
    }
}
