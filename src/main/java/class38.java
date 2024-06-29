import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class38 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[[[I")
    public static int[][][] field627 = new int[2][][];

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lwm;")
    public static class152 field630 = class157.method1048("Veuillez commencer par supprimer ", 114);

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field632 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lwm;")
    public static class152 field633 = class157.method1048("Atteindre", 97);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lo;")
    public static class206 field636;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 14)
    public static void method275(int arg0) {
        field636 = null;
        field630 = null;
        if (arg0 == -24860) {
            field627 = (int[][][]) null;
            field633 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Z", line = 28)
    public static final boolean method276(byte arg0, int arg1) {
        if (arg0 != -93) {
            method280(-35, 39);
        }
        field628++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 43)
    public static final void method277(byte arg0) {
        if (arg0 < 90) {
            method276((byte) 127, -86);
        }
        field635++;
        if (class91.field1268 != null) {
            class195 var1 = class91.field1268;
            synchronized (class91.field1268) {
                class91.field1268 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 63)
    public static final void method278(int arg0) {
        if (arg0 > 25) {
            field629++;
            class284.field4831.method1613(-22696);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)Llm;", line = 104)
    public static final class49 method279(int arg0, boolean arg1) {
        field631++;
        class49 var2 = (class49) class106.field1507.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class262.field4459.method1381(class104.method702(arg0, (byte) -118), class291.method2020(arg0, 1023), 0);
        if (arg1) {
            return (class49) null;
        }
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method343(new class291(var3), -119);
        }
        class106.field1507.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lwm;", line = 129)
    public static final class152 method280(int arg0, int arg1) {
        if (arg0 <= 70) {
            return (class152) null;
        } else {
            field634++;
            return class216.method1451(-48, 10, arg1, false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)I")
    public abstract int method273(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public abstract void method274(byte arg0);
}
