import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class217 {

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Laf;")
    private class39 field2992 = new class39(64);

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Lae;")
    private class283 field2991;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "J")
    public static long field2990 = 0L;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Ljn;")
    public static class134 field2985 = new class134(63, -2);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 5)
    public final void method1347(int arg0) {
        class39 var2 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method314(arg0 + 15881);
            if (arg0 != -15883) {
                field2990 = -23L;
            }
        }
        field2989++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLgga;)V", line = 20)
    public static final void method1348(byte arg0, class511 arg1) {
        field2987++;
        int var2 = arg1.method3043(-31927);
        class169.field2150 = new class410[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class169.field2150[var3] = new class410();
            class169.field2150[var3].field5757 = arg1.method3043(-31927);
            class169.field2150[var3].field5756 = arg1.method3018(-1);
        }
        class536.field7421 = arg1.method3043(-31927);
        class687.field9586 = arg1.method3043(-31927);
        class358.field5155 = arg1.method3043(-31927);
        class94.field1092 = new class138[class687.field9586 + 1 - class536.field7421];
        for (int var4 = 0; var4 < class358.field5155; var4++) {
            int var5 = arg1.method3043(-31927);
            class138 var6 = class94.field1092[var5] = new class138();
            var6.field2279 = arg1.method3013(arg0 ^ 0x5A);
            var6.field2275 = arg1.method3008(64);
            var6.field1767 = class536.field7421 + var5;
            var6.field1765 = arg1.method3018(-1);
            var6.field1768 = arg1.method3018(-1);
        }
        if (arg0 != 73) {
            field2985 = null;
        }
        class187.field2337 = arg1.method3008(arg0 ^ 0x9);
        class223.field3199 = true;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 70)
    public final void method1349(int arg0) {
        field2988++;
        class39 var2 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method319(-79);
            if (arg0 >= -36) {
                this.method1351(-19, 18);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)Lnga;", line = 84)
    public final class268 method1350(int arg0, int arg1) {
        field2986++;
        class39 var3 = this.field2992;
        class268 var4;
        synchronized (this.field2992) {
            var4 = (class268) this.field2992.method312(arg0 ^ 0x36, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field2991;
        byte[] var6;
        synchronized (this.field2991) {
            var6 = this.field2991.method1849(arg1, (byte) -117, arg0);
        }
        class268 var7 = new class268();
        if (var6 != null) {
            var7.method1748(new class511(var6), -1);
        }
        class39 var8 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method305(var7, (long) arg1, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V", line = 112)
    public final void method1351(int arg0, int arg1) {
        class39 var3 = this.field2992;
        synchronized (this.field2992) {
            this.field2992.method308(~arg0, arg1);
        }
        field2984++;
        if (arg0 != 0) {
            this.field2992 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 148)
    public class217(class788 arg0, int arg1, class283 arg2) {
        this.field2991 = arg2;
        if (this.field2991 != null) {
            this.field2991.method1867(54, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V", line = 138)
    public static void method1352(int arg0) {
        field2985 = null;
        if (arg0 != 0) {
            method1352(-120);
        }
    }
}
