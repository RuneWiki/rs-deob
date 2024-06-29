import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class467 {

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public int field6542 = -1;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field6547 = -1;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "Lmu;")
    public static class303 field6557 = new class303(116, 6);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Leq;")
    private class213 field6548;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Ljava/lang/String;")
    private String field6552;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "Ljava/lang/String;")
    private String field6554;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
    private int[] field6540;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
    private int[] field6543;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
    private int[] field6545;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "[I")
    private int[] field6546;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "[I")
    private int[] field6549;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "[I")
    private int[] field6550;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "[I")
    private int[] field6551;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "[I")
    private int[] field6556;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field6553;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field6558;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "[[I")
    private int[][] field6538;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "[[I")
    private int[][] field6539;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "[[I")
    private int[][] field6544;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public final void method2745(byte arg0) {
        if (arg0 <= 117) {
            this.method2747(null, -119, (byte) 18);
        }
        field6541++;
        if (this.field6552 == null) {
            this.field6552 = this.field6554;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
    public static void method2746(byte arg0) {
        if (arg0 > -74) {
            method2746((byte) 75);
        }
        field6557 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lcea;IB)V")
    private final void method2747(class215 arg0, int arg1, byte arg2) {
        if (arg2 != 52) {
            this.field6556 = null;
        }
        field6555++;
        if (arg1 == 1) {
            this.field6554 = arg0.method1519(-13487);
        } else if (arg1 == 2) {
            this.field6552 = arg0.method1519(arg2 ^ 0xFFFFCB65);
        } else if (arg1 == 3) {
            int var4 = arg0.method1535(arg2 ^ 0xCB);
            this.field6539 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6539[var5][0] = arg0.method1478(842397944);
                this.field6539[var5][1] = arg0.method1533((byte) -126);
                this.field6539[var5][2] = arg0.method1533((byte) -126);
            }
        } else if (arg1 == 4) {
            int var22 = arg0.method1535(255);
            this.field6538 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6538[var23][0] = arg0.method1478(842397944);
                this.field6538[var23][1] = arg0.method1533((byte) -126);
                this.field6538[var23][2] = arg0.method1533((byte) -126);
            }
        } else if (arg1 == 5) {
            arg0.method1478(842397944);
        } else if (arg1 == 6) {
            arg0.method1535(255);
            return;
        } else if (arg1 == 7) {
            arg0.method1535(255);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method1535(255);
                return;
            }
            if (arg1 == 10) {
                int var6 = arg0.method1535(arg2 + 203);
                this.field6550 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6550[var7] = arg0.method1533((byte) -126);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method1533((byte) -126);
                return;
            }
            if (arg1 != 13) {
                if (arg1 == 14) {
                    int var18 = arg0.method1535(arg2 ^ 0xCB);
                    this.field6544 = new int[var18][2];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field6544[var19][0] = arg0.method1535(255);
                        this.field6544[var19][1] = arg0.method1535(class710.method3948(arg2, 203));
                    }
                } else if (arg1 == 15) {
                    arg0.method1478(842397944);
                    return;
                } else if (arg1 == 17) {
                    this.field6542 = arg0.method1478(842397944);
                    return;
                } else if (arg1 == 18) {
                    int var8 = arg0.method1535(255);
                    this.field6556 = new int[var8];
                    this.field6553 = new String[var8];
                    this.field6549 = new int[var8];
                    this.field6543 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field6556[var9] = arg0.method1533((byte) -126);
                        this.field6543[var9] = arg0.method1533((byte) -126);
                        this.field6549[var9] = arg0.method1533((byte) -126);
                        this.field6553[var9] = arg0.method1525((byte) 123);
                    }
                    return;
                } else if (arg1 == 19) {
                    int var10 = arg0.method1535(255);
                    this.field6558 = new String[var10];
                    this.field6545 = new int[var10];
                    this.field6551 = new int[var10];
                    this.field6540 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field6551[var11] = arg0.method1533((byte) -126);
                        this.field6540[var11] = arg0.method1533((byte) -126);
                        this.field6545[var11] = arg0.method1533((byte) -126);
                        this.field6558[var11] = arg0.method1525((byte) -25);
                    }
                    return;
                } else if (arg1 == 249) {
                    int var12 = arg0.method1535(255);
                    if (this.field6548 == null) {
                        int var13 = class529.method3059(var12, (byte) 108);
                        this.field6548 = new class213(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg0.method1535(255) == 1;
                        int var16 = arg0.method1499(-1);
                        class362 var17;
                        if (var15) {
                            var17 = new class568(arg0.method1525((byte) -98));
                        } else {
                            var17 = new class113(arg0.method1533((byte) -126));
                        }
                        this.field6548.method1468((byte) 123, (long) var16, var17);
                    }
                    return;
                }
                return;
            }
            int var20 = arg0.method1535(255);
            this.field6546 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field6546[var21] = arg0.method1478(842397944);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILcea;)V")
    public final void method2748(int arg0, class215 arg1) {
        int var3 = -14 / ((arg0 + 56) / 61);
        field6537++;
        while (true) {
            int var4 = arg1.method1535(255);
            if (var4 == 0) {
                return;
            }
            this.method2747(arg1, var4, (byte) 52);
        }
    }
}
