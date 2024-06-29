import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class50 extends class147 {

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public int field646 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public int field642 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public int field643 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
    public int field654 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public int field644 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public int field652 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public int field651 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public int field650 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "Lfg;")
    public class21 field640;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Lsd;")
    public static class74 field639 = new class74(43, 8);

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field656 = 1406;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field658;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bp", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field659;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(JIZI)V")
    public static final void method260(long arg0, int arg1, boolean arg2, int arg3) {
        field649++;
        if (!arg2) {
            field656 = 85;
        }
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x3F95DC) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class397.method2377(0, true, 0, arg1, var6, var5, 0, arg3, 0);
            return;
        }
        class415 var8 = class173.field2084.method2297(50, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field5927;
            var10 = var8.field5939;
        } else {
            var9 = var8.field5939;
            var10 = var8.field5927;
        }
        int var11 = var8.field5977;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class397.method2377(var9, true, var11, arg1, 0, 0, 0, arg3, var10);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lvt;IB)V")
    public static final void method261(class179 arg0, int arg1, byte arg2) {
        field648++;
        if (arg2 <= 9) {
            method265(4);
        }
        if (class287.field4307 == null) {
            return;
        }
        try {
            class287.field4307.method1646(0, 0L);
            class287.field4307.method1647(arg0.field2159, -855377040, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
    public final boolean method262(int arg0, int arg1, int arg2) {
        field647++;
        if (arg1 >= this.field643 && this.field644 >= arg1 && arg0 >= this.field654 && arg0 <= this.field646) {
            return true;
        } else if (arg1 >= this.field652 && arg1 <= this.field651 && this.field642 <= arg0 && arg0 <= this.field650) {
            return true;
        } else {
            if (arg2 != 0) {
                this.field640 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[Lab;)V")
    public static final void method263(int arg0, int arg1, class256[] arg2) {
        field655++;
        if (arg0 < 33) {
            field657 = 80;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class256 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3654 == 0) {
                    if (var4.field3643 != null) {
                        method263(89, arg1, var4.field3643);
                    }
                    class68 var5 = (class68) class369.field5270.method233(-58, (long) var4.field3659);
                    if (var5 != null) {
                        class340.method2065(0, arg1, var5.field850);
                    }
                }
                if (arg1 == 0 && var4.field3678 != null) {
                    class35 var6 = new class35();
                    var6.field435 = var4.field3678;
                    var6.field429 = var4;
                    class396.method2371(var6);
                }
                if (arg1 == 1 && var4.field3683 != null) {
                    if (var4.field3568 >= 0) {
                        class256 var7 = class399.method2387(var4.field3659, -1857167024);
                        if (var7 == null || var7.field3643 == null || var7.field3643.length <= var4.field3568 || var7.field3643[var4.field3568] != var4) {
                            continue;
                        }
                    }
                    class35 var8 = new class35();
                    var8.field429 = var4;
                    var8.field435 = var4.field3683;
                    class396.method2371(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(III)I")
    public static final int method264(int arg0, int arg1, int arg2) {
        field641++;
        if (arg0 == 1 || arg0 == 3) {
            return class16.field213[arg2 & 0x3];
        } else if (arg1 == 3) {
            return class337.field4845[arg2 & 0x3];
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    public static final void method265(int arg0) {
        class284.field4130 = new class256[class101.field1229.method2756(true)][];
        field638++;
        if (arg0 == 8) {
            class92.field1150 = new boolean[class101.field1229.method2756(true)];
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
    public static void method266(int arg0) {
        if (arg0 == 8486) {
            field639 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lfg;)V")
    public class50(class21 arg0) {
        this.field640 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V")
    public static final void method267(boolean arg0) {
        field645++;
        if (arg0) {
            method264(-73, -106, 91);
        }
        for (class176 var1 = (class176) class451.field6383.method802((byte) 115); var1 != null; var1 = (class176) class451.field6383.method806((byte) 104)) {
            if (class293.field4356 == null) {
                var1.method702((byte) -114);
            } else if (var1.field2126 <= class204.field2796) {
                int var14 = class270.field3870[var1.field2112];
                if (var14 == 0) {
                    class261 var15 = class63.method320(var1.field2124, var1.field2111, var1.field2125);
                    if (var15 instanceof class314) {
                        class145.method689(var1.field2124, var1.field2111, var1.field2125);
                        class314 var16 = (class314) var15;
                        if (var16.field4578 != null) {
                            class443.method2617(var1.field2124, var1.field2111, var1.field2125, var16.field4578, (class261) null);
                        }
                    }
                } else if (var14 == 1) {
                    class183 var17 = class330.method2001(var1.field2124, var1.field2111, var1.field2125);
                    if (var17 instanceof class19) {
                        class373.method2255(var1.field2124, var1.field2111, var1.field2125);
                        class19 var18 = (class19) var17;
                        if (var18.field261 != null) {
                            class13.method97(var1.field2124, var1.field2111, var1.field2125, var18.field261, (class183) null);
                        }
                    }
                } else if (var14 == 2) {
                    class83 var19 = class263.method1603(var1.field2124, var1.field2111, var1.field2125, field659 == null ? (field659 = method268("td")) : field659);
                    if (var19 instanceof class4) {
                        class304.method1899(var1.field2124, var1.field2111, var1.field2125, field659 == null ? (field659 = method268("td")) : field659);
                        class4 var20 = (class4) var19;
                        if (var20.field39 != null) {
                            class223.method1232(var20.field39, false);
                        }
                    }
                } else if (var14 == 3) {
                    class60 var21 = class427.method2542(var1.field2124, var1.field2111, var1.field2125);
                    if (var21 instanceof class44) {
                        class367.method2218(var1.field2124, var1.field2111, var1.field2125);
                        class44 var22 = (class44) var21;
                        if (var22.field552 != null) {
                            class204.method1114(var1.field2124, var1.field2111, var1.field2125, var22.field552);
                        }
                    }
                }
                var1.method702((byte) -114);
            } else if (class204.field2796 == var1.field2114) {
                int var2 = class270.field3870[var1.field2112];
                if (var2 == 0) {
                    class261 var12 = class63.method320(var1.field2124, var1.field2111, var1.field2125);
                    if (var12 instanceof class314) {
                        var1.method702((byte) -114);
                    } else if (class413.method2448(var1.field2124, var1.field2111, var1.field2125) == null) {
                        class314 var13 = new class314(var1.field2112, var1.field2110, var1.field2128, var1.field2108, var1.field2120, var12);
                        class443.method2617(var1.field2124, var1.field2111, var1.field2125, var13, (class261) null);
                    } else {
                        var1.method702((byte) -114);
                    }
                } else if (var2 == 1) {
                    class183 var10 = class330.method2001(var1.field2124, var1.field2111, var1.field2125);
                    if (var10 instanceof class19) {
                        var1.method702((byte) -114);
                    } else if (class453.method2651(var1.field2124, var1.field2111, var1.field2125) == null) {
                        class19 var11 = new class19(var1.field2112, var1.field2110, var1.field2128, var1.field2108, var1.field2120, var10);
                        class13.method97(var1.field2124, var1.field2111, var1.field2125, var11, (class183) null);
                    } else {
                        var1.method702((byte) -114);
                    }
                } else if (var2 == 2) {
                    class83 var5 = class263.method1603(var1.field2124, var1.field2111, var1.field2125, field659 == null ? (field659 = method268("td")) : field659);
                    if (var5 instanceof class4) {
                        var1.method702((byte) -114);
                    } else {
                        class304.method1899(var1.field2124, var1.field2111, var1.field2125, field659 == null ? (field659 = method268("td")) : field659);
                        class415 var6 = class173.field2084.method2297(50, var1.field2109);
                        int var7;
                        int var8;
                        if (var1.field2110 == 1 || var1.field2110 == 3) {
                            var7 = var6.field5927;
                            var8 = var6.field5939;
                        } else {
                            var7 = var6.field5939;
                            var8 = var6.field5927;
                        }
                        class4 var9 = new class4(var1.field2112, var1.field2110, var1.field2124, var1.field2128, var1.field2108, var1.field2120, var1.field2111, var1.field2111 + var7 - 1, var1.field2125, var1.field2125 + var8 - 1, var5);
                        class223.method1232(var9, false);
                    }
                } else if (var2 == 3) {
                    class60 var3 = class427.method2542(var1.field2124, var1.field2111, var1.field2125);
                    if (var3 instanceof class44) {
                        var1.method702((byte) -114);
                    } else {
                        class44 var4 = new class44(var1.field2128, var1.field2108, var1.field2120, var3);
                        class204.method1114(var1.field2124, var1.field2111, var1.field2125, var4);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method268(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class40("Ok", "Okay", "OK", "Ok");
        field657 = 0;
    }
}
