import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class243 {

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lve;")
    private class189 field4374 = new class189();

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[I")
    public static int[] field4372 = new int[100];

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Z")
    public static boolean field4373 = false;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljl;")
    public static class101 field4366;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Lve;")
    private class189 field4375;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public final int method1674(int arg0) {
        field4369++;
        int var2 = arg0;
        class189 var3 = this.field4374.field3248;
        while (this.field4374 != var3) {
            var3 = var3.field3248;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        field4372 = null;
        int var1 = 66 / ((-arg0 - 35) / 52);
        field4366 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLve;)V")
    public final void method1676(byte arg0, class189 arg1) {
        if (arg1.field3251 != null) {
            arg1.method1308((byte) 64);
        }
        arg1.field3251 = this.field4374.field3251;
        arg1.field3248 = this.field4374;
        if (arg0 >= -125) {
            this.method1676((byte) -59, (class189) null);
        }
        arg1.field3251.field3248 = arg1;
        arg1.field3248.field3251 = arg1;
        field4367++;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Lve;")
    public final class189 method1677(int arg0) {
        class189 var2 = this.field4375;
        field4365++;
        if (this.field4374 == var2) {
            this.field4375 = null;
            return null;
        } else {
            int var3 = 32 % ((50 - arg0) / 58);
            this.field4375 = var2.field3248;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Lve;")
    public final class189 method1678(int arg0) {
        field4364++;
        class189 var2 = this.field4374.field3248;
        if (arg0 < 1) {
            return null;
        } else if (this.field4374 == var2) {
            this.field4375 = null;
            return null;
        } else {
            this.field4375 = var2.field3248;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class243() {
        this.field4374.field3248 = this.field4374;
        this.field4374.field3251 = this.field4374;
    }
}
