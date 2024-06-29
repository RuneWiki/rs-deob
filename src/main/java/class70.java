import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class70 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1205 = 100;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Z")
    public static boolean field1206 = true;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[J")
    public static long[] field1204 = new long[32];

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1211 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lmc;")
    public static class165 field1209;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lpi;")
    public static class181 field1208;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[I")
    public static int[] field1210;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method503(int arg0, byte arg1) {
        if (arg1 < 11) {
            field1211 = null;
        }
        field1207++;
        if (arg0 == 100 && class168.field2962 > 0) {
            byte[] var2 = class166.field2936[--class168.field2962];
            class166.field2936[class168.field2962] = null;
            return var2;
        } else if (arg0 == 5000 && class142.field2592 > 0) {
            byte[] var3 = class108.field2023[--class142.field2592];
            class108.field2023[class142.field2592] = null;
            return var3;
        } else if (arg0 == 30000 && class24.field366 > 0) {
            byte[] var4 = class131.field2391[--class24.field366];
            class131.field2391[class24.field366] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method504(int arg0) {
        field1211 = null;
        field1209 = null;
        field1204 = null;
        if (arg0 <= 36) {
            method503(14, (byte) -127);
        }
        field1210 = null;
        field1208 = null;
    }
}
