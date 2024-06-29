import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 {

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1132 = new BigInteger("a385db0c32fd1ceb82ffc3a5b96c3943f75295ed14a8990bce0163a2d034591ea2da1bca5ca71b2bccfbad862a9dd44f656f22a438423ea816e1e327fc5dd56f", 16);

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "Lda;")
    public static class67 field1137;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "[[I")
    public static int[][] field1135;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public static void method671(int arg0) {
        field1137 = null;
        field1135 = null;
        field1132 = null;
        if (arg0 != 16) {
            field1137 = null;
        }
    }
}
