import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public abstract class class390 {

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
    public abstract void method1340(boolean arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)I")
    public abstract int method1349(int arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z")
    public abstract boolean method1347(byte arg0);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)Z")
    public final boolean method2284(byte arg0) {
        field5227++;
        if (arg0 != -85) {
            this.method1347((byte) -98);
        }
        return this.method1347((byte) -86) || this.method1344(123) || this.method1343(0);
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
    public abstract void method1339(int arg0);

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)Lek;")
    public abstract class471 method1350(int arg0);

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)Z")
    public abstract boolean method1343(int arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[IB[ILkfa;)V")
    public static final void method2285(int[] arg0, int[] arg1, byte arg2, int[] arg3, class557 arg4) {
        field5228++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg4.field2642.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field2642[var9] = null;
                    } else {
                        class282 var10 = class195.field2367.method3273(var6, 0);
                        int var11 = var10.field3828;
                        class153 var12 = arg4.field2642[var9];
                        if (var12 != null) {
                            if (var12.field1891 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field2642[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1894 = 0;
                                    var12.field1886 = 0;
                                    var12.field1892 = 1;
                                    var12.field1889 = var8;
                                    var12.field1885 = 0;
                                    if (!arg4.field2597) {
                                        class563.method3294((byte) 81, var10, arg4, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1885 = 0;
                                }
                            } else if (var10.field3823 >= class195.field2367.method3273(var12.field1891, arg2 + 14).field3823) {
                                var12 = arg4.field2642[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class153 var13 = arg4.field2642[var9] = new class153();
                            var13.field1892 = 1;
                            var13.field1891 = var6;
                            var13.field1889 = var8;
                            var13.field1894 = 0;
                            var13.field1886 = 0;
                            var13.field1885 = 0;
                            if (!arg4.field2597) {
                                class563.method3294((byte) -70, var10, arg4, 0);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg2 == -14) {
            ;
        }
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(I)Z")
    public abstract boolean method1344(int arg0);

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)I")
    public abstract int method1338(int arg0);
}
