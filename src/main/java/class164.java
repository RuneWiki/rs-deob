import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class164 extends class147 implements class425 {

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Lfs;")
    public class349 field2193;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Z")
    private boolean field2191;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "[I")
    public static int[] field2209 = new int[50];

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "Lar;")
    public static class47 field2210 = new class47();

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field2212 = 0;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "[I")
    public static int[] field2213 = new int[13];

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "[[[I")
    public static int[][][] field2214 = new int[2][][];

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "[I")
    public static int[] field2215 = new int[14];

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Lvb;")
    public static class91 field2211;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLii;)V")
    public final void method102(byte arg0, class405 arg1) {
        this.field2193.method2290((byte) -102, arg1);
        if (arg0 == 76) {
            ++field2208;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field2195;
        class375 var3 = this.field2193.method2300(arg1, true, super.field2012, 1024, arg0, super.field2010, false);
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = arg0.method1735();
            var4.method985(super.field2012, super.field2019, super.field2010);
            class382 var5 = null;
            if (this.field2191) {
                var5 = class397.method2554(1, 0);
            }
            if (this.field2193.field5070 != null) {
                class352 var6 = this.field2193.field5070.method35();
                arg0.method1653(var3, var6, var4, var5 != null ? var5.field5543[0] : null, 0);
            } else {
                var3.method1601(var4, var5 != null ? var5.field5543[0] : null, 0);
            }
            this.field2193.method2295(false, super.field2010 >> 7, true, super.field2012 >> 7, super.field2012 >> 7, var3, super.field2010 >> 7, arg0);
            if (arg1 != -1) {
                field2209 = null;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I")
    public final int method105(int arg0) {
        ++field2207;
        if (arg0 >= -4) {
            this.field2191 = true;
        }
        return this.field2193.field5059;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static final void method1013(byte arg0) {
        ++field2198;
        for (class105 var1 = (class105) class43.field609.method332(-2130841184); var1 != null; var1 = (class105) class43.field609.method343((byte) -79)) {
            class52 var2 = var1.field1522;
            if (~class227.field2981 == ~var2.field727 && !var2.field708) {
                if (~var2.field711 >= ~class28.field418) {
                    var2.method364(class379.field5514, -1);
                    if (var2.field708) {
                        var1.method322(11);
                    } else {
                        class21.method146(var2, true);
                    }
                }
            } else {
                var1.method322(11);
                var2.method363(false);
            }
        }
        if (arg0 > -64) {
            method1015(123, -81, 80);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        if (arg0 <= 102) {
            this.method117((class405) null, -56);
        }
        ++field2199;
        class375 var3 = this.field2193.method2300(-1, true, super.field2012, 131072, arg1, super.field2010, true);
        if (var3 != null) {
            this.field2193.method2295(false, super.field2010 >> 7, false, super.field2012 >> 7, super.field2012 >> 7, var3, super.field2010 >> 7, arg1);
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 != -17506) {
            return false;
        } else {
            ++field2197;
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method120(int arg0) {
        if (arg0 != 25940) {
            field2214 = null;
        }
        ++field2203;
        return this.field2193.field5074;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        ++field2194;
        if (arg3 >= -106) {
            this.method166(72);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field2215 = null;
        field2213 = null;
        field2209 = null;
        field2214 = null;
        if (arg0 > -19) {
            field2209 = null;
        }
        field2211 = null;
        field2210 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field2192;
        class375 var5 = this.field2193.method2300(-1, false, super.field2012, 65536, arg3, super.field2010, arg2);
        if (var5 == null) {
            return false;
        } else {
            class177 var6 = arg3.method1735();
            var6.method985(super.field2012, super.field2019, super.field2010);
            return var5.method1594(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            this.field2191 = true;
        }
        ++field2205;
        return this.field2193.method2297(-108);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        ++field2206;
        if (arg0) {
            field2215 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lii;I)V")
    public final void method118(class405 arg0, int arg1) {
        if (arg1 != 22295) {
            method1013((byte) 101);
        }
        ++field2200;
        this.field2193.method2294(1, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILii;I)Ldc;")
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        if (arg2 <= 27) {
            this.method119(54, -92, false, (class405) null);
        }
        ++field2201;
        return this.field2193.method2300(-1, false, 0, arg0, arg1, 0, false);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        ++field2202;
        if (arg0 != -15123) {
            field2212 = -6;
        }
        return this.field2193.field5038;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (arg0 >= -108) {
            field2214 = null;
        }
        ++field2196;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)Lba;")
    public static final class270 method1015(int arg0, int arg1, int arg2) {
        ++field2204;
        class270 var3 = new class270();
        var3.field3930 = arg2 + 5 + 1;
        if (arg1 != -19129) {
            return null;
        } else {
            var3.field3908 = -1;
            var3.field3915 = -1;
            var3.field3903 = arg0 + 6;
            var3.field3914 = new int[var3.field3930][var3.field3903];
            var3.method1852(-5);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lii;Lge;IIIIIIZI)V")
    public class164(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field1475, arg1.field1512);
        this.field2193 = new class349(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field2191 = arg1.field1455 != 0 && !arg8;
    }
}
