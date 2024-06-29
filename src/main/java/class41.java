import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class40 {

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "Lwd;")
    public class157 field958 = new class157();

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lqe;")
    public class116 field970 = new class116();

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Lc;")
    private class15 field962;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Lec;")
    private static class32 field954 = class73.method594("Use", true);

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Lec;")
    public static class32 field955 = class73.method594(" (X", true);

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "[I")
    public static int[] field956 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "Lec;")
    public static class32 field968 = class73.method594("Willkommen auf RuneScape", true);

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Lec;")
    public static class32 field966 = field954;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Lec;")
    private static class32 field972 = class73.method594(" has logged in)3", true);

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Lec;")
    public static class32 field964 = field972;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Lea;")
    public static class30 field963;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "Lea;")
    public static class30 field971;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "[Lhb;")
    public static class51[] field959;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "[S")
    public static short[] field951;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lfd;")
    public final class40 method113() {
        field961++;
        class77 var1;
        do {
            var1 = (class77) this.field958.method1211(-3);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1789 == null);
        return var1.field1789;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILla;)V")
    private final void method323(int arg0, int arg1, class77 arg2) {
        field969++;
        if ((this.field962.field297[arg2.field1819] & 0x4) != arg1 && arg2.field1820 < 0) {
            int var4 = this.field962.field310[arg2.field1819] / class139.field3213;
            int var5 = (var4 + 1048575 - arg2.field1801) / var4;
            arg2.field1801 = arg2.field1801 + arg0 * var4 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field962.field287[arg2.field1819] == 0) {
                    arg2.field1789 = class90.method683(arg2.field1812, arg2.field1789.method694(), arg2.field1789.method703(), arg2.field1789.method699());
                } else {
                    arg2.field1789 = class90.method683(arg2.field1812, arg2.field1789.method694(), 0, arg2.field1789.method699());
                    this.field962.method92(1, arg2.field1805.field1723[arg2.field1804] < 0, arg2);
                }
                if (arg2.field1805.field1723[arg2.field1804] < 0) {
                    arg2.field1789.method686(-1);
                }
                arg0 = arg2.field1801 / var4;
            }
        }
        arg2.field1789.method104(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([III)V")
    public final void method116(int[] arg0, int arg1, int arg2) {
        field950++;
        this.field970.method116(arg0, arg1, arg2);
        for (class77 var4 = (class77) this.field958.method1213(115); var4 != null; var4 = (class77) this.field958.method1211(-3)) {
            if (!this.field962.method114(-31299, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1792) {
                        this.method328(var4, arg0, var5, -1, var5 + var6, var6);
                        var4.field1792 -= var6;
                        break;
                    }
                    this.method328(var4, arg0, var5, -1, var5 + var6, var4.field1792);
                    var5 += var4.field1792;
                    var6 -= var4.field1792;
                } while (!this.field962.method108(var4, false, var5, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static final void method324(int arg0) {
        field952++;
        class61.field1353 = 0;
        class102.field2393 = 0;
        class94.method748(3);
        class142.method1077(true);
        class32.method242((byte) -108);
        for (int var1 = 0; var1 < class102.field2393; var1++) {
            int var3 = class27.field495[var1];
            if (class140.field3219 != class14.field230[var3].field2715) {
                class14.field230[var3].field2597 = null;
                class14.field230[var3] = null;
            }
        }
        if (class115.field2702 != class158.field3614.field1569) {
            throw new RuntimeException("gnp1 pos:" + class158.field3614.field1569 + " psize:" + class115.field2702);
        } else if (arg0 == -3072) {
            for (int var2 = 0; var2 < class102.field2399; var2++) {
                if (class14.field230[class15.field313[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class102.field2399);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static final void method325(boolean arg0) {
        if (arg0) {
            field965++;
            if (class4.field81 != null) {
                class4.field81.method52(106);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()Lfd;")
    public final class40 method106() {
        field957++;
        class77 var1 = (class77) this.field958.method1213(95);
        if (var1 == null) {
            return null;
        } else if (var1.field1789 == null) {
            return this.method113();
        } else {
            return var1.field1789;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I")
    public static int method326(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()I")
    public final int method87() {
        field949++;
        return 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method327(byte arg0) {
        field971 = null;
        field959 = null;
        if (arg0 <= 104) {
            return;
        }
        field963 = null;
        field966 = null;
        field951 = null;
        field956 = null;
        field972 = null;
        field968 = null;
        field955 = null;
        field964 = null;
        field954 = null;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public final void method104(int arg0) {
        this.field970.method104(arg0);
        field953++;
        for (class77 var2 = (class77) this.field958.method1213(112); var2 != null; var2 = (class77) this.field958.method1211(-3)) {
            if (!this.field962.method114(-31299, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1792 >= var3) {
                        this.method323(var3, 0, var2);
                        var2.field1792 -= var3;
                        break;
                    }
                    this.method323(var2.field1792, 0, var2);
                    var3 -= var2.field1792;
                } while (!this.field962.method108(var2, false, 0, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lla;[IIIII)V")
    private final void method328(class77 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field960++;
        if (~(this.field962.field297[arg0.field1819] & 0x4) != arg3 && arg0.field1820 < 0) {
            int var7 = this.field962.field310[arg0.field1819] / class139.field3213;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1801) / var7;
                if (var8 > arg5) {
                    arg0.field1801 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                int var9 = 262144 / var7;
                arg0.field1789.method116(arg1, arg2, var8);
                arg0.field1801 += var7 * var8 - 1048576;
                arg2 += var8;
                class90 var10 = arg0.field1789;
                int var11 = class139.field3213 / 100;
                if (var9 < var11) {
                    var11 = var9;
                }
                if (this.field962.field287[arg0.field1819] == 0) {
                    arg0.field1789 = class90.method683(arg0.field1812, var10.method694(), var10.method703(), var10.method699());
                } else {
                    arg0.field1789 = class90.method683(arg0.field1812, var10.method694(), 0, var10.method699());
                    this.field962.method92(1, arg0.field1805.field1723[arg0.field1804] < 0, arg0);
                    arg0.field1789.method680(var11, var10.method703());
                }
                if (arg0.field1805.field1723[arg0.field1804] < 0) {
                    arg0.field1789.method686(-1);
                }
                var10.method684(var11);
                var10.method116(arg1, arg2, arg4 - arg2);
                if (var10.method718()) {
                    this.field970.method914(var10);
                }
            }
        }
        arg0.field1789.method116(arg1, arg2, arg5);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lc;)V")
    public class41(class15 arg0) {
        this.field962 = arg0;
    }
}
