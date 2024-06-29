import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class63 {

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "Luk;")
    public class204 field850 = new class204();

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "[I")
    public static int[] field859 = new int[4096];

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "Ljj;")
    public static class398 field852 = new class398(76, 3);

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "Luk;")
    private class204 field856;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 3)
    public static void method383(int arg0) {
        field859 = null;
        if (arg0 == 1) {
            field852 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V", line = 193)
    public class63() {
        this.field850.field2668 = this.field850;
        this.field850.field2671 = this.field850;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)Luk;", line = 22)
    public final class204 method384(int arg0) {
        field855++;
        int var2 = -96 / ((15 - arg0) / 52);
        class204 var3 = this.field850.field2668;
        if (this.field850 == var3) {
            this.field856 = null;
            return null;
        } else {
            this.field856 = var3.field2668;
            return var3;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V", line = 41)
    public final void method385(boolean arg0) {
        field851++;
        while (true) {
            class204 var2 = this.field850.field2668;
            if (this.field850 == var2) {
                this.field856 = null;
                if (arg0) {
                    return;
                } else {
                    this.field856 = null;
                    return;
                }
            }
            var2.method1282(-114);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLuk;)V", line = 66)
    public final void method386(byte arg0, class204 arg1) {
        field854++;
        if (arg1.field2671 != null) {
            arg1.method1282(-36);
        }
        arg1.field2668 = this.field850;
        arg1.field2671 = this.field850.field2671;
        if (arg0 < 82) {
            field859 = null;
        }
        arg1.field2671.field2668 = arg1;
        arg1.field2668.field2671 = arg1;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)I", line = 85)
    public final int method387(byte arg0) {
        field857++;
        int var2 = 0;
        if (arg0 < 72) {
            this.field856 = null;
        }
        for (class204 var3 = this.field850.field2668; var3 != this.field850; var3 = var3.field2668) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)Luk;", line = 110)
    public final class204 method388(int arg0) {
        field853++;
        class204 var2 = this.field856;
        if (this.field850 == var2) {
            this.field856 = null;
            return null;
        } else {
            this.field856 = var2.field2668;
            return arg0 == 4096 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZLl;I)V", line = 131)
    public static final void method389(boolean arg0, boolean arg1, class524 arg2, int arg3) {
        field858++;
        int var4 = arg2.field7256;
        int var5 = (int) arg2.field272;
        int var6 = -72 / ((-arg3 - 28) / 45);
        arg2.method175(30604);
        if (arg0) {
            class313.method2025(83, var4);
        }
        class211.method1322(var4, 104);
        class188 var7 = class557.method3117(var5, (byte) 71);
        if (var7 != null) {
            class553.method3100(var7, 0);
        }
        class544.method3065(-127);
        if (!arg1 && class316.field4599 != -1) {
            class175.method1162(1, 2, class316.field4599);
        }
        class384 var8 = new class384(class54.field742);
        for (class524 var9 = (class524) var8.method2317(-46); var9 != null; var9 = (class524) var8.method2318(-415116576)) {
            if (!var9.method174(64)) {
                var9 = (class524) var8.method2317(-121);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field7255 == 3) {
                int var10 = (int) var9.field272;
                if (var10 >>> 16 == var4) {
                    method389(true, arg1, var9, 87);
                }
            }
        }
    }
}
