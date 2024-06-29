import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class736 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public int field10268 = 8;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field10276 = 16777215;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lfh;")
    public static class651 field10272 = new class651(true);

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Lea;")
    public static class547 field10277 = new class547(82, 0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public int field10271;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field10273;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public int field10275;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field10278;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public int field10280;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Lhba;")
    public static class10 field10270;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Lem;")
    public static class227 field10279;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Z")
    public boolean field10269;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 10)
    public static void method4119(int arg0) {
        field10277 = null;
        field10272 = null;
        field10279 = null;
        field10270 = null;
        if (arg0 < 68) {
            method4120(null, -99, null, null, null);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lgv;I[I[I[I)V", line = 24)
    public static final void method4120(class83 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field10282++;
        if (arg1 != -3433) {
            method4119(100);
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg0.field839.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field839[var9] = null;
                    } else {
                        class300 var10 = class460.field6365.method1090(var6, 16383);
                        int var11 = var10.field4043;
                        class474 var12 = arg0.field839[var9];
                        if (var12 != null) {
                            if (var12.field6557 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field839[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6564 = 0;
                                    var12.field6561 = 0;
                                    var12.field6560 = var8;
                                    var12.field6559 = 0;
                                    var12.field6558 = 1;
                                    if (!arg0.field819) {
                                        class153.method930((byte) -128, arg0, 0, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field6561 = 0;
                                }
                            } else if (var10.field4056 >= class460.field6365.method1090(var12.field6557, 16383).field4056) {
                                var12 = arg0.field839[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class474 var13 = arg0.field839[var9] = new class474();
                            var13.field6560 = var8;
                            var13.field6564 = 0;
                            var13.field6557 = var6;
                            var13.field6559 = 0;
                            var13.field6561 = 0;
                            var13.field6558 = 1;
                            if (!arg0.field819) {
                                class153.method930((byte) -126, arg0, 0, var10);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 125)
    public static final void method4121(byte arg0) {
        if (arg0 > -17) {
            return;
        }
        if (class546.field7709 != null) {
            class187[] var1 = class546.field7709;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class187 var3 = var1[var2];
                var3.method1053(-31295);
            }
        }
        field10267++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lji;B)V", line = 152)
    public final void method4122(class611 arg0, byte arg1) {
        field10266++;
        if (arg1 != -16) {
            method4125(-39, -58, -29, 127, null);
        }
        while (true) {
            int var3 = arg0.method3428((byte) 15);
            if (var3 == 0) {
                return;
            }
            this.method4123(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILji;)V", line = 176)
    private final void method4123(boolean arg0, int arg1, class611 arg2) {
        if (arg1 == 1) {
            this.field10268 = arg2.method3402((byte) 127);
        } else if (arg1 == 2) {
            this.field10269 = true;
        } else if (arg1 == 3) {
            this.field10275 = arg2.method3413(arg0);
            this.field10273 = arg2.method3413(false);
            this.field10271 = arg2.method3413(false);
        } else if (arg1 == 4) {
            this.field10278 = arg2.method3428((byte) -108);
        } else if (arg1 == 5) {
            this.field10280 = arg2.method3402((byte) 127);
        } else if (arg1 == 6) {
            this.field10276 = arg2.method3385(-123);
        }
        field10281++;
        if (arg0) {
            field10279 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 222)
    public static final void method4124(int arg0) {
        field10274++;
        if (class704.field9876 == null) {
            return;
        }
        class633.field8786 = new class208();
        class633.field8786.method1165(class606.field8428, (byte) 95, class704.field9876.field5419, class704.field9876, class704.field9876.field5430.method4201(class723.field10095, (byte) 25));
        class430.field6043 = new Thread(class633.field8786, "");
        if (arg0 == 0) {
            class430.field6043.start();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIILic;)V", line = 242)
    public static final void method4125(int arg0, int arg1, int arg2, int arg3, class699 arg4) {
        class624 var5 = class76.method565(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field2170 = (arg1 << class443.field6172) + class522.field7044;
        arg4.field2178 = arg3;
        arg4.field2165 = (arg2 << class443.field6172) + class522.field7044;
        var5.field8735 = arg4;
        int var6 = class25.field188 == class143.field1850 ? 1 : 0;
        if (arg4.method123(-2)) {
            if (arg4.method126(6540)) {
                arg4.field2179 = class43.field467[var6];
                class43.field467[var6] = arg4;
                return;
            }
            arg4.field2179 = class732.field10200[var6];
            class732.field10200[var6] = arg4;
            class315.field4252 = true;
            return;
        }
        arg4.field2179 = class707.field9896[var6];
        class707.field9896[var6] = arg4;
    }
}
