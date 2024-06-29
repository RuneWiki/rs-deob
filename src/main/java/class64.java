import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class64 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Ljava/lang/String;")
    private String field801 = "null";

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lec;")
    public static class40 field806 = new class40("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "C")
    public char field797;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "C")
    public char field810;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lom;")
    public static class138 field811;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lwb;")
    private class45 field800;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lwb;")
    public class45 field812;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 4)
    public static void method326(int arg0) {
        field806 = null;
        field811 = null;
        int var1 = 112 / ((arg0 - 37) / 52);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILvt;)V", line = 18)
    public final void method327(int arg0, class179 arg1) {
        if (arg0 != 3) {
            this.method329((class179) null, (byte) -63, -118);
        }
        while (true) {
            int var3 = arg1.method895((byte) -80);
            if (var3 == 0) {
                field804++;
                return;
            }
            this.method329(arg1, (byte) 65, var3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method328(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field809++;
        class89 var5 = class146.method695(10, arg1, (byte) -32);
        var5.method449(true);
        var5.field1111 = arg3;
        var5.field1100 = arg0;
        var5.field1106 = arg2;
        if (arg4 != 3187) {
            method326(-64);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lvt;BI)V", line = 55)
    private final void method329(class179 arg0, byte arg1, int arg2) {
        if (arg1 != 65) {
            return;
        }
        field807++;
        if (arg2 == 1) {
            this.field810 = class437.method2598(arg0.method922(32429), (byte) -49);
        } else if (arg2 == 2) {
            this.field797 = class437.method2598(arg0.method922(32429), (byte) -49);
        } else if (arg2 == 3) {
            this.field801 = arg0.method907(-27652);
        } else if (arg2 == 4) {
            this.field796 = arg0.method939((byte) -68);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method916(21933);
            this.field812 = new class45(class93.method459(-719824240, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method939((byte) 116);
                class147 var7;
                if (arg2 == 5) {
                    var7 = new class373(arg0.method907(-27652));
                } else {
                    var7 = new class363(arg0.method939((byte) 98));
                }
                this.field812.method234(-54, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 110)
    private final void method330(int arg0) {
        field805++;
        this.field800 = new class45(this.field812.method232(arg0 + 41385));
        class373 var2 = (class373) this.field812.method241(0);
        if (arg0 != -19789) {
            this.method329((class179) null, (byte) 9, -62);
        }
        while (var2 != null) {
            class90 var3 = new class90(var2.field5332, (int) var2.field1776);
            this.field800.method234(-106, class113.method544(var2.field5332, (byte) -45), var3);
            var2 = (class373) this.field812.method239(arg0 ^ 0xFFFFB2B3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 138)
    public final boolean method331(String arg0, int arg1) {
        field808++;
        if (this.field812 == null) {
            return false;
        }
        if (this.field800 == null) {
            this.method330(-19789);
        }
        class90 var3 = (class90) this.field800.method233(112, class113.method544(arg0, (byte) -45));
        if (arg1 >= -36) {
            method328(-45, -95, -100, 123, 36);
        }
        while (var3 != null) {
            if (var3.field1123.equals(arg0)) {
                return true;
            }
            var3 = (class90) this.field800.method237((byte) -7);
        }
        return false;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I", line = 165)
    public final int method332(int arg0, byte arg1) {
        field798++;
        if (this.field812 == null) {
            return this.field796;
        } else if (arg1 > -68) {
            return -25;
        } else {
            class363 var3 = (class363) this.field812.method233(-119, (long) arg0);
            return var3 == null ? this.field796 : var3.field5221;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z", line = 186)
    public final boolean method333(int arg0, int arg1) {
        field802++;
        if (this.field812 == null) {
            return false;
        }
        if (this.field800 == null) {
            this.method334((byte) 68);
        }
        class363 var3 = (class363) this.field800.method233(119, (long) arg0);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 6) {
                field811 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 214)
    private final void method334(byte arg0) {
        field803++;
        this.field800 = new class45(this.field812.method232(21596));
        class363 var2 = (class363) this.field812.method241(0);
        int var3 = -20 % ((-arg0 - 23) / 50);
        while (var2 != null) {
            class363 var4 = new class363((int) var2.field1776);
            this.field800.method234(-86, (long) var2.field5221, var4);
            var2 = (class363) this.field812.method239(0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Ljava/lang/String;", line = 236)
    public final String method335(int arg0, int arg1) {
        field799++;
        if (this.field812 == null) {
            return this.field801;
        }
        if (arg0 <= 117) {
            this.field812 = null;
        }
        class373 var3 = (class373) this.field812.method233(110, (long) arg1);
        return var3 == null ? this.field801 : var3.field5332;
    }
}
