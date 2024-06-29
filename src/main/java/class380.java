import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class380 extends class71 {

    @OriginalMember(owner = "client!afa", name = "G", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5454 = new Hashtable();

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
    public int field5433;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "I")
    public int field5434;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "I")
    public int field5436;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!afa", name = "t", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!afa", name = "u", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!afa", name = "v", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!afa", name = "x", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!afa", name = "y", descriptor = "I")
    public int field5446;

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!afa", name = "A", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!afa", name = "B", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!afa", name = "C", descriptor = "I")
    public int field5450;

    @OriginalMember(owner = "client!afa", name = "D", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!afa", name = "E", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!afa", name = "F", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!afa", name = "H", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!afa", name = "K", descriptor = "Luu;")
    public static class237 field5457;

    @OriginalMember(owner = "client!afa", name = "J", descriptor = "Lbha;")
    public class301 field5456;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "Lwo;")
    public class695 field5431;

    @OriginalMember(owner = "client!afa", name = "w", descriptor = "Lkca;")
    public class760 field5444;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "Ldv;")
    public class88 field5439;

    @OriginalMember(owner = "client!afa", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field5458;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lha;IIIIIII)V", line = 19)
    public static final void method2381(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5451++;
        arg0.method3249(arg1, 51, arg5, arg7, arg2, arg3);
        if (arg4 != -96) {
            method2385((byte) -121, 113, -41);
        }
        arg0.method3249(arg1 + 1, 124, 16, arg7 - 2, arg6, arg3 + 1);
        arg0.method3250(29600, arg5 - 19, arg1 + 1, arg7 - 2, arg3 + 18, arg6);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 34)
    public final void method2382(int arg0) {
        field5455++;
        this.field5439 = null;
        int var2 = 61 / ((-arg0 - 56) / 52);
        this.field5431 = null;
        this.field5444 = null;
        this.field5456 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZC)Z", line = 56)
    public static final boolean method2383(boolean arg0, char arg1) {
        if (arg0) {
            field5432++;
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V", line = 67)
    public static void method2384(int arg0) {
        field5454 = null;
        if (arg0 == -7211) {
            field5457 = null;
            field5458 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BII)I", line = 79)
    public static final int method2385(byte arg0, int arg1, int arg2) {
        field5440++;
        int var3 = arg1 >>> 24;
        int var4 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        if (arg0 != -56) {
            field5454 = null;
        }
        int var5 = 255 - var3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }
}
