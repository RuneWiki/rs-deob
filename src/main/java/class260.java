import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class260 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lka;")
    public static class408 field3592 = new class408(16);

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3595 = 1;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public static int[] field3596 = new int[50];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1672(int arg0) {
        class408 var1 = class146.field2124;
        synchronized (class146.field2124) {
            class146.field2124.method2530((byte) -114);
        }
        field3598++;
        class408 var2 = class43.field571;
        synchronized (class43.field571) {
            class43.field571.method2530((byte) -115);
            if (arg0 != -5154) {
                method1672(9);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lge;", line = 31)
    public static final class104 method1674(int arg0) {
        field3594++;
        if (arg0 > -65) {
            method1679(-9);
        }
        return class333.field4490;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lvg;I)V", line = 47)
    public static final void method1677(int arg0, class108[] arg1, int arg2) {
        field3593++;
        if (arg2 != -4735) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class108 var4 = arg1[var3];
            if (var4 != null && var4.field1540 == arg0 && !client.method1637(var4)) {
                if (var4.field1666 == 0) {
                    method1677(var4.field1631, arg1, -4735);
                    if (var4.field1651 != null) {
                        method1677(var4.field1631, var4.field1651, -4735);
                    }
                    class435 var5 = (class435) class171.field2415.method837((byte) -72, (long) var4.field1631);
                    if (var5 != null) {
                        class155.method1133(84, var5.field6146);
                    }
                }
                if (var4.field1666 == 6 && var4.field1607 != -1) {
                    class83 var6 = class408.method2521((byte) -110, var4.field1607);
                    if (var6 != null) {
                        var4.field1620 += class54.field694;
                        while (var6.field1144[var4.field1539] < var4.field1620) {
                            var4.field1620 -= var6.field1144[var4.field1539];
                            var4.field1539++;
                            if (var6.field1145.length <= var4.field1539) {
                                var4.field1539 -= var6.field1164;
                                if (var4.field1539 < 0 || var6.field1145.length <= var4.field1539) {
                                    var4.field1539 = 0;
                                }
                            }
                            var4.field1648 = var4.field1539 + 1;
                            if (var4.field1648 >= var6.field1145.length) {
                                var4.field1648 -= var6.field1164;
                                if (var4.field1648 < 0 || var4.field1648 >= var6.field1145.length) {
                                    var4.field1648 = -1;
                                }
                            }
                            class298.method1821((byte) -66, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V", line = 145)
    public static void method1679(int arg0) {
        field3592 = null;
        if (arg0 == -4463) {
            field3596 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 156)
    public static final int method1680(String arg0, byte arg1) {
        field3597++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        if (arg1 != 94) {
            method1681(48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z", line = 179)
    public static final boolean method1681(int arg0) {
        field3591++;
        if (arg0 != 22687) {
            return true;
        }
        try {
            if (class10.field78 == 2) {
                if (class408.field5692 == null) {
                    class408.field5692 = class137.method1022(class82.field1136, class451.field6495, class346.field4682);
                    if (class408.field5692 == null) {
                        return false;
                    }
                }
                if (class362.field4992 == null) {
                    class362.field4992 = new class52(class177.field2521, class42.field550);
                }
                if (class105.field1477.method2399(class362.field4992, class54.field690, 22050, class408.field5692, 16)) {
                    class105.field1477.method2380(false);
                    class105.field1477.method2391(16, class380.field5248);
                    class105.field1477.method2394(class408.field5692, class448.field6350, false);
                    class82.field1136 = null;
                    class408.field5692 = null;
                    class362.field4992 = null;
                    class10.field78 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class105.field1477.method2377(arg0 - 22782);
            class362.field4992 = null;
            class82.field1136 = null;
            class10.field78 = 0;
            class408.field5692 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public abstract int method1671(int arg0);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)J")
    public abstract long method1673(int arg0);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Z")
    public abstract boolean method1675(byte arg0);

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)C")
    public abstract char method1676(int arg0);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
    public abstract int method1678(byte arg0);
}
