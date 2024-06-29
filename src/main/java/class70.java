import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public boolean field979 = false;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    private int field981 = 0;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field982 = 128;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field985 = -1;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    private int field988 = 0;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    private int field989 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    private int field991 = 128;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lug;")
    public static class199 field994;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[S")
    private short[] field980;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    private short[] field986;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[S")
    private short[] field987;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[S")
    private short[] field996;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBII)Lua;")
    public final class114 method473(int arg0, byte arg1, int arg2, int arg3) {
        class114 var5 = (class114) class111.field1682.method1428((long) this.field995, (byte) -81);
        field978++;
        if (var5 == null) {
            class160 var6 = class160.method1079(class152.field2262, this.field993, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field996 != null) {
                for (int var7 = 0; var7 < this.field996.length; var7++) {
                    var6.method1090(this.field996[var7], this.field980[var7]);
                }
            }
            if (this.field987 != null) {
                for (int var8 = 0; var8 < this.field987.length; var8++) {
                    var6.method1088(this.field987[var8], this.field986[var8]);
                }
            }
            var5 = var6.method1076(this.field989 + 64, 850 - -this.field981, -30, -50, -30);
            class111.field1682.method1424((long) this.field995, var5, -2003648287);
        }
        int var9 = 81 / ((6 - arg1) / 62);
        class114 var10;
        if (this.field985 == -1 || arg0 == -1) {
            var10 = var5.method743(true, true, true);
        } else {
            var10 = class104.method688(this.field985, 30091).method1361(arg0, arg3, 21688, var5, arg2);
        }
        if (this.field991 != 128 || this.field982 != 128) {
            var10.method747(this.field991, this.field982, this.field991);
        }
        if (this.field988 != 0) {
            if (this.field988 == 90) {
                var10.method752();
            }
            if (this.field988 == 180) {
                var10.method746();
            }
            if (this.field988 == 270) {
                var10.method751();
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 != 11465) {
            method474(66);
        }
        field994 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILlj;B)V")
    private final void method475(int arg0, class25 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field993 = arg1.method190(-3);
        } else if (arg0 == 2) {
            this.field985 = arg1.method190(-3);
        } else if (arg0 == 4) {
            this.field991 = arg1.method190(-3);
        } else if (arg0 == 5) {
            this.field982 = arg1.method190(-3);
        } else if (arg0 == 6) {
            this.field988 = arg1.method190(-3);
        } else if (arg0 == 7) {
            this.field989 = arg1.method201(255);
        } else if (arg0 == 8) {
            this.field981 = arg1.method201(255);
        } else if (arg0 == 9) {
            this.field979 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method201(255);
            this.field980 = new short[var4];
            this.field996 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field996[var5] = (short) arg1.method190(-3);
                this.field980[var5] = (short) arg1.method190(-3);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method201(255);
            this.field987 = new short[var6];
            this.field986 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field987[var7] = (short) arg1.method190(-3);
                this.field986[var7] = (short) arg1.method190(-3);
            }
        }
        field983++;
        int var8 = -72 / ((-arg2 - 34) / 43);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
    public static final int method476(boolean arg0) {
        if (!arg0) {
            return 48;
        }
        field990++;
        if (class128.field1885) {
            return 0;
        } else if (class26.method227(10920)) {
            return class199.field3114 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llj;I)V")
    public final void method477(class25 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                field992++;
                if (arg1 <= 21) {
                    field984 = 73;
                    return;
                }
                return;
            }
            this.method475(var3, arg0, (byte) 27);
        }
    }
}
