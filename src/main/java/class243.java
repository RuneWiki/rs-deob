import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class243 {

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lue;")
    private class13 field3474;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Lpk;")
    private class25 field3482;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lqf;")
    private class59 field3483;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field3472 = 128;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3468 = "slide:";

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3476 = " is already on your friend list.";

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static volatile int field3470 = -1;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field3485 = -2;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Lcg;")
    private class316 field3479;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[Lhn;")
    private class271[] field3481;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 12)
    public final void method1666(byte arg0) {
        if (arg0 != 0) {
            field3485 = 15;
        }
        field3469++;
        if (this.field3481 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3481.length; var2++) {
            if (this.field3481[var2] != null) {
                this.field3481[var2].method1866(false);
            }
        }
        for (int var3 = 0; var3 < this.field3481.length; var3++) {
            if (this.field3481[var3] != null) {
                this.field3481[var3].method1869((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lng;IIZLng;)Lhn;", line = 58)
    private final class271 method1667(class330 arg0, int arg1, int arg2, boolean arg3, class330 arg4) {
        field3475++;
        if (this.field3479 == null) {
            throw new RuntimeException();
        }
        this.field3479.field4777 = arg1 * 8 + 5;
        if (this.field3479.field4777 >= this.field3479.field4798.length) {
            throw new RuntimeException();
        } else if (arg2 != 17991) {
            return (class271) null;
        } else if (this.field3481[arg1] == null) {
            int var6 = this.field3479.method2172((byte) 71);
            int var7 = this.field3479.method2172((byte) 71);
            class271 var8 = new class271(arg1, arg0, arg4, this.field3474, this.field3482, var6, var7, arg3);
            this.field3481[arg1] = var8;
            return var8;
        } else {
            return this.field3481[arg1];
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z", line = 100)
    public final boolean method1668(byte arg0) {
        field3467++;
        if (this.field3479 != null) {
            return true;
        }
        if (arg0 != 21) {
            method1672(110, 31);
        }
        if (this.field3483 == null) {
            if (this.field3474.method80(-17907)) {
                return false;
            }
            this.field3483 = this.field3474.method77(255, (byte) 0, false, 255, true);
        }
        if (this.field3483.field115) {
            return false;
        } else {
            this.field3479 = new class316(this.field3483.method66((byte) -115));
            this.field3481 = new class271[(this.field3479.field4798.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lng;Lng;II)Lhn;", line = 129)
    public final class271 method1669(class330 arg0, class330 arg1, int arg2, int arg3) {
        if (arg2 != 5) {
            this.method1667((class330) null, -35, 126, false, (class330) null);
        }
        field3484++;
        return this.method1667(arg1, arg3, 17991, true, arg0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 142)
    public static void method1670(int arg0) {
        if (arg0 >= -20) {
            field3478 = 55;
        }
        field3468 = null;
        field3476 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLkm;)V", line = 156)
    public static final void method1671(byte arg0, class133 arg1) {
        class237.field3369 = arg1;
        int var2 = -64 / ((arg0 + 79) / 40);
        field3477++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lr;", line = 167)
    public static final class141 method1672(int arg0, int arg1) {
        field3471++;
        class141 var2 = (class141) class42.field473.method716((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field3462.method955(arg1, arg0, arg1 ^ 0xFFFFAABC);
        class141 var4 = new class141();
        if (var3 != null) {
            var4.method1017(arg0, (byte) -122, new class316(var3));
        }
        class42.field473.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lue;Lpk;)V", line = 188)
    public class243(class13 arg0, class25 arg1) {
        this.field3474 = arg0;
        this.field3482 = arg1;
        if (!this.field3474.method80(-17907)) {
            this.field3483 = this.field3474.method77(255, (byte) 0, false, 255, true);
        }
    }
}
