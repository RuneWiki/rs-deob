import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class419 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    private int field6157 = 0;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    private int field6161 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Laba;")
    private class222 field6159 = null;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private int field6164 = 0;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Ljj;")
    private class66 field6168;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Llm;")
    private class307 field6166;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[Liq;")
    private class190[] field6165;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lcc;")
    public class426 field6171;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "F")
    public static float field6169;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lgp;")
    public static class561 field6163;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
    public static final void method2518(byte arg0, int arg1) {
        field6172++;
        class21 var2 = class601.method3413(arg1, 16, (byte) 125);
        if (arg0 >= -6) {
            field6169 = -0.43632886F;
        }
        var2.method227(true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILaba;B)Z")
    public final boolean method2519(int arg0, class222 arg1, byte arg2) {
        field6158++;
        if (this.field6157 == 0) {
            return false;
        }
        int var4 = 98 / ((53 - arg2) / 57);
        if (this.field6159 != arg1) {
            this.field6165[Integer.MAX_VALUE & this.field6157].method927(arg0, arg1, 20731);
            this.field6159 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
    public final boolean method2520(int arg0, int arg1) {
        field6167++;
        if (arg0 != -1) {
            this.method2519(62, null, (byte) -57);
        }
        return this.field6165[arg1].method928(-72);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static final void method2521(byte arg0) {
        field6170++;
        if (arg0 != 83) {
            field6169 = 0.12670687F;
        }
        for (int var1 = 0; var1 < class621.field8746; var1++) {
            class509 var2 = class313.field4568[var1];
            boolean var3 = false;
            if (var2.field7070 == null) {
                var2.field7060--;
                if ((var2.field7063 == 2 ? -1500 : -10) <= var2.field7060) {
                    if (var2.field7063 == 1 && var2.field7071 == null) {
                        var2.field7071 = class60.method483(class366.field5196, var2.field7064, 0);
                        if (var2.field7071 == null) {
                            continue;
                        }
                        var2.field7060 += var2.field7071.method482();
                    } else if (var2.field7063 == 2 && (var2.field7068 == null || var2.field7072 == null)) {
                        if (var2.field7068 == null) {
                            var2.field7068 = class532.method2997(class523.field7265, var2.field7064);
                        }
                        if (var2.field7068 == null) {
                            continue;
                        }
                        if (var2.field7072 == null) {
                            var2.field7072 = var2.field7068.method3000(new int[] { 22050 });
                            if (var2.field7072 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field7060 < 0) {
                        int var4;
                        if (var2.field7066 == 0) {
                            var4 = class202.field2854.field7888 * var2.field7065 >> 8;
                        } else {
                            int var5 = (var2.field7066 & 0x3779FA1) >> 24;
                            if (class644.field9367.field5116 == var5) {
                                int var6 = var2.field7066 & 0xFF << 7;
                                int var7 = (var2.field7066 & 0xFF38FA) >> 16;
                                int var8 = (var7 << 7) + 64 - class644.field9367.field5108;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field7066 & 0xFFDE) >> 8;
                                int var10 = (var9 << 7) + 64 - class644.field9367.field5109;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var6 < var11) {
                                    var2.field7060 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class202.field2854.field7886 * var2.field7065 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class4 var12 = null;
                            if (var2.field7063 == 1) {
                                var12 = var2.field7071.method481().method10(class304.field4387);
                            } else if (var2.field7063 == 2) {
                                var12 = var2.field7072;
                            }
                            class320 var13 = var2.field7070 = class320.method1979(var12, 100, var4);
                            var13.method1975(var2.field7058 - 1);
                            class35.field485.method37(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field7070.method912(false)) {
                var3 = true;
            }
            if (var3) {
                class621.field8746--;
                for (int var14 = var1; var14 < class621.field8746; var14++) {
                    class313.field4568[var14] = class313.field4568[var14 + 1];
                }
                var1--;
            }
        }
        if (class331.field4757 && !class499.method2840((byte) -128)) {
            if (class202.field2854.field7921 != 0 && class93.field1643 != -1) {
                class367.method2214(class93.field1643, 0, class115.field1890, class202.field2854.field7921, -119, false);
            }
            class331.field4757 = false;
        } else if (class202.field2854.field7921 != 0 && class93.field1643 != -1 && !class499.method2840((byte) -128)) {
            class624.method3537(arg0 - 174, class95.field1662);
            class221.field3323++;
            class127.field2088.method1702(class93.field1643, false);
            class93.field1643 = -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIZIII)V")
    public final void method2522(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6160++;
        boolean var7 = arg0 & this.field6168.method529();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg1 = arg4;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg2) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field6157 != arg5) {
            if (this.field6157 != 0) {
                this.field6165[Integer.MAX_VALUE & this.field6157].method926((byte) -111);
            }
            if (arg5 != 0) {
                this.field6165[Integer.MAX_VALUE & arg5].method919(arg2, (byte) -108);
                this.field6165[Integer.MAX_VALUE & arg5].method921(arg2, 25747);
                this.field6165[Integer.MAX_VALUE & arg5].method925(arg4, 0, arg1);
            }
            this.field6164 = arg4;
            this.field6157 = arg5;
            this.field6161 = arg1;
            this.field6159 = null;
        } else if (this.field6157 != 0) {
            this.field6165[this.field6157 & Integer.MAX_VALUE].method921(arg2, 25747);
            if (this.field6164 != arg4 || this.field6161 != arg1) {
                this.field6165[Integer.MAX_VALUE & this.field6157].method925(arg4, arg3 - 64, arg1);
                this.field6164 = arg4;
                this.field6161 = arg1;
            }
        }
        if (arg3 != 64) {
            this.field6157 = -122;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method2523(int arg0) {
        field6163 = null;
        if (arg0 != Integer.MIN_VALUE) {
            method2523(10);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljj;)V")
    public class419(class66 arg0) {
        this.field6168 = arg0;
        this.field6166 = new class307(arg0);
        this.field6165 = new class190[10];
        this.field6165[1] = new class133(arg0);
        this.field6165[2] = new class111(arg0, this.field6166);
        this.field6165[4] = new class274(arg0, this.field6166);
        this.field6165[5] = new class501(arg0, this.field6166);
        this.field6165[6] = new class194(arg0);
        this.field6165[7] = new class183(arg0);
        this.field6165[3] = this.field6171 = new class426(arg0);
        this.field6165[8] = new class384(arg0, this.field6166);
        this.field6165[9] = new class233(arg0, this.field6166);
        if (!this.field6165[8].method928(50)) {
            this.field6165[8] = this.field6165[4];
        }
        if (!this.field6165[9].method928(89)) {
            this.field6165[9] = this.field6165[8];
        }
    }
}
