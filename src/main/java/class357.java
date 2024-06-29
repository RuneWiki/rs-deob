import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class357 {

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public abstract void method1648(int arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public abstract void method1651(byte arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
    public abstract boolean method1650(int arg0, int arg1);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)Lpg;")
    public abstract class494 method1654(byte arg0);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public static final void method2186(int arg0) {
        field5299++;
        int var1 = class358.field5314.length;
        if (arg0 != 1909117475) {
            method2186(-81);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class358.field5314[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class219.field3368; var4++) {
                    if (class96.field1743[var4] == class61.field1032[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class96.field1743[class219.field3368] = class61.field1032[var2];
                    var3 = class219.field3368++;
                }
                class40 var5 = new class40(class358.field5314[var2]);
                int var6 = 0;
                while (class358.field5314[var2].length > var5.field585 && var6 < 511 && class352.field5175 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method254((byte) -87);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class61.field1032[var2] >> 8) * 64 + var10 - class381.field5550;
                    int var13 = (class61.field1032[var2] & 0xFF) * 64 - (class320.field4827 - var11);
                    class245 var14 = class433.field6358.method2688(var5.method254((byte) -82), arg0 ^ 0x8E350D50);
                    if (class195.field3085[var7] == null && (var14.field3708 & 0x1) > 0 && class455.field6976 == var9 && var12 >= 0 && class150.field2422 > (var14.field3707 + var12) && var13 >= 0 && (var14.field3707 + var13) < class21.field272) {
                        class195.field3085[var7] = new class249();
                        class195.field3085[var7].field2197 = var7;
                        class249 var15 = class195.field3085[var7];
                        class437.field6440[class352.field5175++] = var7;
                        var15.field2216 = class369.field5424;
                        var15.method1507((byte) -86, var14);
                        var15.method893(arg0 ^ 0x71CAD223, var15.field3819.field3707);
                        var15.field2136 = var15.field3819.field3720 << 3;
                        if (var15.field2136 == 0) {
                            var15.method902(0, (byte) 104);
                        } else {
                            var15.method902(var15.field3819.field3718 + 4 << 11 & 0x3F5B, (byte) 104);
                        }
                        var15.method1503(var9, (byte) -98, var13, var15.method337(arg0 ^ 0x71CAD223), var12, true);
                    }
                }
            }
        }
    }
}
