import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class310 extends class262 {

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    private int field5264 = 81;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    private int field5275 = 409;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    private int field5268 = 4;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    private int field5265 = 0;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "I")
    private int field5283 = 1024;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
    private int field5281 = 1024;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    private int field5274 = 204;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "I")
    private int field5286 = 8;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "Ljava/util/Random;")
    public static Random field5266 = new Random();

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "J")
    public static long field5285 = 0L;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "I")
    public static int field5284 = 0;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "B")
    public static byte field5280;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "[I")
    private int[] field5282;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "[[I")
    private int[][] field5271;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "[[I")
    private int[][] field5276;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 202)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)V", line = 19)
    private final void method2181(byte arg0) {
        Random var2 = new Random((long) this.field5286);
        this.field5271 = new int[this.field5286][this.field5268];
        this.field5267 = this.field5264 / 2;
        this.field5276 = new int[this.field5286][this.field5268 + 1];
        this.field5269 = 4096 / this.field5268;
        int var3 = this.field5269 / 2;
        this.field5282 = new int[this.field5286 + 1];
        this.field5282[0] = 0;
        int var4 = 71 % ((11 - arg0) / 37);
        field5277++;
        this.field5279 = 4096 / this.field5286;
        int var5 = this.field5279 / 2;
        for (int var6 = 0; var6 < this.field5286; var6++) {
            if (var6 > 0) {
                int var7 = this.field5279;
                int var8 = (class9.method66(-482656096, 4096, var2) - 2048) * this.field5274 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field5282[var6] = this.field5282[var6 - 1] + var9;
            }
            this.field5276[var6][0] = 0;
            for (int var10 = 0; var10 < this.field5268; var10++) {
                if (var10 > 0) {
                    int var11 = this.field5269;
                    int var12 = (class9.method66(-482656096, 4096, var2) - 2048) * this.field5275 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field5276[var6][var10] = this.field5276[var6][var10 - 1] + var13;
                }
                this.field5271[var6][var10] = this.field5281 <= 0 ? 4096 : 4096 - class9.method66(-482656096, this.field5281, var2);
            }
            this.field5276[var6][this.field5268] = 4096;
        }
        this.field5282[this.field5286] = 4096;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I", line = 91)
    public final int[] method38(int arg0, byte arg1) {
        field5278++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 112);
        if (arg1 > -85) {
            this.method43(-24);
        }
        if (this.field4350.field3333) {
            int var4;
            for (var4 = class312.field5326[arg0] + this.field5265; var4 < 0; var4 += 4096) {
            }
            int var5 = 0;
            while (var4 > 4096) {
                var4 -= 4096;
            }
            while (var5 < this.field5286 && this.field5282[var5] <= var4) {
                var5++;
            }
            int var6 = var5 - 1;
            int var7 = this.field5282[var5 - 1];
            boolean var8 = (var5 & 0x1) == 0;
            int var9 = this.field5282[var5];
            if (this.field5267 + var7 < var4 && (var9 - this.field5267) > var4) {
                for (int var10 = 0; var10 < class98.field1598; var10++) {
                    int var11 = var8 ? this.field5283 : -this.field5283;
                    int var12;
                    for (var12 = (this.field5269 * var11 >> 12) + class210.field3485[var10]; var12 < 0; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field5268 > var13 && var12 >= this.field5276[var6][var13]) {
                        var13++;
                    }
                    int var14 = var13 - 1;
                    int var15 = this.field5276[var6][var13];
                    int var16 = this.field5276[var6][var14];
                    if (var12 > this.field5267 + var16 && var12 < (var15 - this.field5267)) {
                        var3[var10] = this.field5271[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class244.method1767(var3, 0, class98.field1598, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V", line = 192)
    public final void method43(int arg0) {
        this.method2181((byte) 74);
        if (arg0 == -2) {
            field5272++;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lwe;II)V", line = 209)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field5270++;
        if (arg1 != 2048) {
            return;
        }
        if (arg2 == 0) {
            this.field5268 = arg0.method368(-124);
        } else if (arg2 == 1) {
            this.field5286 = arg0.method368(-126);
        } else if (arg2 == 2) {
            this.field5275 = arg0.method379(-2);
        } else if (arg2 == 3) {
            this.field5274 = arg0.method379(-2);
        } else if (arg2 == 4) {
            this.field5283 = arg0.method379(-2);
        } else if (arg2 == 5) {
            this.field5265 = arg0.method379(-2);
        } else if (arg2 == 6) {
            this.field5264 = arg0.method379(-2);
        } else if (arg2 == 7) {
            this.field5281 = arg0.method379(-2);
        }
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V", line = 316)
    public static void method2182(int arg0) {
        field5266 = null;
        if (arg0 > -52) {
            field5284 = -46;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ltd;IIII)V", line = 334)
    public static final void method2183(class234 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5273++;
        if (class102.field1639 == arg0 || class45.field763 >= 400 || arg1 > -120) {
            return;
        }
        class146 var11;
        if (arg0.field3892 == 0) {
            boolean var5 = true;
            if (class102.field1639.field3902 != -1 && arg0.field3902 != -1) {
                int var6 = arg0.field3900 < class102.field1639.field3900 ? class102.field1639.field3900 : arg0.field3900;
                int var7 = arg0.field3902 <= class102.field1639.field3902 ? arg0.field3902 : class102.field1639.field3902;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class102.field1639.field3900 - arg0.field3900;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            class146 var10 = class95.field1530 == 1 ? class159.field2691 : class261.field4342;
            if (arg0.field3899 <= arg0.field3900) {
                var11 = class112.method758(127, new class146[] { arg0.method1715(-49), var5 ? class238.method1737((byte) 106, class102.field1639.field3900, arg0.field3900) : class93.field1506, class265.field4560, var10, class82.method585(14744, arg0.field3900), class92.field1465 });
            } else {
                var11 = class112.method758(121, new class146[] { arg0.method1715(-86), var5 ? class238.method1737((byte) -29, class102.field1639.field3900, arg0.field3900) : class93.field1506, class265.field4560, var10, class82.method585(14744, arg0.field3900), class234.field3887, class82.method585(14744, arg0.field3899 - arg0.field3900), class92.field1465 });
            }
        } else {
            var11 = class112.method758(126, new class146[] { arg0.method1715(-67), class265.field4560, class103.field1668, class82.method585(14744, arg0.field3892), class92.field1465 });
        }
        if (class161.field2736 == 1) {
            class281.method2039(arg2, (long) arg3, (short) 20, 12241, class269.field4618, arg4, class112.method758(121, new class146[] { class281.field4825, class217.field3584, var11 }), class224.field3735);
            class13.field243++;
        } else if (!class272.field4668) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class27.field472[var12] != null) {
                    short var13 = 0;
                    class5.field124++;
                    if (class95.field1530 == 0 && class27.field472[var12].method1106(class278.field4766, 101)) {
                        if (class102.field1639.field3900 < arg0.field3900) {
                            var13 = 2000;
                        }
                        if (class102.field1639.field3883 != 0 && arg0.field3883 != 0) {
                            if (class102.field1639.field3883 == arg0.field3883) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class118.field1913[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class51.field932[var12];
                    short var16 = (short) (var13 + var15);
                    class281.method2039(arg2, (long) arg3, var16, 12241, class33.field633[var12], arg4, class112.method758(124, new class146[] { class93.field1506, var11 }), class27.field472[var12]);
                }
            }
        } else if ((class180.field3023 & 0x8) == 8) {
            class249.field4177++;
            class281.method2039(arg2, (long) arg3, (short) 42, 12241, -1, arg4, class112.method758(126, new class146[] { class238.field3968, class217.field3584, var11 }), class135.field2257);
        }
        for (int var17 = 0; var17 < class45.field763; var17++) {
            if (class224.field3739[var17] == 22) {
                class214.field3525[var17] = class112.method758(-73, new class146[] { class93.field1506, var11 });
                break;
            }
        }
    }
}
