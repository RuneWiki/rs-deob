import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class113 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field1542 = 128;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public int field1547 = 128;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "[[I")
    public static int[][] field1551 = new int[6][];

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V", line = 264)
    public class113(int arg0) {
        this.field1548 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIII)V", line = 271)
    private class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1547 = arg1;
        this.field1543 = arg3;
        this.field1548 = arg0;
        this.field1544 = arg4;
        this.field1542 = arg2;
        this.field1545 = arg5;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 21)
    public static final byte[] method846(Object arg0, boolean arg1, int arg2) {
        field1546++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class487.method2830((byte) 121, var3) : var3;
        } else if (arg0 instanceof class168) {
            class168 var4 = (class168) arg0;
            return var4.method765(-103);
        } else {
            if (arg2 != 16) {
                method846(null, true, 49);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLjt;)V", line = 57)
    public final void method847(byte arg0, class113 arg1) {
        this.field1544 = arg1.field1544;
        this.field1547 = arg1.field1547;
        field1552++;
        this.field1542 = arg1.field1542;
        this.field1543 = arg1.field1543;
        this.field1548 = arg1.field1548;
        if (arg0 == 121) {
            this.field1545 = arg1.field1545;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 73)
    public static void method848(byte arg0) {
        if (arg0 < -53) {
            field1551 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Ljt;", line = 85)
    public final class113 method849(int arg0) {
        int var2 = 2 % ((-arg0 - 61) / 46);
        field1549++;
        return new class113(this.field1548, this.field1547, this.field1542, this.field1543, this.field1544, this.field1545);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lha;I)V", line = 95)
    public static final void method850(class65 arg0, int arg1) {
        field1550++;
        int var2 = 0;
        int var3 = 0;
        if (class130.field1934) {
            var2 = class550.method3117(arg1 + 16777315);
            var3 = class621.method3410(-2);
        }
        int var4 = class245.field3317 + var2;
        int var5 = class356.field5213 + var3;
        int var6 = class442.field6220;
        int var7 = class337.field4890 - 3;
        if (arg1 != -16777216) {
            return;
        }
        byte var8 = 20;
        class564.method3158(class356.field5213 + var3, class442.field6220, false, class337.field4890, class245.field3317 + var2, arg0, var8, class474.field6563.method2780(100, class38.field589));
        int var9 = class304.field4371.method778(0) + var2;
        int var10 = var3 + class304.field4371.method777((byte) 8);
        if (class668.field9373) {
            int var11 = 0;
            for (class81 var12 = (class81) class57.field805.method697(arg1 ^ 0xFF000000); var12 != null; var12 = (class81) class57.field805.method699(true)) {
                int var16 = var11 * 16 + var5 + var8 + 13;
                if ((class245.field3317 + var2) < var9 && (class245.field3317 + var2 + class442.field6220) > var9 && var16 - 13 < var10 && var16 + 4 > var10 && (var12.field1151 > 1 || ((class275) var12.field1155.field1176.field4146).field4081)) {
                    arg0.method563(class245.field3317 + var2, var16 + -12, class442.field6220, 16, 255 - class403.field5854 << 24 | class205.field2685, 1);
                }
                var11++;
            }
            if (class314.field4522 != null) {
                class564.method3158(class270.field3986, class152.field2100, false, class485.field6706, class271.field4010, arg0, var8, class314.field4522.field1150);
                int var13 = 0;
                for (class275 var14 = (class275) class314.field4522.field1155.method697(0); var14 != null; var14 = (class275) class314.field4522.field1155.method699(true)) {
                    int var15 = class270.field3986 + 13 - (-var8 - var13 * 16);
                    if (var9 > class271.field4010 && var9 < (class271.field4010 + class152.field2100) && var15 - 13 < var10 && (var15 + 4) > var10 && var14.field4081) {
                        arg0.method563(class271.field4010, var15 - 12, class152.field2100, 16, 255 - class403.field5854 << 24 | class205.field2685, 1);
                    }
                    var13++;
                }
                class138.method1070(class152.field2100, class485.field6706, var8, class270.field3986, class271.field4010, arg0, false);
            }
        } else {
            int var17 = 0;
            for (class275 var18 = (class275) class280.field4138.method2551((byte) -108); var18 != null; var18 = (class275) class280.field4138.method2542(-97)) {
                int var28 = var8 + (class746.field10297 - var17 - 1) * 16 + var5 + 13;
                if ((class245.field3317 + var2) < var9 && var9 < class245.field3317 + var2 + class442.field6220 && var28 - 13 < var10 && (var28 + 4) > var10 && var18.field4081) {
                    arg0.method563(class245.field3317 + var2, var28 + -12, class442.field6220, 16, class205.field2685 | 255 - class403.field5854 << 24, 1);
                }
                var17++;
            }
        }
        class138.method1070(class442.field6220, class337.field4890, var8, class356.field5213 + var3, class245.field3317 + var2, arg0, false);
        if (class668.field9373) {
            int var19 = 0;
            for (class81 var20 = (class81) class57.field805.method697(0); var20 != null; var20 = (class81) class57.field805.method699(true)) {
                int var24 = var19 * 16 + (class356.field5213 + var3 + var8) + 13;
                var19++;
                if (var20.field1151 == 1) {
                    class514.method2990(class442.field6220, var24, var10, class356.field5213 + var3, arg0, (class275) var20.field1155.field1176.field4146, var9, class597.field8130 | 0xFF000000, class245.field3317 + var2, class434.field6145 | 0xFF000000, class337.field4890, true);
                } else {
                    class168.method1206(var10, class356.field5213 + var3, arg0, class245.field3317 + var2, class597.field8130 | 0xFF000000, class434.field6145 | 0xFF000000, class442.field6220, class337.field4890, var9, var20, var24, false);
                }
            }
            if (class314.field4522 != null) {
                int var21 = 0;
                for (class275 var22 = (class275) class314.field4522.field1155.method697(0); var22 != null; var22 = (class275) class314.field4522.field1155.method699(true)) {
                    int var23 = var21 * 16 + class270.field3986 + var8 + 13;
                    class514.method2990(class152.field2100, var23, var10, class270.field3986, arg0, var22, var9, class597.field8130 | 0xFF000000, class271.field4010, class434.field6145 | 0xFF000000, class485.field6706, true);
                    var21++;
                }
                class39.method273(class485.field6706, class152.field2100, class270.field3986, arg1 + 16777215, class271.field4010);
            }
        } else {
            int var25 = 0;
            for (class275 var26 = (class275) class280.field4138.method2551((byte) -108); var26 != null; var26 = (class275) class280.field4138.method2542(-101)) {
                int var27 = var8 + ((class746.field10297 - var25 - 1) * 16) + var5 + 13;
                var25++;
                class514.method2990(var6, var27, var10, var5, arg0, var26, var9, class597.field8130 | 0xFF000000, var4, class434.field6145 | 0xFF000000, var7, true);
            }
        }
        class39.method273(class337.field4890, class442.field6220, class356.field5213 + var3, -1, class245.field3317 + var2);
    }
}
