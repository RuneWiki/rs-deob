import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class349 {

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Laf;")
    public class39 field5079 = new class39(20);

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Laf;")
    private class39 field5082 = new class39(64);

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lae;")
    private class283 field5075;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lae;")
    public class283 field5078;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Liga;")
    public static class91 field5071 = new class91(2, -1);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5072 = new String[8];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5074 = new Rectangle[100];

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Ljn;")
    public static class134 field5081 = new class134(70, 1);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lbq;", line = 15)
    public static final class727 method2197(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        return var3 == null || var3.field6540 == null ? null : var3.field6540;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2198(int arg0, int arg1) {
        if (class531.field7316 == 1) {
            class153.field2007 = arg1;
        } else if (class531.field7316 == 2) {
            class687.field9591 = arg1;
        }
        if (arg0 != 13609) {
            method2198(105, -44);
        }
        field5073++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 43)
    public final void method2199(int arg0) {
        field5083++;
        class39 var2 = this.field5082;
        synchronized (this.field5082) {
            this.field5082.method314(arg0 ^ 0xFFFFFFF6);
        }
        class39 var3 = this.field5079;
        synchronized (this.field5079) {
            this.field5079.method314(-2);
            if (arg0 != 8) {
                method2203((byte) -34);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lqg;", line = 62)
    public final class302 method2200(int arg0, int arg1) {
        if (arg0 > -24) {
            return null;
        }
        field5077++;
        class39 var3 = this.field5082;
        class302 var4;
        synchronized (this.field5082) {
            var4 = (class302) this.field5082.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field5075;
        byte[] var6;
        synchronized (this.field5075) {
            var6 = this.field5075.method1849(arg1, (byte) -110, 46);
        }
        class302 var7 = new class302();
        var7.field4400 = this;
        if (var6 != null) {
            var7.method1976(new class511(var6), false);
        }
        class39 var8 = this.field5082;
        synchronized (this.field5082) {
            this.field5082.method305(var7, (long) arg1, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 97)
    public final void method2201(int arg0) {
        field5080++;
        class39 var2 = this.field5082;
        synchronized (this.field5082) {
            if (arg0 != 1) {
                method2197(-110, -65, -2);
            }
            this.field5082.method319(-120);
        }
        class39 var3 = this.field5079;
        synchronized (this.field5079) {
            this.field5079.method319(-116);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)I", line = 113)
    public static final int method2202(int arg0, int arg1) {
        if (arg0 != 8) {
            field5071 = null;
        }
        field5076++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ljk;ILae;Lae;)V", line = 152)
    public class349(class788 arg0, int arg1, class283 arg2, class283 arg3) {
        this.field5075 = arg2;
        this.field5078 = arg3;
        this.field5075.method1867(46, (byte) 49);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 135)
    public static void method2203(byte arg0) {
        field5071 = null;
        field5072 = null;
        int var1 = -62 / ((arg0 + 8) / 42);
        field5074 = null;
        field5081 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V", line = 168)
    public final void method2204(boolean arg0, int arg1) {
        field5070++;
        class39 var3 = this.field5082;
        synchronized (this.field5082) {
            this.field5082.method308(-1, arg1);
        }
        class39 var4 = this.field5079;
        synchronized (this.field5079) {
            this.field5079.method308(-1, arg1);
        }
        if (arg0) {
            method2202(-120, -1);
        }
    }
}
