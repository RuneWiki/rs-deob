import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class98 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
    public static int[] field1371 = new int[13];

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public static int[] field1375 = new int[5];

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Las;III[Z)Z")
    public static final boolean method740(class84 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class364.field5542 != class275.field4396) {
            int var6 = class181.field2961[arg1].method771(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class129 var8 = class181.field2961[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method771(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method782(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method778(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method741(int arg0) {
        field1375 = null;
        if (arg0 == -1) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjd;)V")
    public static final void method742(int arg0, class124 arg1) {
        arg1.field1869 = false;
        field1373++;
        if (arg1.field1851 != -1) {
            class417 var2 = class156.method1099(arg1.field1851, 91);
            if (var2 == null || var2.field6177 == null) {
                arg1.field1851 = -1;
                arg1.field1831 = false;
            } else {
                label304: {
                    arg1.field1876++;
                    if (arg1.field1875 < var2.field6177.length && var2.field6171[arg1.field1875] < arg1.field1876) {
                        arg1.field1883++;
                        arg1.field1876 = 1;
                        arg1.field1875++;
                        class196.method1374(arg1.field722, (byte) -104, arg1.field1875, arg1.field724, class261.field4201 == arg1, var2);
                    }
                    if (var2.field6177.length <= arg1.field1875) {
                        arg1.field1875 = 0;
                        arg1.field1876 = 0;
                        if (arg1.field1831) {
                            arg1.field1851 = arg1.method912(-5).method2286(0);
                            if (arg1.field1851 == -1) {
                                arg1.field1831 = false;
                                break label304;
                            }
                            var2 = class156.method1099(arg1.field1851, 77);
                        }
                        class196.method1374(arg1.field722, (byte) -104, arg1.field1875, arg1.field724, class261.field4201 == arg1, var2);
                    }
                    arg1.field1883 = arg1.field1875 + 1;
                    if (var2.field6177.length <= arg1.field1883) {
                        arg1.field1883 = 0;
                    }
                }
            }
        }
        if (arg1.field1873 != -1 && class183.field2987 >= arg1.field1886) {
            class379 var3 = class115.method839((byte) -57, arg1.field1873);
            int var4 = var3.field5734;
            if (var4 == -1) {
                arg1.field1873 = -1;
            } else {
                label306: {
                    class417 var5 = class156.method1099(var4, 65);
                    if (var3.field5731) {
                        if (var5.field6175 == 3) {
                            if (arg1.field1911 > 0 && class183.field2987 >= arg1.field1840 && class183.field2987 > arg1.field1888) {
                                arg1.field1873 = -1;
                                break label306;
                            }
                        } else if (var5.field6175 == 1 && arg1.field1911 > 0 && arg1.field1840 <= class183.field2987 && class183.field2987 > arg1.field1888) {
                            arg1.field1886 = class183.field2987 + 1;
                            break label306;
                        }
                    }
                    if (var5 == null || var5.field6177 == null) {
                        arg1.field1873 = -1;
                    } else {
                        if (arg1.field1879 < 0) {
                            arg1.field1879 = 0;
                            class196.method1374(arg1.field722, (byte) -104, 0, arg1.field724, class261.field4201 == arg1, var5);
                        }
                        arg1.field1866++;
                        if (var5.field6177.length > arg1.field1879 && arg1.field1866 > var5.field6171[arg1.field1879]) {
                            arg1.field1879++;
                            arg1.field1866 = 1;
                            class196.method1374(arg1.field722, (byte) -104, arg1.field1879, arg1.field724, class261.field4201 == arg1, var5);
                        }
                        if (arg1.field1879 >= var5.field6177.length) {
                            if (var3.field5731) {
                                arg1.field1879 -= var5.field6162;
                                arg1.field1862++;
                                if (arg1.field1862 >= var5.field6159) {
                                    arg1.field1873 = -1;
                                } else if (arg1.field1879 >= 0 && var5.field6177.length > arg1.field1879) {
                                    class196.method1374(arg1.field722, (byte) -104, arg1.field1879, arg1.field724, class261.field4201 == arg1, var5);
                                } else {
                                    arg1.field1873 = -1;
                                }
                            } else {
                                arg1.field1873 = -1;
                            }
                        }
                        arg1.field1867 = arg1.field1879 + 1;
                        if (arg1.field1867 >= var5.field6177.length) {
                            if (var3.field5731) {
                                arg1.field1867 -= var5.field6162;
                                if (var5.field6159 <= (arg1.field1862 + 1)) {
                                    arg1.field1867 = -1;
                                } else if (arg1.field1867 < 0 || var5.field6177.length <= arg1.field1867) {
                                    arg1.field1867 = -1;
                                }
                            } else {
                                arg1.field1867 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 10) {
            field1375 = null;
        }
        if (arg1.field1878 != -1 && arg1.field1880 <= 1) {
            class417 var6 = class156.method1099(arg1.field1878, 110);
            if (var6.field6175 == 3) {
                if (arg1.field1911 > 0 && arg1.field1840 <= class183.field2987 && arg1.field1888 < class183.field2987) {
                    arg1.field1878 = -1;
                }
            } else if (var6.field6175 == 1 && arg1.field1911 > 0 && arg1.field1840 <= class183.field2987 && arg1.field1888 < class183.field2987) {
                arg1.field1880 = 2;
            }
        }
        if (arg1.field1878 != -1 && arg1.field1880 == 0) {
            class417 var7 = class156.method1099(arg1.field1878, 123);
            if (var7 == null || var7.field6177 == null) {
                arg1.field1878 = -1;
            } else {
                arg1.field1885++;
                if (arg1.field1845 < var7.field6177.length && var7.field6171[arg1.field1845] < arg1.field1885) {
                    arg1.field1885 = 1;
                    arg1.field1845++;
                    class196.method1374(arg1.field722, (byte) -104, arg1.field1845, arg1.field724, class261.field4201 == arg1, var7);
                }
                if (var7.field6177.length <= arg1.field1845) {
                    arg1.field1858++;
                    arg1.field1845 -= var7.field6162;
                    if (arg1.field1858 >= var7.field6159) {
                        arg1.field1878 = -1;
                    } else if (arg1.field1845 >= 0 && arg1.field1845 < var7.field6177.length) {
                        class196.method1374(arg1.field722, (byte) -104, arg1.field1845, arg1.field724, class261.field4201 == arg1, var7);
                    } else {
                        arg1.field1878 = -1;
                    }
                }
                arg1.field1893 = arg1.field1845 + 1;
                if (var7.field6177.length <= arg1.field1893) {
                    arg1.field1893 -= var7.field6162;
                    if (var7.field6159 <= arg1.field1858 + 1) {
                        arg1.field1893 = -1;
                    } else if (arg1.field1893 < 0 || var7.field6177.length <= arg1.field1893) {
                        arg1.field1893 = -1;
                    }
                }
                arg1.field1869 = var7.field6167;
            }
        }
        if (arg1.field1880 > 0) {
            arg1.field1880--;
        }
        for (int var8 = 0; var8 < arg1.field1835.length; var8++) {
            class318 var9 = arg1.field1835[var8];
            if (var9 != null) {
                if (var9.field4973 > 0) {
                    var9.field4973--;
                } else {
                    class417 var10 = class156.method1099(var9.field4982, 91);
                    if (var10 == null || var10.field6177 == null) {
                        arg1.field1835[var8] = null;
                    } else {
                        var9.field4977++;
                        if (var10.field6177.length > var9.field4976 && var9.field4977 > var10.field6171[var9.field4976]) {
                            var9.field4976++;
                            var9.field4977 = 1;
                            class196.method1374(arg1.field722, (byte) -104, var9.field4976, arg1.field724, class261.field4201 == arg1, var10);
                        }
                        if (var9.field4976 >= var10.field6177.length) {
                            var9.field4980++;
                            var9.field4976 -= var10.field6162;
                            if (var9.field4980 >= var10.field6159) {
                                arg1.field1835[var8] = null;
                            } else if (var9.field4976 >= 0 && var10.field6177.length > var9.field4976) {
                                class196.method1374(arg1.field722, (byte) -104, var9.field4976, arg1.field724, class261.field4201 == arg1, var10);
                            } else {
                                arg1.field1835[var8] = null;
                            }
                        }
                        var9.field4981 = var9.field4976 + 1;
                        if (var10.field6177.length <= var9.field4981) {
                            var9.field4981 -= var10.field6162;
                            if (var10.field6159 <= (var9.field4980 + 1)) {
                                var9.field4981 = -1;
                            } else if (var9.field4981 < 0 || var10.field6177.length <= var9.field4981) {
                                var9.field4981 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
