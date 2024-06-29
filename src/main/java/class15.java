import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 {

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Ld;")
    public static class7 field165 = class38.method251((byte) -114, "Sword Shop");

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "I")
    public static int field161 = 0;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ld;")
    public static class7 field162 = class38.method251((byte) 118, "Dungeon");

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "Ld;")
    public static class7 field169 = class38.method251((byte) -76, "b12_full");

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Ld;")
    public static class7 field167 = class38.method251((byte) 102, " ");

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "B")
    public byte field166;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "Lba;")
    public static class4 field168;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/lang/String;")
    public static String field160;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "[B")
    public byte[] field164;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V", line = 7)
    public final void method114(int arg0) {
        if (arg0 >= -25) {
            return;
        }
        boolean var2 = true;
        if (this.field164 == null) {
            return;
        }
        this.field166 = this.field164[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field164[var3] != this.field166) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field164 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZII)V", line = 42)
    public static final void method115(boolean arg0, int arg1, int arg2) {
        class30.field435 = arg2 & 0x3F;
        class36.field476 = arg1 & 0x3F;
        class5.field54 = arg1 >> 6;
        class2.field10 = (class30.field435 << 6) + class36.field476;
        class29.field428 = arg2 >> 6;
        class21.method152((byte) 122);
        if (!arg0) {
            method117((byte) -25);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 79)
    public static void method116(byte arg0) {
        field160 = null;
        field167 = null;
        field168 = null;
        field169 = null;
        if (arg0 == -125) {
            field162 = null;
            field165 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)Z", line = 119)
    public static final boolean method117(byte arg0) {
        class18 var1 = class21.field236;
        synchronized (class21.field236) {
            if (arg0 <= 38) {
                field163 = -43;
            }
            if (class26.field368 == class2.field7) {
                return false;
            } else {
                class17.field191 = class35.field473[class2.field7];
                class12.field141 = class11.field128[class2.field7];
                class2.field7 = class2.field7 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([Ld;I)V", line = 137)
    public static final void method118(class7[] arg0, int arg1) {
        if (arg1 == 0) {
            class22.method160(arg0.length, 0, arg0, 0);
        }
    }
}
