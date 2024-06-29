import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class286 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
    public static boolean field4681 = false;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public int field4690;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "J")
    public long field4680;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lkm;")
    public class162 field4686;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lkm;")
    public class162 field4687;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lkm;")
    public class162 field4691;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Le;")
    public static class248 field4689;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Ljava/lang/String;", line = 5)
    public static final String method2018(int arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        for (int var3 = arg0 + var2.length(); var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        field4683++;
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class20.field244 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class209.field3162 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 39)
    public static final void method2019(int arg0) {
        if (arg0 < 90) {
            method2021((byte) 1);
        }
        field4688++;
        class290.field4817.method651(0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method2020(boolean arg0) {
        if (!arg0) {
            field4681 = false;
        }
        class305.field4991.method644((byte) -61);
        class279.field4594.method644((byte) -85);
        field4684++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 70)
    public static void method2021(byte arg0) {
        field4689 = null;
        if (arg0 <= 20) {
            field4681 = true;
        }
    }
}
