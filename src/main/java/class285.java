import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class285 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field4435 = 128;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public int field4444 = 128;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "S")
    public static short field4434 = 256;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ll;")
    public static class127 field4433;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[[B")
    public static byte[][] field4436;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method1913(byte arg0) {
        for (class327 var1 = (class327) class354.field5247.method1073(17494); var1 != null; var1 = (class327) class354.field5247.method1073(17494)) {
            class205.method1435(var1, -11);
        }
        if (arg0 > -118) {
            field4446 = 89;
        }
        field4442++;
        int var2;
        int var3;
        if (class40.field667.method416(89, class108.field1631)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class213.field3236;
            var3 = class213.field3236;
        }
        client.method3087();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method3086();
            client.method3079(var4);
            client.method3088(var4);
        }
        client.method3073();
        client.method3076();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
    public static final void method1914(int arg0, byte arg1) {
        class242 var2 = class98.field1525;
        synchronized (class98.field1525) {
            class98.field1525.method1631(arg0, (byte) -19);
        }
        field4441++;
        class242 var3 = class162.field2439;
        synchronized (class162.field2439) {
            if (arg1 <= 42) {
                field4446 = -33;
            }
            class162.field2439.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method1915(int arg0) {
        field4439++;
        class540.field7909 = 0;
        class154.field2370.method291(false);
        class256.field4112 = false;
        if (arg0 != 3) {
            method1915(71);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lcf;B)V")
    public final void method1916(class285 arg0, byte arg1) {
        this.field4437 = arg0.field4437;
        this.field4438 = arg0.field4438;
        field4432++;
        this.field4443 = arg0.field4443;
        this.field4444 = arg0.field4444;
        this.field4435 = arg0.field4435;
        this.field4445 = arg0.field4445;
        int var3 = 13 % ((arg1 - 67) / 36);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lcf;")
    public final class285 method1917(boolean arg0) {
        if (arg0) {
            this.field4443 = -23;
        }
        field4440++;
        return new class285(this.field4443, this.field4435, this.field4444, this.field4445, this.field4437, this.field4438);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method1918(int arg0) {
        field4436 = null;
        field4433 = null;
        if (arg0 != -31347) {
            method1915(-117);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V")
    public class285(int arg0) {
        this.field4443 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V")
    private class285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4444 = arg2;
        this.field4445 = arg3;
        this.field4437 = arg4;
        this.field4435 = arg1;
        this.field4438 = arg5;
        this.field4443 = arg0;
    }
}
