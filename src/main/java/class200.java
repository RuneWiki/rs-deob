import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class200 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Lwm;")
    private class399 field3249 = new class399(128);

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lph;")
    private class459 field3250;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Ls;")
    public static class186 field3255 = new class186(88, 3);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 29)
    public class200(class341 arg0, int arg1, class459 arg2) {
        this.field3250 = arg2;
        if (this.field3250 != null) {
            int var4 = this.field3250.method2759(16460) - 1;
            this.field3250.method2763(var4, -3);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method1383(byte arg0, int arg1) {
        int var2 = 68 % ((30 - arg0) / 44);
        field3251++;
        class18 var3 = class140.method1047(6, arg1, false);
        var3.method123(20983);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 53)
    public static final void method1384(int arg0) {
        field3252++;
        if (arg0 != -1) {
            return;
        }
        try {
            if (class491.field7200 == 1) {
                int var1 = class470.field6983.method655(false);
                if (var1 > 0 && class470.field6983.method638(922198381)) {
                    int var2 = var1 - class4.field80;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class470.field6983.method650(15, var2);
                } else {
                    class470.field6983.method654(false);
                    class470.field6983.method643((byte) 57);
                    class420.field6339 = null;
                    if (class138.field2322 == null) {
                        class491.field7200 = 0;
                    } else {
                        class491.field7200 = 2;
                    }
                    class272.field4124 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class470.field6983.method654(false);
            class491.field7200 = 0;
            class272.field4124 = null;
            class420.field6339 = null;
            class138.field2322 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 103)
    public static void method1385(int arg0) {
        if (arg0 != -4003) {
            method1383((byte) -13, 7);
        }
        field3255 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lam;", line = 116)
    public final class450 method1386(int arg0, int arg1) {
        field3253++;
        class399 var3 = this.field3249;
        class450 var4;
        synchronized (this.field3249) {
            var4 = (class450) this.field3249.method2478(1, (long) arg0);
            int var5 = -104 % ((60 - arg1) / 39);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field3250.method2757(class522.method3089((byte) -116, arg0), class18.method121(false, arg0), (byte) -120);
        class450 var7 = new class450();
        if (var6 != null) {
            var7.method2686((byte) -93, new class289(var6));
        }
        class399 var8 = this.field3249;
        synchronized (this.field3249) {
            this.field3249.method2472(66, var7, (long) arg0);
            return var7;
        }
    }
}
