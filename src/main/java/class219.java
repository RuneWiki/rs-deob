import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class219 extends class34 {

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Lcc;")
    public static class209 field3991 = class95.method669(85, "(U3");

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lcc;")
    public static class209 field3987 = class95.method669(87, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[Lcc;")
    public static class209[] field3993 = new class209[500];

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field3996 = 0;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Lla;")
    public static class95 field3992 = new class95(50);

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public int field3995;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[I")
    public int[] field3983;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[I")
    public int[] field3989;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[I")
    public int[] field3990;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[Lkd;")
    public class203[] field3982;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[Lkd;")
    public class203[] field3985;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "[[[B")
    public byte[][][] field3984;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
    public static final void method1542(int arg0) {
        int var1 = -13 % ((-arg0 - 45) / 36);
        class84.field1677.field2085 = 0;
        class254.field4590 = -1;
        client.field2818.field2085 = 0;
        class146.field2681 = 0;
        class176.field3201 = -1;
        class98.field1912 = 0;
        class181.field3283 = 0;
        class112.field2253 = 0;
        class59.field1188 = 0;
        class164.field2975 = -1;
        field3994++;
        class8.field158 = 0;
        class244.field4418 = false;
        class110.field2225 = -1;
        for (int var2 = 0; var2 < class103.field1993.length; var2++) {
            if (class103.field1993[var2] != null) {
                class103.field1993[var2].field1559 = -1;
            }
        }
        for (int var3 = 0; var3 < class60.field1207.length; var3++) {
            if (class60.field1207[var3] != null) {
                class60.field1207[var3].field1559 = -1;
            }
        }
        class186.method1270(126);
        class16.field334 = 1;
        class155.method1088(30, -3280);
        for (int var4 = 0; var4 < 100; var4++) {
            class129.field2476[var4] = true;
        }
        class187.method1275(0);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lwc;")
    public static final class230 method1543(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class230 var4 = var3.field2198;
            var3.field2198 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1544(byte arg0) {
        field3991 = null;
        field3992 = null;
        if (arg0 != 4) {
            field3996 = -12;
        }
        field3993 = null;
        field3987 = null;
    }
}
