import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class86 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljn;")
    private class117 field1282 = new class117(64);

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public int field1291 = 0;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lvo;")
    private class345 field1286;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lqj;")
    public static class511 field1285 = new class511(1, 7);

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[I")
    public static int[] field1287 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
    public static boolean field1290 = false;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field1289 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method645(int arg0) {
        field1283++;
        int var2 = 124 % ((arg0 + 80) / 45);
        class117 var3 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method936(-92);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
    public final void method646(byte arg0, int arg1) {
        class117 var3 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method939(28093, arg1);
            int var4 = -82 % ((54 - arg0) / 44);
        }
        field1280++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lch;")
    public final class219 method647(int arg0, int arg1) {
        field1284++;
        class117 var3 = this.field1282;
        class219 var4;
        synchronized (this.field1282) {
            var4 = (class219) this.field1282.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field1286;
        byte[] var6;
        synchronized (this.field1286) {
            var6 = this.field1286.method2081(-123, arg1, arg0);
        }
        class219 var7 = new class219();
        var7.field3280 = this;
        var7.field3294 = arg1;
        if (var6 != null) {
            var7.method1472(new class465(var6), arg0 + 89);
        }
        var7.method1474((byte) -126);
        class117 var8 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public final void method648(int arg0) {
        class117 var2 = this.field1282;
        synchronized (this.field1282) {
            this.field1282.method950((byte) -123);
        }
        field1281++;
        if (arg0 <= 5) {
            this.method646((byte) -99, -113);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method649(byte arg0) {
        field1287 = null;
        field1285 = null;
        int var1 = 117 % ((arg0 - 21) / 62);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class86(class529 arg0, int arg1, class345 arg2) {
        this.field1286 = arg2;
        this.field1288 = this.field1286.method2098(0, 4);
    }
}
