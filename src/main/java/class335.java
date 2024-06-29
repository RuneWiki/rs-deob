import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class335 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field4225;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lae;")
    public static class165 field4230 = new class165("stellardawn", 1);

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "Z")
    public static boolean field4232 = false;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Lkg;")
    public static class179 field4233 = new class179(46, 8);

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lap;")
    public static class335 field4234 = new class335("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4230 = null;
        int var1 = 77 / ((41 - arg0) / 53);
        field4233 = null;
        field4234 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1936(int arg0, int arg1) {
        field4231++;
        if (arg0 != -26539) {
            this.method1936(-76, 73);
        }
        return this.field4225[arg1];
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method1937(int arg0, String arg1, char arg2) {
        field4227++;
        int var3 = class412.method2441(arg1, -29161, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg0 >= -7) {
            method1937(98, null, '1');
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class335(String arg0, String arg1, String arg2, String arg3) {
        this.field4225 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4226++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1938(String arg0, int arg1) {
        if (arg1 <= 19) {
            field4233 = null;
        }
        field4229++;
        if (!class211.field2717) {
            return;
        }
        boolean var2 = false;
        int var3 = class436.field6234;
        int[] var4 = class12.field218;
        for (int var5 = 0; var5 < var3; var5++) {
            class223 var6 = class387.field5107[var4[var5]];
            if (var6 != null && class23.field336 != var6 && var6.field2852 != null && var6.field2852.equalsIgnoreCase(arg0)) {
                class126.field1676++;
                class282.method1669(class159.field2023, false);
                class40.field511.method2778(class21.field309, 117);
                class40.field511.method2726(-30219, 0);
                class40.field511.method2783(class470.field6816, -578373112);
                class40.field511.method2783(class322.field4090, -578373112);
                class40.field511.method2748(var4[var5], 8016);
                class456.method2708(-2, true, var6.field4944[0], var6.method1366((byte) -111), var6.field4936[0], 0, var6.method1366((byte) -90), 30799, 0);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class445.method2622(true, class262.field3315.method1936(-26539, class11.field177) + arg0);
        }
        if (class211.field2717) {
            class379.method2156(true);
        }
    }
}
