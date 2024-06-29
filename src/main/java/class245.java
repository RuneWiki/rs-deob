import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class245 extends class258 {

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!qha", name = "q", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "J")
    private long field3364;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        int var3 = -21 / ((7 - arg0) / 41);
        field3365++;
        this.field3363 = arg1.method1497((byte) 103);
        this.field3364 = arg1.method1516(-11290);
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(II)V")
    public static final void method1601(int arg0, int arg1) {
        if (arg0 == 9) {
            field3361++;
            class614 var2 = class497.method2759(3, arg0 + 5968, (long) arg1);
            var2.method3279(false);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        field3362++;
        if (arg1 < 123) {
            this.method547(null, (byte) 20);
        }
        arg0.method3534((byte) 84, this.field3363, this.field3364);
    }
}
