import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class108 {

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "B")
    private byte field1997;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[I")
    public static int[] field1992 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lcd;")
    public static class64 field2000 = class44.method335((byte) 71, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lcd;")
    public static class64 field1996 = class44.method335((byte) 71, "null");

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lpj;")
    public static class173 field1991 = new class173(5000);

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[I")
    public static int[] field2007 = new int[100];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[Lvd;")
    public static class127[] field2005;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I", line = 5)
    public final int method787(int arg0) {
        field1998++;
        if (arg0 != 16777215) {
            field1991 = (class173) null;
        }
        return this.field1997 & 0x7;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 48)
    public static void method788(byte arg0) {
        if (arg0 >= -21) {
            field2008 = -52;
        }
        field2007 = null;
        field1992 = null;
        field1996 = null;
        field1991 = null;
        field2000 = null;
        field2005 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I", line = 63)
    public final int method789(int arg0) {
        field2003++;
        if (arg0 == 0) {
            return (this.field1997 & 0x8) == 8 ? 1 : 0;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V", line = 78)
    public static final void method790(byte arg0, int arg1) {
        if (arg0 < 105) {
            method790((byte) 68, -121);
        }
        field1993++;
        class299 var2 = class158.method1135(arg1, 113, 12);
        var2.method2093((byte) -92);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 94)
    public class108() {
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lkh;)V", line = 96)
    public class108(class13 arg0) {
        this.field1997 = arg0.method150((byte) 111);
        this.field2004 = arg0.method112((byte) 92);
        this.field1999 = arg0.method105((byte) 60);
        this.field1995 = arg0.method105((byte) 105);
        this.field2002 = arg0.method105((byte) 95);
        this.field1994 = arg0.method105((byte) 46);
    }
}
