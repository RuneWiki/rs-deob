import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class40 extends class179 {

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "Lke;")
    public static class256 field725 = class316.method2202("::tele ", 27626);

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "Z")
    public static boolean field728 = false;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field727 = -1;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Lvm;")
    public static class297 field719 = new class297(4);

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field722;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lj;")
    public static class227 field733;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 4)
    public class40() {
        this(0);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V", line = 22)
    private class40(int arg0) {
        super(0, false);
        this.method301(arg0, -128);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V", line = 31)
    private final void method301(int arg0, int arg1) {
        field726++;
        this.field722 = (arg0 & 0xFF0000) >> 12;
        this.field732 = (arg0 & 0xFF00) >> 4;
        if (arg1 >= -49) {
            this.field722 = 40;
        }
        this.field730 = arg0 & 0xFF << 4;
    }

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "(I)I", line = 49)
    public static final int method302(int arg0) {
        if (arg0 != 1001) {
            field734 = 52;
        }
        field723++;
        return 2;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[[I", line = 63)
    public final int[][] method55(int arg0, int arg1) {
        field720++;
        if (arg0 != 75) {
            this.field732 = 8;
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class161.field2858; var7++) {
                var4[var7] = this.field722;
                var6[var7] = this.field732;
                var5[var7] = this.field730;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "(I)V", line = 101)
    public static void method303(int arg0) {
        field719 = null;
        field733 = null;
        if (arg0 != 8) {
            field725 = (class256) null;
        }
        field725 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILra;I)V", line = 113)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 > 108) {
            if (arg2 == 0) {
                this.method301(arg1.method349((byte) 83), -97);
            }
            field718++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V", line = 140)
    public static final void method304(int arg0, byte arg1) {
        class17.field225.method2075(arg0, 1);
        field721++;
        int var2 = -19 / ((arg1 + 24) / 39);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)I", line = 169)
    public static final int method305(byte arg0) {
        if (arg0 < 70) {
            return -29;
        }
        field729++;
        try {
            if (class182.field3229 == 0) {
                if (class166.field2938 > class224.method1536(false) - 5000L) {
                    return 0;
                }
                class98.field1754 = class272.field4658.method32(class320.field5490, (byte) 120, class200.field3652);
                class318.field5473 = class224.method1536(false);
                class182.field3229 = 1;
            }
            if (class318.field5473 + 30000L < class224.method1536(false)) {
                return class146.method1071(1000, -110);
            }
            if (class182.field3229 == 1) {
                if (class98.field1754.field1500 == 2) {
                    return class146.method1071(1001, -89);
                }
                if (class98.field1754.field1500 != 1) {
                    return -1;
                }
                class196.field3586 = new class243((Socket) class98.field1754.field1499, class272.field4658);
                class308.field5322.field738 = 0;
                class98.field1754 = null;
                int var1 = 0;
                if (class303.field5241) {
                    var1 = class172.field3061;
                }
                class308.field5322.method308(0, -2);
                class308.field5322.method365((byte) -32, var1);
                class196.field3586.method1636((byte) 20, 0, class308.field5322.field772, class308.field5322.field738);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                int var2 = class196.field3586.method1629(0);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                if (var2 != 0) {
                    return class146.method1071(var2, -116);
                }
                class182.field3229 = 2;
            }
            if (class182.field3229 == 2) {
                if (class196.field3586.method1633((byte) -5) < 2) {
                    return -1;
                }
                class105.field1886 = class196.field3586.method1629(0);
                class105.field1886 <<= 0x8;
                class105.field1886 += class196.field3586.method1629(0);
                class270.field4615 = new byte[class105.field1886];
                class182.field3229 = 3;
                class292.field5059 = 0;
            }
            if (class182.field3229 != 3) {
                return -1;
            }
            int var3 = class196.field3586.method1633((byte) -5);
            if (var3 < 1) {
                return -1;
            }
            if ((class105.field1886 - class292.field5059) < var3) {
                var3 = class105.field1886 - class292.field5059;
            }
            class196.field3586.method1635(class292.field5059, class270.field4615, var3, -1078);
            class292.field5059 += var3;
            if (class292.field5059 < class105.field1886) {
                return -1;
            } else if (class141.method1034((byte) 123, class270.field4615)) {
                int var4 = 0;
                class288.field4988 = new class182[class88.field1580];
                for (int var5 = class163.field2891; var5 <= class14.field190; var5++) {
                    class182 var6 = class84.method622(false, var5);
                    if (var6 != null) {
                        class288.field4988[var4++] = var6;
                    }
                }
                class196.field3586.method1627(109);
                class196.field3586 = null;
                class182.field3229 = 0;
                class273.field4733 = 0;
                class270.field4615 = null;
                class166.field2938 = class224.method1536(false);
                return 0;
            } else {
                return class146.method1071(1002, -87);
            }
        } catch (IOException var8) {
            return class146.method1071(1003, -128);
        }
    }
}
