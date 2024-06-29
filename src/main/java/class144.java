import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class144 {

    @OriginalMember(owner = "client!un", name = "g", descriptor = "J")
    public long field2237;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lrs;")
    private class166 field2233;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2236++;
        this.field2233.method1247(this.field2237, true);
        super.finalize();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILvga;B)V")
    public static final void method1111(int arg0, class82 arg1, byte arg2) {
        field2231++;
        if (class115.field1790 >= 50 || arg1 == null || arg1.field1192 == null || arg1.field1192.length <= arg0 || arg1.field1192[arg0] == null) {
            return;
        }
        int var3 = arg1.field1192[arg0][0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg1.field1192[arg0].length > 1) {
            int var6 = (int) ((double) arg1.field1192[arg0].length * Math.random());
            if (var6 > 0) {
                var4 = arg1.field1192[arg0][var6];
            }
        }
        if (arg2 != 117) {
            return;
        }
        int var7 = 256;
        if (arg1.field1187 != null && arg1.field1202 != null) {
            var7 = class131.method1061(arg1.field1187[arg0], 2, arg1.field1202[arg0]);
        }
        if (arg1.field1193) {
            class522.method3110(0, var7, 50, 255, var4, var5, false);
        } else {
            class146.method1122(255, 0, var4, var7, (byte) -113, var5);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method1112(int arg0, String arg1, int arg2) {
        field2234++;
        return arg2 > -21 ? -73 : class440.method2705(82, arg1, arg0, true);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lrs;J[Lwaa;)V")
    public class144(class166 arg0, long arg1, class621[] arg2) {
        this.field2237 = arg1;
        this.field2233 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILofa;)V")
    public static final void method1113(int arg0, class301 arg1) {
        field2232++;
        int var2 = arg1.method1968((byte) 51);
        class77.field1134 = new class754[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class77.field1134[var3] = new class754();
            class77.field1134[var3].field10517 = arg1.method1968((byte) 88);
            class77.field1134[var3].field10519 = arg1.method1944(-99);
        }
        class27.field275 = arg1.method1968((byte) 117);
        class404.field5993 = arg1.method1968((byte) 75);
        class7.field68 = arg1.method1968((byte) 77);
        class155.field2403 = new class225[class404.field5993 + 1 - class27.field275];
        for (int var4 = 0; var4 < class7.field68; var4++) {
            int var5 = arg1.method1968((byte) 28);
            class225 var6 = class155.field2403[var5] = new class225();
            var6.field4707 = arg1.method1987(arg0 ^ 0xFFFFFFA6);
            var6.field4700 = arg1.method1934(-2);
            var6.field3623 = var5 + class27.field275;
            var6.field3621 = arg1.method1944(-60);
            var6.field3622 = arg1.method1944(-41);
        }
        if (arg0 != 50) {
            field2235 = 4;
        }
        class693.field9829 = arg1.method1934(-2);
        class443.field6439 = true;
    }
}
