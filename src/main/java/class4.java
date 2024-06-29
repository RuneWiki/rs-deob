import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class4 {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lbd;")
    public static class162 field30 = class17.method142(0, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "F")
    public static float field31;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field32;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 7)
    public static void method17(byte arg0) {
        if (arg0 != 54) {
            field30 = (class162) null;
        }
        field30 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 16)
    public class4() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)Lfm;", line = 34)
    public static final class49 method18(int arg0, boolean arg1) {
        class49 var2 = (class49) class229.field3807.method1536((long) arg0, -128);
        field33++;
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field31 = 1.4155304F;
        }
        byte[] var3 = class308.field5176.method1128(arg0, 0, 1);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method358(arg0, new class94(var3), !arg1);
        }
        class229.field3807.method1532((long) arg0, -56, var4);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z", line = 66)
    public static final boolean method19(int arg0) {
        field28++;
        if (class117.field2159) {
            return true;
        } else {
            if (arg0 >= -118) {
                field29 = 76;
            }
            return class198.field3369;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lb;[BZ)V", line = 82)
    public final void method20(class94 arg0, byte[] arg1, boolean arg2) {
        field27++;
        if (arg0.field1681[arg0.field1653] != 31 || arg0.field1681[arg0.field1653 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field32 == null) {
            this.field32 = new Inflater(true);
        }
        try {
            this.field32.setInput(arg0.field1681, arg0.field1653 + 10, arg0.field1681.length + -18 + -arg0.field1653);
            this.field32.inflate(arg1);
        } catch (Exception var5) {
            this.field32.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (!arg2) {
            this.field32.reset();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 121)
    public static final void method21(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = arg2;
        field26++;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class19.method172(class112.field2028, arg1 + arg2, class82.field1426, false);
        int var10 = class19.method172(class112.field2028, arg1 - arg2, class82.field1426, false);
        if (arg3 != 1) {
            field31 = -0.75148976F;
        }
        class3.method14(arg4, var10, var9, class184.field3180[arg0], -100);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 + var6;
                int var12 = arg0 - var6;
                if (var11 >= class303.field5106 && class298.field4989 >= var12) {
                    int var13 = class19.method172(class112.field2028, arg1 + var5, class82.field1426, false);
                    int var14 = class19.method172(class112.field2028, arg1 - var5, class82.field1426, false);
                    if (var11 <= class298.field4989) {
                        class3.method14(arg4, var14, var13, class184.field3180[var11], -109);
                    }
                    if (class303.field5106 <= var12) {
                        class3.method14(arg4, var14, var13, class184.field3180[var12], arg3 ^ 0xFFFFFF87);
                    }
                }
            }
            var5++;
            int var15 = arg0 + var5;
            int var16 = arg0 - var5;
            if (var15 >= class303.field5106 && class298.field4989 >= var16) {
                int var17 = class19.method172(class112.field2028, arg1 + var6, class82.field1426, false);
                int var18 = class19.method172(class112.field2028, arg1 - var6, class82.field1426, false);
                if (class298.field4989 >= var15) {
                    class3.method14(arg4, var18, var17, class184.field3180[var15], -114);
                }
                if (var16 >= class303.field5106) {
                    class3.method14(arg4, var18, var17, class184.field3180[var16], -100);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLb;)Lta;", line = 200)
    public static final class269 method22(byte arg0, class94 arg1) {
        field34++;
        if (arg0 <= 65) {
            field31 = 1.3281877F;
        }
        return new class269(arg1.method750((byte) -24), arg1.method750((byte) -24), arg1.method750((byte) -24), arg1.method750((byte) -24), arg1.method732(-1), arg1.method732(-1), arg1.method756(915905888));
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(III)V", line = 209)
    private class4(int arg0, int arg1, int arg2) {
    }
}
