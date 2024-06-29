import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lan;")
    public static class20 field704 = new class20(512);

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "[Lwg;")
    public static class291[] field707 = new class291[14];

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lf;")
    public static class529 field705;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field706;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        field705 = null;
        field706 = null;
        field704 = null;
        if (arg0 != 23446) {
            method385(104, true);
        }
        field707 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)S")
    public static final short method385(int arg0, boolean arg1) {
        if (arg1) {
            return 94;
        }
        field701++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x380) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIILmq;)V")
    public static final void method386(boolean arg0, int arg1, int arg2, class350 arg3) {
        field703++;
        class381 var4 = arg3.method2218((byte) 72, class4.field109);
        if (!arg0 || var4 == null) {
            return;
        }
        class4.field109.method298(arg2, arg1, arg2 + arg3.field5329, arg1 - -arg3.field5269);
        if (class128.field2030 >= 3) {
            class4.field109.method270(-16777216, var4, arg2, arg1);
        } else {
            class77.field1301.method3136((float) arg3.field5329 / 2.0F + (float) arg2, (float) arg3.field5269 / 2.0F + (float) arg1, 4096, ((int) (-class526.field7779) & 0x3FFF) << 2, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLbu;)V")
    public static final void method387(byte arg0, class17 arg1) {
        field702++;
        class430.field6402 = arg1;
        int var2 = 110 / ((-arg0 - 31) / 32);
    }
}
