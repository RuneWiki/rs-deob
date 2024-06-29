import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class395 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lwm;")
    private class399 field6013 = new class399(64);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lph;")
    private class459 field6017;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field6019 = 0;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6015 = new String[100];

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6016 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field6020 = new String[5];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lrm;")
    public static class284 field6014;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public final void method2454(boolean arg0) {
        if (arg0) {
            this.field6017 = null;
        }
        field6018++;
        class399 var2 = this.field6013;
        synchronized (this.field6013) {
            this.field6013.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public final void method2455(int arg0) {
        class399 var2 = this.field6013;
        synchronized (this.field6013) {
            this.field6013.method2477(43);
        }
        field6011++;
        if (arg0 != 21131) {
            method2456(null, null, null, -74, 17, null, -118, null);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([I[[B[[BII[II[B)I")
    public static final int method2456(int[] arg0, byte[][] arg1, byte[][] arg2, int arg3, int arg4, int[] arg5, int arg6, byte[] arg7) {
        field6012++;
        int var8 = arg0[arg3];
        int var9 = var8 + arg5[arg3];
        int var10 = arg0[arg6];
        int var11 = arg5[arg6] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg7[arg3] & 0xFF;
        if (var14 > (arg7[arg6] & 0xFF)) {
            var14 = arg7[arg6] & 0xFF;
        }
        byte[] var15 = arg2[arg3];
        if (arg4 > -104) {
            method2456(null, null, null, 99, 68, null, 55, null);
        }
        byte[] var16 = arg1[arg6];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lae;")
    public final class166 method2457(int arg0, int arg1) {
        field6009++;
        class399 var3 = this.field6013;
        class166 var4;
        synchronized (this.field6013) {
            if (arg1 >= -33) {
                method2456(null, null, null, -118, -89, null, -101, null);
            }
            var4 = (class166) this.field6013.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field6017;
        byte[] var6;
        synchronized (this.field6017) {
            var6 = this.field6017.method2757(32, arg0, (byte) -126);
        }
        class166 var7 = new class166();
        if (var6 != null) {
            var7.method1168(4, new class289(var6));
        }
        class399 var8 = this.field6013;
        synchronized (this.field6013) {
            this.field6013.method2472(-106, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V")
    public final void method2458(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        field6010++;
        class399 var3 = this.field6013;
        synchronized (this.field6013) {
            this.field6013.method2471((byte) 98, arg1);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static void method2459(int arg0) {
        if (arg0 != 3129) {
            method2459(-60);
        }
        field6015 = null;
        field6020 = null;
        field6016 = null;
        field6014 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class395(class341 arg0, int arg1, class459 arg2) {
        this.field6017 = arg2;
        this.field6017.method2763(32, -3);
    }
}
