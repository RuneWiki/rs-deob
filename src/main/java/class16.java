import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class16 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lti;")
    private class155 field229;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lff;")
    private class269 field234;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Le;")
    private class201 field228;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lda;")
    public static class275 field231 = class255.method1672(124, "Fertigkeit: ");

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "J")
    public static long field233 = 0L;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[Lfb;")
    public static class109[] field238 = new class109[2048];

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lda;")
    public static class275 field236 = class255.method1672(94, "showingVideoAd");

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lij;")
    private class85 field241;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "[Lrk;")
    public static class20[] field244;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[Lai;")
    private class53[] field230;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILob;ZLob;I)Lai;")
    private final class53 method80(int arg0, class117 arg1, boolean arg2, class117 arg3, int arg4) {
        field239++;
        if (this.field241 == null) {
            throw new RuntimeException();
        }
        this.field241.field1392 = arg4 * 8 + arg0;
        if (this.field241.field1392 >= this.field241.field1381.length) {
            throw new RuntimeException();
        } else if (this.field230[arg4] == null) {
            int var6 = this.field241.method568(19845);
            int var7 = this.field241.method568(19845);
            class53 var8 = new class53(arg4, arg1, arg3, this.field234, this.field229, var6, var7, arg2);
            this.field230[arg4] = var8;
            return var8;
        } else {
            return this.field230[arg4];
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method81(boolean arg0) {
        field236 = null;
        if (arg0) {
            method81(false);
        }
        field238 = null;
        field244 = null;
        field231 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
    public static final void method82(boolean arg0) {
        if (!arg0) {
            field244 = null;
        }
        field227++;
        for (class162 var1 = (class162) class141.field2494.method550(-100); var1 != null; var1 = (class162) class141.field2494.method545(104)) {
            class178 var2 = var1.field2833;
            if (class159.field2790 != var2.field3052 || var2.field3063) {
                var1.method741(3);
            } else if (var2.field3064 <= class35.field576) {
                var2.method1199((byte) 123, class105.field1829);
                if (var2.field3063) {
                    var1.method741(3);
                } else {
                    class82.method533(var2.field3052, var2.field3049, var2.field3054, var2.field3065, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z")
    public final boolean method83(int arg0) {
        field245++;
        if (this.field241 != null) {
            return true;
        }
        if (this.field228 == null) {
            if (this.field234.method1777(true)) {
                return false;
            }
            this.field228 = this.field234.method1765(255, (byte) 0, true, 255, 1);
        }
        int var2 = 72 / ((-arg0 - 44) / 58);
        if (this.field228.field748) {
            return false;
        } else {
            this.field241 = new class85(this.field228.method264(4055));
            this.field230 = new class53[(this.field241.field1381.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final void method84(int arg0) {
        field246++;
        if (this.field230 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field230.length; var2++) {
            if (this.field230[var2] != null) {
                this.field230[var2].method333(false);
            }
        }
        for (int var3 = 0; var3 < this.field230.length; var3++) {
            if (this.field230[var3] != null) {
                this.field230[var3].method338(false);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public static final void method85(int arg0, int arg1, int arg2) {
        field243++;
        class199.field3390[arg1] = arg2;
        class190 var3 = (class190) class107.field1862.method1871(arg0, (long) arg1);
        if (var3 == null) {
            class190 var4 = new class190(4611686018427387905L);
            class107.field1862.method1867(true, (long) arg1, var4);
        } else if (var3.field3271 != 4611686018427387905L) {
            var3.field3271 = class121.method888((byte) -119) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZLma;)[Lrj;")
    public static final class13[] method86(int arg0, int arg1, boolean arg2, class105 arg3) {
        if (arg2) {
            field232++;
            return class210.method1353(arg0, arg3, arg1, (byte) -20) ? class203.method1327(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILob;Lob;I)Lai;")
    public final class53 method87(int arg0, class117 arg1, class117 arg2, int arg3) {
        field235++;
        if (arg0 != 8361) {
            this.field234 = null;
        }
        return this.method80(5, arg2, true, arg1, arg3);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lff;Lti;)V")
    public class16(class269 arg0, class155 arg1) {
        this.field229 = arg1;
        this.field234 = arg0;
        if (!this.field234.method1777(true)) {
            this.field228 = this.field234.method1765(255, (byte) 0, true, 255, 1);
        }
    }
}
