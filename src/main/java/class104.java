import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public abstract class class104 {

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "[B")
    private byte[] field1182;

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field1199;

    @OriginalMember(owner = "client!pia", name = "v", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field1190;

    @OriginalMember(owner = "client!pia", name = "I", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field1191;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "Lqha;")
    private class112 field1193;

    @OriginalMember(owner = "client!pia", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field1212 = new String[] { method929(method928("!@>u\\y")), method929(method928("!@>u_y")), method929(method928("*\u0007qui")), method929(method928("?\\37")), method929(method928("!@>uPy")), method929(method928("!@>uYy")), method929(method928("!@>u[y")), method929(method928("!@>u^y")), method929(method928("k\t")), method929(method928("!@>uZy")), method929(method928("!@>uDy")), method929(method928("!@>uGy")), method929(method928("!@>uQy")), method929(method928("!@>uVy")), method929(method928("!@>uFy")), method929(method928("\u0017H67q5\t+44=F>?4;H8/|4F-:4=@=)u#P")), method929(method928(";H8/|4F-:")), method929(method928("!@>u(8G6/*y")), method929(method928("!@>uRy")), method929(method928("!@>uUy")), method929(method928("!@>uXy")), method929(method928("!@>u]y")), method929(method928(":H+>")), method929(method928("!@>uSy")), method929(method928("!@>uEy")) };

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "F")
    public static float field1185 = 0.25F;

    @OriginalMember(owner = "client!pia", name = "D", descriptor = "[I")
    public static int[] field1206 = new int[120];

    @OriginalMember(owner = "client!pia", name = "w", descriptor = "[I")
    public static int[] field1207;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "Lvha;")
    public static class713 field1208;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "Ldea;")
    public static class259 field1210;

    @OriginalMember(owner = "client!pia", name = "H", descriptor = "Lel;")
    public static class573 field1211;

    @OriginalMember(owner = "client!pia", name = "G", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!pia", name = "K", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!pia", name = "u", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!pia", name = "M", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!pia", name = "E", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pia", name = "L", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!pia", name = "J", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!pia", name = "C", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!pia", name = "B", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!pia", name = "A", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!pia", name = "F", descriptor = "Ll;")
    private class20 field1198;

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "Lsv;")
    private class686 field1188;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "Led;")
    private class732 field1192;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "Ljava/lang/String;")
    private String field1203;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "Z")
    private boolean field1179;

    @OriginalMember(owner = "client!pia", name = "x", descriptor = "Z")
    private boolean field1181;

    @OriginalMember(owner = "client!pia", name = "y", descriptor = "Z")
    private boolean field1186;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "Z")
    private boolean field1189;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "(B)D")
    public final double method909(byte arg0) {
        try {
            if (arg0 < 6) {
                method918(109);
            }
            field1173++;
            if (this.field1198 == null) {
                return this.field1188 == null ? 0.0D : this.field1188.method5034(99999999);
            } else {
                return this.field1198.method135(1067);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V")
    private final void method910(int arg0) {
        try {
            for (class298 var2 = (class298) this.field1193.method971(347); var2 != null; var2 = (class298) this.field1193.method973(true)) {
                if (var2 instanceof class732) {
                    class732 var3 = (class732) var2;
                    while ((var3.field4695 <= 8 || this.method909((byte) 69) > (double) var3.method5335((byte) 126)) && var3.field4697.packetOut(this.field1191) == 1) {
                        var3.method2516(this.field1191, (byte) 108);
                    }
                }
            }
            field1202++;
            if (arg0 == 0) {
                this.method919((byte) 73, this.field1203);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V")
    public final void method911(int arg0) throws IOException {
        try {
            field1201++;
            if (!this.field1186) {
                if (arg0 >= -93) {
                    method917((byte) -116, null);
                }
                while (!this.field1189) {
                    class298 var2;
                    if (this.field1181) {
                        var2 = (class298) this.field1193.method977((long) this.field1190.getSerialNumber(), 1);
                    } else {
                        var2 = this.method913((byte) 13);
                        if (var2 == null) {
                            if (this.field1179) {
                                this.method915((byte) 114);
                            }
                            return;
                        }
                        if (var2 == null) {
                            throw new IllegalStateException();
                        }
                        this.field1181 = true;
                    }
                    if (this.field1198 == var2) {
                        if (this.field1198.method133(0) >= 50) {
                            return;
                        }
                        while (this.field1198.field4697.packetOut(this.field1191) == 1) {
                            this.field1198.method2516(this.field1191, (byte) 117);
                            this.method910(0);
                            if (this.field1188 != null) {
                                double var4 = this.field1188.method5034(99999999);
                                for (int var6 = 0; var6 < 10 && this.method923(true); var6++) {
                                    this.method921(124);
                                    if (this.field1189) {
                                        return;
                                    }
                                }
                                if (var4 < this.field1188.method5034(99999999)) {
                                    return;
                                }
                            }
                            if (this.field1198.method133(0) >= 50) {
                                return;
                            }
                        }
                    } else if (var2 instanceof class732) {
                        this.method910(0);
                    } else if (this.field1188 != var2) {
                        while (var2.field4697.packetOut(this.field1191) == 1) {
                            if (var2.field4695 == 1 && var2 instanceof class732) {
                                this.method919((byte) 108, this.field1203);
                            }
                            var2.method2516(this.field1191, (byte) 93);
                        }
                    } else if (this.field1198 == null && !this.field1186) {
                        for (int var3 = 0; var3 < 10 && this.method923(true); var3++) {
                            this.method921(116);
                            if (this.field1189) {
                                return;
                            }
                        }
                        return;
                    }
                    this.field1181 = false;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1212[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(B)Ll;")
    public final class20 method912(byte arg0) {
        try {
            field1177++;
            if (arg0 != 115) {
                this.field1199 = null;
            }
            return this.field1198;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "(B)Lsm;")
    private final class298 method913(byte arg0) throws IOException {
        try {
            field1204++;
            if (this.field1189) {
                throw new IllegalStateException();
            } else if (arg0 != 13) {
                return null;
            } else if (this.field1179) {
                return null;
            } else {
                while (this.field1199.pageOut(this.field1190) <= 0) {
                    int var2 = this.method926(this.field1182, -74);
                    if (var2 == -1) {
                        this.field1179 = true;
                        return null;
                    }
                    if (var2 == 0) {
                        return null;
                    }
                    if (!this.field1199.write(this.field1182, var2)) {
                        throw new RuntimeException("");
                    }
                }
                int var3 = this.field1190.getSerialNumber();
                if (!this.field1190.isBOS()) {
                    class298 var10 = (class298) this.field1193.method977((long) var3, arg0 - 12);
                    if (!var10.field4697.pageIn(this.field1190)) {
                        throw new IllegalStateException();
                    }
                    return var10;
                }
                OggStreamState var4 = new OggStreamState(var3);
                if (!var4.pageIn(this.field1190)) {
                    throw new IllegalStateException();
                } else if (var4.packetPeek(this.field1191) == 1) {
                    class298 var5;
                    if (this.field1188 == null && this.field1191.isTheora()) {
                        this.field1188 = new class686(var4);
                        var5 = this.field1188;
                    } else if (this.field1198 == null && this.field1191.isVorbis()) {
                        this.field1198 = new class20(var4);
                        var5 = this.field1198;
                    } else {
                        byte[] var6 = this.field1191.getData();
                        StringBuffer var7 = new StringBuffer();
                        for (int var8 = 1; var8 < var6.length && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                            var7.append((char) var6[var8]);
                        }
                        String var9 = var7.toString();
                        if (var9.equals(field1212[22])) {
                            var5 = new class732(var4);
                        } else {
                            var5 = new class101(var4);
                        }
                    }
                    this.field1193.method968((byte) -111, (long) var3, var5);
                    return var5;
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field1212[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(B)Z")
    public final boolean method914(byte arg0) {
        try {
            field1197++;
            if (!this.field1189 && !this.field1179) {
                return false;
            } else if (this.field1198 == null || this.field1198.method133(0) <= 0) {
                return arg0 == -52 ? true : true;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
    private final void method915(byte arg0) {
        try {
            for (class298 var2 = (class298) this.field1193.method971(347); var2 != null; var2 = (class298) this.field1193.method973(true)) {
                if (this.field1188 != var2) {
                    while (var2.field4697.packetOut() == 1) {
                        var2.method2516(this.field1191, (byte) 120);
                    }
                }
            }
            if (arg0 < 87) {
                field1211 = null;
            }
            field1176++;
            if (this.field1188 != null) {
                for (int var3 = 0; var3 < 10; var3++) {
                    if (!this.method923(true)) {
                        return;
                    }
                    if (this.field1188.field4697.packetOut() != 1) {
                        this.method927(-123);
                        return;
                    }
                    this.field1188.method2516(this.field1191, (byte) 99);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(I)V")
    public static void method916(int arg0) {
        try {
            field1206 = null;
            field1208 = null;
            field1207 = null;
            field1211 = null;
            field1210 = null;
            if (arg0 != 0) {
                field1210 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1212[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method917(byte arg0, String[] arg1) {
        try {
            field1205++;
            if (arg0 <= 120) {
                return null;
            }
            String[] var2 = new String[5];
            for (int var3 = 0; var3 < 5; var3++) {
                var2[var3] = var3 + field1212[8];
                if (arg1 != null && arg1[var3] != null) {
                    var2[var3] = var2[var3] + arg1[var3];
                }
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[7] + arg0 + ',' + (arg1 == null ? field1212[3] : field1212[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "(I)V")
    public static final void method918(int arg0) {
        try {
            field1175++;
            class614[] var1 = class504.field7310;
            synchronized (class504.field7310) {
                for (int var2 = arg0; var2 < class504.field7310.length; var2++) {
                    class504.field7310[var2] = new class614();
                    class217.field3326[var2] = 0;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method919(byte arg0, String arg1) {
        try {
            field1183++;
            if (arg0 < 61) {
                this.field1181 = true;
            }
            this.field1203 = arg1;
            if (this.field1203 == null) {
                this.field1192 = null;
            } else {
                if (this.field1192 != null && !this.field1203.equals(this.field1192.method5336((byte) -123))) {
                    this.field1192 = null;
                }
                if (this.field1192 == null) {
                    for (class298 var3 = (class298) this.field1193.method971(347); var3 != null; var3 = (class298) this.field1193.method973(true)) {
                        if (var3 instanceof class732) {
                            class732 var4 = (class732) var3;
                            if (this.field1203.equals(var4.method5336((byte) -123))) {
                                this.field1192 = var4;
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1212[4] + arg0 + ',' + (arg1 == null ? field1212[3] : field1212[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "(B)Liu;")
    public static final class604 method920(byte arg0) {
        try {
            field1178++;
            if (class765.field11064 < class192.field2592.length) {
                return class192.field2592[class765.field11064++];
            } else {
                int var1 = 23 / ((-arg0 - 2) / 55);
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "(I)V")
    private final void method921(int arg0) throws IOException {
        try {
            field1184++;
            int var2 = 52 % ((48 - arg0) / 50);
            while (this.field1188.field4697.packetOut(this.field1191) != 1) {
                class298 var3 = this.method913((byte) 13);
                if (var3 == null) {
                    if (this.field1179) {
                        this.method915((byte) 121);
                    }
                    return;
                }
                if (this.field1192 == var3) {
                    this.method910(0);
                }
            }
            this.field1188.method2516(this.field1191, (byte) 91);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZ)V")
    public final void method922(int arg0, boolean arg1) {
        try {
            if (arg0 != -4796) {
                field1185 = 0.18156213F;
            }
            if (this.field1198 != null) {
                class415 var3 = this.field1198.method136((byte) -105);
                if (var3 != null) {
                    var3.method3219(-28252, arg1);
                }
            }
            field1194++;
            this.field1186 = !this.field1186;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[20] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)Z")
    private final boolean method923(boolean arg0) {
        try {
            field1174++;
            if (!arg0) {
                field1185 = -1.5867F;
            }
            if (this.field1198 == null) {
                double var2 = (double) this.field1188.method5035(-28921);
                return var2 == 0.0D || (double) class430.method3299(119) >= (double) this.field1188.method5029((byte) 12) + 1000.0D / var2;
            } else {
                return !this.field1188.method5032(!arg0) || this.method909((byte) 102) > this.field1188.method5034(99999999);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "(B)Led;")
    public final class732 method924(byte arg0) {
        try {
            field1187++;
            if (arg0 >= -11) {
                this.method915((byte) -50);
            }
            return this.field1192;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "(I)Lsv;")
    public final class686 method925(int arg0) {
        try {
            if (arg0 != -121) {
                this.method925(107);
            }
            field1195++;
            return this.field1188;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "([BI)I")
    public abstract int method926(byte[] arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
    public final void method927(int arg0) {
        try {
            field1180++;
            if (!this.field1189) {
                for (class298 var2 = (class298) this.field1193.method971(347); var2 != null; var2 = (class298) this.field1193.method973(true)) {
                    var2.method138((byte) -119);
                    var2.field4697.method5403();
                }
                this.field1191.method5403();
                int var3 = -108 / ((arg0 - 35) / 40);
                this.field1190.method5403();
                this.field1199.method5403();
                this.field1189 = true;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1212[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(I)V")
    public class104(int arg0) {
        try {
            if (!class116.method1024(field1212[16], 1)) {
                throw new RuntimeException(field1212[15]);
            }
            this.field1182 = new byte[arg0];
            this.field1199 = new OggSyncState();
            this.field1190 = new OggPage();
            this.field1191 = new OggPacket();
            this.field1193 = new class112(8);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1212[17] + arg0 + ')');
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
            var0 += var5;
            field1206[var1] = var0 / 4;
        }
        field1207 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; var3++) {
            field1207[var3] = var2 - 1;
            var2 += var2;
        }
        field1208 = new class713(2, 8);
        field1209 = 0;
        field1210 = new class259();
        field1211 = new class573(23, -2);
    }

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method928(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method929(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
