import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class189 {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[B")
    private byte[] field3586 = new byte[4];

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Ltd;")
    private class183 field3594;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "J")
    private long field3587;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3582 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljd;")
    private static class92 field3581 = class202.method1325((byte) 90, "Click to switch");

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljd;")
    public static class92 field3583 = field3581;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lbg;")
    public static class18 field3595 = new class18();

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljd;")
    public static class92 field3596 = class202.method1325((byte) 90, "Schlie-8en");

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Ljd;")
    private static class92 field3601 = class202.method1325((byte) 90, "Please use a different world)3");

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljd;")
    public static class92 field3597 = field3601;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Z")
    public static boolean field3603 = false;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Ljd;")
    public static class92 field3602 = field3601;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[Ljd;")
    public static class92[] field3604 = new class92[500];

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Ljd;")
    private static class92 field3605 = class202.method1325((byte) 90, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Ljd;")
    public static class92 field3599 = field3605;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3579;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[B")
    private byte[] field3600;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[[[B")
    public static byte[][][] field3598;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method1214(int arg0, KeyEvent arg1) {
        field3590++;
        if (arg0 != 11933) {
            method1215(-117);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1215(int arg0) {
        field3605 = null;
        field3595 = null;
        field3604 = null;
        field3596 = null;
        field3583 = null;
        field3601 = null;
        field3597 = null;
        if (arg0 != 10) {
            method1215(-21);
        }
        field3602 = null;
        field3599 = null;
        field3581 = null;
        field3598 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Leg;")
    public static final class48 method1216(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        return var3 == null ? null : var3.field963;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lnh;B)V")
    public static final void method1217(class133 arg0, byte arg1) {
        class44.field991 = arg0;
        field3585++;
        if (arg1 != 79) {
            method1214(-94, null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Ljd;")
    public static final class92 method1218(long arg0, int arg1) {
        field3588++;
        class157.field3134.setTime(new Date(arg0));
        int var3 = class157.field3134.get(7);
        int var4 = class157.field3134.get(5);
        if (arg1 >= -64) {
            return null;
        }
        int var5 = class157.field3134.get(2);
        int var6 = class157.field3134.get(1);
        int var7 = class157.field3134.get(11);
        int var8 = class157.field3134.get(12);
        int var9 = class157.field3134.get(13);
        return class77.method529(-3, new class92[] { client.field693[var3 - 1], class42.field935, class142.method938(var4 / 10, false), class142.method938(var4 % 10, false), class131.field2622, class88.field1728[var5], class131.field2622, class142.method938(var6, false), class60.field1253, class142.method938(var7 / 10, false), class142.method938(var7 % 10, false), class36.field830, class142.method938(var8 / 10, false), class142.method938(var8 % 10, false), class36.field830, class142.method938(var9 / 10, false), class142.method938(var9 % 10, false), class210.field4074 });
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)[B")
    public final byte[] method1219(int arg0) throws IOException {
        field3591++;
        if (this.field3587 < class168.method1118(1)) {
            throw new IOException("fdt");
        }
        if (this.field3589 == 0) {
            if (this.field3594.field3476 == 2) {
                throw new IOException("fds");
            }
            if (this.field3594.field3476 == 1) {
                this.field3589 = 1;
                this.field3579 = (DataInputStream) this.field3594.field3474;
            }
        }
        if (this.field3589 == 1) {
            int var2 = this.field3579.available();
            if (var2 > 0) {
                if (this.field3580 + var2 > 4) {
                    var2 = 4 - this.field3580;
                }
                this.field3580 += this.field3579.read(this.field3586, this.field3580, var2);
                if (this.field3580 == 4) {
                    int var3 = (new class70(this.field3586)).method453(116);
                    this.field3600 = new byte[var3];
                    this.field3589 = 2;
                }
            }
        }
        if (this.field3589 == 2) {
            int var4 = this.field3579.available();
            if (var4 > 0) {
                if (this.field3600.length < var4 + this.field3592) {
                    var4 = this.field3600.length - this.field3592;
                }
                this.field3592 += this.field3579.read(this.field3600, this.field3592, var4);
                if (this.field3600.length == this.field3592) {
                    return this.field3600;
                }
            }
        }
        return arg0 == 4 ? null : null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Ljd;")
    public static final class92 method1220(int arg0, int arg1) {
        field3593++;
        class92 var2 = new class92();
        var2.field1856 = new byte[arg0];
        var2.field1838 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lrh;Ljava/net/URL;)V")
    public class189(class169 arg0, URL arg1) {
        this.field3594 = arg0.method1119(2, arg1);
        this.field3589 = 0;
        this.field3587 = class168.method1118(1) + 30000L;
    }
}
