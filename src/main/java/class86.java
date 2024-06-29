import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class86 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Ldj;")
    public static class44 field1652 = class89.method650(255, "<col=00ff80>");

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Z")
    public static boolean field1658 = false;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ldj;")
    public static class44 field1654 = class89.method650(255, "3D)2Softwarebibliothek gestartet");

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Lqe;")
    public static class176 field1659;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[B")
    public byte[] field1646;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[B")
    public byte[] field1647;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)J")
    public static final long method640(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1300; var4++) {
            class106 var5 = var3.field1314[var4];
            if ((var5.field1953 >> 29 & 0x3L) == 2L && var5.field1945 == arg1 && var5.field1955 == arg2) {
                return var5.field1953;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method641(byte arg0) {
        field1652 = null;
        if (arg0 > 8) {
            field1654 = null;
            field1659 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ldj;B)V")
    public static final void method642(class44 arg0, byte arg1) {
        int var2 = -29 % ((arg1 - 52) / 60);
        field1655++;
        try {
            class216.field3926.getAppletContext().showDocument(arg0.method309(21195, class216.field3926.getCodeBase()), "_blank");
        } catch (Exception var3) {
        }
    }
}
