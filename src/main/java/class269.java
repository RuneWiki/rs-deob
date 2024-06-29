import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class269 extends class53 {

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    private int field4643;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4650 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Ldc;")
    public static class101 field4654;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "Loh;")
    public static class15 field4652;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Lie;")
    public static class80 field4645;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILja;Z)V", line = 9)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            field4645 = (class80) null;
        }
        field4648++;
        if (arg0 == 0) {
            this.field4643 = (arg1.method501(0) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 40)
    public static void method1927(int arg0) {
        field4652 = null;
        if (arg0 != -1) {
            method1929(101);
        }
        field4650 = null;
        field4654 = null;
        field4645 = null;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(III)Lbe;", line = 57)
    public static final class282 method1928(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class282 var4 = var3.field4095;
            var3.field4095 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[I", line = 77)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            return (int[]) null;
        }
        field4649++;
        int[] var3 = this.field878.method1603(arg1, (byte) 124);
        if (this.field878.field3749) {
            class231.method1691(var3, 0, field4644, this.field4643);
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V", line = 101)
    private class269(int arg0) {
        super(0, true);
        this.field4643 = 4096;
        this.field4643 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)Z", line = 115)
    public static final boolean method1929(int arg0) {
        if (arg0 >= -9) {
            field4644 = -91;
        }
        field4646++;
        return class139.field2413 == 0 ? class279.field4841.method966((byte) -128) : true;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)I", line = 133)
    public static final int method1930(int arg0, int arg1) {
        field4647++;
        if (arg0 != 1699) {
            field4654 = (class101) null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 144)
    public class269() {
        this(4096);
    }
}
