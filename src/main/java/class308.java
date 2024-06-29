import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class308 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lrd;")
    public static class222 field4196;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Z")
    public static boolean field4197;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field4195;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field4198;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIBI)V")
    public static final void method1786(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4193++;
        if (class20.field269.field7650 != 0 && arg4 != 0 && class228.field3242 < 50 && arg1 != -1) {
            class275.field3767[class228.field3242++] = new class233((byte) 2, arg1, arg4, arg0, arg2, 0);
        }
        if (arg3 != -109) {
            field4197 = false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1787(int arg0, int arg1, int arg2, int arg3) {
        field4194++;
        class503 var4 = (class503) class176.method1135(arg1, arg0, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class380.method2252(var4, (byte) 72);
        }
        class503 var6 = (class503) class38.method295(arg1, arg0, arg2, field4198 == null ? (field4198 = method1791("jn")) : field4198);
        if (var6 != null) {
            var5 &= class380.method2252(var6, (byte) 72);
        }
        if (arg3 != 2) {
            field4196 = null;
        }
        class503 var7 = (class503) class509.method3048(arg1, arg0, arg2);
        if (var7 != null) {
            var5 &= class380.method2252(var7, (byte) 72);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lya;IILc;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1788(class38 arg0, int arg1, int arg2, class122 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class449.field6615 = arg0;
        class230.field3251 = arg1;
        class258.field3593 = arg3;
        class211.field2948 = class449.field6615.method263() > 0;
        class368.field5398 = arg4 >> class523.field7736;
        class403.field5916 = arg6 >> class523.field7736;
        class181.field2671 = arg4;
        class13.field201 = arg6;
        class384.field5598 = arg5;
        class214.field2997 = class368.field5398 - class110.field1656;
        if (class214.field2997 < 0) {
            class224.field3194 = -class214.field2997;
            class214.field2997 = 0;
        } else {
            class224.field3194 = 0;
        }
        class149.field2153 = class403.field5916 - class110.field1656;
        if (class149.field2153 < 0) {
            class187.field2713 = -class149.field2153;
            class149.field2153 = 0;
        } else {
            class187.field2713 = 0;
        }
        class127.field1887 = class368.field5398 + class110.field1656;
        if (class127.field1887 > class206.field2881) {
            class127.field1887 = class206.field2881;
        }
        class526.field7780 = class403.field5916 + class110.field1656;
        if (class526.field7780 > class371.field5427) {
            class526.field7780 = class371.field5427;
        }
        for (int var18 = 0; var18 < class110.field1656 + class110.field1656 + 2; var18++) {
            for (int var23 = 0; var23 < class110.field1656 + class110.field1656 + 2; var23++) {
                int var24 = class368.field5398 + var18 - class110.field1656;
                int var25 = class403.field5916 + var23 - class110.field1656;
                if (var24 >= 0 && var25 >= 0 && var24 < class206.field2881 && var25 < class371.field5427) {
                    int var26 = var24 << class523.field7736;
                    int var27 = var25 << class523.field7736;
                    int var28 = class385.field5608[class385.field5608.length - 1].method351(var24, var25) - (0x3E8 << class523.field7736 - 7);
                    int var29 = class89.field1302 == null ? class385.field5608[0].method351(var24, var25) + class424.field6241 : class89.field1302[0].method351(var24, var25) + class424.field6241;
                    class414.field6042[var18][var23] = class449.field6615.method286(var26, var28, var27, var26, var29, var27);
                } else {
                    class414.field6042[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class110.field1656 + class110.field1656 + 1; var19++) {
            for (int var22 = 0; var22 < class110.field1656 + class110.field1656 + 1; var22++) {
                class457.field6712[var19][var22] = class414.field6042[var19][var22] || class414.field6042[var19 + 1][var22] || class414.field6042[var19][var22 + 1] || class414.field6042[var19 + 1][var22 + 1];
            }
        }
        class86.field1267 = arg8;
        class224.field3196 = arg9;
        class312.field4257 = arg10;
        class459.field6736 = arg11;
        class485.field7080 = arg12;
        class519.method3096();
        class463.method2719(-117);
        for (class289 var20 = (class289) class296.field4069.method2461(-85); var20 != null; var20 = (class289) class296.field4069.method2458(-101)) {
            var20.method1522(-59);
            class162.method1070(var20, (byte) -116);
        }
        if (class211.field2948) {
            for (int var21 = 0; var21 < class510.field7569; var21++) {
                class94.field1451[var21].method3122(arg1, -113, arg17);
            }
        }
        if (arg2 > 1) {
            class449.field6615.method326(0);
            if (class361.field5270 == null || class361.field5270 instanceof class360) {
                class361.field5270 = new class403();
            }
        } else if (class361.field5270 == null || class361.field5270 instanceof class403) {
            class361.field5270 = new class360();
        }
        class361.field5270.method2153(5000, arg2);
        class361.field5270.method2156(5000);
        if (class382.field5586 != null) {
            class11.method52(true);
            class361.field5270.method2164((byte) -3, 22);
            class518.method3082(arg2, null, 0, (byte) 0, arg15, arg16);
            class361.field5270.method2156(5000);
            class361.field5270.method2164((byte) -3, 23);
            class11.method52(false);
        }
        class518.method3082(arg2, arg7, arg13, arg14, arg15, arg16);
        class361.field5270.method2156(5000);
        class361.field5270.method2162(5000);
        class361.field5270.method2156(5000);
        if (arg2 > 1) {
            class449.field6615.method221(0);
        }
        class449.field6615.method255(0, null);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1789(int arg0, byte arg1, int arg2) {
        field4195++;
        if (arg1 >= -15) {
            method1788(null, -40, -88, null, 9, 45, -76, null, null, null, null, null, null, 118, (byte) 112, 17, -64, false);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static void method1790(byte arg0) {
        if (arg0 <= 64) {
            method1787(-67, -44, -63, -36);
        }
        field4196 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1791(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class466("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class466("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field4196 = class307.method1785(2899);
        field4197 = false;
    }
}
