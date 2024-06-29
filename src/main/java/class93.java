import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class93 extends class588 {

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Llg;")
    public static class32 field1233 = new class32();

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lrh;")
    public static class44 field1237 = new class44(1);

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Luv;")
    public static class3 field1240 = new class3(81, 8);

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Ldc;")
    public class23 field1231;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field1238;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIB)I")
    public static final int method508(int arg0, int arg1, byte arg2) {
        field1230++;
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        if (arg2 != -44) {
            method510(-44, -127, (byte) 125);
        }
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(JJ)J")
    public static long method509(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIB)V")
    public static final void method510(int arg0, int arg1, byte arg2) {
        field1229++;
        class266 var3 = class257.field3197[arg0][arg1];
        if (var3 != null) {
            class483.field6754 = var3.field3408;
            class190.field2456 = var3.field3399;
            class29.field468 = var3.field3401;
        }
        class3.method8(-13544);
        if (arg2 >= -14) {
            method508(51, 32, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I")
    public static final int method511(byte arg0, int arg1) {
        field1234++;
        int var2 = -99 % ((49 - arg0) / 42);
        int var3 = arg1 & 0x3F;
        int var4 = arg1 >> 6 & 0x3;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1233 = null;
        field1237 = null;
        field1238 = null;
        if (arg0 != -1579) {
            method510(-45, -43, (byte) 34);
        }
        field1240 = null;
    }
}
