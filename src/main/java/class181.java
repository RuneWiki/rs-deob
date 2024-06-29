import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class181 {

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field2749 = 1;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lmu;")
    public static class303 field2747 = new class303(114, 4);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZBI)V", line = 4)
    public static final void method1329(boolean arg0, byte arg1, int arg2) {
        if (arg1 > -61) {
            field2747 = null;
        }
        field2748++;
        if (arg0) {
            class564 var3 = class227.method1594(class401.field5909, class72.field1320, -126);
            var3.field7778.method1485((byte) 107, arg2);
            class167.method1260(42, var3);
        } else {
            class83.method784(class119.field2012, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 28)
    public static void method1330(int arg0) {
        field2747 = null;
        if (arg0 != 114) {
            field2749 = 87;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lcea;B)Lnha;", line = 38)
    public static final class323 method1331(class215 arg0, byte arg1) {
        field2751++;
        int var2 = arg0.method1535(255);
        class95 var3 = class590.method3368(87)[arg0.method1535(255)];
        class236 var4 = class554.method3187(20000)[arg0.method1535(255)];
        int var5 = arg0.method1520(13638);
        int var6 = arg0.method1520(13638);
        int var7 = arg0.method1478(842397944);
        int var8 = arg0.method1478(842397944);
        int var9 = arg0.method1533((byte) -126);
        int var10 = arg0.method1533((byte) -126);
        int var11 = arg0.method1533((byte) -126);
        int var12 = -54 / ((arg1 + 45) / 61);
        boolean var13 = arg0.method1535(255) == 1;
        return new class323(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLha;)V", line = 71)
    public static final void method1332(boolean arg0, class59 arg1) {
        field2750++;
        if (class545.field7514) {
            class106.method961(arg1, 16);
        } else {
            class623.method3547((byte) 108, arg1);
        }
        if (arg0) {
            field2749 = -97;
        }
    }
}
