import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class59 {

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
    public static int[] field893 = new int[14];

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
    public static boolean field900 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "B")
    public byte field887;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "B")
    public byte field888;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "B")
    public byte field890;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "B")
    public byte field895;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "S")
    public short field892;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Z")
    public boolean field889;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Z")
    public boolean field891;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Z")
    public boolean field896;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Z")
    public boolean field899;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Z")
    public boolean field901;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 5)
    public static final void method434(byte arg0) {
        field897++;
        class153.field2479 = null;
        class41.field626 = null;
        class139.field2184 = null;
        if (arg0 < 10) {
            return;
        }
        class221.field3427 = null;
        class115.field1686 = null;
        class302.field4967 = null;
        class195.field2990 = null;
        class75.field1133 = null;
        class104.field1509 = null;
        class243.field3837 = null;
        class287.field4740 = null;
        class292.field4844 = null;
        class242.field3812 = null;
        class13.field175 = null;
        class105.field1521 = null;
        class171.field2664 = null;
        class31.field471 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[Lsi;I)V", line = 42)
    public static final void method435(int arg0, class264[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class264 var4 = arg1[var3];
            if (var4 != null && var4.field4201 == arg0 && (!var4.field4276 || !client.method891(var4))) {
                if (var4.field4350 == 0) {
                    if (!var4.field4276 && client.method891(var4) && class295.field4899 != var4) {
                        continue;
                    }
                    method435(var4.field4204, arg1, 0);
                    if (var4.field4314 != null) {
                        method435(var4.field4204, var4.field4314, 0);
                    }
                    class167 var5 = (class167) class218.field3363.method29((long) var4.field4204, arg2 ^ 0x67);
                    if (var5 != null) {
                        class171.method1183(var5.field2631, (byte) -127);
                    }
                }
                if (var4.field4350 == 6) {
                    if (var4.field4296 != -1 || var4.field4278 != -1) {
                        boolean var6 = class169.method1172(var4, arg2 ^ 0xFFFFF99F);
                        int var7;
                        if (var6) {
                            var7 = var4.field4278;
                        } else {
                            var7 = var4.field4296;
                        }
                        if (var7 != -1) {
                            class131 var8 = class68.method476((byte) 107, var7);
                            if (var8 != null) {
                                var4.field4313 += class215.field3322;
                                while (var4.field4313 > var8.field2002[var4.field4285]) {
                                    var4.field4313 -= var8.field2002[var4.field4285];
                                    var4.field4285++;
                                    if (var4.field4285 >= var8.field1988.length) {
                                        var4.field4285 -= var8.field1986;
                                        if (var4.field4285 < 0 || var8.field1988.length <= var4.field4285) {
                                            var4.field4285 = 0;
                                        }
                                    }
                                    var4.field4301 = var4.field4285 + 1;
                                    if (var8.field1988.length <= var4.field4301) {
                                        var4.field4301 -= var8.field1986;
                                        if (var4.field4301 < 0 || var4.field4301 >= var8.field1988.length) {
                                            var4.field4301 = -1;
                                        }
                                    }
                                    class218.method1472((byte) 117, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4358 != 0 && !var4.field4276) {
                        int var9 = var4.field4358 >> 16;
                        int var10 = class215.field3322 * var9;
                        int var11 = var4.field4358 << 16 >> 16;
                        var4.field4191 = var4.field4191 + var10 & 0x7FF;
                        int var12 = class215.field3322 * var11;
                        var4.field4346 = var4.field4346 + var12 & 0x7FF;
                        class218.method1472((byte) 115, var4);
                    }
                }
            }
        }
        field898++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 178)
    public static void method436(byte arg0) {
        if (arg0 > -80) {
            field900 = false;
        }
        field893 = null;
    }
}
