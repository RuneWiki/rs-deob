import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class229 {

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3647 = 0;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Lvf;")
    public static class309 field3651;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Lja;")
    public static class64 field3644;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZII)I", line = 8)
    public static final int method1657(boolean arg0, int arg1, int arg2) {
        field3646++;
        int var3 = class84.method606(arg1 - 1, arg2 + -1, 0) + (class84.method606(arg1 + 1, arg2 + -1, 0) + class84.method606(arg1 - 1, arg2 - -1, 0) + class84.method606(arg1 - -1, arg2 + 1, 0));
        if (arg0) {
            field3651 = (class309) null;
        }
        int var4 = class84.method606(arg1 - 1, arg2, 0) + class84.method606(arg1 + 1, arg2, 0) + class84.method606(arg1, arg2 + -1, 0) + class84.method606(arg1, arg2 - -1, 0);
        int var5 = class84.method606(arg1, arg2, 0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1658(byte arg0) {
        field3645++;
        Container var1;
        if (class52.field823 != null) {
            var1 = class52.field823;
        } else if (class81.field1219 == null) {
            var1 = class83.field1235.field5052;
        } else {
            var1 = class81.field1219;
        }
        class64.field1053 = var1.getSize().width;
        class297.field4686 = var1.getSize().height;
        if (class81.field1219 == var1) {
            Insets var2 = class81.field1219.getInsets();
            class297.field4686 -= var2.top + var2.bottom;
            class64.field1053 -= var2.left + var2.right;
        }
        int var3 = -86 / ((-arg0 - 56) / 33);
        if (class242.method1719(0) >= 2) {
            class73.field1127 = class297.field4686;
            class121.field1938 = 0;
            class180.field2880 = class64.field1053;
            class107.field1778 = 0;
        } else {
            class121.field1938 = 0;
            class107.field1778 = (class64.field1053 - 765) / 2;
            class180.field2880 = 765;
            class73.field1127 = 503;
        }
        if (class265.field4126) {
            class265.method1882(class180.field2880, class73.field1127);
        }
        class2.field7.setSize(class180.field2880, class73.field1127);
        if (class81.field1219 == var1) {
            Insets var4 = class81.field1219.getInsets();
            class2.field7.setLocation(class107.field1778 + var4.left, var4.top - -class121.field1938);
        } else {
            class2.field7.setLocation(class107.field1778, class121.field1938);
        }
        if (class122.field1950 != -1) {
            class67.method508(true, 1);
        }
        class136.method1040(8529);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 90)
    public static final String method1659(String arg0, String arg1, String arg2, int arg3) {
        field3650++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = arg0.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        if (arg3 != -20263) {
            field3651 = (class309) null;
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg1.indexOf(arg2, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg1.indexOf(arg2, var12);
            if (var13 < 0) {
                var11.append(arg1.substring(var12));
                return var11.toString();
            }
            var11.append(arg1.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([II[JII)V", line = 150)
    public static final void method1660(int[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            for (int var10 = arg3; var10 < arg1; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method1660(arg0, var6 - 1, arg2, arg3, -119);
            method1660(arg0, arg1, arg2, var6 + 1, -85);
        }
        field3648++;
        if (arg4 > -59) {
            method1659((String) null, (String) null, (String) null, -35);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 205)
    public static void method1661(byte arg0) {
        if (arg0 < 104) {
            field3647 = 71;
        }
        field3644 = null;
        field3651 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I", line = 231)
    public static final int method1662(int arg0) {
        if (arg0 <= 104) {
            field3644 = (class64) null;
        }
        field3649++;
        return class16.field319;
    }
}
