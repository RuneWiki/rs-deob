import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class class88 {

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "[B")
    private byte[] field1232;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field1230;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field1222;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field1212;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "Lcja;")
    private class46 field1210;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Z")
    public static boolean field1208 = false;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "[I")
    public static int[] field1218 = new int[2048];

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "Ldfa;")
    private class177 field1231;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "Lbd;")
    private class68 field1223;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "Llr;")
    private class784 field1221;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "Ljava/lang/String;")
    private String field1224;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "Z")
    private boolean field1205;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Z")
    private boolean field1217;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "Z")
    private boolean field1225;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "Z")
    private boolean field1228;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    private final void method695(int arg0) {
        for (class238 var2 = (class238) this.field1210.method335(arg0 ^ 0xFFFF9FEB); var2 != null; var2 = (class238) this.field1210.method336(127)) {
            if (this.field1223 != var2) {
                while (var2.field3398.packetOut() == 1) {
                    var2.method1590((byte) 91, this.field1212);
                }
            }
        }
        field1214++;
        if (this.field1223 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10 && this.method696((byte) -98); var3++) {
            if (this.field1223.field3398.packetOut() != 1) {
                this.method702(-4927);
                return;
            }
            this.field1223.method1590((byte) 91, this.field1212);
        }
        if (arg0 != 4510) {
            this.field1221 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Z")
    private final boolean method696(byte arg0) {
        field1229++;
        if (arg0 > -77) {
            return false;
        } else if (this.field1221 == null) {
            double var2 = (double) this.field1223.method614((byte) -69);
            return var2 == 0.0D || (double) class197.method1423(1) >= 1000.0D / var2 + (double) this.field1223.method615(121);
        } else {
            return !this.field1223.method619(-1) || this.method699((byte) -107) > this.field1223.method620(-14632);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    private final void method697(int arg0) {
        field1233++;
        for (class238 var2 = (class238) this.field1210.method335(arg0 - 38671); var2 != null; var2 = (class238) this.field1210.method336(arg0 ^ 0x25D4)) {
            if (var2 instanceof class177) {
                class177 var3 = (class177) var2;
                while ((var3.field3399 <= 8 || this.method699((byte) -107) > (double) var3.method1341(114)) && var3.field3398.packetOut(this.field1212) == 1) {
                    var3.method1590((byte) 91, this.field1212);
                }
            }
        }
        if (arg0 != 9604) {
            this.method710(-2);
        }
        this.method704(this.field1224, arg0 ^ 0x25F9);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)Lrq;")
    public static final class372 method698(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class372 var4 = var3.field7472;
            var3.field7472 = null;
            class9.method60(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)D")
    public final double method699(byte arg0) {
        field1206++;
        if (arg0 != -107) {
            this.field1210 = null;
        }
        if (this.field1221 == null) {
            return this.field1223 == null ? 0.0D : this.field1223.method620(-14632);
        } else {
            return this.field1221.method4278(arg0 + 107);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZB)V")
    public final void method700(boolean arg0, byte arg1) {
        if (this.field1221 != null) {
            class745 var3 = this.field1221.method4280(-80);
            if (var3 != null) {
                var3.method4138((byte) 90, arg0);
            }
        }
        field1213++;
        this.field1228 = !this.field1228;
        int var4 = 121 / ((arg1 + 37) / 49);
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Lqb;")
    private final class238 method701(int arg0) throws IOException {
        field1211++;
        if (arg0 > -36) {
            this.method710(-80);
        }
        if (this.field1217) {
            throw new IllegalStateException();
        } else if (this.field1225) {
            return null;
        } else {
            while (this.field1230.pageOut(this.field1222) <= 0) {
                int var10 = this.method24(-31626, this.field1232);
                if (var10 == -1) {
                    this.field1225 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field1230.write(this.field1232, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field1222.getSerialNumber();
            if (!this.field1222.isBOS()) {
                class238 var3 = (class238) this.field1210.method337((long) var2, 1);
                if (!var3.field3398.pageIn(this.field1222)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
            OggStreamState var4 = new OggStreamState(var2);
            if (!var4.pageIn(this.field1222)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field1212) == 1) {
                class238 var5;
                if (this.field1223 == null && this.field1212.isTheora()) {
                    this.field1223 = new class68(var4);
                    var5 = this.field1223;
                } else if (this.field1221 == null && this.field1212.isVorbis()) {
                    this.field1221 = new class784(var4);
                    var5 = this.field1221;
                } else {
                    byte[] var6 = this.field1212.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var8 < var6.length && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class177(var4);
                    } else {
                        var5 = new class759(var4);
                    }
                }
                this.field1210.method341((long) var2, var5, (byte) 68);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V")
    public final void method702(int arg0) {
        field1216++;
        if (this.field1217) {
            return;
        }
        if (arg0 != -4927) {
            this.field1231 = null;
        }
        for (class238 var2 = (class238) this.field1210.method335(-29067); var2 != null; var2 = (class238) this.field1210.method336(127)) {
            var2.method622(23586);
            var2.field3398.method4124();
        }
        this.field1212.method4124();
        this.field1222.method4124();
        this.field1230.method4124();
        this.field1217 = true;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(B)Llr;")
    public final class784 method703(byte arg0) {
        field1219++;
        int var2 = -4 % ((-arg0 - 20) / 58);
        return this.field1221;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method704(String arg0, int arg1) {
        int var3 = -50 / ((-arg1 - 43) / 55);
        this.field1224 = arg0;
        field1227++;
        if (this.field1224 == null) {
            this.field1231 = null;
            return;
        }
        if (this.field1231 != null && !this.field1224.equals(this.field1231.method1339(128))) {
            this.field1231 = null;
        }
        if (this.field1231 != null) {
            return;
        }
        for (class238 var4 = (class238) this.field1210.method335(-29067); var4 != null; var4 = (class238) this.field1210.method336(114)) {
            if (var4 instanceof class177) {
                class177 var5 = (class177) var4;
                if (this.field1224.equals(var5.method1339(128))) {
                    this.field1231 = var5;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    public final void method705(boolean arg0) throws IOException {
        field1226++;
        if (arg0 || this.field1228) {
            return;
        }
        while (!this.field1217) {
            class238 var2;
            if (this.field1205) {
                var2 = (class238) this.field1210.method337((long) this.field1222.getSerialNumber(), 1);
            } else {
                var2 = this.method701(-127);
                if (var2 == null) {
                    if (this.field1225) {
                        this.method695(4510);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field1205 = true;
            }
            if (this.field1221 == var2) {
                if (this.field1221.method4284((byte) 104) >= 50) {
                    return;
                }
                while (this.field1221.field3398.packetOut(this.field1212) == 1) {
                    this.field1221.method1590((byte) 91, this.field1212);
                    this.method697(9604);
                    if (this.field1223 != null) {
                        double var3 = this.field1223.method620(-14632);
                        for (int var5 = 0; var5 < 10 && this.method696((byte) -79); var5++) {
                            this.method707(65);
                            if (this.field1217) {
                                return;
                            }
                        }
                        if (var3 < this.field1223.method620(-14632)) {
                            return;
                        }
                    }
                    if (this.field1221.method4284((byte) 120) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class177)) {
                this.method697(9604);
            } else if (this.field1223 != var2) {
                while (var2.field3398.packetOut(this.field1212) == 1) {
                    if (var2.field3399 == 1 && var2 instanceof class177) {
                        this.method704(this.field1224, -127);
                    }
                    var2.method1590((byte) 91, this.field1212);
                }
            } else if (this.field1221 == null && !this.field1228) {
                for (int var6 = 0; var6 < 10 && this.method696((byte) -111); var6++) {
                    this.method707(115);
                    if (this.field1217) {
                        return;
                    }
                }
                return;
            }
            this.field1205 = false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)V")
    public static void method706(int arg0) {
        if (arg0 == -23039) {
            field1218 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[B)I")
    public abstract int method24(int arg0, byte[] arg1) throws IOException;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "(I)V")
    private final void method707(int arg0) throws IOException {
        field1207++;
        if (arg0 < 20) {
            this.method697(-26);
        }
        while (this.field1223.field3398.packetOut(this.field1212) != 1) {
            class238 var2 = this.method701(-74);
            if (var2 == null) {
                if (this.field1225) {
                    this.method695(4510);
                }
                return;
            }
            if (this.field1231 == var2) {
                this.method697(9604);
            }
        }
        this.field1223.method1590((byte) 91, this.field1212);
    }

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "(I)Lbd;")
    public final class68 method708(int arg0) {
        if (arg0 != -32624) {
            this.field1232 = null;
        }
        field1220++;
        return this.field1223;
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(B)Z")
    public final boolean method709(byte arg0) {
        field1209++;
        if (!this.field1217 && !this.field1225) {
            return false;
        } else if (this.field1221 == null || this.field1221.method4284((byte) 126) <= 0) {
            if (arg0 >= -89) {
                this.method695(-96);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
    public class88(int arg0) {
        if (!class35.method208((byte) -123, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field1232 = new byte[arg0];
        this.field1230 = new OggSyncState();
        this.field1222 = new OggPage();
        this.field1212 = new OggPacket();
        this.field1210 = new class46(8);
    }

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "(I)Ldfa;")
    public final class177 method710(int arg0) {
        if (arg0 == -11) {
            field1215++;
            return this.field1231;
        } else {
            return null;
        }
    }
}
