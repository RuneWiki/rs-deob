import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class264 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Z")
    public static boolean field4327 = false;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Z")
    public static boolean field4330 = true;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4333;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method1851(byte arg0, int arg1) {
        class199 var2 = class173.method1231(false, 7, arg1);
        if (arg0 < 78) {
            method1854(76, (class146) null);
        }
        var2.method1358(-1);
        field4331++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BLoe;I)V", line = 24)
    public final void method1852(byte[] arg0, class146 arg1, int arg2) {
        field4328++;
        if (arg1.field2496[arg1.field2435] != arg2 || arg1.field2496[arg1.field2435 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4333 == null) {
            this.field4333 = new Inflater(true);
        }
        try {
            this.field4333.setInput(arg1.field2496, arg1.field2435 + 10, -8 - arg1.field2435 - 10 + arg1.field2496.length);
            this.field4333.inflate(arg0);
        } catch (Exception var5) {
            this.field4333.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4333.reset();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V", line = 48)
    public static final void method1853(int arg0, byte arg1) {
        field4329++;
        class292.field4735.method896(arg0, (byte) -122);
        if (arg1 != 69) {
            field4330 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILoe;)V", line = 59)
    public static final void method1854(int arg0, class146 arg1) {
        field4326++;
        byte[] var2 = new byte[arg0];
        if (class207.field3465 != null) {
            try {
                int var3 = 0;
                class207.field3465.method1802(0L, 31);
                class207.field3465.method1811(200000000, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1037(var2, 0, 103, 24);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 114)
    public static final void method1855(int arg0) {
        int var1 = 0;
        int var2 = -70 % ((-arg0 - 33) / 32);
        while (var1 < 100) {
            class213.field3524[var1] = true;
            var1++;
        }
        field4325++;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 127)
    public class264() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V", line = 136)
    private class264(int arg0, int arg1, int arg2) {
    }
}
