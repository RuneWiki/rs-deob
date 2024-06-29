import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class9 {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lt;")
    public static class36 field90 = class3.method8(13631, "Skirt Shop");

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Lt;")
    public static class36 field92 = class3.method8(13631, "Chainmail Shop");

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Lt;")
    public static class36 field96 = class3.method8(13631, "Silver Shop");

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Lt;")
    public static class36 field98 = class3.method8(13631, "Potters Wheel");

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Lt;")
    public static class36 field97 = class3.method8(13631, "Herbalist");

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Lt;")
    public static class36 field99 = class3.method8(13631, "Legende");

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Lt;")
    public static class36 field100 = class3.method8(13631, "Grand Exchange");

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lt;")
    public static class36 field101 = class3.method8(13631, "Hunter Store");

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Z")
    public static boolean field93;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "[B")
    public static byte[] field95;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "[[Lw;")
    public static class41[][] field94;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ZLjava/lang/Object;B)[B", line = 5)
    public static final byte[] method36(boolean arg0, Object arg1, byte arg2) {
        if (arg2 < 74) {
            method40(-78L, (byte) 70);
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class39.method243(var3, (byte) 98) : var3;
        } else if (arg1 instanceof class14) {
            class14 var4 = (class14) arg1;
            return var4.method80(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)J", line = 53)
    public static final synchronized long method37(byte arg0) {
        if (arg0 >= -45) {
            method40(10L, (byte) -98);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class28.field418) {
            class3.field24 += class28.field418 - var1;
        }
        class28.field418 = var1;
        return class3.field24 + var1;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B[Lt;)V", line = 81)
    public static final void method38(byte arg0, class36[] arg1) {
        class7.method28(-19390, arg1.length, arg1, 0);
        if (arg0 != 111) {
            field94 = null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Z)I", line = 120)
    public static final int method39(boolean arg0) {
        if (arg0) {
            method36(true, null, (byte) -88);
        }
        if (class8.field89 == null) {
            return 0;
        } else if (class8.field89.field537 == null) {
            return class7.field75[class8.field89.field536 & 0xFF];
        } else {
            return class7.field75[class8.field89.field537[class6.field65] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(JB)V", line = 139)
    public static final void method40(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 <= 89) {
                method41(-17);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 158)
    public static void method41(int arg0) {
        field98 = null;
        field91 = null;
        field99 = null;
        field97 = null;
        field96 = null;
        int var1 = -54 % ((arg0 + 16) / 53);
        field100 = null;
        field92 = null;
        field90 = null;
        field95 = null;
        field101 = null;
        field94 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BI[BI)Lt;", line = 202)
    public static final class36 method42(byte arg0, int arg1, byte[] arg2, int arg3) {
        class36 var4 = new class36();
        var4.field491 = new byte[arg1];
        var4.field492 = 0;
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field491[var4.field492++] = arg2[var5];
            }
        }
        if (arg0 != 124) {
            method40(78L, (byte) -75);
        }
        return var4;
    }
}
