import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class189 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ltb;")
    private class69 field3378 = new class69();

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lnc;")
    private class85 field3391;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lid;")
    private static class149 field3385 = class60.method382("Please wait)3)3)3", (byte) 114);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lid;")
    public static class149 field3379 = class60.method382("Cach-B", (byte) 14);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lid;")
    public static class149 field3388 = field3385;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[Lkf;")
    public static class180[] field3396 = new class180[4];

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "B")
    public static byte field3394;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lal;")
    public static class230 field3381;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lng;")
    public static class76 field3382;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[[[I")
    public static int[][][] field3393;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(JB)V")
    public final void method1288(long arg0, byte arg1) {
        int var4 = 39 / ((arg1 - 60) / 47);
        field3380++;
        class103 var5 = (class103) this.field3391.method639((byte) -119, arg0);
        if (var5 != null) {
            var5.method401((byte) -118);
            var5.method1230(24120);
            this.field3392++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public final void method1289(int arg0, int arg1) {
        if (arg1 <= 71) {
            method1294(false);
        }
        if (class260.field4574 != null) {
            for (class103 var3 = (class103) this.field3378.method426(104); var3 != null; var3 = (class103) this.field3378.method438(true)) {
                if (var3.method732(true)) {
                    if (var3.method729(true) == null) {
                        var3.method401((byte) -118);
                        var3.method1230(24120);
                        this.field3392++;
                    }
                } else if (++var3.field3174 > (long) arg0) {
                    class103 var4 = class260.field4574.method1442((byte) 43, var3);
                    this.field3391.method638((byte) -89, var4, var3.field1148);
                    class129.method901(var3, 1, var4);
                    var3.method401((byte) -118);
                    var3.method1230(24120);
                }
            }
        }
        field3386++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method1290(byte arg0) {
        for (class103 var2 = (class103) this.field3378.method426(104); var2 != null; var2 = (class103) this.field3378.method438(true)) {
            if (var2.method732(true)) {
                var2.method401((byte) -118);
                var2.method1230(24120);
                this.field3392++;
            }
        }
        int var3 = -40 / ((arg0 + 36) / 50);
        field3397++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method1291(int arg0) {
        field3387++;
        this.field3378.method435((byte) -121);
        if (arg0 != 0) {
            this.method1290((byte) 48);
        }
        this.field3391.method628(true);
        this.field3392 = this.field3377;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)I")
    public final int method1292(byte arg0) {
        field3390++;
        if (arg0 != -14) {
            this.method1289(110, 18);
        }
        int var2 = 0;
        for (class103 var3 = (class103) this.field3378.method426(104); var3 != null; var3 = (class103) this.field3378.method438(true)) {
            if (!var3.method732(true)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method1293(long arg0, boolean arg1) {
        class103 var4 = (class103) this.field3391.method639((byte) -68, arg0);
        field3384++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method729(!arg1);
        if (var5 == null) {
            var4.method401((byte) -118);
            var4.method1230(24120);
            this.field3392++;
            return null;
        }
        if (var4.method732(true)) {
            class254 var6 = new class254(var5);
            this.field3391.method638((byte) -89, var6, var4.field1148);
            this.field3378.method433(var6, -225);
            var6.field3174 = 0L;
            var4.method401((byte) -118);
            var4.method1230(24120);
        } else {
            this.field3378.method433(var4, -225);
            var4.field3174 = 0L;
        }
        if (arg1) {
            this.field3391 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1294(boolean arg0) {
        field3382 = null;
        if (!arg0) {
            return;
        }
        field3381 = null;
        field3388 = null;
        field3396 = null;
        field3385 = null;
        field3393 = null;
        field3379 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method1295(long arg0, Object arg1, byte arg2) {
        if (arg2 != -71) {
            this.method1291(-39);
        }
        field3395++;
        this.method1288(arg0, (byte) -43);
        if (this.field3392 == 0) {
            class103 var5 = (class103) this.field3378.method427((byte) 33);
            var5.method401((byte) -118);
            var5.method1230(24120);
        } else {
            this.field3392--;
        }
        class254 var6 = new class254(arg1);
        this.field3391.method638((byte) -89, var6, arg0);
        this.field3378.method433(var6, -225);
        var6.field3174 = 0L;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
    public class189(int arg0) {
        this.field3392 = arg0;
        int var2 = 1;
        this.field3377 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field3391 = new class85(var2);
    }
}
