import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class165 {

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public int field2356 = -1;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2348 = 0;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2363 = -1;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Ldj;")
    private class191 field2343;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ljava/lang/String;")
    private String field2346;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Ljava/lang/String;")
    private String field2362;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
    private int[] field2350;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
    private int[] field2352;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[I")
    private int[] field2355;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
    private int[] field2357;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
    private int[] field2358;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
    private int[] field2360;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[I")
    private int[] field2361;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field2342;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field2349;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[[I")
    private int[][] field2345;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "[[I")
    private int[][] field2354;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[[I")
    private int[][] field2359;

    static {
        new class349("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Llf;BI)V", line = 17)
    private final void method1192(class130 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field2346 = arg0.method801(1);
        } else if (arg2 == 2) {
            this.field2362 = arg0.method801(1);
        } else if (arg2 == 3) {
            int var4 = arg0.method837(true);
            this.field2345 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2345[var5][0] = arg0.method798(false);
                this.field2345[var5][1] = arg0.method815(true);
                this.field2345[var5][2] = arg0.method815(true);
            }
        } else if (arg2 == 4) {
            int var6 = arg0.method837(true);
            this.field2359 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2359[var7][0] = arg0.method798(false);
                this.field2359[var7][1] = arg0.method815(true);
                this.field2359[var7][2] = arg0.method815(true);
            }
        } else if (arg2 == 5) {
            arg0.method798(false);
        } else if (arg2 == 6) {
            arg0.method837(true);
        } else if (arg2 == 7) {
            arg0.method837(true);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method837(true);
            } else if (arg2 == 10) {
                int var8 = arg0.method837(true);
                this.field2357 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2357[var9] = arg0.method815(true);
                }
            } else if (arg2 == 12) {
                arg0.method815(true);
            } else if (arg2 == 13) {
                int var22 = arg0.method837(true);
                this.field2353 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field2353[var23] = arg0.method798(false);
                }
            } else if (arg2 == 14) {
                int var10 = arg0.method837(true);
                this.field2354 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field2354[var11][0] = arg0.method837(true);
                    this.field2354[var11][1] = arg0.method837(true);
                }
            } else if (arg2 == 15) {
                arg0.method798(false);
            } else if (arg2 == 17) {
                this.field2356 = arg0.method798(false);
            } else if (arg2 == 18) {
                int var20 = arg0.method837(true);
                this.field2358 = new int[var20];
                this.field2360 = new int[var20];
                this.field2349 = new String[var20];
                this.field2361 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field2360[var21] = arg0.method815(true);
                    this.field2361[var21] = arg0.method815(true);
                    this.field2358[var21] = arg0.method815(true);
                    this.field2349[var21] = arg0.method843(-82);
                }
            } else if (arg2 == 19) {
                int var12 = arg0.method837(true);
                this.field2352 = new int[var12];
                this.field2355 = new int[var12];
                this.field2350 = new int[var12];
                this.field2342 = new String[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field2350[var13] = arg0.method815(true);
                    this.field2352[var13] = arg0.method815(true);
                    this.field2355[var13] = arg0.method815(true);
                    this.field2342[var13] = arg0.method843(-100);
                }
            } else if (arg2 == 249) {
                int var14 = arg0.method837(true);
                if (this.field2343 == null) {
                    int var15 = class258.method1787(-115, var14);
                    this.field2343 = new class191(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method837(true) == 1;
                    int var18 = arg0.method839((byte) -92);
                    class425 var19;
                    if (var17) {
                        var19 = new class309(arg0.method843(-117));
                    } else {
                        var19 = new class24(arg0.method815(true));
                    }
                    this.field2343.method1376(var19, (long) var18, 70);
                }
            }
        }
        field2351++;
        if (arg1 != -68) {
            this.field2353 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Llf;I)V", line = 248)
    public final void method1193(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                if (arg1 > -38) {
                    return;
                }
                field2344++;
                return;
            }
            this.method1192(arg0, (byte) -68, var3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 285)
    public final void method1194(int arg0) {
        field2347++;
        if (this.field2362 == null) {
            this.field2362 = this.field2346;
        }
        if (arg0 >= -119) {
            this.method1193((class130) null, 100);
        }
    }
}
