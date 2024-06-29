import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class185 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[B")
    private byte[] field3635 = new byte[4];

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lpe;")
    private class141 field3646;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "J")
    private long field3650;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Led;")
    public static class43 field3639 = class191.method1219("leuchten2:", false);

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[Led;")
    public static class43[] field3640 = new class43[100];

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Led;")
    public static class43 field3648 = class191.method1219("headicons_hint", false);

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Led;")
    public static class43 field3652 = class191.method1219(")3runescape)3com", false);

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3649 = 0;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3654 = 0;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Ltd;")
    public static class176 field3645 = new class176(64);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    private int field3641;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lub;")
    public static class183 field3638;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3651;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[B")
    private byte[] field3642;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1188(int arg0) {
        field3639 = null;
        field3648 = null;
        if (arg0 != 23269) {
            field3649 = 9;
        }
        field3640 = null;
        field3638 = null;
        field3652 = null;
        field3645 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)[B")
    public final byte[] method1189(boolean arg0) throws IOException {
        field3644++;
        if (this.field3650 < class52.method315((byte) -128)) {
            throw new IOException("fdt");
        }
        if (this.field3637 == 0) {
            if (this.field3646.field2927 == 2) {
                throw new IOException("fds");
            }
            if (this.field3646.field2927 == 1) {
                this.field3651 = (DataInputStream) this.field3646.field2930;
                this.field3637 = 1;
            }
        }
        if (arg0) {
            this.field3637 = -105;
        }
        if (this.field3637 == 1) {
            int var2 = this.field3651.available();
            if (var2 > 0) {
                if (this.field3641 + var2 > 4) {
                    var2 = 4 - this.field3641;
                }
                this.field3641 += this.field3651.read(this.field3635, this.field3641, var2);
                if (this.field3641 == 4) {
                    int var3 = (new class89(this.field3635)).method545(-7436);
                    this.field3637 = 2;
                    this.field3642 = new byte[var3];
                }
            }
        }
        if (this.field3637 == 2) {
            int var4 = this.field3651.available();
            if (var4 > 0) {
                if (this.field3643 + var4 > this.field3642.length) {
                    var4 = this.field3642.length - this.field3643;
                }
                this.field3643 += this.field3651.read(this.field3642, this.field3643, var4);
                if (this.field3642.length == this.field3643) {
                    return this.field3642;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        if (arg0 < 96) {
            method1190(-59);
        }
        while (class38.field723.method326(8, class114.field2215) >= 11) {
            int var1 = class38.field723.method330((byte) 75, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class12.field183[var1] == null) {
                var2 = true;
                class12.field183[var1] = new class1();
                if (class39.field744[var1] != null) {
                    class12.field183[var1].method5(class39.field744[var1], (byte) -122);
                }
            }
            class125.field2472[class170.field3399++] = var1;
            class1 var3 = class12.field183[var1];
            var3.field2343 = client.field559;
            int var4 = class38.field723.method330((byte) 67, 5);
            int var5 = class38.field723.method330((byte) 77, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class38.field723.method330((byte) 84, 1);
            if (var6 == 1) {
                class67.field1347[class115.field2241++] = var1;
            }
            int var7 = class64.field1314[class38.field723.method330((byte) 92, 3)];
            if (var2) {
                var3.field2372 = var3.field2352 = var7;
            }
            int var8 = class38.field723.method330((byte) 104, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method758((byte) 94, class67.field1348.field2357[0] + var4, class67.field1348.field2335[0] + var8, var5 == 1);
        }
        field3636++;
        class38.field723.method337(-116);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lrf;Ljava/net/URL;)V")
    public class185(class160 arg0, URL arg1) {
        this.field3646 = arg0.method1012(arg1, 0);
        this.field3637 = 0;
        this.field3650 = class52.method315((byte) -16) + 30000L;
    }
}
