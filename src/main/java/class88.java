import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class88 {

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lmt;")
    private class271 field1347 = new class271();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1338 = -1;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[J")
    public static long[] field1341 = new long[32];

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "J")
    public static long field1352;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lmt;")
    private class271 field1351;

    static {
        new class475("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field1352 = 0L;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lmt;", line = 3)
    public final class271 method511(int arg0) {
        field1349++;
        class271 var2 = this.field1347.field3939;
        if (arg0 < 76) {
            this.method518(2, null);
        }
        if (this.field1347 == var2) {
            return null;
        } else {
            var2.method1783((byte) -93);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 25)
    public final void method512(int arg0) {
        while (true) {
            class271 var2 = this.field1347.field3939;
            if (this.field1347 == var2) {
                if (arg0 != 2) {
                    this.field1351 = null;
                }
                field1345++;
                this.field1351 = null;
                return;
            }
            var2.method1783((byte) -127);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)V", line = 49)
    public static final void method513(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            class348.field5015 = class162.method1090(class364.field5570, arg2, class109.field1563, class483.field7077, class426.field6401.field982 * 2, false);
        } else {
            if (arg1) {
                class348.field5015 = class162.method1090(class364.field5570, 0, class109.field1563, class483.field7077, 0, false);
                class348.field5015.method1044(0);
                class275 var3 = class483.method2865(114, class105.field1522, class180.field2656, 0);
                class489 var4 = class348.field5015.method1081(var3, class408.method2460(class6.field81, class180.field2656, 0), true);
                class183.method1254(109, var4, class237.field3490.method2838(false, class143.field2137), true);
                class348.field5015.method1019();
                class150.method988(2056);
                class348.field5015.method1108(-7682);
            }
            try {
                class348.field5015 = class162.method1090(class364.field5570, arg2, class109.field1563, class483.field7077, class426.field6401.field982 * 2, false);
                if (class348.field5015.method1119()) {
                    class16 var5 = class348.field5015.method1028(78643200);
                    class348.field5015.method1117(var5);
                }
            } catch (Throwable var6) {
                arg2 = 0;
                class348.field5015 = class162.method1090(class364.field5570, 0, class109.field1563, class483.field7077, 0, false);
            }
        }
        field1350++;
        class170.field2529 = arg2;
        class420.method2528(false);
        if (!class348.field5015.method1079()) {
            class522.field7727 = 1;
        }
        class348.field5015.method1043(class522.field7727);
        class348.field5015.method1103(0);
        class348.field5015.method1022(8);
        class301.field4266 = class348.field5015.method1126();
        class447.field6667 = class348.field5015.method1126();
        class166.method1157((byte) -116);
        class348.field5015.method1070(!class426.field6401.field1004);
        if (class348.field5015.method1125()) {
            class427.method2560(class426.field6401.field980, (byte) -88);
        }
        class143.method952(class348.field5015, (byte) 106, class182.field2661 >> 3, class30.field323 >> 3);
        class407.method2449(-124);
        class526.field7788 = false;
        if (arg0 >= -46) {
            field1338 = -79;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Lmt;", line = 113)
    public final class271 method514(byte arg0) {
        field1342++;
        class271 var2 = this.field1347.field3939;
        if (arg0 <= 101) {
            field1341 = null;
        }
        if (this.field1347 == var2) {
            this.field1351 = null;
            return null;
        } else {
            this.field1351 = var2.field3939;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I", line = 135)
    public final int method515(int arg0) {
        field1353++;
        int var2 = arg0;
        class271 var3 = this.field1347.field3939;
        while (this.field1347 != var3) {
            var3 = var3.field3939;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)V", line = 164)
    public static final void method516(int arg0, long arg1) {
        field1346++;
        class356.field5471.field3037 = 0;
        class356.field5471.method1410(class46.field740.field4730, -27645);
        class356.field5471.method1411(arg0 + 2144512463, arg1);
        class434.field6502 = 0;
        client.field2856 = -3;
        class90.field1360 = arg0;
        class375.field5714 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 203)
    public class88() {
        this.field1347.field3939 = this.field1347;
        this.field1347.field3935 = this.field1347;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)Lmt;", line = 213)
    public final class271 method517(byte arg0) {
        field1344++;
        class271 var2 = this.field1351;
        if (this.field1347 == var2) {
            this.field1351 = null;
            return null;
        }
        if (arg0 != -119) {
            field1352 = -49L;
        }
        this.field1351 = var2.field3939;
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILmt;)V", line = 235)
    public final void method518(int arg0, class271 arg1) {
        field1354++;
        if (arg1.field3935 != null) {
            arg1.method1783((byte) -93);
        }
        if (arg0 != 0) {
            field1341 = null;
        }
        arg1.field3935 = this.field1347.field3935;
        arg1.field3939 = this.field1347;
        arg1.field3935.field3939 = arg1;
        arg1.field3939.field3935 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 254)
    public static void method519(int arg0) {
        if (arg0 == -14986) {
            field1341 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 264)
    public static final void method520(int arg0) {
        field1348++;
        if (arg0 > -1) {
            method520(-52);
        }
        int var1 = class74.field1105;
        int[] var2 = class272.field3948;
        for (int var3 = 0; var3 < var1; var3++) {
            class239 var4 = class44.field707[var2[var3]];
            if (var4 != null) {
                class199.method1354(-86, var4, var4.method847(-1));
            }
        }
    }
}
