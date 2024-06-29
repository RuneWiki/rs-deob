import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class35 {

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "B")
    public byte field345;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Lnr;")
    public class35 field352;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Ljava/lang/String;")
    public static String field340 = "Please wait...";

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lra;")
    public static class57 field341;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIZIZII)V")
    public static final void method201(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field351++;
        if (!arg5 && class426.field6175 == arg7 && class367.field5357 == arg0 && class356.field5209 == arg6 || class257.method1613(-125)) {
            return;
        }
        if (arg1 != -30684) {
            field353 = 101;
        }
        class367.field5357 = arg0;
        class426.field6175 = arg7;
        class356.field5209 = arg6;
        if (class257.method1613(-124)) {
            class356.field5209 = 0;
        }
        if (arg3) {
            class266.method1695(28, (byte) 51);
        } else {
            class266.method1695(25, (byte) 24);
        }
        class289.method1846(class407.field5907, class2.field20, true, (byte) -110);
        int var8 = class40.field427;
        int var9 = class217.field2975;
        class40.field427 = (class426.field6175 - (class279.field3935 >> 4)) * 8;
        class217.field2975 = (class367.field5357 - (class164.field2287 >> 4)) * 8;
        class269.field3788 = class106.method591(class426.field6175 * 8, class367.field5357 * 8);
        class407.field5911 = null;
        int var10 = class40.field427 - var8;
        int var11 = class217.field2975 - var9;
        if (arg3) {
            class426.field6168 = 0;
            int var15 = class279.field3935 * 128 - 128;
            int var16 = (class164.field2287 - 1) * 128;
            for (int var17 = 0; var17 < 32768; var17++) {
                class358 var22 = class81.field917[var17];
                if (var22 != null) {
                    var22.field1311 -= var11 * 128;
                    var22.field1304 -= var10 * 128;
                    if (var22.field1304 >= 0 && var15 >= var22.field1304 && var22.field1311 >= 0 && var22.field1311 <= var16) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field6351[var24] -= var10;
                            var22.field6350[var24] -= var11;
                            if (var22.field6351[var24] < 0 || class279.field3935 <= var22.field6351[var24] || var22.field6350[var24] < 0 || class164.field2287 <= var22.field6350[var24]) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class201.field2770[class426.field6168++] = var17;
                        } else {
                            class81.field917[var17].method2282((class335) null, (byte) -126);
                            class81.field917[var17] = null;
                        }
                    } else {
                        class81.field917[var17].method2282((class335) null, (byte) -124);
                        class81.field917[var17] = null;
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < 32768; var12++) {
                class358 var13 = class81.field917[var12];
                if (var13 != null) {
                    for (int var14 = 0; var14 < 10; var14++) {
                        var13.field6351[var14] -= var10;
                        var13.field6350[var14] -= var11;
                    }
                    var13.field1311 -= var11 * 128;
                    var13.field1304 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class133 var20 = class375.field5473[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field6351[var21] -= var10;
                    var20.field6350[var21] -= var11;
                }
                var20.field1304 -= var10 * 128;
                var20.field1311 -= var11 * 128;
            }
        }
        class410.field5931 = arg6;
        class390.field5715.method794((byte) -34, arg2, false, arg4, class410.field5931);
        class137.method820((byte) 94, var11, var10);
        for (class219 var19 = (class219) class327.field4643.method1124(-1); var19 != null; var19 = (class219) class327.field4643.method1119(false)) {
            var19.field3005 -= var10;
            var19.field2995 -= var11;
            if (var19.field3005 < 0 || var19.field2995 < 0 || class279.field3935 <= var19.field3005 || class164.field2287 <= var19.field2995) {
                var19.method2290((byte) 98);
            }
        }
        class45.field544 = 0;
        if (class450.field6576 != 0) {
            class450.field6576 -= var10;
            class435.field6384 -= var11;
        }
        if (arg3) {
            class402.field5872 -= var11;
            class269.field3784 -= var11;
            class228.field3114 -= var10;
            class272.field3852 -= var11 * 128;
            class272.field3853 -= var10 * 128;
            class188.field2548 -= var10;
            if (Math.abs(var10) > class279.field3935 || Math.abs(var11) > class164.field2287) {
                class6.method58(arg1 + 30568);
            }
        } else if (class231.field3128 == 4) {
            class297.field4241 -= var10 * 128;
            class132.field1811 -= var11 * 128;
            class10.field113 -= var11 * 128;
            class355.field5200 -= var10 * 128;
        } else {
            class231.field3128 = 1;
        }
        class418.method2599((byte) 118);
        class334.field4906.method1116((byte) -122);
        class78.field880.method1116((byte) 18);
        class247.field3356.method1610(true);
        class67.method396(0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method202(int arg0) {
        field341 = null;
        field340 = null;
        if (arg0 != 128) {
            field353 = -69;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIB)V")
    public class35(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field345 = arg4;
        this.field350 = arg1;
        this.field339 = arg2;
        this.field357 = arg0;
        this.field342 = arg3;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lnr;I)V")
    public class35(class35 arg0, int arg1) {
        this.field352 = arg0;
        this.field357 = this.field352.field357;
        this.field350 = this.field352.field350 + arg1;
        this.field339 = this.field352.field339 + arg1;
        this.field342 = this.field352.field342 + arg1;
        this.field345 = this.field352.field345;
    }
}
