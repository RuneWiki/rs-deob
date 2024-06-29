import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class93 {

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lmb;")
    private class147 field1356 = new class147();

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Ldh;")
    private class9 field1360 = new class9();

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Ldf;")
    private class231 field1366;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lqj;")
    public static class196 field1350 = class80.method502("l", -48);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[I")
    public static int[] field1367 = new int[100];

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field1362 = 0;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lqj;")
    public static class196 field1359 = class80.method502("(U1", -48);

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lnf;")
    public final class130 method570(int arg0) {
        if (arg0 == 0) {
            field1353++;
            return this.field1366.method1547(342);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    public static final void method571(int arg0, int arg1) {
        if (arg0 != 21601) {
            field1362 = -20;
        }
        field1354++;
        class62.field862.method1652(26532, new class206(arg1));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[Lqj;)Lqj;")
    public static final class196 method572(int arg0, class196[] arg1) {
        if (arg0 > -52) {
            return null;
        }
        field1357++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class166.method1073(arg1.length, arg1, -128, 0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method573(boolean arg0) {
        field1367 = null;
        field1359 = null;
        if (!arg0) {
            field1367 = null;
        }
        field1350 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JZLmb;)V")
    public final void method574(long arg0, boolean arg1, class147 arg2) {
        if (this.field1368 == 0) {
            class147 var5 = this.field1360.method43(-24852);
            var5.method797((byte) 127);
            var5.method920(-2);
            if (this.field1356 == var5) {
                class147 var6 = this.field1360.method43(-24852);
                var6.method797((byte) 116);
                var6.method920(-2);
            }
        } else {
            this.field1368--;
        }
        this.field1366.method1552(arg2, arg0, 0);
        field1352++;
        this.field1360.method33(arg2, (byte) -14);
        if (arg1) {
            method573(false);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Lmb;")
    public final class147 method575(int arg0, long arg1) {
        field1351++;
        if (arg0 != 0) {
            method573(false);
        }
        class147 var4 = (class147) this.field1366.method1551(32768, arg1);
        if (var4 != null) {
            this.field1360.method33(var4, (byte) -99);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Lnf;")
    public final class130 method576(byte arg0) {
        if (arg0 == -127) {
            field1355++;
            return this.field1366.method1554(6539);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public final void method577(byte arg0) {
        this.field1360.method36((byte) 5);
        field1358++;
        if (arg0 > -70) {
            this.method570(62);
        }
        this.field1366.method1545(0);
        this.field1356 = new class147();
        this.field1368 = this.field1365;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    public class93(int arg0) {
        this.field1365 = arg0;
        this.field1368 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1366 = new class231(var2);
    }
}
