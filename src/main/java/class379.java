import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class379 {

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lvp;")
    public static class123 field5656;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[S")
    public static short[] field5650;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[[B")
    public static byte[][] field5653;

    static {
        new class180("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field5655 = 0;
        field5656 = new class123(12, 6);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Lnc;", line = 3)
    public static final class21 method2401(byte arg0, int arg1) {
        field5651++;
        class21[] var2 = class96.method763((byte) -126);
        if (arg0 != -96) {
            field5656 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class21 var4 = var2[var3];
            if (var4.field302 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)Z", line = 33)
    public static final boolean method2402(int arg0, int arg1, byte arg2) {
        field5654++;
        if (arg2 != -81) {
            method2405(-107);
        }
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 44)
    public static void method2403(boolean arg0) {
        field5656 = null;
        field5650 = null;
        field5653 = null;
        if (arg0) {
            field5655 = 126;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILps;II)V", line = 56)
    public static final void method2404(int arg0, class62 arg1, int arg2, int arg3) {
        if (arg1.field320 == arg0 && arg0 != -1) {
            class357 var4 = class311.field4455.method1233(true, arg0);
            int var5 = var4.field5404;
            if (var5 == 1) {
                arg1.field345 = arg2;
                arg1.field348 = 1;
                arg1.field383 = 0;
                arg1.field322 = 0;
                arg1.field307 = 0;
                class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field322, var4, class95.field1558 == arg1, arg1.field5529);
            }
            if (var5 == 2) {
                arg1.field307 = 0;
            }
        } else if (arg0 == -1 || arg1.field320 == -1 || class311.field4455.method1233(true, arg0).field5389 >= class311.field4455.method1233(true, arg1.field320).field5389) {
            arg1.field411 = arg1.field412;
            arg1.field345 = arg2;
            arg1.field307 = 0;
            arg1.field383 = 0;
            arg1.field320 = arg0;
            arg1.field348 = 1;
            arg1.field322 = 0;
            if (arg1.field320 != -1) {
                class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field322, class311.field4455.method1233(true, arg1.field320), class95.field1558 == arg1, arg1.field5529);
            }
        }
        field5649++;
        int var6 = 76 % ((arg3 + 23) / 45);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 107)
    public static final void method2405(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class205.field2962[var1] = false;
        }
        field5648++;
        class97.field1568 = class180.field2734;
        class337.field5140 = class310.field4446;
        class76.field1273 = class430.field6262;
        class98.field1598 = arg0;
        class131.field2025 = 0;
        class63.field1118 = class291.field4175;
        class101.field1620 = class320.field4578;
        class227.field3339 = class207.field2983;
        class403.field5944 = 5;
        class258.field3726 = -1;
        class497.field7234 = 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lcp;", line = 150)
    public static final class507 method2406(int arg0, int arg1) {
        if (arg1 != 0) {
            field5656 = null;
        }
        field5652++;
        return class324.field4977 && arg0 >= class57.field827 && class244.field3529 >= arg0 ? class403.field5924[arg0 - class57.field827] : null;
    }
}
