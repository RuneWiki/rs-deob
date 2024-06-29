import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class432 extends class342 {

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public int field6341 = -1;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "J")
    public static long field6336 = 0L;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public int field6335;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Ljava/lang/String;")
    public String field6333;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Ljava/lang/String;")
    public String field6337;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "[[B")
    public static byte[][] field6343;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)Lks;")
    public final class19 method2650(int arg0) {
        ++field6344;
        if (arg0 != Integer.MIN_VALUE) {
            this.method2650(19);
        }
        return class168.field2409[super.field5119];
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)V")
    public static final void method2651(byte arg0, int arg1) {
        ++field6339;
        class15.field179.method1481(arg0 ^ 14, arg1);
        class328.field4924.method1481(arg0 ^ 14, arg1);
        class292.field4451.method1481(3, arg1);
        if (arg0 == 13) {
            class443.field6528.method1481(3, arg1);
            class128.field1633.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BIII)V")
    public static final void method2652(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 64) {
            ++field6340;
            class341.field5085 = new byte[arg3][arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
    public static final void method2653(int arg0, int arg1, int arg2) {
        ++field6338;
        class32 var3 = class136.method854(arg2, (byte) 83, arg1);
        var3.method194(false);
        var3.field404 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
    public static void method2654(int arg0) {
        if (arg0 == 12530) {
            field6343 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BZI)Lin;")
    public static final class148 method2655(byte arg0, boolean arg1, int arg2) {
        ++field6342;
        long var3 = (long) ((!arg1 ? 0 : Integer.MIN_VALUE) | arg2);
        if (arg0 < 104) {
            method2655((byte) -15, false, 35);
        }
        return (class148) class72.field937.method2302(var3, 23576);
    }
}
