import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class107 extends class177 {

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lbe;")
    public static class283 field1827 = class153.method941(126, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "[I")
    public static int[] field1819 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "Ltf;")
    public static class242 field1824 = new class242(30);

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "Lik;")
    public static class244 field1831;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIBI)V", line = 10)
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1815++;
        if (arg7 >= 0 && arg2 >= 0 && arg7 < 103 && arg2 < 103) {
            if (arg5 == 0) {
                class197 var8 = class163.method990(arg4, arg7, arg2);
                if (var8 != null) {
                    int var9 = (int) (var8.field3362 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 2) {
                        var8.field3375 = new class163(var9, 2, arg0 + 4, arg4, arg7, arg2, arg1, false, var8.field3375);
                        var8.field3376 = new class163(var9, 2, arg0 + 1 & 0x3, arg4, arg7, arg2, arg1, false, var8.field3376);
                    } else {
                        var8.field3375 = new class163(var9, arg3, arg0, arg4, arg7, arg2, arg1, false, var8.field3375);
                    }
                }
            }
            if (arg5 == 1) {
                class291 var10 = class257.method1737(arg4, arg7, arg2);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field4931 >>> 32);
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field4943 = new class163(var11, 4, arg0, arg4, arg7, arg2, arg1, false, var10.field4943);
                    } else if (arg3 == 6) {
                        var10.field4943 = new class163(var11, 4, arg0 + 4, arg4, arg7, arg2, arg1, false, var10.field4943);
                    } else if (arg3 == 7) {
                        var10.field4943 = new class163(var11, 4, (arg0 + 2 & 0x3) + 4, arg4, arg7, arg2, arg1, false, var10.field4943);
                    } else if (arg3 == 8) {
                        var10.field4943 = new class163(var11, 4, arg0 + 4, arg4, arg7, arg2, arg1, false, var10.field4943);
                        var10.field4941 = new class163(var11, 4, (arg0 + 2 & 0x3) + 4, arg4, arg7, arg2, arg1, false, var10.field4941);
                    }
                }
            }
            if (arg5 == 2) {
                class26 var12 = class58.method373(arg4, arg7, arg2);
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (var12 != null) {
                    var12.field381 = new class163((int) (var12.field379 >>> 32) & Integer.MAX_VALUE, arg3, arg0, arg4, arg7, arg2, arg1, false, var12.field381);
                }
            }
            if (arg5 == 3) {
                class110 var13 = class240.method1616(arg4, arg7, arg2);
                if (var13 != null) {
                    var13.field1855 = new class163((int) (var13.field1859 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg4, arg7, arg2, arg1, false, var13.field1855);
                }
            }
        }
        if (arg6 >= -53) {
            method717((byte) -120, -20);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLfe;)V", line = 101)
    public static final void method710(byte arg0, class229 arg1) {
        if (arg0 > -73) {
            method712(-77, (class69) null);
        }
        if (class37.field543 != null) {
            try {
                class37.field543.method1180((byte) -37, 0L);
                class37.field543.method1190(arg1.field3879, arg1.field3905, 24, 23065);
            } catch (Exception var3) {
            }
        }
        field1823++;
        arg1.field3905 += 24;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILkg;)V", line = 125)
    public static final void method712(int arg0, class69 arg1) {
        if (arg0 < 32) {
            method713(-88, 59, false, (class60) null);
        }
        field1817++;
        class69 var2 = class196.method1261(arg1, -100);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class115.field1945;
            var4 = class48.field655;
        } else {
            var3 = var2.field1069;
            var4 = var2.field1085;
        }
        class46.method268(arg1, false, var4, var3, (byte) 85);
        class2.method10((byte) 127, var3, var4, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZLja;)V", line = 151)
    public static final void method713(int arg0, int arg1, boolean arg2, class60 arg3) {
        field1816++;
        if (arg3.field1192 == arg0 && arg0 != -1) {
            class157 var4 = class132.method821(128, arg0);
            int var5 = var4.field2592;
            if (var5 == 1) {
                arg3.field1220 = 0;
                arg3.field1171 = 0;
                arg3.field1200 = arg1;
                arg3.field1182 = 0;
                class141.method888(0, var4, arg3.field1210, false, arg3.field1220, arg3.field1193);
            }
            if (var5 == 2) {
                arg3.field1171 = 0;
            }
        } else if (arg0 == -1 || arg3.field1192 == -1 || class132.method821(128, arg0).field2576 >= class132.method821(128, arg3.field1192).field2576) {
            arg3.field1183 = arg3.field1212;
            arg3.field1220 = 0;
            arg3.field1182 = 0;
            arg3.field1200 = arg1;
            arg3.field1192 = arg0;
            arg3.field1171 = 0;
            if (arg3.field1192 != -1) {
                class141.method888(0, class132.method821(128, arg3.field1192), arg3.field1210, false, arg3.field1220, arg3.field1193);
            }
        }
        if (arg2) {
            field1833 = -65;
        }
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V", line = 211)
    public static void method714(int arg0) {
        field1831 = null;
        field1827 = null;
        field1819 = null;
        if (arg0 <= -60) {
            field1824 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBI)V", line = 233)
    public final void method716(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1825++;
        int var6 = this.field1820 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field1829 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        if (arg3 != -82) {
            this.method708(-28, -115);
        }
        this.method715(var6, var8, var7, var9, arg4, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I", line = 251)
    public static final int method717(byte arg0, int arg1) {
        if (arg0 != -80) {
            method709(-111, 25, 29, 111, -45, -40, (byte) 91, 27);
        }
        field1822++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
    public abstract void method708(int arg0, int arg1);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
    public abstract void method711(int arg0, int arg1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public abstract void method718(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIII)V")
    public abstract void method719(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public abstract void method720(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(IIII)V")
    public abstract void method721(int arg0, int arg1, int arg2, int arg3);
}
