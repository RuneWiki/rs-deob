import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class9 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    private int field80 = -1;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field83 = 0;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lfr;")
    private class497 field89 = new class497();

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Z")
    public boolean field91 = false;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[[I")
    private int[][] field73;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[Lhu;")
    private class404[] field78;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[S")
    public static short[] field79;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[[F")
    public static float[][] field90;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Z")
    public static final boolean method36(int arg0, int arg1) {
        if (arg0 != -2) {
            method36(82, 115);
        }
        field77++;
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILdr;I)V")
    public static final void method37(int arg0, class293 arg1, int arg2) {
        field85++;
        boolean var3 = arg1.method1823(1, 13255) == 1;
        if (var3) {
            class488.field7283[class491.field7321++] = arg2;
        }
        int var4 = arg1.method1823(2, 13255);
        class480 var5 = class83.field1327[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7060 = false;
            } else if (class449.field6615 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class525 var6 = class490.field7297[arg2] = new class525();
                var6.field7770 = (var5.field6068[0] + class241.field3358 >> 6) + ((var5.field7686 << 28) + (var5.field6065[0] + class267.field3979 >> 6 << 14));
                if (var5.field7093 == -1) {
                    var6.field7765 = var5.field5994.method1496((byte) 126);
                } else {
                    var6.field7765 = var5.field7093;
                }
                var6.field7769 = var5.field5991;
                var6.field7764 = var5.field7089;
                if (var5.field7071 > 0) {
                    class116.method878(var5, -1);
                }
                class83.field1327[arg2] = null;
                if (arg1.method1823(1, 13255) != 0) {
                    class151.method1089(arg1, -7687, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method1823(3, 13255);
            int var8 = var5.field6065[0];
            int var9 = var5.field6068[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field7085 = var9;
                var5.field7095 = var8;
                var5.field7060 = true;
            } else {
                var5.method2868(var8, class364.field5564[arg2], -76, var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method1823(4, 13255);
            int var11 = var5.field6065[0];
            int var12 = var5.field6068[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field7060 = true;
                var5.field7085 = var12;
                var5.field7095 = var11;
            } else {
                var5.method2868(var11, class364.field5564[arg2], -102, var12);
            }
        } else {
            int var13 = arg1.method1823(1, 13255);
            if (arg0 == var13) {
                int var14 = arg1.method1823(12, arg0 ^ 0x33C7);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3ED) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6065[0] + var16;
                int var19 = var5.field6068[0] + var17;
                if (var3) {
                    var5.field7085 = var19;
                    var5.field7095 = var18;
                    var5.field7060 = true;
                } else {
                    var5.method2868(var18, class364.field5564[arg2], -108, var19);
                }
                var5.field7686 = (byte) (var5.field7686 + var15 & 0x3);
                if (class449.field6615 == arg2) {
                    class521.field7651 = var5.field7686;
                }
            } else {
                int var20 = arg1.method1823(30, arg0 + 13255);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFC6BE) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field6065[0] + class267.field3979 + var22 & 0x3FFF) - class267.field3979;
                int var25 = (var5.field6068[0] + class241.field3358 + var23 & 0x3FFF) - class241.field3358;
                if (var3) {
                    var5.field7095 = var24;
                    var5.field7085 = var25;
                    var5.field7060 = true;
                } else {
                    var5.method2868(var24, class364.field5564[arg2], -96, var25);
                }
                var5.field7686 = (byte) (var5.field7686 + var21 & 0x3);
                if (class449.field6615 == arg2) {
                    class521.field7651 = var5.field7686;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method38(int arg0) {
        field74++;
        for (int var2 = arg0; var2 < this.field84; var2++) {
            this.field73[var2] = null;
        }
        this.field78 = null;
        this.field73 = null;
        this.field89.method2955(2131289328);
        this.field89 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
    public static final boolean method39(byte arg0) {
        field81++;
        if (arg0 < 60) {
            field87 = -1;
        }
        return class496.field7361;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method40(int arg0) {
        if (arg0 != 2) {
            field87 = -58;
        }
        field90 = null;
        field79 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[I")
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != 1) {
            field75 = -84;
        }
        field86++;
        if (this.field84 == this.field82) {
            this.field91 = this.field78[arg0] == null;
            this.field78[arg0] = class434.field6415;
            return this.field73[arg0];
        } else if (this.field84 == 1) {
            this.field91 = this.field80 != arg0;
            this.field80 = arg0;
            return this.field73[0];
        } else {
            class404 var3 = this.field78[arg0];
            if (var3 == null) {
                this.field91 = true;
                if (this.field84 > this.field83) {
                    var3 = new class404(arg0, this.field83);
                    this.field83++;
                } else {
                    class404 var4 = (class404) this.field89.method2949(123);
                    var3 = new class404(arg0, var4.field6089);
                    this.field78[var4.field6092] = null;
                    var4.method876((byte) -96);
                }
                this.field78[arg0] = var3;
            } else {
                this.field91 = false;
            }
            this.field89.method2953(var3, (byte) 43);
            return this.field73[var3.field6089];
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)[[I")
    public final int[][] method42(int arg0) {
        field76++;
        if (this.field84 != this.field82) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field84; var2++) {
            this.field78[var2] = class434.field6415;
        }
        return this.field73;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
    public class9(int arg0, int arg1, int arg2) {
        this.field82 = arg1;
        this.field84 = arg0;
        this.field73 = new int[this.field84][arg2];
        this.field78 = new class404[this.field82];
    }

    static {
        new class347("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field87 = -1;
        field88 = 0;
        field79 = new short[] { 19, 48, 18, 13, 6, 5, 59, 20 };
        field90 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
    }
}
