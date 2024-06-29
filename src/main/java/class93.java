import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class93 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1394 = "Loaded sprites";

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field1395 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1390;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class93() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public static final int method730(int arg0, int arg1) {
        field1396++;
        if (arg0 < 64) {
            method730(-36, -39);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method731(int arg0) {
        field1394 = null;
        if (arg0 != 48) {
            field1389 = -35;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lv;I[B)V")
    public final void method732(class152 arg0, int arg1, byte[] arg2) {
        field1392++;
        if (arg0.field2523[arg0.field2511] != 31 || arg0.field2523[arg0.field2511 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1390 == null) {
            this.field1390 = new Inflater(true);
        }
        try {
            this.field1390.setInput(arg0.field2523, arg0.field2511 + 10, arg0.field2523.length - (arg0.field2511 + 8 + 10));
            this.field1390.inflate(arg2);
        } catch (Exception var5) {
            this.field1390.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1390.reset();
        int var4 = -37 / ((arg1 + 51) / 56);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)La;")
    public static final class49 method733(int arg0, byte arg1) {
        field1388++;
        class49 var2 = (class49) class220.field3526.method310(-24190, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class120.field1755.method643(class268.method1861(arg0, 27947), class211.method1536(32740, arg0), false);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method384((byte) 69, new class152(var3));
        }
        class220.field3526.method312((long) arg0, var4, (byte) -33);
        if (arg1 != -47) {
            field1395 = -29;
        }
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method734(boolean arg0, String arg1) {
        field1393++;
        if (class63.field940 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0) {
            method733(-120, (byte) 32);
        }
        for (int var2 = 0; var2 < class63.field940.field1150; var2++) {
            if (class215.method1545(" ", -1, class63.field940.field1153[var2], "<br>").equals(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lvk;IIIIII)Z")
    public static final boolean method735(class36 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class101 var7 = class80.method582(arg0.field460, arg4 ^ 0x53);
        field1391++;
        if (var7.field1491 == -1) {
            return true;
        }
        int var8;
        if (arg0.field500) {
            int var9 = arg0.field521 + arg6;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class4 var10 = var7.method768(var8, (byte) -66, arg0.field494);
        if (var10 == null) {
            return false;
        }
        int var11 = arg0.field487;
        int var12 = arg0.field501;
        if ((var8 & 0x1) == 1) {
            var12 = arg0.field487;
            var11 = arg0.field501;
        }
        int var13 = var10.field1654;
        if (arg4 != 48) {
            method735((class36) null, 92, -37, 98, 77, -112, -116);
        }
        int var14 = var10.field1659;
        if (var7.field1475) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field1480 == 0) {
            var10.method15(arg1 * 4 + 48, (-var12 + 104 - arg3) * 4 + 48, var13, var14);
        } else {
            var10.method18(arg1 * 4 + 48, (-arg3 + 104 + -var12) * 4 + 48, var13, var14, var7.field1480);
        }
        return true;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(III)V")
    private class93(int arg0, int arg1, int arg2) {
    }
}
