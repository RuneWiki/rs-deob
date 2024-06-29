import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class21 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    private int field240 = 0;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    private int field242 = 0;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field249 = -1;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    private int field244 = 0;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    private int field254 = 128;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    private int field251 = 128;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Z")
    public boolean field252 = false;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
    public boolean field256 = false;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field238 = new Random();

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[S")
    private short[] field241;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[S")
    private short[] field243;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[S")
    private short[] field248;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[S")
    private short[] field250;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
    public static final void method134(byte arg0, int arg1) {
        if (arg0 != -4) {
            field238 = null;
        }
        field237++;
        class268.field4045.method1780(arg1, true);
        class24.field297.method1780(arg1, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BILfl;)V")
    private final void method135(byte arg0, int arg1, class248 arg2) {
        if (arg1 == 1) {
            this.field255 = arg2.method1575(false);
        } else if (arg1 == 2) {
            this.field249 = arg2.method1575(false);
        } else if (arg1 == 4) {
            this.field254 = arg2.method1575(false);
        } else if (arg1 == 5) {
            this.field251 = arg2.method1575(false);
        } else if (arg1 == 6) {
            this.field244 = arg2.method1575(false);
        } else if (arg1 == 7) {
            this.field242 = arg2.method1593((byte) 27);
        } else if (arg1 == 8) {
            this.field240 = arg2.method1593((byte) 27);
        } else if (arg1 == 9) {
            this.field252 = true;
        } else if (arg1 == 10) {
            this.field256 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method1593((byte) 27);
            this.field248 = new short[var6];
            this.field241 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field248[var7] = (short) arg2.method1575(false);
                this.field241[var7] = (short) arg2.method1575(false);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method1593((byte) 27);
            this.field250 = new short[var4];
            this.field243 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field243[var5] = (short) arg2.method1575(false);
                this.field250[var5] = (short) arg2.method1575(false);
            }
        }
        field245++;
        if (arg0 <= 60) {
            method134((byte) 67, -123);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIB)V")
    public static final void method136(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 0) {
            class196.field2979.method1106(160, false);
            class259.field3953++;
            class196.field2979.method1568(5, (byte) 49);
        }
        if (arg3 != 67) {
            method136(-80, -123, -45, (byte) -32);
        }
        if (arg2 == 1) {
            class196.field2979.method1106(186, false);
            class196.field2979.method1568(19, (byte) 49);
            class67.field1071++;
        }
        field236++;
        class196.field2979.method1591(class140.field2048[82] ? 1 : 0, true);
        class196.field2979.method1588(arg1 + class147.field2141, (byte) 43);
        class196.field2979.method1599(9611, class81.field1303 + arg0);
        class56.field892 = arg0;
        class225.field3364 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method137(boolean arg0) {
        field238 = null;
        if (!arg0) {
            field246 = -76;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLfl;)V")
    public final void method138(byte arg0, class248 arg1) {
        if (arg0 != -65) {
            this.field243 = null;
        }
        field239++;
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                return;
            }
            this.method135((byte) 74, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBII)Lfk;")
    public final class14 method139(int arg0, byte arg1, int arg2, int arg3) {
        field247++;
        class14 var5 = (class14) class210.field3160.method1777((long) this.field253, (byte) 112);
        if (var5 == null) {
            class208 var6 = class208.method1332(class206.field3081, this.field255, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field248 != null) {
                for (int var7 = 0; var7 < this.field248.length; var7++) {
                    var6.method1340(this.field248[var7], this.field241[var7]);
                }
            }
            if (this.field243 != null) {
                for (int var8 = 0; var8 < this.field243.length; var8++) {
                    var6.method1318(this.field243[var8], this.field250[var8]);
                }
            }
            var5 = var6.method1315(this.field242 + 64, 850 - -this.field240, -30, -50, -30);
            class210.field3160.method1784((long) this.field253, var5, 0);
        }
        class14 var9;
        if (this.field249 == -1 || arg2 == -1) {
            var9 = var5.method83(true, true, true);
        } else {
            var9 = class276.method1829(this.field249, arg1 ^ 0xFFFF8DBF).method1379(arg2, var5, arg1 ^ 0x31BC, arg3, arg0);
        }
        if (arg1 != -104) {
            field246 = 90;
        }
        if (this.field254 != 128 || this.field251 != 128) {
            var9.method92(this.field254, this.field251, this.field254);
        }
        if (this.field244 != 0) {
            if (this.field244 == 90) {
                var9.method97();
            }
            if (this.field244 == 180) {
                var9.method85();
            }
            if (this.field244 == 270) {
                var9.method101();
            }
        }
        return var9;
    }
}
