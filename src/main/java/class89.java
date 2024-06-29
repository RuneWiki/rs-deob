import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class89 {

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1358 = "slide:";

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method599(int arg0) {
        if (class217.field3198 != null) {
            class217.field3198.method1457(true);
        }
        if (arg0 != 17857) {
            return;
        }
        field1354++;
        if (class240.field3599 != null) {
            class240.field3599.method1457(true);
        }
        method607(2, 22050, arg0 ^ 0x45C2, class195.field2797);
        class217.field3198 = class43.method297(22050, class163.field2378, class80.field1247, 256, 0);
        class217.field3198.method1450(class213.field3069, 2000);
        class240.field3599 = class43.method297(2048, class163.field2378, class80.field1247, 256, 1);
        class240.field3599.method1450(class152.field2201, 2000);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lqe;")
    public static final class162 method600(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1926; var4++) {
            class162 var5 = var3.field1908[var4];
            if ((var5.field2350 >> 29 & 0x3L) == 2L && var5.field2353 == arg1 && var5.field2357 == arg2) {
                class159.method1068(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V")
    public static final void method601(int arg0, boolean arg1) {
        field1357++;
        if (arg0 == -1 || !class159.method1072((byte) -14, arg0)) {
            return;
        }
        class267[] var2 = class19.field268[arg0];
        if (!arg1) {
            field1355 = 78;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class267 var4 = var2[var3];
            if (var4.field4132 != null) {
                class234 var5 = new class234();
                var5.field3531 = var4;
                var5.field3530 = var4.field4132;
                class121.method826(2000000, -127, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method602(int arg0, String arg1, int arg2) {
        if (arg2 != -26083) {
            method601(93, false);
        }
        field1353++;
        return class175.method1148((byte) 106, arg1, true, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method603(byte arg0) {
        class228.field3418.method260(0);
        field1361++;
        if (arg0 >= -120) {
            method607(-45, -40, -75, true);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static void method604(int arg0) {
        if (arg0 == 20867) {
            field1358 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public static final void method605(int arg0, int arg1) {
        field1363++;
        class240.field3602.method258(arg1, (byte) 97);
        if (arg0 != 1024) {
            method605(-30, -66);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)Z")
    public static final boolean method606(int arg0, byte arg1) {
        field1359++;
        if (arg1 == 75) {
            return arg0 >= 0 && class19.field270.length > arg0 ? class19.field270[arg0] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIZ)V")
    public static final void method607(int arg0, int arg1, int arg2, boolean arg3) {
        field1360++;
        if (arg2 != 3) {
            field1356 = 41;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class108.field1565 = arg0;
        class276.field4426 = arg1;
        class24.field323 = arg3;
    }
}
