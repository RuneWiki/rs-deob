import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class222 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lwj;")
    private class129 field3744 = new class129();

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3746 = 1;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
    public static int[] field3745 = new int[128];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lwj;")
    private class129 field3747;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lwj;")
    public final class129 method1492(byte arg0) {
        field3741++;
        class129 var2 = this.field3744.field2261;
        int var3 = 49 / ((arg0 - 37) / 60);
        if (this.field3744 == var2) {
            return null;
        } else {
            var2.method887((byte) -51);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)I")
    public final int method1493(boolean arg0) {
        if (arg0) {
            return -124;
        }
        int var2 = 0;
        for (class129 var3 = this.field3744.field2261; var3 != this.field3744; var3 = var3.field2261) {
            var2++;
        }
        field3748++;
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLvh;)V")
    public static final void method1494(boolean arg0, class108 arg1) {
        class259.field4245 = class141.method987((byte) 116, 0, arg1, class22.field339);
        field3743++;
        class98.field1691 = class145.method1006(arg1, -3, 0, class161.field2681);
        class52.field919 = class145.method1006(arg1, -3, 0, class49.field847);
        class189.field3054 = class145.method1006(arg1, -3, 0, class248.field4082);
        class145.field2479 = class145.method1006(arg1, -3, 0, class266.field4302);
        class194.field3133 = class145.method1006(arg1, -3, 0, class272.field4370);
        class51.field881 = class145.method1006(arg1, -3, 0, class199.field3261);
        class246.field4044 = class291.method1964(class196.field3170, 0, 0, arg1);
        class37.field524 = class11.method72(class187.field3034, arg1, -1, 0);
        class28.field422 = class11.method72(class243.field3987, arg1, -1, 0);
        class207.field3455 = class195.method1283(arg1, (byte) -84, 0, class286.field4520);
        class189.field3076 = class195.method1283(arg1, (byte) -72, 0, class135.field2356);
        class267.field4318.method1628(class189.field3076, (int[]) null);
        if (arg0) {
            method1496(113);
        }
        class112.field2018.method1628(class189.field3076, (int[]) null);
        class290.field4636.method1628(class189.field3076, (int[]) null);
        class197 var2 = class84.method553((byte) -75, class37.field562, arg1, 0);
        var2.method1311();
        class212.field3569 = var2;
        class197[] var3 = class141.method987((byte) 74, 0, arg1, class223.field3751);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1311();
        }
        class160.field2666 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class259.field4245.length; var9++) {
            class259.field4245[var9].method1299(var5 + var7, var6 + var7, var7 + var8);
        }
        class250.field4092 = class259.field4245;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lwj;")
    public final class129 method1495(int arg0) {
        field3742++;
        class129 var2 = this.field3747;
        if (arg0 < 14) {
            this.method1497((byte) 111);
        }
        if (this.field3744 == var2) {
            this.field3747 = null;
            return null;
        } else {
            this.field3747 = var2.field2261;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3745 = null;
        if (arg0 > -66) {
            field3746 = 79;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public final void method1497(byte arg0) {
        field3749++;
        while (true) {
            class129 var2 = this.field3744.field2261;
            if (this.field3744 == var2) {
                int var3 = 37 / ((-arg0 - 27) / 34);
                this.field3747 = null;
                return;
            }
            var2.method887((byte) -51);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILwj;)V")
    public final void method1498(int arg0, class129 arg1) {
        if (arg1.field2258 != null) {
            arg1.method887((byte) -51);
        }
        if (arg0 != 0) {
            return;
        }
        arg1.field2258 = this.field3744.field2258;
        arg1.field2261 = this.field3744;
        arg1.field2258.field2261 = arg1;
        field3740++;
        arg1.field2261.field2258 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class222() {
        this.field3744.field2258 = this.field3744;
        this.field3744.field2261 = this.field3744;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Lwj;")
    public final class129 method1499(int arg0) {
        field3750++;
        if (arg0 != -16216) {
            this.method1492((byte) 16);
        }
        class129 var2 = this.field3744.field2261;
        if (this.field3744 == var2) {
            this.field3747 = null;
            return null;
        } else {
            this.field3747 = var2.field2261;
            return var2;
        }
    }
}
