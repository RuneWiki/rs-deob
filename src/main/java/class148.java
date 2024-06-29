import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class148 {

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "B")
    public byte field2094 = 0;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "S")
    public short field2083;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "S")
    public short field2087;

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "B")
    public byte field2101;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "B")
    public byte field2100;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Z")
    public static boolean field2075 = false;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "[I")
    public static int[] field2069 = new int[8];

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "B")
    public byte field2080;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "B")
    public byte field2088;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "B")
    public byte field2095;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "B")
    public byte field2096;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "Lnt;")
    public class148 field2091;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Lrb;")
    public class235 field2078;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "Lrb;")
    public class235 field2098;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Lhr;")
    public class363 field2082;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "Lii;")
    public class386 field2079;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Lii;")
    public class386 field2085;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "Lua;")
    public class470 field2084;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lag;")
    public class480 field2086;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "Lmc;")
    public class88 field2099;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2081;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "S")
    public short field2090;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "Z")
    public boolean field2092;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "Z")
    public boolean field2093;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "Z")
    public boolean field2097;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "[B")
    public static byte[] field2072;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZII)V", line = 3)
    public static final void method1068(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (class478.field7044.field3349 != 0 && arg0 != 0 && class388.field5740 < 50 && arg3 != -1) {
            class476.field7011[class388.field5740++] = new class114((byte) 2, arg3, arg0, arg1, arg4, 0);
        }
        if (!arg2) {
            field2076++;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 20)
    public static final String method1069(int arg0, byte arg1) {
        if (arg1 == -71) {
            field2077++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1070(int arg0, int arg1, int arg2) {
        field2070++;
        return arg1 == -1 ? (class463.method2776(arg0, arg2, 2) | class484.method2911(arg2, -1376312589, arg0) | class439.method2686((byte) 101, arg2, arg0)) & class11.method76(arg0, (byte) 126, arg2) : false;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 47)
    public final void method1071(byte arg0) {
        field2089++;
        while (this.field2086 != null) {
            class480 var2 = this.field2086.field7058;
            this.field2086.method2894(93);
            this.field2086 = var2;
        }
        this.field2094 = arg0;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(III)V", line = 74)
    public class148(int arg0, int arg1, int arg2) {
        this.field2083 = (short) arg2;
        this.field2087 = (short) arg1;
        this.field2100 = this.field2101 = (byte) arg0;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lfs;Lga;B)V", line = 87)
    public static final void method1072(class387 arg0, class277 arg1, byte arg2) {
        class147.field2065 = arg0;
        field2071++;
        class392.field5772 = arg1;
        if (arg2 != -62) {
            field2073 = -43;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 119)
    public static void method1073(int arg0) {
        if (arg0 == 255) {
            field2081 = null;
            field2072 = null;
            field2069 = null;
        }
    }
}
