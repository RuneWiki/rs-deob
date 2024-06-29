import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class433 extends class383 {

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field6136 = 0;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "Z")
    public static boolean field6147 = false;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "Z")
    public static boolean field6156 = true;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Z")
    public static boolean field6152 = false;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lfh;")
    public static class463 field6135 = new class463(new byte[5000]);

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Z")
    public static boolean field6158 = false;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public int field6130;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public int field6140;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field6145;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public int field6157;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lho;")
    public class102 field6151;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Lrd;")
    public class223 field6154;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lwg;")
    public class295 field6139;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Lsi;")
    public class393 field6148;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "Lsi;")
    public class393 field6150;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Z")
    public boolean field6131;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "[I")
    public static int[] field6138;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "[I")
    public int[] field6142;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 6)
    public static void method2535(byte arg0) {
        field6138 = null;
        field6135 = null;
        if (arg0 != -31) {
            method2538(null, 33);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BC)Z", line = 27)
    public static final boolean method2536(byte arg0, char arg1) {
        field6153++;
        if (arg0 != -56) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6132++;
        int var8 = arg1 + 1;
        class184.method1160(class387.field5088[arg1], arg5 ^ 0xFFFFFFF5, arg4, arg3, arg0);
        int var9 = arg2 - 1;
        class184.method1160(class387.field5088[arg2], -7, arg4, arg3, arg0);
        int var6 = var8;
        if (arg5 != 12) {
            field6158 = false;
        }
        while (var6 <= var9) {
            int[] var7 = class387.field5088[var6];
            var7[arg0] = var7[arg3] = arg4;
            var6++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ll;I)V", line = 90)
    public static final void method2538(class16[] arg0, int arg1) {
        class191.field2481 = arg0.length;
        field6133++;
        class101.field1219 = new class16[class191.field2481 + arg1];
        class347.field4459 = new int[class191.field2481 + 10];
        class318.method1871(arg0, 0, class101.field1219, 0, class191.field2481);
        for (int var2 = 0; var2 < class191.field2481; var2++) {
            class347.field4459[var2] = class101.field1219[var2].method131();
        }
        for (int var3 = class191.field2481; var3 < class101.field1219.length; var3++) {
            class347.field4459[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 120)
    public final void method2539(byte arg0) {
        field6134++;
        if (arg0 != 35) {
            method2538(null, 5);
        }
        int var2 = this.field6140;
        if (this.field6151 != null) {
            class102 var5 = this.field6151.method761(arg0 + 67, class491.field7160);
            if (var5 == null) {
                this.field6146 = 0;
                this.field6137 = 0;
                this.field6142 = null;
                this.field6140 = -1;
                this.field6143 = 0;
                this.field6149 = 0;
            } else {
                this.field6149 = var5.field1264;
                this.field6137 = var5.field1314;
                this.field6140 = var5.field1293;
                this.field6142 = var5.field1232;
                this.field6143 = var5.field1268 << 7;
                this.field6146 = var5.field1236;
            }
        } else if (this.field6139 != null) {
            int var3 = class19.method170(false, this.field6139);
            if (var2 != var3) {
                this.field6140 = var3;
                class477 var4 = this.field6139.field3773;
                if (var4.field6922 != null) {
                    var4 = var4.method2903(arg0 ^ 0xFFFFFFDC, class491.field7160);
                }
                if (var4 == null) {
                    this.field6137 = this.field6143 = 0;
                } else {
                    this.field6137 = var4.field6925;
                    this.field6143 = var4.field6971 << 7;
                }
            }
        } else if (this.field6154 != null) {
            this.field6140 = class153.method1005(this.field6154, arg0 + 86);
            this.field6137 = this.field6154.field2821;
            this.field6143 = this.field6154.field2837 << 7;
        }
        if (this.field6140 != var2 && this.field6148 != null) {
            class113.field1506.method2532(this.field6148);
            this.field6148 = null;
        }
    }
}
