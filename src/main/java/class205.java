import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class205 {

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Luaa;")
    private class395 field2892 = new class395(16);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lgp;")
    private class561 field2890;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
    public static int[] field2894 = new int[13];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lfa;")
    public static class482 field2887;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V", line = 5)
    public static final void method1314(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 << 3;
        field2888++;
        int var5 = arg3 << 3;
        int var6 = arg0 << 3;
        class181.field2622 = var6;
        class523.field7256 = var5;
        if (class377.field5547 == 2) {
            class394.field5910 = var4;
            class217.field3284 = var6;
            class265.field3862 = var5;
        }
        class492.method2814(false);
        if (arg2 != 102) {
            field2894 = null;
        }
        class521.field7236 = true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 30)
    public final void method1315(int arg0) {
        field2891++;
        class395 var2 = this.field2892;
        synchronized (this.field2892) {
            this.field2892.method2406(arg0 ^ 0x28);
            if (arg0 != 3) {
                field2887 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 46)
    public static void method1316(int arg0) {
        field2894 = null;
        if (arg0 < 70) {
            method1314(-124, 61, (byte) 73, 3);
        }
        field2887 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 58)
    public final void method1317(boolean arg0) {
        if (arg0) {
            this.field2892 = null;
        }
        class395 var2 = this.field2892;
        synchronized (this.field2892) {
            this.field2892.method2404((byte) -91);
        }
        field2889++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILgr;BIII)Leh;", line = 71)
    public final class226 method1318(int arg0, class524 arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -17) {
            return null;
        }
        field2886++;
        class18[] var7 = null;
        class207 var8 = this.method1320(arg5, 60);
        if (var8.field2927 != null) {
            var7 = new class18[var8.field2927.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class359 var10 = arg1.method2954(13912, var8.field2927[var9]);
                var7[var9] = new class18(var10.field5099, var10.field5095, var10.field5101, var10.field5096, var10.field5093, var10.field5102, var10.field5103, var10.field5092);
            }
        }
        return new class226(var8.field2929, var7, var8.field2925, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 106)
    public final void method1319(int arg0, int arg1) {
        field2885++;
        class395 var3 = this.field2892;
        synchronized (this.field2892) {
            if (arg0 != 3) {
                this.method1315(-35);
            }
            this.field2892.method2397(arg1, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lng;", line = 120)
    private final class207 method1320(int arg0, int arg1) {
        field2893++;
        class395 var3 = this.field2892;
        class207 var4;
        synchronized (this.field2892) {
            var4 = (class207) this.field2892.method2407(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field2890;
        byte[] var6;
        synchronized (this.field2890) {
            var6 = this.field2890.method3175(arg0, (byte) -53, 29);
        }
        if (arg1 <= 52) {
            return null;
        }
        class207 var7 = new class207();
        if (var6 != null) {
            var7.method1333(new class268(var6), -17474);
        }
        class395 var8 = this.field2892;
        synchronized (this.field2892) {
            this.field2892.method2408(var7, (long) arg0, -128);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 157)
    public class205(class584 arg0, int arg1, class561 arg2) {
        this.field2890 = arg2;
        this.field2890.method3164(29, true);
    }
}
