import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class450 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Ljava/lang/String;")
    private String field6684 = "null";

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[I")
    public static int[] field6692 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lmf;")
    public static class291 field6685 = new class291();

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Ls;")
    public static class186 field6694 = new class186(101, 9);

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lbj;")
    public static class162 field6696 = new class162(0, 11);

    @OriginalMember(owner = "client!am", name = "e", descriptor = "C")
    public char field6683;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "C")
    public char field6689;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    private int field6688;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lmn;")
    private class249 field6680;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Lmn;")
    public class249 field6695;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Lhf;")
    public static class273 field6699;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 4)
    private final void method2685(int arg0) {
        field6691++;
        this.field6680 = new class249(this.field6695.method1617(false));
        if (arg0 != -6) {
            method2691((byte) -33);
        }
        for (class100 var2 = (class100) this.field6695.method1615(0); var2 != null; var2 = (class100) this.field6695.method1621((byte) -121)) {
            class100 var3 = new class100((int) var2.field3977);
            this.field6680.method1618(var3, (long) var2.field1923, -1);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLnn;)V", line = 26)
    public final void method2686(byte arg0, class289 arg1) {
        field6690++;
        int var3 = 56 / ((arg0 - 56) / 51);
        while (true) {
            int var4 = arg1.method1858(-3256);
            if (var4 == 0) {
                return;
            }
            this.method2694(arg1, 2, var4);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I", line = 46)
    public final int method2687(byte arg0, int arg1) {
        field6681++;
        if (this.field6695 == null) {
            return this.field6688;
        }
        if (arg0 >= -67) {
            this.method2692((byte) 13, 24);
        }
        class100 var3 = (class100) this.field6695.method1622((long) arg1, -128);
        return var3 == null ? this.field6688 : var3.field1923;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method2688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6687++;
        class18 var5 = class140.method1047(4, arg4, false);
        var5.method122(true);
        if (arg0 != 9454) {
            field6696 = null;
        }
        var5.field283 = arg2;
        var5.field291 = arg1;
        var5.field284 = arg3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 102)
    public final boolean method2689(int arg0, String arg1) {
        field6679++;
        if (this.field6695 == null) {
            return false;
        } else if (arg0 < 99) {
            return true;
        } else {
            if (this.field6680 == null) {
                this.method2693(true);
            }
            for (class264 var3 = (class264) this.field6680.method1622(class525.method3104(arg1, (byte) 42), 79); var3 != null; var3 = (class264) this.field6680.method1620(-31)) {
                if (var3.field4028.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(BI)Ljava/lang/String;", line = 132)
    public final String method2690(byte arg0, int arg1) {
        field6686++;
        if (this.field6695 == null) {
            return this.field6684;
        }
        if (arg0 != -35) {
            method2691((byte) 26);
        }
        class268 var3 = (class268) this.field6695.method1622((long) arg1, -109);
        return var3 == null ? this.field6684 : var3.field4061;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 151)
    public static void method2691(byte arg0) {
        field6696 = null;
        field6685 = null;
        field6694 = null;
        field6692 = null;
        field6699 = null;
        if (arg0 != -12) {
            field6696 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(BI)Z", line = 174)
    public final boolean method2692(byte arg0, int arg1) {
        field6697++;
        if (this.field6695 == null) {
            return false;
        }
        if (this.field6680 == null) {
            this.method2685(-6);
        }
        class100 var3 = (class100) this.field6680.method1622((long) arg1, 57);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 <= 35) {
                this.method2689(-75, null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 203)
    private final void method2693(boolean arg0) {
        field6682++;
        this.field6680 = new class249(this.field6695.method1617(false));
        if (!arg0) {
            this.method2694(null, -40, 34);
        }
        for (class268 var2 = (class268) this.field6695.method1615(0); var2 != null; var2 = (class268) this.field6695.method1621((byte) 112)) {
            class264 var3 = new class264(var2.field4061, (int) var2.field3977);
            this.field6680.method1618(var3, class525.method3104(var2.field4061, (byte) 42), -1);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lnn;II)V", line = 227)
    private final void method2694(class289 arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 1) {
            this.field6689 = class289.method1878(79, arg0.method1816(true));
        } else if (arg2 == 2) {
            this.field6683 = class289.method1878(98, arg0.method1816(true));
        } else if (arg2 == 3) {
            this.field6684 = arg0.method1834(-17823);
        } else if (arg2 == 4) {
            this.field6688 = arg0.method1815((byte) -84);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1841((byte) -126);
            this.field6695 = new class249(class184.method1256(var4, (byte) 119));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1815((byte) -77);
                class261 var7;
                if (arg2 == 5) {
                    var7 = new class268(arg0.method1834(-17823));
                } else {
                    var7 = new class100(arg0.method1815((byte) -91));
                }
                this.field6695.method1618(var7, (long) var6, -1);
            }
        }
        field6698++;
    }
}
