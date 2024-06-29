import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class101 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1631 = 128;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1633 = 0;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field1632 = -1;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1630;

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 3)
    public class101() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpi;Z[B)V", line = 20)
    public final void method872(class336 arg0, boolean arg1, byte[] arg2) {
        field1634++;
        if (arg0.field5342[arg0.field5353] != 31 || arg0.field5342[arg0.field5353 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1630 == null) {
            this.field1630 = new Inflater(true);
        }
        try {
            this.field1630.setInput(arg0.field5342, arg0.field5353 + 10, arg0.field5342.length + -10 + -arg0.field5353 + -8);
            this.field1630.inflate(arg2);
        } catch (Exception var5) {
            this.field1630.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1630.reset();
        if (arg1) {
            field1628 = 86;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwe;I)V", line = 55)
    public static final void method873(class59 arg0, int arg1) {
        field1637++;
        class32.field462 = 3;
        class48.method426(true, (byte) 86);
        class249.field4036 = true;
        class291.field4666 = true;
        class310.field4913 = 0;
        class29.field393 = 127;
        class48.field735 = true;
        class57.field875 = true;
        class195.field3276 = true;
        class79.field1280 = 127;
        class137.field2549 = 2;
        class95.field1487 = true;
        class64.field1001 = true;
        class30.field440 = 0;
        class318.field5056 = 0;
        class328.field5216 = true;
        class51.field796 = 255;
        class227.field3822 = 0;
        class181.field3043 = true;
        class23 var2 = null;
        if (arg1 >= -114) {
            method873((class59) null, 61);
        }
        class129.field2225 = true;
        class285.field4521 = true;
        if (class28.field385 < 96) {
            class65.method617(0);
        } else {
            class65.method617(2);
        }
        class38.field572 = false;
        class69.field1133 = 0;
        class330.field5250 = true;
        class221.field3696 = 0;
        class222.field3705 = false;
        class246.field3990 = false;
        class255.field4104 = 0;
        try {
            class45 var3 = arg0.method535("runescape", (byte) -120);
            while (var3.field709 == 0) {
                class142.method1149(1L, (byte) 126);
            }
            if (var3.field709 == 1) {
                var2 = (class23) var3.field712;
                byte[] var4 = new byte[(int) var2.method226(22639)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method225(-1, var5, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class35.method314((byte) 127, new class336(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method229(126);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 143)
    public static final void method874(int arg0) {
        field1629++;
        class69.field1128.method942(18729);
        class44.field705 = 1;
        class249.field4044 = null;
        if (arg0 != -1) {
            field1632 = 99;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III)V", line = 161)
    private class101(int arg0, int arg1, int arg2) {
    }
}
