import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class172 extends class455 implements class113 {

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "Lab;")
    public class455 field2348;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Lpp;")
    public static class256 field2345 = new class256("", 11);

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        field2343++;
        if (arg1 != -1) {
            this.field2348 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
    public static void method1086(byte arg0) {
        field2345 = null;
        if (arg0 <= 59) {
            field2345 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method368(int arg0) {
        field2335++;
        if (arg0 != 5894) {
            field2345 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
    public final int method362(byte arg0) {
        field2337++;
        return arg0 == -72 ? 0 : -111;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Leq;Z)V")
    public final void method360(class134 arg0, boolean arg1) {
        field2341++;
        if (!arg1) {
            field2345 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLeq;)V")
    public final void method372(byte arg0, class134 arg1) {
        if (arg0 <= -49) {
            field2346++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method1087(boolean arg0, String arg1) {
        field2347++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg0) {
            return -32L;
        }
        while (var2 > var5) {
            var3 = (long) arg1.charAt(var5) + ((var3 << 5) - var3);
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        field2338++;
        if (arg1) {
            this.field2348 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILeq;Z)Lva;")
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            method1086((byte) -123);
        }
        field2339++;
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        if (arg0 < 24) {
            field2349 = -121;
        }
        field2350++;
        return 0;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)I")
    public final int method370(byte arg0) {
        field2344++;
        if (arg0 >= -3) {
            this.field2348 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZIIIII)V")
    public static final void method1088(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2342++;
        int var7 = class372.method2266(class7.field131, -20228, class92.field1252, arg0);
        int var8 = class372.method2266(class7.field131, -20228, class92.field1252, arg5);
        if (!arg1) {
            method1086((byte) -43);
        }
        int var9 = class372.method2266(class473.field6839, -20228, class63.field933, arg2);
        int var10 = class372.method2266(class473.field6839, -20228, class63.field933, arg4);
        int var11 = class372.method2266(class7.field131, -20228, class92.field1252, arg0 + arg3);
        int var12 = class372.method2266(class7.field131, -20228, class92.field1252, arg5 - arg3);
        for (int var13 = var7; var13 < var11; var13++) {
            class238.method1440(class41.field629[var13], arg6, var10, var9, -14726);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class238.method1440(class41.field629[var14], arg6, var10, var9, -14726);
        }
        int var15 = class372.method2266(class473.field6839, -20228, class63.field933, arg2 + arg3);
        int var16 = class372.method2266(class473.field6839, -20228, class63.field933, arg4 - arg3);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class41.field629[var17];
            class238.method1440(var18, arg6, var15, var9, -14726);
            class238.method1440(var18, arg6, var10, var16, -14726);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        if (arg0) {
            field2345 = null;
        }
        field2340++;
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIILab;)V")
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, class455 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class77.method510(116, arg0, arg1));
        this.field2348 = arg5;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        int var5 = 20 / ((arg2 + 23) / 38);
        field2352++;
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
    public final int method359(int arg0) {
        field2334++;
        return arg0 == 13228 ? 0 : -53;
    }

    static {
        new class194("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field2349 = 0;
        field2351 = 0;
    }
}
