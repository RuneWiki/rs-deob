import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class489 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Z")
    public static boolean field7136 = false;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljm;")
    public static class485 field7134 = new class485(43, -1);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method2869(int arg0) {
        field7135++;
        class244.field3395.field5069 = 0;
        class193.field2752 = 0;
        class207.field2937 = null;
        class158.field2250 = 0;
        class467.field6834 = null;
        class438.field6394 = 0;
        class374.field5274 = null;
        class497.field7324 = null;
        class387.field5435.field5069 = 0;
        class498.method2938(-125);
        class43.method273((byte) -128);
        for (int var1 = 0; var1 < 2048; var1++) {
            class309.field4234[var1] = null;
        }
        class75.field1089 = null;
        for (int var2 = 0; var2 < class179.field2534.length; var2++) {
            class405 var4 = class179.field2534[var2];
            if (var4 != null) {
                var4.field289 = -1;
            }
        }
        class370.method2143(122);
        class128.field1742 = 1;
        class26.method186(30, 8);
        if (arg0 >= -52) {
            method2870(-66);
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class451.field6504[var3] = true;
        }
        class305.method1732((byte) 55);
        class284.field3820 = 0L;
        class138.field1984 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static void method2870(int arg0) {
        if (arg0 == 30) {
            field7134 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public static final void method2871(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class453.field6629 != null) {
            class453.field6629[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class171.field2451 != null) {
            class171.field2451[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class393.field5478 != null) {
            class393.field5478[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIII)V")
    public static final void method2872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < arg0) {
            class419.method2511(class225.field3174[arg4], arg1, arg3, arg0, 90);
        } else {
            class419.method2511(class225.field3174[arg4], arg0, arg3, arg1, -54);
        }
        if (arg2 != 0) {
            field7136 = true;
        }
        field7137++;
    }
}
