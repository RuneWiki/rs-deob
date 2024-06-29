import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class125 extends class305 {

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Ljava/lang/String;")
    private String field2160 = "null";

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Lab;")
    public static class279 field2161 = new class279(64);

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2165 = "flash1:";

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "C")
    public char field2162;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "C")
    public char field2170;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lih;")
    public static class143 field2169;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Lsl;")
    public class39 field2158;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Lsl;")
    private class39 field2168;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIILbm;)Lfd;", line = 4)
    public static final class206 method823(byte arg0, int arg1, int arg2, class307 arg3) {
        if (arg0 == 116) {
            field2171++;
            return class135.method885(arg1, arg3, arg0 ^ 0xFFFFD548, arg2) ? class344.method2382(arg0 ^ 0xFFFF8B41) : null;
        } else {
            return (class206) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lag;ZI)V", line = 22)
    private final void method824(class202 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method833(-16, (String) null);
        }
        if (arg2 == 1) {
            this.field2170 = class228.method1515(0, arg0.method1333(-126));
        } else if (arg2 == 2) {
            this.field2162 = class228.method1515(0, arg0.method1333(-128));
        } else if (arg2 == 3) {
            this.field2160 = arg0.method1307((byte) 102);
        } else if (arg2 == 4) {
            this.field2166 = arg0.method1346(-121);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1315(14289);
            this.field2158 = new class39(class226.method1510(27147, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1346(62);
                class35 var7;
                if (arg2 == 5) {
                    var7 = new class179(arg0.method1307((byte) 102));
                } else {
                    var7 = new class166(arg0.method1346(-121));
                }
                this.field2158.method310((long) var6, var7, 25357);
            }
        }
        field2155++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Ljava/lang/String;", line = 79)
    public final String method825(int arg0, int arg1) {
        field2156++;
        if (this.field2158 == null) {
            return this.field2160;
        }
        class179 var3 = (class179) this.field2158.method303((long) arg0, (byte) 111);
        if (arg1 != -9614) {
            this.field2168 = (class39) null;
        }
        return var3 == null ? this.field2160 : var3.field2880;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V", line = 100)
    public static void method826(byte arg0) {
        field2161 = null;
        field2169 = null;
        field2165 = null;
        if (arg0 != 95) {
            method834(-24);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I", line = 112)
    public final int method827(int arg0, int arg1) {
        field2164++;
        if (this.field2158 == null) {
            return this.field2166;
        }
        if (arg0 != -3) {
            this.field2170 = '\u0007';
        }
        class166 var3 = (class166) this.field2158.method303((long) arg1, (byte) 120);
        return var3 == null ? this.field2166 : var3.field2682;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 133)
    private final void method828(int arg0) {
        field2172++;
        this.field2168 = new class39(this.field2158.method308((byte) -87));
        for (class179 var2 = (class179) this.field2158.method306(arg0 - 3816); var2 != null; var2 = (class179) this.field2158.method300(1)) {
            class138 var3 = new class138(var2.field2880, (int) var2.field702);
            this.field2168.method310(class26.method217((byte) -66, var2.field2880), var3, 25357);
        }
        if (arg0 != 3816) {
            this.field2170 = (char) 65514;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V", line = 156)
    private final void method829(byte arg0) {
        this.field2168 = new class39(this.field2158.method308((byte) -87));
        if (arg0 < 114) {
            method823((byte) 17, 124, 80, (class307) null);
        }
        for (class166 var2 = (class166) this.field2158.method306(0); var2 != null; var2 = (class166) this.field2158.method300(1)) {
            class166 var3 = new class166((int) var2.field702);
            this.field2168.method310((long) var2.field2682, var3, 25357);
        }
        field2163++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lag;Z)V", line = 196)
    public final void method830(class202 arg0, boolean arg1) {
        if (arg1) {
            method823((byte) -19, -123, -45, (class307) null);
        }
        while (true) {
            int var3 = arg0.method1317((byte) -71);
            if (var3 == 0) {
                field2177++;
                return;
            }
            this.method824(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)Z", line = 224)
    public final boolean method831(int arg0, boolean arg1) {
        field2173++;
        if (this.field2158 == null) {
            return false;
        } else if (arg1) {
            return true;
        } else {
            if (this.field2168 == null) {
                this.method829((byte) 127);
            }
            class166 var3 = (class166) this.field2168.method303((long) arg0, (byte) 126);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V", line = 258)
    public static final void method832(byte arg0) {
        class157.field2550.method1877(-29702);
        class106.field1825.method1877(-29702);
        field2157++;
        if (arg0 != 102) {
            field2174 = 5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 270)
    public final boolean method833(int arg0, String arg1) {
        field2159++;
        if (this.field2158 == null) {
            return false;
        }
        if (this.field2168 == null) {
            this.method828(3816);
        }
        class138 var3 = (class138) this.field2168.method303(class26.method217((byte) -64, arg1), (byte) 126);
        if (arg0 > -25) {
            field2161 = (class279) null;
        }
        while (var3 != null) {
            if (var3.field2305.equals(arg1)) {
                return true;
            }
            var3 = (class138) this.field2168.method311(1);
        }
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)I", line = 299)
    public static final int method834(int arg0) {
        field2176++;
        return arg0 == 5 ? class35.field699.method1878((byte) 127) : 28;
    }
}
