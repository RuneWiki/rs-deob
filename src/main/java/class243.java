import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class243 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lmb;")
    public static class96 field4211 = method1708("(Y", (byte) 117);

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field4213 = -1;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[I")
    public static int[] field4212 = new int[32];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
    public static int[] field4214 = new int[32];

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;B)Lmb;")
    public static final class96 method1708(String arg0, byte arg1) {
        field4215++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class96 var4 = new class96();
        var4.field1580 = new byte[var3];
        if (arg1 <= 90) {
            return null;
        }
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1580[var4.field1600++] = (byte) (var7 + var6 * 43 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field1580[var4.field1600++] = (byte) var6;
            }
        }
        var4.method697(118);
        return var4.method701(0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Lca;")
    public static final class109 method1709(int arg0, int arg1) {
        field4210++;
        class109 var2 = (class109) class73.field1252.method158((long) arg0, (byte) -95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field561.method23(arg0, 103, 26);
        class109 var4 = new class109();
        if (var3 != null) {
            var4.method834(-1, new class239(var3));
        }
        class73.field1252.method155((long) arg0, var4, (byte) 116);
        if (arg1 != -13770) {
            method1708((String) null, (byte) -61);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method1710(byte arg0) {
        field4214 = null;
        if (arg0 >= -116) {
            field4212 = null;
        }
        field4212 = null;
        field4211 = null;
    }
}
