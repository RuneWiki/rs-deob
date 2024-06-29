import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class64 implements Runnable {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
    public boolean field1245 = true;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field1254 = new Object();

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public int field1258 = 0;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[I")
    public int[] field1257 = new int[500];

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
    public int[] field1259 = new int[500];

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lcc;")
    public static class209 field1253 = class95.method669(103, "um");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lcc;")
    private static class209 field1251 = class95.method669(83, "Loaded world list data");

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lcc;")
    public static class209 field1249 = class95.method669(102, "event_opbase");

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Z")
    public static boolean field1244 = false;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lcc;")
    public static class209 field1248 = field1251;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1255;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method475(int arg0) {
        field1250++;
        if (class1.field22 > 0) {
            class94.method657(false);
            return;
        }
        class171.field3134 = class193.field3488;
        class193.field3488 = null;
        class155.method1088(40, -3280);
        if (arg0 != 50) {
            method475(-6);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method476(byte arg0) {
        field1251 = null;
        field1253 = null;
        if (arg0 <= -20) {
            field1249 = null;
            field1255 = null;
            field1248 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILsj;Lsj;)V")
    public static final void method477(int arg0, class49 arg1, class49 arg2) {
        field1256++;
        class66.field1270 = class273.method1862(arg0, arg1, (byte) 118, class261.field4701, arg2);
        class262.field4717 = (class77) class66.field1270;
        class256.field4623 = class273.method1862(0, arg1, (byte) -125, class112.field2256, arg2);
        class66.field1269 = class273.method1862(0, arg1, (byte) 110, class100.field1948, arg2);
    }

    @OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
    public final void run() {
        field1252++;
        while (this.field1245) {
            Object var1 = this.field1254;
            synchronized (this.field1254) {
                if (this.field1258 < 500) {
                    this.field1259[this.field1258] = class150.field2735;
                    this.field1257[this.field1258] = class126.field2435;
                    this.field1258++;
                }
            }
            class174.method1196((byte) 114, 50L);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method478(int arg0, int arg1) {
        field1246++;
        int var2 = 52 % ((-arg0 - 34) / 54);
        if (class244.field4428 == 0) {
            class44.field873.method141(arg1, -1);
        } else {
            class54.field1067 = arg1;
        }
    }
}
