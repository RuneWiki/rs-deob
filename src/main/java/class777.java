import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class777 {

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public int field10724 = -1;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field10734;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Ldj;")
    private class362 field10719;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "Ljia;")
    public static class645 field10738;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Ljava/lang/String;")
    private String field10720;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Ljava/lang/String;")
    private String field10730;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[I")
    private int[] field10725;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
    private int[] field10727;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "[I")
    private int[] field10728;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "[I")
    private int[] field10731;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "[I")
    private int[] field10733;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
    private int[] field10735;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "[I")
    private int[] field10737;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "[I")
    private int[] field10739;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field10726;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field10732;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[[I")
    private int[][] field10721;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[[I")
    private int[][] field10722;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "[[I")
    private int[][] field10723;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Les;I)V", line = 5)
    public final void method4313(class403 arg0, int arg1) {
        field10736++;
        if (arg1 != 13) {
            this.method4316(-12, 111, null);
        }
        while (true) {
            int var3 = arg0.method2396((byte) -105);
            if (var3 == 0) {
                return;
            }
            this.method4316(var3, 3, arg0);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V", line = 38)
    public static void method4314(boolean arg0) {
        field10738 = null;
        if (!arg0) {
            method4314(false);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V", line = 68)
    public final void method4315(boolean arg0) {
        if (this.field10720 == null) {
            this.field10720 = this.field10730;
        }
        if (arg0) {
            this.field10723 = null;
        }
        field10734++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILes;)V", line = 82)
    private final void method4316(int arg0, int arg1, class403 arg2) {
        if (arg0 == 1) {
            this.field10730 = arg2.method2375((byte) 55);
        } else if (arg0 == 2) {
            this.field10720 = arg2.method2375((byte) 8);
        } else if (arg0 == 3) {
            int var22 = arg2.method2396((byte) 66);
            this.field10722 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field10722[var23][0] = arg2.method2390((byte) 2);
                this.field10722[var23][1] = arg2.method2381((byte) 103);
                this.field10722[var23][2] = arg2.method2381((byte) 109);
            }
        } else if (arg0 == 4) {
            int var20 = arg2.method2396((byte) -109);
            this.field10721 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field10721[var21][0] = arg2.method2390((byte) -105);
                this.field10721[var21][1] = arg2.method2381((byte) 82);
                this.field10721[var21][2] = arg2.method2381((byte) 102);
            }
        } else if (arg0 == 5) {
            arg2.method2390((byte) 53);
        } else if (arg0 == 6) {
            arg2.method2396((byte) 47);
        } else if (arg0 == 7) {
            arg2.method2396((byte) -98);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method2396((byte) -117);
            } else if (arg0 == 10) {
                int var18 = arg2.method2396((byte) -79);
                this.field10728 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field10728[var19] = arg2.method2381((byte) 35);
                }
            } else if (arg0 == 12) {
                arg2.method2381((byte) 46);
            } else if (arg0 == 13) {
                int var4 = arg2.method2396((byte) 27);
                this.field10731 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field10731[var5] = arg2.method2390((byte) -116);
                }
            } else if (arg0 == 14) {
                int var6 = arg2.method2396((byte) -96);
                this.field10723 = new int[var6][2];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field10723[var7][0] = arg2.method2396((byte) 39);
                    this.field10723[var7][1] = arg2.method2396((byte) 119);
                }
            } else if (arg0 == 15) {
                arg2.method2390((byte) -124);
            } else if (arg0 == 17) {
                this.field10724 = arg2.method2390((byte) 33);
            } else if (arg0 == 18) {
                int var16 = arg2.method2396((byte) 33);
                this.field10735 = new int[var16];
                this.field10727 = new int[var16];
                this.field10739 = new int[var16];
                this.field10732 = new String[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field10727[var17] = arg2.method2381((byte) 106);
                    this.field10735[var17] = arg2.method2381((byte) 38);
                    this.field10739[var17] = arg2.method2381((byte) 89);
                    this.field10732[var17] = arg2.method2384(arg1 - 6438);
                }
            } else if (arg0 == 19) {
                int var8 = arg2.method2396((byte) 56);
                this.field10737 = new int[var8];
                this.field10725 = new int[var8];
                this.field10733 = new int[var8];
                this.field10726 = new String[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field10737[var9] = arg2.method2381((byte) 28);
                    this.field10733[var9] = arg2.method2381((byte) 82);
                    this.field10725[var9] = arg2.method2381((byte) 79);
                    this.field10726[var9] = arg2.method2384(-6435);
                }
            } else if (arg0 == 249) {
                int var10 = arg2.method2396((byte) -126);
                if (this.field10719 == null) {
                    int var11 = class783.method4337(var10, (byte) 106);
                    this.field10719 = new class362(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg2.method2396((byte) 92) == 1;
                    int var14 = arg2.method2358(122);
                    class379 var15;
                    if (var13) {
                        var15 = new class562(arg2.method2384(arg1 ^ 0xFFFFE6DE));
                    } else {
                        var15 = new class365(arg2.method2381((byte) 121));
                    }
                    this.field10719.method2112(var15, (byte) 6, (long) var14);
                }
            }
        }
        field10729++;
        if (arg1 != 3) {
            this.method4315(false);
        }
    }
}
