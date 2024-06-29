import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class645 {

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "F")
    public static float field9149;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Lpaa;")
    public static class712 field9150;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3738(String arg0, byte arg1) {
        if (class688.field9646 == null) {
            class112.method751((byte) 93);
        }
        field9147++;
        if (arg1 != -49) {
            field9149 = -0.76504683F;
        }
        class332.field4261.setTime(new Date(class224.method1457((byte) -62)));
        int var2 = class332.field4261.get(11);
        int var3 = class332.field4261.get(12);
        int var4 = class332.field4261.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class498.method2984(arg0, '\n', -97);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class30.field436; var8 > 0; var8--) {
                class688.field9646[var8] = class688.field9646[var8 - 1];
            }
            class688.field9646[0] = var5 + ": " + var6[var7];
            if (class283.field3758 != null) {
                try {
                    class283.field3758.write(class356.method2014(class688.field9646[0] + "\n", (byte) -24));
                } catch (IOException var9) {
                }
            }
            if (class688.field9646.length - 1 > class30.field436) {
                class30.field436++;
                if (class196.field2824 > 0) {
                    class196.field2824++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLqc;Z)V")
    public static final void method3739(byte arg0, class379 arg1, boolean arg2) {
        if (arg0 < 45) {
            return;
        }
        class510.field7114.method3143((byte) -41, arg1);
        field9145++;
        if (arg2) {
            class17.method85(class445.field6084, class510.field7114, (byte) 118, class91.field1237, arg1, class264.field3590);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZBLpaa;)V")
    public static final void method3740(boolean arg0, byte arg1, class712 arg2) {
        field9146++;
        int var3 = 54 % ((arg1 - 31) / 41);
        int var4 = arg2.field10097 == 0 ? arg2.field9966 : arg2.field10097;
        int var5 = arg2.field10002 == 0 ? arg2.field10011 : arg2.field10002;
        class675.method3868(var4, var5, (byte) -122, class491.field6599[arg2.field9998 >> 16], arg2.field9998, arg0);
        if (arg2.field9981 != null) {
            class675.method3868(var4, var5, (byte) -120, arg2.field9981, arg2.field9998, arg0);
        }
        class14 var6 = (class14) class426.field5894.method1381(true, (long) arg2.field9998);
        if (var6 != null) {
            class101.method685(var5, true, arg0, var6.field194, var4);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
    public static final void method3741(int arg0, int arg1) {
        field9144++;
        class352.field4523.method3204((byte) 78, arg0);
        class555.field7836.method3204((byte) 113, arg0);
        class678.field9542.method3204((byte) 85, arg0);
        class694.field9695.method3204((byte) 75, arg0);
        if (arg1 <= 74) {
            field9148 = -71;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V")
    public static void method3742(boolean arg0) {
        if (arg0) {
            field9150 = null;
        }
    }
}
