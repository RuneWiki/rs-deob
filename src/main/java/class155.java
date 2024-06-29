import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class155 extends class16 {

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private int field2368 = 0;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    private int field2377 = 409;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    private int field2380 = 4;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    private int field2379 = 1024;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    private int field2382 = 1024;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    private int field2384 = 81;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    private int field2367 = 8;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    private int field2387 = 204;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "Z")
    public static boolean field2388 = false;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "J")
    public static long field2385 = 0L;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "[I")
    private int[] field2374;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "[[I")
    private int[][] field2370;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "[[I")
    private int[][] field2371;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLim;I)V", line = 28)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2380 = arg1.method1399(-1172389784);
        } else if (arg2 == 1) {
            this.field2367 = arg1.method1399(-1172389784);
        } else if (arg2 == 2) {
            this.field2377 = arg1.method1396(-33);
        } else if (arg2 == 3) {
            this.field2387 = arg1.method1396(-31);
        } else if (arg2 == 4) {
            this.field2379 = arg1.method1396(-37);
        } else if (arg2 == 5) {
            this.field2368 = arg1.method1396(-28);
        } else if (arg2 == 6) {
            this.field2384 = arg1.method1396(arg0 - 52);
        } else if (arg2 == 7) {
            this.field2382 = arg1.method1396(-40);
        }
        field2378++;
        if (arg0 != -7) {
            this.method1078((byte) -18);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 105)
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Ljava/lang/String;", line = 109)
    public static final String method1077(int arg0, int arg1) {
        field2381++;
        if (arg0 >= 999999999) {
            int var2 = -90 % ((23 - arg1) / 43);
            return "*";
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V", line = 124)
    private final void method1078(byte arg0) {
        field2386++;
        Random var2 = new Random((long) this.field2367);
        this.field2370 = new int[this.field2367][this.field2380 + 1];
        this.field2371 = new int[this.field2367][this.field2380];
        this.field2375 = this.field2384 / 2;
        this.field2376 = 4096 / this.field2380;
        this.field2373 = 4096 / this.field2367;
        int var3 = this.field2376 / 2;
        int var4 = this.field2373 / 2;
        this.field2374 = new int[this.field2367 + 1];
        if (arg0 != -18) {
            return;
        }
        this.field2374[0] = 0;
        for (int var5 = 0; var5 < this.field2367; var5++) {
            if (var5 > 0) {
                int var6 = this.field2373;
                int var7 = (class66.method434(4096, var2, -27852) - 2048) * this.field2387 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2374[var5] = this.field2374[var5 - 1] + var8;
            }
            this.field2370[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2380; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2376;
                    int var11 = (class66.method434(4096, var2, -27852) - 2048) * this.field2377 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2370[var5][var9] = this.field2370[var5][var9 - 1] + var12;
                }
                this.field2371[var5][var9] = this.field2382 > 0 ? 4096 - class66.method434(this.field2382, var2, -27852) : 4096;
            }
            this.field2370[var5][this.field2380] = 4096;
        }
        this.field2374[this.field2367] = 4096;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(ZI)[I", line = 190)
    public final int[] method8(boolean arg0, int arg1) {
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = 0;
            int var5;
            for (var5 = class130.field1921[arg1] + this.field2368; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2367 > var4 && var5 >= this.field2374[var4]) {
                var4++;
            }
            int var6 = this.field2374[var4 - 1];
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = var4 - 1;
            int var9 = this.field2374[var4];
            if (var5 > var6 + this.field2375 && var5 < (var9 - this.field2375)) {
                for (int var10 = 0; var10 < class276.field4376; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field2379 : -this.field2379;
                    int var13;
                    for (var13 = (this.field2376 * var12 >> 12) + class27.field396[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field2380 > var11 && var13 >= this.field2370[var8][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field2370[var8][var14];
                    int var16 = this.field2370[var8][var11];
                    if ((this.field2375 + var15) < var13 && (var16 - this.field2375) > var13) {
                        var3[var10] = this.field2371[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class213.method1551(var3, 0, class276.field4376, 0);
            }
        }
        field2372++;
        if (!arg0) {
            this.field2374 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V", line = 293)
    public final void method55(byte arg0) {
        field2383++;
        if (arg0 != 0) {
            this.field2368 = -112;
        }
        this.method1078((byte) -18);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)J", line = 307)
    public static final long method1079(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        return var3 == null || var3.field3676 == null ? 0L : var3.field3676.field263;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V", line = 316)
    public static final void method1080(byte arg0) {
        int var1 = 108 % ((arg0 - 59) / 47);
        field2369++;
        class23.field335.method1615(110);
    }
}
