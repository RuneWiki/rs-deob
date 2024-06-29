import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class183 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Z")
    public boolean field3165 = false;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private int field3162 = 0;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    private int field3176 = 0;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field3175 = -1;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    private int field3173 = 128;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    private int field3179 = 128;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private int field3167 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
    public static int[] field3166;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[S")
    private short[] field3160;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[S")
    private short[] field3164;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[S")
    private short[] field3169;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[S")
    private short[] field3170;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method1286(int arg0, int arg1) {
        field3168++;
        if (arg0 != 14043) {
            field3166 = null;
        }
        class196.field3404.method82((byte) -109, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lrg;I)V")
    public final void method1287(class239 arg0, int arg1) {
        if (arg1 != -1) {
            this.field3176 = 110;
        }
        while (true) {
            int var3 = arg0.method1651(arg1 ^ 0xFFFFEFD4);
            if (var3 == 0) {
                field3181++;
                return;
            }
            this.method1292(85, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1288(int arg0) {
        field3161++;
        class220.field3763.method83(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field3166 = null;
        if (arg0 <= 47) {
            field3166 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lra;")
    public final class35 method1290(int arg0, int arg1) {
        field3174++;
        class35 var3 = (class35) class77.field1315.method84(24, (long) this.field3177);
        if (var3 == null) {
            class112 var4 = class112.method875(class266.field4642, this.field3163, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3160 != null) {
                for (int var5 = 0; var5 < this.field3160.length; var5++) {
                    var4.method879(this.field3160[var5], this.field3170[var5]);
                }
            }
            if (this.field3164 != null) {
                for (int var6 = 0; var6 < this.field3164.length; var6++) {
                    var4.method863(this.field3164[var6], this.field3169[var6]);
                }
            }
            var3 = var4.method862(this.field3162 + 64, this.field3176 + 850, -30, -50, -30);
            class77.field1315.method88(var3, 16518, (long) this.field3177);
        }
        if (arg1 < 58) {
            return null;
        }
        class35 var7;
        if (this.field3175 == -1 || arg0 == -1) {
            var7 = var3.method275(true, true);
        } else {
            var7 = class189.method1332(this.field3175, 2).method464(var3, arg0, (byte) -47);
        }
        if (this.field3179 != 128 || this.field3173 != 128) {
            var7.method276(this.field3179, this.field3173, this.field3179);
        }
        if (this.field3167 != 0) {
            if (this.field3167 == 90) {
                var7.method281();
            }
            if (this.field3167 == 180) {
                var7.method273();
            }
            if (this.field3167 == 270) {
                var7.method279();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
    public static final void method1291(int arg0, int arg1) {
        field3172++;
        class200.field3481 = arg1;
        class27.field455 = arg0;
        class27.field455 = -1;
        class94.method662(-1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILrg;)V")
    private final void method1292(int arg0, int arg1, class239 arg2) {
        if (arg1 == 1) {
            this.field3163 = arg2.method1663((byte) 76);
        } else if (arg1 == 2) {
            this.field3175 = arg2.method1663((byte) -114);
        } else if (arg1 == 4) {
            this.field3179 = arg2.method1663((byte) -127);
        } else if (arg1 == 5) {
            this.field3173 = arg2.method1663((byte) -93);
        } else if (arg1 == 6) {
            this.field3167 = arg2.method1663((byte) 74);
        } else if (arg1 == 7) {
            this.field3162 = arg2.method1651(4139);
        } else if (arg1 == 8) {
            this.field3176 = arg2.method1651(4139);
        } else if (arg1 == 9) {
            this.field3165 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method1651(4139);
            this.field3160 = new short[var4];
            this.field3170 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3160[var5] = (short) arg2.method1663((byte) 100);
                this.field3170[var5] = (short) arg2.method1663((byte) -72);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1651(4139);
            this.field3169 = new short[var6];
            this.field3164 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3164[var7] = (short) arg2.method1663((byte) 87);
                this.field3169[var7] = (short) arg2.method1663((byte) 97);
            }
        }
        if (arg0 >= 77) {
            field3178++;
        }
    }
}
