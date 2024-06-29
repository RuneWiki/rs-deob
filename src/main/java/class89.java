import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class89 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[J")
    public static long[] field1505 = new long[100];

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lbe;")
    private static class283 field1509 = class153.method941(-115, "Created gameworld");

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lbe;")
    public static class283 field1508 = field1509;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lbe;")
    public static class283 field1514 = null;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[F")
    public static float[] field1510 = new float[4];

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1506 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Lbe;")
    public static class283 field1516 = class153.method941(125, "showVideoAd");

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 9)
    public static final void method575(byte arg0) {
        field1511++;
        if (arg0 < -18) {
            class270.field4564.method1636(116);
            class148.field2414.method1636(109);
            class30.field452.method1636(124);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 23)
    public static void method576(byte arg0) {
        field1506 = null;
        field1514 = null;
        field1510 = null;
        if (arg0 <= -116) {
            field1509 = null;
            field1516 = null;
            field1505 = null;
            field1508 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 45)
    public static final void method577(int arg0) {
        field1507++;
        class215.field3644.method1631(-27875);
        if (arg0 > -52) {
            method575((byte) -52);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BZ)V", line = 66)
    public static final void method578(byte arg0, boolean arg1) {
        class194.method1250(class82.field1397, arg0 - 121, class48.field655, arg1, class115.field1945);
        field1504++;
        if (arg0 != 122) {
            field1515 = -55;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)I", line = 82)
    public static final int method579(int arg0, boolean arg1) {
        field1512++;
        long var2 = class216.method1426(255);
        for (class254 var4 = arg1 ? (class254) class82.field1391.method1607(0) : (class254) class82.field1391.method1604((byte) -45); var4 != null; var4 = (class254) class82.field1391.method1604((byte) 126)) {
            if (var2 > (var4.field4288 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4288 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1445;
                    class6.field63[var5] = class67.field934[var5];
                    var4.method557((byte) -89);
                    return var5;
                }
                var4.method557((byte) -89);
            }
        }
        if (arg0 != 100) {
            field1514 = (class283) null;
        }
        return -1;
    }
}
