import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class66 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lof;")
    public static class103 field1577 = null;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lfc;")
    public static class39 field1578 = class90.method774("mapfunction", -97);

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lfc;")
    public static class39 field1579 = class90.method774("(U4", -119);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lfc;")
    private static class39 field1574 = class90.method774("Please wait)3)3)3", -120);

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lfc;")
    public static class39 field1576 = field1574;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lfc;")
    public static class39 field1575 = field1574;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lb;")
    public static class8 field1573;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lob;")
    public static class99 field1580;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z", line = 39)
    public static final boolean method631(int arg0, int arg1) {
        field1572++;
        if (class2.field53[arg1]) {
            return true;
        } else if (class53.field1338.method838(arg1, 49)) {
            int var2 = class53.field1338.method849((byte) -48, arg1);
            if (var2 == 0) {
                class2.field53[arg1] = true;
                return true;
            }
            if (class65.field1571[arg1] == null) {
                class65.field1571[arg1] = new class99[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class65.field1571[arg1][var3] == null) {
                    byte[] var4 = class53.field1338.method839(5, arg1, var3);
                    if (var4 != null) {
                        class65.field1571[arg1][var3] = new class99();
                        class65.field1571[arg1][var3].field2406 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class65.field1571[arg1][var3].method833(new class25(var4), 0);
                        } else {
                            class65.field1571[arg1][var3].method823(-5, new class25(var4));
                        }
                    }
                }
            }
            class2.field53[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 106)
    public static void method633(byte arg0) {
        field1573 = null;
        field1576 = null;
        field1578 = null;
        field1575 = null;
        field1580 = null;
        field1579 = null;
        field1574 = null;
        int var1 = -84 / ((arg0 + 54) / 46);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
    public abstract int method629(byte arg0);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method630(byte arg0, Component arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method632(Component arg0, int arg1);
}
