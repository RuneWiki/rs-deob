import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class180 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    private int field3133 = 0;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    private int field3134 = 128;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    private int field3139 = 0;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public int field3137 = -1;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Z")
    public boolean field3145 = false;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    private int field3148 = 128;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    private int field3149 = 0;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
    public static int[] field3132 = new int[1000];

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Loa;")
    public static class99 field3138 = class221.method1463(2844, "showVideoAd");

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
    public static int[] field3131 = new int[128];

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field3146 = 0;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[S")
    private short[] field3126;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[S")
    private short[] field3141;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "[S")
    private short[] field3142;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[S")
    private short[] field3147;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[[[B")
    public static byte[][][] field3136;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILik;)V")
    private final void method1203(int arg0, int arg1, class261 arg2) {
        field3143++;
        if (arg1 == 1) {
            this.field3150 = arg2.method1740((byte) 116);
        } else if (arg1 == 2) {
            this.field3137 = arg2.method1740((byte) 123);
        } else if (arg1 == 4) {
            this.field3148 = arg2.method1740((byte) 74);
        } else if (arg1 == 5) {
            this.field3134 = arg2.method1740((byte) 113);
        } else if (arg1 == 6) {
            this.field3139 = arg2.method1740((byte) 71);
        } else if (arg1 == 7) {
            this.field3133 = arg2.method1693((byte) 77);
        } else if (arg1 == 8) {
            this.field3149 = arg2.method1693((byte) 34);
        } else if (arg1 == 9) {
            this.field3145 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method1693((byte) 63);
            this.field3141 = new short[var4];
            this.field3126 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3126[var5] = (short) arg2.method1740((byte) 91);
                this.field3141[var5] = (short) arg2.method1740((byte) 105);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1693((byte) -99);
            this.field3147 = new short[var6];
            this.field3142 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3142[var7] = (short) arg2.method1740((byte) 77);
                this.field3147[var7] = (short) arg2.method1740((byte) 103);
            }
        }
        if (arg0 < 27) {
            field3131 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1204(byte arg0) {
        field3131 = null;
        field3132 = null;
        int var1 = -8 % ((arg0 - 15) / 50);
        field3136 = null;
        field3138 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lik;I)Loa;")
    public static final class99 method1205(class261 arg0, int arg1) {
        field3140++;
        if (arg1 != 32767) {
            field3138 = null;
        }
        return class139.method949(32767, (byte) 7, arg0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Lcl;")
    public final class195 method1206(int arg0, int arg1) {
        field3130++;
        class195 var3 = (class195) class79.field1396.method1811((long) this.field3135, 120);
        if (var3 == null) {
            class285 var4 = class285.method1872(class187.field3305, this.field3150, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3126 != null) {
                for (int var5 = 0; var5 < this.field3126.length; var5++) {
                    var4.method1870(this.field3126[var5], this.field3141[var5]);
                }
            }
            if (this.field3142 != null) {
                for (int var6 = 0; var6 < this.field3142.length; var6++) {
                    var4.method1883(this.field3142[var6], this.field3147[var6]);
                }
            }
            var3 = var4.method1884(this.field3133 + 64, this.field3149 + 850, -30, -50, -30);
            class79.field1396.method1817((long) this.field3135, 16, var3);
        }
        class195 var7;
        if (this.field3137 == -1 || arg1 == -1) {
            var7 = var3.method211(true, true);
        } else {
            var7 = class38.method297(132, this.field3137).method1792(arg1, var3, -30734);
        }
        if (this.field3148 != 128 || this.field3134 != 128) {
            var7.method221(this.field3148, this.field3134, this.field3148);
        }
        if (arg0 <= 14) {
            return null;
        }
        if (this.field3139 != 0) {
            if (this.field3139 == 90) {
                var7.method217();
            }
            if (this.field3139 == 180) {
                var7.method204();
            }
            if (this.field3139 == 270) {
                var7.method229();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILik;)V")
    public final void method1207(int arg0, class261 arg1) {
        if (arg0 != 0) {
            this.method1203(35, -64, (class261) null);
        }
        while (true) {
            int var3 = arg1.method1693((byte) -109);
            if (var3 == 0) {
                field3129++;
                return;
            }
            this.method1203(88, var3, arg1);
        }
    }
}
