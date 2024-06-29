import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class561 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
    public static final void method3259(int arg0, boolean arg1) {
        field7991++;
        class638.field8978.method1950(class438.field6281.method493());
        int[] var2 = class438.field6281.method469();
        class117.field1459 = var2[1];
        class549.field7739 = var2[3];
        class122.field1590 = var2[0];
        class202.field2961 = var2[2];
        if (arg0 < 109) {
            method3260(null, -117);
        }
        if (arg1) {
            class438.field6281.method409(class704.field9919, class637.field8969, class554.field7886, class459.field6576);
            class403.method2434((byte) 127, class708.field9987);
        } else {
            class438.field6281.method409(class592.field8356, class161.field2375, class767.field10595, class99.field1256);
            class403.method2434((byte) 123, class599.field8441);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3260(String arg0, int arg1) {
        if (arg1 <= 43) {
            method3260(null, 32);
        }
        field7990++;
        if (class543.field7607 == null) {
            class426.method2535(0);
        }
        class173.field2449.setTime(new Date(class109.method731(63)));
        int var2 = class173.field2449.get(11);
        int var3 = class173.field2449.get(12);
        int var4 = class173.field2449.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class29.method214('\n', arg0, -106);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class636.field8960; var8 > 0; var8--) {
                class543.field7607[var8] = class543.field7607[var8 - 1];
            }
            class543.field7607[0] = var5 + ": " + var6[var7];
            if (class599.field8436 != null) {
                try {
                    class599.field8436.write(class328.method2122(true, class543.field7607[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if ((class543.field7607.length - 1) > class636.field8960) {
                class636.field8960++;
                if (class90.field1170 > 0) {
                    class90.field1170++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIIIII)V")
    public static final void method3261(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= class450.field6463 && class285.field4372 >= arg4 && arg5 >= class738.field10297 && arg3 <= class414.field5846) {
            class529.method3075(arg3, arg1, arg4, arg5, (byte) -4, arg2);
        } else {
            class657.method3762(arg2, arg5, -15, arg1, arg3, arg4);
        }
        field7992++;
        if (arg0 == -18) {
            ;
        }
    }
}
