import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class317 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lmm;")
    private class117 field5438 = new class117();

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    private int field5448;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    private int field5443;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Loe;")
    private class79 field5439;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "[I")
    public static int[] field5436 = new int[200];

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Z")
    public static boolean field5437 = false;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Lhi;")
    public static class82 field5449 = class95.method664((byte) -126, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 6)
    public final void method2168(int arg0) {
        for (class9 var2 = (class9) this.field5438.method803((byte) 97); var2 != null; var2 = (class9) this.field5438.method802((byte) -71)) {
            if (var2.method61(arg0 + 54)) {
                var2.method961((byte) 86);
                var2.method358((byte) 52);
                this.field5448++;
            }
        }
        if (arg0 != 0) {
            this.method2177(-116, 121);
        }
        field5446++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 35)
    public final void method2169(Object arg0, long arg1, byte arg2) {
        field5447++;
        this.method2174(arg1, -15);
        if (arg2 != 94) {
            this.method2169((Object) null, 97L, (byte) -102);
        }
        if (this.field5448 == 0) {
            class9 var5 = (class9) this.field5438.method801(100);
            var5.method961((byte) 94);
            var5.method358((byte) 52);
        } else {
            this.field5448--;
        }
        class273 var6 = new class273(arg0);
        this.field5439.method503(arg1, -106, var6);
        this.field5438.method800((byte) 117, var6);
        var6.field824 = 0L;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)I", line = 72)
    public static final int method2170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 & 0xF;
        if (arg4 == 4014) {
            field5445++;
            int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg1) : arg3;
            int var7 = var5 >= 8 ? arg3 : arg2;
            return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 88)
    public static final void method2171(boolean arg0) {
        field5440++;
        class133.field2303 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 104)
    public final void method2172(boolean arg0) {
        field5441++;
        this.field5438.method799((byte) 39);
        this.field5439.method496((byte) 127);
        this.field5448 = this.field5443;
        if (arg0) {
            this.method2177(50, 36);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)J", line = 117)
    public static final long method2173(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        return var3 == null || var3.field171 == null ? 0L : var3.field171.field1622;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(JI)V", line = 125)
    public final void method2174(long arg0, int arg1) {
        if (arg1 != -15) {
            this.method2168(-112);
        }
        class9 var4 = (class9) this.field5439.method507(arg0, 602425312);
        field5442++;
        if (var4 != null) {
            var4.method961((byte) 110);
            var4.method358((byte) 52);
            this.field5448++;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(JI)Ljava/lang/Object;", line = 150)
    public final Object method2175(long arg0, int arg1) {
        field5444++;
        class9 var4 = (class9) this.field5439.method507(arg0, arg1 ^ 0x23E84C20);
        if (arg1 != 3008) {
            return (Object) null;
        } else if (var4 == null) {
            return null;
        } else {
            Object var5 = var4.method56(108);
            if (var5 == null) {
                var4.method961((byte) 53);
                var4.method358((byte) 52);
                this.field5448++;
                return null;
            }
            if (var4.method61(54)) {
                class273 var6 = new class273(var5);
                this.field5439.method503(var4.field2418, -82, var6);
                this.field5438.method800((byte) 98, var6);
                var6.field824 = 0L;
                var4.method961((byte) 113);
                var4.method358((byte) 52);
            } else {
                this.field5438.method800((byte) -33, var4);
                var4.field824 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 211)
    public static void method2176(int arg0) {
        if (arg0 != -9386) {
            field5449 = (class82) null;
        }
        field5436 = null;
        field5449 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 223)
    public final void method2177(int arg0, int arg1) {
        field5450++;
        if (class167.field2912 != null) {
            for (class9 var3 = (class9) this.field5438.method803((byte) 97); var3 != null; var3 = (class9) this.field5438.method802((byte) -71)) {
                if (var3.method61(101)) {
                    if (var3.method56(72) == null) {
                        var3.method961((byte) 73);
                        var3.method358((byte) 52);
                        this.field5448++;
                    }
                } else if (((long) arg0) < (++var3.field824)) {
                    class9 var4 = class167.field2912.method393(false, var3);
                    this.field5439.method503(var3.field2418, -81, var4);
                    class189.method1309(var3, 14437, var4);
                    var3.method961((byte) 54);
                    var3.method358((byte) 52);
                }
            }
        }
        int var5 = 38 / ((-arg1 - 65) / 54);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V", line = 278)
    public class317(int arg0) {
        this.field5448 = arg0;
        this.field5443 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5439 = new class79(var2);
    }
}
