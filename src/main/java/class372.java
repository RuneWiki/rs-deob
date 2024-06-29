import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class372 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[Lsq;")
    private class117[] field5570;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field5574;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lao;")
    public static class188 field5571 = new class188(76, -2);

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field5578 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lao;")
    public static class188 field5576 = new class188(96, 8);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "F")
    public static float field5579 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "J")
    private long field5577;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lsq;")
    private class117 field5568;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)Lsq;", line = 3)
    public final class117 method2377(long arg0, int arg1) {
        this.field5577 = arg0;
        field5567++;
        class117 var4 = this.field5570[(int) (arg0 & (long) (this.field5574 + arg1))];
        for (this.field5568 = var4.field1845; this.field5568 != var4; this.field5568 = this.field5568.field1845) {
            if (this.field5568.field1844 == arg0) {
                class117 var5 = this.field5568;
                this.field5568 = this.field5568.field1845;
                return var5;
            }
        }
        this.field5568 = null;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 30)
    public static final void method2378() {
        class18.field287 = 0;
        label212: for (int var0 = 0; var0 < class396.field5825; var0++) {
            class322 var1 = class207.field2982[var0];
            if (class460.field6797 != null) {
                for (int var2 = 0; var2 < class460.field6797.length; var2++) {
                    if (class460.field6797[var2] != -1000000 && (var1.field4950 <= class460.field6797[var2] || var1.field4944 <= class460.field6797[var2]) && (var1.field4939 <= class6.field96[var2] || var1.field4949 <= class6.field96[var2]) && (var1.field4939 >= class470.field6918[var2] || var1.field4949 >= class470.field6918[var2]) && (var1.field4946 <= class68.field1182[var2] || var1.field4937 <= class68.field1182[var2]) && (var1.field4946 >= class366.field5498[var2] || var1.field4937 >= class366.field5498[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field4936 == 1) {
                int var3 = var1.field4935 + class117.field1846 - class97.field1574;
                if (var3 >= 0 && var3 <= class117.field1846 + class117.field1846) {
                    int var4 = var1.field4940 + class117.field1846 - class105.field1653;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class117.field1846 + class117.field1846) {
                        continue;
                    }
                    int var5 = var1.field4931 + class117.field1846 - class105.field1653;
                    if (var5 > class117.field1846 + class117.field1846) {
                        var5 = class117.field1846 + class117.field1846;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class298.field4257[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class466.field6858 - var1.field4939;
                        if (var7 > class505.field7406) {
                            var1.field4929 = 1;
                        } else {
                            if (var7 >= -class505.field7406) {
                                continue;
                            }
                            var1.field4929 = 2;
                            var7 = -var7;
                        }
                        var1.field4941 = (var1.field4946 - class504.field7401 << 8) / var7;
                        var1.field4938 = (var1.field4937 - class504.field7401 << 8) / var7;
                        var1.field4933 = (var1.field4950 - class467.field6863 << 8) / var7;
                        var1.field4951 = (var1.field4944 - class467.field6863 << 8) / var7;
                        class86.field1437[class18.field287++] = var1;
                    }
                }
            } else if (var1.field4936 == 2) {
                int var8 = var1.field4940 + class117.field1846 - class105.field1653;
                if (var8 >= 0 && var8 <= class117.field1846 + class117.field1846) {
                    int var9 = var1.field4935 + class117.field1846 - class97.field1574;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class117.field1846 + class117.field1846) {
                        continue;
                    }
                    int var10 = var1.field4952 + class117.field1846 - class97.field1574;
                    if (var10 > class117.field1846 + class117.field1846) {
                        var10 = class117.field1846 + class117.field1846;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class298.field4257[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class504.field7401 - var1.field4946;
                        if (var12 > class505.field7406) {
                            var1.field4929 = 3;
                        } else {
                            if (var12 >= -class505.field7406) {
                                continue;
                            }
                            var1.field4929 = 4;
                            var12 = -var12;
                        }
                        var1.field4932 = (var1.field4939 - class466.field6858 << 8) / var12;
                        var1.field4930 = (var1.field4949 - class466.field6858 << 8) / var12;
                        var1.field4933 = (var1.field4950 - class467.field6863 << 8) / var12;
                        var1.field4951 = (var1.field4944 - class467.field6863 << 8) / var12;
                        class86.field1437[class18.field287++] = var1;
                    }
                }
            } else if (var1.field4936 == 4) {
                int var13 = var1.field4950 - class467.field6863;
                if (var13 > class292.field4186) {
                    int var14 = var1.field4940 + class117.field1846 - class105.field1653;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class117.field1846 + class117.field1846) {
                        continue;
                    }
                    int var15 = var1.field4931 + class117.field1846 - class105.field1653;
                    if (var15 > class117.field1846 + class117.field1846) {
                        var15 = class117.field1846 + class117.field1846;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field4935 + class117.field1846 - class97.field1574;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class117.field1846 + class117.field1846) {
                        continue;
                    }
                    int var17 = var1.field4952 + class117.field1846 - class97.field1574;
                    if (var17 > class117.field1846 + class117.field1846) {
                        var17 = class117.field1846 + class117.field1846;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class298.field4257[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field4929 = 5;
                        var1.field4932 = (var1.field4939 - class466.field6858 << 8) / var13;
                        var1.field4930 = (var1.field4949 - class466.field6858 << 8) / var13;
                        var1.field4941 = (var1.field4946 - class504.field7401 << 8) / var13;
                        var1.field4938 = (var1.field4937 - class504.field7401 << 8) / var13;
                        class86.field1437[class18.field287++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lsq;", line = 293)
    public final class117 method2379(int arg0) {
        field5573++;
        if (this.field5568 == null) {
            return null;
        }
        if (arg0 != 2) {
            field5578 = -31;
        }
        class117 var2 = this.field5570[(int) ((long) (this.field5574 - 1) & this.field5577)];
        while (this.field5568 != var2) {
            if (this.field5568.field1844 == this.field5577) {
                class117 var3 = this.field5568;
                this.field5568 = this.field5568.field1845;
                return var3;
            }
            this.field5568 = this.field5568.field1845;
        }
        this.field5568 = null;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)Z", line = 329)
    public static final boolean method2380(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field5569++;
            return class511.method3034(32768, arg0, arg2) | (arg0 & 0x800) != 0 || class108.method805(arg0, -105, arg2);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lsq;IJ)V", line = 341)
    public final void method2381(class117 arg0, int arg1, long arg2) {
        if (arg0.field1843 != null) {
            arg0.method855(51);
        }
        field5575++;
        class117 var5 = this.field5570[(int) ((long) (this.field5574 - 1) & arg2)];
        arg0.field1845 = var5;
        arg0.field1843 = var5.field1843;
        arg0.field1843.field1845 = arg0;
        arg0.field1845.field1843 = arg0;
        arg0.field1844 = arg2;
        if (arg1 <= 80) {
            this.method2377(-84L, 21);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 363)
    public static void method2382(int arg0) {
        field5571 = null;
        if (arg0 == -23151) {
            field5576 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V", line = 381)
    public static final void method2383(int arg0, byte arg1, int arg2) {
        field5572++;
        if (arg1 != -20) {
            method2383(73, (byte) -79, 81);
        }
        class434 var3 = class483.method2888(arg0, 82, 12);
        var3.method2632((byte) 81);
        var3.field6310 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V", line = 396)
    public class372(int arg0) {
        this.field5570 = new class117[arg0];
        this.field5574 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class117 var3 = this.field5570[var2] = new class117();
            var3.field1843 = var3;
            var3.field1845 = var3;
        }
    }
}
