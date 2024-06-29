import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class87 {

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "Lde;")
    private class534 field1214 = new class534(64);

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "Lnd;")
    private class547 field1209;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Z")
    public static boolean field1208 = false;

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "[J")
    public static long[] field1215 = new long[10];

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "Lnd;")
    public static class547 field1210;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)Lcea;", line = 4)
    public static final class216 method716(byte arg0) {
        int var1 = -30 / ((arg0 + 64) / 36);
        field1211++;
        return class126.field1799;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)V", line = 15)
    public final void method717(byte arg0) {
        field1213++;
        class534 var2 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method3064(false);
        }
        if (arg0 != -91) {
            field1205 = 22;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V", line = 28)
    public final void method718(int arg0, int arg1) {
        field1206++;
        class534 var3 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method3070(arg1, 120);
        }
        if (arg0 != 29197) {
            this.field1207 = 81;
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(B)V", line = 46)
    public static void method719(byte arg0) {
        if (arg0 > -45) {
            method716((byte) 72);
        }
        field1210 = null;
        field1215 = null;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(II)Ljp;", line = 61)
    public final class358 method720(int arg0, int arg1) {
        field1204++;
        class534 var3 = this.field1214;
        class358 var4;
        synchronized (this.field1214) {
            var4 = (class358) this.field1214.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field1209;
        byte[] var6;
        synchronized (this.field1209) {
            var6 = this.field1209.method3153(arg0, arg1 ^ arg1, 16);
        }
        class358 var7 = new class358();
        if (var6 != null) {
            var7.method2075((byte) 117, new class461(var6));
        }
        class534 var8 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method3077((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V", line = 90)
    public final void method721(boolean arg0) {
        field1212++;
        class534 var2 = this.field1214;
        synchronized (this.field1214) {
            if (arg0) {
                field1208 = true;
            }
            this.field1214.method3065(true);
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 113)
    public class87(class102 arg0, int arg1, class547 arg2) {
        this.field1209 = arg2;
        if (this.field1209 == null) {
            this.field1207 = 0;
        } else {
            this.field1207 = this.field1209.method3178((byte) 97, 16);
        }
    }
}
