import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class136 {

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public int field103 = 1190717;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public int field104 = -1;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public int field112 = 16;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public int field98 = -1;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Z")
    public boolean field113 = true;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public int field111 = 0;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Li;")
    public static class88 field102 = class208.method1425(105, "sl_stars");

    @OriginalMember(owner = "client!af", name = "S", descriptor = "[S")
    public static short[] field108 = new short[256];

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "[Li;")
    public static class88[] field114 = new class88[1000];

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Z")
    public static boolean field99;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "[Llj;")
    public static class130[] field106;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "[[S")
    public static short[][] field96;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "[[[B")
    public static byte[][][] field105;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
    public static final void method37(byte arg0) {
        class241.field4472.method134(50);
        if (arg0 != 99) {
            method37((byte) 35);
        }
        field101++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILea;I)V")
    public final void method38(int arg0, class46 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method347(26119);
            if (var4 == 0) {
                int var5 = 10 / (arg0 / 51);
                field109++;
                return;
            }
            this.method41(1, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static final void method39(int arg0) {
        if (arg0 != 26249) {
            method40((byte) -70);
        }
        class156.field3014 = null;
        class221.field4176 = null;
        class234.field4379 = null;
        class221.field4175 = null;
        class135.field2513 = null;
        class151.field2942 = null;
        class111.field2022 = null;
        class8.field115 = null;
        class164.field3144 = null;
        class109.field1964 = null;
        class85.field1541 = null;
        field107++;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field114 = null;
        field105 = null;
        if (arg0 <= 111) {
            field110 = -110;
        }
        field96 = null;
        field106 = null;
        field102 = null;
        field108 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILea;)V")
    private final void method41(int arg0, int arg1, int arg2, class46 arg3) {
        if (arg0 == arg2) {
            this.field111 = class131.method885(arg3.method304(arg0 ^ 0xFFFF8C42), (byte) -84);
        } else if (arg2 == 2) {
            this.field98 = arg3.method347(26119);
        } else if (arg2 == 3) {
            this.field98 = arg3.method301(arg0 + 100);
            if (this.field98 == 65535) {
                this.field98 = -1;
            }
        } else if (arg2 == 5) {
            this.field113 = false;
        } else if (arg2 == 7) {
            this.field104 = class131.method885(arg3.method304(-29629), (byte) -84);
        } else if (arg2 == 8) {
            class133.field2491 = arg1;
        } else if (arg2 == 9) {
            arg3.method301(118);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg3.method347(26119);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    this.field103 = arg3.method304(arg0 ^ 0xFFFF8C42);
                } else if (arg2 == 14) {
                    this.field112 = arg3.method347(26119);
                }
            }
        }
        field97++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public static final void method42(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field956 = null;
        }
    }
}
