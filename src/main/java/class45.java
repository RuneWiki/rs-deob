import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QUXKFXEA")
public class class45 {

    @OriginalMember(owner = "client!QUXKFXEA", name = "e", descriptor = "I")
    public int field1310 = -1;

    @OriginalMember(owner = "client!QUXKFXEA", name = "g", descriptor = "[I")
    public int[] field1312 = new int[6];

    @OriginalMember(owner = "client!QUXKFXEA", name = "h", descriptor = "[I")
    public int[] field1313 = new int[6];

    @OriginalMember(owner = "client!QUXKFXEA", name = "i", descriptor = "I")
    public int field1314 = 128;

    @OriginalMember(owner = "client!QUXKFXEA", name = "j", descriptor = "I")
    public int field1315 = 128;

    @OriginalMember(owner = "client!QUXKFXEA", name = "n", descriptor = "LJGECYJMS;")
    public static class22 field1319 = new class22(30, -11885);

    @OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!QUXKFXEA", name = "c", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!QUXKFXEA", name = "d", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!QUXKFXEA", name = "k", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!QUXKFXEA", name = "l", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!QUXKFXEA", name = "m", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!QUXKFXEA", name = "f", descriptor = "LLMDSPIVT;")
    public class30 field1311;

    @OriginalMember(owner = "client!QUXKFXEA", name = "b", descriptor = "[LQUXKFXEA;")
    public static class45[] field1307;

    @OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "(BLSXKKBWPU;)V")
    public static void method411(byte arg0, class50 arg1) {
        class53 var2 = new class53(arg1.method442("spotanim.dat", null), -631);
        field1306 = var2.method470();
        if (arg0 != -109) {
            return;
        }
        if (field1307 == null) {
            field1307 = new class45[field1306];
        }
        for (int var3 = 0; var3 < field1306; var3++) {
            if (field1307[var3] == null) {
                field1307[var3] = new class45();
            }
            field1307[var3].field1308 = var3;
            field1307[var3].method412(3, var2);
        }
    }

    @OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public void method412(int arg0, class53 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method468();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1309 = arg1.method470();
                } else if (var4 == 2) {
                    this.field1310 = arg1.method470();
                    if (class30.field982 != null) {
                        this.field1311 = class30.field982[this.field1310];
                    }
                } else if (var4 == 4) {
                    this.field1314 = arg1.method470();
                } else if (var4 == 5) {
                    this.field1315 = arg1.method470();
                } else if (var4 == 6) {
                    this.field1316 = arg1.method470();
                } else if (var4 == 7) {
                    this.field1317 = arg1.method468();
                } else if (var4 == 8) {
                    this.field1318 = arg1.method468();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1312[var4 - 40] = arg1.method470();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1313[var4 - 50] = arg1.method470();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "()LKDWDYCIL;")
    public class25 method413() {
        class25 var1 = (class25) field1319.method230((long) this.field1308);
        if (var1 != null) {
            return var1;
        }
        class25 var2 = class25.method246(this.field1309);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1312[0] != 0) {
                var2.method260(this.field1312[var3], this.field1313[var3]);
            }
        }
        field1319.method231((long) this.field1308, 811, var2);
        return var2;
    }
}
