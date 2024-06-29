import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class107 extends class137 {

    @OriginalMember(owner = "client!mp", name = "Q", descriptor = "Z")
    public static boolean field1594 = true;

    @OriginalMember(owner = "client!mp", name = "S", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1596 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!mp", name = "U", descriptor = "J")
    public static volatile long field1598 = 0L;

    @OriginalMember(owner = "client!mp", name = "V", descriptor = "Lgo;")
    public static class310 field1599 = null;

    @OriginalMember(owner = "client!mp", name = "R", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!mp", name = "T", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!mp", name = "P", descriptor = "Laf;")
    public static class122 field1593;

    @OriginalMember(owner = "client!mp", name = "W", descriptor = "Ljm;")
    public static class210 field1600;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBI)I", line = 6)
    public static final int method806(int arg0, byte arg1, int arg2) {
        field1595++;
        if (arg1 < 104) {
            field1598 = 126L;
        }
        return arg2 == 1 || arg2 == 3 ? class316.field4891[arg0 & 0x3] : class402.field6069[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIBZ)V", line = 22)
    public static final void method807(int arg0, int arg1, byte arg2, boolean arg3) {
        field1597++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class208.field3009 = arg1;
        class219.field3142 = arg0;
        if (arg2 >= -20) {
            method807(52, -35, (byte) -78, false);
        }
        class116.field1749 = arg3;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V", line = 50)
    public static void method808(int arg0) {
        if (arg0 != 3) {
            method806(-65, (byte) 105, -51);
        }
        field1600 = null;
        field1593 = null;
        field1599 = null;
        field1596 = null;
    }
}
