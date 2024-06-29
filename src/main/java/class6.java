import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public abstract class class6 {

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Lta;")
    private static class37 field64 = class20.method87(-87, "Scimitar Shop");

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Lta;")
    public static class37 field67 = class20.method87(-126, "75(U");

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Lta;")
    public static class37 field65 = class20.method87(-125, "mapfunction");

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Lta;")
    private static class37 field69 = class20.method87(-88, "Short)2cut");

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lta;")
    public static class37 field70 = class20.method87(-90, "Loading");

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "I")
    public static int field68 = 1;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "Lta;")
    public static class37 field73 = class20.method87(-98, "Next page");

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "Lta;")
    private static class37 field72 = class20.method87(-119, "Vegetable Store");

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Lta;")
    public static class37 field66 = class20.method87(-120, "underlay)3dat");

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Ln;")
    public static class26 field63;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)B", line = 4)
    public static final byte method22(int arg0) {
        if (arg0 == 1423028998) {
            return class27.field434 == null ? 0 : class27.field434[class11.field127];
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(III)V", line = 22)
    public static final void method23(int arg0, int arg1, int arg2) {
        class7.field81 = arg2 >> 6;
        class30.field445 = arg1 & 0x3F;
        class20.field228 = arg1 >> 6;
        class12.field144 = arg2 & 0x3F;
        class11.field127 = (class30.field445 << 6) + class12.field144;
        int var3 = -34 / ((arg0 + 47) / 41);
        class38.method249((byte) -86);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Z)V", line = 51)
    public static void method24(boolean arg0) {
        field70 = null;
        field67 = null;
        field63 = null;
        if (!arg0) {
            return;
        }
        field72 = null;
        field64 = null;
        field73 = null;
        field65 = null;
        field66 = null;
        field69 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B[B)[B", line = 84)
    public static final byte[] method26(byte arg0, byte[] arg1) {
        class21 var2 = new class21(arg1);
        if (arg0 != -122) {
            method30(true, 41, -62);
        }
        int var3 = var2.method96(255);
        int var4 = var2.method100(119);
        if (var4 < 0 || class30.field450 != 0 && var4 > class30.field450) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method97(var7, 0, (byte) 117, var4);
            return var7;
        } else {
            int var5 = var2.method100(-100);
            if (var5 < 0 || class30.field450 != 0 && var5 > class30.field450) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class17.method78(var6, var5, arg1, var4, 9);
            } else {
                class12.field135.method21(arg0 + 90, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)[Lta;", line = 141)
    public static final class37[] method27(byte arg0) {
        if (arg0 > -34) {
            field72 = null;
        }
        return new class37[] { class31.field455, class30.field449, class23.field257, class41.field533, class5.field62, class20.field233, class40.field529, class35.field477, class1.field2, class33.field466, class21.field237, class15.field161, class4.field50, class8.field94, mapview.field393, class26.field421, field64, class37.field502, class18.field178, class25.field306, class2.field14, class23.field254, class14.field154, class40.field528, class5.field55, class1.field7, class41.field541, class11.field123, class15.field157, class9.field99, class36.field494, class38.field521, class4.field43, class30.field443, mapview.field417, class41.field535, class5.field60, class37.field505, class37.field510, class23.field256, class20.field225, class36.field492, mapview.field376, class41.field536, class40.field531, class35.field476, class1.field9, class5.field58, mapview.field354, class4.field49, field72, class10.field106, class9.field102, class5.field57, class36.field497, class38.field518, class18.field177, mapview.field326, class20.field224, mapview.field352, class35.field482, class25.field307, class36.field496, class9.field104, class36.field496, class20.field226, class36.field496, class15.field165, class26.field430, class36.field496, field69, class40.field527, class10.field107, mapview.field359, class35.field486, class36.field496, class18.field181, class38.field519, class40.field530, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class36.field496, class15.field164, class36.field496, class36.field496 };
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIBII)V", line = 173)
    public static final void method29(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg0 > -96) {
            return;
        }
        int var5 = arg1 >> 6;
        int var6 = arg3 >> 6;
        if (class30.field444[arg4][var6][var5] == null) {
            class30.field444[arg4][var6][var5] = new byte[4096];
        }
        class30.field444[arg4][var6][var5][class10.method40(4032, arg3 << 6) + class10.method40(63, arg1)] = arg2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZII)B", line = 190)
    public static final byte method30(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field69 = null;
        }
        int var3 = arg1 >> 6;
        int var4 = arg2 >> 6;
        if (class10.field113[var4][var3] == null) {
            return 0;
        } else if (class10.field113[var4][var3].field441 == null) {
            return class10.field113[var4][var3].field439;
        } else {
            return class10.field113[var4][var3].field441[(arg2 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(I)[B")
    public abstract byte[] method25(int arg0);

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([BB)V")
    public abstract void method28(byte[] arg0, byte arg1);
}
