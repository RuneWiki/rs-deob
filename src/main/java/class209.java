import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class209 {

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ldc;")
    private class5 field2949 = new class5(64);

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lhe;")
    private class239 field2945;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lhe;")
    public class239 field2955;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Liu;")
    public static class390 field2948 = new class390(38, -1);

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lwt;")
    public static class194 field2952 = new class194("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!b", name = "l", descriptor = "F")
    public static float field2953;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
    public static final int method1286(int arg0, int arg1, int arg2) {
        field2946++;
        int var3 = arg2 * 57 + arg1;
        if (arg0 < 61) {
            field2952 = null;
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var5 & 0x7F99AF8) >> 19;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method1287(int arg0) {
        field2950++;
        class5 var2 = this.field2949;
        synchronized (this.field2949) {
            this.field2949.method38((byte) -100);
            int var3 = 1 / ((arg0 + 32) / 45);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method1288(int arg0) {
        if (arg0 >= -14) {
            method1286(30, 30, 4);
        }
        field2948 = null;
        field2952 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Loo;")
    public final class424 method1289(int arg0, int arg1) {
        field2954++;
        class5 var3 = this.field2949;
        class424 var4;
        synchronized (this.field2949) {
            var4 = (class424) this.field2949.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 27615) {
            method1286(103, 34, 14);
        }
        byte[] var5 = this.field2945.method1470(4, arg1, 3);
        class424 var6 = new class424();
        var6.field6269 = this;
        if (var5 != null) {
            var6.method2528(new class156(var5), (byte) -103);
        }
        class5 var7 = this.field2949;
        synchronized (this.field2949) {
            this.field2949.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lae;I)V")
    public static final void method1290(class156 arg0, int arg1) {
        field2943++;
        byte[] var2 = new byte[24];
        if (class445.field6499 != null) {
            try {
                class445.field6499.method445(0L, -83);
                class445.field6499.method454(-99, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method948(var2, 0, 2, 24);
        if (arg1 < 119) {
            field2952 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1291(int arg0, String arg1) {
        field2951++;
        if (!class288.field4128) {
            return;
        }
        boolean var2 = false;
        int var3 = class276.field3953;
        int[] var4 = class330.field4790;
        for (int var5 = 0; var5 < var3; var5++) {
            class313 var6 = class262.field3742[var4[var5]];
            if (var6 != null && class415.field6145 != var6 && var6.field4592 != null && var6.field4592.equalsIgnoreCase(arg1)) {
                class386.method2321(true, class220.field3104);
                class211.field2992++;
                class79.field1108.method987(class71.field1052, (byte) 6);
                class79.field1108.method987(class472.field6827, (byte) 6);
                class79.field1108.method947(-28, 0);
                class79.field1108.method944(true, var4[var5]);
                class79.field1108.method992(-105, class303.field4394);
                var2 = true;
                class230.method1404(true, true, var6.field4279[0], 0, var6.field4282[0], var6.method1773(-26), 0, var6.method1773(arg0 - 99), -2);
                break;
            }
        }
        if (!var2) {
            class98.method597(arg0 ^ 0x729B, class454.field6597.method1220(2969, class81.field1122) + arg1);
        }
        if (class288.field4128) {
            class489.method2941(-1);
        }
        if (arg0 != 24) {
            field2953 = -0.06804213F;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public final void method1292(byte arg0) {
        field2947++;
        if (arg0 == 7) {
            class5 var2 = this.field2949;
            synchronized (this.field2949) {
                this.field2949.method35((byte) -1);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z")
    public static final boolean method1293(int arg0, int arg1, int arg2) {
        int var3 = 56 / ((-arg1 - 16) / 50);
        field2944++;
        return (class235.method1430(true, arg0, arg2) | (arg2 & 0x2000) != 0 | class318.method1914(arg2, arg0, (byte) 100)) & class157.method1005((byte) 116, arg2, arg0);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
    public final void method1294(int arg0, int arg1) {
        class5 var3 = this.field2949;
        synchronized (this.field2949) {
            if (arg1 != 0) {
                this.method1292((byte) -93);
            }
            this.field2949.method39(false, arg0);
        }
        field2942++;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lci;ILhe;Lhe;)V")
    public class209(class298 arg0, int arg1, class239 arg2, class239 arg3) {
        this.field2945 = arg2;
        this.field2955 = arg3;
        this.field2945.method1473(4309, 3);
    }
}
