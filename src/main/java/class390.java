import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class390 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lwm;")
    private class399 field5855 = new class399(16);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Lph;")
    private class459 field5853;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "F")
    public static float field5856;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field5861;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 3)
    public final void method2405(int arg0, int arg1) {
        class399 var3 = this.field5855;
        synchronized (this.field5855) {
            this.field5855.method2471((byte) 98, arg1);
            if (arg0 != 8) {
                method2407(null, 45);
            }
        }
        field5862++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)Loh;", line = 16)
    public final class281 method2406(int arg0, int arg1) {
        field5859++;
        class399 var3 = this.field5855;
        class281 var4;
        synchronized (this.field5855) {
            var4 = (class281) this.field5855.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field5853;
        byte[] var6;
        synchronized (this.field5853) {
            var6 = this.field5853.method2757(arg0, arg1, (byte) -126);
        }
        class281 var7 = new class281();
        if (var6 != null) {
            var7.method1760(new class289(var6), -122);
        }
        class399 var8 = this.field5855;
        synchronized (this.field5855) {
            this.field5855.method2472(-60, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lnn;I)V", line = 51)
    public static final void method2407(class289 arg0, int arg1) {
        field5858++;
        int var2 = arg0.method1825((byte) -114);
        class91.field1813 = new class376[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class91.field1813[var3] = new class376();
            class91.field1813[var3].field5497 = arg0.method1825((byte) -114);
            class91.field1813[var3].field5505 = arg0.method1838(arg1 + 31876);
        }
        if (arg1 != -31752) {
            field5861 = null;
        }
        class17.field282 = arg0.method1825((byte) -114);
        class21.field327 = arg0.method1825((byte) -114);
        class373.field5470 = arg0.method1825((byte) -114);
        class324.field4933 = new class255[class21.field327 + 1 - class17.field282];
        for (int var4 = 0; var4 < class373.field5470; var4++) {
            int var5 = arg0.method1825((byte) -114);
            class255 var6 = class324.field4933[var5] = new class255();
            var6.field5240 = arg0.method1858(arg1 + 28496);
            var6.field5243 = arg0.method1815((byte) -125);
            var6.field3910 = class17.field282 + var5;
            var6.field3914 = arg0.method1838(arg1 + 31811);
            var6.field3912 = arg0.method1838(arg1 + 31852);
        }
        class26.field394 = arg0.method1815((byte) -57);
        class88.field1790 = true;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZ)V", line = 103)
    public static final void method2408(int arg0, boolean arg1) {
        field5860++;
        class18 var2 = class140.method1047(11, arg0, arg1);
        var2.method123(20983);
        if (arg1) {
            field5861 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BZ)V", line = 116)
    public static final void method2409(byte arg0, boolean arg1) {
        if (arg1) {
            if (class155.field2523 != -1) {
                class406.method2520(class155.field2523, -334);
            }
            for (class141 var2 = (class141) class470.field6975.method1615(0); var2 != null; var2 = (class141) class470.field6975.method1621((byte) 96)) {
                if (!var2.method1677(-1)) {
                    var2 = (class141) class470.field6975.method1615(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class86.method797(false, (byte) -94, var2, true);
            }
            class155.field2523 = -1;
            class470.field6975 = new class249(8);
            class86.method801(18391);
            class155.field2523 = class192.field3097;
            class505.method3033((byte) 126, false);
            class102.method895(0);
            class495.method2984(class155.field2523);
        }
        field5852++;
        class355.field5228 = true;
        if (arg0 >= -118) {
            field5861 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 162)
    public final void method2410(int arg0) {
        class399 var2 = this.field5855;
        synchronized (this.field5855) {
            if (arg0 != 0) {
                this.field5855 = null;
            }
            this.field5855.method2477(arg0 ^ 0x2F);
        }
        field5854++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 176)
    public final void method2411(int arg0) {
        field5857++;
        class399 var2 = this.field5855;
        synchronized (this.field5855) {
            if (arg0 == -7985) {
                this.field5855.method2475((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 190)
    public static void method2412(byte arg0) {
        if (arg0 != 80) {
            method2408(-62, true);
        }
        field5861 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 203)
    public class390(class341 arg0, int arg1, class459 arg2) {
        this.field5853 = arg2;
        this.field5853.method2763(30, -3);
    }
}
