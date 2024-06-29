import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class1 extends class561 {

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "[B")
    public byte[] field1;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "Lcba;")
    public static class234 field5;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public static final void method1(int arg0) {
        field3++;
        if (arg0 <= 63) {
            method2(-66);
        }
        class588.field8516 = new class568();
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
    public static void method2(int arg0) {
        field5 = null;
        field2 = null;
        if (arg0 < 64) {
            field2 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "([B)V")
    public class1(byte[] arg0) {
        this.field1 = arg0;
    }
}
