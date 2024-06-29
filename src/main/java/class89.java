import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class89 {

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
    private int[] field1033 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public int field1039 = -1;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Z")
    public boolean field1037 = false;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1026 = new String[100];

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "[I")
    public static int[] field1028 = new int[6];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lhm;")
    public static class330 field1027;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[I")
    private int[] field1034;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[I")
    public static int[] field1040;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1042;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[S")
    private short[] field1025;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[S")
    private short[] field1032;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[S")
    private short[] field1035;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "[S")
    private short[] field1041;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method551(int arg0) {
        field1031++;
        if (this.field1034 == null) {
            return true;
        }
        boolean var2 = true;
        class285 var3 = class6.field41;
        synchronized (class6.field41) {
            for (int var4 = 0; var4 < this.field1034.length; var4++) {
                if (!class6.field41.method1803(true, 0, this.field1034[var4])) {
                    var2 = false;
                }
            }
            return arg0 == -1 ? var2 : true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lhf;", line = 38)
    public final class402 method552(int arg0) {
        if (arg0 != -30898) {
            this.method551(-80);
        }
        field1024++;
        class402[] var2 = new class402[5];
        int var3 = 0;
        class285 var4 = class6.field41;
        synchronized (class6.field41) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field1033[var5] != -1) {
                    var2[var3++] = class147.method952((byte) -81, this.field1033[var5], class6.field41, 0);
                }
            }
        }
        class402 var6 = new class402(var2, var3);
        if (this.field1032 != null) {
            for (int var7 = 0; var7 < this.field1032.length; var7++) {
                var6.method2500(this.field1032[var7], this.field1035[var7], 38);
            }
        }
        if (this.field1041 != null) {
            for (int var8 = 0; var8 < this.field1041.length; var8++) {
                var6.method2508(this.field1041[var8], (byte) 121, this.field1025[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 118)
    public static void method553(int arg0) {
        field1040 = null;
        field1042 = null;
        field1028 = null;
        field1026 = null;
        if (arg0 == -1) {
            field1027 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILbg;)V", line = 132)
    private final void method554(boolean arg0, int arg1, class242 arg2) {
        if (arg1 == 1) {
            this.field1039 = arg2.method1563(-128);
        } else if (arg1 == 2) {
            int var4 = arg2.method1563(-128);
            this.field1034 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1034[var5] = arg2.method1587((byte) -102);
            }
        } else if (arg1 == 3) {
            this.field1037 = true;
        } else if (arg1 == 40) {
            int var8 = arg2.method1563(-128);
            this.field1035 = new short[var8];
            this.field1032 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1032[var9] = (short) arg2.method1587((byte) -102);
                this.field1035[var9] = (short) arg2.method1587((byte) -102);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1563(-128);
            this.field1025 = new short[var6];
            this.field1041 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1041[var7] = (short) arg2.method1587((byte) -102);
                this.field1025[var7] = (short) arg2.method1587((byte) -102);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1033[arg1 - 60] = arg2.method1587((byte) -102);
        }
        if (!arg0) {
            field1023++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Lhf;", line = 209)
    public final class402 method555(int arg0) {
        field1036++;
        if (this.field1034 == null) {
            return null;
        }
        class402[] var2 = new class402[this.field1034.length];
        if (arg0 < 124) {
            this.method555(92);
        }
        class285 var3 = class6.field41;
        synchronized (class6.field41) {
            int var4 = 0;
            while (true) {
                if (this.field1034.length <= var4) {
                    break;
                }
                var2[var4] = class147.method952((byte) -81, this.field1034[var4], class6.field41, 0);
                var4++;
            }
        }
        class402 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class402(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1032 != null) {
            for (int var6 = 0; var6 < this.field1032.length; var6++) {
                var5.method2500(this.field1032[var6], this.field1035[var6], -79);
            }
        }
        if (this.field1041 != null) {
            for (int var7 = 0; var7 < this.field1041.length; var7++) {
                var5.method2508(this.field1041[var7], (byte) -110, this.field1025[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z", line = 271)
    public final boolean method556(byte arg0) {
        field1030++;
        int var2 = -99 % ((arg0 + 3) / 59);
        boolean var3 = true;
        class285 var4 = class6.field41;
        synchronized (class6.field41) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field1033[var5] != -1 && !class6.field41.method1803(true, 0, this.field1033[var5])) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lbg;I)V", line = 301)
    public final void method557(class242 arg0, int arg1) {
        field1029++;
        int var3 = -27 % ((15 - arg1) / 47);
        while (true) {
            int var4 = arg0.method1563(-128);
            if (var4 == 0) {
                return;
            }
            this.method554(false, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V", line = 331)
    public static final void method558(int arg0, int arg1) {
        field1038++;
        if (arg0 != 0) {
            field1040 = null;
        }
        class365 var2 = class287.field3780;
        synchronized (class287.field3780) {
            class287.field3780.method2286(arg1, (byte) 36);
        }
    }
}
