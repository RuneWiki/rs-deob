import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class449 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public int field6691;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljc;")
    public static class356 field6688 = new class356(4, 3);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field6687;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field6697;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field6698;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lke;")
    public class186 field6694;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
    public int[] field6685;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
    public int[] field6686;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
    public int[] field6690;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[I")
    public int[] field6693;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
    public int[] field6695;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    public int[] field6696;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[Lke;")
    public class186[] field6689;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[[I")
    public int[][] field6699;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[[I")
    public int[][] field6700;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 4)
    public static void method2689(byte arg0) {
        field6688 = null;
        if (arg0 != -99) {
            method2691(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)Z", line = 18)
    public static final boolean method2690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class76.field1314[arg0][var8][var14] == -class290.field4726) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class276.field4534) + 1;
            int var10 = (arg3 << class276.field4534) + 2;
            int var11 = class360.field5592[arg0].method1516(arg1, arg3) + arg5;
            if (!class331.method2087(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class276.field4534) - 1;
            if (!class331.method2087(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class276.field4534) - 1;
            if (!class331.method2087(var9, var11, var13)) {
                return false;
            } else if (class331.method2087(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class136.method1027(arg0, arg1, arg3)) {
            int var6 = arg1 << class276.field4534;
            int var7 = arg3 << class276.field4534;
            return class331.method2087(var6 + 1, class360.field5592[arg0].method1516(arg1, arg3) + arg5, var7 + 1) && class331.method2087(class70.field1217 + var6 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg3) + arg5, var7 + 1) && class331.method2087(class70.field1217 + var6 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg3 + 1) + arg5, class70.field1217 + var7 - 1) && class331.method2087(var6 + 1, class360.field5592[arg0].method1516(arg1, arg3 + 1) + arg5, class70.field1217 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method2691(boolean arg0) {
        field6701++;
        if (class510.field7403.method1187((byte) 29, class511.field7485) != 2 || !arg0) {
            return;
        }
        byte var1 = (byte) (class536.field7878 - 4 & 0xFF);
        int var2 = class536.field7878 % class217.field3775;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class277.field4548; var16++) {
                class53.field858[var3][var2][var16] = var1;
            }
        }
        if (class93.field1556 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class361.field5615[var4] = -1000000;
            class213.field3390[var4] = 1000000;
            class155.field2512[var4] = 0;
            class359.field5591[var4] = 1000000;
            class460.field6821[var4] = 0;
        }
        if (class190.field2963 != 1) {
            int var15 = class81.method592(class473.field7021, class48.field764, 9251, class93.field1556);
            if (var15 - class130.field2234 >= 800 || (class192.field2982[class93.field1556][class473.field7021 >> 7][class48.field764 >> 7] & 0x4) == 0) {
                return;
            }
            class94.method658(false, class473.field7021 >> 7, -14903, class48.field764 >> 7, 1, class66.field977);
            return;
        }
        if ((class192.field2982[class93.field1556][class302.field4850.field4716 >> 7][class302.field4850.field4714 >> 7] & 0x4) != 0) {
            class94.method658(false, class302.field4850.field4716 >> 7, -14903, class302.field4850.field4714 >> 7, 0, class66.field977);
        }
        if (class227.field3927 >= 2560) {
            return;
        }
        int var5 = class473.field7021 >> 7;
        int var6 = class48.field764 >> 7;
        int var7 = class302.field4850.field4716 >> 7;
        int var8 = class302.field4850.field4714 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && var9 > (-class217.field3775) && class217.field3775 > var9 && var10 > (-class277.field4548) && class277.field4548 > var10) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class192.field2982[class93.field1556][var5][var6] & 0x4) != 0) {
                        class94.method658(false, var5, -14903, var6, 1, class66.field977);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var5 < var7) {
                            var5++;
                        } else if (var7 < var5) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class192.field2982[class93.field1556][var5][var6] & 0x4) != 0) {
                            class94.method658(false, var5, -14903, var6, 1, class66.field977);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class192.field2982[class93.field1556][var5][var6] & 0x4) != 0) {
                    class94.method658(false, var5, -14903, var6, 1, class66.field977);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class192.field2982[class93.field1556][var5][var6] & 0x4) != 0) {
                        class94.method658(false, var5, -14903, var6, 1, class66.field977);
                        return;
                    }
                }
            }
            return;
        }
        class502.method2968("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class16.field181 + "," + class455.field6794, (byte) -125, null);
        return;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BI)V", line = 285)
    private final void method2692(byte[] arg0, int arg1) {
        field6692++;
        class23 var3 = new class23(class314.method1990(arg0, 0));
        int var4 = var3.method126((byte) -89);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field6687 = var3.method143(-3230);
        } else {
            this.field6687 = 0;
        }
        int var5 = var3.method126((byte) -96);
        this.field6697 = var3.method132(67);
        int var6 = 0;
        int var7 = -1;
        this.field6696 = new int[this.field6697];
        int var8 = 0;
        if (arg1 < 92) {
            return;
        }
        while (var8 < this.field6697) {
            this.field6696[var8] = var6 += var3.method132(97);
            if (this.field6696[var8] > var7) {
                var7 = this.field6696[var8];
            }
            var8++;
        }
        this.field6698 = var7 + 1;
        this.field6693 = new int[this.field6698];
        this.field6685 = new int[this.field6698];
        this.field6686 = new int[this.field6698];
        this.field6700 = new int[this.field6698][];
        this.field6690 = new int[this.field6698];
        if (var5 != 0) {
            this.field6695 = new int[this.field6698];
            for (int var9 = 0; var9 < this.field6698; var9++) {
                this.field6695[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field6697; var10++) {
                this.field6695[this.field6696[var10]] = var3.method143(-3230);
            }
            this.field6694 = new class186(this.field6695);
        }
        for (int var11 = 0; var11 < this.field6697; var11++) {
            this.field6690[this.field6696[var11]] = var3.method143(-3230);
        }
        for (int var12 = 0; var12 < this.field6697; var12++) {
            this.field6685[this.field6696[var12]] = var3.method143(-3230);
        }
        for (int var13 = 0; var13 < this.field6697; var13++) {
            this.field6693[this.field6696[var13]] = var3.method132(24);
        }
        for (int var14 = 0; var14 < this.field6697; var14++) {
            int var21 = this.field6696[var14];
            int var22 = this.field6693[var21];
            int var23 = 0;
            int var24 = -1;
            this.field6700[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field6700[var21][var25] = var23 += var3.method132(109);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field6686[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field6700[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field6689 = new class186[var7 + 1];
        this.field6699 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field6697; var15++) {
            int var16 = this.field6696[var15];
            int var17 = this.field6693[var16];
            this.field6699[var16] = new int[this.field6686[var16]];
            for (int var18 = 0; var18 < this.field6686[var16]; var18++) {
                this.field6699[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field6700[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field6700[var16][var19];
                }
                this.field6699[var16][var20] = var3.method143(-3230);
            }
            this.field6689[var16] = new class186(this.field6699[var16]);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BI)V", line = 458)
    public class449(byte[] arg0, int arg1) {
        this.field6691 = class388.method2430(false, arg0, arg0.length);
        if (this.field6691 != arg1) {
            throw new RuntimeException();
        }
        this.method2692(arg0, 101);
    }
}
