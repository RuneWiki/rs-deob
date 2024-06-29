import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class135 {

    @OriginalMember(owner = "client!li", name = "i", descriptor = "F")
    public static float field1824 = 1024.0F;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Lss;")
    public static class213 field1835 = new class213("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field1839 = 104;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lmn;")
    public static class162 field1830;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static final void method829(boolean arg0) {
        field1827++;
        if (class148.field1994 == 8) {
            class89.method610(4, (byte) -99);
        } else if (class148.field1994 == 4 || class148.field1994 == 5) {
            class89.method610(2, (byte) -90);
        } else if (class148.field1994 == 11) {
            class89.method610(2, (byte) -116);
        }
        if (!arg0) {
            method830(null, -49, -50, null, -114, 10, -94, null, null, null, null, null, null, -9, (byte) -28, -96, 32, true);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lza;IILc;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method830(class497 arg0, int arg1, int arg2, class205 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class104.field1523 = arg0;
        class85.field1239 = arg1;
        class24.field274 = arg3;
        class310.field4858 = class104.field1523.method1324() > 0;
        class192.field2847 = arg4 >> class56.field908;
        class241.field3919 = arg6 >> class56.field908;
        class329.field5178 = arg4;
        class32.field331 = arg6;
        class80.field1194 = arg5;
        class363.field5620 = class192.field2847 - class78.field1156;
        if (class363.field5620 < 0) {
            class435.field6558 = -class363.field5620;
            class363.field5620 = 0;
        } else {
            class435.field6558 = 0;
        }
        class197.field3041 = class241.field3919 - class78.field1156;
        if (class197.field3041 < 0) {
            class520.field7713 = -class197.field3041;
            class197.field3041 = 0;
        } else {
            class520.field7713 = 0;
        }
        class315.field4928 = class78.field1156 + class192.field2847;
        if (class315.field4928 > class252.field4075) {
            class315.field4928 = class252.field4075;
        }
        class529.field7781 = class78.field1156 + class241.field3919;
        if (class529.field7781 > class131.field1773) {
            class529.field7781 = class131.field1773;
        }
        for (int var18 = 0; var18 < class78.field1156 + class78.field1156 + 2; var18++) {
            for (int var23 = 0; var23 < class78.field1156 + class78.field1156 + 2; var23++) {
                int var24 = class192.field2847 + var18 - class78.field1156;
                int var25 = class241.field3919 + var23 - class78.field1156;
                if (var24 >= 0 && var25 >= 0 && var24 < class252.field4075 && var25 < class131.field1773) {
                    int var26 = var24 << class56.field908;
                    int var27 = var25 << class56.field908;
                    int var28 = class244.field3956[class244.field3956.length - 1].method688(var24, var25) - (0x3E8 << class56.field908 - 7);
                    int var29 = class103.field1520 == null ? class244.field3956[0].method688(var24, var25) + class42.field454 : class103.field1520[0].method688(var24, var25) + class42.field454;
                    class221.field3735[var18][var23] = class104.field1523.method1273(var26, var28, var27, var26, var29, var27);
                } else {
                    class221.field3735[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class78.field1156 + class78.field1156 + 1; var19++) {
            for (int var22 = 0; var22 < class78.field1156 + class78.field1156 + 1; var22++) {
                class357.field5543[var19][var22] = class221.field3735[var19][var22] || class221.field3735[var19 + 1][var22] || class221.field3735[var19][var22 + 1] || class221.field3735[var19 + 1][var22 + 1];
            }
        }
        class393.field5961 = arg8;
        class3.field36 = arg9;
        class17.field182 = arg10;
        class153.field2045 = arg11;
        class255.field4120 = arg12;
        class20.method128();
        class471.method2928(-85);
        for (class514 var20 = (class514) class92.field1348.method2616(255); var20 != null; var20 = (class514) class92.field1348.method2619(255)) {
            var20.method1613(1049391719);
            class450.method2834(-62, var20);
        }
        if (class310.field4858) {
            for (int var21 = 0; var21 < class368.field5683; var21++) {
                class60.field950[var21].method1070(arg1, -19, arg17);
            }
        }
        if (arg2 > 1) {
            class104.field1523.method1288(0);
            if (class409.field6200 == null || class409.field6200 instanceof class411) {
                class409.field6200 = new class184();
            }
        } else if (class409.field6200 == null || class409.field6200 instanceof class184) {
            class409.field6200 = new class411();
        }
        class409.field6200.method908(arg2, -51);
        class409.field6200.method913(0);
        if (class165.field2386 != null) {
            class202.method1377(true);
            class409.field6200.method909(22, 5);
            class446.method2818(arg2, null, 0, (byte) 0, arg15, arg16);
            class409.field6200.method913(0);
            class409.field6200.method909(23, 5);
            class202.method1377(false);
        }
        class446.method2818(arg2, arg7, arg13, arg14, arg15, arg16);
        class409.field6200.method913(0);
        class409.field6200.method915(0);
        class409.field6200.method913(0);
        if (arg2 > 1) {
            class104.field1523.method1265(0);
        }
        class104.field1523.method1242(0, null);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method831(byte arg0) {
        field1835 = null;
        field1830 = null;
        int var1 = -112 / ((6 - arg0) / 43);
    }
}
