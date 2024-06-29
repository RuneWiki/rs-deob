import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lgd;")
    public static class40 field1985 = class14.method90(false, "backleft2");

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lgd;")
    public static class40 field1988 = class14.method90(false, " )2> @whi@");

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field1992 = 1;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lgd;")
    public static class40 field1993 = class14.method90(false, "Offline");

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lgd;")
    public static class40 field1998 = class14.method90(false, ":tradereq:");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lgd;")
    private static class40 field1983 = class14.method90(false, "You have only just left another world)3");

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lgd;")
    public static class40 field2000 = class14.method90(false, "::");

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lgd;")
    private static class40 field1996 = class14.method90(false, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lgd;")
    public static class40 field1989 = field1983;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lgd;")
    public static class40 field1997 = class14.method90(false, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lgd;")
    public static class40 field1984 = field1996;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Loe;")
    public static class89 field1991 = new class89();

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lgd;")
    public static class40 field2002 = class14.method90(false, ")1");

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lee;")
    public static class30 field1999;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[I")
    public static int[] field2001;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[Lhd;")
    public static class46[] field1987;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBIIIIII)V", line = 38)
    public static final void method579(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1994++;
        if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
            if (class8.field209 && class99.field2361 != arg2) {
                return;
            }
            int var8 = 0;
            if (arg3 == 0) {
                var8 = class21.field490.method970(arg2, arg0, arg4);
            }
            if (arg3 == 1) {
                var8 = class21.field490.method977(arg2, arg0, arg4);
            }
            boolean var9 = true;
            if (arg3 == 2) {
                var8 = class21.field490.method960(arg2, arg0, arg4);
            }
            if (arg3 == 3) {
                var8 = class21.field490.method989(arg2, arg0, arg4);
            }
            boolean var10 = false;
            boolean var11 = false;
            if (var8 != 0) {
                int var12 = class21.field490.method957(arg2, arg0, arg4, var8);
                int var13 = var12 & 0x1F;
                int var14 = var8 >> 14 & 0x7FFF;
                int var15 = var12 >> 6 & 0x3;
                if (arg3 == 0) {
                    class21.field490.method990(arg2, arg0, arg4);
                    class14 var16 = class114.method884(var14, (byte) -56);
                    if (var16.field410) {
                        class54.field1392[arg2].method698(true, var16.field379, arg4, arg0, var15, var13);
                    }
                }
                if (arg3 == 1) {
                    class21.field490.method972(arg2, arg0, arg4);
                }
                if (arg3 == 2) {
                    class21.field490.method956(arg2, arg0, arg4);
                    class14 var17 = class114.method884(var14, (byte) -56);
                    if (var17.field363 + arg0 > 103 || var17.field363 + arg4 > 103 || var17.field370 + arg0 > 103 || var17.field370 + arg4 > 103) {
                        return;
                    }
                    if (var17.field410) {
                        class54.field1392[arg2].method699(119, var17.field379, arg4, var15, arg0, var17.field370, var17.field363);
                    }
                }
                if (arg3 == 3) {
                    class21.field490.method965(arg2, arg0, arg4);
                    class14 var18 = class114.method884(var14, (byte) -56);
                    if (var18.field410 && var18.field360 == 1) {
                        class54.field1392[arg2].method696(arg0, (byte) 102, arg4);
                    }
                }
            }
            if (arg5 >= 0) {
                int var19 = arg2;
                if (arg2 < 3 && (class112.field2716[1][arg0][arg4] & 0x2) == 2) {
                    var19 = arg2 + 1;
                }
                class135.method1066(arg2, arg4, class54.field1392[arg2], 127, arg6, arg0, arg5, var19, class21.field490, arg7);
            }
        }
        if (arg1 != -110) {
            method580((byte) 85);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 149)
    public static void method580(byte arg0) {
        field1985 = null;
        field2002 = null;
        field1999 = null;
        field2000 = null;
        field2001 = null;
        field1993 = null;
        field1997 = null;
        field1984 = null;
        field1988 = null;
        field1987 = null;
        field1983 = null;
        field1996 = null;
        field1989 = null;
        int var1 = -46 / ((arg0 - 70) / 34);
        field1998 = null;
        field1991 = null;
    }
}
