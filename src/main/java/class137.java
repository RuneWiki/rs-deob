import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class137 extends class282 {

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2379 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "[[I")
    public static int[][] field2383 = new int[104][104];

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Lpm;")
    public static class103 field2377;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "Lea;")
    public static class205 field2382;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[Lmh;")
    public static class136[] field2376;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method934(byte arg0, int arg1) {
        class189.field3304 = -1;
        if (arg0 != -97) {
            field2376 = (class136[]) null;
        }
        class189.field3304 = -1;
        class42.field768 = arg1;
        field2378++;
        class22.method211(103);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLek;)V", line = 37)
    public static final void method935(byte arg0, class185 arg1) {
        if (arg0 < 12) {
            method934((byte) 5, 97);
        }
        field2381++;
        class179.field3097 = arg1.method1292(class141.field2452, (byte) 102);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V", line = 66)
    public static void method936(int arg0) {
        if (arg0 != -1) {
            field2376 = (class136[]) null;
        }
        field2377 = null;
        field2379 = null;
        field2376 = null;
        field2383 = (int[][]) null;
        field2382 = null;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Z")
    public abstract boolean method605(int arg0);

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method604(int arg0);
}
