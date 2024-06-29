import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class160 extends class27 {

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    private int field2310 = 1;

    @OriginalMember(owner = "client!kn", name = "Y", descriptor = "I")
    private int field2322 = 1;

    @OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
    private int field2323 = 204;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!kn", name = "T", descriptor = "[I")
    public static int[] field2317 = new int[32];

    @OriginalMember(owner = "client!kn", name = "W", descriptor = "F")
    public static float field2320;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "Lmo;")
    public static class250 field2314;

    @OriginalMember(owner = "client!kn", name = "ab", descriptor = "Lqf;")
    public static class359 field2324;

    @OriginalMember(owner = "client!kn", name = "X", descriptor = "Lph;")
    public static class361 field2321;

    @OriginalMember(owner = "client!kn", name = "V", descriptor = "[I")
    public static int[] field2319;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lph;B)V", line = 6)
    public static final void method1147(class361 arg0, byte arg1) {
        field2312++;
        class316.field4687 = arg0;
        if (arg1 != 7) {
            field2311 = 102;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 166)
    public class160() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)[I", line = 40)
    public final int[] method18(int arg0, byte arg1) {
        field2318++;
        if (arg1 != -62) {
            return (int[]) null;
        }
        int[] var3 = this.field375.method2087(-58, arg0);
        if (this.field375.field4382) {
            for (int var4 = 0; var4 < class209.field3053; var4++) {
                int var5 = class251.field3721[var4];
                int var6 = class215.field3175[arg0];
                int var7 = this.field2310 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2310) * this.field2310;
                int var9 = var6 % (4096 / this.field2322) * this.field2322;
                int var10 = this.field2322 * var6 >> 12;
                if (var9 < this.field2323) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2323 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2323 > var8) {
                    int var11;
                    for (var11 = var7 - var10; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILsb;I)V", line = 132)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2310 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field2322 = arg1.method1319(255);
        } else if (arg2 == 2) {
            this.field2323 = arg1.method1317((byte) 66);
        }
        field2313++;
        if (arg0 != -5836) {
            this.method18(-124, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)V", line = 170)
    public static final void method1148(int arg0) {
        class75 var1 = class260.field3879;
        synchronized (class260.field3879) {
            class209.field3054 = class22.field341;
            class146.field2099++;
            if (arg0 != 4) {
                field2321 = (class361) null;
            }
            if (class306.field4584 >= 0) {
                while (class306.field4584 != class28.field395) {
                    int var2 = class326.field4899[class28.field395];
                    class28.field395 = class28.field395 + 1 & 0x7F;
                    if (var2 < 0) {
                        class236.field3549[~var2] = false;
                    } else {
                        class236.field3549[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class236.field3549[var3] = false;
                }
                class306.field4584 = class28.field395;
            }
            class22.field341 = class314.field4670;
        }
        field2316++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V", line = 224)
    public static void method1149(boolean arg0) {
        field2321 = null;
        field2319 = null;
        field2314 = null;
        field2317 = null;
        if (!arg0) {
            method1147((class361) null, (byte) -97);
        }
        field2324 = null;
    }
}
