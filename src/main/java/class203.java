import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class203 implements class355 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lpfa;")
    private class275 field2355;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Loaa;")
    public class268 field2356;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ldr;")
    public static class675 field2363 = new class675(15, 5);

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "J")
    public static long field2364;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lvw;")
    public static class284 field2362;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lxa;")
    public class468 field2354;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 5)
    public final void method518(int arg0) {
        this.field2354 = class132.method853(arg0 ^ arg0, this.field2355, this.field2356.field3388);
        field2361++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V", line = 17)
    public void method513(boolean arg0, byte arg1) {
        if (arg1 <= 57) {
            this.method513(true, (byte) 1);
        }
        if (arg0) {
            int var3 = this.field2356.field3385.method3205(class696.field9640, -7963, this.field2354.method1552()) + this.field2356.field3386;
            int var4 = this.field2356.field3383.method1445(2, class634.field8596, this.field2354.method1549()) + this.field2356.field3381;
            this.field2354.method2556(var3, var4);
        }
        field2357++;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lpfa;Loaa;)V", line = 37)
    public class203(class275 arg0, class268 arg1) {
        this.field2355 = arg0;
        this.field2356 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method516(int arg0) {
        if (arg0 != -6191) {
            method1183(39);
        }
        field2359++;
        return this.field2355.method1669((byte) 127, this.field2356.field3388);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 65)
    public static void method1183(int arg0) {
        if (arg0 == 5) {
            field2363 = null;
            field2362 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lmn;", line = 76)
    public static final class341 method1184(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2360++;
        class341 var1 = (class341) class580.field7776.method1720(!arg0);
        if (var1 == null) {
            return new class341();
        } else {
            class5.field41--;
            return var1;
        }
    }
}
