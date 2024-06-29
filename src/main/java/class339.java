import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class339 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[S")
    public static short[] field5212 = new short[256];

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
    public static int[] field5218 = new int[1000];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5211 = 0;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[I")
    public static int[] field5216 = new int[3];

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5213 = 1;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Z")
    public static boolean field5220 = false;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field5215;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field5221;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lrg;I)V", line = 5)
    public static final void method2380(class342 arg0, int arg1) {
        field5210++;
        if (class327.field5031 == arg0.field5306) {
            class227.field3540[arg0.field5271] = true;
        }
        if (arg1 <= 101) {
            method2380((class342) null, 39);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method2381(int arg0) {
        if (arg0 == 15253) {
            field5214++;
            return (this.field5215 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I", line = 51)
    public static final int method2382(int arg0, int arg1) {
        if (arg1 != 4) {
            field5212 = (short[]) null;
        }
        field5217++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 62)
    public static final void method2383(int arg0) {
        field5224++;
        for (int var1 = -1; var1 < class66.field995; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class345.field5495[var1];
            }
            class171 var3 = class177.field2795[var2];
            if (var3 != null && var3.field1382 > 0) {
                var3.field1382--;
                if (var3.field1382 == 0) {
                    var3.field1314 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class6.field80; var4++) {
            int var5 = class126.field2114[var4];
            class244 var6 = class110.field1683[var5];
            if (var6 != null && var6.field1382 > 0) {
                var6.field1382--;
                if (var6.field1382 == 0) {
                    var6.field1314 = null;
                }
            }
        }
        if (arg0 != -24717) {
            method2383(-79);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 118)
    public static void method2384(byte arg0) {
        field5216 = null;
        field5218 = null;
        field5212 = null;
        if (arg0 <= 19) {
            method2382(-68, 58);
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)Z", line = 132)
    public final boolean method2385(int arg0) {
        field5223++;
        if (arg0 != -1) {
            this.field5221 = -125;
        }
        return (this.field5215 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Z", line = 149)
    public final boolean method2386(byte arg0) {
        if (arg0 >= -46) {
            field5212 = (short[]) null;
        }
        field5225++;
        return (this.field5215 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)Z", line = 172)
    public final boolean method2387(int arg0) {
        if (arg0 != 0) {
            field5220 = true;
        }
        field5219++;
        return (this.field5215 & 0x8) != 0;
    }
}
