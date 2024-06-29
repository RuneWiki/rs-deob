import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    private int field253 = 0;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    private int field258 = -1;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Luh;")
    private class168 field257 = new class168();

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
    public boolean field266 = false;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[Lgba;")
    private class667[] field259;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[[I")
    private int[][] field260;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lsh;")
    public static class70 field264 = new class70(0);

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Lwq;")
    public static class169 field267 = new class169(2);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)[[I", line = 4)
    public final int[][] method121(byte arg0) {
        field254++;
        if (this.field261 != this.field255) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field255; var2++) {
            this.field259[var2] = class301.field4201;
        }
        if (arg0 != 16) {
            this.method121((byte) -42);
        }
        return this.field260;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method122(boolean arg0) {
        class755.field10546 = null;
        field265++;
        class124.field2130 = null;
        if (!arg0) {
            method125(-122);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 41)
    public static final void method123(String arg0, int arg1) {
        class128.method1064("", arg1, (byte) -125, 0, arg0, "", "");
        field256++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIIIIIILkda;Lkda;)V", line = 50)
    public static final void method124(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class390 arg8, class390 arg9) {
        field263++;
        int var10 = arg8.method57(-1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class496 var12 = (class496) class465.field6523.method992((long) var10, 118);
        if (var12 == null) {
            class267[] var13 = class267.method1778(class569.field7819, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class272.field3822.method356(var13[0], true);
            class465.field6523.method991(var12, (long) var10, (byte) -115);
        }
        class393.method2472(arg9.field5926, arg5, 0, arg3 >> 1, arg9.field5922, arg9.method2457((byte) 126) * 256, arg9.field5933, (byte) 92, arg6 >> 1, arg2);
        int var14 = class339.field4768[0] + arg7 - 18;
        int var15 = class339.field4768[1] + arg4 - 54 - 16;
        int var16 = arg0 / 4 * 18 + var14;
        int var17 = arg0 % 4 * 18 + var15;
        int var18 = -76 / ((arg1 - 3) / 38);
        var12.method2925(var16, var17);
        if (arg8 == arg9) {
            class272.field3822.method623(18, var17 - 1, -256, var16 - 1, 18, 57);
        }
        class546.method3152(-5590, var16 - 1, var16 + 18, var17 - 1, var17 - -18);
        class733 var19 = class657.method3705(32564);
        var19.field9893 = var16 + 16;
        var19.field9894 = var17;
        var19.field9898 = arg8;
        var19.field9892 = var17 + 16;
        var19.field9896 = var16;
        class696.field9402.method1298(-87, var19);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 103)
    public static void method125(int arg0) {
        field267 = null;
        field264 = null;
        if (arg0 != 0) {
            field264 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 117)
    public final void method126(byte arg0) {
        for (int var2 = 0; var2 < this.field255; var2++) {
            this.field260[var2] = null;
        }
        field252++;
        this.field259 = null;
        this.field260 = null;
        this.field257.method1270(112);
        if (arg0 != 124) {
            this.field261 = -126;
        }
        this.field257 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(III)V", line = 225)
    public class16(int arg0, int arg1, int arg2) {
        this.field255 = arg0;
        this.field261 = arg1;
        this.field259 = new class667[this.field261];
        this.field260 = new int[this.field255][arg2];
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 150)
    public final int[] method127(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method121((byte) 108);
        }
        field262++;
        if (this.field261 == this.field255) {
            this.field266 = this.field259[arg1] == null;
            this.field259[arg1] = class301.field4201;
            return this.field260[arg1];
        } else if (this.field255 == 1) {
            this.field266 = this.field258 != arg1;
            this.field258 = arg1;
            return this.field260[0];
        } else {
            class667 var3 = this.field259[arg1];
            if (var3 == null) {
                this.field266 = true;
                if (this.field255 > this.field253) {
                    var3 = new class667(arg1, this.field253);
                    this.field253++;
                } else {
                    class667 var4 = (class667) this.field257.method1267(arg0 - 123);
                    var3 = new class667(arg1, var4.field9108);
                    this.field259[var4.field9102] = null;
                    var4.method2314((byte) 80);
                }
                this.field259[arg1] = var3;
            } else {
                this.field266 = false;
            }
            this.field257.method1275(var3, -90);
            return this.field260[var3.field9108];
        }
    }
}
