import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class606 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field8222 = -1;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lee;")
    private class706 field8241;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Ljava/lang/String;")
    private String field8227;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Ljava/lang/String;")
    private String field8228;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
    private int[] field8226;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    private int[] field8229;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
    private int[] field8231;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[I")
    private int[] field8234;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    private int[] field8236;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
    private int[] field8237;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
    private int[] field8240;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "[I")
    private int[] field8242;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field8223;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field8233;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[[I")
    private int[][] field8225;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[[I")
    private int[][] field8230;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[[I")
    private int[][] field8239;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V", line = 27)
    public static final void method3357(int arg0, byte arg1) {
        field8232++;
        class16 var2 = class94.method753(16, 13175, (long) arg0);
        if (arg1 != 81) {
            method3357(-56, (byte) 105);
        }
        var2.method118(arg1 + 585133991);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLjp;)V", line = 66)
    private final void method3358(int arg0, byte arg1, class376 arg2) {
        if (arg0 == 1) {
            this.field8228 = arg2.method2350(0);
        } else if (arg0 == 2) {
            this.field8227 = arg2.method2350(0);
        } else if (arg0 == 3) {
            int var22 = arg2.method2398(arg1 - 1372747242);
            this.field8230 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field8230[var23][0] = arg2.method2359(arg1 + 13);
                this.field8230[var23][1] = arg2.method2384(26);
                this.field8230[var23][2] = arg2.method2384(42);
            }
        } else if (arg0 == 4) {
            int var20 = arg2.method2398(-1372747256);
            this.field8225 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field8225[var21][0] = arg2.method2359(-1);
                this.field8225[var21][1] = arg2.method2384(105);
                this.field8225[var21][2] = arg2.method2384(62);
            }
        } else if (arg0 == 5) {
            arg2.method2359(arg1 ^ 0xD);
        } else if (arg0 == 6) {
            arg2.method2398(-1372747256);
        } else if (arg0 == 7) {
            arg2.method2398(arg1 ^ 0x51D275FA);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method2398(-1372747256);
            } else if (arg0 == 10) {
                int var4 = arg2.method2398(arg1 - 1372747242);
                this.field8226 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8226[var5] = arg2.method2384(class471.method2773(arg1, -34));
                }
            } else if (arg0 == 12) {
                arg2.method2384(44);
            } else if (arg0 == 13) {
                int var18 = arg2.method2398(-1372747256);
                this.field8240 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field8240[var19] = arg2.method2359(-1);
                }
            } else if (arg0 == 14) {
                int var16 = arg2.method2398(-1372747256);
                this.field8239 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field8239[var17][0] = arg2.method2398(class471.method2773(arg1, 1372747258));
                    this.field8239[var17][1] = arg2.method2398(-1372747256);
                }
            } else if (arg0 == 15) {
                arg2.method2359(-1);
            } else if (arg0 == 17) {
                this.field8222 = arg2.method2359(-1);
            } else if (arg0 == 18) {
                int var14 = arg2.method2398(-1372747256);
                this.field8237 = new int[var14];
                this.field8236 = new int[var14];
                this.field8223 = new String[var14];
                this.field8242 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field8236[var15] = arg2.method2384(68);
                    this.field8237[var15] = arg2.method2384(class471.method2773(arg1, -21));
                    this.field8242[var15] = arg2.method2384(118);
                    this.field8223[var15] = arg2.method2379((byte) 85);
                }
            } else if (arg0 == 19) {
                int var12 = arg2.method2398(-1372747256);
                this.field8234 = new int[var12];
                this.field8233 = new String[var12];
                this.field8231 = new int[var12];
                this.field8229 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field8234[var13] = arg2.method2384(37);
                    this.field8231[var13] = arg2.method2384(68);
                    this.field8229[var13] = arg2.method2384(6);
                    this.field8233[var13] = arg2.method2379((byte) 85);
                }
            } else if (arg0 == 249) {
                int var6 = arg2.method2398(-1372747256);
                if (this.field8241 == null) {
                    int var7 = class719.method4014(var6, (byte) -100);
                    this.field8241 = new class706(var7);
                }
                for (int var8 = 0; var8 < var6; var8++) {
                    boolean var9 = arg2.method2398(-1372747256) == 1;
                    int var10 = arg2.method2373(1223262424);
                    class101 var11;
                    if (var9) {
                        var11 = new class482(arg2.method2379((byte) 85));
                    } else {
                        var11 = new class119(arg2.method2384(125));
                    }
                    this.field8241.method3962((long) var10, var11, -119);
                }
            }
        }
        if (arg1 != -14) {
            this.field8242 = null;
        }
        field8235++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljp;Z)V", line = 297)
    public final void method3359(class376 arg0, boolean arg1) {
        field8224++;
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                if (arg1) {
                    this.field8237 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method3358(var3, (byte) -14, arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 323)
    public final void method3360(int arg0) {
        field8238++;
        if (this.field8227 == null) {
            this.field8227 = this.field8228;
        }
        if (arg0 != -2) {
            this.field8225 = null;
        }
    }
}
