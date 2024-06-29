import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class166 extends class70 {

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[B")
    public byte[] field2779;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2782 = "Loaded title screen";

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Z")
    public static boolean field2784 = true;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 5)
    public static final void method1183(byte arg0) {
        class148 var1 = class181.field3149;
        synchronized (class181.field3149) {
            int var2 = 20 / ((48 - arg0) / 53);
            class356.field5677 = class100.field1832;
            class235.field3855++;
            if (class173.field2880 >= 0) {
                while (class220.field3644 != class173.field2880) {
                    int var3 = class112.field2042[class220.field3644];
                    class220.field3644 = class220.field3644 + 1 & 0x7F;
                    if (var3 < 0) {
                        class261.field4307[~var3] = false;
                    } else {
                        class261.field4307[var3] = true;
                    }
                }
            } else {
                for (int var4 = 0; var4 < 112; var4++) {
                    class261.field4307[var4] = false;
                }
                class173.field2880 = class220.field3644;
            }
            class100.field1832 = class200.field3360;
        }
        field2786++;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 46)
    public static void method1184(int arg0) {
        field2782 = null;
        int var1 = 11 / ((arg0 + 16) / 50);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([B)V", line = 54)
    public class166(byte[] arg0) {
        this.field2779 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIB)I", line = 66)
    public static final int method1185(int arg0, int arg1, int arg2, byte arg3) {
        field2785++;
        int var4 = arg1 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg0 / arg2;
        int var7 = arg2 - 1 & arg1;
        int var8 = class101.method763(var4, var6, (byte) 106);
        int var9 = class101.method763(var4 + 1, var6, (byte) 67);
        int var10 = class101.method763(var4, var6 + 1, (byte) 48);
        int var11 = 91 % ((-arg3 - 46) / 51);
        int var12 = class101.method763(var4 + 1, var6 + 1, (byte) 119);
        int var13 = class209.method1443(arg2, var7, -3685, var8, var9);
        int var14 = class209.method1443(arg2, var7, -3685, var10, var12);
        return class209.method1443(arg2, var5, -3685, var13, var14);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZIIIIIIII)V", line = 100)
    public static final void method1186(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2783++;
        if (arg8 != 13949) {
            field2782 = (String) null;
        }
        if (class96.field1750.method49((byte) -67) == 2) {
            class71.method539(arg2, arg3, arg1, arg7, arg4, arg0, arg9, arg5, 102, arg10, arg6);
        } else if (class96.field1750.method49((byte) -94) <= 2) {
            class34.method246(arg9, arg4, arg1, arg6, 27, arg2, arg7, arg5, arg3, arg0, arg10);
        } else {
            class252.method1781(arg5, true, arg7, arg9, arg10, arg0, arg1, arg4, arg3, arg2, arg6, class96.field1750.method49((byte) 66));
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)[Lsc;", line = 123)
    public static final class288[] method1187(int arg0) {
        class288[] var1 = new class288[class238.field3972];
        field2781++;
        for (int var2 = arg0; var2 < class238.field3972; var2++) {
            int var3 = class9.field284[var2] * class76.field1367[var2];
            byte[] var4 = class309.field5053[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class323.field5225[class83.method613(255, var4[var6])];
            }
            var1[var2] = new class288(class91.field1617, class12.field368, class321.field5218[var2], class232.field3804[var2], class9.field284[var2], class76.field1367[var2], var5);
        }
        class213.method1470(false);
        return var1;
    }
}
