import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class651 {

    @OriginalMember(owner = "client!af", name = "v", descriptor = "B")
    public byte field9237 = 0;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "S")
    public short field9233;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "S")
    public short field9236;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "B")
    public byte field9218;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "B")
    public byte field9239;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "B")
    public byte field9221;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "B")
    public byte field9226;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "B")
    public byte field9230;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "B")
    public byte field9232;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lwda;")
    public class142 field9220;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lwda;")
    public class142 field9224;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lbg;")
    public class249 field9234;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lbg;")
    public class249 field9238;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Lob;")
    public class309 field9240;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lul;")
    public class331 field9227;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lia;")
    public class650 field9219;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Laf;")
    public class651 field9225;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Ldh;")
    public class82 field9228;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "S")
    public short field9229;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Z")
    public static boolean field9217;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Z")
    public boolean field9223;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Z")
    public boolean field9231;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Z")
    public boolean field9235;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 4)
    public final void method3613(byte arg0) {
        field9222++;
        while (this.field9228 != null) {
            class82 var2 = this.field9228.field1024;
            this.field9228.method461(-19611);
            this.field9228 = var2;
        }
        if (arg0 >= -9) {
            this.method3613((byte) -95);
        }
        this.field9237 = 0;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(III)V", line = 24)
    public class651(int arg0, int arg1, int arg2) {
        this.field9233 = (short) arg1;
        this.field9236 = (short) arg2;
        this.field9239 = this.field9218 = (byte) arg0;
    }
}
