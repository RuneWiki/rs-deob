import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class285 extends InputStream {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[Z")
    public static boolean[] field4512 = new boolean[112];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lba;")
    public static class170 field4511;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lh;")
    public static class278 field4508;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static final void method1936(byte arg0) {
        field4513++;
        class212 var1 = class220.field3524;
        synchronized (class220.field3524) {
            client.field2582++;
            class84.field1210 = class114.field1652;
            if (class128.field1935 >= 0) {
                while (class276.field4429 != class128.field1935) {
                    int var3 = class64.field959[class276.field4429];
                    class276.field4429 = class276.field4429 + 1 & 0x7F;
                    if (var3 >= 0) {
                        field4512[var3] = true;
                    } else {
                        field4512[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    field4512[var2] = false;
                }
                class128.field1935 = class276.field4429;
            }
            class114.field1652 = class83.field1203;
        }
        if (arg0 <= 45) {
            method1940(46, (byte) 16, 44);
        }
    }

    @OriginalMember(owner = "client!ah", name = "read", descriptor = "()I")
    public final int read() {
        field4509++;
        class43.method324(30000L, -107);
        return -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1937(int arg0) {
        field4512 = null;
        if (arg0 != 1000000) {
            field4508 = null;
        }
        field4511 = null;
        field4508 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZZZI)Llc;")
    public static final class86 method1938(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg4 != 12504) {
            return null;
        }
        class263 var5 = null;
        if (class11.field131 != null) {
            var5 = new class263(arg0, class11.field131, class267.field4321[arg0], 1000000);
        }
        class172.field2766[arg0] = class163.field2644.method441(class192.field3093, arg0, var5, true);
        field4510++;
        if (arg1) {
            class172.field2766[arg0].method879((byte) -117);
        }
        return new class86(class172.field2766[arg0], arg3, arg2);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Lpi;")
    public static final class141 method1939(int arg0, int arg1) {
        field4515++;
        class141 var2 = (class141) class50.field734.method1553((long) arg0, (byte) -105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field3410.method643(class93.method730(98, arg0), class128.method916(-62, arg0), false);
        class141 var4 = new class141();
        var4.field2256 = arg0;
        if (var3 != null) {
            var4.method1006((byte) 39, new class152(var3));
        }
        var4.method1002(true);
        if (arg1 == 112) {
            class50.field734.method1551(var4, arg1 - 112, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI)Lhb;")
    public static final class222 method1940(int arg0, byte arg1, int arg2) {
        field4514++;
        if (arg1 < 54) {
            method1938(91, false, true, true, -73);
        }
        for (class222 var3 = (class222) class149.field2425.method1033(-9843); var3 != null; var3 = (class222) class149.field2425.method1031((byte) -7)) {
            if (var3.field3557 && var3.method1592(arg0, (byte) 83, arg2)) {
                return var3;
            }
        }
        return null;
    }
}
