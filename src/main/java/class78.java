import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class78 {

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "Ldu;")
    public static class360 field953 = new class360(32);

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLvfa;)V", line = 4)
    public static final void method623(byte arg0, class672 arg1) {
        if (arg0 != -99) {
            method623((byte) 124, null);
        }
        field951++;
        if (class434.field5979 != arg1.field9160) {
            return;
        }
        if (class472.field6475.field5334 == null) {
            arg1.field9224 = 0;
            arg1.field9293 = 0;
            return;
        }
        arg1.field9283 = 150;
        arg1.field9164 = (int) (Math.sin((double) class29.field474 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field9224 = class303.field4293;
        arg1.field9177 = 5;
        arg1.field9293 = class741.method4125((byte) 85, class472.field6475.field5334);
        arg1.field9237 = class472.field6475.field10301;
        arg1.field9189 = 0;
        arg1.field9203 = class472.field6475.field10247;
        arg1.field9192 = class472.field6475.field10261;
        class456 var2 = arg1.field9203 == -1 ? null : class509.field6780.method663((byte) -90, arg1.field9203);
        if (var2 != null) {
            class532.method2965(var2, false, arg1.field9192);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "([FBI)[F", line = 44)
    public static final float[] method624(float[] arg0, byte arg1, int arg2) {
        if (arg1 != -122) {
            method624(null, (byte) 10, -103);
        }
        field952++;
        float[] var3 = new float[arg2];
        class335.method2018(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method625(int arg0, int arg1, int arg2) {
        if (arg1 == -19107) {
            field950++;
            return class606.method3294(arg0, 0, arg2) || class439.method2531(arg0, arg1 ^ 0xFFFFB513, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V", line = 76)
    public static void method626(int arg0) {
        if (arg0 == 22580) {
            field953 = null;
        }
    }
}
