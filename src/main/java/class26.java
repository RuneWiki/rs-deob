import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class26 extends class398 {

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lse;")
    public static class331 field389 = new class331(8);

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field391 = 0;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
    public static int[] field390 = new int[4096];

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[Lod;")
    public static class137[] field382;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static void method214(byte arg0) {
        field382 = null;
        if (arg0 != -3) {
            field382 = null;
        }
        field390 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method217(-118, (String) null, -110, 85, -76, -90, (String) null, 63L);
        }
        ++field388;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V")
    public final void method25(int arg0, int arg1, int arg2) {
        ++field384;
        if (arg1 > -46) {
            field382 = null;
        }
        int var4 = this.field383 * arg0 >> 12;
        int var5 = this.field386 * arg0 >> 12;
        int var6 = this.field377 * arg2 >> 12;
        int var7 = this.field385 * arg2 >> 12;
        class280.method1987(var4, var6, super.field5857, var5, var7, (byte) -39);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([ILri;[IB[I)V")
    public static final void method215(int[] arg0, class98 arg1, int[] arg2, byte arg3, int[] arg4) {
        int var5 = 4 / ((-54 - arg3) / 54);
        for (int var6 = 0; ~arg2.length < ~var6; ++var6) {
            int var7 = arg2[var6];
            int var8 = arg4[var6];
            int var9 = arg0[var6];
            for (int var10 = 0; ~var8 != -1 && ~var10 > ~arg1.field5646.length; ++var10) {
                if (~(1 & var8) != -1) {
                    if (~var7 != 0) {
                        class51 var11 = class113.method974(var7, (byte) -87);
                        int var12 = var11.field817;
                        class109 var13 = arg1.field5646[var10];
                        if (var13 != null) {
                            if (var13.field1789 != var7) {
                                if (~var11.field840 <= ~class113.method974(var13.field1789, (byte) -125).field840) {
                                    var13 = arg1.field5646[var10] = null;
                                }
                            } else if (var12 != 0) {
                                if (~var12 == -2) {
                                    var13.field1776 = 1;
                                    var13.field1784 = 0;
                                    var13.field1781 = 0;
                                    var13.field1783 = var9;
                                    var13.field1788 = 0;
                                    class50.method399(0, arg1.field6519, (byte) 105, var11, arg1.field6520, false);
                                } else if (~var12 == -3) {
                                    var13.field1781 = 0;
                                }
                            } else {
                                var13 = arg1.field5646[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class109 var14 = arg1.field5646[var10] = new class109();
                            var14.field1784 = 0;
                            var14.field1776 = 1;
                            var14.field1789 = var7;
                            var14.field1788 = 0;
                            var14.field1783 = var9;
                            var14.field1781 = 0;
                            class50.method399(0, arg1.field6519, (byte) 73, var11, arg1.field6520, false);
                        }
                    } else {
                        arg1.field5646[var10] = null;
                    }
                }
                var8 >>>= 1;
            }
        }
        ++field387;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ldp;Ldp;Ldp;I)V")
    public static final void method216(class174 arg0, class174 arg1, class174 arg2, int arg3) {
        ++field379;
        class441.field6412 = arg2;
        class168.method1286(283, arg0, arg1);
        if (arg3 > -21) {
            field391 = -53;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/String;IIIILjava/lang/String;J)V")
    public static final void method217(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, String arg6, long arg7) {
        ++field378;
        if (arg5 == 12154) {
            if (!class84.field1365 && class389.field5591 < 500) {
                int var9 = arg4 != -1 ? arg4 : class436.field6354;
                class278 var10 = new class278(arg1, arg6, var9, arg2, arg7, arg0, arg3);
                class276.field4153.method148((byte) 87, var10);
                ++class389.field5591;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
    public final void method23(int arg0, int arg1, byte arg2) {
        int var4 = -56 % ((arg2 - -62) / 37);
        ++field380;
        int var5 = this.field383 * arg0 >> 12;
        int var6 = this.field386 * arg0 >> 12;
        int var7 = this.field377 * arg1 >> 12;
        int var8 = this.field385 * arg1 >> 12;
        class441.method2751(var5, var6, super.field5864, super.field5863, var7, var8, 81, super.field5857);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIII)V")
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field383 = arg0;
        this.field377 = arg1;
        this.field385 = arg3;
        this.field386 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLdp;Ldp;)V")
    public static final void method218(int arg0, boolean arg1, class174 arg2, class174 arg3) {
        class439.field6388 = arg2;
        class137.field2200 = arg3;
        ++field376;
        if (arg0 != 27594) {
            field391 = 16;
        }
        class308.field4506 = arg1;
        int var4 = class439.field6388.method1325(-127) - 1;
        class100.field1555 = var4 * 256 - -class439.field6388.method1333(arg0 + -27594, var4);
        class331.field4765 = new String[] { null, null, null, null, class63.field1022 };
        class174.field2594 = new String[] { null, null, class239.field3445, null, null };
    }
}
