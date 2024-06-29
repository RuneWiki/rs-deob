import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class119 extends class112 {

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public int field1999 = 0;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public int field1998 = 0;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public int field1997 = -1;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public int field2005 = 12800;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public int field2008 = -1;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Z")
    public boolean field2010 = true;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public int field2009 = 12800;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Ljava/lang/String;")
    public String field2001;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "Ljava/lang/String;")
    public String field2015;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Lre;")
    private class266 field2003;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "[I")
    public static int[] field2002 = new int[32];

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field2016 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)[I")
    public final int[] method869(int arg0, int arg1, int arg2, byte arg3) {
        field1996++;
        for (class189 var5 = (class189) this.field2003.method1807(-117); var5 != null; var5 = (class189) this.field2003.method1808((byte) 78)) {
            if (var5.method1308(arg1, (byte) 90, arg2, arg0)) {
                return var5.method1304(114, arg1, arg0);
            }
        }
        if (arg3 != -87) {
            this.field1997 = 9;
        }
        return null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILig;)Lth;")
    public static final class119 method870(int arg0, int arg1, class136 arg2) {
        field2006++;
        class119 var3 = new class119(arg0, arg2.method1010(-118), arg2.method1010(-116), arg2.method1022(arg1 + 107), arg2.method1022(arg1 - 48), arg2.method1012(4) == 1, arg2.method1012(arg1 + 4));
        int var4 = arg2.method1012(arg1 ^ 0x4);
        for (int var5 = arg1; var5 < var4; var5++) {
            var3.field2003.method1809(5, new class189(arg2.method1012(4), arg2.method1012(4), arg2.method996(65280), arg2.method996(arg1 ^ 0xFF00), arg2.method996(65280), arg2.method996(65280), arg2.method996(65280), arg2.method996(arg1 + 65280), arg2.method996(arg1 ^ 0xFF00), arg2.method996(65280)));
        }
        var3.method875((byte) 108);
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)[I")
    public final int[] method871(int arg0, byte arg1, int arg2) {
        field2011++;
        if (arg1 != -124) {
            return null;
        }
        for (class189 var4 = (class189) this.field2003.method1807(-116); var4 != null; var4 = (class189) this.field2003.method1808((byte) 105)) {
            if (var4.method1305(arg1 ^ 0x7A, arg2, arg0)) {
                return var4.method1306(-119, arg0, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method872(int arg0) {
        field2002 = null;
        if (arg0 != 12800) {
            method870(-107, -85, (class136) null);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)[I")
    public final int[] method873(int arg0, int arg1, int arg2) {
        field2013++;
        int var4 = -64 / ((arg1 - 19) / 41);
        for (class189 var5 = (class189) this.field2003.method1807(-122); var5 != null; var5 = (class189) this.field2003.method1808((byte) 99)) {
            if (var5.method1309((byte) -121, arg2, arg0)) {
                return var5.method1304(109, arg2, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lsb;B)V")
    public static final void method874(class124 arg0, byte arg1) {
        class193.field3168 = arg0.method889("p11_full", -1);
        class212.field3395 = arg0.method889("p12_full", -1);
        field2019++;
        class157.field2554 = arg0.method889("b12_full", -1);
        class278.field4408 = arg0.method889("mapfunction", -1);
        class82.field1368 = arg0.method889("hitmarks", -1);
        class169.field2762 = arg0.method889("hitbar_default", -1);
        class6.field72 = arg0.method889("headicons_pk", -1);
        class249.field3971 = arg0.method889("headicons_prayer", -1);
        class169.field2761 = arg0.method889("hint_headicons", -1);
        class118.field1984 = arg0.method889("hint_mapmarkers", -1);
        class89.field1417 = arg0.method889("mapflag", -1);
        class210.field3373 = arg0.method889("cross", -1);
        int var2 = -107 / ((-arg1 - 72) / 34);
        class259.field4130 = arg0.method889("mapdots", -1);
        class217.field3489 = arg0.method889("scrollbar", -1);
        class283.field4503 = arg0.method889("name_icons", -1);
        class130.field2160 = arg0.method889("floorshadows", -1);
        class116.field1940 = arg0.method889("compass", -1);
        class35.field599 = arg0.method889("hint_mapedge", -1);
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V")
    private final void method875(byte arg0) {
        this.field2009 = 12800;
        this.field1998 = 0;
        if (arg0 < 81) {
            this.field2003 = null;
        }
        this.field2005 = 12800;
        this.field1999 = 0;
        field2014++;
        for (class189 var2 = (class189) this.field2003.method1807(-108); var2 != null; var2 = (class189) this.field2003.method1808((byte) 50)) {
            if (var2.field3093 < this.field2005) {
                this.field2005 = var2.field3093;
            }
            if (this.field2009 > var2.field3084) {
                this.field2009 = var2.field3084;
            }
            if (this.field1999 < var2.field3095) {
                this.field1999 = var2.field3095;
            }
            if (this.field1998 < var2.field3086) {
                this.field1998 = var2.field3086;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IBI)Z")
    public final boolean method876(int arg0, byte arg1, int arg2) {
        if (arg1 != 6) {
            return true;
        }
        field2012++;
        for (class189 var4 = (class189) this.field2003.method1807(-110); var4 != null; var4 = (class189) this.field2003.method1808((byte) 115)) {
            if (var4.method1309((byte) -121, arg2, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    private class119(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2010 = arg5;
        this.field2001 = arg2;
        this.field2015 = arg1;
        this.field2000 = arg0;
        this.field2007 = arg3;
        this.field1997 = arg6;
        if (this.field1997 == 255) {
            this.field1997 = 0;
        }
        this.field2008 = arg4;
        this.field2003 = new class266();
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2002[var1] = var0 - 1;
            var0 += var0;
        }
        field2017 = 0;
        field2020 = 0;
    }
}
