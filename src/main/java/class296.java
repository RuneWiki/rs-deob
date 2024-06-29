import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class296 extends class250 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
    public static int[] field4318 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4317 = 0;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "[I")
    public static int[] field4324 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Z")
    public boolean field4322;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 5)
    public final void method722(int arg0) {
        field4321++;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 16)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg2 == -1) {
            field4315++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 31)
    public static void method1799(int arg0) {
        field4318 = null;
        field4324 = null;
        if (arg0 != 19190) {
            field4324 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V", line = 51)
    public static final void method1800(int arg0, int arg1) {
        class468 var2 = class358.field5312[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class468 var4 = class358.field5312[var3][arg0][arg1] = class358.field5312[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6765--;
                for (class323 var5 = var4.field6769; var5 != null; var5 = var5.field4727) {
                    class210 var6 = var5.field4726;
                    if (var6.field2972 == arg0 && var6.field2975 == arg1) {
                        var6.field2956--;
                    }
                }
            }
        }
        if (class358.field5312[0][arg0][arg1] == null) {
            class358.field5312[0][arg0][arg1] = new class468(0, arg0, arg1);
            class358.field5312[0][arg0][arg1].field6773 = 1;
        }
        class358.field5312[0][arg0][arg1].field6779 = var2;
        class358.field5312[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)Z", line = 90)
    public final boolean method723(int arg0) {
        field4319++;
        if (arg0 != 17774) {
            this.method723(-123);
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Luo;[[BZ)V", line = 104)
    public static final void method1801(class388 arg0, byte[][] arg1, boolean arg2) {
        field4320++;
        if (!arg2) {
            method1801(null, null, false);
        }
        int var3 = class191.field2708.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class76.field1081[var4] >> 8) * 64 - class455.field6637;
                int var7 = (class76.field1081[var4] & 0xFF) * 64 - class223.field3158;
                class498.method2992(0);
                arg0.method2328(class481.field6937, 77, var6, class169.field2234, var7, var5);
            }
        }
    }
}
