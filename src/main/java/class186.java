import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class186 extends class255 {

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "Leb;")
    public static class230 field3259 = class68.method589(0, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "Leb;")
    public class230 field3264;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "[I")
    public int[] field3262;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "[I")
    public int[] field3268;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "[I")
    public int[] field3269;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "[I")
    public int[] field3271;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILfk;I)V")
    private final void method1327(int arg0, class14 arg1, int arg2) {
        field3258++;
        if (arg2 == 1) {
            this.field3264 = arg1.method171((byte) 79);
        } else if (arg2 == 2) {
            int var4 = arg1.method200(255);
            this.field3271 = new int[var4];
            this.field3269 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3269[var5] = arg1.method161(4);
                int var6 = arg1.method200(255);
                if (var6 == 0) {
                    this.field3271[var5] = -1;
                } else {
                    this.field3271[var5] = var6;
                }
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method200(255);
            this.field3268 = new int[var7];
            this.field3262 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3268[var8] = arg1.method161(4);
                int var9 = arg1.method200(arg0 + 255);
                if (var9 == 0) {
                    this.field3262[var8] = -1;
                } else {
                    this.field3262[var8] = var9;
                }
            }
        }
        if (arg0 != 0) {
            method1329(-72, -41, 38);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static void method1328(boolean arg0) {
        if (!arg0) {
            method1328(false);
        }
        field3259 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)Lpd;")
    public static final class56 method1329(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        return var3 == null || var3.field4052 == null ? null : var3.field4052;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public final void method1330(int arg0) {
        if (this.field3268 != null) {
            for (int var2 = 0; var2 < this.field3268.length; var2++) {
                this.field3268[var2] = class177.method1290(this.field3268[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.field3268 = null;
        }
        if (this.field3269 != null) {
            for (int var3 = 0; var3 < this.field3269.length; var3++) {
                this.field3269[var3] = class177.method1290(this.field3269[var3], 32768);
            }
        }
        field3265++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILfk;)Lcj;")
    public static final class115 method1331(int arg0, class14 arg1) {
        field3261++;
        return arg0 == -1 ? new class115(arg1.method178(arg0), arg1.method178(-1), arg1.method178(arg0), arg1.method178(-1), arg1.method190(arg0 ^ 0x62B2), arg1.method200(255)) : null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lfk;I)V")
    public final void method1332(class14 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                if (arg1 != 30695) {
                    this.field3268 = null;
                }
                field3267++;
                return;
            }
            this.method1327(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(II)I")
    public final int method1333(int arg0, int arg1) {
        if (arg0 != -4) {
            return 83;
        }
        field3260++;
        if (this.field3269 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3269.length; var3++) {
            if (this.field3271[var3] == arg1) {
                return this.field3269[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(II)I")
    public final int method1334(int arg0, int arg1) {
        field3270++;
        if (this.field3268 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3268.length; var3++) {
            if (this.field3262[var3] == arg1) {
                return this.field3268[var3];
            }
        }
        int var4 = -52 % ((arg0 - 13) / 34);
        return -1;
    }
}
