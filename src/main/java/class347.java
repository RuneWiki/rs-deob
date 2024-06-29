import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class347 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field5347 = -1;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5348 = -2;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lpw;")
    public static class507 field5356 = new class507();

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
    public static boolean field5367 = false;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
    public static int[] field5368 = new int[6];

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Llp;")
    private class272 field5361;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ljava/lang/String;")
    private String field5355;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Ljava/lang/String;")
    private String field5358;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    private int[] field5345;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    private int[] field5346;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    private int[] field5349;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    private int[] field5352;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[I")
    private int[] field5353;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
    private int[] field5360;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    private int[] field5364;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
    private int[] field5369;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field5354;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field5363;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[[I")
    private int[][] field5350;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[[I")
    private int[][] field5359;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[[I")
    private int[][] field5366;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2242(int arg0, int arg1, byte arg2) {
        int var3 = 34 % ((92 - arg2) / 33);
        field5357++;
        return class17.method165(arg0, 0, arg1) || class167.method1134(55, arg1, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method2243(int arg0) {
        field5356 = null;
        field5368 = null;
        if (arg0 != 0) {
            field5368 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public final void method2244(int arg0) {
        if (arg0 != 0) {
            this.field5360 = null;
        }
        field5351++;
        if (this.field5358 == null) {
            this.field5358 = this.field5355;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lnj;ZI)V")
    private final void method2245(class164 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field5350 = null;
        }
        if (arg2 == 1) {
            this.field5355 = arg0.method1110((byte) 8);
        } else if (arg2 == 2) {
            this.field5358 = arg0.method1110((byte) 8);
        } else if (arg2 == 3) {
            int var4 = arg0.method1087(false);
            this.field5350 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5350[var5][0] = arg0.method1074(-635989152);
                this.field5350[var5][1] = arg0.method1099(-127);
                this.field5350[var5][2] = arg0.method1099(-128);
            }
        } else if (arg2 == 4) {
            int var22 = arg0.method1087(arg1);
            this.field5366 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5366[var23][0] = arg0.method1074(-635989152);
                this.field5366[var23][1] = arg0.method1099(-124);
                this.field5366[var23][2] = arg0.method1099(86);
            }
        } else if (arg2 == 5) {
            arg0.method1074(-635989152);
        } else if (arg2 == 6) {
            arg0.method1087(arg1);
        } else if (arg2 == 7) {
            arg0.method1087(false);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method1087(false);
            } else if (arg2 == 10) {
                int var6 = arg0.method1087(false);
                this.field5364 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5364[var7] = arg0.method1099(-107);
                }
            } else if (arg2 == 12) {
                arg0.method1099(43);
            } else if (arg2 == 13) {
                int var20 = arg0.method1087(false);
                this.field5360 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5360[var21] = arg0.method1074(-635989152);
                }
            } else if (arg2 == 14) {
                int var18 = arg0.method1087(false);
                this.field5359 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5359[var19][0] = arg0.method1087(false);
                    this.field5359[var19][1] = arg0.method1087(false);
                }
            } else if (arg2 == 15) {
                arg0.method1074(-635989152);
            } else if (arg2 == 17) {
                this.field5347 = arg0.method1074(-635989152);
            } else if (arg2 == 18) {
                int var8 = arg0.method1087(false);
                this.field5353 = new int[var8];
                this.field5354 = new String[var8];
                this.field5349 = new int[var8];
                this.field5369 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5349[var9] = arg0.method1099(-110);
                    this.field5369[var9] = arg0.method1099(38);
                    this.field5353[var9] = arg0.method1099(-125);
                    this.field5354[var9] = arg0.method1064(false);
                }
            } else if (arg2 == 19) {
                int var16 = arg0.method1087(arg1);
                this.field5352 = new int[var16];
                this.field5363 = new String[var16];
                this.field5346 = new int[var16];
                this.field5345 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field5352[var17] = arg0.method1099(-109);
                    this.field5346[var17] = arg0.method1099(-119);
                    this.field5345[var17] = arg0.method1099(-104);
                    this.field5363[var17] = arg0.method1064(false);
                }
            } else if (arg2 == 249) {
                int var10 = arg0.method1087(false);
                if (this.field5361 == null) {
                    int var11 = class475.method2835(var10, -1);
                    this.field5361 = new class272(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method1087(arg1) == 1;
                    int var14 = arg0.method1090(-1);
                    class5 var15;
                    if (var13) {
                        var15 = new class344(arg0.method1064(arg1));
                    } else {
                        var15 = new class160(arg0.method1099(30));
                    }
                    this.field5361.method1751((long) var14, -117, var15);
                }
            }
        }
        field5362++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLnj;)V")
    public final void method2246(byte arg0, class164 arg1) {
        int var3 = -102 / ((arg0 + 12) / 56);
        field5365++;
        while (true) {
            int var4 = arg1.method1087(false);
            if (var4 == 0) {
                return;
            }
            this.method2245(arg1, false, var4);
        }
    }
}
