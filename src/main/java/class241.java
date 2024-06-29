import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class241 {

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3459 = new BigInteger("a27e459c22fa475a8598f6d13bdf80281e1ccc3ab1640d26b47189877fdd8ba48e3ae6557847ecc6763f845783331f7e0e36c9a666b98ba2f20de17de10d5efbd7ccdffdc628969be9df736f5156adff89438f274168b60372c5042dbc87b24fc994efda33adab9703d3e0d61f2bd9f9da2235104c39b78e693e179a139e150b6b2c84fd721475087d67f4342e86015e1a782dec8a0756c74058861a69734752e9e0759d1a6835b199eda87540f4cebadcb1ab77daa7ebe392547d73c54b46707b5ee66d18ce9de55d8093614b6ea603c07e8b830ebfd4d97b2b68d8b963ffc1c48b47c876f3efaefe6be2d424a5e78ff89db6ef98c955cef9bea9cd923b8e42241df938105224a68e45cdbdb13da56ddbbb03eb5744401ebbb559ec17b433df65ad1a50b05020c78bb0adc8cd98b288009d874ee7074ef78934678cc8d12b58466c0c47f23904041337e4b7cc0ce190614e186fe7f3ccc0d716db12cff9c7211d5a62b0fbab6eb2eba7242d839efdd668297e29d7a72352aec7ac15be60c2bd31651ebae3cab31c07f43041f5b80a85719b0ab6e717aa297a690bd1746f8bd21872b889172761665e87283e0581083892401e74a29ddb0d30b992d1633b5a894c3460defc315f0d6bca16883d714468621435061319300240f2bd1d7a63e489fed7535c76e888b395161f251799dcf53cc3dffb9506bf80525b018c55b9c567", 16);

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lsl;")
    public static class391 field3460 = new class391("", 17);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public static void method1535(byte arg0) {
        field3460 = null;
        field3459 = null;
        int var1 = 46 / ((-arg0 - 40) / 44);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static final void method1536(int arg0) {
        field3458++;
        class58.field738.method470(class198.field2924, class630.field9259, class138.field1966);
        if (arg0 != 9079) {
            field3460 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
    public static final void method1537(byte arg0) {
        field3461++;
        class595.method3521(true);
        class453.method2754(class56.field668.field6871, 2, 50, 22050);
        class645.field9389 = class25.method150(0, 16384, class79.field1069, 22050, class442.field5896);
        class645.field9389.method1570(class536.field7966, (byte) 44);
        if (arg0 != -76) {
            field3460 = null;
        }
        class92.field1377 = class25.method150(1, 16384, class79.field1069, 2048, class442.field5896);
        class92.field1377.method1570(class155.field2316, (byte) 38);
    }
}
