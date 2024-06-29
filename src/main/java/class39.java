import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lid;")
    public static class60 field924 = class11.method72("Passwort: ", (byte) 115);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lid;")
    public static class60 field933 = class11.method72("Stufe)2", (byte) -74);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lmc;")
    public static class86 field929 = new class86(8);

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lid;")
    public static class60 field935 = class11.method72("Ung-Ultige Session)2ID)3", (byte) 100);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "J")
    private static long field934;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[Lfd;")
    public static class40[] field930;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILfd;)Lid;")
    public static final class60 method304(int arg0, int arg1, class40 arg2) {
        field926++;
        if (!class72.method552(53, arg0, class97.method770(arg2, -1370253216)) && arg2.field1026 == null) {
            return null;
        } else if (arg1 != -1) {
            return null;
        } else if (arg2.field1056 == null || arg0 >= arg2.field1056.length || arg2.field1056[arg0] == null || arg2.field1056[arg0].method422(0).method447((byte) 39) == 0) {
            return class40.field1000 ? class104.method853(arg1 - 112, new class60[] { class136.field3075, class98.method774((byte) -121, arg0) }) : null;
        } else {
            return arg2.field1056[arg0];
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
    public static final int method305(int arg0, int arg1, int arg2) {
        if (arg2 <= 16) {
            return 125;
        }
        field925++;
        class23 var3 = (class23) class16.field404.method716((byte) 20, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field566.length; var5++) {
                if (var3.field574[var5] == arg0) {
                    var4 += var3.field566[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
    public static final void method306(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field928++;
        if (arg0 <= 83) {
            field935 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)J")
    public static final synchronized long method307(int arg0) {
        field931++;
        long var1 = System.currentTimeMillis();
        if (var1 < class78.field1927) {
            field934 += class78.field1927 - var1;
        }
        if (arg0 != 8) {
            method306((byte) -5, -65L);
        }
        class78.field1927 = var1;
        return field934 + var1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method308(byte arg0) {
        field924 = null;
        field930 = null;
        if (arg0 < -81) {
            field929 = null;
            field933 = null;
            field935 = null;
        }
    }
}
