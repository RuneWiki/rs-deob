import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class23 extends class14 {

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Z")
    public static boolean field489 = false;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "[Lob;")
    public static class127[] field491 = new class127[256];

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field493 = new CRC32();

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[[B")
    public static byte[][] field498 = new byte[1000][];

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lea;")
    private static class38 field501 = class9.method46((byte) 122, "Please try using a different world)3");

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lea;")
    public static class38 field502 = field501;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "[S")
    public static short[] field497 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Lea;")
    public static class38 field499 = field501;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Lea;")
    public static class38 field495 = field501;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lea;")
    public static class38 field500 = field501;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "[J")
    public static long[] field496 = new long[32];

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "Lea;")
    public static class38 field503 = field501;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lea;")
    public static class38 field504 = field501;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILhc;I)V")
    private final void method134(int arg0, class66 arg1, int arg2) {
        field487++;
        if (arg0 == -24527 && arg2 == 1) {
            this.field490 = arg1.method511(-26);
            this.field492 = arg1.method509(123);
            this.field488 = arg1.method509(125);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lhc;B)V")
    public final void method135(class66 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method509(124);
            if (var3 == 0) {
                field485++;
                if (arg1 >= -28) {
                    this.method134(116, null, 115);
                    return;
                }
                return;
            }
            this.method134(-24527, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BI)Lm;")
    public static final class107 method136(byte[] arg0, int arg1) {
        field494++;
        if (arg1 <= 8) {
            field496 = null;
        }
        if (arg0 == null) {
            return null;
        } else {
            class107 var2 = new class107(arg0, class150.field3101, class148.field3080, class30.field605, class165.field3418, class10.field227, class25.field513);
            class90.method758(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIBLea;)V")
    public static final void method137(int arg0, int arg1, int arg2, byte arg3, class38 arg4) {
        field486++;
        class43 var5 = class193.method1283(arg1, (byte) -26, arg2);
        if (var5 == null || arg3 != 108) {
            return;
        }
        if (var5.field974 != null) {
            class48 var6 = new class48();
            var6.field1164 = arg0;
            var6.field1166 = var5.field974;
            var6.field1153 = var5;
            var6.field1165 = arg4;
            class113.method894(var6, (byte) 118);
        }
        boolean var7 = true;
        if (var5.field987 > 0) {
            var7 = class203.method1330(3, var5);
        }
        if (!var7 || !class94.method790(arg0 - 1, class40.method299(var5, 25), (byte) -126)) {
            return;
        }
        if (arg0 == 1) {
            class111.field2483.method169(-1494101117, 234);
            class108.field2429++;
            class111.field2483.method478((byte) 7, arg1);
            class111.field2483.method496(arg3 + 848881852, arg2);
        }
        if (arg0 == 2) {
            class111.field2483.method169(-1494101117, 87);
            class111.field2483.method478((byte) 9, arg1);
            class22.field474++;
            class111.field2483.method496(848881960, arg2);
        }
        if (arg0 == 3) {
            class146.field3055++;
            class111.field2483.method169(-1494101117, 37);
            class111.field2483.method478((byte) 113, arg1);
            class111.field2483.method496(848881960, arg2);
        }
        if (arg0 == 4) {
            class111.field2483.method169(-1494101117, 3);
            class63.field1534++;
            class111.field2483.method478((byte) 113, arg1);
            class111.field2483.method496(848881960, arg2);
        }
        if (arg0 == 5) {
            class111.field2483.method169(-1494101117, 70);
            class111.field2483.method478((byte) -123, arg1);
            class111.field2483.method496(848881960, arg2);
            class97.field2177++;
        }
        if (arg0 == 6) {
            class34.field704++;
            class111.field2483.method169(-1494101117, 29);
            class111.field2483.method478((byte) 50, arg1);
            class111.field2483.method496(848881960, arg2);
        }
        if (arg0 == 7) {
            class177.field3591++;
            class111.field2483.method169(-1494101117, 192);
            class111.field2483.method478((byte) 100, arg1);
            class111.field2483.method496(848881960, arg2);
        }
        if (arg0 == 8) {
            class111.field2483.method169(arg3 - 1494101225, 154);
            class111.field2483.method478((byte) 104, arg1);
            class134.field2820++;
            class111.field2483.method496(arg3 ^ 0x3298E944, arg2);
        }
        if (arg0 == 9) {
            class48.field1162++;
            class111.field2483.method169(arg3 - 1494101225, 65);
            class111.field2483.method478((byte) 107, arg1);
            class111.field2483.method496(arg3 ^ 0x3298E944, arg2);
        }
        if (arg0 == 10) {
            class141.field2968++;
            class111.field2483.method169(-1494101117, 156);
            class111.field2483.method478((byte) 105, arg1);
            class111.field2483.method496(848881960, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method138(byte arg0) {
        field498 = null;
        field491 = null;
        field504 = null;
        field493 = null;
        if (arg0 <= 73) {
            field504 = null;
        }
        field496 = null;
        field495 = null;
        field501 = null;
        field500 = null;
        field502 = null;
        field499 = null;
        field497 = null;
        field503 = null;
    }
}
