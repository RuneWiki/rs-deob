import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lrc;")
    private class121 field6 = new class121();

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lhe;")
    public static class54 field13 = class6.method58("Sie befinden sich in einem Mitglieder)2Gebiet(Q", false);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11 = 128;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lhe;")
    public static class54 field10 = class6.method58("Abbrechen", false);

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    public static int[] field19 = new int[50];

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lhe;")
    public static class54 field20 = class6.method58("60 Sekunden noch einmal)3)3)3", false);

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lvc;")
    public static class149 field2;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lbf;")
    public static class14 field5;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lef;")
    public static class35 field21;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lef;")
    public static class35 field8;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[Lce;")
    public static class20[] field7;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrc;I)V")
    public final void method1(class121 arg0, int arg1) {
        field4++;
        if (arg1 != 3) {
            field8 = null;
        }
        if (arg0.field2809 != null) {
            arg0.method936(arg1 ^ 0xFFFFFFFC);
        }
        arg0.field2813 = this.field6;
        arg0.field2809 = this.field6.field2809;
        arg0.field2809.field2813 = arg0;
        arg0.field2813.field2809 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lrc;")
    public final class121 method2(byte arg0) {
        class121 var2 = this.field6.field2813;
        field18++;
        if (arg0 != -122) {
            field15 = -53;
        }
        return this.field6 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Lrc;I)V")
    public final void method3(class121 arg0, int arg1) {
        field9++;
        if (arg0.field2809 != null) {
            arg0.method936(-1);
        }
        arg0.field2809 = this.field6;
        if (arg1 != 1) {
            field13 = null;
        }
        arg0.field2813 = this.field6.field2813;
        arg0.field2809.field2813 = arg0;
        arg0.field2813.field2809 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        field5 = null;
        field20 = null;
        field21 = null;
        field2 = null;
        field8 = null;
        if (arg0 >= -48) {
            method6(-12);
        }
        field7 = null;
        field10 = null;
        field19 = null;
        field13 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lrc;")
    public final class121 method5(int arg0) {
        int var2 = 47 % ((arg0 + 26) / 49);
        field16++;
        class121 var3 = this.field6.field2813;
        if (this.field6 == var3) {
            return null;
        } else {
            var3.method936(-1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static final void method6(int arg0) {
        field12++;
        class40.field1044.method461((byte) -33);
        int var1 = class40.field1044.method456(-1432215741, 8);
        if (class158.field3598 > var1) {
            for (int var2 = var1; var2 < class158.field3598; var2++) {
                class115.field2730[class70.field1723++] = class58.field1480[var2];
            }
        }
        if (class158.field3598 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class158.field3598 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class58.field1480[var3];
            class120 var5 = class111.field2679[var4];
            int var6 = class40.field1044.method456(-1432215741, 1);
            if (var6 == 0) {
                class58.field1480[class158.field3598++] = var4;
                var5.field960 = class4.field138;
            } else {
                int var7 = class40.field1044.method456(-1432215741, 2);
                if (var7 == 0) {
                    class58.field1480[class158.field3598++] = var4;
                    var5.field960 = class4.field138;
                    class89.field2193[class21.field579++] = var4;
                } else if (var7 == 1) {
                    class58.field1480[class158.field3598++] = var4;
                    var5.field960 = class4.field138;
                    int var8 = class40.field1044.method456(-1432215741, 3);
                    var5.method289(false, false, var8);
                    int var9 = class40.field1044.method456(-1432215741, 1);
                    if (var9 == 1) {
                        class89.field2193[class21.field579++] = var4;
                    }
                } else if (var7 == 2) {
                    class58.field1480[class158.field3598++] = var4;
                    var5.field960 = class4.field138;
                    int var10 = class40.field1044.method456(-1432215741, 3);
                    var5.method289(false, true, var10);
                    int var11 = class40.field1044.method456(-1432215741, 3);
                    var5.method289(false, true, var11);
                    int var12 = class40.field1044.method456(arg0 ^ 0x555DE0BF, 1);
                    if (var12 == 1) {
                        class89.field2193[class21.field579++] = var4;
                    }
                } else if (var7 == 3) {
                    class115.field2730[class70.field1723++] = var4;
                }
            }
        }
        if (arg0 != -4) {
            method6(-82);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class1() {
        this.field6.field2809 = this.field6;
        this.field6.field2813 = this.field6;
    }
}
