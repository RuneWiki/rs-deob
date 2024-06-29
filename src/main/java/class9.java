import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "J")
    public long field141 = 0L;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lob;")
    public static class141 field145 = class175.method1195(40, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lob;")
    public static class141 field151 = class175.method1195(40, "(U1");

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field152 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[Lih;")
    public static class87[] field159 = new class87[500];

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lob;")
    public static class141 field160 = class175.method1195(40, "::autoshadow off");

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field162 = 500;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Lob;")
    public static class141 field161 = class175.method1195(40, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Laa;")
    public class2 field147;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    public static int[] field149;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "[[[I")
    public static int[][][] field158;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method59(byte arg0) {
        if (arg0 <= 28) {
            method59((byte) 19);
        }
        field158 = null;
        field160 = null;
        field159 = null;
        field152 = null;
        field145 = null;
        field161 = null;
        field149 = null;
        field151 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILce;ZIZI)V")
    public static final void method60(int arg0, class26 arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field142++;
        if (class39.field786 >= 50 || (arg1.field492 == null || arg1.field492.length <= arg3)) {
            return;
        }
        int var6 = arg1.field492[arg3];
        if (var6 == 0) {
            return;
        }
        if (arg2) {
            field162 = -82;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg4) {
                class87.method592(var8, var7, 0, 0);
            }
        } else if (class165.field3202 != 0) {
            class178.field3517[class39.field786] = var7;
            class88.field1767[class39.field786] = var8;
            class49.field921[class39.field786] = 0;
            class104.field2012[class39.field786] = null;
            int var10 = (arg5 - 64) / 128;
            int var11 = (arg0 - 64) / 128;
            class106.field2043[class39.field786] = (var11 << 16) + (var10 << 8) + var9;
            class39.field786++;
        }
    }
}
