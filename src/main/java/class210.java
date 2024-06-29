import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class210 extends class513 {

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field3141 = -1;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "Lmc;")
    public static class146 field3139;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Ljava/lang/String;")
    public String field3138;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "[C")
    public char[] field3136;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "[C")
    public char[] field3147;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
    public int[] field3135;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[I")
    public int[] field3140;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 3)
    public final void method1472(byte arg0) {
        if (arg0 != -120) {
            field3139 = null;
        }
        if (this.field3140 != null) {
            for (int var2 = 0; var2 < this.field3140.length; var2++) {
                this.field3140[var2] = class530.method3011(this.field3140[var2], 32768);
            }
        }
        field3132++;
        if (this.field3135 != null) {
            for (int var3 = 0; var3 < this.field3135.length; var3++) {
                this.field3135[var3] = class530.method3011(this.field3135[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lwaa;", line = 36)
    public static final class732 method1473(int arg0) {
        field3146++;
        if (class18.field426.length > class262.field3684) {
            return class18.field426[class262.field3684++];
        } else {
            if (arg0 > -41) {
                field3139 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(CI)I", line = 51)
    public final int method1474(char arg0, int arg1) {
        field3131++;
        if (this.field3135 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 >= -18) {
            return 90;
        }
        while (this.field3135.length > var3) {
            if (this.field3147[var3] == arg0) {
                return this.field3135[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V", line = 75)
    public static final void method1475(boolean arg0) {
        class205.field3095.method501(class524.field7126, class563.field7981, class789.field10819);
        if (arg0) {
            field3134++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V", line = 87)
    public static void method1476(int arg0) {
        field3139 = null;
        if (arg0 > -60) {
            method1475(false);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILfca;)V", line = 97)
    private final void method1477(int arg0, int arg1, class93 arg2) {
        field3144++;
        if (~arg1 == arg0) {
            this.field3138 = arg2.method752(0);
        } else if (arg1 == 2) {
            int var7 = arg2.method793((byte) 98);
            this.field3135 = new int[var7];
            this.field3147 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3135[var8] = arg2.method763(125);
                byte var9 = arg2.method766((byte) 122);
                this.field3147[var8] = var9 == 0 ? 0 : class283.method1823(-27037, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method793((byte) 89);
            this.field3140 = new int[var4];
            this.field3136 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3140[var5] = arg2.method763(class18.method125(arg0, -95));
                byte var6 = arg2.method766((byte) 122);
                this.field3136[var5] = var6 == 0 ? 0 : class283.method1823(class18.method125(arg0, 27037), var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(CI)I", line = 163)
    public final int method1478(char arg0, int arg1) {
        field3133++;
        if (this.field3140 == null) {
            return -1;
        }
        if (arg1 != -1) {
            field3139 = null;
        }
        for (int var3 = 0; var3 < this.field3140.length; var3++) {
            if (this.field3136[var3] == arg0) {
                return this.field3140[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZII)Ljq;", line = 186)
    public static final class539 method1479(boolean arg0, int arg1, int arg2) {
        if (arg1 >= -103) {
            method1482(null, null, null, (byte) 114, null);
        }
        field3142++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class539) class85.field1166.method337(var3, 1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILfca;)V", line = 199)
    public final void method1480(int arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 85);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field3147 = null;
                }
                field3143++;
                return;
            }
            this.method1477(arg0 ^ 0x1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V", line = 229)
    public static final void method1481(byte arg0) {
        field3137++;
        int[] var1 = new int[class143.field2427.field2961];
        int var2 = 0;
        for (int var3 = 0; var3 < class143.field2427.field2961; var3++) {
            class730 var5 = class143.field2427.method1410((byte) 6, var3);
            if (var5.field10008 >= 0 || var5.field10012 >= 0) {
                var1[var2++] = var3;
            }
        }
        class524.field7130 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class524.field7130[var4] = var1[var4];
        }
        if (arg0 != 73) {
            method1473(-17);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([I[I[IBLfl;)V", line = 270)
    public static final void method1482(int[] arg0, int[] arg1, int[] arg2, byte arg3, class771 arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg4.field5221.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field5221[var9] = null;
                    } else {
                        class200 var10 = class108.field1696.method1279((byte) 92, var6);
                        int var11 = var10.field3031;
                        class82 var12 = arg4.field5221[var9];
                        if (var12 != null) {
                            if (var12.field1133 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field5221[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1138 = 0;
                                    var12.field1139 = 1;
                                    var12.field1136 = var8;
                                    var12.field1134 = 0;
                                    var12.field1131 = 0;
                                    if (!arg4.field5229) {
                                        class189.method1394(arg4, 256, var10, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1138 = 0;
                                }
                            } else if (var10.field3038 >= class108.field1696.method1279((byte) 92, var12.field1133).field3038) {
                                var12 = arg4.field5221[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class82 var13 = arg4.field5221[var9] = new class82();
                            var13.field1138 = 0;
                            var13.field1131 = 0;
                            var13.field1139 = 1;
                            var13.field1136 = var8;
                            var13.field1134 = 0;
                            var13.field1133 = var6;
                            if (!arg4.field5229) {
                                class189.method1394(arg4, arg3 + 159, var10, 0);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg3 != 97) {
            method1475(true);
        }
        field3145++;
    }
}
