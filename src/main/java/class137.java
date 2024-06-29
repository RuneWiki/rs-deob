import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field2981 = new int[100];

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lpe;")
    public static class109 field2983 = class141.method1120("Stufe)2", 0);

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lpe;")
    private static class109 field2991 = class141.method1120("Players", 0);

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lpe;")
    private static class109 field2992 = class141.method1120("K", 0);

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lpe;")
    public static class109 field2987 = field2991;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lpe;")
    private static class109 field2994 = class141.method1120("Service unavailable)3", 0);

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lpe;")
    public static class109 field2993 = field2992;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lpe;")
    public static class109 field2986 = field2994;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
    public static int[] field2998 = new int[50];

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lpe;")
    public static class109 field2988 = field2992;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lre;")
    public static class123 field2984;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lna;")
    public static class91 field2997;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2980;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[Le;")
    public static class29[] field2990;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZII)V")
    public static final void method1086(int arg0, boolean arg1, int arg2, int arg3) {
        field2982++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2 == -48001) {
            class4.field77 = arg3;
            class35.field772 = arg1;
            class127.field2816 = arg0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1087(int arg0) {
        if (arg0 != 28584) {
            method1088(false);
        }
        field2983 = null;
        field2981 = null;
        field2991 = null;
        field2992 = null;
        field2984 = null;
        field2998 = null;
        field2994 = null;
        field2993 = null;
        field2990 = null;
        field2997 = null;
        field2988 = null;
        field2980 = null;
        field2987 = null;
        field2986 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
    public static final boolean method1088(boolean arg0) {
        field2995++;
        class72 var1 = class115.field2562;
        synchronized (class115.field2562) {
            if (class84.field1783 == class104.field2199) {
                return false;
            }
            class86.field1831 = class86.field1844[class84.field1783];
            if (arg0) {
                return false;
            } else {
                class113.field2467 = class156.field3592[class84.field1783];
                class84.field1783 = class84.field1783 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
    public static int method1089(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Lrb;")
    public static final class120 method1090(int arg0, byte arg1) {
        field2985++;
        if (arg1 >= -12) {
            field2981 = null;
        }
        class120 var2 = (class120) class7.field180.method93((byte) 103, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class16.field410.method742(arg0, -122, 16);
        class120 var4 = new class120();
        if (var3 != null) {
            var4.method980(-111, new class13(var3));
        }
        class7.field180.method97((long) arg0, (byte) -100, var4);
        return var4;
    }
}
