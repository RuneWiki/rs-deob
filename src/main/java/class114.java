import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class114 extends class673 implements class199 {

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "[Lgu;")
    public static class130[] field1202 = new class130[0];

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lvj;ILjaclib/memory/Buffer;IZ)V")
    public class114(class422 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1201 = arg1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static void method603(byte arg0) {
        field1202 = null;
        if (arg0 != -41) {
            method609(-53);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
    public final int method604(int arg0) {
        if (arg0 != -18775) {
            field1204 = 52;
        }
        ++field1208;
        return super.field9361;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lvj;I[BIZ)V")
    public class114(class422 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1201 = arg1;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
    public final void method605(int arg0) {
        if (arg0 < 51) {
            field1202 = null;
        }
        ++field1206;
        super.field9371.method2420((byte) 23, this);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILnp;)Lcba;")
    public static final class252 method606(int arg0, class115 arg1) {
        ++field1205;
        if (arg0 != -32598) {
            field1202 = null;
        }
        return new class252(arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method676(arg0 ^ 32593), arg1.method675(arg0 ^ 32553), arg1.method675(-128), arg1.method620((byte) -127));
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
    public final int method607(int arg0) {
        ++field1210;
        if (arg0 != 31556) {
            this.method605(103);
        }
        return this.field1201;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)J")
    public final long method608(int arg0) {
        ++field1203;
        if (arg0 != -29334) {
            field1202 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
    public static final void method609(int arg0) {
        ++field1209;
        int var1 = 0;
        if (class639.field9075.method2718(class430.field6109, (byte) 76)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class639.field9075.field6770) {
            var1 |= 64;
        }
        class153.method831(1, var1);
        class364.field4891.method2133(-124, var1);
        class19.field153.method282(true, var1);
        class369.field5055.method339(-1, var1);
        class63.field654.method2189(var1, -1);
        class597.method3350(false, var1);
        class103.method562(false, var1);
        int var6 = 72 % ((arg0 - 38) / 60);
        class44.method225(var1, 68);
        class603.method3373(116, var1);
        class403.method2266((byte) 80);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II[BI)V")
    public final void method610(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method3716(arg1, 0, arg2);
        if (arg0 == 13506) {
            ++field1207;
            this.field1201 = arg3;
        }
    }
}
