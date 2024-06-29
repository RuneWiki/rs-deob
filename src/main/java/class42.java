import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class42 extends class53 {

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public int field690 = 4;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public int field685 = 4;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public int field689 = 1638;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "I")
    public int field696 = 0;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public int field692 = 4;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "[B")
    private byte[] field695 = new byte[512];

    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "Z")
    public boolean field700 = true;

    @OriginalMember(owner = "client!fm", name = "db", descriptor = "B")
    public static byte field697;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fm", name = "fb", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!fm", name = "hb", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fm", name = "ib", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!fm", name = "eb", descriptor = "Lcb;")
    public static class267 field698;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "[S")
    private short[] field691;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "[S")
    private short[] field694;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "[[B")
    public static byte[][] field687;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZ)V", line = 10)
    public static final void method282(byte arg0, boolean arg1) {
        field702++;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class226.field3814;
        } else {
            var2 = 4;
            var3 = class267.field4595;
        }
        if (arg0 > -23) {
            method286(-109);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class54.method393((byte) 43);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class259.field4338[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x33A3FA4) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class288.field4952.length; var14++) {
                                if (class288.field4952[var14] == var13 && var3[var14] != null) {
                                    class310.method2110(var3[var14], var6 * 8, var9, var10, arg1, (var12 & 0x7) * 8, var4, class286.field4931, (byte) -97, var5 * 8, (var11 & 0x7) * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class273.method1951(var5 * 8, 8, var4, 8, var6 * 8, 101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIBIII)I", line = 110)
    private final int method283(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field699++;
        int var8 = arg0 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        int var11 = arg6 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = var11 - 4096;
        if (var10 >= arg1) {
            var10 = 0;
        }
        int var14 = var10 & 0xFF;
        if (arg3 < 93) {
            return -125;
        }
        int var15 = this.field695[arg4 + var12] & 0x3;
        int var16;
        if (var15 > 1) {
            var16 = var15 == 2 ? var11 - arg0 : -arg0 + -var11;
        } else {
            var16 = var15 == 0 ? var11 + arg0 : -var11 + arg0;
        }
        int var17 = this.field695[arg4 + var14] & 0x3;
        int var18;
        if (var17 <= 1) {
            var18 = var17 == 0 ? arg0 + var13 : -var13 + arg0;
        } else {
            var18 = var17 == 2 ? var13 - arg0 : -arg0 + -var13;
        }
        int var19 = this.field695[arg2 + var12] & 0x3;
        int var20 = class291.field4986[var11];
        int var21 = ((var18 - var16) * var20 >> 12) + var16;
        int var22;
        if (var19 > 1) {
            var22 = var19 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var22 = var19 == 0 ? var8 + var11 : var8 - var11;
        }
        int var23 = this.field695[arg2 + var14] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var13 : -var13 + var8;
        } else {
            var24 = var23 == 2 ? var13 - var8 : -var8 + -var13;
        }
        int var25 = var22 + ((var24 - var22) * var20 >> 12);
        return var21 + ((var25 - var21) * arg5 >> 12);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[I", line = 187)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            return (int[]) null;
        }
        field693++;
        int[] var3 = this.field878.method1603(arg1, (byte) 120);
        if (this.field878.field3749) {
            this.method287(arg1, var3, (byte) -82);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILja;Z)V", line = 211)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field686++;
        if (arg0 == 0) {
            this.field700 = arg1.method501(0) == 1;
        } else if (arg0 == 1) {
            this.field685 = arg1.method501(0);
        } else if (arg0 == 2) {
            this.field689 = arg1.method487((byte) -108);
            if (this.field689 < 0) {
                this.field691 = new short[this.field685];
                for (int var5 = 0; var5 < this.field685; var5++) {
                    this.field691[var5] = (short) arg1.method487((byte) -122);
                }
            }
        } else if (arg0 == 3) {
            this.field690 = this.field692 = arg1.method501(0);
        } else if (arg0 == 4) {
            this.field696 = arg1.method501(0);
        } else if (arg0 == 5) {
            this.field690 = arg1.method501(0);
        } else if (arg0 == 6) {
            this.field692 = arg1.method501(0);
        }
        if (!arg2) {
            field697 = 35;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 307)
    public static void method284(boolean arg0) {
        field687 = (byte[][]) null;
        if (!arg0) {
            field698 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 318)
    public class42() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)V", line = 328)
    private final void method285(boolean arg0) {
        if (arg0) {
            method284(true);
        }
        field688++;
        if (this.field689 > 0) {
            this.field691 = new short[this.field685];
            this.field694 = new short[this.field685];
            for (int var3 = 0; var3 < this.field685; var3++) {
                this.field691[var3] = (short) ((int) (Math.pow((double) ((float) this.field689 / 4096.0F), (double) var3) * 4096.0D));
                this.field694[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field691 != null && this.field691.length == this.field685) {
            this.field694 = new short[this.field685];
            for (int var2 = 0; var2 < this.field685; var2++) {
                this.field694[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 371)
    public final void method56(byte arg0) {
        this.field695 = class152.method1162(this.field696, 0);
        this.method285(false);
        field684++;
        if (arg0 != -79) {
            method286(-114);
        }
        for (int var2 = this.field685 - 1; var2 >= 1; var2--) {
            short var3 = this.field691[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field685--;
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Z", line = 401)
    public static final boolean method286(int arg0) {
        field682++;
        try {
            if (arg0 != -1710) {
                return false;
            }
            if (class139.field2413 == 2) {
                if (class116.field1966 == null) {
                    class116.field1966 = class184.method1391(class127.field2212, class76.field1318, class5.field57);
                    if (class116.field1966 == null) {
                        return false;
                    }
                }
                if (class136.field2326 == null) {
                    class136.field2326 = new class55(class156.field2668, class207.field3493);
                }
                if (class279.field4841.method992(class116.field1966, 22050, class236.field3985, false, class136.field2326)) {
                    class279.field4841.method980((byte) -34);
                    class279.field4841.method993(class147.field2556, (byte) 125);
                    class279.field4841.method978(class116.field1966, class235.field3968, -128);
                    class139.field2413 = 0;
                    class116.field1966 = null;
                    class127.field2212 = null;
                    class136.field2326 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class279.field4841.method964((byte) 106);
            class127.field2212 = null;
            class136.field2326 = null;
            class139.field2413 = 0;
            class116.field1966 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[IB)V", line = 464)
    public final void method287(int arg0, int[] arg1, byte arg2) {
        field681++;
        int var4 = class50.field814[arg0] * this.field692;
        if (arg2 > -10) {
            this.method59(-92, 16);
        }
        if (this.field685 == 1) {
            int var38 = this.field694[0] << 12;
            int var39 = var4 * var38 >> 12;
            short var40 = this.field691[0];
            int var41 = var39 >> 12;
            int var42 = this.field695[var41 & 0xFF] & 0xFF;
            int var43 = this.field692 * var38 >> 12;
            int var44 = var41 + 1;
            if (var44 >= var43) {
                var44 = 0;
            }
            int var45 = this.field690 * var38 >> 12;
            int var46 = this.field695[var44 & 0xFF] & 0xFF;
            int var47 = var39 & 0xFFF;
            int var48 = class291.field4986[var47];
            if (this.field700) {
                for (int var52 = 0; var52 < class269.field4644; var52++) {
                    int var53 = class67.field1178[var52] * this.field690;
                    int var54 = this.method283(var47, var45, var46, (byte) 94, var42, var48, var38 * var53 >> 12);
                    int var55 = var40 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class269.field4644; var49++) {
                    int var50 = class67.field1178[var49] * this.field690;
                    int var51 = this.method283(var47, var45, var46, (byte) 119, var42, var48, var38 * var50 >> 12);
                    arg1[var49] = var40 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field691[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field694[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field690 * var6 >> 12;
            int var9 = this.field692 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            int var12 = var7 & 0xFFF;
            if (var11 >= var9) {
                var11 = 0;
            }
            int var13 = this.field695[var10 & 0xFF] & 0xFF;
            int var14 = class291.field4986[var12];
            int var15 = this.field695[var11 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class269.field4644; var16++) {
                int var17 = class67.field1178[var16] * this.field690;
                int var18 = this.method283(var12, var8, var15, (byte) 98, var13, var14, var6 * var17 >> 12);
                arg1[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field685; var19++) {
            short var20 = this.field691[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field694[var19] << 12;
                int var22 = this.field692 * var21 >> 12;
                int var23 = var4 * var21 >> 12;
                int var24 = var23 >> 12;
                int var25 = this.field690 * var21 >> 12;
                int var26 = var24 + 1;
                int var27 = this.field695[var24 & 0xFF] & 0xFF;
                int var28 = var23 & 0xFFF;
                if (var22 <= var26) {
                    var26 = 0;
                }
                int var29 = this.field695[var26 & 0xFF] & 0xFF;
                int var30 = class291.field4986[var28];
                if (this.field700 && (this.field685 - 1) == var19) {
                    for (int var31 = 0; var31 < class269.field4644; var31++) {
                        int var32 = class67.field1178[var31] * this.field690;
                        int var33 = this.method283(var28, var25, var29, (byte) 97, var27, var30, var21 * var32 >> 12);
                        int var34 = (var20 * var33 >> 12) + arg1[var31];
                        arg1[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class269.field4644; var35++) {
                        int var36 = class67.field1178[var35] * this.field690;
                        int var37 = this.method283(var28, var25, var29, (byte) 108, var27, var30, var21 * var36 >> 12);
                        arg1[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }
}
