import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class51 extends class273 {

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    private int field716 = 1;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private int field719 = 5;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    private int field715 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "[B")
    private byte[] field725 = new byte[512];

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[S")
    private short[] field724 = new short[512];

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int field713 = 2;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    private int field722 = 2048;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    private int field727 = 5;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field728 = -2;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Lwg;")
    public static class277 field718 = new class277();

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field730 = "glow3:";

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field731 = "Loaded world list data";

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)I", line = 8)
    public static final int method345(boolean arg0, int arg1) {
        field721++;
        long var2 = class195.method1322(arg1 ^ 0x67E6);
        class36 var4 = arg0 ? (class36) class211.field3345.method1549((byte) -65) : (class36) class211.field3345.method1546(arg1 - 26513);
        if (arg1 != 26512) {
            field718 = (class277) null;
        }
        while (var4 != null) {
            if (var2 > (var4.field454 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field454 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2852;
                    class156.field2442[var5] = class61.field852[var5];
                    var4.method1284(0);
                    return var5;
                }
                var4.method1284(arg1 - 26512);
            }
            var4 = (class36) class211.field3345.method1546(-1);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 46)
    private final void method346(int arg0) {
        field723++;
        if (arg0 != -15461) {
            method348(true);
        }
        Random var2 = new Random((long) this.field715);
        this.field724 = new short[512];
        if (this.field722 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field724[var3] = (short) class7.method39((byte) 57, var2, this.field722);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 541)
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILgn;)V", line = 79)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field726++;
        if (arg1 == 0) {
            this.field719 = this.field727 = arg2.method2043((byte) -116);
        } else if (arg1 == 1) {
            this.field715 = arg2.method2043((byte) -108);
        } else if (arg1 == 2) {
            this.field722 = arg2.method1994(false);
        } else if (arg1 == 3) {
            this.field713 = arg2.method2043((byte) -124);
        } else if (arg1 == 4) {
            this.field716 = arg2.method2043((byte) -114);
        } else if (arg1 == 5) {
            this.field719 = arg2.method2043((byte) -127);
        } else if (arg1 == 6) {
            this.field727 = arg2.method2043((byte) -114);
        }
        if (arg0 < 27) {
            this.method349(-57);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILgn;IIZIZII)V", line = 159)
    public static final void method347(int arg0, int arg1, class303 arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field714++;
        if (arg3 != 1) {
            return;
        }
        byte var10 = 0;
        byte var11 = 0;
        if (arg4 == 1) {
            var11 = 1;
        } else if (arg4 == 2) {
            var10 = 1;
            var11 = 1;
        } else if (arg4 == 3) {
            var10 = 1;
        }
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var14 = arg2.method2043((byte) -110);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg2.method2043((byte) -108);
                    break;
                }
                if (var14 <= 49) {
                    arg2.method2043((byte) -121);
                }
            }
            return;
        }
        if (!arg5 && !arg7) {
            class305.field4784[arg6][arg0][arg1] = 0;
        }
        while (true) {
            int var12 = arg2.method2043((byte) -104);
            if (var12 == 0) {
                if (arg5) {
                    client.field2034[0][arg0 + var10][arg1 + var11] = class193.field2911[0][arg0 + var10][arg1 + var11];
                } else if (arg6 == 0) {
                    client.field2034[0][arg0 + var10][arg1 + var11] = -class90.method620(arg8 + 932731, 60, arg9 + 556238) * 8;
                } else {
                    client.field2034[arg6][arg0 + var10][arg1 + var11] = client.field2034[arg6 - 1][arg0 + var10][arg1 + var11] - 240;
                }
                break;
            }
            if (var12 == 1) {
                int var13 = arg2.method2043((byte) -123);
                if (arg5) {
                    client.field2034[0][arg0 + var10][arg1 + var11] = var13 * 8 + class193.field2911[0][arg0 + var10][arg1 + var11];
                } else {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 == 0) {
                        client.field2034[0][arg0 + var10][arg1 + var11] = -var13 * 8;
                    } else {
                        client.field2034[arg6][arg0 + var10][arg1 + var11] = client.field2034[arg6 - 1][arg0 + var10][arg1 + var11] - var13 * 8;
                    }
                }
                break;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg2.method2043((byte) -119);
                } else {
                    class173.field2641[arg6][arg0][arg1] = arg2.method2001(-3);
                    class246.field3861[arg6][arg0][arg1] = (byte) ((var12 - 2) / 4);
                    class58.field827[arg6][arg0][arg1] = (byte) class311.method2135(var12 + arg4 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg5 && !arg7) {
                    class305.field4784[arg6][arg0][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                class298.field4586[arg6][arg0][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V", line = 292)
    public static void method348(boolean arg0) {
        field731 = null;
        field730 = null;
        if (arg0) {
            field718 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I", line = 322)
    public final int[] method331(int arg0, int arg1) {
        int[] var3 = this.field4204.method365(arg0, 0);
        field717++;
        if (arg1 != -14650) {
            return (int[]) null;
        }
        if (this.field4204.field792) {
            int var4 = class96.field1473[arg0] * this.field727 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class27.field346; var7++) {
                class2.field9 = Integer.MAX_VALUE;
                class43.field615 = Integer.MAX_VALUE;
                class120.field1853 = Integer.MAX_VALUE;
                class314.field4952 = Integer.MAX_VALUE;
                int var8 = (class151.field2384[var7] * this.field719) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field725[(var11 >= this.field727 ? var11 - this.field727 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field725[(this.field719 <= var13 ? var13 - this.field719 : var13) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - (this.field724[var14] - var8);
                        int var16 = var4 - this.field724[var27] - (var11 << 12);
                        int var17 = this.field716;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 < 0 ? -var16 : var16;
                            int var19 = var15 >= 0 ? var15 : -var15;
                            var20 = var18 >= var19 ? var18 : var19;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var20 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var16 * var16;
                            int var25 = var15 * var15;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var16 < 0 ? -var16 : var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class314.field4952 > var20) {
                            class2.field9 = class43.field615;
                            class43.field615 = class120.field1853;
                            class120.field1853 = class314.field4952;
                            class314.field4952 = var20;
                        } else if (var20 < class120.field1853) {
                            class2.field9 = class43.field615;
                            class43.field615 = class120.field1853;
                            class120.field1853 = var20;
                        } else if (class43.field615 > var20) {
                            class2.field9 = class43.field615;
                            class43.field615 = var20;
                        } else if (class2.field9 > var20) {
                            class2.field9 = var20;
                        }
                    }
                }
                int var26 = this.field713;
                if (var26 == 0) {
                    var3[var7] = class314.field4952;
                } else if (var26 == 1) {
                    var3[var7] = class120.field1853;
                } else if (var26 == 3) {
                    var3[var7] = class43.field615;
                } else if (var26 == 4) {
                    var3[var7] = class2.field9;
                } else if (var26 == 2) {
                    var3[var7] = class120.field1853 - class314.field4952;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 530)
    public final void method349(int arg0) {
        this.field725 = class218.method1456(arg0 ^ 0xFE, this.field715);
        field720++;
        this.method346(-15461);
        if (arg0 != 1) {
            this.field719 = -85;
        }
    }
}
