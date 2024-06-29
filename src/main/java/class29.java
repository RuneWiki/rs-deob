import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 extends class25 {

    @OriginalMember(owner = "mapview!oa", name = "q", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "mapview!oa", name = "m", descriptor = "[B")
    public byte[] field388;

    @OriginalMember(owner = "mapview!oa", name = "o", descriptor = "Ls;")
    public static class34 field390 = class9.method35(" ", 220);

    @OriginalMember(owner = "mapview!oa", name = "p", descriptor = "Ls;")
    public static class34 field391 = class9.method35("Food Shop", 220);

    @OriginalMember(owner = "mapview!oa", name = "s", descriptor = "I")
    public static int field394 = 1;

    @OriginalMember(owner = "mapview!oa", name = "t", descriptor = "Ls;")
    public static class34 field395 = class9.method35("Mining Site", 220);

    @OriginalMember(owner = "mapview!oa", name = "v", descriptor = "Ls;")
    public static class34 field397 = class9.method35("Archery Shop", 220);

    @OriginalMember(owner = "mapview!oa", name = "w", descriptor = "I")
    public static int field398 = 50;

    @OriginalMember(owner = "mapview!oa", name = "u", descriptor = "Ls;")
    public static class34 field396 = class9.method35("Brewery", 220);

    @OriginalMember(owner = "mapview!oa", name = "r", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "mapview!oa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field389;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(I)V", line = 6)
    public static void method190(int arg0) {
        field395 = null;
        if (arg0 != -515844944) {
            method190(-115);
        }
        field391 = null;
        field396 = null;
        field390 = null;
        field397 = null;
        field389 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(I)Ls;", line = 37)
    public final class34 method191(int arg0) {
        if (arg0 > -37) {
            this.method192((byte) -80);
        }
        int var2 = this.field392;
        while (this.field388[this.field392++] != 0) {
        }
        return class13.method55(this.field392 - var2 - 1, var2, this.field388, false);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)I", line = 56)
    public final int method192(byte arg0) {
        int var2 = -105 / ((23 - arg0) / 39);
        this.field392 += 2;
        return ((this.field388[this.field392 - 2] & 0xFF) << 8) + (this.field388[this.field392 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IZ)V", line = 65)
    public final void method193(int arg0, boolean arg1) {
        if (arg1) {
            this.field388[this.field392++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(B)B", line = 78)
    public final byte method194(byte arg0) {
        if (arg0 != 65) {
            method196((byte) 20);
        }
        return this.field388[this.field392++];
    }

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "(I)I", line = 123)
    public final int method195(int arg0) {
        this.field392 += 4;
        if (arg0 > -69) {
            this.field388 = null;
        }
        return ((this.field388[this.field392 - 4] & 0xFF) << 24) + ((this.field388[this.field392 - 3] & 0xFF) << 16) + ((this.field388[this.field392 + -2] & 0xFF) << 8) + (this.field388[this.field392 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(B)V", line = 143)
    public static final void method196(byte arg0) {
        class35 var1 = class6.field39;
        synchronized (class6.field39) {
            class8.field78 = class30.field399;
            if (class3.field26 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class37.field505[var2] = false;
                }
                class3.field26 = class34.field467;
            } else {
                while (class34.field467 != class3.field26) {
                    int var3 = class7.field53[class34.field467];
                    class34.field467 = class34.field467 + 1 & 0x7F;
                    if (var3 < 0) {
                        class37.field505[~var3] = false;
                    } else {
                        class37.field505[var3] = true;
                    }
                }
            }
            if (arg0 != 15) {
                field398 = 114;
            }
            class30.field399 = class19.field164;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "(I)I", line = 221)
    public final int method197(int arg0) {
        return arg0 == 3 ? this.field388[this.field392++] & 0xFF : -45;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(BI[BI)V", line = 234)
    public final void method198(byte arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            arg2[var5] = this.field388[this.field392++];
        }
        if (arg0 != 81) {
            this.field392 = 123;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IB)V", line = 259)
    public final void method199(int arg0, byte arg1) {
        this.field388[this.field392++] = (byte) (arg0 >> 24);
        this.field388[this.field392++] = (byte) (arg0 >> 16);
        if (arg1 < 91) {
            this.method195(-92);
        }
        this.field388[this.field392++] = (byte) (arg0 >> 8);
        this.field388[this.field392++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(I)V", line = 277)
    public class29(int arg0) {
        this.field392 = 0;
        this.field388 = class27.method186(7589, arg0);
    }

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "(I)I", line = 306)
    public final int method200(int arg0) {
        this.field392 += 3;
        if (arg0 > -42) {
            this.method200(-4);
        }
        return ((this.field388[this.field392 - 3] & 0xFF) << 16) + (this.field388[this.field392 - 2] << 8 & 0xFF00) + (this.field388[this.field392 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "([B)V", line = 319)
    public class29(byte[] arg0) {
        this.field388 = arg0;
        this.field392 = 0;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I[III)V", line = 330)
    public final void method201(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = this.field392;
        this.field392 = arg0;
        int var6 = (arg2 - arg0) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method195(-115);
            int var9 = this.method195(-109);
            int var10 = -1640531527;
            int var11 = 32;
            int var12 = -957401312;
            while (var11-- > 0) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg1[var12 >>> 11 & 0x3] + var12;
                var12 -= var10;
                var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg1[var12 & 0x3] + var12;
            }
            this.field392 -= 8;
            this.method199(var8, (byte) 125);
            this.method199(var9, (byte) 106);
        }
        this.field392 = var5;
        if (arg3 != 16322) {
            this.method195(35);
        }
    }
}
