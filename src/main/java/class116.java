import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class116 extends class231 {

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1795 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1796 = -1;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field1802 = -1;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lwf;")
    public static class306 field1793;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 7)
    public static void method798(int arg0) {
        field1793 = null;
        if (arg0 != 0) {
            method798(-43);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IB)I", line = 17)
    public static final int method799(int arg0, byte arg1) {
        field1794++;
        if (arg1 > -47) {
            return -62;
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)[Lng;", line = 70)
    public static final class245[] method800(int arg0) {
        class245[] var1 = new class245[class246.field3862];
        if (arg0 != -10666) {
            method802(false);
        }
        field1799++;
        for (int var2 = 0; var2 < class246.field3862; var2++) {
            int var3 = class68.field1011[var2] * class107.field1652[var2];
            byte[] var4 = class46.field644[var2];
            if (class219.field3488[var2]) {
                byte[] var7 = class146.field2307[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class276.method1810(class154.field2417[class311.method2135(255, var4[var9])], class311.method2135(255, var7[var9]) << 24);
                }
                if (class333.field5166) {
                    var1[var2] = new class16(field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var8);
                } else {
                    var1[var2] = new class135(field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class154.field2417[class311.method2135(var4[var6], 255)];
                }
                if (class333.field5166) {
                    var1[var2] = new class186(field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var5);
                } else {
                    var1[var2] = new class178(field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var5);
                }
            }
        }
        class345.method2394((byte) -92);
        return var1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(CB)Z", line = 133)
    public static final boolean method801(char arg0, byte arg1) {
        int var2 = 30 / ((65 - arg1) / 51);
        field1801++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V", line = 157)
    public static final void method802(boolean arg0) {
        class69.field1030 = null;
        class68.field1014 = null;
        class339.field5246 = null;
        class221.field3509 = null;
        class81.field1197 = null;
        class179.field2736 = null;
        field1800++;
        class332.field5133 = null;
        class286.field4380 = null;
        class159.field2478 = null;
        if (arg0) {
            return;
        }
        class234.field3765 = null;
        class83.field1252 = null;
        class117.field1803 = null;
        class192.field2904 = null;
        class256.field3998 = null;
        class26.field342 = null;
        class237.field3798 = null;
        class87.field1305 = null;
        class342.field5329 = null;
        class169.field2576 = null;
    }
}
