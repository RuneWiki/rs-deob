import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class403 implements class264 {

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public int field6215;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public int field6220;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "Lmea;")
    public class395 field6226;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public int field6216;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Ljava/lang/String;")
    public String field6222;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lja;")
    public class254 field6229;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field6221 = 0;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field6218 = 0;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field6230 = 0;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
    public static final boolean method2586(int arg0, int arg1, int arg2) {
        field6217++;
        if (arg2 < 114) {
            method2587(-9, -37);
        }
        return (class121.method1078(30518, arg0, arg1) | class544.method3289(arg1, -30085, arg0) | class53.method590(arg1, -73, arg0)) & class107.method1014(-112, arg0, arg1);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
    public static final void method2587(int arg0, int arg1) {
        if (arg1 > -69) {
            field6221 = 37;
        }
        field6225++;
        class66.field854.method573((byte) 126, arg0);
        class177.field2913.method573((byte) 117, arg0);
        class345.field5554.method573((byte) 125, arg0);
        class246.field3929.method573((byte) 121, arg0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public static final void method2588(int arg0) {
        if (arg0 != 0) {
            field6221 = -92;
        }
        field6227++;
        class474.field7020 = class368.method2435(35, 8, 0.4F, 2048, 8, true, 4, arg0 - 15);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Leu;")
    public final class444 method1247(int arg0) {
        field6231++;
        if (arg0 != 3848) {
            method2588(1);
        }
        return class147.field2460;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ljava/lang/String;Lja;Lmea;IIIIIIIIII)V")
    public class403(String arg0, class254 arg1, class395 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field6223 = arg9;
        this.field6215 = arg11;
        this.field6224 = arg4;
        this.field6219 = arg7;
        this.field6220 = arg6;
        this.field6232 = arg10;
        this.field6226 = arg2;
        this.field6216 = arg5;
        this.field6233 = arg8;
        this.field6228 = arg3;
        this.field6222 = arg0;
        this.field6229 = arg1;
        this.field6213 = arg12;
    }
}
