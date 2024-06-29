import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class659 extends class159 {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "J")
    public long field8883;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lgj;")
    public class659 field8885;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lgj;")
    public class659 field8887;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field8886;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLcm;[I[I[I)V", line = 3)
    public static final void method3656(byte arg0, class758 arg1, int[] arg2, int[] arg3, int[] arg4) {
        field8884++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field6163.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field6163[var9] = null;
                    } else {
                        class317 var10 = class693.field9223.method2388(var6, 0);
                        int var11 = var10.field4487;
                        class610 var12 = arg1.field6163[var9];
                        if (var12 != null) {
                            if (var12.field8251 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field6163[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8248 = 1;
                                    var12.field8252 = 0;
                                    var12.field8253 = var8;
                                    var12.field8249 = 0;
                                    var12.field8250 = 0;
                                    if (!arg1.field6135) {
                                        class627.method3466(arg1, var10, -29701, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field8250 = 0;
                                }
                            } else if (var10.field4466 >= class693.field9223.method2388(var12.field8251, 0).field4466) {
                                var12 = arg1.field6163[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class610 var13 = arg1.field6163[var9] = new class610();
                            var13.field8252 = 0;
                            var13.field8249 = 0;
                            var13.field8251 = var6;
                            var13.field8253 = var8;
                            var13.field8248 = 1;
                            var13.field8250 = 0;
                            if (!arg1.field6135) {
                                class627.method3466(arg1, var10, -29701, 0);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg0 != 101) {
            field8886 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 106)
    public static void method3657(byte arg0) {
        if (arg0 != 57) {
            field8886 = null;
        }
        field8886 = null;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Z", line = 117)
    public final boolean method3658(byte arg0) {
        field8882++;
        if (arg0 != -121) {
            this.field8887 = null;
        }
        return this.field8887 != null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 131)
    public final void method3659(int arg0) {
        field8881++;
        if (this.field8887 == null) {
            return;
        }
        this.field8887.field8885 = this.field8885;
        this.field8885.field8887 = this.field8887;
        this.field8885 = null;
        this.field8887 = null;
        if (arg0 != 1) {
            this.field8887 = null;
        }
    }
}
