import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class15 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    public static int[] field289 = new int[64];

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    public static int[] field288;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[Z")
    public static boolean[] field291;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lnq;Lnq;I)V")
    public static final void method233(class268 arg0, class268 arg1, int arg2) {
        field287++;
        class139.field1994 = arg1;
        class417.field5930 = arg0;
        class139.field1994.method1739(arg2 + 101, 34);
        if (arg2 != -1) {
            field290 = -30;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method234(byte arg0) {
        field289 = null;
        field288 = null;
        field291 = null;
        if (arg0 != -5) {
            field291 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
    public static final int method235(byte arg0) {
        if (arg0 != -70) {
            method235((byte) -37);
        }
        field286++;
        if (class432.field6109 == null) {
            if (!class271.field3762 && class90.field1260 > 0) {
                if (class18.field320 && class203.field2790.method1872(81, arg0 + 4533) && class90.field1260 > 2) {
                    return ((class87) class121.field1699.field1267.field5601.field5601).field1219;
                }
                return ((class87) class121.field1699.field1267.field5601).field1219;
            }
            int var1 = class239.field3410.method1071((byte) -12);
            int var2 = class239.field3410.method1068((byte) -61);
            int var3 = class18.field330;
            int var4 = class211.field2952;
            int var5 = class151.field2135;
            if (var1 > var3 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class90.field1260; var7++) {
                    if (class173.field2367) {
                        int var12 = (class90.field1260 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class90.field1260 - var7 - 1) * 16 + var4 + 31;
                        if (var11 - 13 < var2 && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class434 var9 = new class434(class121.field1699);
                    for (class87 var10 = (class87) var9.method2730(arg0 ^ 0x45); var10 != null; var10 = (class87) var9.method2727((byte) 127)) {
                        if (var6 == (var8++)) {
                            return var10.field1219;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIBI)V")
    public static final void method236(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field292++;
        int var6 = arg2 - arg0;
        int var7 = arg1 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class440.method2759(arg3, arg0, arg2, arg5, (byte) 122);
            }
        } else if (var6 == 0) {
            class375.method2398(arg0, (byte) -13, arg1, arg5, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                int var10 = arg1;
                arg3 = arg0;
                arg1 = arg2;
                arg0 = var9;
                arg2 = var10;
            }
            if (arg1 < arg3) {
                int var11 = arg3;
                int var12 = arg0;
                arg3 = arg1;
                arg0 = arg2;
                arg1 = var11;
                arg2 = var12;
            }
            int var13 = arg0;
            int var14 = arg1 - arg3;
            int var15 = arg2 - arg0;
            int var16 = -(var14 >> 1);
            if (arg4 != 111) {
                method233((class268) null, (class268) null, -24);
            }
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg2 <= arg0 ? -1 : 1;
            if (var8) {
                for (int var18 = arg3; var18 <= arg1; var18++) {
                    class296.field4138[var18][var13] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg1; var19++) {
                    var16 += var15;
                    class296.field4138[var13][var19] = arg5;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method237(short[] arg0, String[] arg1, int arg2) {
        field293++;
        class388.method2456(arg1, arg1.length - 1, arg0, (byte) 79, arg2);
    }

    static {
        new class442("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }
}
