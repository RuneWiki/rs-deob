import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class716 {

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "Lro;")
    private class2 field9865;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "Lku;")
    public static class380 field9864 = new class380();

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "Lhda;")
    public static class752 field9871 = new class752(48, -2);

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lpb;")
    private class656 field9866;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILro;)V", line = 5)
    public final void method4007(int arg0, class2 arg1) {
        this.field9865 = arg1;
        if (arg0 == -2) {
            field9870++;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)[Lht;", line = 19)
    public static final class582[] method4008(int arg0) {
        int var1 = -83 % ((-arg0 - 68) / 49);
        field9869++;
        return new class582[] { class348.field4887, class719.field10015, class172.field2633, class99.field1267, class432.field5946, class436.field6012, class375.field5198, class422.field5816, class307.field4424, class599.field7851, class256.field3516, class470.field6437, class631.field8409, class9.field164, class306.field4405 };
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V", line = 30)
    public class716() {
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V", line = 34)
    public static void method4009(byte arg0) {
        field9871 = null;
        int var1 = -108 % ((32 - arg0) / 35);
        field9864 = null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)Lpb;", line = 44)
    public final class656 method4010(boolean arg0) {
        field9868++;
        if (!arg0) {
            this.field9865 = null;
        }
        class656 var2 = this.field9865.field24.field8677;
        if (this.field9865.field24 == var2) {
            this.field9866 = null;
            return null;
        } else {
            this.field9866 = var2.field8677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)Lpb;", line = 70)
    public final class656 method4011(byte arg0) {
        if (arg0 > -114) {
            this.method4011((byte) 11);
        }
        field9867++;
        class656 var2 = this.field9866;
        if (this.field9865.field24 == var2) {
            this.field9866 = null;
            return null;
        } else {
            this.field9866 = var2.field8677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lro;)V", line = 90)
    public class716(class2 arg0) {
        this.field9865 = arg0;
    }
}
