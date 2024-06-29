import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class411 extends class178 {

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Ldi;")
    public static class83 field6011 = new class83(74, -1);

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lqp;")
    public static class466 field6015 = new class466("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field6016 = new String[5];

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "C")
    public char field6002;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field6013;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "J")
    public long field6004;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lpf;")
    public class411 field6010;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
    public boolean field6006;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[I")
    public static int[] field6007;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)C", line = 5)
    public final char method1151(byte arg0) {
        field6000++;
        if (arg0 > -8) {
            field6015 = null;
        }
        return this.field6002;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 20)
    public static void method2462(int arg0) {
        field6007 = null;
        field6015 = null;
        int var1 = 21 / ((62 - arg0) / 46);
        field6016 = null;
        field6011 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIII)Z", line = 32)
    public static final boolean method2463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class371.field5429[arg0][var8][var14] == -class328.field4485) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class523.field7736) + 1;
            int var10 = (arg3 << class523.field7736) + 2;
            int var11 = class211.field2950[arg0].method351(arg1, arg3) + arg5;
            if (!class61.method501(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class523.field7736) - 1;
            if (!class61.method501(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class523.field7736) - 1;
            if (!class61.method501(var9, var11, var13)) {
                return false;
            } else if (class61.method501(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class442.method2635(arg0, arg1, arg3)) {
            int var6 = arg1 << class523.field7736;
            int var7 = arg3 << class523.field7736;
            return class61.method501(var6 + 1, class211.field2950[arg0].method351(arg1, arg3) + arg5, var7 + 1) && class61.method501(class424.field6241 + var6 - 1, class211.field2950[arg0].method351(arg1 + 1, arg3) + arg5, var7 + 1) && class61.method501(class424.field6241 + var6 - 1, class211.field2950[arg0].method351(arg1 + 1, arg3 + 1) + arg5, class424.field6241 + var7 - 1) && class61.method501(var6 + 1, class211.field2950[arg0].method351(arg1, arg3 + 1) + arg5, class424.field6241 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I", line = 92)
    public final int method1149(boolean arg0) {
        if (!arg0) {
            field6007 = null;
        }
        field6003++;
        return this.field6005;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method1150(int arg0) {
        if (arg0 != -3813) {
            field6011 = null;
        }
        field6012++;
        return this.field6006;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JI)V", line = 119)
    public static final void method2464(long arg0, int arg1) {
        if (arg1 != 18059) {
            return;
        }
        field6014++;
        class481.field7027.field5719 = 0;
        class481.field7027.method2302(-4, class141.field2022.field311);
        class481.field7027.method2303(arg0, (byte) -28);
        class522.field7733 = 0;
        class401.field5888 = 0;
        class377.field5530 = -3;
        class66.field906 = 1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lya;I)V", line = 141)
    public static final void method2465(class38 arg0, int arg1) {
        field6009++;
        if (class292.field4032.method2806((byte) -128) == 0) {
            return;
        }
        if (arg1 >= -100) {
            method2465(null, 42);
        }
        if (class152.field2332 == 0) {
            for (class265 var4 = (class265) class292.field4032.method2818((byte) -21); var4 != null; var4 = (class265) class292.field4032.method2820((byte) -58)) {
                class328.field4480.method3093(var4.field3656, var4.field3662, var4.field3655 ? class316.field4324.field6417 : null, false, class451.field6653, true, arg0, var4.field3657, false, arg0, var4.field3659, var4.field3661);
                var4.method1565(0);
            }
            class361.method2180(true);
            return;
        }
        if (class183.field2679 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class183.field2679 = class38.method319(0, class202.field2840, class124.field1851, var2, (byte) 32, 0);
            class134.field1943 = class183.field2679.method324(class310.method1796(0, class188.field2726, class260.field3620, (byte) 127), class4.method24(class364.field5334, class260.field3620, 0), true);
        }
        for (class265 var3 = (class265) class292.field4032.method2818((byte) 125); var3 != null; var3 = (class265) class292.field4032.method2820((byte) -58)) {
            class328.field4480.method3093(var3.field3656, var3.field3662, var3.field3655 ? class316.field4324.field6417 : null, false, class134.field1943, true, class183.field2679, var3.field3657, false, arg0, var3.field3659, var3.field3661);
            var3.method1565(0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I", line = 192)
    public final int method1147(byte arg0) {
        if (arg0 < 106) {
            method2462(46);
        }
        field6001++;
        return this.field6013;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)J", line = 204)
    public final long method1153(byte arg0) {
        if (arg0 <= 89) {
            field6007 = null;
        }
        field6008++;
        return this.field6004;
    }
}
