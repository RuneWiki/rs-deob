import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class74 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[I")
    public static int[] field1272 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1273 = new String[5];

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "J")
    public static long field1278 = 0L;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Ldp;")
    public static class174 field1280;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Ldp;")
    public static class174 field1282;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[S")
    public static short[] field1274;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILec;B)V", line = 5)
    private final void method586(int arg0, class37 arg1, byte arg2) {
        field1277++;
        if (arg2 <= 66) {
            this.method586(44, (class37) null, (byte) 8);
        }
        if (arg0 == 1) {
            this.field1276 = arg1.method320((byte) -87);
            this.field1281 = arg1.method271((byte) 116);
            this.field1275 = arg1.method271((byte) 103);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lpf;Z)Z", line = 27)
    public static final boolean method587(class447 arg0, boolean arg1) {
        boolean var2 = class50.field816 == class18.field262;
        int var3 = 0;
        arg0.method1547((byte) -115);
        if (arg0.field6526 < 0 || arg0.field6513 < 0 || arg0.field6504 >= class139.field2209 || arg0.field6508 >= class436.field6353) {
            return false;
        }
        for (int var4 = arg0.field6526; var4 <= arg0.field6504; var4++) {
            for (int var7 = arg0.field6513; var7 <= arg0.field6508; var7++) {
                int var8 = 0;
                if (var4 > arg0.field6526) {
                    var8++;
                }
                if (var4 < arg0.field6504) {
                    var8 += 4;
                }
                if (var7 > arg0.field6513) {
                    var8 += 8;
                }
                if (var7 < arg0.field6508) {
                    var8 += 2;
                }
                class253.method1833(arg0.field6509, var4, var7);
                class168 var9 = class443.field6447[arg0.field6509][var4][var7];
                class36 var10 = class432.method2681(arg0, false, var8);
                class36 var11 = var9.field2488;
                if (var11 == null) {
                    var9.field2488 = var10;
                } else {
                    while (var11.field505 != null) {
                        var11 = var11.field505;
                    }
                    var11.field505 = var10;
                }
                var9.field2494 = (byte) (var9.field2494 | var8);
                if (var2 && class28.field412[var4][var7] != 0) {
                    var3 = class28.field412[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field6526; var5 <= arg0.field6504; var5++) {
                for (int var6 = arg0.field6513; var6 <= arg0.field6508; var6++) {
                    if (class28.field412[var5][var6] == 0) {
                        class28.field412[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class219.field3261[class30.field433++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lec;B)V", line = 126)
    public final void method588(class37 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method271((byte) 120);
            if (var3 == 0) {
                field1279++;
                if (arg1 > -44) {
                    this.field1281 = -11;
                    return;
                }
                return;
            }
            this.method586(var3, arg0, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 152)
    public static void method589(byte arg0) {
        field1273 = null;
        field1274 = null;
        field1282 = null;
        if (arg0 < 20) {
            field1272 = null;
        }
        field1272 = null;
        field1280 = null;
    }
}
