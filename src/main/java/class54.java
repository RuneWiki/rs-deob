import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class54 extends class71 {

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    private int field1173 = 0;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    private int field1178 = 0;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    private int field1181 = 1365;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    private int field1179 = 20;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Lud;")
    private static class279 field1182 = class130.method1024("glow1:", 255);

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "Lud;")
    public static class279 field1175 = field1182;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Lud;")
    public static class279 field1172 = field1182;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "Lhc;")
    public static class171 field1183 = new class171(64);

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "[I")
    public static int[] field1188 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "Ldg;")
    public static class317 field1186 = new class317();

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "Lud;")
    private static class279 field1190 = class130.method1024("Attack", 255);

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "Lud;")
    public static class279 field1192 = field1190;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lok;")
    public static class149 field1187;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 4)
    public static void method506(byte arg0) {
        field1172 = null;
        field1192 = null;
        field1186 = null;
        field1182 = null;
        field1190 = null;
        field1183 = null;
        field1188 = null;
        field1187 = null;
        int var1 = -14 % ((arg0 + 67) / 35);
        field1175 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lbd;I)V", line = 22)
    public static final void method507(class305 arg0, int arg1) {
        class303 var2 = null;
        try {
            if (arg1 != -6) {
                return;
            }
            class206 var3 = arg0.method2166("runescape", (byte) 38);
            while (var3.field3655 == 0) {
                class204.method1510(1L, 1);
            }
            if (var3.field3655 == 1) {
                var2 = (class303) var3.field3657;
                class53 var4 = class96.method799((byte) 31);
                var2.method2148((byte) -116, 0, var4.field1168, var4.field1142);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2149(true);
            }
        } catch (Exception var7) {
        }
        field1180++;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V", line = 70)
    public static final void method508(int arg0) {
        field1174++;
        int var1 = (class21.field589 >> 10) + (class112.field2058 >> 3);
        int var2 = (class92.field1747 >> 10) + (class12.field396 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class122.field2204 = new byte[var6][];
        class77.field1493 = new int[var6];
        class62.field1270 = new int[var6];
        class226.field3976 = new int[var6];
        class74.field1468 = new int[var6];
        class238.field4170 = new byte[var6][];
        class28.field676 = new int[var6];
        class102.field1911 = new int[var6][4];
        class237.field4133 = new byte[var6][];
        class309.field5488 = new int[var6];
        class297.field5280 = new byte[var6][];
        class7.field147 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class77.field1493[var7] = var10;
                class74.field1468[var7] = class295.field5259.method1167(class115.method929(new class279[] { class84.field1598, class191.method1447(5, var8), class229.field3987, class191.method1447(5, var9) }, (byte) 60), 92);
                class28.field676[var7] = class295.field5259.method1167(class115.method929(new class279[] { class265.field4780, class191.method1447(5, var8), class229.field3987, class191.method1447(5, var9) }, (byte) 60), 126);
                class226.field3976[var7] = class295.field5259.method1167(class115.method929(new class279[] { class113.field2075, class191.method1447(5, var8), class229.field3987, class191.method1447(5, var9) }, (byte) 60), 114);
                class309.field5488[var7] = class295.field5259.method1167(class115.method929(new class279[] { class304.field5392, class191.method1447(5, var8), class229.field3987, class191.method1447(5, var9) }, (byte) 60), 101);
                class62.field1270[var7] = class295.field5259.method1167(class115.method929(new class279[] { class18.field565, class191.method1447(5, var8), class229.field3987, class191.method1447(5, var9) }, (byte) 60), 104);
                if (class226.field3976[var7] == -1) {
                    class74.field1468[var7] = -1;
                    class28.field676[var7] = -1;
                    class309.field5488[var7] = -1;
                    class62.field1270[var7] = -1;
                }
                var7++;
            }
        }
        int var11 = var7;
        if (arg0 < 64) {
            method510(115);
        }
        while (var11 < class226.field3976.length) {
            class226.field3976[var11] = -1;
            class74.field1468[var11] = -1;
            class28.field676[var11] = -1;
            class309.field5488[var11] = -1;
            class62.field1270[var11] = -1;
            var11++;
        }
        class72.method629(var3, var4, -28589, true, var2, var1, var5);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIZ)Lud;", line = 155)
    public static final class279 method509(boolean arg0, int arg1, boolean arg2) {
        if (arg0) {
            return (class279) null;
        } else {
            field1185++;
            return class297.method2099(10, arg2, !arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 174)
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)[Lom;", line = 178)
    public static final class70[] method510(int arg0) {
        field1176++;
        class70[] var1 = new class70[class244.field4329];
        if (arg0 != 255) {
            return (class70[]) null;
        }
        for (int var2 = 0; var2 < class244.field4329; var2++) {
            int var3 = class115.field2097[var2] * class1.field92[var2];
            byte[] var4 = class113.field2080[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class217.field3839[class52.method442(var4[var6], 255)];
            }
            if (class97.field1824) {
                var1[var2] = new class203(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var5);
            } else {
                var1[var2] = new class66(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var5);
            }
        }
        class162.method1278(false);
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLvh;)V", line = 225)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            field1172 = (class279) null;
        }
        if (arg0 == 0) {
            this.field1181 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field1179 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1178 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field1173 = arg2.method468(28214);
        }
        field1177++;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(III)Lrm;", line = 276)
    public static final class243 method511(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        return var3 == null || var3.field3440 == null ? null : var3.field3440;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)[I", line = 301)
    public final int[] method199(int arg0, byte arg1) {
        field1184++;
        if (arg1 > -69) {
            field1187 = (class149) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            for (int var4 = 0; var4 < class215.field3787; var4++) {
                int var5 = (class133.field2424[var4] << 12) / this.field1181 + this.field1178;
                int var6 = var5;
                int var7 = (class200.field3574[arg0] << 12) / this.field1181 + this.field1173;
                int var8 = var7;
                int var9 = var5;
                int var10 = var7;
                int var11 = var5 * var5 >> 12;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && this.field1179 > var13) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var6 + var11 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = (this.field1179 - 1) <= var13 ? 0 : (var13 << 12) / this.field1179;
            }
        }
        return var3;
    }
}
