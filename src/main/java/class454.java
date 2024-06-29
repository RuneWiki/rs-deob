import java.awt.Dimension;
import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class454 {

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6384;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Lqc;")
    private class689 field6386;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6385;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Luh;")
    private class149 field6377;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lcga;")
    private class447 field6378;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6388 = new CRC32();

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Ljk;")
    public static class585 field6389 = new class585(19, -1);

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "[F")
    public static float[] field6390 = new float[4];

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "Ljk;")
    public static class585 field6391 = new class585(46, 16);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Lun;")
    private class389 field6387;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "[Lida;")
    private class214[] field6381;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public final void method2689(byte arg0) {
        field6380++;
        if (this.field6381 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6381.length; var2++) {
            if (this.field6381[var2] != null) {
                this.field6381[var2].method1311(1000);
            }
        }
        if (arg0 != -54) {
            field6390 = null;
        }
        for (int var3 = 0; var3 < this.field6381.length; var3++) {
            if (this.field6381[var3] != null) {
                this.field6381[var3].method1310((byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static void method2690(int arg0) {
        field6389 = null;
        if (arg0 <= 15) {
            method2690(54);
        }
        field6390 = null;
        field6391 = null;
        field6388 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLvp;IZLvp;)Lida;")
    private final class214 method2691(boolean arg0, class171 arg1, int arg2, boolean arg3, class171 arg4) {
        field6382++;
        if (this.field6387 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || arg2 >= this.field6381.length) {
            throw new RuntimeException();
        } else if (this.field6381[arg2] == null) {
            this.field6387.field5195 = arg2 * 72 + 6;
            int var6 = this.field6387.method2255(255);
            int var7 = this.field6387.method2255(255);
            if (arg3) {
                method2690(122);
            }
            byte[] var8 = new byte[64];
            this.field6387.method2250(-1, 64, var8, 0);
            class214 var9 = new class214(arg2, arg4, arg1, this.field6377, this.field6386, var6, var8, var7, arg0);
            this.field6381[arg2] = var9;
            return var9;
        } else {
            return this.field6381[arg2];
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lvp;IILvp;)Lida;")
    public final class214 method2692(class171 arg0, int arg1, int arg2, class171 arg3) {
        if (arg1 == -29210) {
            field6383++;
            return this.method2691(true, arg0, arg2, false, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)I")
    public static final int method2693(int arg0, int arg1, byte arg2) {
        field6376++;
        if (class418.field5920 == -1) {
            return 1;
        }
        if (class375.field5039 != arg1) {
            class334.method1932(class424.field6051.method2561(class370.field4980, 0), 8, arg1);
            if (class375.field5039 != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class646.field9190.getSize();
            class653.method3694(class68.field1045, class657.field9330, true, 0, class417.field5909, class424.field6051.method2561(class370.field4980, 0));
            class173 var4 = class110.method797((byte) 104, 0, class123.field1589, class418.field5920);
            long var5 = class301.method1787((byte) -89);
            class68.field1045.method249();
            class230.field2999.method712(0, class480.field6727, 0);
            class68.field1045.method262(class230.field2999);
            class68.field1045.method301(var3.width / 2, var3.height / 2, 512, 512);
            class68.field1045.method239(1.0F);
            class68.field1045.method236(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class55 var7 = class68.field1045.method274(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class68.field1045.method323(0);
                class68.field1045.method246();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class521.field7627.method712((int) (((float) var11 - (float) var10 / 2.0F) * (float) field6392), 0, (var10 + 1) * field6392);
                        var7.method67(class521.field7627, null, 0);
                        var8++;
                        if ((class301.method1787((byte) 91) - var5) >= ((long) arg0)) {
                            break label45;
                        }
                    }
                }
            }
            if (arg2 <= 82) {
                field6390 = null;
            }
            class68.field1045.method328();
            long var12 = (long) (var8 * 1000) / (class301.method1787((byte) -107) - var5);
            class68.field1045.method323(0);
            class68.field1045.method246();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)Z")
    public final boolean method2694(byte arg0) {
        field6379++;
        if (this.field6387 != null) {
            return true;
        }
        if (this.field6378 == null) {
            if (this.field6377.method964((byte) 57)) {
                return false;
            }
            this.field6378 = this.field6377.method969(255, 255, true, (byte) 82, (byte) 0);
        }
        if (this.field6378.field2557) {
            return false;
        }
        class389 var2 = new class389(this.field6378.method917(-27362));
        var2.field5195 = 5;
        int var3 = var2.method2229(255);
        var2.field5195 += var3 * 72;
        byte[] var4 = new byte[var2.field5205.length - var2.field5195];
        var2.method2250(-1, var4.length, var4, 0);
        if (arg0 != -26) {
            field6388 = null;
        }
        byte[] var7;
        if (this.field6384 == null || this.field6385 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field6384, this.field6385);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class500.method2910((byte) 116, var2.field5195 - var4.length - 5, var2.field5205, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field6381 = new class214[var3];
        this.field6387 = var2;
        return true;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Luh;Lqc;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class454(class149 arg0, class689 arg1, BigInteger arg2, BigInteger arg3) {
        this.field6384 = arg2;
        this.field6386 = arg1;
        this.field6385 = arg3;
        this.field6377 = arg0;
        if (!this.field6377.method964((byte) 61)) {
            this.field6378 = this.field6377.method969(255, 255, true, (byte) 82, (byte) 0);
        }
    }
}
