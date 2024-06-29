import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class250 {

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
    public int[] field4306;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[B")
    public byte[] field4305;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[S")
    public short[] field4304;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "[Lhi;")
    public class82[] field4308;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[S")
    public short[] field4317;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Lhi;")
    public static class82 field4307 = class95.method664((byte) -94, "<img=1>");

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[[I")
    public static int[][] field4309 = new int[5][5000];

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lhi;")
    public static class82 field4310 = class95.method664((byte) -79, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[S")
    public static short[] field4314 = new short[] { 20, 33, 31, 19, 15, 50, 44, 60 };

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lsc;")
    public static class145 field4311;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1795(int arg0) {
        field4316++;
        if (arg0 != 5) {
            method1796(-12);
        }
        int var1 = class253.field4354.method124(class287.field4831);
        for (int var2 = 0; var2 < class309.field5262; var2++) {
            int var3 = class253.field4354.method124(class207.method1484(var2, (byte) -105));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class309.field5262 * 15 + 21;
        int var5 = class27.field360;
        int var6 = class45.field775 - var1 / 2;
        if ((var1 + var6) > class260.field4462) {
            var6 = class260.field4462 - var1;
        }
        if ((var5 + var4) > class180.field3078) {
            var5 = class180.field3078 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class238.field4147 == 1) {
            if (class45.field775 == class222.field3838 && class27.field360 == class231.field3980) {
                class88.field1563 = var1;
                class33.field495 = var6;
                class28.field367 = var5;
                class164.field2874 = class309.field5262 * 15 + 22;
                class187.field3153 = true;
                class238.field4147 = 0;
            }
        } else if (class45.field775 == class166.field2904 && class27.field360 == class255.field4394) {
            class33.field495 = var6;
            class187.field3153 = true;
            class238.field4147 = 0;
            class164.field2874 = class309.field5262 * 15 + 22;
            class88.field1563 = var1;
            class28.field367 = var5;
        } else {
            class231.field3980 = class255.field4394;
            class222.field3838 = class166.field2904;
            class238.field4147 = 1;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 109)
    public static void method1796(int arg0) {
        field4314 = null;
        field4307 = null;
        if (arg0 != 0) {
            field4311 = (class145) null;
        }
        field4310 = null;
        field4309 = (int[][]) null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)Z", line = 136)
    public final boolean method1797(int arg0, byte arg1) {
        if (arg1 < 67) {
            this.field4304 = (short[]) null;
        }
        field4313++;
        return (this.field4305[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)I", line = 147)
    public final int method1798(int arg0, int arg1) {
        field4315++;
        return arg1 == 33 ? this.field4305[arg0] & 0x3 : 47;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(I)V", line = 165)
    public class250(int arg0) {
        this.field4312 = arg0;
        this.field4306 = new int[this.field4312];
        this.field4305 = new byte[this.field4312];
        this.field4304 = new short[this.field4312];
        this.field4308 = new class82[this.field4312];
        this.field4317 = new short[this.field4312];
    }
}
