import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class77 extends class239 implements class669 {

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "B")
    private byte field1140;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!jca", name = "G", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!jca", name = "I", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!jca", name = "J", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "[Lnh;")
    public static class754[] field1134;

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "[[I")
    public static int[][] field1131;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method692(boolean arg0, int arg1) {
        if (arg1 != -31414) {
            return null;
        } else {
            ++field1135;
            return super.method1657(63, super.field3856.field9165, arg0);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZII)Z")
    public final boolean method693(boolean arg0, int arg1, int arg2) {
        this.field1140 = (byte) arg2;
        ++field1132;
        super.method924((byte) -61, arg1);
        return arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method694(long arg0, byte arg1) {
        ++field1137;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                int var4 = 7 / ((-17 - arg1) / 43);
                for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                    ++var3;
                }
                StringBuffer var7 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    var7.append(class467.field6806[(int) (var8 - arg0 * 37L)]);
                }
                return var7.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I")
    public final int method695(byte arg0) {
        ++field1139;
        return arg0 < 37 ? 95 : super.method695((byte) 45);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z")
    public final boolean method696(int arg0) {
        ++field1136;
        if (arg0 != -11404) {
            method699(-127, -59);
        }
        return super.method1658(arg0 + 19155, super.field3856.field9165);
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
    public final void method697(int arg0) {
        super.method697(arg0);
        ++field1142;
        if (arg0 != -18934) {
            this.field1140 = -107;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method698(int arg0, Source arg1, int arg2, int arg3) {
        if (arg0 > -111) {
            this.method692(false, -107);
        }
        ++field1143;
        this.field1140 = (byte) arg2;
        super.method1659(25163, arg3, arg1);
        return true;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
    public static final int method699(int arg0, int arg1) {
        ++field1144;
        if (arg1 >= -120) {
            return -78;
        } else {
            byte var2;
            if (~arg0 >= -12001) {
                if (~arg0 < -5001) {
                    class303.method1991(125);
                    var2 = 3;
                } else if (~arg0 >= -2001) {
                    class223.method1579(0, true);
                    var2 = 1;
                } else {
                    var2 = 2;
                    class407.method2519(false);
                }
            } else {
                var2 = 4;
                class661.method3721(1);
            }
            if (~class654.field9289.field5415.method2004(3) != -3) {
                class654.field9289.method2292(-81, 2, class654.field9289.field5446);
                class526.method3125(1221653740, 2, false);
            }
            class580.method3351((byte) -79);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "(I)V")
    public static void method700(int arg0) {
        field1131 = null;
        field1134 = null;
        if (arg0 != 37) {
            method699(110, 57);
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lom;Z)V")
    public class77(class642 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Z")
    public static final boolean method701(int arg0, int arg1, int arg2) {
        if (arg1 > -32) {
            method699(-42, -108);
        }
        ++field1138;
        return ~(1024 & arg0) != -1;
    }

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "(I)I")
    public final int method702(int arg0) {
        if (arg0 <= 45) {
            field1131 = null;
        }
        ++field1145;
        return this.field1140;
    }
}
