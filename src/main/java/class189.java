import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class189 extends class170 {

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "Z")
    public static boolean field2725 = false;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "Lhc;")
    public static class368 field2724 = new class368("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "J")
    public static volatile long field2730 = 0L;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "Ljava/lang/String;")
    public String field2718;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "[C")
    public char[] field2720;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "[C")
    public char[] field2728;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
    public int[] field2726;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "[I")
    public int[] field2727;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)V")
    public static final void method1310(byte arg0) {
        field2723++;
        if (class350.field4712 == -1) {
            return;
        }
        int var1 = class116.field1759.method34(true);
        if (arg0 != 12) {
            field2729 = -76;
        }
        int var2 = class116.field1759.method30((byte) 115);
        if (class446.field6255 != null) {
            var1 = class446.field6255.method121((byte) 110);
            var2 = class446.field6255.method126(false);
        }
        class81.method658(class350.field4712, 0, 0, class373.field5174, var1, var2, -8345, 0, 0, class396.field5493);
        if (class105.field1480 != null) {
            class150.method1114(var2, true, var1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(CB)I")
    public final int method1311(char arg0, byte arg1) {
        int var3 = -109 % ((arg1 - 78) / 32);
        field2717++;
        if (this.field2727 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field2727.length; var4++) {
            if (this.field2720[var4] == arg0) {
                return this.field2727[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILrg;)V")
    public final void method1312(int arg0, class366 arg1) {
        field2716++;
        if (arg0 != -1) {
            this.method1314((byte) 12);
        }
        while (true) {
            int var3 = arg1.method2306((byte) 65);
            if (var3 == 0) {
                return;
            }
            this.method1315(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(CB)I")
    public final int method1313(char arg0, byte arg1) {
        field2721++;
        if (this.field2726 == null) {
            return -1;
        }
        int var3 = 40 / ((arg1 - 74) / 52);
        for (int var4 = 0; var4 < this.field2726.length; var4++) {
            if (this.field2728[var4] == arg0) {
                return this.field2726[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V")
    public final void method1314(byte arg0) {
        field2722++;
        if (this.field2726 != null) {
            for (int var2 = 0; var2 < this.field2726.length; var2++) {
                this.field2726[var2] = class431.method2655(this.field2726[var2], 32768);
            }
        }
        if (this.field2727 != null) {
            for (int var3 = 0; var3 < this.field2727.length; var3++) {
                this.field2727[var3] = class431.method2655(this.field2727[var3], 32768);
            }
        }
        if (arg0 != 21) {
            this.method1315(32, (class366) null, -118);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILrg;I)V")
    private final void method1315(int arg0, class366 arg1, int arg2) {
        field2715++;
        if (arg2 == 1) {
            this.field2718 = arg1.method2255(-32226);
        } else if (arg2 == 2) {
            int var7 = arg1.method2306((byte) 121);
            this.field2720 = new char[var7];
            this.field2727 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2727[var8] = arg1.method2297(13352);
                byte var9 = arg1.method2289((byte) -77);
                this.field2720[var8] = var9 == 0 ? 0 : class93.method732(63, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2306((byte) 83);
            this.field2728 = new char[var4];
            this.field2726 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2726[var5] = arg1.method2297(13352);
                byte var6 = arg1.method2289((byte) -77);
                this.field2728[var5] = var6 == 0 ? 0 : class93.method732(63, var6);
            }
        }
        if (arg0 != 0) {
            this.method1314((byte) 7);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(CI)Z")
    public static final boolean method1316(char arg0, int arg1) {
        if (arg1 != -46) {
            method1317(10);
        }
        field2719++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V")
    public static void method1317(int arg0) {
        if (arg0 == 0) {
            field2724 = null;
        }
    }
}
