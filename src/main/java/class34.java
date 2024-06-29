import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MBSSGBHW")
public class class34 {

    @OriginalMember(owner = "client!MBSSGBHW", name = "f", descriptor = "I")
    public int field1056 = -1;

    @OriginalMember(owner = "client!MBSSGBHW", name = "h", descriptor = "[I")
    public int[] field1058 = new int[6];

    @OriginalMember(owner = "client!MBSSGBHW", name = "i", descriptor = "[I")
    public int[] field1059 = new int[6];

    @OriginalMember(owner = "client!MBSSGBHW", name = "j", descriptor = "I")
    public int field1060 = 128;

    @OriginalMember(owner = "client!MBSSGBHW", name = "k", descriptor = "I")
    public int field1061 = 128;

    @OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "I")
    private static int field1051 = 4;

    @OriginalMember(owner = "client!MBSSGBHW", name = "o", descriptor = "LWUMSOEQS;")
    public static class65 field1065 = new class65((byte) 5, 30);

    @OriginalMember(owner = "client!MBSSGBHW", name = "b", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!MBSSGBHW", name = "d", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!MBSSGBHW", name = "e", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!MBSSGBHW", name = "l", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!MBSSGBHW", name = "m", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!MBSSGBHW", name = "n", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!MBSSGBHW", name = "g", descriptor = "LJZFUUSFN;")
    public class28 field1057;

    @OriginalMember(owner = "client!MBSSGBHW", name = "c", descriptor = "[LMBSSGBHW;")
    public static class34[] field1053;

    @OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "(BLIEMHZJLX;)V")
    public static void method341(byte arg0, class23 arg1) {
        class38 var2 = new class38(0, arg1.method242("spotanim.dat", null));
        field1052 = var2.method359();
        if (arg0 != 8) {
            field1051 = -87;
        }
        if (field1053 == null) {
            field1053 = new class34[field1052];
        }
        for (int var3 = 0; var3 < field1052; var3++) {
            if (field1053[var3] == null) {
                field1053[var3] = new class34();
            }
            field1053[var3].field1054 = var3;
            field1053[var3].method342(403, var2);
        }
    }

    @OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "(ILMVHXDWGI;)V")
    public void method342(int arg0, class38 arg1) {
        int var3 = 96 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method357();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1055 = arg1.method359();
                } else if (var4 == 2) {
                    this.field1056 = arg1.method359();
                    if (class28.field952 != null) {
                        this.field1057 = class28.field952[this.field1056];
                    }
                } else if (var4 == 4) {
                    this.field1060 = arg1.method359();
                } else if (var4 == 5) {
                    this.field1061 = arg1.method359();
                } else if (var4 == 6) {
                    this.field1062 = arg1.method359();
                } else if (var4 == 7) {
                    this.field1063 = arg1.method357();
                } else if (var4 == 8) {
                    this.field1064 = arg1.method357();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1058[var4 - 40] = arg1.method359();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1059[var4 - 50] = arg1.method359();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "()LPDVZPZLT;")
    public class42 method343() {
        class42 var1 = (class42) field1065.method586((long) this.field1054);
        if (var1 != null) {
            return var1;
        }
        class42 var2 = class42.method414(this.field1055);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1058[0] != 0) {
                var2.method428(this.field1058[var3], this.field1059[var3]);
            }
        }
        field1065.method587(0, (long) this.field1054, var2);
        return var2;
    }
}
