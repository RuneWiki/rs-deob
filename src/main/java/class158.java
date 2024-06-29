import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class158 {

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field3193 = 0;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field3201 = 0;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3197 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Led;")
    public static class43 field3199 = class191.method1219("<img=1>", false);

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[[[I")
    public static int[][][] field3203 = new int[4][105][105];

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[I")
    public static int[] field3202 = new int[32768];

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3206 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lka;")
    public class92 field3190;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lka;")
    public class92 field3195;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method997(int arg0, int arg1) {
        field3192++;
        if (arg0 != 1616457584) {
            return;
        }
        for (class30 var2 = (class30) class86.field1674.method76(126); var2 != null; var2 = (class30) class86.field1674.method79((byte) 76)) {
            if ((var2.field1353 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method417(100);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method998(byte arg0) {
        field3202 = null;
        field3197 = null;
        field3199 = null;
        field3203 = null;
        if (arg0 > -73) {
            method997(-97, -49);
        }
    }
}
