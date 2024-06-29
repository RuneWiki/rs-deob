import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class323 extends class128 {

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Z")
    private boolean field4967 = true;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Z")
    private boolean field4974 = true;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "[I")
    public static int[] field4970 = new int[5];

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Ljava/lang/Thread;")
    public static Thread field4966;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lcc;BI)V", line = 4)
    public static final void method2245(class263[] arg0, byte arg1, int arg2) {
        field4969++;
        if (arg1 >= -81) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class263 var4 = arg0[var3];
            if (var4 != null && var4.field4065 == arg2 && (!var4.field3993 || !client.method1946(var4))) {
                if (var4.field3981 == 0) {
                    if (!var4.field3993 && client.method1946(var4) && class113.field1611 != var4) {
                        continue;
                    }
                    method2245(arg0, (byte) -94, var4.field4083);
                    if (var4.field3975 != null) {
                        method2245(var4.field3975, (byte) -115, var4.field4083);
                    }
                    class343 var5 = (class343) class292.field4585.method1537((long) var4.field4083, -22708);
                    if (var5 != null) {
                        class54.method327(-31356, var5.field5329);
                    }
                }
                if (var4.field3981 == 6) {
                    if (var4.field4134 != -1 || var4.field4071 != -1) {
                        boolean var6 = class255.method1853(-117, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4071;
                        } else {
                            var7 = var4.field4134;
                        }
                        if (var7 != -1) {
                            class247 var8 = class185.method1289(var7, (byte) 117);
                            if (var8 != null) {
                                var4.field4050 += class322.field4939;
                                while (var4.field4050 > var8.field3746[var4.field4153]) {
                                    var4.field4050 -= var8.field3746[var4.field4153];
                                    var4.field4153++;
                                    if (var8.field3734.length <= var4.field4153) {
                                        var4.field4153 -= var8.field3753;
                                        if (var4.field4153 < 0 || var8.field3734.length <= var4.field4153) {
                                            var4.field4153 = 0;
                                        }
                                    }
                                    var4.field4042 = var4.field4153 + 1;
                                    if (var8.field3734.length <= var4.field4042) {
                                        var4.field4042 -= var8.field3753;
                                        if (var4.field4042 < 0 || var4.field4042 >= var8.field3734.length) {
                                            var4.field4042 = -1;
                                        }
                                    }
                                    class239.method1712(0, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4039 != 0 && !var4.field3993) {
                        int var9 = var4.field4039 << 16 >> 16;
                        int var10 = class322.field4939 * var9;
                        var4.field4120 = var4.field4120 + var10 & 0x7FF;
                        int var11 = var4.field4039 >> 16;
                        int var12 = class322.field4939 * var11;
                        var4.field4131 = var4.field4131 + var12 & 0x7FF;
                        class239.method1712(0, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V", line = 121)
    public static final void method2246(String arg0, int arg1, int arg2, String arg3) {
        class222.field3147 = arg3;
        class321.field4936 = arg0;
        class304.field4719 = arg1;
        field4964++;
        if (class222.field3147.equals("") || class321.field4936.equals("")) {
            class255.field3876 = 3;
        } else if (class109.field1500 == -1) {
            class334.field5158 = 0;
            class44.field527 = 1;
            class331.field5061 = 0;
            class255.field3876 = -3;
            class107 var4 = new class107(128);
            var4.method648(10, (byte) 38);
            var4.method641(1773202520, (int) (Math.random() * 9.9999999E7D));
            var4.method678(class48.method285((byte) -90, class222.field3147), (byte) 102);
            var4.method641(1773202520, (int) (Math.random() * 9.9999999E7D));
            var4.method636(255, class321.field4936);
            if (arg2 == 14552) {
                var4.method641(1773202520, (int) (Math.random() * 9.9999999E7D));
                var4.method644(-1, class16.field219, class176.field2560);
                class140.field1954.field1400 = 0;
                class140.field1954.method648(24, (byte) 38);
                class140.field1954.method648(var4.field1400 + 2, (byte) 38);
                class140.field1954.method662(true, 542);
                class140.field1954.method665(var4.field1400, var4.field1388, -128, 0);
            }
        } else {
            class68.method425((byte) 74);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I", line = 166)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            field4975 = 0;
        }
        field4965++;
        int[][] var3 = this.field1755.method875(98, arg0);
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, this.field4974 ? class237.field3486 - arg0 : arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            if (this.field4967) {
                for (int var11 = 0; var11 < class10.field141; var11++) {
                    var5[var11] = var10[class244.field3664 - var11];
                    var8[var11] = var7[class244.field3664 - var11];
                    var9[var11] = var6[class244.field3664 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class10.field141; var12++) {
                    var5[var12] = var10[var12];
                    var8[var12] = var7[var12];
                    var9[var12] = var6[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 230)
    public class323() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(BI)V", line = 236)
    public static final void method2247(byte arg0, int arg1) {
        field4963++;
        class292.field4579.method1236(arg0 ^ 0xE27E55E2, arg1);
        if (arg0 != 69) {
            method2246((String) null, -103, -30, (String) null);
        }
        class19.field248.method1236(-495037017, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lp;II)V", line = 248)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field4973++;
        if (arg2 > -85) {
            this.field4974 = false;
        }
        if (arg1 == 0) {
            this.field4967 = arg0.method661(-1) == 1;
        } else if (arg1 == 1) {
            this.field4974 = arg0.method661(-1) == 1;
        } else if (arg1 == 2) {
            this.field1753 = arg0.method661(-1) == 1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V", line = 297)
    public static final void method2248(int arg0, int arg1) {
        field4968++;
        class15.field203 = arg0;
        class134.method893(arg1, arg1 ^ 0x3F2B);
        class134.method893(4, 16168);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)[I", line = 316)
    public final int[] method126(byte arg0, int arg1) {
        field4971++;
        if (arg0 <= 100) {
            return (int[]) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -80, 0, this.field4974 ? class237.field3486 - arg1 : arg1);
            if (this.field4967) {
                for (int var5 = 0; var5 < class10.field141; var5++) {
                    var3[var5] = var4[class244.field3664 - var5];
                }
            } else {
                class86.method513(var4, 0, var3, 0, class10.field141);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V", line = 353)
    public static void method2249(int arg0) {
        field4970 = null;
        field4966 = null;
        if (arg0 != 1486) {
            method2246((String) null, -115, -124, (String) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lgi;", line = 367)
    public static final class230 method2250(int arg0, int arg1) {
        field4972++;
        class230 var2 = (class230) class120.field1685.method1562(arg0 ^ arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class269.field4237.method1199(28815, class224.method1546((byte) 42, arg1), class15.method106(arg1, (byte) 112));
        class230 var4 = new class230();
        if (var3 != null) {
            var4.method1616(102, new class107(var3));
        }
        class120.field1685.method1565((long) arg1, var4, (byte) 78);
        return var4;
    }
}
