import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class141 extends class301 {

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2012 = "Created gameworld";

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "B")
    public byte field2009;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Llf;")
    public static class130 field2017;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lqj;")
    public static class296 field2008;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Leb;")
    public class371 field2010;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V", line = 3)
    public static final void method960(byte arg0) {
        class296.field4079 = 0;
        ++field2014;
        class54.field795 = 0;
        class164.method1092((byte) 21);
        class167.method1126(13);
        class445.method2779(107);
        class80.method574(3326);
        for (int var1 = 0; ~class296.field4079 < ~var1; ++var1) {
            int var3 = class376.field5368[var1];
            if (~class35.field541 != ~class12.field153[var3].field874) {
                if (class12.field153[var3].field4963 > 0) {
                    class108.method730(0, class12.field153[var3]);
                }
                class12.field153[var3] = null;
            }
        }
        if (~class120.field1712 != ~class393.field5747.field5273) {
            throw new RuntimeException("gpp1 pos:" + class393.field5747.field5273 + " psize:" + class120.field1712);
        } else {
            if (arg0 != -67) {
                method963('j', false);
            }
            for (int var2 = 0; ~var2 > ~class169.field2407; ++var2) {
                if (class12.field153[class67.field1055[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class169.field2407);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)[B", line = 61)
    public final byte[] method961(int arg0) {
        ++field2019;
        int var2 = -7 % ((arg0 - 60) / 55);
        if (!super.field4169 && ~(this.field2010.field5258.length + -this.field2009) >= ~this.field2010.field5273) {
            return this.field2010.field5258;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V", line = 78)
    public static final void method962(int arg0, boolean arg1) {
        class60.field845 = arg1;
        ++field2013;
        class140.field2005 = !class67.method457(31862);
        if (arg0 != 97) {
            field2020 = -51;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(CZ)Z", line = 95)
    public static final boolean method963(char arg0, boolean arg1) {
        ++field2021;
        if (arg1) {
            method964(-33);
        }
        return ~arg0 <= -49 && arg0 <= '9' || arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 111)
    public static void method964(int arg0) {
        field2012 = null;
        field2017 = null;
        field2008 = null;
        if (arg0 != 16000) {
            method964(92);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)I", line = 131)
    public final int method965(byte arg0) {
        if (arg0 != -55) {
            this.field2009 = 78;
        }
        ++field2018;
        return this.field2010 == null ? 0 : this.field2010.field5273 * 100 / (this.field2010.field5258.length + -this.field2009);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V", line = 149)
    public static final void method966(byte arg0, String arg1) {
        int var2 = -78 % ((arg0 - -2) / 43);
        ++field2016;
        class216.method1381(0, (byte) -127, "", "", arg1, 0);
    }
}
