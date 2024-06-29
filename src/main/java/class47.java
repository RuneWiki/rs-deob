import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class47 extends class152 {

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    private int field725 = 0;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "[S")
    private short[] field732 = new short[257];

    @OriginalMember(owner = "client!di", name = "S", descriptor = "Lce;")
    public static class126 field722 = class206.method1445(-7923, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    public static int field734 = 0;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "Lvc;")
    public static class129 field724 = new class129();

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Luj;")
    public static class157 field728;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "Lhm;")
    public static class86 field721;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "[I")
    private int[] field729;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "[I")
    private int[] field738;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "[[I")
    private int[][] field736;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(II)I", line = 6)
    public static int method289(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[I", line = 13)
    private final int[] method290(int arg0, byte arg1) {
        if (arg1 > -28) {
            return (int[]) null;
        }
        field730++;
        if (arg0 < 0) {
            return this.field738;
        } else if (this.field736.length <= arg0) {
            return this.field729;
        } else {
            return this.field736[arg0];
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 45)
    public static final void method291(Component arg0, int arg1) {
        arg0.removeMouseListener(class294.field4879);
        field723++;
        arg0.removeMouseMotionListener(class294.field4879);
        arg0.removeFocusListener(class294.field4879);
        class185.field3206 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V", line = 56)
    public final void method2(byte arg0) {
        field727++;
        if (this.field736 == null) {
            this.field736 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field736.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        int var2 = -26 % ((2 - arg0) / 37);
        if (this.field725 == 2) {
            this.method293((byte) -69);
        }
        class158.method1159(-103);
        this.method292(-58);
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 80)
    private final void method292(int arg0) {
        field731++;
        int var2 = this.field725;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field736.length - 1 && var21 >= this.field736[var22][0]; var22++) {
                }
                int[] var23 = this.field736[var22 - 1];
                int[] var24 = this.field736[var22];
                int var25 = this.method290(var22 - 2, (byte) -111)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method290(var22 + 1, (byte) -109)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var26 + var28 - var27 - var25;
                int var31 = var29 * var29 >> 12;
                int var32 = var25 - var30 - var26;
                int var34 = var27 - var25;
                int var35 = var31 * var32 >> 12;
                int var36 = (var29 * var30 >> 12) * var31 >> 12;
                int var37 = var29 * var34 >> 12;
                int var38 = var36 + var26 - (-var35 - var37);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field732[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field736.length - 1 > var5 && this.field736[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field736[var5];
                int[] var7 = this.field736[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - class270.field4554[(var8 & 0x1FF3) >> 5] >> 1;
                int var10 = 4096 - var9;
                int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field732[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; var14 < (this.field736.length - 1) && var13 >= this.field736[var14][0]; var14++) {
                }
                int[] var15 = this.field736[var14 - 1];
                int[] var16 = this.field736[var14];
                int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field732[var12] = (short) var19;
            }
        }
        int var39 = -111 / ((34 - arg0) / 62);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)[I", line = 256)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            field734 = -35;
        }
        field726++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, -102, 0);
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field732[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILbb;)V", line = 299)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            return;
        }
        if (arg1 == 0) {
            this.field725 = arg2.method948(-126);
            this.field736 = new int[arg2.method948(-126)][2];
            for (int var4 = 0; var4 < this.field736.length; var4++) {
                this.field736[var4][0] = arg2.method942(true);
                this.field736[var4][1] = arg2.method942(true);
            }
        }
        field739++;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(B)V", line = 326)
    private final void method293(byte arg0) {
        field737++;
        int[] var2 = this.field736[0];
        int[] var3 = this.field736[1];
        int[] var4 = this.field736[this.field736.length - 2];
        if (arg0 >= -27) {
            method294(-18);
        }
        int[] var5 = this.field736[this.field736.length - 1];
        this.field729 = new int[] { var4[0] + var4[0] - var5[0], var4[1] - var5[1] + var4[1] };
        this.field738 = new int[] { var2[0] + var2[0] - var3[0], -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V", line = 346)
    public static void method294(int arg0) {
        field721 = null;
        field722 = null;
        field724 = null;
        field728 = null;
        if (arg0 != -18886) {
            field734 = -45;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lcc;Lcc;Lcc;BLcc;)V", line = 359)
    public static final void method295(class313 arg0, class313 arg1, class313 arg2, byte arg3, class313 arg4) {
        class238.field4012 = arg0;
        if (arg3 != 34) {
            return;
        }
        class37.field545 = arg2;
        class170.field3027 = arg4;
        class127.field2196 = arg1;
        class291.field4825 = new class112[class127.field2196.method2174(0)][];
        class136.field2363 = new boolean[class127.field2196.method2174(0)];
        field733++;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 380)
    public class47() {
        super(1, true);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIZII)V", line = 385)
    public static final void method296(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field735++;
        if (class23.field329 == arg1 && class107.field1691 == arg2 && class297.field4944 == arg5 || class22.method109(4096)) {
            return;
        }
        class297.field4944 = arg5;
        class107.field1691 = arg2;
        class23.field329 = arg1;
        if (class22.method109(4096)) {
            class297.field4944 = 0;
        }
        if (arg4) {
            class280.method1872(-85, 28);
        } else {
            class280.method1872(-116, 25);
        }
        class250.method1693(true, class302.field5036, true);
        int var7 = class138.field2473;
        int var8 = class58.field914;
        class58.field914 = arg1 * 8 - 48;
        if (arg6 > -25) {
            field721 = (class86) null;
        }
        class138.field2473 = (arg2 - 6) * 8;
        class54.field819 = class119.method785(class107.field1691 * 8, class23.field329 * 8, 127);
        int var9 = class58.field914 - var8;
        int var10 = class58.field914;
        class274.field4611 = null;
        int var11 = class138.field2473 - var7;
        int var12 = class138.field2473;
        if (arg4) {
            class30.field425 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class89 var17 = class199.field3391[var16];
                if (var17 != null) {
                    var17.field2487 -= var11 * 128;
                    var17.field2461 -= var9 * 128;
                    if (var17.field2461 >= 0 && var17.field2461 <= 13184 && var17.field2487 >= 0 && var17.field2487 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field2460[var18] -= var9;
                            var17.field2471[var18] -= var11;
                        }
                        class279.field4639[class30.field425++] = var16;
                    } else {
                        class199.field3391[var16].field1389 = null;
                        class199.field3391[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class89 var14 = class199.field3391[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field2460[var15] -= var9;
                        var14.field2471[var15] -= var11;
                    }
                    var14.field2461 -= var9 * 128;
                    var14.field2487 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class301 var20 = class85.field1352[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field2460[var21] -= var9;
                    var20.field2471[var21] -= var11;
                }
                var20.field2461 -= var9 * 128;
                var20.field2487 -= var11 * 128;
            }
        }
        class131.field2250 = arg5;
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        if (var9 < 0) {
            var22 = 103;
            var24 = -1;
            var23 = -1;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        class286.field4744.method2027(arg0, false, arg3, 0);
        if (var11 < 0) {
            var25 = 103;
            var26 = -1;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var11 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class89.field1388[var32][var28][var29] = class89.field1388[var32][var30][var31];
                    } else {
                        class89.field1388[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class252 var33 = (class252) class264.field4399.method898((byte) -64); var33 != null; var33 = (class252) class264.field4399.method893((byte) 14)) {
            var33.field4230 -= var11;
            var33.field4209 -= var9;
            if (var33.field4209 < 0 || var33.field4230 < 0 || var33.field4209 >= 104 || var33.field4230 >= 104) {
                var33.method499((byte) 64);
            }
        }
        if (arg4) {
            class190.field3269 -= var9;
            class91.field1439 -= var11;
            class152.field2780 -= var9 * 128;
            class207.field3556 -= var9;
            class223.field3755 -= var11 * 128;
            class296.field4930 -= var11;
        } else {
            class254.field4261 = 1;
        }
        class282.field4683 = 0;
        if (class27.field378 != 0) {
            class165.field2953 -= var11;
            class27.field378 -= var9;
        }
        if (class56.field846 && arg4 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class180.method1291(4064);
        }
        class73.field1180 = -1;
        class63.field1037.method905((byte) 63);
        class203.field3483.method905((byte) 108);
    }
}
