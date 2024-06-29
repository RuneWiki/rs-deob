import java.awt.datatransfer.Clipboard;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class135 extends class212 {

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1653 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "B")
    public byte field1646;

    @OriginalMember(owner = "client!fca", name = "E", descriptor = "F")
    public static float field1655;

    @OriginalMember(owner = "client!fca", name = "F", descriptor = "F")
    public static float field1656;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "Lkr;")
    public static class329 field1650;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "Lge;")
    public class551 field1649;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1645;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)I")
    public final int method709(byte arg0) {
        if (arg0 != -2) {
            field1645 = null;
        }
        ++field1652;
        return this.field1649 == null ? 0 : this.field1649.field7707 * 100 / (this.field1649.field7693.length + -this.field1646);
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1645 = null;
        field1653 = null;
        field1650 = null;
        if (arg0 >= -21) {
            field1645 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIBI)V")
    public static final void method711(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 78) {
            method711(-92, -14, (byte) -73, 117);
        }
        int var4 = class501.field6954.field7851 * arg0 >> 8;
        ++field1648;
        if (arg3 == -1 && !class54.field726) {
            class552.method3095(1);
        } else if (arg3 != -1 && (~class325.field4460 != ~arg3 || !class585.method3376(false)) && var4 != 0 && !class54.field726) {
            class528.method2940(arg1, 0, arg3, var4, (byte) 100, class251.field3143, false);
        }
        class325.field4460 = arg3;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)[B")
    public final byte[] method712(byte arg0) {
        if (arg0 < 44) {
            return null;
        } else {
            ++field1647;
            if (!super.field2732 && this.field1649.field7707 >= this.field1649.field7693.length - this.field1646) {
                return this.field1649.field7693;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
