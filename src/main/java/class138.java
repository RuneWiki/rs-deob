import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class138 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lhu;")
    private class76 field1996 = new class76(64);

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lr;")
    private class110 field2002;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lad;")
    public static class268 field1994 = new class268(32);

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lh;")
    public static class434 field2005 = new class434(104, 4);

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[I")
    public static int[] field2006 = new int[2];

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
    public static int[] field2007 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "S")
    public static short field2009 = 1;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[I")
    public static int[] field2010;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[[S")
    public static short[][] field2004;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method830(int arg0) {
        class76 var2 = this.field1996;
        synchronized (this.field1996) {
            this.field1996.method495(-69);
        }
        if (arg0 <= 118) {
            field2003 = 58;
        }
        field1997++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public final void method831(byte arg0) {
        field2001++;
        if (arg0 == -97) {
            class76 var2 = this.field1996;
            synchronized (this.field1996) {
                this.field1996.method502(0);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static final void method832(int arg0) {
        if (arg0 < 105) {
            return;
        }
        if (class98.field1432.method1951()) {
            class63.method427(-123);
            class98.field1432.method2110(class28.field378);
            class480.method2803((byte) -83);
        } else {
            class107.method664(class222.field2958, (byte) 126);
        }
        field1998++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public final void method833(boolean arg0, int arg1) {
        class76 var3 = this.field1996;
        synchronized (this.field1996) {
            this.field1996.method496(arg1, 118);
            if (arg0) {
                field2008 = -125;
            }
        }
        field2000++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lud;")
    public final class26 method834(int arg0, int arg1) {
        field1995++;
        class76 var3 = this.field1996;
        class26 var4;
        synchronized (this.field1996) {
            var4 = (class26) this.field1996.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2002.method702((byte) 29, arg1, 35);
        class26 var6 = new class26();
        if (var5 != null) {
            var6.method154((byte) -31, new class32(var5));
        }
        var6.method152((byte) 116);
        class76 var7 = this.field1996;
        synchronized (this.field1996) {
            if (arg0 != 9636) {
                this.method831((byte) 60);
            }
            this.field1996.method505((long) arg1, var6, 105);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static void method835(int arg0) {
        field2005 = null;
        field1994 = null;
        if (arg0 == 168) {
            field2007 = null;
            field2010 = null;
            field2006 = null;
            field2004 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class138(class329 arg0, int arg1, class110 arg2) {
        this.field2002 = arg2;
        if (this.field2002 != null) {
            this.field2002.method694(35, (byte) 119);
        }
    }
}
