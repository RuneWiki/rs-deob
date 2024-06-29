import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class14 extends class1 {

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Ljo;")
    public class150 field182 = new class150();

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "Lqd;")
    public class208 field191 = new class208();

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "Llm;")
    private class230 field189;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLja;I)V", line = 11)
    private final void method101(byte arg0, class124 arg1, int arg2) {
        if ((this.field189.field3631[arg1.field1837] & 0x4) != 0 && arg1.field1838 < 0) {
            int var4 = this.field189.field3642[arg1.field1837] / class322.field5294;
            int var5 = (var4 + 1048575 - arg1.field1842) / var4;
            arg1.field1842 = arg2 * var4 + arg1.field1842 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field189.field3632[arg1.field1837] == 0) {
                    arg1.field1847 = class237.method1646(arg1.field1832, arg1.field1847.method1663(), arg1.field1847.method1651(), arg1.field1847.method1630());
                } else {
                    arg1.field1847 = class237.method1646(arg1.field1832, arg1.field1847.method1663(), 0, arg1.field1847.method1630());
                    this.field189.method1567(arg1.field1858.field3031[arg1.field1854] < 0, arg1, (byte) -84);
                }
                if (arg1.field1858.field3031[arg1.field1854] < 0) {
                    arg1.field1847.method1640(-1);
                }
                arg2 = arg1.field1842 / var4;
            }
        }
        arg1.field1847.method5(arg2);
        if (arg0 == 70) {
            field181++;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()Lro;", line = 51)
    public final class1 method3() {
        field179++;
        class124 var1 = (class124) this.field182.method1081(-123);
        if (var1 == null) {
            return null;
        } else if (var1.field1847 == null) {
            return this.method1();
        } else {
            return var1.field1847;
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V", line = 72)
    public final void method5(int arg0) {
        this.field191.method5(arg0);
        field190++;
        for (class124 var2 = (class124) this.field182.method1081(-107); var2 != null; var2 = (class124) this.field182.method1083((byte) 113)) {
            if (!this.field189.method1576((byte) 58, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1839) {
                        this.method101((byte) 70, var2, var3);
                        var2.field1839 -= var3;
                        break;
                    }
                    this.method101((byte) 70, var2, var2.field1839);
                    var3 -= var2.field1839;
                } while (!this.field189.method1571(-1, (int[]) null, 0, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII[ILja;)V", line = 110)
    private final void method102(int arg0, int arg1, int arg2, int arg3, int[] arg4, class124 arg5) {
        field180++;
        if (~(this.field189.field3631[arg5.field1837] & 0x4) != arg3 && arg5.field1838 < 0) {
            int var7 = this.field189.field3642[arg5.field1837] / class322.field5294;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field1842) / var7;
                if (arg0 < var8) {
                    arg5.field1842 += arg0 * var7;
                    break;
                }
                arg5.field1847.method4(arg4, arg2, var8);
                int var9 = class322.field5294 / 100;
                arg0 -= var8;
                arg5.field1842 += var7 * var8 - 1048576;
                arg2 += var8;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class237 var11 = arg5.field1847;
                if (this.field189.field3632[arg5.field1837] == 0) {
                    arg5.field1847 = class237.method1646(arg5.field1832, var11.method1663(), var11.method1651(), var11.method1630());
                } else {
                    arg5.field1847 = class237.method1646(arg5.field1832, var11.method1663(), 0, var11.method1630());
                    this.field189.method1567(arg5.field1858.field3031[arg5.field1854] < 0, arg5, (byte) -84);
                    arg5.field1847.method1657(var9, var11.method1651());
                }
                if (arg5.field1858.field3031[arg5.field1854] < 0) {
                    arg5.field1847.method1640(-1);
                }
                var11.method1638(var9);
                var11.method4(arg4, arg2, arg1 - arg2);
                if (var11.method1634()) {
                    this.field191.method1414(var11);
                }
            }
        }
        arg5.field1847.method4(arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 171)
    public static final String method103(String arg0, byte arg1) {
        int var2 = -80 / ((47 - arg1) / 56);
        field183++;
        String var3 = class267.method1884(-65537, class265.method1872(arg0, 78));
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()Lro;", line = 185)
    public final class1 method1() {
        field188++;
        class124 var1;
        do {
            var1 = (class124) this.field182.method1083((byte) 113);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1847 == null);
        return var1.field1847;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()I", line = 205)
    public final int method7() {
        field186++;
        return 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([III)V", line = 217)
    public final void method4(int[] arg0, int arg1, int arg2) {
        this.field191.method4(arg0, arg1, arg2);
        field185++;
        for (class124 var4 = (class124) this.field182.method1081(123); var4 != null; var4 = (class124) this.field182.method1083((byte) 113)) {
            if (!this.field189.method1576((byte) -86, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1839 >= var6) {
                        this.method102(var6, var5 + var6, var5, -1, arg0, var4);
                        var4.field1839 -= var6;
                        break;
                    }
                    this.method102(var4.field1839, var5 + var6, var5, -1, arg0, var4);
                    var6 -= var4.field1839;
                    var5 += var4.field1839;
                } while (!this.field189.method1571(-1, arg0, var5, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([FZ)[F", line = 255)
    public static final float[] method104(float[] arg0, boolean arg1) {
        field187++;
        if (arg0 == null) {
            return null;
        }
        float[] var2 = new float[arg0.length];
        if (!arg1) {
            method104((float[]) null, true);
        }
        class298.method2107(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Llm;)V", line = 281)
    public class14(class230 arg0) {
        this.field189 = arg0;
    }
}
