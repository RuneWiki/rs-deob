import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class132 extends class426 {

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "Ljava/lang/String;")
    private String field1676 = "null";

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "Lwl;")
    public static class452 field1675 = new class452(38, 8);

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "Z")
    public static boolean field1692 = false;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "Lwl;")
    public static class452 field1688 = new class452(77, -2);

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "Z")
    public static boolean field1694 = false;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "C")
    public char field1677;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "C")
    public char field1687;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "Lwk;")
    public static class286 field1690;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "Lcm;")
    public class382 field1683;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "Lcm;")
    private class382 field1689;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    private final void method777(boolean arg0) {
        if (!arg0) {
            this.field1687 = (char) 65468;
        }
        field1674++;
        this.field1689 = new class382(this.field1683.method2297(false));
        for (class435 var2 = (class435) this.field1683.method2296(5773); var2 != null; var2 = (class435) this.field1683.method2304(100)) {
            class250 var3 = new class250(var2.field6403, (int) var2.field1339);
            this.field1689.method2301(101, var3, class367.method2208(2, var2.field6403));
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method778(int arg0, String arg1) {
        field1680++;
        if (this.field1683 == null) {
            return false;
        }
        if (this.field1689 == null) {
            this.method777(true);
        }
        int var3 = -59 % ((arg0 + 35) / 49);
        for (class250 var4 = (class250) this.field1689.method2302(class367.method2208(2, arg1), 23576); var4 != null; var4 = (class250) this.field1689.method2298((byte) -126)) {
            if (var4.field3748.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method779(int arg0, byte arg1) {
        if (arg1 <= 72) {
            return null;
        }
        field1686++;
        if (this.field1683 == null) {
            return this.field1676;
        } else {
            class435 var3 = (class435) this.field1683.method2302((long) arg0, 23576);
            return var3 == null ? this.field1676 : var3.field6403;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
    public final int method780(int arg0, int arg1) {
        field1693++;
        if (this.field1683 == null) {
            return this.field1681;
        }
        if (arg0 != 4) {
            field1690 = null;
        }
        class350 var3 = (class350) this.field1683.method2302((long) arg1, arg0 + 23572);
        return var3 == null ? this.field1681 : var3.field5202;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Lon;")
    public static final class432 method781(int arg0) {
        if (arg0 != 30011) {
            method781(116);
        }
        field1691++;
        class110.field1453 = 0;
        return class187.method1136(27459);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lfh;ILfh;)V")
    public static final void method782(class170 arg0, int arg1, class170 arg2) {
        class167.field2386++;
        class177.method1082(class387.field5715, 0);
        field1684++;
        class189.field2840.method2381(arg2.field2525, 0);
        class189.field2840.method2334(arg0.field2592, 1833667168);
        if (arg1 >= -79) {
            method786(23);
        }
        class189.field2840.method2357(arg0.field2525, (byte) 47);
        class189.field2840.method2340((byte) -120, arg0.field2511);
        class189.field2840.method2321(arg2.field2592, (byte) 120);
        class189.field2840.method2340((byte) -95, arg2.field2511);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lef;B)V")
    public final void method783(class385 arg0, byte arg1) {
        if (arg1 != -117) {
            this.method778(-83, (String) null);
        }
        while (true) {
            int var3 = arg0.method2343(arg1 ^ 0xFFFFFF74);
            if (var3 == 0) {
                field1682++;
                return;
            }
            this.method785((byte) 109, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    private final void method784(byte arg0) {
        this.field1689 = new class382(this.field1683.method2297(false));
        field1678++;
        class350 var2 = (class350) this.field1683.method2296(5773);
        if (arg0 != -32) {
            this.method785((byte) 74, (class385) null, -60);
        }
        while (var2 != null) {
            class350 var3 = new class350((int) var2.field1339);
            this.field1689.method2301(112, var3, (long) var2.field5202);
            var2 = (class350) this.field1683.method2304(100);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLef;I)V")
    private final void method785(byte arg0, class385 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1677 = class398.method2517(arg1.method2341((byte) 54), (byte) -108);
        } else if (arg2 == 2) {
            this.field1687 = class398.method2517(arg1.method2341((byte) 54), (byte) 117);
        } else if (arg2 == 3) {
            this.field1676 = arg1.method2332(86);
        } else if (arg2 == 4) {
            this.field1681 = arg1.method2354(255);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2323(-91);
            this.field1683 = new class382(class196.method1174(93, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2354(255);
                class97 var7;
                if (arg2 == 5) {
                    var7 = new class435(arg1.method2332(105));
                } else {
                    var7 = new class350(arg1.method2354(255));
                }
                this.field1683.method2301(37, var7, (long) var6);
            }
        }
        field1673++;
        if (arg0 <= 102) {
            this.field1689 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
    public static void method786(int arg0) {
        if (arg0 != -6) {
            method782((class170) null, 49, (class170) null);
        }
        field1688 = null;
        field1690 = null;
        field1675 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IB)Z")
    public final boolean method787(int arg0, byte arg1) {
        field1679++;
        if (this.field1683 == null) {
            return false;
        }
        if (this.field1689 == null) {
            this.method784((byte) -32);
        }
        class350 var3 = (class350) this.field1689.method2302((long) arg0, 23576);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 < 115) {
                this.method783((class385) null, (byte) 40);
            }
            return true;
        }
    }
}
