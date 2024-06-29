import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class64 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field1031 = 65000;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lwb;")
    private class28 field1029 = null;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lwb;")
    private class28 field1040 = null;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1039 = 0;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[I")
    public static int[] field1037 = new int[32];

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
    public static int[] field1041 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method422(byte arg0) {
        field1037 = null;
        field1041 = null;
        if (arg0 != 23) {
            method425(68);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI[BI)Z")
    private final boolean method423(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field1038++;
        class28 var6 = this.field1040;
        synchronized (this.field1040) {
            try {
                int var8;
                if (arg1) {
                    if (this.field1029.method214(true) < ((long) (arg2 * 6 + 6))) {
                        return false;
                    }
                    this.field1029.method226((byte) -62, (long) (arg2 * 6));
                    this.field1029.method218(class78.field1255, -98, 0, 6);
                    var8 = (class78.field1255[5] & 0xFF) + ((class78.field1255[3] & 0xFF) << 16) + (class78.field1255[4] & 0xFF << 8);
                    if (var8 <= 0 || (this.field1040.method214(true) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1040.method214(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class78.field1255[3] = (byte) (var8 >> 16);
                class78.field1255[4] = (byte) (var8 >> 8);
                class78.field1255[1] = (byte) (arg4 >> 8);
                class78.field1255[0] = (byte) (arg4 >> 16);
                class78.field1255[2] = (byte) arg4;
                int var10 = 0;
                class78.field1255[arg0] = (byte) var8;
                this.field1029.method226((byte) -102, (long) (arg2 * 6));
                int var11 = 0;
                this.field1029.method213(6, 0, -6722, class78.field1255);
                while (arg4 > var11) {
                    int var12 = 0;
                    if (arg1) {
                        label104: {
                            this.field1040.method226((byte) -76, (long) (var8 * 520));
                            try {
                                this.field1040.method218(class78.field1255, -74, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class78.field1255[4] & 0xFF) << 16) + (class78.field1255[5] & 0xFF << 8) + (class78.field1255[6] & 0xFF);
                            int var13 = class78.field1255[7] & 0xFF;
                            int var14 = (class78.field1255[0] & 0xFF << 8) + (class78.field1255[1] & 0xFF);
                            int var15 = ((class78.field1255[2] & 0xFF) << 8) + (class78.field1255[3] & 0xFF);
                            if (arg2 == var14 && var10 == var15 && this.field1036 == var13) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1040.method214(true) / 520L)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg4 - var11;
                    if (var12 == 0) {
                        var12 = (int) ((this.field1040.method214(true) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg4 - var11 <= 512) {
                        var12 = 0;
                    }
                    class78.field1255[3] = (byte) var10;
                    class78.field1255[0] = (byte) (arg2 >> 8);
                    class78.field1255[4] = (byte) (var12 >> 16);
                    class78.field1255[6] = (byte) var12;
                    class78.field1255[5] = (byte) (var12 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class78.field1255[2] = (byte) (var10 >> 8);
                    class78.field1255[7] = (byte) this.field1036;
                    class78.field1255[1] = (byte) arg2;
                    this.field1040.method226((byte) -97, (long) (var8 * 520));
                    var8 = var12;
                    this.field1040.method213(8, 0, -6722, class78.field1255);
                    this.field1040.method213(var18, var11, -6722, arg3);
                    var10++;
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[B")
    public final byte[] method424(int arg0, int arg1) {
        field1033++;
        class28 var3 = this.field1040;
        synchronized (this.field1040) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field1029.method214(true)) {
                    return null;
                }
                this.field1029.method226((byte) -99, (long) (arg0 * 6));
                this.field1029.method218(class78.field1255, arg1 ^ 0xFFFFFFA5, 0, 6);
                int var5 = (class78.field1255[2] & 0xFF) + (class78.field1255[1] & 0xFF << 8) + (class78.field1255[0] & 0xFF << 16);
                int var6 = (class78.field1255[4] & 0xFF << 8) + ((class78.field1255[3] & 0xFF) << 16) + (class78.field1255[5] & 0xFF);
                if (var5 < 0 || this.field1031 < var5) {
                    return null;
                }
                if (arg1 != 7) {
                    this.field1040 = null;
                }
                if (var6 <= 0 || (long) var6 > this.field1040.method214(true) / 520L) {
                    return null;
                }
                byte[] var9 = new byte[var5];
                int var10 = 0;
                int var11 = 0;
                label73: while (var5 > var11) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.field1040.method226((byte) -80, (long) (var6 * 520));
                    int var13 = var5 - var11;
                    if (var13 > 512) {
                        var13 = 512;
                    }
                    this.field1040.method218(class78.field1255, -117, 0, var13 + 8);
                    int var14 = ((class78.field1255[2] & 0xFF) << 8) + (class78.field1255[3] & 0xFF);
                    int var15 = class78.field1255[7] & 0xFF;
                    int var16 = ((class78.field1255[0] & 0xFF) << 8) + (class78.field1255[1] & 0xFF);
                    int var17 = ((class78.field1255[5] & 0xFF) << 8) + ((class78.field1255[4] & 0xFF) << 16) + (class78.field1255[6] & 0xFF);
                    if (arg0 == var16 && var10 == var14 && this.field1036 == var15) {
                        if (var17 >= 0 && (this.field1040.method214(true) / 520L) >= ((long) var17)) {
                            var10++;
                            var6 = var17;
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var13) {
                                    continue label73;
                                }
                                var9[var11++] = class78.field1255[var20 + 8];
                                var20++;
                            }
                        }
                        return null;
                    }
                    return null;
                }
                return var9;
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method425(int arg0) {
        field1032++;
        if (arg0 != -65) {
            field1037 = null;
        }
        if (class269.field4350) {
            return;
        }
        class269.field4350 = true;
        class8.field181 = true;
        if (class184.field3053) {
            class114.field1742 = (float) ((int) class114.field1742 - 65 & 0xFFFFFF80);
        } else {
            class271.field4364 += (-24.0F - class271.field4364) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BBII)Z")
    public final boolean method426(byte[] arg0, byte arg1, int arg2, int arg3) {
        field1030++;
        class28 var5 = this.field1040;
        synchronized (this.field1040) {
            int var6 = -37 / ((-arg1 - 21) / 38);
            if (arg3 < 0 || arg3 > this.field1031) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method423(5, true, arg2, arg0, arg3);
            if (!var7) {
                var7 = this.method423(5, false, arg2, arg0, arg3);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ki", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1034++;
        return "Cache:" + this.field1036;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(ILwb;Lwb;I)V")
    public class64(int arg0, class28 arg1, class28 arg2, int arg3) {
        this.field1040 = arg1;
        this.field1029 = arg2;
        this.field1036 = arg0;
        this.field1031 = arg3;
    }
}
