import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class291 extends class21 {

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    private int field4466 = 585;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "[S")
    public static short[] field4465 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "[J")
    public static long[] field4471 = new long[100];

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Lbm;")
    public static class307 field4468;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Z")
    public static boolean field4472;

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 4)
    public class291() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V", line = 11)
    public static final void method1955(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field4463++;
        if (!class165.method1056(arg0, (byte) 24)) {
            return;
        }
        class68[] var2 = class138.field2300[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class68 var4 = var2[var3];
            if (var4 != null) {
                var4.field1338 = 1;
                var4.field1433 = 0;
                var4.field1437 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 47)
    public static final void method1956(int arg0) {
        field4470++;
        class190.field3082.method77(0);
        int var1 = class190.field3082.method81(arg0 + 30723, 8);
        if (class285.field4417 > var1) {
            for (int var2 = var1; var2 < class285.field4417; var2++) {
                class109.field1870[class150.field2457++] = class131.field2226[var2];
            }
        }
        if (var1 > class285.field4417) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != -30716) {
            field4465 = (short[]) null;
        }
        class285.field4417 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class131.field2226[var3];
            class255 var5 = class8.field179[var4];
            int var6 = class190.field3082.method81(7, 1);
            if (var6 == 0) {
                class131.field2226[class285.field4417++] = var4;
                var5.field1855 = class25.field494;
            } else {
                int var7 = class190.field3082.method81(7, 2);
                if (var7 == 0) {
                    class131.field2226[class285.field4417++] = var4;
                    var5.field1855 = class25.field494;
                    class130.field2206[class248.field3865++] = var4;
                } else if (var7 == 1) {
                    class131.field2226[class285.field4417++] = var4;
                    var5.field1855 = class25.field494;
                    int var8 = class190.field3082.method81(arg0 ^ 0xFFFF8803, 3);
                    var5.method705((byte) 97, 1, var8);
                    int var9 = class190.field3082.method81(7, 1);
                    if (var9 == 1) {
                        class130.field2206[class248.field3865++] = var4;
                    }
                } else if (var7 == 2) {
                    class131.field2226[class285.field4417++] = var4;
                    var5.field1855 = class25.field494;
                    if (class190.field3082.method81(7, 1) == 1) {
                        int var11 = class190.field3082.method81(7, 3);
                        var5.method705((byte) 35, 2, var11);
                        int var12 = class190.field3082.method81(arg0 + 30723, 3);
                        var5.method705((byte) 103, 2, var12);
                    } else {
                        int var10 = class190.field3082.method81(7, 3);
                        var5.method705((byte) 31, 0, var10);
                    }
                    int var13 = class190.field3082.method81(7, 1);
                    if (var13 == 1) {
                        class130.field2206[class248.field3865++] = var4;
                    }
                } else if (var7 == 3) {
                    class109.field1870[class150.field2457++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILaa;Laa;)V", line = 161)
    public static final void method1957(int arg0, class35 arg1, class35 arg2) {
        field4462++;
        if (arg2.field703 != null) {
            arg2.method278((byte) -105);
        }
        arg2.field703 = arg1.field703;
        if (arg0 != 1537) {
            field4472 = false;
        }
        arg2.field701 = arg1;
        arg2.field703.field701 = arg2;
        arg2.field701.field703 = arg2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lag;I)V", line = 180)
    public static final void method1958(class202 arg0, int arg1) {
        field4464++;
        if (arg1 != -3291) {
            field4468 = (class307) null;
        }
        while (true) {
            while (arg0.field3249 < arg0.field3273.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1317((byte) -116) == 1) {
                    var3 = arg0.method1317((byte) -99);
                    var4 = arg0.method1317((byte) -85);
                    var2 = true;
                }
                int var5 = arg0.method1317((byte) -101);
                int var6 = arg0.method1317((byte) -95);
                int var7 = var5 * 64 - class38.field734;
                int var8 = class17.field322 + class9.field199 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class163.field2629 > var7 + 63 && var8 < class9.field199) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1333(arg1 + 3164);
                                if (var13 != 0) {
                                    if (class313.field4764[var9][var10] == null) {
                                        class313.field4764[var9][var10] = new byte[4096];
                                    }
                                    class313.field4764[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1333(-127);
                                    if (class169.field2704[var9][var10] == null) {
                                        class169.field2704[var9][var10] = new byte[4096];
                                    }
                                    class169.field2704[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1333(-126);
                        if (var16 != 0) {
                            arg0.field3249++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZILib;)V", line = 282)
    public static final void method1959(boolean arg0, int arg1, class312 arg2) {
        field4461++;
        if (class249.field3893 || arg0) {
            int var3 = class134.field2257;
            int var4 = var3 * 956 / 503;
            class285.field4416.method905((class88.field1658 - var4) / 2, 0, var4, var3);
            class31.field582.method717(class88.field1658 / 2 - (class31.field582.field1968 / 2), 18);
        }
        arg2.method2105(class135.field2270, class88.field1658 / 2, class134.field2257 / 2 - 26, 16777215, -1);
        int var5 = class134.field2257 / 2 - 18;
        if (class249.field3893) {
            class115.method756(class88.field1658 / 2 - 152, var5, 304, 34, 9179409);
            class115.method756(class88.field1658 / 2 - 151, var5 - -1, 302, 32, 0);
            class115.method755(class88.field1658 / 2 - 150, var5 + 2, class282.field4341 * 3, 30, 9179409);
            class115.method755(class88.field1658 / 2 + class282.field4341 * 3 - 150, var5 + 2, 300 - (class282.field4341 * 3), 30, 0);
        } else {
            class270.method1802(class88.field1658 / 2 - 152, var5, 304, 34, 9179409);
            class270.method1802(class88.field1658 / 2 - 151, var5 + 1, 302, 32, 0);
            class270.method1811(class88.field1658 / 2 - 150, var5 - -2, class282.field4341 * 3, 30, 9179409);
            class270.method1811(class282.field4341 * 3 + class88.field1658 / 2 - 150, var5 + 2, 300 - (class282.field4341 * 3), 30, 0);
        }
        arg2.method2105(class276.field4226, class88.field1658 / arg1, class134.field2257 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)V", line = 326)
    public static void method1960(byte arg0) {
        field4465 = null;
        field4471 = null;
        field4468 = null;
        if (arg0 != 11) {
            method1959(false, -53, (class312) null);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILag;)V", line = 348)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field4466 = arg2.method1315(14289);
        }
        if (arg0 != -318) {
            method1959(false, 51, (class312) null);
        }
        field4469++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I", line = 374)
    public final int[] method177(int arg0, int arg1) {
        int var3 = 32 % ((33 - arg0) / 36);
        field4467++;
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int var5 = class330.field5058[arg1];
            for (int var6 = 0; var6 < class294.field4489; var6++) {
                int var7 = class51.field1027[var6];
                if (var7 > this.field4466 && var7 < (4096 - this.field4466) && 2048 - this.field4466 < var5 && this.field4466 + 2048 > var5) {
                    int var8 = 2048 - var7;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field4466);
                    var4[var6] = 4096 - var11;
                } else if (var7 > (2048 - this.field4466) && var7 < this.field4466 + 2048) {
                    int var12 = var5 - 2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field4466;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (2048 - this.field4466);
                } else if (var5 < this.field4466 || var5 > (4096 - this.field4466)) {
                    int var20 = var7 - 2048;
                    int var21 = var20 >= 0 ? var20 : -var20;
                    int var22 = var21 - this.field4466;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (2048 - this.field4466);
                } else if (this.field4466 <= var7 && (4096 - this.field4466) >= var7) {
                    var4[var6] = 0;
                } else {
                    int var16 = 2048 - var5;
                    int var17 = var16 >= 0 ? var16 : -var16;
                    int var18 = var17 << 12;
                    int var19 = var18 / (2048 - this.field4466);
                    var4[var6] = 4096 - var19;
                }
            }
        }
        return var4;
    }
}
