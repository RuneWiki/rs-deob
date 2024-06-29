import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class114 {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "J")
    public long field2000 = 0L;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[J")
    public static long[] field2002 = new long[32];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lak;")
    public static class135 field1997 = new class135(260);

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[Z")
    public static boolean[] field2008 = new boolean[100];

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lak;")
    public static class135 field2007 = new class135(100);

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static volatile int field2009 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lqe;")
    public class95 field1993;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lqe;")
    public class95 field1999;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[Lgj;")
    public static class225[] field1998;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lhk;")
    public static final class122 method838(int arg0) {
        class216.field3759 = 0;
        field1992++;
        if (arg0 != 32) {
            method841(-87, 52, 115, -120, -56, -106, -115, 38);
        }
        return class258.method1740((byte) -8);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method839(int arg0, int arg1) {
        if (class41.field930 == arg0) {
            class115.field2020.method1869(arg1, 25835);
        } else {
            class199.field3452 = arg1;
        }
        field2006++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method840(boolean arg0) {
        if (!arg0) {
            field2007 = null;
        }
        field2008 = null;
        field2007 = null;
        field1997 = null;
        field2002 = null;
        field1998 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 + arg4;
        int var9 = arg1 - arg4;
        field2001++;
        for (int var10 = arg3; var10 < var8; var10++) {
            class199.method1361(arg5, arg7, class62.field1241[var10], arg6, 64);
        }
        for (int var11 = arg1; var11 > var9; var11--) {
            class199.method1361(arg5, arg7, class62.field1241[var11], arg6, 80);
        }
        int var12 = arg7 - arg4;
        int var13 = arg4 + arg6;
        if (arg0 != -22332) {
            method838(-38);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class62.field1241[var14];
            class199.method1361(arg5, var13, var15, arg6, 117);
            class199.method1361(arg2, var12, var15, var13, 65);
            class199.method1361(arg5, arg7, var15, var12, 85);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lfa;II)Lcj;")
    public static final class115 method842(class239 arg0, int arg1, int arg2) {
        field1994++;
        if (class122.method872(arg0, arg2, (byte) -20)) {
            if (arg1 != 0) {
                field2002 = null;
            }
            return class224.method1488(arg1);
        } else {
            return null;
        }
    }
}
