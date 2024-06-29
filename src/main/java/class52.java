import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class52 extends class25 {

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Ldf;")
    private class51 field886 = class33.field481;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Ldf;")
    public static class51 field885 = class46.method233(" zuerst von Ihrer Freunde)2Liste(Q", 100);

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field877 = 500;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Lhc;")
    private class212 field871;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Lhc;")
    private class212 field883;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Lja;")
    public static class55 field882;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    private final void method322(boolean arg0) {
        field887++;
        this.field883 = new class212(this.field871.method1450((byte) -16));
        if (!arg0) {
            this.method325(-85);
        }
        for (class120 var2 = (class120) this.field871.method1451(59); var2 != null; var2 = (class120) this.field871.method1449(-1)) {
            class63 var3 = new class63(var2.field1998, (int) var2.field1760);
            this.field883.method1447(-112, var2.field1998.method299(-91), var3);
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static void method323(byte arg0) {
        field882 = null;
        field885 = null;
        int var1 = -96 / ((arg0 + 14) / 38);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Llb;IB)V")
    private final void method324(class121 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field891 = arg0.method897(-31);
        } else if (arg1 == 2) {
            this.field893 = arg0.method897(-49);
        } else if (arg1 == 3) {
            this.field886 = arg0.method903((byte) 108);
        } else if (arg1 == 4) {
            this.field896 = arg0.method865((byte) 8);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method876(false);
            this.field871 = new class212(class184.method1302(var4, -12820));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method865((byte) 8);
                class107 var7;
                if (arg1 == 5) {
                    var7 = new class120(arg0.method903((byte) 108));
                } else {
                    var7 = new class255(arg0.method865((byte) 8));
                }
                this.field871.method1447(-98, (long) var6, var7);
            }
        }
        if (arg2 < 64) {
            this.field883 = null;
        }
        field890++;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    private final void method325(int arg0) {
        field878++;
        this.field883 = new class212(this.field871.method1450((byte) -16));
        for (class255 var2 = (class255) this.field871.method1451(-92); var2 != null; var2 = (class255) this.field871.method1449(-1)) {
            class255 var4 = new class255((int) var2.field1760);
            this.field883.method1447(94, (long) var2.field4454, var4);
        }
        int var3 = -70 / ((77 - arg0) / 37);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILlb;)V")
    public final void method326(int arg0, class121 arg1) {
        while (true) {
            int var3 = arg1.method897(arg0 ^ 0xBC613B);
            if (var3 == 0) {
                if (arg0 != 12345678) {
                    return;
                }
                field892++;
                return;
            }
            this.method324(arg1, var3, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILdf;)Z")
    public final boolean method327(int arg0, class51 arg1) {
        field872++;
        if (this.field871 == null) {
            return false;
        }
        if (arg0 != 23870) {
            field874 = 119;
        }
        if (this.field883 == null) {
            this.method322(true);
        }
        for (class63 var3 = (class63) this.field883.method1453(arg1.method299(-91), 1); var3 != null; var3 = (class63) this.field883.method1446(false)) {
            if (var3.field1020.method315(false, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)I")
    public final int method328(int arg0, int arg1) {
        field881++;
        if (this.field871 == null) {
            return this.field896;
        }
        class255 var3 = (class255) this.field871.method1453((long) arg1, 1);
        if (var3 == null) {
            return this.field896;
        } else {
            if (arg0 >= -119) {
                this.field896 = 77;
            }
            return var3.field4454;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public static final void method329(int arg0) {
        field875++;
        if (arg0 <= 83) {
            method329(-75);
        }
        class261.field4561.method1350((byte) 122);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)Z")
    public final boolean method330(boolean arg0, int arg1) {
        field879++;
        if (this.field871 == null) {
            return false;
        }
        if (this.field883 == null) {
            this.method325(127);
        }
        if (!arg0) {
            field895 = 40;
        }
        class255 var3 = (class255) this.field883.method1453((long) arg1, 1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method331(boolean arg0, String arg1) throws ClassNotFoundException {
        field873++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (!arg0) {
                field877 = 125;
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lu;BLu;)V")
    public static final void method332(class111 arg0, byte arg1, class111 arg2) {
        if (arg1 >= -3) {
            method329(-74);
        }
        class115.field1950 = arg2;
        class47.field746 = arg0;
        field894++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
    public static final int method333(int arg0, int arg1, byte arg2) {
        field880++;
        if (arg1 == -2) {
            return 12345678;
        }
        int var3 = 45 / ((arg2 + 59) / 33);
        if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var4 = (arg1 & 0x7F) * arg0 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg1 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Ldf;")
    public final class51 method334(int arg0, byte arg1) {
        field888++;
        if (this.field871 == null) {
            return this.field886;
        } else if (arg1 == 41) {
            class120 var3 = (class120) this.field871.method1453((long) arg0, 1);
            return var3 == null ? this.field886 : var3.field1998;
        } else {
            return null;
        }
    }
}
