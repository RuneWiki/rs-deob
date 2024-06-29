import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class194 {

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lbf;")
    public static class199 field3415 = new class199(50);

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lqk;")
    public static class207 field3418 = class24.method212(255, "scape main");

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "[I")
    public static int[] field3417 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lqk;")
    public static class207 field3419 = class24.method212(255, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lqk;")
    public static class207 field3416 = class24.method212(255, "Weiter");

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "J")
    public long field3407;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lij;")
    public class194 field3408;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lij;")
    public class194 field3410;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public final void method1346(byte arg0) {
        field3409++;
        if (this.field3408 == null) {
            return;
        }
        this.field3408.field3410 = this.field3410;
        this.field3410.field3408 = this.field3408;
        if (arg0 != -16) {
            this.field3407 = -113L;
        }
        this.field3408 = null;
        this.field3410 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Z")
    public final boolean method1347(int arg0) {
        field3411++;
        if (arg0 < 74) {
            return false;
        } else {
            return this.field3408 != null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)I")
    public static final int method1348(boolean arg0) {
        if (arg0) {
            field3416 = null;
        }
        field3414++;
        return class32.field646;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static void method1349(int arg0) {
        field3417 = null;
        field3418 = null;
        int var1 = 43 % (-arg0 / 63);
        field3419 = null;
        field3415 = null;
        field3416 = null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public static final void method1350(byte arg0) {
        if (arg0 != -42) {
            field3415 = null;
        }
        field3412++;
        class268.field4734.method1382(31346);
        class125.field2174.method1382(31346);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V")
    public static final void method1351(byte arg0, int arg1) {
        if (arg0 != -13) {
            field3417 = null;
        }
        field3413++;
        class108.field1917.method1383(-8052, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLqk;I)V")
    public static final void method1352(boolean arg0, class207 arg1, int arg2) {
        field3406++;
        if (arg2 > -59) {
            field3417 = null;
        }
        class207 var3 = arg1.method1444((byte) -76);
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class227.field4178; var6++) {
            class173 var9 = class117.method829(var6, (byte) 94);
            if ((!arg0 || var9.field3118) && var9.field3117 == -1 && var9.field3064 == -1 && var9.field3113 == 0 && var9.field3057.method1444((byte) -76).method1467(-1, var3) != -1) {
                if (var4 >= 250) {
                    class163.field2883 = null;
                    class74.field1366 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class163.field2883 = var5;
        class74.field1366 = var4;
        class1.field14 = 0;
        class207[] var7 = new class207[class74.field1366];
        for (int var8 = 0; var8 < class74.field1366; var8++) {
            var7[var8] = class117.method829(var5[var8], (byte) 122).field3057;
        }
        class90.method652(class163.field2883, var7, false);
    }
}
