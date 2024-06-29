import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class93 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lvc;")
    private static class137 field2198 = class45.method325("Public chat", -46);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lvc;")
    public static class137 field2197 = class45.method325("Verbindung mit Update)2Server)3)3)3", -46);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
    public static int[] field2206 = new int[4000];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
    public static boolean field2192 = false;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lvc;")
    public static class137 field2205 = null;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lvc;")
    public static class137 field2208 = class45.method325("redstone2", -46);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lvc;")
    public static class137 field2207 = class45.method325("Fps:", -46);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[J")
    public static long[] field2212 = new long[100];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lvc;")
    private static class137 field2202 = class45.method325("Offline", -46);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lvc;")
    public static class137 field2204 = field2202;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lvc;")
    public static class137 field2209 = field2198;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lvc;")
    public static class137 field2214 = class45.method325("null", -46);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lfc;")
    public static class39 field2195;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Loa;")
    public static class93 field2213;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field2201;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public int[] field2194;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field2202 = null;
        field2213 = null;
        field2207 = null;
        field2206 = null;
        field2204 = null;
        field2209 = null;
        field2198 = null;
        field2205 = null;
        field2195 = null;
        field2208 = null;
        field2212 = null;
        field2214 = null;
        if (arg0 >= -109) {
            method678((byte) -78, -103, -27, null);
        }
        field2197 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method60(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIILtc;)V")
    public static final void method678(byte arg0, int arg1, int arg2, class125 arg3) {
        if (arg3.field1654 == arg1 && arg1 != -1) {
            int var4 = class68.method481(0, arg1).field3368;
            if (var4 == 1) {
                arg3.field1680 = 0;
                arg3.field1641 = 0;
                arg3.field1669 = arg2;
                arg3.field1629 = 0;
            }
            if (var4 == 2) {
                arg3.field1641 = 0;
            }
        } else if (arg1 == -1 || arg3.field1654 == -1 || class68.method481(0, arg1).field3365 >= class68.method481(0, arg3.field1654).field3365) {
            arg3.field1623 = arg3.field1631;
            arg3.field1641 = 0;
            arg3.field1669 = arg2;
            arg3.field1629 = 0;
            arg3.field1654 = arg1;
            arg3.field1680 = 0;
        }
        field2203++;
        if (arg0 != -47) {
            method678((byte) -31, 121, -57, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public abstract void method61(int arg0, Graphics arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILvc;I)V")
    public static final void method679(int arg0, class137 arg1, int arg2) {
        if (arg0 != 0) {
            field2195 = null;
        }
        class72.field1527.method845(115, 100);
        class72.field1527.method818(arg2, (byte) 125);
        class72.field1527.method815(-2003, arg1.method1030(65));
        field2200++;
        class4.field55++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method680(int arg0) {
        class62.method445(this.field2194, this.field2199, this.field2210);
        field2196++;
        int var2 = -10 % (-arg0 / 43);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    protected class93() {
    }
}
