import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class230 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public final int field3972;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public final int field3988;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public final int field3982;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Llj;")
    public final class25 field3976;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[[[B")
    public static byte[][][] field3973 = new byte[4][104][104];

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Loa;")
    private static class99 field3987 = class221.method1463(2844, "wave2:");

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Loa;")
    private static class99 field3986 = class221.method1463(2844, "Take");

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Loa;")
    public static class99 field3989 = class221.method1463(2844, "showingVideoAd");

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Loa;")
    public static class99 field3971 = field3987;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Loa;")
    public static class99 field3978 = field3986;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Loa;")
    public static class99 field3985 = field3987;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[I")
    public static int[] field3977;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method1507(int arg0) {
        field3981++;
        if (class187.field3313 > 0) {
            class116.method784((byte) 12);
            return;
        }
        class95.field1596 = class133.field2322;
        if (arg0 > -96) {
            field3983 = -47;
        }
        class133.field2322 = null;
        class138.method943(0, 40);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method1508(int arg0) {
        field3987 = null;
        if (arg0 != 4) {
            method1508(84);
        }
        field3971 = null;
        field3977 = null;
        field3989 = null;
        field3985 = null;
        field3986 = null;
        field3978 = null;
        field3973 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)Lmc;")
    public static final class197 method1509(int arg0, int arg1, byte arg2) {
        class197 var3 = new class197();
        for (class229 var4 = (class229) class168.field3005.method529(10); var4 != null; var4 = (class229) class168.field3005.method533(-92)) {
            if (var4.field3955 && var4.method1506(arg0, arg1, true)) {
                var3.method1323(-27664, var4);
            }
        }
        if (arg2 != 8) {
            field3986 = null;
        }
        field3980++;
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1510(int arg0) {
        int var1 = -24 % ((arg0 + 51) / 35);
        for (int var2 = -1; var2 < class190.field3342; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class105.field1765[var2];
            }
            class183 var4 = class259.field4515[var3];
            if (var4 != null) {
                class55.method374(var4, var4.method516((byte) -65), -31227);
            }
        }
        field3984++;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static final void method1511(int arg0) {
        if (arg0 == 40) {
            field3975++;
            class272.field4809.method1813(-1);
            class165.field2888.method1813(-1);
            class232.field3993.method1813(-1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIII)V")
    public class230(int arg0, int arg1, int arg2, int arg3) {
        class25 var5 = class164.method1105(arg0, -45);
        this.field3972 = arg3;
        this.field3988 = arg1;
        this.field3982 = arg2;
        if (var5.field386 == -1) {
            this.field3976 = var5;
        } else {
            this.field3976 = class164.method1105(var5.field386, -80);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Llj;III)V")
    public class230(class25 arg0, int arg1, int arg2, int arg3) {
        this.field3976 = arg0;
        this.field3982 = arg2;
        this.field3972 = arg3;
        this.field3988 = arg1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZI)I")
    public static final int method1512(int arg0, boolean arg1, int arg2) {
        field3974++;
        int var3 = class32.method263(4, arg0 + 45365, arg2 + 91923, -21) - (128 - (class32.method263(2, arg0 + 10294, arg2 + 37821, -124) - 128 >> 1) - (class32.method263(1, arg0, arg2, -80) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1) {
            field3986 = null;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
