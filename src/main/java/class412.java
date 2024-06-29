import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class412 {

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "S")
    public short field6203;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Z")
    public boolean field6202;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "S")
    public short field6201;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "S")
    public short field6193;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public int field6191;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "B")
    public byte field6204;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "B")
    public byte field6200;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[I")
    public static int[] field6195 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Z")
    public static boolean field6196 = false;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public static void method2503(boolean arg0) {
        field6195 = null;
        if (!arg0) {
            method2503(true);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BILof;)V")
    public static final void method2504(byte arg0, int arg1, class321 arg2) {
        field6197++;
        boolean var3 = arg2.method2084((byte) -118, 1) == 1;
        if (var3) {
            class113.field1582[class499.field7298++] = arg1;
        }
        int var4 = arg2.method2084((byte) -118, 2);
        class322 var5 = class439.field6539[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field4949 = false;
            } else if (class452.field6641 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class314 var6 = class57.field759[arg1] = new class314();
                var6.field4798 = (var5.field5344[0] + class437.field6477 >> 6) + (var5.field5339[0] + class82.field1105 >> 6 << 14) + (var5.field2210 << 28);
                if (var5.field4934 == -1) {
                    var6.field4805 = var5.field5319.method2101(-128);
                } else {
                    var6.field4805 = var5.field4934;
                }
                var6.field4799 = var5.field4978;
                var6.field4807 = var5.field5257;
                if (var5.field4942 > 0) {
                    class93.method652(-105, var5);
                }
                class439.field6539[arg1] = null;
                if (arg2.method2084((byte) -118, 1) != 0) {
                    class366.method2297(arg2, arg1, 118);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method2084((byte) -118, 3);
            int var8 = var5.field5339[0];
            int var9 = var5.field5344[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field4949 = true;
                var5.field4963 = var8;
                var5.field4945 = var9;
            } else {
                var5.method2095(class363.field5624[arg1], var9, -11539, var8);
            }
        } else {
            if (arg0 > -114) {
                field6195 = null;
            }
            if (var4 == 2) {
                int var10 = arg2.method2084((byte) -118, 4);
                int var11 = var5.field5339[0];
                int var12 = var5.field5344[0];
                if (var10 == 0) {
                    var11 -= 2;
                    var12 -= 2;
                } else if (var10 == 1) {
                    var11--;
                    var12 -= 2;
                } else if (var10 == 2) {
                    var12 -= 2;
                } else if (var10 == 3) {
                    var12 -= 2;
                    var11++;
                } else if (var10 == 4) {
                    var12 -= 2;
                    var11 += 2;
                } else if (var10 == 5) {
                    var11 -= 2;
                    var12--;
                } else if (var10 == 6) {
                    var12--;
                    var11 += 2;
                } else if (var10 == 7) {
                    var11 -= 2;
                } else if (var10 == 8) {
                    var11 += 2;
                } else if (var10 == 9) {
                    var12++;
                    var11 -= 2;
                } else if (var10 == 10) {
                    var11 += 2;
                    var12++;
                } else if (var10 == 11) {
                    var12 += 2;
                    var11 -= 2;
                } else if (var10 == 12) {
                    var11--;
                    var12 += 2;
                } else if (var10 == 13) {
                    var12 += 2;
                } else if (var10 == 14) {
                    var12 += 2;
                    var11++;
                } else if (var10 == 15) {
                    var11 += 2;
                    var12 += 2;
                }
                if (var3) {
                    var5.field4963 = var11;
                    var5.field4949 = true;
                    var5.field4945 = var12;
                } else {
                    var5.method2095(class363.field5624[arg1], var12, -11539, var11);
                }
            } else {
                int var13 = arg2.method2084((byte) -118, 1);
                if (var13 == 0) {
                    int var14 = arg2.method2084((byte) -118, 12);
                    int var15 = var14 >> 10;
                    int var16 = var14 >> 5 & 0x1F;
                    if (var16 > 15) {
                        var16 -= 32;
                    }
                    int var17 = var14 & 0x1F;
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    int var18 = var5.field5339[0] + var16;
                    int var19 = var5.field5344[0] + var17;
                    if (var3) {
                        var5.field4949 = true;
                        var5.field4963 = var18;
                        var5.field4945 = var19;
                    } else {
                        var5.method2095(class363.field5624[arg1], var19, -11539, var18);
                    }
                    var5.field2210 = (byte) (var5.field2210 + var15 & 0x3);
                    if (class452.field6641 == arg1) {
                        class195.field2770 = var5.field2210;
                    }
                } else {
                    int var20 = arg2.method2084((byte) -118, 30);
                    int var21 = var20 >> 28;
                    int var22 = var20 >> 14 & 0x3FFF;
                    int var23 = var20 & 0x3FFF;
                    int var24 = (var5.field5339[0] + class82.field1105 + var22 & 0x3FFF) - class82.field1105;
                    int var25 = (class437.field6477 + var23 + var5.field5344[0] & 0x3FFF) - class437.field6477;
                    if (var3) {
                        var5.field4945 = var25;
                        var5.field4949 = true;
                        var5.field4963 = var24;
                    } else {
                        var5.method2095(class363.field5624[arg1], var25, -11539, var24);
                    }
                    var5.field2210 = (byte) (var5.field2210 + var21 & 0x3);
                    if (class452.field6641 == arg1) {
                        class195.field2770 = var5.field2210;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
    public static final int method2505(int arg0, int arg1) {
        field6192++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg0 != 17202) {
            method2506(13, (byte) -109);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
    public static final void method2506(int arg0, byte arg1) {
        class276.field3835 = -1;
        class277.field3839 = arg0;
        class145.field2089 = -1;
        int var2 = -120 / ((-arg1 - 62) / 43);
        field6190++;
        class504.method3016((byte) 126);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6198 = arg1;
        this.field6203 = (short) arg6;
        this.field6202 = arg10;
        this.field6201 = (short) arg5;
        this.field6193 = (short) arg4;
        this.field6189 = arg11;
        this.field6191 = arg0;
        this.field6194 = arg3;
        this.field6204 = (byte) arg7;
        this.field6200 = (byte) arg8;
        this.field6199 = arg2;
    }
}
