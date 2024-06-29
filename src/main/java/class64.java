import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class64 {

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    private int[] field1173 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Z")
    public boolean field1176 = false;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field1175 = -1;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    private int[] field1168;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[S")
    private short[] field1170;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "[S")
    private short[] field1180;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "[S")
    private short[] field1181;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "[S")
    private short[] field1185;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[[[B")
    public static byte[][][] field1167;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Z")
    public final boolean method402(boolean arg0) {
        field1166++;
        if (this.field1168 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field1168.length; var3++) {
            if (!class230.field4024.method870(0, (byte) -48, this.field1168[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Lrj;")
    public final class93 method403(int arg0) {
        int var2 = 0;
        class93[] var3 = new class93[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1173[var4] != -1) {
                var3[var2++] = class93.method572(class230.field4024, this.field1173[var4], 0);
            }
        }
        class93 var5 = new class93(var3, var2);
        if (this.field1185 != null) {
            for (int var6 = 0; var6 < this.field1185.length; var6++) {
                var5.method553(this.field1185[var6], this.field1170[var6]);
            }
        }
        if (arg0 != -1) {
            return null;
        }
        if (this.field1181 != null) {
            for (int var7 = 0; var7 < this.field1181.length; var7++) {
                var5.method549(this.field1181[var7], this.field1180[var7]);
            }
        }
        field1179++;
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
    public static final void method404(boolean arg0, byte arg1) {
        field1183++;
        for (int var2 = 0; var2 < class71.field1254; var2++) {
            class195 var3 = class220.field3715[class146.field2517[var2]];
            long var4 = (long) class146.field2517[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method14((byte) -35) && arg0 == var3.field3315.field2551 && var3.field3315.method928(false)) {
                int var6 = var3.field50 >> 7;
                int var7 = var3.field99 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field45 == 1 && (var3.field50 & 0x7F) == 64 && (var3.field99 & 0x7F) == 64) {
                        if (class78.field1376[var6][var7] == class87.field1508) {
                            continue;
                        }
                        class78.field1376[var6][var7] = class87.field1508;
                    }
                    if (!var3.field3315.field2562) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field74 = class193.method1227(var3.field50 + ((var3.field45 - 1) * 64), true, field1171, var3.field45 * 64 + var3.field99 - 64);
                    class167.method1030(field1171, var3.field50, var3.field99, var3.field74, var3.field45 * 64 + 60 - 64, var3, var3.field106, var4, var3.field103);
                }
            }
        }
        if (arg1 != 6) {
            method410((byte) 64);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z")
    public final boolean method405(byte arg0) {
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 114) {
            return true;
        }
        while (var3 < 5) {
            if (this.field1173[var3] != -1 && !class230.field4024.method870(0, (byte) -48, this.field1173[var3])) {
                var2 = false;
            }
            var3++;
        }
        field1184++;
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method406(Component arg0, int arg1) {
        if (arg1 > -73) {
            method406((Component) null, 2);
        }
        arg0.addMouseListener(class61.field1121);
        field1177++;
        arg0.addMouseMotionListener(class61.field1121);
        arg0.addFocusListener(class61.field1121);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)Lrj;")
    public final class93 method407(byte arg0) {
        field1182++;
        if (this.field1168 == null) {
            return null;
        }
        class93[] var2 = new class93[this.field1168.length];
        for (int var3 = 0; var3 < this.field1168.length; var3++) {
            var2[var3] = class93.method572(class230.field4024, this.field1168[var3], 0);
        }
        int var4 = -20 / ((37 - arg0) / 63);
        class93 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class93(var2, var2.length);
        }
        if (this.field1185 != null) {
            for (int var6 = 0; var6 < this.field1185.length; var6++) {
                var5.method553(this.field1185[var6], this.field1170[var6]);
            }
        }
        if (this.field1181 != null) {
            for (int var7 = 0; var7 < this.field1181.length; var7++) {
                var5.method549(this.field1181[var7], this.field1180[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lnj;I)V")
    public final void method408(class226 arg0, int arg1) {
        field1169++;
        if (arg1 != 0) {
            this.method407((byte) 57);
        }
        while (true) {
            int var3 = arg0.method1471(255);
            if (var3 == 0) {
                return;
            }
            this.method409(var3, 9351, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILnj;)V")
    private final void method409(int arg0, int arg1, class226 arg2) {
        if (arg0 == 1) {
            this.field1175 = arg2.method1471(255);
        } else if (arg0 == 2) {
            int var8 = arg2.method1471(255);
            this.field1168 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1168[var9] = arg2.method1447(0);
            }
        } else if (arg0 == 3) {
            this.field1176 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1471(255);
            this.field1185 = new short[var4];
            this.field1170 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1185[var5] = (short) arg2.method1447(0);
                this.field1170[var5] = (short) arg2.method1447(0);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1471(arg1 ^ 0x2478);
            this.field1181 = new short[var6];
            this.field1180 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1181[var7] = (short) arg2.method1447(0);
                this.field1180[var7] = (short) arg2.method1447(0);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1173[arg0 - 60] = arg2.method1447(0);
        }
        field1174++;
        if (arg1 != 9351) {
            this.field1170 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public static void method410(byte arg0) {
        if (arg0 < 21) {
            field1178 = 60;
        }
        field1167 = null;
    }
}
