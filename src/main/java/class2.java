import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class2 extends class35 {

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Lsh;")
    public static class472 field23 = new class472(6, 8);

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Z")
    public static boolean field41 = false;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "[I")
    public static int[] field50 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "Ltl;")
    public static class400 field40 = new class400(4);

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "Lmd;")
    public class199 field47;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "Lta;")
    public class310 field36;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Luk;")
    public class328 field33;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "Ltq;")
    public static class63 field39;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "Lib;")
    public class7 field29;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field40 = null;
        field23 = null;
        if (arg0 != -104) {
            method15((char) 65501, -50, (String) null);
        }
        field50 = null;
        field39 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field37++;
        if (arg3 >= 1 && arg0 >= 1 && arg3 <= (class379.field5642 - 2) && arg0 <= (class456.field6477 - 2)) {
            if (!class337.field5038.method2209(class170.field2424, 66) && !class103.method775(class314.field4722, arg3, arg0, arg4, 2)) {
                return;
            }
            if (class170.field2427 == null) {
                return;
            }
            class4.field80.method2159(class138.field1976, arg3, arg4, arg0, arg6 ^ 0x5A57, arg5, class183.field2717[arg4]);
            if (arg1 >= 0) {
                boolean var9 = class337.field5038.field3937;
                class337.field5038.field3937 = true;
                int var10 = arg4;
                if (arg4 < 3 && class340.method2088(arg0, (byte) -4, arg3)) {
                    var10 = arg4 + 1;
                }
                class4.field80.method2157(-8, arg2, arg1, class183.field2717[arg4], arg7, arg8, var10, class138.field1976, arg0, arg3, arg4);
                class337.field5038.field3937 = var9;
            }
        }
        if (arg6 != 20576) {
            method11((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lsk;I)I")
    public static final int method13(class309 arg0, int arg1) {
        field27++;
        if (~arg0.field4621 == arg1) {
            return 0;
        }
        if (arg0.field4635 != -1) {
            class309 var2 = null;
            if (arg0.field4635 < 32768) {
                var2 = class18.field241[arg0.field4635];
            } else if (arg0.field4635 >= 32768) {
                var2 = class40.field565[arg0.field4635 - 32768];
            }
            if (var2 != null) {
                int var3 = arg0.field4543 - var2.field4543;
                int var4 = arg0.field4538 - var2.field4538;
                if (var3 != 0 || var4 != 0) {
                    arg0.method1924((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, (byte) 110);
                }
            }
        }
        if ((arg0 instanceof class257)) {
            class257 var8 = (class257) arg0;
            if (var8.field3806 != -1 && (var8.field4678 == 0 || var8.field4677 > 0)) {
                var8.method1924(var8.field3806, (byte) 99);
                var8.field3806 = -1;
            }
        } else if (arg0 instanceof class349) {
            class349 var5 = (class349) arg0;
            if (var5.field5326 != -1 && (var5.field4678 == 0 || var5.field4677 > 0)) {
                int var6 = var5.field4543 - ((var5.field5326 - class68.field922 - class68.field922) * 64);
                int var7 = var5.field4538 - ((var5.field5320 - class468.field6588 - class468.field6588) * 64);
                if (var6 != 0 || var7 != 0) {
                    var5.method1924((int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 0x3FFF, (byte) 119);
                }
                var5.field5326 = -1;
            }
        }
        return arg0.method1915((byte) -122);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public final void method14(byte arg0) {
        int var2 = 18 % ((arg0 + 61) / 50);
        this.field29 = null;
        this.field36 = null;
        this.field33 = null;
        field24++;
        this.field47 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method15(char arg0, int arg1, String arg2) {
        field43++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg1 != 27251) {
            return 18;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }
}
