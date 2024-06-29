import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class73 {

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Z")
    public boolean field1226 = false;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Llh;")
    private class364 field1224 = new class364(64);

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Llh;")
    public class364 field1231 = new class364(500);

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Llh;")
    public class364 field1233 = new class364(30);

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Llh;")
    public class364 field1234 = new class364(50);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lhh;")
    private class84 field1212;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Z")
    public boolean field1230;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lhh;")
    public class84 field1220;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[[I")
    public static int[][] field1217 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lcv;")
    public static class398 field1218 = new class398(64);

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lvp;")
    public static class123 field1227 = new class123(14, 3);

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1228 = 2;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[[[Lkf;")
    public static class165[][][] field1223;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lbo;")
    public final class510 method609(int arg0, int arg1) {
        field1219++;
        if (arg0 <= 105) {
            return null;
        }
        class364 var3 = this.field1224;
        class510 var4;
        synchronized (this.field1224) {
            var4 = (class510) this.field1224.method2339(-83, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1212.method683(class285.method1789(arg1, -102), class287.method1793(-106, arg1), 5);
        class510 var6 = new class510();
        var6.field7483 = arg1;
        var6.field7450 = this;
        if (var5 != null) {
            var6.method3022(new class303(var5), (byte) 0);
        }
        var6.method3020(10);
        if (var6.field7480) {
            var6.field7473 = false;
            var6.field7492 = 0;
        }
        if (!this.field1230 && var6.field7455) {
            var6.field7488 = null;
            var6.field7454 = null;
        }
        class364 var7 = this.field1224;
        synchronized (this.field1224) {
            this.field1224.method2342((long) arg1, var6, -93);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method610(byte arg0) {
        field1223 = null;
        field1218 = null;
        if (arg0 != -13) {
            field1223 = null;
        }
        field1217 = null;
        field1227 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V")
    public final void method611(int arg0, byte arg1) {
        field1216++;
        class364 var3 = this.field1224;
        synchronized (this.field1224) {
            this.field1224.method2348(arg0, -19);
        }
        class364 var4 = this.field1231;
        synchronized (this.field1231) {
            this.field1231.method2348(arg0, 109);
        }
        class364 var5 = this.field1233;
        synchronized (this.field1233) {
            this.field1233.method2348(arg0, 1);
            if (arg1 < 77) {
                field1227 = null;
            }
        }
        class364 var6 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2348(arg0, -126);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZ)V")
    public final void method612(byte arg0, boolean arg1) {
        field1214++;
        if (arg0 < 0) {
            this.field1224 = null;
        }
        if (this.field1226 != arg1) {
            this.field1226 = arg1;
            this.method615(-108);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public final void method613(byte arg0) {
        field1213++;
        class364 var2 = this.field1224;
        synchronized (this.field1224) {
            this.field1224.method2350((byte) 112);
        }
        class364 var3 = this.field1231;
        synchronized (this.field1231) {
            this.field1231.method2350((byte) 112);
        }
        class364 var4 = this.field1233;
        synchronized (this.field1233) {
            if (arg0 != 123) {
                return;
            }
            this.field1233.method2350((byte) 112);
        }
        class364 var5 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
    public final void method614(boolean arg0, int arg1) {
        this.field1235 = arg1;
        if (!arg0) {
            this.method609(-9, -75);
        }
        field1221++;
        class364 var3 = this.field1231;
        synchronized (this.field1231) {
            this.field1231.method2349(0);
        }
        class364 var4 = this.field1233;
        synchronized (this.field1233) {
            this.field1233.method2349(0);
        }
        class364 var5 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2349(0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public final void method615(int arg0) {
        field1222++;
        class364 var2 = this.field1224;
        synchronized (this.field1224) {
            int var3 = 127 / ((arg0 + 62) / 44);
            this.field1224.method2349(0);
        }
        class364 var4 = this.field1231;
        synchronized (this.field1231) {
            this.field1231.method2349(0);
        }
        class364 var5 = this.field1233;
        synchronized (this.field1233) {
            this.field1233.method2349(0);
        }
        class364 var6 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method2349(0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V")
    public final void method616(byte arg0, int arg1) {
        int var3 = 125 / ((43 - arg0) / 47);
        this.field1224 = new class364(arg1);
        field1215++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method617(int arg0) {
        class44.field674.method1031(127);
        field1211++;
        for (int var1 = 0; var1 < 32; var1++) {
            class489.field7144[var1] = 0L;
        }
        if (arg0 <= 49) {
            field1232 = 5;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class109.field1736[var2] = 0L;
        }
        class18.field276 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BZ)V")
    public final void method618(byte arg0, boolean arg1) {
        field1225++;
        if (arg0 < 116) {
            method617(15);
        }
        if (this.field1230 != arg1) {
            this.field1230 = arg1;
            this.method615(-120);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lmt;IZLhh;Lhh;)V")
    public class73(class271 arg0, int arg1, boolean arg2, class84 arg3, class84 arg4) {
        this.field1212 = arg3;
        this.field1230 = arg2;
        this.field1220 = arg4;
        if (this.field1212 != null) {
            int var6 = this.field1212.method658((byte) -103) - 1;
            this.field1212.method656((byte) 122, var6);
        }
    }
}
