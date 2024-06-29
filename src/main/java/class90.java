import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class90 extends class301 {

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Lmg;")
    public class176 field1605;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Lbo;")
    public static class347 field1608;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 7)
    public static void method692(int arg0) {
        field1608 = null;
        if (arg0 < 24) {
            method692(54);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 18)
    public static final String method693(byte arg0, int arg1) {
        field1607++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        int var4 = 103 % ((arg0 - 46) / 46);
        if (var2.length() <= 9) {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class232.field3800 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class36.field793 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lmg;)V", line = 46)
    public class90(class176 arg0) {
        this.field1605 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V", line = 57)
    public static final void method694(int arg0) {
        field1606++;
        if (arg0 != 3) {
            field1608 = (class347) null;
        }
        class192.field3251.method889((byte) 35);
    }
}
