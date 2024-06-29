import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class128 extends class12 {

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2194 = "Continue";

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "Lab;")
    public static class279 field2198 = new class279(50);

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "Le;")
    public static class342 field2200 = new class342(128);

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Lbm;")
    public static class307 field2190;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "Ltl;")
    public class62 field2199;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[B")
    public byte[] field2192;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method844(int arg0, int arg1, byte arg2) {
        field2196++;
        if (arg1 == 8) {
            arg1 = 4;
        }
        if (arg2 >= -39) {
            field2198 = (class279) null;
        }
        if (arg1 == 4 && !class45.field926) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class215.field3438 != arg1) {
            if (class255.field3984) {
                return;
            }
            if (class215.field3438 != 0) {
                class141.field2335[class215.field3438].method185();
            }
            if (arg1 != 0) {
                class323 var3 = class141.field2335[arg1];
                var3.method188();
                var3.method186(arg0);
            }
            class215.field3438 = arg1;
            class285.field4414 = arg0;
        } else if (arg1 != 0 && class285.field4414 != arg0) {
            class141.field2335[arg1].method186(arg0);
            class285.field4414 = arg0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V", line = 57)
    public static final void method845(int arg0, int arg1) {
        if (arg1 == -9243) {
            class213.field3422.method1883(2047773287, arg0);
            field2193++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)[B", line = 69)
    public final byte[] method97(int arg0) {
        if (arg0 < 5) {
            this.field2192 = (byte[]) null;
        }
        field2195++;
        if (this.field239) {
            throw new RuntimeException();
        }
        return this.field2192;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V", line = 88)
    public static void method846(byte arg0) {
        field2190 = null;
        field2194 = null;
        field2200 = null;
        if (arg0 != 48) {
            method847(-125);
        }
        field2198 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)I", line = 103)
    public final int method95(boolean arg0) {
        if (arg0) {
            this.method95(true);
        }
        field2191++;
        return this.field239 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 125)
    public static final void method847(int arg0) {
        field2201++;
        int var1 = class190.field3082.method81(arg0 + 3, 8);
        if (var1 < class305.field4623) {
            for (int var2 = var1; var2 < class305.field4623; var2++) {
                class109.field1870[class150.field2457++] = class283.field4384[var2];
            }
        }
        if (class305.field4623 < var1) {
            throw new RuntimeException("gppov1");
        } else if (arg0 == 4) {
            class305.field4623 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class283.field4384[var3];
                class278 var5 = class97.field1715[var4];
                int var6 = class190.field3082.method81(7, 1);
                if (var6 == 0) {
                    class283.field4384[class305.field4623++] = var4;
                    var5.field1855 = class25.field494;
                } else {
                    int var7 = class190.field3082.method81(7, 2);
                    if (var7 == 0) {
                        class283.field4384[class305.field4623++] = var4;
                        var5.field1855 = class25.field494;
                        class130.field2206[class248.field3865++] = var4;
                    } else if (var7 == 1) {
                        class283.field4384[class305.field4623++] = var4;
                        var5.field1855 = class25.field494;
                        int var8 = class190.field3082.method81(7, 3);
                        var5.method705((byte) 123, 1, var8);
                        int var9 = class190.field3082.method81(7, 1);
                        if (var9 == 1) {
                            class130.field2206[class248.field3865++] = var4;
                        }
                    } else if (var7 == 2) {
                        class283.field4384[class305.field4623++] = var4;
                        var5.field1855 = class25.field494;
                        if (class190.field3082.method81(arg0 + 3, 1) == 1) {
                            int var10 = class190.field3082.method81(7, 3);
                            var5.method705((byte) -97, 2, var10);
                            int var11 = class190.field3082.method81(7, 3);
                            var5.method705((byte) -119, 2, var11);
                        } else {
                            int var12 = class190.field3082.method81(7, 3);
                            var5.method705((byte) -104, 0, var12);
                        }
                        int var13 = class190.field3082.method81(arg0 ^ 0x3, 1);
                        if (var13 == 1) {
                            class130.field2206[class248.field3865++] = var4;
                        }
                    } else if (var7 == 3) {
                        class109.field1870[class150.field2457++] = var4;
                    }
                }
            }
        }
    }
}
