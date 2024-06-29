import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class81 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "B")
    public byte field1121;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "S")
    public short field1126;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "S")
    public short field1125;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    public boolean field1122;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "S")
    public short field1118;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "B")
    public byte field1129;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lvl;")
    public static class15 field1123 = new class15(48, -1);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 7)
    public static final void method668(int arg0) {
        class262.field3687 = new class616[1000];
        class339.field4581 = new class616[500];
        class660.field9144 = 0;
        class250.field3524 = 0;
        class475.field6430 = class365.field4955;
        class682.field9500 = 0;
        class3.field39 = 0;
        class284.field3926 = class365.field4955;
        class557.field7860 = new class616[2000];
        int var1 = 25 / ((-arg0 - 70) / 52);
        class18.field437 = new class616[500];
        class344.field4631 = false;
        class168.field2704 = new int[class62.field856][class441.field5980 + 1][class375.field5083 + 1];
        field1124++;
        if ((class112.field2107 instanceof class723)) {
            class378.field5160 = false;
        } else {
            class378.field5160 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 40)
    public static void method669(int arg0) {
        int var1 = 0 / ((-arg0 - 4) / 32);
        field1123 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V", line = 50)
    public static final void method670(int arg0, boolean arg1) {
        class204.method1458(-17818);
        field1119++;
        if (arg0 < 59 || !class787.method4288(class753.field10398, (byte) -119)) {
            return;
        }
        class243.field3467++;
        if (class243.field3467 < 50 && !arg1) {
            return;
        }
        class243.field3467 = 0;
        if (!class568.field8080 && class193.field2948 != null) {
            class664.field9226++;
            class537 var2 = class476.method2729(class320.field4370, (byte) -46, class551.field7498);
            class173.method1314(false, var2);
            try {
                class149.method1191(101);
            } catch (IOException var3) {
                class568.field8080 = true;
            }
        }
        class204.method1458(-17818);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 95)
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field1121 = (byte) arg7;
        this.field1126 = (short) arg6;
        this.field1125 = (short) arg4;
        this.field1122 = arg9;
        this.field1118 = (short) arg5;
        this.field1127 = arg10;
        this.field1129 = (byte) arg8;
        this.field1128 = arg0;
    }
}
