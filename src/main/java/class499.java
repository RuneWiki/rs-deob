import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public abstract class class499 {

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public int field6739;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public int field6738;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public int field6741;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public static int field6742 = 1;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
    public abstract void method1376(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BIIZ)Ljava/lang/String;")
    public static final String method2807(byte arg0, int arg1, int arg2, boolean arg3) {
        field6737++;
        if (arg0 != -120) {
            method2807((byte) -3, -20, -93, true);
        }
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            int var5 = arg2 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - (arg1 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[[BLm;)V")
    public static final void method2808(int arg0, byte[][] arg1, class110 arg2) {
        int var3 = 122 % ((-arg0 - 30) / 45);
        field6740++;
        for (int var4 = 0; var4 < arg2.field7066; var4++) {
            class155.method1031(-84);
            for (int var5 = 0; var5 < class588.field8082 >> 3; var5++) {
                for (int var6 = 0; var6 < class12.field113 >> 3; var6++) {
                    int var7 = class185.field2273[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field7070 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFC8DB) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class339.field4957.length; var13++) {
                                if (class339.field4957[var13] == var12 && arg1[var13] != null) {
                                    arg2.method590(var9, var8, var6 * 8, (var11 & 0x7) * 8, (var10 & 0x7) * 8, var5 * 8, var4, arg1[var13], -1, class9.field103, class624.field8489);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBI)V")
    public abstract void method1380(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(III)V")
    public abstract void method1374(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(III)V")
    public class499(int arg0, int arg1, int arg2) {
        this.field6739 = arg1;
        this.field6738 = arg0;
        this.field6741 = arg2;
    }
}
