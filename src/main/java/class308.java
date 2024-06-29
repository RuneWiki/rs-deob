import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class308 extends class633 {

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "Lsb;")
    public static class266 field4550 = new class266(44, 3);

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "Z")
    public static boolean field4551 = false;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "[I")
    public static int[] field4553 = new int[1];

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "J")
    public static long field4554;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "[B")
    private byte[] field4552;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2012(int arg0, int arg1, int arg2, int arg3) {
        this.field4552 = new byte[arg0 * arg1 * arg2 * 2];
        field4549++;
        if (arg3 != -8198) {
            method2015(null, 80);
        }
        this.method1439(arg0, arg1, true, arg2);
        return this.field4552;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BII)V")
    public final void method2013(byte arg0, int arg1, int arg2) {
        field4547++;
        int var4 = arg2 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field4552[var10001] = var5;
        this.field4552[var7] = var5;
        int var6 = -61 / ((arg1 - 14) / 52);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public static void method2014(int arg0) {
        field4553 = null;
        field4550 = null;
        if (arg0 != 7960) {
            field4553 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
    public class308() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2015(String arg0, int arg1) {
        field4548++;
        if (!class65.field1435 || (class489.field7001 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class237.field3520;
        int[] var4 = class47.field1140;
        for (int var5 = 0; var5 < var3; var5++) {
            class602 var6 = class59.field1341[var4[var5]];
            if (var6.field8631 != null && var6.field8631.equalsIgnoreCase(arg0) && (class532.field7456 == var6 && (class489.field7001 & 0x10) != 0 || var6 != null && (class489.field7001 & 0x8) != 0)) {
                class318.field4691++;
                class275 var7 = class185.method1355(0, class506.field7177, class395.field5772);
                var7.field4103.method746(0, class153.field2604);
                var7.field4103.method744((byte) -54, 0);
                var7.field4103.method715(class437.field6303, 1949991176);
                var7.field4103.method709(var4[var5], -109);
                var7.field4103.method745(class273.field4094, 128);
                class140.method1141(var7, 19321);
                var2 = true;
                class611.method3509(var6.field8787[0], 0, -2, (byte) 116, var6.method3446(0), true, 0, var6.field8785[0], var6.method3446(0));
                break;
            }
        }
        if (!var2) {
            class108.method974(4, class265.field3896.method1733(255, class140.field2466) + arg0, 3867);
        }
        if (class65.field1435) {
            class612.method3511(true);
        }
        if (arg1 > -22) {
            field4551 = true;
        }
    }
}
