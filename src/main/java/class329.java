import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class329 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "B")
    private byte field4739;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field4735 = 0;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
    public static int[] field4742 = new int[5];

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field4744 = 2;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[B")
    public static byte[] field4738;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    public static int[] field4733;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 4)
    public static void method1995(byte arg0) {
        field4742 = null;
        field4738 = null;
        int var1 = 86 / ((arg0 - 82) / 35);
        field4733 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I", line = 15)
    public final int method1996(int arg0) {
        if (arg0 != 0) {
            field4735 = 121;
        }
        field4745++;
        return this.field4739 & 0x7;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[[[BIBII)V", line = 29)
    public static final void method1997(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class76.field920++;
        class382.field5428 = 0;
        for (int var6 = class232.field3221; var6 < class346.field4937; var6++) {
            class263[][] var17 = class293.field4356[var6];
            for (int var18 = class63.field785; var18 < class216.field2980; var18++) {
                for (int var19 = class360.field5183; var19 < class257.field3718; var19++) {
                    class263 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class115.field1413[var18 + class218.field3071 - class352.field5065][var19 + class218.field3071 - class25.field345] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field3785 = true;
                            var20.field3795 = true;
                            if (var20.field3801 == null) {
                                var20.field3794 = false;
                            } else {
                                var20.field3794 = true;
                            }
                            class382.field5428++;
                        } else {
                            var20.field3785 = false;
                            var20.field3795 = false;
                            var20.field3789 = 0;
                            if (var18 >= class352.field5065 - 16 && var18 <= class352.field5065 + 16 && var19 >= class25.field345 - 16 && var19 <= class25.field345 + 16 && (var20.field3783 != null || var20.field3780 != null || var20.field3784 != null || var20.field3782 != null || var20.field3798 != null || var20.field3801 != null)) {
                                class96.field1187.method715(var20, -100);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class398.field5667 == class361.field5208;
        for (int var8 = class232.field3221; var8 < class346.field4937; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class415.field5985.method1359() && var8 >= arg2 && arg1 != null) {
                int var10 = class115.field1413.length;
                if (class115.field1413.length + class63.field785 > class176.field2122) {
                    var10 -= class115.field1413.length + class63.field785 - class176.field2122;
                }
                int var11 = class115.field1413[0].length;
                if (class115.field1413[0].length + class360.field5183 > class225.field3116) {
                    var11 -= class115.field1413[0].length + class360.field5183 - class225.field3116;
                }
                int var12 = class453.field6406;
                while (true) {
                    if (var12 >= var10) {
                        class96.field1187.method709(5, var8, true, class398.field5667[var8], var9);
                        break;
                    }
                    int var13 = class63.field785 + var12 - class453.field6406;
                    for (int var14 = class193.field2653; var14 < var11; var14++) {
                        class241.field3311[var12][var14] = false;
                        if (class115.field1413[var12][var14]) {
                            int var15 = class360.field5183 + var14 - class193.field2653;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class293.field4356[var16][var13][var15] != null && class293.field4356[var16][var13][var15].field3792 == var8) {
                                    class241.field3311[var12][var14] = class293.field4356[var16][var13][var15].field3785;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class96.field1187.method709(5, var8, false, class398.field5667[var8], var9);
            }
            class96.field1187.method710(100);
        }
        if (!class237.method1305(true)) {
            class237.method1305(false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I", line = 182)
    public static final int method1998(int arg0, int arg1, int arg2) {
        if (arg0 == 3) {
            field4743++;
            return arg1 == 1 || arg1 == 3 ? class422.field6099[arg2 & 0x3] : class108.field1305[arg2 & 0x3];
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 197)
    public static final void method1999(boolean arg0) {
        field4734++;
        class36.field447 = new String[500];
        class141.field1694 = class453.field6394.field5770 + class453.field6394.field5763 + 2;
        class475.field6676 = class451.field6384.field5770 + class451.field6384.field5763 + 2;
        if (!arg0) {
            field4744 = -64;
        }
        for (int var1 = 0; var1 < class36.field447.length; var1++) {
            class36.field447[var1] = "";
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 226)
    public class329() {
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I", line = 229)
    public final int method2000(boolean arg0) {
        field4740++;
        if (arg0) {
            return (this.field4739 & 0x8) == 8 ? 1 : 0;
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lvt;)V", line = 239)
    public class329(class179 arg0) {
        this.field4739 = arg0.method922(32429);
        this.field4737 = arg0.method916(21933);
        this.field4741 = arg0.method939((byte) -110);
        this.field4736 = arg0.method939((byte) 103);
        this.field4746 = arg0.method939((byte) 79);
        this.field4747 = arg0.method939((byte) -114);
    }
}
