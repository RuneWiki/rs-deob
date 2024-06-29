import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class24 {

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Z")
    public boolean field275 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/lang/String;")
    public static String field274 = "Loading...";

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "J")
    public long field267;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lvc;")
    public class260 field269;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILqc;)V", line = 12)
    public static final void method160(int arg0, class331 arg1) {
        field270++;
        arg1.field4894 = false;
        if (arg1.field4897 != -1) {
            class314 var2 = class207.method1516(arg1.field4897, 124);
            if (var2 == null || var2.field4631 == null) {
                arg1.field4897 = -1;
            } else {
                arg1.field4890++;
                if (arg1.field4942 < var2.field4631.length && var2.field4627[arg1.field4942] < arg1.field4890) {
                    arg1.field4914++;
                    arg1.field4890 = 1;
                    arg1.field4942++;
                    class296.method2025(var2, arg1.field4893, arg1.field4855, arg1.field4942, class359.field5616 == arg1, false);
                }
                if (arg1.field4942 >= var2.field4631.length) {
                    arg1.field4890 = 0;
                    arg1.field4942 = 0;
                    class296.method2025(var2, arg1.field4893, arg1.field4855, arg1.field4942, class359.field5616 == arg1, false);
                }
                arg1.field4914 = arg1.field4942 + 1;
                if (arg1.field4914 >= var2.field4631.length) {
                    arg1.field4914 = 0;
                }
            }
        }
        if (arg1.field4839 != -1 && class313.field4603 >= arg1.field4868) {
            class15 var3 = class234.method1664(arg0 + 25303, arg1.field4839);
            int var4 = var3.field169;
            if (var4 == -1) {
                arg1.field4839 = -1;
            } else {
                label311: {
                    class314 var5 = class207.method1516(var4, 120);
                    if (var3.field181) {
                        if (var5.field4632 == 3) {
                            if (arg1.field4925 > 0 && arg1.field4929 <= class313.field4603 && class313.field4603 > arg1.field4846) {
                                arg1.field4839 = -1;
                                break label311;
                            }
                        } else if (var5.field4632 == 1 && arg1.field4925 > 0 && arg1.field4929 <= class313.field4603 && arg1.field4846 < class313.field4603) {
                            arg1.field4868 = class313.field4603 + 1;
                            break label311;
                        }
                    }
                    if (var5 == null || var5.field4631 == null) {
                        arg1.field4839 = -1;
                    } else {
                        if (arg1.field4921 < 0) {
                            arg1.field4921 = 0;
                            class296.method2025(var5, arg1.field4893, arg1.field4855, 0, class359.field5616 == arg1, false);
                        }
                        arg1.field4848++;
                        if (var5.field4631.length > arg1.field4921 && var5.field4627[arg1.field4921] < arg1.field4848) {
                            arg1.field4848 = 1;
                            arg1.field4921++;
                            class296.method2025(var5, arg1.field4893, arg1.field4855, arg1.field4921, class359.field5616 == arg1, false);
                        }
                        if (arg1.field4921 >= var5.field4631.length) {
                            if (var3.field181) {
                                arg1.field4874++;
                                arg1.field4921 -= var5.field4636;
                                if (var5.field4628 <= arg1.field4874) {
                                    arg1.field4839 = -1;
                                } else if (arg1.field4921 >= 0 && var5.field4631.length > arg1.field4921) {
                                    class296.method2025(var5, arg1.field4893, arg1.field4855, arg1.field4921, class359.field5616 == arg1, false);
                                } else {
                                    arg1.field4839 = -1;
                                }
                            } else {
                                arg1.field4839 = -1;
                            }
                        }
                        arg1.field4857 = arg1.field4921 + 1;
                        if (arg1.field4857 >= var5.field4631.length) {
                            if (var3.field181) {
                                arg1.field4857 -= var5.field4636;
                                if (var5.field4628 <= arg1.field4874 + 1) {
                                    arg1.field4857 = -1;
                                } else if (arg1.field4857 < 0 || arg1.field4857 >= var5.field4631.length) {
                                    arg1.field4857 = -1;
                                }
                            } else {
                                arg1.field4857 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4899 != -1 && arg1.field4885 <= 1) {
            class314 var6 = class207.method1516(arg1.field4899, 123);
            if (var6.field4632 == 3) {
                if (arg1.field4925 > 0 && class313.field4603 >= arg1.field4929 && arg1.field4846 < class313.field4603) {
                    arg1.field4899 = -1;
                }
            } else if (var6.field4632 == 1 && arg1.field4925 > 0 && class313.field4603 >= arg1.field4929 && class313.field4603 > arg1.field4846) {
                arg1.field4885 = 2;
            }
        }
        if (arg1.field4899 != -1 && arg1.field4885 == 0) {
            class314 var7 = class207.method1516(arg1.field4899, 127);
            if (var7 == null || var7.field4631 == null) {
                arg1.field4899 = -1;
            } else {
                arg1.field4940++;
                if (var7.field4631.length > arg1.field4850 && arg1.field4940 > var7.field4627[arg1.field4850]) {
                    arg1.field4850++;
                    arg1.field4940 = 1;
                    class296.method2025(var7, arg1.field4893, arg1.field4855, arg1.field4850, class359.field5616 == arg1, false);
                }
                if (arg1.field4850 >= var7.field4631.length) {
                    arg1.field4891++;
                    arg1.field4850 -= var7.field4636;
                    if (var7.field4628 <= arg1.field4891) {
                        arg1.field4899 = -1;
                    } else if (arg1.field4850 >= 0 && arg1.field4850 < var7.field4631.length) {
                        class296.method2025(var7, arg1.field4893, arg1.field4855, arg1.field4850, class359.field5616 == arg1, false);
                    } else {
                        arg1.field4899 = -1;
                    }
                }
                arg1.field4906 = arg1.field4850 + 1;
                if (arg1.field4906 >= var7.field4631.length) {
                    arg1.field4906 -= var7.field4636;
                    if ((arg1.field4891 + 1) >= var7.field4628) {
                        arg1.field4906 = -1;
                    } else if (arg1.field4906 < 0 || arg1.field4906 >= var7.field4631.length) {
                        arg1.field4906 = -1;
                    }
                }
                arg1.field4894 = var7.field4633;
            }
        }
        if (arg1.field4885 > 0) {
            arg1.field4885--;
        }
        if (arg0 != -25431) {
            method162(99);
        }
        for (int var8 = 0; var8 < arg1.field4859.length; var8++) {
            class274 var9 = arg1.field4859[var8];
            if (var9 != null) {
                if (var9.field3925 > 0) {
                    var9.field3925--;
                } else {
                    class314 var10 = class207.method1516(var9.field3920, 123);
                    if (var10 == null || var10.field4631 == null) {
                        arg1.field4859[var8] = null;
                    } else {
                        var9.field3924++;
                        if (var10.field4631.length > var9.field3927 && var10.field4627[var9.field3927] < var9.field3924) {
                            var9.field3924 = 1;
                            var9.field3927++;
                            class296.method2025(var10, arg1.field4893, arg1.field4855, var9.field3927, class359.field5616 == arg1, false);
                        }
                        if (var9.field3927 >= var10.field4631.length) {
                            var9.field3927 -= var10.field4636;
                            var9.field3931++;
                            if (var10.field4628 <= var9.field3931) {
                                arg1.field4859[var8] = null;
                            } else if (var9.field3927 >= 0 && var10.field4631.length > var9.field3927) {
                                class296.method2025(var10, arg1.field4893, arg1.field4855, var9.field3927, class359.field5616 == arg1, false);
                            } else {
                                arg1.field4859[var8] = null;
                            }
                        }
                        var9.field3929 = var9.field3927 + 1;
                        if (var10.field4631.length <= var9.field3929) {
                            var9.field3929 -= var10.field4636;
                            if ((var9.field3931 + 1) >= var10.field4628) {
                                var9.field3929 = -1;
                            } else if (var9.field3929 < 0 || var9.field3929 >= var10.field4631.length) {
                                var9.field3929 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 313)
    public static void method161(int arg0) {
        field274 = null;
        if (arg0 != 30900) {
            method162(-10);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 323)
    public static final void method162(int arg0) {
        if (arg0 != -14865) {
            method161(-76);
        }
        class17.field205.method2258((byte) 86);
        field268++;
        class122.field1597.method2258((byte) 86);
    }
}
