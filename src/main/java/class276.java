import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class276 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lwa;")
    public final class269 field4638;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public final int field4644;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field4640 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lhi;")
    public static class82 field4642 = class95.method664((byte) -92, "settings");

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lhi;")
    public static class82 field4643 = class95.method664((byte) -60, ":trade:");

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[Z")
    public static boolean[] field4639 = new boolean[100];

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[[Lih;")
    public static class309[][] field4646 = new class309[13][13];

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static volatile int field4645 = -1;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4647 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)Lhi;", line = 32)
    public static final class82 method1923(boolean arg0, int arg1) {
        field4641++;
        if (arg0) {
            method1924((byte) -93);
        }
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class82 var2 = new class82();
        var2.field1468 = 1;
        var2.field1419 = new byte[1];
        var2.field1419[0] = (byte) arg1;
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V", line = 62)
    public class276(int arg0, int arg1) {
        this.field4638 = class307.method2120(1, arg0);
        this.field4644 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 79)
    public static void method1924(byte arg0) {
        field4646 = (class309[][]) null;
        field4642 = null;
        field4639 = null;
        field4647 = null;
        if (arg0 != 117) {
            method1923(true, -65);
        }
        field4643 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lwa;I)V", line = 94)
    public class276(class269 arg0, int arg1) {
        this.field4638 = arg0;
        this.field4644 = arg1;
    }
}
