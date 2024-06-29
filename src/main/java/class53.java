import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class53 extends class382 {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
    private boolean field1126 = false;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field1128 = 0;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
    public boolean field1131 = false;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Ltn;")
    private class60 field1129 = new class60();

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    private int field1133 = 0;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Lmf;")
    public class291 field1132 = new class291();

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Z")
    private boolean field1137 = false;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    private int field1136 = 0;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Lip;")
    public class502 field1135 = new class502();

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "[Ldu;")
    public class240[] field1124 = new class240[8192];

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "J")
    private long field1130;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "J")
    private long field1127;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[Z")
    private static boolean[] field1123 = new boolean[8];

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "[Z")
    private static boolean[] field1125 = new boolean[8];

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()Lip;")
    public final class502 method490() {
        return this.field1135;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()V")
    public static void method491() {
        field1125 = null;
        field1123 = null;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()V")
    public final void method492() {
        this.field1131 = true;
        for (class129 var1 = (class129) this.field1132.method1892(110); var1 != null; var1 = (class129) this.field1132.method1893((byte) -2)) {
            if (var1.field2201.field4667 == 1) {
                var1.method1289((byte) -64);
            }
        }
        this.field1124 = new class240[8192];
        this.field1128 = 0;
        this.field1129 = new class60();
        this.field1133 = 0;
        this.field1132 = new class291();
        this.field1136 = 0;
        this.method2352((byte) 115);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1141 = arg0;
        this.field1138 = arg1;
        this.field1134 = arg2;
        this.field1139 = arg3;
        this.field1140 = arg4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lza;J)Z")
    public final boolean method494(class288 arg0, long arg1) {
        if (this.field1130 == this.field1127) {
            this.method502();
        } else {
            this.method499();
        }
        if (arg1 - this.field1130 > 750L) {
            this.method492();
            return false;
        }
        int var4 = (int) (arg1 - this.field1127);
        if (this.field1137) {
            for (class135 var5 = (class135) this.field1129.method533((byte) -108); var5 != null; var5 = (class135) this.field1129.method536(93)) {
                for (int var6 = 0; var6 < var5.field2261.field2412; var6++) {
                    var5.method1029(1, !this.field1126, 1, arg0, arg1);
                }
            }
            this.field1137 = false;
        }
        for (class135 var7 = (class135) this.field1129.method533((byte) -110); var7 != null; var7 = (class135) this.field1129.method536(-77)) {
            var7.method1029(var4, !this.field1126, 1, arg0, arg1);
        }
        this.field1127 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "()V")
    public final void method495() {
        this.field1137 = true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(J)V")
    public final void method496(long arg0) {
        this.field1130 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lza;[Lfi;Z)V")
    private final void method497(class288 arg0, class393[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1125[var4] = false;
        }
        label64: for (class135 var5 = (class135) this.field1129.method533((byte) -98); var5 != null; var5 = (class135) this.field1129.method536(115)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2281 || arg1[var8].field5989 == var5.field2281) {
                        field1125[var8] = true;
                        var5.method1028((byte) -56);
                        var5.field2276 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2265 == 0) {
                    var5.method2352((byte) 125);
                    this.field1133--;
                } else {
                    var5.field2276 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1133 != 8; var6++) {
            if (!field1125[var6]) {
                class135 var7 = new class135(arg0, arg1[var6], this, this.field1130);
                this.field1129.method531((byte) -14, var7);
                this.field1133++;
                field1125[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([Lkh;Z)V")
    private final void method498(class13[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1123[var3] = false;
        }
        label73: for (class129 var4 = (class129) this.field1132.method1892(112); var4 != null; var4 = (class129) this.field1132.method1893((byte) -2)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2193 || arg0[var7].field237 == var4.field2193) {
                        field1123[var7] = true;
                        var4.method1009((byte) 123);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1676(true);
                this.field1136--;
                if (var4.method1286((byte) -84)) {
                    var4.method1289((byte) 121);
                    class524.field7617--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1136 != 8; var5++) {
            if (!field1123[var5]) {
                class129 var6 = null;
                if (arg0[var5].method88((byte) 117).field4667 == 1 && class524.field7617 < 32) {
                    var6 = new class129(arg0[var5], this);
                    class199.field3242.method1238((long) arg0[var5].field244, var6, -1);
                    class524.field7617++;
                }
                if (var6 == null) {
                    var6 = new class129(arg0[var5], this);
                }
                this.field1132.method1885(false, var6);
                this.field1136++;
                field1123[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "()V")
    public final void method499() {
        this.field1126 = true;
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "()V")
    public final void method500() {
        this.field1135.field7340.method1112((byte) 52);
        for (class135 var1 = (class135) this.field1129.method533((byte) -55); var1 != null; var1 = (class135) this.field1129.method536(71)) {
            var1.method1026(this.field1127, 47);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lza;J[Lfi;[Lkh;Z)V")
    public final void method501(class288 arg0, long arg1, class393[] arg2, class13[] arg3, boolean arg4) {
        if (!this.field1131) {
            this.method497(arg0, arg2, arg4);
            this.method498(arg3, arg4);
            this.field1130 = arg1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "()V")
    private final void method502() {
        this.field1126 = false;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
    public class53(int arg0) {
        class63.field1296.method531((byte) 110, this);
        this.field1130 = arg0;
        this.field1127 = arg0;
        this.field1137 = true;
    }
}
