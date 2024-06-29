import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class103 {

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1419 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "Lcv;")
    public static class570 field1422;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V", line = 9)
    public static void method818(boolean arg0) {
        field1419 = null;
        field1422 = null;
        if (arg0) {
            method818(true);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIB)I", line = 27)
    public static final int method819(int arg0, int arg1, byte arg2) {
        field1421++;
        if (class180.field2534 == -1) {
            return 1;
        }
        if (arg0 != class748.field10451.field10399.method1924((byte) 60)) {
            class555.method3208((byte) 86, true, arg0, class454.field6016.method2547(-83, class243.field3143));
            if (arg0 != class748.field10451.field10399.method1924((byte) -70)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class262.field3311.getSize();
            class163.method1139(class372.field4774, class386.field4930, 103, true, class697.field9708, class454.field6016.method2547(-126, class243.field3143));
            class714 var4 = class637.method3572(class220.field2956, class180.field2534, 4, 0);
            long var5 = class446.method2525(500);
            class386.field4930.method446();
            class651.field9066.method596(0, class139.field1991, 0);
            class386.field4930.method505(class651.field9066);
            if (arg2 > -49) {
                return 127;
            }
            class386.field4930.method437(var3.width / 2, var3.height / 2, 512, 512);
            class386.field4930.method511(1.0F);
            class386.field4930.method548(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class474 var7 = class386.field4930.method540(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class386.field4930.method462(0);
                class386.field4930.method512();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class14.field271.method596((int) (((float) var11 - (float) var10 / 2.0F) * (float) class699.field9729), 0, (var10 + 1) * class699.field9729);
                        var7.method250(class14.field271, null, 0);
                        var8++;
                        if (class446.method2525(500) - var5 >= (long) arg1) {
                            break label45;
                        }
                    }
                }
            }
            class386.field4930.method469();
            long var12 = (long) (var8 * 1000) / (class446.method2525(500) - var5);
            class386.field4930.method462(0);
            class386.field4930.method512();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lsl;I)Lek;", line = 112)
    public static final class510 method820(class461 arg0, int arg1) {
        field1420++;
        class452 var2 = class649.method3640(arg0, 1);
        int var3 = arg0.method2566(-2);
        int var4 = arg0.method2566(-2);
        int var5 = arg0.method2566(-2);
        int var6 = arg0.method2566(-2);
        int var7 = arg0.method2566(-2);
        int var8 = arg0.method2566(-2);
        return arg1 == 512 ? new class510(var2.field5981, var2.field5979, var2.field5983, var2.field5985, var2.field5988, var2.field5978, var2.field5987, var2.field5980, var2.field5976, var3, var4, var5, var6, var7, var8) : null;
    }
}
