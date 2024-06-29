import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class327 extends class141 {

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "J")
    public long field5592;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field5587 = 0;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "Lhi;")
    public static class82 field5594 = class95.method664((byte) -126, "b12_full");

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "[J")
    public static long[] field5590 = new long[32];

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "Lhi;")
    public static class82 field5593 = class95.method664((byte) -109, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "[Lhi;")
    public static class82[] field5589 = new class82[500];

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "Lhi;")
    public static class82 field5591 = class95.method664((byte) -99, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field5597 = 10;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Lum;")
    public static class222 field5586;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 22)
    public static void method2239(int arg0) {
        field5586 = null;
        field5594 = null;
        field5593 = null;
        field5589 = null;
        if (arg0 >= -99) {
            field5594 = (class82) null;
        }
        field5590 = null;
        field5591 = null;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 37)
    public class327() {
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)Lhi;", line = 47)
    public static final class82 method2240(byte arg0, int arg1) {
        field5595++;
        return arg0 == -74 ? class192.method1335(10, false, false, arg1) : (class82) null;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(J)V", line = 56)
    public class327(long arg0) {
        this.field5592 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V", line = 67)
    public static final void method2241(int arg0, int arg1, int arg2) {
        int var3 = 78 % ((-arg2 - 32) / 40);
        field5588++;
        class312.field5398[arg0] = arg1;
        class327 var4 = (class327) class111.field1995.method507((long) arg0, 602425312);
        if (var4 == null) {
            class327 var5 = new class327(class57.method391(19211) + 500L);
            class111.field1995.method503((long) arg0, -53, var5);
        } else {
            var4.field5592 = class57.method391(19211) + 500L;
        }
    }
}
