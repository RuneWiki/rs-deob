import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class342 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    private int field5312 = 0;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    private int field5318 = -1;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lma;")
    private class5 field5314 = new class5();

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
    public boolean field5325 = false;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[Ldm;")
    private class23[] field5316;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "[[[I")
    private int[][][] field5322;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field5324 = new String[500];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[Z")
    public static boolean[] field5320;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method2363(int arg0, byte arg1) {
        int var2 = -120 % ((17 - arg1) / 50);
        field5313++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 16)
    public final void method2364(int arg0) {
        for (int var2 = 0; var2 < this.field5309; var2++) {
            this.field5322[var2][0] = null;
            this.field5322[var2][1] = null;
            this.field5322[var2][2] = null;
            this.field5322[var2] = (int[][]) null;
        }
        this.field5322 = (int[][][]) null;
        this.field5316 = null;
        field5319++;
        this.field5314.method27((byte) 97);
        this.field5314 = null;
        if (arg0 <= 76) {
            method2370(95, -27, (byte) 58, -41, -58, 92);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[[I", line = 47)
    public final int[][] method2365(byte arg0, int arg1) {
        field5321++;
        int var3 = -60 % ((arg0 + 18) / 33);
        if (this.field5315 == this.field5309) {
            this.field5325 = this.field5316[arg1] == null;
            this.field5316[arg1] = class187.field3010;
            return this.field5322[arg1];
        } else if (this.field5309 == 1) {
            this.field5325 = this.field5318 != arg1;
            this.field5318 = arg1;
            return this.field5322[0];
        } else {
            class23 var4 = this.field5316[arg1];
            if (var4 == null) {
                this.field5325 = true;
                if (this.field5309 <= this.field5312) {
                    class23 var5 = (class23) this.field5314.method21(true);
                    var4 = new class23(arg1, var5.field356);
                    this.field5316[var5.field350] = null;
                    var5.method2028(13329);
                } else {
                    var4 = new class23(arg1, this.field5312);
                    this.field5312++;
                }
                this.field5316[arg1] = var4;
            } else {
                this.field5325 = false;
            }
            this.field5314.method28(var4, 11759);
            return this.field5322[var4.field356];
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)[[[I", line = 111)
    public final int[][][] method2366(int arg0) {
        field5323++;
        if (this.field5315 != this.field5309) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -501) {
            this.field5314 = (class5) null;
        }
        for (int var2 = 0; var2 < this.field5309; var2++) {
            this.field5316[var2] = class187.field3010;
        }
        return this.field5322;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V", line = 244)
    public class342(int arg0, int arg1, int arg2) {
        this.field5315 = arg1;
        this.field5316 = new class23[this.field5315];
        this.field5309 = arg0;
        this.field5322 = new int[this.field5309][3][arg2];
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 136)
    public static void method2367(int arg0) {
        field5320 = null;
        field5324 = null;
        if (arg0 != 1) {
            method2370(89, 17, (byte) -68, 8, 44, 81);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBISJI)V", line = 156)
    public static final void method2368(String arg0, String arg1, int arg2, byte arg3, int arg4, short arg5, long arg6, int arg7) {
        if (arg3 != -68) {
            field5320 = (boolean[]) null;
        }
        field5308++;
        if (class238.field3729 || class78.field1046 >= 500) {
            return;
        }
        class32.field472[class78.field1046] = arg1;
        field5324[class78.field1046] = arg0;
        class135.field1974[class78.field1046] = arg4 == -1 ? class337.field5258 : arg4;
        class282.field4365[class78.field1046] = arg5;
        class234.field3660[class78.field1046] = arg6;
        class58.field839[class78.field1046] = arg2;
        class248.field3904[class78.field1046] = arg7;
        class78.field1046++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)I", line = 195)
    public static final int method2369(byte arg0, int arg1, int arg2) {
        if (arg0 != 62) {
            method2367(8);
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
        }
        field5310++;
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIBIII)V", line = 223)
    public static final void method2370(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 17) {
            method2367(-19);
        }
        for (int var6 = arg1; var6 <= arg0; var6++) {
            class256.method1853(class284.field4402[var6], arg5, arg3, arg4, 0);
        }
        field5311++;
    }
}
