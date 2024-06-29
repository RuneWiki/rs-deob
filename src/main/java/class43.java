import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 implements class122 {

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Lm;")
    private class83 field1113 = new class83();

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    private int field1116 = 0;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    private int field1117 = 128;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "D")
    private double field1119 = 1.0D;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "Ldd;")
    private class26 field1114;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[Lv;")
    private class146[] field1101;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lic;")
    public static class59 field1100 = class59.method433(0, "Abbrechen");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lic;")
    private static class59 field1103 = class59.method433(0, "Type");

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lic;")
    public static class59 field1109 = class59.method433(0, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1107 = 99;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lic;")
    public static class59 field1111 = class59.method433(0, "Versteckt");

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lic;")
    private static class59 field1108 = class59.method433(0, "This world is full)3");

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lic;")
    public static class59 field1094 = field1108;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lic;")
    public static class59 field1118 = field1103;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lt;")
    public static class132 field1090;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lub;")
    public static class141 field1105;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
    public final boolean method323(int arg0, int arg1) {
        field1091++;
        if (arg0 != -1527) {
            method331(-93, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public final void method324(byte arg0) {
        field1095++;
        for (int var2 = 0; var2 < this.field1101.length; var2++) {
            if (this.field1101[var2] != null) {
                this.field1101[var2].method1087();
            }
        }
        if (arg0 > -7) {
            this.method329(-115, -0.5814938217611125D);
        }
        this.field1113 = new class83();
        this.field1116 = this.field1115;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
    public final int method325(int arg0, int arg1) {
        if (arg0 != -12699) {
            this.method323(-29, 119);
        }
        field1099++;
        return this.field1101[arg1] == null ? 0 : this.field1101[arg1].field3174;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method326(boolean arg0) {
        field1094 = null;
        if (arg0) {
            return;
        }
        field1105 = null;
        field1090 = null;
        field1109 = null;
        field1111 = null;
        field1108 = null;
        field1118 = null;
        field1103 = null;
        field1100 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)[I")
    public final int[] method327(int arg0, int arg1) {
        if (arg1 != 7048) {
            this.method327(-110, -6);
        }
        field1096++;
        class146 var3 = this.field1101[arg0];
        if (var3 != null) {
            if (var3.field3181 != null) {
                this.field1113.method679(true, var3);
                var3.field3175 = true;
                return var3.field3181;
            }
            boolean var4 = var3.method1088(this.field1119, this.field1117, this.field1114);
            if (var4) {
                if (this.field1116 == 0) {
                    class146 var5 = (class146) this.field1113.method683(true);
                    var5.method1087();
                } else {
                    this.field1116--;
                }
                this.field1113.method679(true, var3);
                var3.field3175 = true;
                return var3.field3181;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)Z")
    public final boolean method328(boolean arg0, int arg1) {
        if (!arg0) {
            this.method325(-10, -2);
        }
        field1104++;
        return this.field1117 == 64;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ID)V")
    public final void method329(int arg0, double arg1) {
        field1102++;
        if (arg0 != 0) {
            this.field1119 = -0.9566111159602564D;
        }
        this.field1119 = arg1;
        this.method324((byte) -105);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IZ)V")
    public final void method330(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1101.length; var3++) {
            class146 var4 = this.field1101[var3];
            if (var4 != null && var4.field3172 != 0 && var4.field3175) {
                var4.method1086(arg0);
                var4.field3175 = false;
            }
        }
        field1106++;
        if (arg1) {
            this.method328(true, 18);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILwd;)V")
    public static final void method331(int arg0, class157 arg1) {
        byte[] var2 = new byte[24];
        field1110++;
        int var3 = -33 / (-arg0 / 42);
        if (class157.field3446 != null) {
            try {
                int var4 = 0;
                class157.field3446.method511(-24756, 0L);
                class157.field3446.method502(var2, -127);
                while (var4 < 24 && var2[var4] == 0) {
                    var4++;
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1193(var2, 0, 255, 24);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)Z")
    public final boolean method332(int arg0, boolean arg1) {
        if (arg1) {
            field1093++;
            return this.field1101[arg0].field3182;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ldd;Ldd;IDI)V")
    public class43(class26 arg0, class26 arg1, int arg2, double arg3, int arg4) {
        this.field1119 = arg3;
        this.field1117 = arg4;
        this.field1114 = arg1;
        this.field1115 = arg2;
        this.field1116 = this.field1115;
        int[] var7 = arg0.method190(0, false);
        int var8 = var7.length;
        this.field1101 = new class146[arg0.method181(0, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class157 var10 = new class157(arg0.method193(false, var7[var9], 0));
            this.field1101[var7[var9]] = new class146(var10);
        }
    }
}
