import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class37 extends class559 {

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field500 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "B")
    public byte field506;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Les;")
    public class630 field505;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class263.field3294 >= ~arg6 && class314.field4052 >= arg0 && class289.field3595 <= arg1 && ~arg3 >= ~class159.field2063) {
            if (arg5 == 1) {
                class513.method2773(arg1, arg6, arg2, arg3, arg0, (byte) -63);
            } else {
                class163.method934(arg2, arg1, false, arg6, arg0, arg5, arg3);
            }
        } else if (arg5 == 1) {
            class531.method2882(arg6, arg2, -56, arg1, arg0, arg3);
        } else {
            class7.method54(arg6, arg0, arg2, arg3, arg5, arg1, true);
        }
        if (arg4 == 376) {
            ++field504;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)I")
    public final int method229(byte arg0) {
        if (arg0 != -69) {
            this.field502 = 43;
        }
        ++field499;
        return this.field505 == null ? 0 : this.field505.field8812 * 100 / (this.field505.field8804.length - this.field506);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method230(int arg0) {
        if (arg0 == 11216) {
            field500 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z")
    public static final boolean method231(int arg0, int arg1, int arg2) {
        ++field501;
        return arg0 != 1 ? true : class554.method3054((byte) 75, arg2, arg1) & class381.method2063(arg1, (byte) -124, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)[B")
    public final byte[] method232(byte arg0) {
        if (arg0 <= 104) {
            return null;
        } else {
            ++field503;
            if (!super.field7755 && this.field505.field8804.length + -this.field506 <= this.field505.field8812) {
                return this.field505.field8804;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
