import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class45 {

    @OriginalMember(owner = "client!cja", name = "h", descriptor = "J")
    public long field683;

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "Ljava/lang/String;")
    public String field680;

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!cja", name = "g", descriptor = "Ljava/lang/String;")
    public String field682;

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!cja", name = "f", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!cja", name = "i", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!cja", name = "j", descriptor = "Loja;")
    public static class480 field685;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V")
    public static final void method347(byte arg0) {
        field679++;
        class648.field9000 = null;
        if (arg0 != 95) {
            return;
        }
        class648.field9002 = null;
        class688.field9677 = null;
        class718.field10013 = null;
        class705.field9890 = null;
        class391.field5714 = null;
        class351.field5154 = null;
        class162.field2208 = null;
        class106.field1462 = null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Laj;IZIJIII)V")
    public static final void method348(class333 arg0, int arg1, boolean arg2, int arg3, long arg4, int arg5, int arg6, int arg7) {
        class636.field8868 = arg6;
        class311.field4478 = 10000;
        if (arg3 != -17838) {
            method349((byte) 73);
        }
        class482.field6670 = arg2;
        field684++;
        class752.field10420 = arg7;
        class685.field9629 = arg1;
        class99.field1374 = 1;
        class633.field8849 = null;
        class549.field7445 = arg0;
        class300.field4348 = arg5;
        class193.field2586 = arg4;
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)V")
    public static void method349(byte arg0) {
        field685 = null;
        if (arg0 > -78) {
            field685 = null;
        }
    }

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class45(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field683 = arg4;
        this.field680 = arg1;
        this.field677 = arg0;
        this.field682 = arg3;
        this.field678 = arg2;
    }
}
