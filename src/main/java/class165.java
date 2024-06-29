import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class165 extends class139 {

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[Lcb;")
    public class249[] field2675;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBI)I")
    public static final int method1216(int arg0, int arg1, byte arg2, int arg3) {
        field2673++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            int var5 = 19 / ((1 - arg2) / 54);
            return arg3;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[BIIZIIIB[Lth;I)V")
    public static final void method1217(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8, class113[] arg9, int arg10) {
        if (arg8 > -17) {
            return;
        }
        field2677++;
        int var11 = -1;
        class152 var12 = new class152(arg1);
        while (true) {
            int var13 = var12.method1080(false);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1103(3);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFE2) >> 6;
                int var18 = var14 >> 12;
                int var19 = var12.method1111(255);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var18 && arg2 <= var17 && (arg2 + 8) > var17 && arg6 <= var16 && arg6 + 8 > var16) {
                    class36 var22 = class134.method970(var11, 0);
                    int var23 = class114.method838(var22.field487, var21, var22.field501, var16 & 0x7, var17 & 0x7, (byte) -98, arg10) + arg5;
                    int var24 = class264.method1847(var17 & 0x7, var22.field501, var16 & 0x7, var21, var22.field487, arg10, 2) + arg0;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class113 var25 = null;
                        if (!arg4) {
                            int var26 = arg7;
                            if ((class86.field1277[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class16.method115(var24, var11, arg4, var25, arg7, !arg4, arg7, var23, (byte) -127, var21 + arg10 & 0x3, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z")
    public final boolean method1218(byte arg0, int arg1) {
        field2672++;
        if (arg0 < 75) {
            this.field2675 = null;
        }
        return this.field2675[arg1].field4136;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Llc;Llc;IZ)V")
    public class165(class86 arg0, class86 arg1, int arg2, boolean arg3) {
        class187 var5 = new class187();
        int var6 = arg0.method617((byte) 105, arg2);
        this.field2675 = new class249[var6];
        int[] var7 = arg0.method641(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method643(var7[var8], arg2, false);
            class191 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class191 var12 = (class191) var5.method1384(2); var12 != null; var12 = (class191) var5.method1388((byte) 88)) {
                if (var12.field3075 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method648((byte) 40, var11, 0);
                } else {
                    var13 = arg1.method648((byte) 92, 0, var11);
                }
                var10 = new class191(var11, var13);
                var5.method1385(var10, true);
            }
            this.field2675[var7[var8]] = new class249(var9, var10);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1219(int arg0, boolean arg1, Object arg2) {
        field2676++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class273.method1893((byte) 109, var3) : var3;
        } else if (arg2 instanceof class168) {
            class168 var4 = (class168) arg2;
            return var4.method775(-150);
        } else if (arg0 == -22726) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(BI)Z")
    public final boolean method1220(byte arg0, int arg1) {
        int var3 = 34 % ((arg0 + 74) / 50);
        field2674++;
        return this.field2675[arg1].field4142;
    }
}
