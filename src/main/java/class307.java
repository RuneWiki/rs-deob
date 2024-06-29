import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class307 extends class63 {

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "Lmh;")
    public static class128 field5220 = class22.method156(127, "blinken1:");

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public static int field5219 = 0;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "Lmh;")
    public static class128 field5223 = class22.method156(127, ")2");

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "Lmh;")
    public static class128 field5225 = class22.method156(127, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "[I")
    public static int[] field5221;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method2096(int arg0, byte arg1) {
        field5222++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class158.method1039((byte) -38);
        } else if (arg0 == 2) {
            class72.method476(-91);
        } else {
            throw new RuntimeException();
        }
        if (arg1 != 43) {
            field5220 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIB)V", line = 30)
    public static final void method2097(int arg0, int arg1, byte arg2) {
        int var3 = 10 / ((arg2 - 73) / 42);
        class229 var4 = class241.method1638(13, 126, arg1);
        var4.method1574(3199);
        field5226++;
        var4.field3981 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V", line = 56)
    public static void method2098(byte arg0) {
        field5223 = null;
        field5220 = null;
        field5225 = null;
        field5221 = null;
        if (arg0 != -128) {
            method2098((byte) -96);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I", line = 88)
    public final int[][] method62(int arg0, int arg1) {
        field5224++;
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883 && this.method421(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % this.field1202 * this.field1202;
            for (int var8 = 0; var8 < class185.field3225; var8++) {
                int var9 = this.field1193[var8 % this.field1198 + var7];
                var5[var8] = class238.method1622(var9 << 4, 4080);
                var6[var8] = class238.method1622(65280, var9) >> 4;
                var4[var8] = class238.method1622(16711680, var9) >> 12;
            }
        }
        int var10 = -30 / ((arg1 + 24) / 46);
        return var3;
    }
}
