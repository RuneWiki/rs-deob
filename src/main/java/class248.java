import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class248 extends class55 {

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Z")
    private boolean field3195 = false;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method197(boolean arg0, byte arg1) {
        int var3 = 46 / ((arg1 - -61) / 44);
        ++field3189;
        super.field759.method2397(class405.field5120, class476.field6418, (byte) 43);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZ)V", line = 13)
    public final void method199(int arg0, int arg1, boolean arg2) {
        ++field3188;
        if (!arg2) {
            this.method202(54);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V", line = 23)
    public final void method201(boolean arg0) {
        if (!this.field3195) {
            super.field759.method2422(class447.field5937, 0, (byte) -10);
        } else {
            super.field759.method2393(1, (byte) -105);
            super.field759.method2014(class94.field1317, 0);
            super.field759.method2397(class405.field5120, class405.field5120, (byte) 106);
            super.field759.method2394(class21.field383, (byte) 88, 2);
            super.field759.method2422(class447.field5937, 0, (byte) -10);
            super.field759.method2418(11032);
            super.field759.method2396(22357, (class572) null);
            super.field759.method2393(0, (byte) -95);
            this.field3195 = false;
        }
        ++field3193;
        super.field759.method2397(class405.field5120, class405.field5120, (byte) -70);
        if (!arg0) {
            this.method200(9, -113, (class572) null);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILfe;)V", line = 49)
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg1 < 30) {
            this.method200(11, -44, (class572) null);
        }
        super.field759.method2396(22357, arg2);
        ++field3192;
        super.field759.method2379(arg0, -15829);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lrba;)V", line = 62)
    public static final void method1534(class435 arg0) {
        class681.field9504.method553(arg0.field5801, arg0.field5800 + (arg0.method87((byte) 121) >> 1), arg0.field5797, class300.field3939);
        arg0.field5803 = class300.field3939[0];
        arg0.field5790 = class300.field3939[1];
        arg0.field5798 = class300.field3939[2];
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V", line = 76)
    public final void method196(int arg0, boolean arg1) {
        ++field3191;
        if (arg0 != 5) {
            this.field3195 = false;
        }
        class418 var3 = super.field759.method2370((byte) 39);
        if (var3 != null && arg1) {
            super.field759.method2393(1, (byte) 10);
            super.field759.method2396(arg0 ^ 22352, var3);
            super.field759.method2014(class262.field3296, 0);
            super.field759.method2393(1, (byte) -92);
            super.field759.method2397(class740.field10325, class476.field6418, (byte) 64);
            super.field759.method2036((byte) -107, false, true, class84.field1162, 2);
            super.field759.method2422(class479.field6523, 0, (byte) -10);
            class477 var4 = super.field759.method2364((byte) -127);
            var4.method2745(super.field759.method2357(arg0 + 30508), (byte) -8);
            super.field759.method2384(2, class559.field7776);
            super.field759.method2393(0, (byte) -95);
            this.field3195 = true;
        } else {
            super.field759.method2422(class479.field6523, 0, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)Z", line = 107)
    public final boolean method202(int arg0) {
        if (arg0 != 1) {
            return false;
        } else {
            ++field3194;
            return true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lij;)V", line = 120)
    public class248(class424 arg0) {
        super(arg0);
    }
}
