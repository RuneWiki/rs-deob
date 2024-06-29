import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class409 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "J")
    public static long field5992 = -1L;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Liu;")
    public static class390 field5998 = new class390(99, 2);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[C")
    public static char[] field6005 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[[I")
    public static int[][] field6004 = new int[128][128];

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lwt;")
    public static class194 field5999 = new class194("K", "T", "K", "K");

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Z")
    public static boolean field6006 = false;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[B")
    public byte[] field5995;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[S")
    public short[] field5990;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[S")
    public short[] field5991;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[S")
    public short[] field5993;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[S)[S", line = 4)
    public static final short[] method2443(int arg0, int arg1, short[] arg2) {
        if (arg0 == 376) {
            field6000++;
            short[] var3 = new short[arg1];
            class268.method1639(arg2, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2444(int arg0) {
        class28.field488.method38((byte) -5);
        if (arg0 == 0) {
            field5996++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 29)
    public static void method2445(boolean arg0) {
        field6005 = null;
        if (!arg0) {
            method2445(false);
        }
        field5998 = null;
        field5999 = null;
        field6004 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BII)[B", line = 43)
    public static final byte[] method2446(int arg0, byte[] arg1, int arg2, int arg3) {
        field5997++;
        byte[] var4 = new byte[arg0];
        class268.method1638(arg1, arg2, var4, arg3, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBII)V", line = 60)
    public static final void method2447(int arg0, byte arg1, int arg2, int arg3) {
        field5994++;
        if (arg1 != 68) {
            field5999 = null;
        }
        if (class358.field5312 == null) {
            return;
        }
        long var4 = (long) (arg0 | arg3 << 28 | arg2 << 14);
        class414 var6 = (class414) class473.field6838.method2310((byte) -102, var4);
        if (var6 == null) {
            class227.method1397(arg3, arg0, arg2);
            return;
        }
        class231 var7 = (class231) var6.field6139.method2096(-21400);
        if (var7 == null) {
            class227.method1397(arg3, arg0, arg2);
            return;
        }
        class276 var8 = (class276) class227.method1397(arg3, arg0, arg2);
        if (var8 == null) {
            var8 = new class276();
        } else {
            var8.field3948 = var8.field3940 = -1;
        }
        var8.field3944 = var7.field3228;
        var8.field3947 = var7.field3226;
        label48: while (true) {
            class231 var9 = (class231) var6.field6139.method2084((byte) 19);
            if (var9 == null) {
                break;
            }
            if (var8.field3947 != var9.field3226) {
                var8.field3950 = var9.field3228;
                var8.field3948 = var9.field3226;
                while (true) {
                    class231 var10 = (class231) var6.field6139.method2084((byte) 19);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field3947 != var10.field3226 && var8.field3948 != var10.field3226) {
                        var8.field3945 = var10.field3228;
                        var8.field3940 = var10.field3226;
                    }
                }
            }
        }
        int var11 = class103.method620(arg3, (arg2 << 7) + 64, (byte) 20, (arg0 << 7) + 64);
        class231.method1407(arg3, arg0, arg2, var11, var8);
    }
}
