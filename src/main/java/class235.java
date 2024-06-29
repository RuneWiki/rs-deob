import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class235 {

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "[I")
    public static int[] field3297;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Z")
    public static boolean field3298;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[S")
    public static short[] field3293;

    static {
        new class362("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field3297 = new int[3];
        field3295 = 100;
        field3298 = false;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1550(int arg0, int arg1) {
        class237 var2 = class255.field3677;
        synchronized (class255.field3677) {
            class255.field3677.method1629(arg1, arg0 + 31378);
        }
        field3290++;
        class237 var3 = class150.field1839;
        synchronized (class150.field1839) {
            class150.field1839.method1629(arg1, arg0 ^ 0xFFFF85B3);
        }
        class237 var4 = class305.field4284;
        synchronized (class305.field4284) {
            class305.field4284.method1629(arg1, arg0 ^ 0xFFFF85D0);
            if (arg0 != -31261) {
                method1550(-56, 48);
            }
        }
        class237 var5 = class425.field6071;
        synchronized (class425.field6071) {
            class425.field6071.method1629(arg1, 106);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 28)
    public static void method1551(int arg0) {
        field3297 = null;
        if (arg0 != 0) {
            method1552(-103);
        }
        field3293 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V", line = 39)
    public static final void method1552(int arg0) {
        class237 var1 = class50.field595;
        synchronized (class50.field595) {
            class50.field595.method1626((byte) 106);
        }
        field3289++;
        class237 var2 = class247.field3528;
        synchronized (class247.field3528) {
            class247.field3528.method1626((byte) 106);
        }
        if (arg0 == 1023) {
            class237 var3 = class265.field3773;
            synchronized (class265.field3773) {
                class265.field3773.method1626((byte) 106);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBII)I", line = 59)
    public static final int method1553(int arg0, byte arg1, int arg2, int arg3) {
        field3291++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else {
            int var5 = 5 % ((arg1 - 20) / 35);
            return var4 == 2 ? 1023 - arg3 : arg0;
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V", line = 85)
    public static final void method1554(int arg0) {
        field3292++;
        if (class399.field5692 == null) {
            return;
        }
        if (arg0 >= -84) {
            field3297 = null;
        }
        while (true) {
            while (class385.field5435 < class355.field5009.length) {
                class130 var1 = class355.field5009[class385.field5435];
                if (var1 != null && var1.field1581 == -1) {
                    if (class101.field1234 == null) {
                        class101.field1234 = class399.field5692.method705(var1.field1586, (byte) -65);
                    }
                    int var2 = class101.field1234.field273;
                    if (var2 == -1) {
                        return;
                    }
                    class385.field5435++;
                    class101.field1234 = null;
                    var1.field1581 = var2;
                } else {
                    class385.field5435++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 130)
    public static final void method1555(byte arg0) {
        field3294++;
        int var1 = -1;
        if (arg0 < 2) {
            return;
        }
        while (var1 < class305.field4287) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class94.field1135[var1];
            }
            class40 var3 = class26.field314[var2];
            if (var3 != null) {
                class432.method2710(var3, 128, var3.method242(-30129));
            }
            var1++;
        }
    }
}
