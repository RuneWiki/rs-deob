import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class31 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lma;")
    private static class5 field487 = class12.method119("Type", (byte) 122);

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
    public static volatile boolean field489 = true;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Z")
    public static boolean field486 = true;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lma;")
    public static class5 field483 = field487;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lje;")
    public static class158 field491;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[Lpk;")
    public static class74[] field485;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lma;BZ)V", line = 8)
    public static final void method215(class5 arg0, byte arg1, boolean arg2) {
        field492++;
        if (arg2) {
            if (class219.field3548) {
                try {
                    class199.method1310("openjs", (byte) -23, new Object[] { arg0.method42(class240.field3982.getCodeBase(), (byte) 126).toString() }, class267.field4597.field2262);
                    return;
                } catch (Throwable var8) {
                }
            }
            try {
                class240.field3982.getAppletContext().showDocument(arg0.method42(class240.field3982.getCodeBase(), (byte) 126), "_blank");
            } catch (Exception var6) {
            }
        } else {
            try {
                class240.field3982.getAppletContext().showDocument(arg0.method42(class240.field3982.getCodeBase(), (byte) 126), "_top");
            } catch (Exception var7) {
            }
        }
        if (arg1 < 40) {
            field489 = false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 58)
    public static void method216(int arg0) {
        field491 = null;
        field487 = null;
        field485 = null;
        if (arg0 != 5581) {
            method215((class5) null, (byte) -109, false);
        }
        field483 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z", line = 78)
    public static final boolean method217(int arg0) {
        if (arg0 != 5212) {
            return false;
        }
        field488++;
        if (class76.field1191 != 0) {
            try {
                class196.field3052.method31(class267.field4597.field2262, 0);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V", line = 106)
    public static final void method218(int arg0) {
        class287.field4838 = 0;
        class168.field2554 = 0;
        int var1 = 15 / ((arg0 - 14) / 52);
        class214.method1409(-78);
        class117.method790(-9984);
        field484++;
        class126.method835(-1419);
        for (int var2 = 0; var2 < class168.field2554; var2++) {
            int var3 = class249.field4128[var2];
            if (class50.field784 != class119.field1804[var3].field217) {
                if (class119.field1804[var3].field2699.method1949(true)) {
                    class138.method897((byte) 89, class119.field1804[var3]);
                }
                class119.field1804[var3].field2699 = null;
                class119.field1804[var3] = null;
            }
        }
        if (class171.field2625 != class200.field3184.field3610) {
            throw new RuntimeException("gnp1 pos:" + class200.field3184.field3610 + " psize:" + class171.field2625);
        }
        for (int var4 = 0; var4 < class129.field1940; var4++) {
            if (class119.field1804[class73.field1153[var4]] == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class129.field1940);
            }
        }
    }
}
