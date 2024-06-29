import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class173 extends class65 {

    @OriginalMember(owner = "client!u", name = "r", descriptor = "J")
    public long field2959;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field2953 = -1;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[C")
    public static char[] field2952 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZB)V", line = 3)
    public static final void method1363(boolean arg0, byte arg1) {
        class382.method2404(-126, arg0, class673.field9523, class412.field6066, class660.field9408);
        field2957++;
        if (arg1 < 52) {
            method1364(-40, (byte) -8, 78, 41, -23);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBIII)V", line = 14)
    public static final void method1364(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2954++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class487.method2955(class184.field3102, class657.field9347, (byte) -114, arg3 + arg4);
        int var10 = class487.method2955(class184.field3102, class657.field9347, (byte) -90, arg3 - arg4);
        class608.method3484(class77.field1131[arg2], var10, -7, arg0, var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class76.field1126 <= var12 && class461.field6699 >= var11) {
                    int var13 = class487.method2955(class184.field3102, class657.field9347, (byte) 116, arg3 + var5);
                    int var14 = class487.method2955(class184.field3102, class657.field9347, (byte) 68, arg3 - var5);
                    if (class461.field6699 >= var12) {
                        class608.method3484(class77.field1131[var12], var14, -7, arg0, var13);
                    }
                    if (var11 >= class76.field1126) {
                        class608.method3484(class77.field1131[var11], var14, -7, arg0, var13);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class76.field1126 && class461.field6699 >= var15) {
                int var17 = class487.method2955(class184.field3102, class657.field9347, (byte) -96, arg3 + var6);
                int var18 = class487.method2955(class184.field3102, class657.field9347, (byte) -107, arg3 - var6);
                if (class461.field6699 >= var16) {
                    class608.method3484(class77.field1131[var16], var18, -7, arg0, var17);
                }
                if (class76.field1126 <= var15) {
                    class608.method3484(class77.field1131[var15], var18, -7, arg0, var17);
                }
            }
        }
        if (arg1 < 31) {
            method1366(-1, true, 45);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 93)
    public static void method1365(int arg0) {
        field2952 = null;
        if (arg0 != 339) {
            method1365(47);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)V", line = 105)
    public static final void method1366(int arg0, boolean arg1, int arg2) {
        field2955++;
        class33 var3 = class446.method2724(arg0, 9, arg1);
        if (var3 != null) {
            var3.method636((byte) 97);
            if (arg2 > -9) {
                field2958 = -74;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 131)
    public class173() {
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(J)V", line = 133)
    public class173(long arg0) {
        this.field2959 = arg0;
    }
}
