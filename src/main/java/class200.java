import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class200 extends class622 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    public static int[] field2684 = new int[250];

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field2685 = new int[13];

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 18)
    public static void method1270(int arg0) {
        if (arg0 == -2543) {
            field2685 = null;
            field2684 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 29)
    public static final void method1271(int arg0, int arg1) {
        field2687++;
        if (arg1 < -119 && arg0 != -1 && class119.field1484[arg0]) {
            class515.field7512.method1307(arg0, 126);
            class297.field4403[arg0] = null;
            class114.field1431[arg0] = null;
            class119.field1484[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V", line = 53)
    public static final void method1272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class100.field1195 = arg3;
        class67.field743 = arg0;
        class622.field8997 = arg2;
        field2686++;
        if (arg1 > -74) {
            method1272(64, 1, -44, 111, -46, -41);
        }
        class468.field6956 = arg4;
        class108.field1313 = arg5;
        if (class468.field6956 >= 100) {
            int var6 = class67.field743 * 512 + 256;
            int var7 = class100.field1195 * 512 + 256;
            int var8 = class399.method2547(var7, var6, (byte) -126, class226.field3179) - class108.field1313;
            int var9 = var6 - class337.field4821;
            int var10 = var8 - class100.field1192;
            int var11 = var7 - class207.field2781;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class309.field4550 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class17.field177 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class474.field7009 = 0;
            if (class309.field4550 < 1024) {
                class309.field4550 = 1024;
            }
            if (class309.field4550 > 3072) {
                class309.field4550 = 3072;
            }
        }
        class236.field3384 = 2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lvda;")
    public abstract class158 method1269(boolean arg0);
}
