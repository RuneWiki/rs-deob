import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/lang/String;")
    public static String field795 = null;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Llb;")
    public static class211 field786;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Llb;")
    public static class211 field794;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[Lsd;")
    public static class27[] field788;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZBLm;)V", line = 10)
    public static final void method466(boolean arg0, byte arg1, class48 arg2) {
        if (class36.field534 || arg0) {
            int var3 = class210.field3314;
            int var4 = var3 * 956 / 503;
            class235.field3609.method187((class125.field1972 - var4) / 2, 0, var4, var3);
            class87.field1283.method589(class125.field1972 / 2 - class87.field1283.field4579 / 2, 18);
        }
        arg2.method439(class142.field2203, class125.field1972 / 2, class210.field3314 / 2 - 26, 16777215, -1);
        field796++;
        int var5 = class210.field3314 / 2 - 18;
        if (class36.field534) {
            class194.method1406(class125.field1972 / 2 - 152, var5, 304, 34, 9179409);
            class194.method1406(class125.field1972 / 2 - 151, var5 + 1, 302, 32, 0);
            class194.method1413(class125.field1972 / 2 - 150, var5 - -2, class38.field569 * 3, 30, 9179409);
            class194.method1413(class125.field1972 / 2 + class38.field569 * 3 - 150, var5 + 2, 300 - class38.field569 * 3, 30, 0);
        } else {
            class168.method1228(class125.field1972 / 2 - 152, var5, 304, 34, 9179409);
            class168.method1228(class125.field1972 / 2 - 151, var5 + 1, 302, 32, 0);
            class168.method1224(class125.field1972 / 2 - 150, var5 + 2, class38.field569 * 3, 30, 9179409);
            class168.method1224(class125.field1972 / 2 + class38.field569 * 3 - 150, var5 + 2, 300 - (class38.field569 * 3), 30, 0);
        }
        arg2.method439(class69.field1012, class125.field1972 / 2, class210.field3314 / 2 + 4, 16777215, -1);
        if (arg1 != 10) {
            field788 = (class27[]) null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 54)
    public static void method467(int arg0) {
        field795 = null;
        field788 = null;
        field786 = null;
        int var1 = 57 / ((arg0 + 27) / 56);
        field794 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILld;ILqb;IIILfk;)V", line = 68)
    public static final void method468(int arg0, class121 arg1, int arg2, class101 arg3, int arg4, int arg5, int arg6, class45 arg7) {
        field787++;
        class117 var8 = new class117();
        var8.field1843 = arg4 * arg5;
        var8.field1827 = arg6 * 128;
        var8.field1840 = arg2;
        if (arg3 != null) {
            var8.field1835 = arg3.field1561;
            var8.field1847 = arg3.field1564;
            var8.field1820 = arg3.field1504;
            var8.field1826 = arg3;
            var8.field1830 = arg3.field1510 * 128;
            var8.field1837 = arg3.field1559;
            int var10 = arg3.field1524;
            int var11 = arg3.field1533;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg3.field1524;
                var10 = arg3.field1533;
            }
            var8.field1819 = (arg6 + var11) * 128;
            var8.field1844 = (arg4 + var10) * 128;
            if (arg3.field1542 != null) {
                var8.field1825 = true;
                var8.method908(2);
            }
            if (var8.field1835 != null) {
                var8.field1839 = var8.field1820 + ((int) ((double) (var8.field1847 - var8.field1820) * Math.random()));
            }
            class154.field2330.method977(4, var8);
        } else if (arg7 != null) {
            var8.field1828 = arg7;
            class183 var9 = arg7.field698;
            if (var9.field2738 != null) {
                var8.field1825 = true;
                var9 = var9.method1329(123);
            }
            if (var9 != null) {
                var8.field1819 = (var9.field2750 + arg6) * 128;
                var8.field1844 = (arg4 + var9.field2750) * 128;
                var8.field1837 = class104.method806((byte) -122, arg7);
                var8.field1830 = var9.field2746 * 128;
            }
            class200.field3169.method977(4, var8);
        } else if (arg1 != null) {
            var8.field1833 = arg1;
            var8.field1819 = (arg1.method929(12) + arg6) * 128;
            var8.field1844 = (arg1.method929(arg5 ^ 0x8C) + arg4) * 128;
            var8.field1837 = class288.method2029(false, arg1);
            var8.field1830 = arg1.field1898 * 128;
            class17.field192.method208(var8, class224.method1597(true, arg1.field1895), arg5 - 128);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIZ)V", line = 159)
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field792++;
        int var6 = arg3 - arg2;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class49.method457(-29605, arg4, arg2, arg1, arg3);
            }
        } else if (var6 == 0) {
            class113.method890(arg2, arg4, 126, arg0, arg1);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                int var10 = arg0;
                arg0 = arg3;
                arg1 = arg2;
                arg3 = var10;
                arg2 = var9;
            }
            if (arg5) {
                if (arg1 > arg0) {
                    int var11 = arg1;
                    arg1 = arg0;
                    arg0 = var11;
                    int var12 = arg2;
                    arg2 = arg3;
                    arg3 = var12;
                }
                int var13 = arg0 - arg1;
                int var14 = arg2;
                int var15 = arg3 - arg2;
                int var16 = -(var13 >> 1);
                int var17 = arg3 > arg2 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var18 = arg1; var18 <= arg0; var18++) {
                        class320.field4990[var18][var14] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var14 += var17;
                            var16 -= var13;
                        }
                    }
                } else {
                    for (int var19 = arg1; var19 <= arg0; var19++) {
                        class320.field4990[var14][var19] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var14 += var17;
                            var16 -= var13;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([FB)[F", line = 276)
    public static final float[] method470(float[] arg0, byte arg1) {
        field797++;
        if (arg0 == null) {
            return null;
        } else if (arg1 <= 36) {
            return (float[]) null;
        } else {
            float[] var2 = new float[arg0.length];
            class151.method1114(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)I", line = 294)
    public static final int method471(boolean arg0) {
        if (arg0) {
            field789 = 27;
        }
        field793++;
        return ((class213.field3387 ? 1 : 0) << 19) + ((class319.field4971 ? 1 : 0) << 16) + ((class289.field4541 ? 1 : 0) << 15) + ((class175.field2589 ? 1 : 0) << 13) + ((class101.field1512 ? 1 : 0) << 9) + (((class38.field581 ? 1 : 0) << 8) + ((class154.field2327 ? 1 : 0) << 7) + (((class270.field4081 ? 1 : 0) << 3) + (class317.field4926 & 0x7) + ((class69.field1019 ? 1 : 0) << 4) - (-((class11.field127 ? 1 : 0) << 5) + -((class325.field5062 ? 1 : 0) << 6))) - -((class228.field3534 ? 1 : 0) << 10)) - (-(class143.field2212 & 0x3 << 11) + -((class261.field3874 == 0 ? 0 : 1) << 20) + -((class170.field2536 == 0 ? 0 : 1) << 21) - ((class238.field3618 == 0 ? 0 : 1) << 22) + -(class254.method1777() << 23));
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 318)
    public static final void method472(int arg0) {
        field790++;
        if (arg0 != 1) {
            method468(92, (class121) null, -73, (class101) null, 113, 69, 2, (class45) null);
        }
        class16.field182 = new class128();
    }
}
