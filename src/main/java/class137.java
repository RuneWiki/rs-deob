import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
    private int[] field3104;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lgf;")
    public static class48 field3105 = new class48(512);

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[Lv;")
    public static class146[] field3113 = new class146[500];

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static volatile int field3115 = 0;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lv;")
    public static class146 field3114 = class159.method1226((byte) -37, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Luf;")
    public static class145 field3112;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[Lie;")
    public static class61[] field3107;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final void method1015(byte arg0) {
        field3110++;
        class124.field2887 = 0;
        class58.field1294 = 0;
        class44.method294((byte) 56);
        class5.method35(-97);
        client.method139(83);
        for (int var1 = 0; var1 < class124.field2887; var1++) {
            int var3 = class105.field2528[var1];
            if (class94.field2229 != class34.field735[var3].field754) {
                class34.field735[var3].field849 = null;
                class34.field735[var3] = null;
            }
        }
        if (arg0 > -89) {
            method1017((byte) -32, -72);
        }
        if (class35.field815 != class29.field597.field2304) {
            throw new RuntimeException("gnp1 pos:" + class29.field597.field2304 + " psize:" + class35.field815);
        }
        for (int var2 = 0; var2 < class91.field2171; var2++) {
            if (class34.field735[class57.field1271[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class91.field2171);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
    public final int method1016(int arg0, int arg1) {
        field3108++;
        int var3 = this.field3104.length - 2;
        if (arg0 != 1) {
            return -44;
        }
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field3104[var4];
            if (arg1 == var5) {
                return this.field3104[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([I)V")
    public class137(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3104 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3104[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3104[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3104[var5 + var5] = arg0[var4];
            this.field3104[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lm;")
    public static final class83 method1017(byte arg0, int arg1) {
        class83 var2 = (class83) class157.field3618.method1045((long) arg1, 20);
        if (arg0 >= -20) {
            method1017((byte) 64, -111);
        }
        field3111++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field861.method585(4, 125, arg1);
        class83 var4 = new class83();
        if (var3 != null) {
            var4.method631(arg1, new class95(var3), 107);
        }
        var4.method629((byte) -80);
        class157.field3618.method1047(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field3114 = null;
        field3113 = null;
        field3112 = null;
        if (arg0 != 22173) {
            method1015((byte) -48);
        }
        field3105 = null;
        field3107 = null;
    }
}
