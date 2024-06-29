import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class247 extends class71 {

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field3922 = 0;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field3935 = 0;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Z")
    public static boolean field3928 = false;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3939 = "Members object";

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Lok;")
    public class160 field3929;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "Lok;")
    public class160 field3931;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "Ljava/lang/String;")
    public String field3927;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "Z")
    public boolean field3934;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field3925;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI[Lok;)V", line = 6)
    public static final void method1754(byte arg0, int arg1, class160[] arg2) {
        field3926++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class160 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2608 == 0) {
                    if (var4.field2459 != null) {
                        method1754((byte) 68, arg1, var4.field2459);
                    }
                    class224 var5 = (class224) class176.field2870.method1743((long) var4.field2446, (byte) -116);
                    if (var5 != null) {
                        class125.method864(var5.field3564, arg1, -1);
                    }
                }
                if (arg1 == 0 && var4.field2620 != null) {
                    class247 var6 = new class247();
                    var6.field3925 = var4.field2620;
                    var6.field3931 = var4;
                    class69.method455(var6, (byte) -64);
                }
                if (arg1 == 1 && var4.field2527 != null) {
                    if (var4.field2456 >= 0) {
                        class160 var7 = class37.method238((byte) -128, var4.field2446);
                        if (var7 == null || var7.field2459 == null || var7.field2459.length <= var4.field2456 || var7.field2459[var4.field2456] != var4) {
                            continue;
                        }
                    }
                    class247 var8 = new class247();
                    var8.field3925 = var4.field2527;
                    var8.field3931 = var4;
                    class69.method455(var8, (byte) -64);
                }
            }
        }
        if (arg0 != 68) {
            method1756(14);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 76)
    public static final void method1755(int arg0) {
        field3923++;
        if (arg0 != -2) {
            field3922 = 74;
        }
        if (class105.field1585 == 5) {
            class105.field1585 = 6;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 90)
    public static void method1756(int arg0) {
        field3939 = null;
        if (arg0 >= -21) {
            method1755(-6);
        }
    }
}
