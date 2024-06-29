import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class330 {

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lfr;")
    private class231 field5196 = new class231(64);

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lqs;")
    private class496 field5198;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[[I")
    public static int[][] field5195 = new int[128][128];

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZ)I", line = 6)
    public static final int method2072(int arg0, int arg1, boolean arg2) {
        field5199++;
        if (arg2) {
            return 0;
        }
        class112 var3 = class295.method1888(arg2, arg1, (byte) 124);
        if (arg0 != 26214) {
            method2075(null, -5, -9, false, null, -98, 38, (byte) -30);
        }
        if (var3 == null) {
            return class243.field4173.method259(true, arg1).field5462;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field1971.length; var5++) {
            if (var3.field1971[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class243.field4173.method259(true, arg1).field5462 - var3.field1971.length);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Llk;", line = 53)
    public final class431 method2073(int arg0, int arg1) {
        field5197++;
        class231 var3 = this.field5196;
        class431 var4;
        synchronized (this.field5196) {
            var4 = (class431) this.field5196.method1593((byte) -116, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field5198;
        byte[] var6;
        synchronized (this.field5198) {
            var6 = this.field5198.method2926(arg0, -123, 19);
        }
        class431 var7 = new class431();
        if (var6 != null) {
            var7.method2624(0, new class23(var6));
        }
        if (arg1 <= 15) {
            field5195 = null;
        }
        class231 var8 = this.field5196;
        synchronized (this.field5196) {
            this.field5196.method1595(var7, (long) arg0, (byte) 114);
            return var7;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 85)
    public static void method2074(byte arg0) {
        if (arg0 != 48) {
            method2074((byte) 114);
        }
        field5195 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BIIZLih;IIB)Lgq;", line = 96)
    public static final class536 method2075(byte[] arg0, int arg1, int arg2, boolean arg3, class214 arg4, int arg5, int arg6, byte arg7) {
        field5193++;
        int var8 = -88 % ((arg7 + 54) / 45);
        if (!arg4.field3739 && (!class137.method1029(arg1, false) || !class137.method1029(arg2, false))) {
            return arg4.field3666 ? new class536(arg4, 34037, arg5, arg1, arg2, arg3, arg0, arg6) : new class536(arg4, arg5, arg1, arg2, class206.method1351(arg1, 112), class206.method1351(arg2, 98), arg0, arg6);
        } else {
            return new class536(arg4, 3553, arg5, arg1, arg2, arg3, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V", line = 116)
    public static final void method2076(int arg0, int arg1) {
        field5194++;
        class231 var2 = class302.field4836;
        synchronized (class302.field4836) {
            class302.field4836.method1603((byte) -121, arg0);
            if (arg1 <= 77) {
                field5195 = null;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lwv;ILqs;)V", line = 132)
    public class330(class535 arg0, int arg1, class496 arg2) {
        this.field5198 = arg2;
        this.field5192 = this.field5198.method2940(19, -10511);
    }
}
