import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class471 {

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public int field6969 = 16;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public int field6972 = 0;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public int field6982 = 128;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
    public boolean field6983 = true;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field6978 = -1;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
    public boolean field6980 = false;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public int field6981 = 1190717;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public int field6975 = -1;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Z")
    public boolean field6976 = true;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public int field6987 = 127;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public int field6986 = -1;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public int field6991 = 8;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "[Ldl;")
    public static class48[] field6979 = new class48[14];

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "Llo;")
    public static class306 field6988 = new class306("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public int field6984;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "Lul;")
    public static class332 field6995;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Luo;")
    public class468 field6989;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Lqs;")
    public static class496 field6971;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "[I")
    public static int[] field6985;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public static void method2787(byte arg0) {
        field6979 = null;
        field6995 = null;
        field6971 = null;
        if (arg0 == 56) {
            field6985 = null;
            field6988 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2788(String arg0, byte arg1) {
        field6977++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class162.method1121(arg0, 1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        int var4 = 70 / ((53 - arg1) / 54);
        while (class14.field160 > var3) {
            String var5 = class322.field5057[var3];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class162.method1121(var5, 1);
            if (var6 != null && var6.equals(var2)) {
                class14.field160--;
                for (int var7 = var3; var7 < class14.field160; var7++) {
                    class322.field5057[var7] = class322.field5057[var7 + 1];
                    class60.field918[var7] = class60.field918[var7 + 1];
                    class376.field5861[var7] = class376.field5861[var7 + 1];
                    class253.field4309[var7] = class253.field4309[var7 + 1];
                    class212.field3375[var7] = class212.field3375[var7 + 1];
                }
                class438.field6537++;
                class172.field2753 = class78.field1368;
                class265.method1775(-2, class275.field4523);
                class261.field4357.method163(class323.method2037(arg0, -1), (byte) 49);
                class261.field4357.method145(arg0, (byte) 0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lia;BI)V")
    private final void method2789(class23 arg0, byte arg1, int arg2) {
        if (arg1 != -68) {
            this.field6981 = 80;
        }
        if (arg2 == 1) {
            this.field6972 = class164.method1128((byte) -123, arg0.method181(97));
        } else if (arg2 == 2) {
            this.field6986 = arg0.method126((byte) -104);
        } else if (arg2 == 3) {
            this.field6986 = arg0.method132(124);
            if (this.field6986 == 65535) {
                this.field6986 = -1;
            }
        } else if (arg2 == 5) {
            this.field6983 = false;
        } else if (arg2 == 7) {
            this.field6975 = class164.method1128((byte) -123, arg0.method181(126));
        } else if (arg2 == 8) {
            this.field6989.field6956 = this.field6984;
        } else if (arg2 == 9) {
            this.field6982 = arg0.method132(109) << 0;
        } else if (arg2 == 10) {
            this.field6976 = false;
        } else if (arg2 == 11) {
            this.field6991 = arg0.method126((byte) -119);
        } else if (arg2 == 12) {
            this.field6980 = true;
        } else if (arg2 == 13) {
            this.field6981 = arg0.method181(124);
        } else if (arg2 == 14) {
            this.field6969 = arg0.method126((byte) -110) << 0;
        } else if (arg2 == 15) {
            this.field6978 = arg0.method132(arg1 + 98);
            if (this.field6978 == 65535) {
                this.field6978 = -1;
            }
        } else if (arg2 == 16) {
            this.field6987 = arg0.method126((byte) -109);
        }
        field6993++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public final void method2790(int arg0) {
        this.field6991 = this.field6984 | this.field6991 << 8;
        if (arg0 == -13831) {
            if (this.field6978 == -1) {
                this.field6978 = this.field6986;
            }
            field6992++;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILia;)V")
    public final void method2791(int arg0, class23 arg1) {
        field6973++;
        while (true) {
            int var3 = arg1.method126((byte) -77);
            if (var3 == 0) {
                if (arg0 == 14) {
                    return;
                } else {
                    this.field6991 = 112;
                    return;
                }
            }
            this.method2789(arg1, (byte) -68, var3);
        }
    }
}
