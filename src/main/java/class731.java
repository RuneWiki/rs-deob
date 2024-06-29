import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class731 {

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "Z")
    public boolean field10206 = true;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    private int field10212 = -1;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "Lgk;")
    private class474 field10218;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "Leea;")
    private class131 field10216;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    private int field10210;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    private int field10205;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    private int field10213;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "Lsn;")
    private class630 field10211;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "Lal;")
    private class99 field10220;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "Lmfa;")
    private class615 field10214;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field10209 = 0;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public static int field10217;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field10219;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ww", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field10221;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "[Loia;")
    public static class88[] field10207;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
    public final void method4097(int arg0) {
        this.method4101(this.field10213, (byte) -114, this.field10211);
        if (arg0 == 128) {
            field10203++;
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V")
    private final void method4098(int arg0) {
        field10219++;
        if (!this.field10206) {
            return;
        }
        this.field10206 = false;
        byte[] var2 = this.field10218.field6731;
        byte[] var3 = this.field10216.field1938;
        int var4 = arg0;
        int var5 = this.field10218.field6733;
        int var6 = this.field10218.field6733 * this.field10210 + this.field10205;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field10214 != null && this.field10212 == var4) {
            this.field10206 = false;
            return;
        }
        this.field10212 = var4;
        int var8 = 0;
        int var9 = this.field10205 + (this.field10210 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field10218.field6733 - 128;
        }
        if (this.field10214 == null) {
            this.field10214 = new class615(this.field10216, 3553, 6406, 128, 128, false, this.field10216.field1938, 6406, false);
            this.field10214.method3445(false, false, 86);
            this.field10214.method1297(true, false);
        } else {
            this.field10214.method3446(128, false, 0, false, 6406, this.field10216.field1938, 0, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBI[B)V")
    public final void method4099(int arg0, byte arg1, int arg2, byte[] arg3) {
        field10204++;
        if (arg1 > -1) {
            method4102(29);
        }
        this.field10220.method724(arg2, arg0 * this.field10216.method886(4318, arg2), arg3, -42);
        this.method4101(arg0, (byte) -122, this.field10220);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLjava/io/File;Z)V")
    public static final void method4100(byte arg0, File arg1, boolean arg2) {
        field10208++;
        if (class125.field1518 == null) {
            class707.method3969((byte) 124);
        }
        try {
            if (arg0 >= -6) {
                field10207 = null;
            }
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field10221 == null ? (field10221 = method4103("java.lang.String")) : field10221, Boolean.TYPE);
            var4.invoke(class125.field1518, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBLsn;)V")
    private final void method4101(int arg0, byte arg1, class630 arg2) {
        field10215++;
        if (arg0 != 0 && arg1 < -111) {
            this.method4098(0);
            this.field10216.method926(this.field10214, 115);
            this.field10216.method919(-85, 0, 4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
    public static void method4102(int arg0) {
        if (arg0 != 0) {
            method4102(-31);
        }
        field10207 = null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Leea;Lgk;Lio;IIIII)V")
    public class731(class131 arg0, class474 arg1, class437 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10218 = arg1;
        this.field10216 = arg0;
        this.field10210 = arg7;
        this.field10205 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3935 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6205[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field10213 = var10;
        if (var10 <= 0) {
            this.field10214 = null;
        } else {
            class675 var14 = new class675(var10 * 2);
            if (this.field10216.field1865) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3935 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6205[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3745(-125, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3935 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6205[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3737(var23[var24] & 0xFFFF, -1682769048);
                            }
                        }
                    }
                }
            }
            this.field10211 = this.field10216.method876(-16889, var14.field9154, var14.field9146, 5123, false);
            this.field10220 = new class99(this.field10216, 5123, null, 1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4103(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
