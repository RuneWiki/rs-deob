import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class6 {

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public int field90 = -1;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public int field97 = -1;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Z")
    public boolean field96 = false;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Z")
    public boolean field93 = true;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
    public boolean field100 = true;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public int field101 = 16;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public int field104 = 8;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public int field103 = -1;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public int field106 = 1190717;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public int field107 = 0;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public int field94 = 128;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "[C")
    public static char[] field87 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field92 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field86 = 0;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "[C")
    public static char[] field95 = new char[128];

    @OriginalMember(owner = "client!to", name = "m", descriptor = "F")
    public static float field98 = 0.0F;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field91 = -1;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "[B")
    public static byte[] field89;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
    public final void method46(int arg0, int arg1) {
        this.field104 = this.field104 << 8 | arg0;
        field88++;
        if (arg1 != -2511) {
            field86 = 21;
        }
        if (this.field97 == -1) {
            this.field97 = this.field103;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public static void method47(boolean arg0) {
        if (arg0) {
            method47(false);
        }
        field95 = null;
        field87 = null;
        field89 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Leb;")
    public static final class371 method48(byte arg0) {
        field105++;
        class371 var1 = new class371(37);
        var1.method2396(14, 12450);
        var1.method2396(class326.field4453, 12450);
        var1.method2396(class60.field845 ? 1 : 0, 12450);
        var1.method2396(class231.field3098 ? 1 : 0, 12450);
        var1.method2396(class21.field280 ? 1 : 0, 12450);
        var1.method2396(class313.field4316 ? 1 : 0, 12450);
        var1.method2396(0, 12450);
        var1.method2396(class366.field5126 ? 1 : 0, 12450);
        var1.method2396(class427.field6127 ? 1 : 0, 12450);
        var1.method2396(class57.field813 ? 1 : 0, 12450);
        var1.method2396(class410.field5956, 12450);
        var1.method2396(class412.field5977 ? 1 : 0, 12450);
        var1.method2396(class406.field5904 ? 1 : 0, 12450);
        var1.method2396(class72.field1114 ? 1 : 0, 12450);
        var1.method2396(class410.field5960, 12450);
        var1.method2396(class267.field3639 ? 1 : 0, 12450);
        var1.method2396(class396.field5788, 12450);
        var1.method2396(class276.field3750, 12450);
        var1.method2396(class406.field5895, 12450);
        var1.method2416(22064, class308.field4227);
        var1.method2416(22064, class29.field457);
        var1.method2396(class143.method974(-92), 12450);
        var1.method2386(class323.field4428, 19324);
        var1.method2396(class152.field2153, 12450);
        var1.method2396(class198.field2742 ? 1 : 0, 12450);
        var1.method2396(class188.field2609 ? 1 : 0, 12450);
        var1.method2396(class129.field1800, 12450);
        var1.method2396(class233.field3156 ? 1 : 0, 12450);
        var1.method2396(class48.field732 ? 1 : 0, 12450);
        var1.method2396(class207.field2795, 12450);
        var1.method2396(class10.field147 ? 1 : 0, 12450);
        var1.method2396(class28.field448, 12450);
        if (arg0 <= 15) {
            method48((byte) -23);
        }
        return var1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILeb;I)V")
    public final void method49(int arg0, class371 arg1, int arg2) {
        field102++;
        if (arg0 <= 93) {
            this.method50(-91, -39, -92, (class371) null);
        }
        while (true) {
            int var4 = arg1.method2429(0);
            if (var4 == 0) {
                return;
            }
            this.method50(112, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILeb;)V")
    private final void method50(int arg0, int arg1, int arg2, class371 arg3) {
        if (arg2 == 1) {
            this.field107 = class371.method2419(arg3.method2425(21), 4722);
        } else if (arg2 == 2) {
            this.field103 = arg3.method2429(0);
        } else if (arg2 == 3) {
            this.field103 = arg3.method2403((byte) 50);
            if (this.field103 == 65535) {
                this.field103 = -1;
            }
        } else if (arg2 == 5) {
            this.field100 = false;
        } else if (arg2 == 7) {
            this.field90 = class371.method2419(arg3.method2425(22), 4722);
        } else if (arg2 == 8) {
            class229.field3066 = arg1;
        } else if (arg2 == 9) {
            this.field94 = arg3.method2403((byte) 49);
        } else if (arg2 == 10) {
            this.field93 = false;
        } else if (arg2 == 11) {
            this.field104 = arg3.method2429(0);
        } else if (arg2 == 12) {
            this.field96 = true;
        } else if (arg2 == 13) {
            this.field106 = arg3.method2425(-124);
        } else if (arg2 == 14) {
            this.field101 = arg3.method2429(0);
        } else if (arg2 == 15) {
            this.field97 = arg3.method2403((byte) 90);
            if (this.field97 == 65535) {
                this.field97 = -1;
            }
        }
        if (arg0 < 78) {
            field89 = null;
        }
        field99++;
    }
}
