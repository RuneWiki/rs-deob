import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public abstract class class258 extends class337 {

    @OriginalMember(owner = "client!rja", name = "l", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lft;[I[I[II)V", line = 9)
    public static final void method1652(class727 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field4752.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4752[var9] = null;
                    } else {
                        class11 var10 = class143.field1864.method4265(true, var6);
                        int var11 = var10.field102;
                        class129 var12 = arg0.field4752[var9];
                        if (var12 != null) {
                            if (var12.field1726 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4752[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1721 = var8;
                                    var12.field1723 = 0;
                                    var12.field1727 = 0;
                                    var12.field1728 = 0;
                                    var12.field1722 = 1;
                                    if (!arg0.field4688) {
                                        class117.method699(0, var10, false, arg0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1723 = 0;
                                }
                            } else if (var10.field92 >= class143.field1864.method4265(true, var12.field1726).field92) {
                                var12 = arg0.field4752[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class129 var13 = arg0.field4752[var9] = new class129();
                            var13.field1728 = 0;
                            var13.field1723 = 0;
                            var13.field1727 = 0;
                            var13.field1726 = var6;
                            var13.field1722 = 1;
                            var13.field1721 = var8;
                            if (!arg0.field4688) {
                                class117.method699(0, var10, false, arg0);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg4 == 10810) {
            field3479++;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lim;B)V")
    public abstract void method547(class652 arg0, byte arg1);

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLmc;)V")
    public abstract void method546(byte arg0, class234 arg1);
}
