import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class116 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1721 = 0;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Llf;")
    public static class211 field1720 = new class211(100);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method770(byte arg0) {
        field1723++;
        int var1 = 10 % ((-arg0 - 70) / 51);
        class120.field1747.method1430(-1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLdl;)V")
    public static final void method771(byte arg0, class123 arg1) {
        field1716++;
        class104.field1605 = arg1.method813("runes", -1);
        int var2 = -61 / ((arg0 + 20) / 58);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method772(int arg0) {
        if (arg0 != -20666) {
            method775(101, 39, 2);
        }
        field1720 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIILhi;Lhi;IIJ)V")
    public static final void method773(int arg0, int arg1, int arg2, int arg3, class219 arg4, class219 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class69 var10 = new class69();
        var10.field962 = arg8;
        var10.field970 = arg1 * 128 + 64;
        var10.field964 = arg2 * 128 + 64;
        var10.field976 = arg3;
        var10.field963 = arg4;
        var10.field965 = arg5;
        var10.field975 = arg6;
        var10.field969 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class90.field1382[var11][arg1][arg2] == null) {
                class90.field1382[var11][arg1][arg2] = new class49(var11, arg1, arg2);
            }
        }
        class90.field1382[arg0][arg1][arg2].field627 = var10;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ltg;IIZI)V")
    public static final void method774(class181 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1717++;
        if (!arg3) {
            return;
        }
        for (class190 var5 = (class190) class205.field3207.method350(8240); var5 != null; var5 = (class190) class205.field3207.method353((byte) -122)) {
            if (var5.field2994 == arg1 && (arg2 * 128) == var5.field3003 && arg4 * 128 == var5.field2990 && var5.field3000.field2872 == arg0.field2872) {
                if (var5.field2986 != null) {
                    class130.field1907.method716(var5.field2986);
                    var5.field2986 = null;
                }
                if (var5.field2989 != null) {
                    class130.field1907.method716(var5.field2989);
                    var5.field2989 = null;
                }
                var5.method784(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
    public static final int method775(int arg0, int arg1, int arg2) {
        field1718++;
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 != 128) {
            return -110;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method776(int arg0, int arg1) {
        class94.field1463 = -1;
        class94.field1463 = arg1;
        field1719++;
        if (arg0 == 37) {
            class60.field842 = 3.0F;
        } else if (arg0 == 50) {
            class60.field842 = 4.0F;
        } else if (arg0 == 75) {
            class60.field842 = 6.0F;
        } else if (arg0 == 100) {
            class60.field842 = 8.0F;
        } else if (arg0 == 200) {
            class60.field842 = 16.0F;
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[I[ILi;[I)V")
    public static final void method777(int arg0, int[] arg1, int[] arg2, class56 arg3, int[] arg4) {
        field1722++;
        for (int var5 = arg0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var8 != 0 && var9 < arg3.field1236.length) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field1236[var9] = null;
                    } else {
                        class198 var10 = class104.method688(var6, 30091);
                        int var11 = var10.field3086;
                        class205 var12 = arg3.field1236[var9];
                        if (var12 != null) {
                            if (var12.field3205 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field1236[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3206 = 0;
                                    var12.field3211 = var7;
                                    var12.field3209 = 0;
                                    var12.field3210 = 1;
                                    var12.field3208 = 0;
                                    class279.method1870((byte) 65, false, var10, 0, arg3.field1226, arg3.field1273);
                                } else if (var11 == 2) {
                                    var12.field3208 = 0;
                                }
                            } else if (var10.field3082 >= class104.method688(var12.field3205, 30091).field3082) {
                                var12 = arg3.field1236[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class205 var13 = arg3.field1236[var9] = new class205();
                            var13.field3210 = 1;
                            var13.field3206 = 0;
                            var13.field3209 = 0;
                            var13.field3211 = var7;
                            var13.field3208 = 0;
                            var13.field3205 = var6;
                            class279.method1870((byte) 65, false, var10, 0, arg3.field1226, arg3.field1273);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
    }
}
