import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class334 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lba;")
    public static class466 field4980 = class188.method1297(91);

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lct;")
    public static class285 field4986;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method2043(byte arg0) {
        field4980 = null;
        if (arg0 > -37) {
            method2049((byte) 61);
        }
        field4986 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Z")
    public final boolean method2044(int arg0) {
        if (arg0 != 1912297900) {
            this.field4983 = 100;
        }
        field4991++;
        return (this.field4987 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
    public final boolean method2045(int arg0) {
        field4992++;
        if (arg0 != -7000) {
            method2043((byte) -57);
        }
        return (this.field4987 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)Z")
    public final boolean method2046(byte arg0) {
        field4982++;
        int var2 = -117 / ((arg0 + 62) / 55);
        return (this.field4987 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZLst;)V")
    public static final void method2047(boolean arg0, class97 arg1) {
        arg1.field1397 = null;
        field4984++;
        if (class122.field1689 < 20) {
            class271.field4074.method1597(arg1, (byte) 91);
            class122.field1689++;
        }
        if (arg0) {
            method2043((byte) -30);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BIIIII)V")
    public static final void method2048(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4985++;
        int var6 = arg3 - arg2;
        int var7 = arg1 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class262.method1724(arg2, arg5, arg0 + 48, arg1, arg4);
            }
        } else if (var7 == 0) {
            class345.method2128(arg5, arg2, arg3, (byte) -99, arg4);
        } else {
            if (arg0 != -40) {
                method2051(125, (byte) -118);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class293.field4420) {
                var10 = class293.field4420;
                var11 = (class293.field4420 * var8 >> 12) + var9;
            } else if (arg3 > class119.field1643) {
                var10 = class119.field1643;
                var11 = (class119.field1643 * var8 >> 12) + var9;
            } else {
                var10 = arg3;
                var11 = arg1;
            }
            int var12;
            int var13;
            if (arg2 < class293.field4420) {
                var12 = var9 + (class293.field4420 * var8 >> 12);
                var13 = class293.field4420;
            } else if (arg2 > class119.field1643) {
                var12 = (class119.field1643 * var8 >> 12) + var9;
                var13 = class119.field1643;
            } else {
                var12 = arg4;
                var13 = arg2;
            }
            if (class176.field2503 > var12) {
                var13 = (class176.field2503 - var9 << 12) / var8;
                var12 = class176.field2503;
            } else if (class296.field4443 < var12) {
                var13 = (class296.field4443 - var9 << 12) / var8;
                var12 = class296.field4443;
            }
            if (class176.field2503 > var11) {
                var10 = (class176.field2503 - var9 << 12) / var8;
                var11 = class176.field2503;
            } else if (var11 > class296.field4443) {
                var11 = class296.field4443;
                var10 = (class296.field4443 - var9 << 12) / var8;
            }
            class58.method450(var11, -91, var10, var12, arg5, var13);
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)V")
    public static final void method2049(byte arg0) {
        class122.field1684.method2401((byte) -32);
        if (arg0 > -48) {
            field4986 = null;
        }
        field4989++;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)Z")
    public final boolean method2050(byte arg0) {
        field4981++;
        int var2 = -33 % ((arg0 - 68) / 40);
        return (this.field4987 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)Z")
    public static final boolean method2051(int arg0, byte arg1) {
        field4993++;
        class187 var2 = class44.method321(-57, arg0);
        if (var2 == null) {
            return false;
        } else if (class153.field2137 == 3) {
            if (arg1 < 96) {
                field4986 = null;
            }
            String var3 = "";
            if (class150.field2114 != class103.field1445) {
                var3 = ":" + (var2.field2845 + 7000);
            }
            String var4 = "";
            if (class229.field3374 != null) {
                var4 = "/p=" + class229.field3374;
            }
            String var5 = "http://" + var2.field2837 + var3 + "/l=" + class4.field85 + "/a=" + class64.field891 + var4 + "/j" + (class378.field5614 ? "1" : "0") + ",o" + (class245.field3518 ? "1" : "0") + ",a2";
            try {
                class312.field4712.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class212.field3196 = var2.field2845;
            class150.field2110 = var2.field2837;
            if (class150.field2114 != class103.field1445) {
                class487.field6839 = class212.field3196 + 40000;
                class94.field1289 = class212.field3196 + 50000;
                class14.field198 = class487.field6839;
            }
            return true;
        }
    }

    static {
        new class332((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field4988 = 0;
        field4986 = new class285(7, 0);
    }
}
