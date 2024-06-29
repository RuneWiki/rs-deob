import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class562 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lpa;")
    private class387 field7997 = new class387(64);

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lcb;")
    private class544 field8002;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field7993 = 0;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "F")
    public static float field8001 = 0.0F;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3262(int arg0) {
        field7994++;
        if (arg0 >= 34) {
            class498.field7078.method387(-21125);
            class217.field3108.method387(-21125);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 16)
    public final void method3263(boolean arg0) {
        if (arg0) {
            method3262(37);
        }
        class387 var2 = this.field7997;
        synchronized (this.field7997) {
            this.field7997.method2369(-1);
        }
        field7999++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 29)
    public final void method3264(byte arg0) {
        field7995++;
        class387 var2 = this.field7997;
        synchronized (this.field7997) {
            this.field7997.method2364(1);
            if (arg0 < 97) {
                method3262(-25);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lpj;", line = 52)
    public final class155 method3265(int arg0, int arg1) {
        field7998++;
        class387 var3 = this.field7997;
        class155 var4;
        synchronized (this.field7997) {
            var4 = (class155) this.field7997.method2373((long) arg0, arg1 ^ 0x4B61);
        }
        if (arg1 != 19206) {
            this.method3268(-11, 12);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field8002;
        byte[] var6;
        synchronized (this.field8002) {
            var6 = this.field8002.method3150(class410.method2469(1024, arg0), -108, class697.method3933(arg0, (byte) 114));
        }
        class155 var7 = new class155();
        if (var6 != null) {
            var7.method1226(new class120(var6), -115);
        }
        class387 var8 = this.field7997;
        synchronized (this.field7997) {
            this.field7997.method2362(var7, arg1 - 19206, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V", line = 82)
    public static final void method3266(int arg0, int arg1) {
        field7996++;
        class527.field7499 = arg0;
        if (arg1 >= -55) {
            method3266(-38, 25);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V", line = 99)
    public final void method3267(int arg0, int arg1) {
        if (arg0 != 0) {
            method3266(93, -117);
        }
        class387 var3 = this.field7997;
        synchronized (this.field7997) {
            this.field7997.method2364(1);
            this.field7997 = new class387(arg1);
        }
        field8003++;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V", line = 115)
    public final void method3268(int arg0, int arg1) {
        field8000++;
        class387 var3 = this.field7997;
        synchronized (this.field7997) {
            if (arg1 != 9387) {
                this.field8002 = null;
            }
            this.field7997.method2366(arg0, 125);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 136)
    public class562(class106 arg0, int arg1, class544 arg2) {
        this.field8002 = arg2;
        if (this.field8002 != null) {
            int var4 = this.field8002.method3136(false) - 1;
            this.field8002.method3147(var4, 34);
        }
    }
}
