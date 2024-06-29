import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class45 implements class109 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
    private boolean field882 = false;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    private int field908 = 50;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lpk;")
    private class99 field898;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "Lpk;")
    private class99 field904;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Lc;")
    private class105 field906;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Lc;")
    private class105 field896;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[S")
    private short[] field894;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "[Z")
    private boolean[] field912;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[Z")
    private boolean[] field890;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[B")
    private byte[] field885;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "[B")
    private byte[] field895;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "[B")
    private byte[] field899;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[Z")
    private boolean[] field888;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "[B")
    private byte[] field905;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[Z")
    private boolean[] field901;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[Z")
    private boolean[] field889;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Lke;")
    public static class107 field900 = new class107(5000);

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "Lqk;")
    public static class207 field910 = class24.method212(255, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Ljg;")
    public static class167 field887;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method340(int arg0) {
        field903++;
        if (arg0 != 50) {
            this.field898 = null;
        }
        this.field906.method762(arg0 ^ 0xFFFFFFB0);
        if (this.field896 != null) {
            this.field896.method762(-124);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)Z")
    public final boolean method341(boolean arg0, int arg1) {
        if (arg0) {
            field892++;
            return this.field882 || this.field890[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    public final int method342(int arg0, int arg1) {
        field883++;
        return arg1 == 65535 ? this.field894[arg0] & 0xFFFF : 115;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(II)[I")
    public final int[] method343(int arg0, int arg1) {
        field886++;
        class140 var3 = this.method347(arg1, false);
        if (arg0 != 0) {
            this.field890 = null;
        }
        return var3 == null ? null : var3.method969(this.field904, this.field882 || this.field890[arg1], (byte) -106, this);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IFB)[I")
    public final int[] method344(int arg0, float arg1, byte arg2) {
        field891++;
        if (arg2 != 126) {
            field911 = -23;
        }
        class140 var4 = this.method347(arg0, false);
        if (var4 == null) {
            return null;
        } else {
            var4.field2418 = true;
            return var4.method972(arg1, this.field904, this, this.field882 || this.field890[arg0], -6290);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;Z)V")
    public static final void method345(class184 arg0, boolean arg1) {
        field884++;
        arg0.field3271 = arg1;
        if (arg0.field3273 != null) {
            arg0.field3273.field1537 = 0;
        }
        for (class184 var2 = arg0.method210(); var2 != null; var2 = arg0.method196()) {
            method345(var2, false);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Z")
    public final boolean method346(int arg0, int arg1) {
        field893++;
        return arg1 == 0 ? this.field889[arg0] : false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Lic;")
    private final class140 method347(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field881++;
        class140 var3 = (class140) this.field906.method758(false, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field898.method705(arg0, 0, -1);
        if (var4 == null) {
            return null;
        } else {
            class149 var5 = new class149(var4);
            class140 var6 = new class140(var5);
            this.field906.method759((long) arg0, 2, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Z")
    public final boolean method348(int arg0, int arg1) {
        field897++;
        int var3 = -116 % ((arg1 + 25) / 57);
        return this.field912[arg0];
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
    public final void method349(byte arg0, int arg1) {
        field907++;
        for (class140 var3 = (class140) this.field906.method754(55); var3 != null; var3 = (class140) this.field906.method755((byte) -90)) {
            if (var3.field2418) {
                var3.method976(arg1, 255);
                var3.field2418 = false;
            }
        }
        if (arg0 >= -45) {
            this.method351(65, 33);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
    public final void method350(byte arg0, boolean arg1) {
        this.field882 = arg1;
        int var3 = 111 / ((arg0 + 85) / 40);
        this.method340(50);
        field909++;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)Z")
    public final boolean method351(int arg0, int arg1) {
        field902++;
        class140 var3 = this.method347(arg0, false);
        if (arg1 == 255) {
            return var3 == null ? false : var3.method974(this, this.field904, (byte) 34);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method352(byte arg0) {
        field910 = null;
        field887 = null;
        if (arg0 < -17) {
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lpk;Lpk;Lpk;IZ)V")
    public class45(class99 arg0, class99 arg1, class99 arg2, int arg3, boolean arg4) {
        this.field898 = arg0;
        this.field904 = arg2;
        this.field908 = arg3;
        this.field882 = arg4;
        this.field906 = new class105(this.field908);
        this.field896 = null;
        class149 var6 = new class149(arg1.method705(0, 0, -1));
        int var7 = var6.method1050(1272006568);
        this.field894 = new short[var7];
        this.field912 = new boolean[var7];
        this.field890 = new boolean[var7];
        this.field885 = new byte[var7];
        this.field895 = new byte[var7];
        this.field899 = new byte[var7];
        this.field888 = new boolean[var7];
        this.field905 = new byte[var7];
        this.field901 = new boolean[var7];
        this.field889 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field901[var8] = var6.method1045((byte) -20) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field901[var9]) {
                this.field889[var9] = var6.method1045((byte) -24) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field901[var10]) {
                this.field912[var10] = var6.method1045((byte) 79) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field901[var11]) {
                this.field890[var11] = var6.method1045((byte) -40) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field901[var12]) {
                this.field888[var12] = var6.method1045((byte) 76) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field901[var13]) {
                this.field899[var13] = var6.method1084((byte) 49);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field901[var14]) {
                this.field885[var14] = var6.method1084((byte) 49);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field901[var15]) {
                this.field905[var15] = var6.method1084((byte) 49);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field901[var16]) {
                this.field895[var16] = var6.method1084((byte) 49);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field901[var17]) {
                this.field894[var17] = (short) var6.method1050(1272006568);
            }
        }
    }
}
