import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class742 implements class520 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field10217 = new int[3];

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Z")
    public static boolean field10219 = false;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[F")
    public static float[] field10222 = new float[4];

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "F")
    public static float field10229;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field10218;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field10220;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public int field10224;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public int field10227;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field10230;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field10231;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Z")
    public boolean field10228;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILgga;BLvt;)V")
    public static final void method4111(int arg0, class511 arg1, byte arg2, class768 arg3) {
        field10223++;
        class781 var4 = new class781();
        var4.field10735 = arg1.method3013(arg2 ^ 0xFFFFFFD8);
        var4.field10727 = arg1.method3008(64);
        var4.field10730 = new int[var4.field10735];
        var4.field10728 = new class344[var4.field10735];
        var4.field10734 = new int[var4.field10735];
        var4.field10733 = new byte[var4.field10735][][];
        var4.field10726 = new int[var4.field10735];
        var4.field10732 = new class344[var4.field10735];
        for (int var5 = 0; var5 < var4.field10735; var5++) {
            try {
                int var6 = arg1.method3013(114);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method2993((byte) -93);
                    String var8 = arg1.method2993((byte) -69);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method3008(64);
                    }
                    var4.field10726[var5] = var6;
                    var4.field10730[var5] = var9;
                    var4.field10732[var5] = arg3.method4235(class543.method3220(var7, -31190), var8, -125);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method2993((byte) -121);
                    String var11 = arg1.method2993((byte) -117);
                    int var12 = arg1.method3013(arg2 ^ 0x34);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method2993((byte) -124);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method3008(64);
                            var15[var16] = new byte[var17];
                            arg1.method3014(var17, var15[var16], 75212712, 0);
                        }
                    }
                    var4.field10726[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class543.method3220(var13[var19], -31190);
                    }
                    var4.field10728[var5] = arg3.method4246(var11, class543.method3220(var10, -31190), var18, arg2 + 107);
                    var4.field10733[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field10734[var5] = -1;
            } catch (SecurityException var21) {
                var4.field10734[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field10734[var5] = -3;
            } catch (Exception var23) {
                var4.field10734[var5] = -4;
            } catch (Throwable var24) {
                var4.field10734[var5] = -5;
            }
        }
        if (arg2 != -107) {
            field10229 = 1.2236128F;
        }
        class22.field202.method1039(var4, 0);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static final void method4112(byte arg0) {
        if (class240.field3577 != null) {
            try {
                class240.field3577.close();
            } catch (IOException var1) {
            }
        }
        field10216++;
        class240.field3577 = null;
        if (arg0 != 81) {
            method4112((byte) -68);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    public static void method4113(byte arg0) {
        field10217 = null;
        if (arg0 != 75) {
            method4111(119, null, (byte) -54, null);
        }
        field10222 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)J")
    public final long method3106(byte arg0) {
        field10232++;
        long[] var2 = class701.field9771;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field10224) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field10220 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field10220 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field10231 >> 24)) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field10231 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field10231 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field10231) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field10218) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field10227 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) (((long) (this.field10227 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field10227 >> 8) ^ var23) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field10227 ^ var25) & 0xFFL)];
        if (arg0 > -124) {
            field10217 = null;
        }
        long var29 = var2[(int) ((var27 ^ (long) this.field10230) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field10228 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwt;B)Z")
    public final boolean method3107(class520 arg0, byte arg1) {
        field10225++;
        if (!(arg0 instanceof class742)) {
            return false;
        }
        if (arg1 != 64) {
            this.method3106((byte) 83);
        }
        class742 var3 = (class742) arg0;
        if (this.field10224 != var3.field10224) {
            return false;
        } else if (this.field10220 != var3.field10220) {
            return false;
        } else if (this.field10231 != var3.field10231) {
            return false;
        } else if (this.field10218 != var3.field10218) {
            return false;
        } else if (this.field10227 != var3.field10227) {
            return false;
        } else if (this.field10230 == var3.field10230) {
            return this.field10228 == var3.field10228;
        } else {
            return false;
        }
    }
}
