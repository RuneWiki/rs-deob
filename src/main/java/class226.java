import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class class226 extends class513 {

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "Lep;")
    public class371 field3160;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "Z")
    public boolean field3158;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "[Z")
    public static boolean[] field3165;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
    public int method876(int arg0) {
        field3164++;
        if (arg0 != 1) {
            method1468(-20, 31, -82);
        }
        return 0;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZI)V")
    public abstract void method885(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1463(byte arg0) {
        field3159++;
        if (class484.field6549 || class627.field8950 == null) {
            return "";
        } else if ((class627.field8950.field50 == null || class627.field8950.field50.length() == 0) && class627.field8950.field53 != null && class627.field8950.field53.length() > 0) {
            return class627.field8950.field53;
        } else if (arg0 == 0) {
            return class627.field8950.field50;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)Z")
    public final boolean method1464(int arg0) {
        field3168++;
        if (arg0 != 1) {
            this.method881(2);
        }
        return this.field3158;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lep;)V")
    public class226(class371 arg0) {
        this.field3160 = arg0;
    }

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3165 = null;
        if (arg0 != 7784) {
            field3165 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "(I)I")
    public final int method1466(int arg0) {
        if (arg0 != 3180) {
            this.method882(-37);
        }
        field3166++;
        return 1;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)Z")
    public final boolean method1467(byte arg0) {
        field3163++;
        if (arg0 != -90) {
            method1463((byte) 4);
        }
        return false;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V")
    public abstract void method883(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "(I)Z")
    public abstract boolean method879(int arg0);

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)Z")
    public static final boolean method1468(int arg0, int arg1, int arg2) {
        if (arg2 != 7961) {
            field3165 = null;
        }
        field3161++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "(I)V")
    public abstract void method881(int arg0);

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "(I)Z")
    public abstract boolean method882(int arg0);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lfq;ILfq;B)V")
    public abstract void method887(class204 arg0, int arg1, class204 arg2, byte arg3);

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(III)Z")
    public static final boolean method1469(int arg0, int arg1, int arg2) {
        field3162++;
        if (arg2 != 0) {
            method1468(-119, 15, -77);
        }
        return (arg1 & 0x70000) != 0 | class644.method3732(arg1, arg0, true) || class731.method4068(arg0, -210571632, arg1);
    }
}
