import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class248 extends class200 {

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "[I")
    public static int[] field4349 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lvj;")
    public static class115 field4350 = new class115(64);

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "[I")
    public static int[] field4353 = new int[128];

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Lid;")
    public static class149 field4354 = class60.method382("mapfunction", (byte) 30);

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "Z")
    public static boolean field4355 = false;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4356 = 0;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Lvc;")
    public static class190 field4347;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
    public static void method1723(byte arg0) {
        field4354 = null;
        field4349 = null;
        field4350 = null;
        field4347 = null;
        field4353 = null;
        if (arg0 != -54) {
            method1725(-30);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
    public static final void method1724(int arg0, boolean arg1) {
        if (!arg1) {
            field4354 = null;
        }
        if (!class26.field398) {
            arg0 = -1;
        }
        field4348++;
        if (class201.field3645 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class123 var2 = class162.method1192(true, arg0);
            class46 var3 = var2.method867(-6864);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class272.field4900.method166(var3.field3411, (byte) 122, var3.field3401, class244.field4295, var3.method265(), new Point(var2.field2175, var2.field2164));
                class201.field3645 = arg0;
            }
        }
        if (arg0 == -1 && class201.field3645 != -1) {
            class272.field4900.method166(-1, (byte) 100, -1, class244.field4295, (int[]) null, new Point());
            class201.field3645 = -1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static final void method1725(int arg0) {
        field4351++;
        class283.field5002 = 0;
        class162.field3013 = 0;
        class208.method1419(83);
        class175.method1239(false);
        class80.method603((byte) 88);
        class211.method1436(-22028);
        for (int var1 = 0; var1 < class283.field5002; var1++) {
            int var3 = class186.field3345[var1];
            if (class118.field2022 != class107.field1851[var3].field2403) {
                if (class107.field1851[var3].field2219 > 0) {
                    class150.method1071(false, class107.field1851[var3]);
                }
                class107.field1851[var3] = null;
            }
        }
        if (class68.field1188 != class11.field150.field1340) {
            throw new RuntimeException("gpp1 pos:" + class11.field150.field1340 + " psize:" + class68.field1188);
        }
        int var2 = 0;
        if (arg0 != -1) {
            method1723((byte) -118);
        }
        while (var2 < class253.field4432) {
            if (class107.field1851[class251.field4407[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class253.field4432);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        field4352++;
        if (arg1 != 55) {
            field4353 = null;
        }
        return class73.field1263;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public static final void method1726(int arg0, int arg1, int arg2) {
        class246.field4317 = true;
        class138.field2526 = arg0;
        class273.field4911 = arg1;
        class67.field1173 = arg2;
        class198.field3606 = -1;
        class39.field615 = -1;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class248() {
        super(0, true);
    }
}
