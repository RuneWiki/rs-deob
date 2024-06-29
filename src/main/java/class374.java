import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class374 implements Runnable {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "Lrp;")
    private class280 field5392;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field5388;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
    private volatile boolean field5391;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "[Loda;")
    private class548[] field5390;

    @OriginalMember(owner = "client!ct", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field5384++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field5392.field3772));
            String var2 = var1.readLine();
            class544 var3 = class58.method363((byte) 37);
            while (var2 != null) {
                var3.method3067(var2, (byte) 114);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3061(66);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field5390 = new class548[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field5390[var5 / 3] = new class548(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field5391 = true;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method2281(byte arg0) {
        field5385++;
        if (this.field5391) {
            return true;
        }
        if (this.field5392 == null) {
            try {
                int var2 = class375.field5396 == class333.field4859 ? 80 : class52.field675.field9558 + 7000;
                this.field5392 = class495.field6687.method613((byte) 91, new URL("http://" + class52.field675.field9560 + ":" + var2 + "/news.ws?game=" + class33.field322.field6547));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field5392 == null || this.field5392.field3773 == 2) {
            return true;
        }
        if (arg0 != 79) {
            this.field5391 = true;
        }
        if (this.field5392.field3773 != 1) {
            return false;
        }
        if (this.field5388 == null) {
            this.field5388 = new Thread(this);
            this.field5388.start();
        }
        return this.field5391;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLrq;)V", line = 91)
    public static final void method2282(byte arg0, class39 arg1) {
        field5386++;
        int var2 = arg1.field424 - class430.field5984;
        int var3 = arg1.field423 * 512 + arg1.method241(-25747) * 256;
        int var4 = arg1.field472 * 512 + (arg1.method241(arg0 ^ 0x64E4) * 256);
        arg1.field3917 += (var4 - arg1.field3917) / var2;
        arg1.field3929 += (var3 - arg1.field3929) / var2;
        arg1.field523 = 0;
        if (arg1.field478 == 0) {
            arg1.method230(0, 8192);
        }
        if (arg0 != -119) {
            return;
        }
        if (arg1.field478 == 1) {
            arg1.method230(0, 12288);
        }
        if (arg1.field478 == 2) {
            arg1.method230(0, 0);
        }
        if (arg1.field478 == 3) {
            arg1.method230(arg0 + 119, 4096);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)Loda;", line = 126)
    public final class548 method2283(int arg0, byte arg1) {
        field5389++;
        if (this.field5390 == null || arg0 < 0 || this.field5390.length <= arg0) {
            return null;
        } else {
            if (arg1 != -80) {
                this.field5388 = null;
            }
            return this.field5390[arg0];
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lcr;IBLdga;)V", line = 142)
    public static final void method2284(class112 arg0, int arg1, byte arg2, class138 arg3) {
        field5387++;
        class101 var4 = new class101();
        var4.field1223 = arg3.method957((byte) -101);
        if (arg2 != -38) {
            return;
        }
        var4.field1228 = arg3.method943(arg2 - 65);
        var4.field1222 = new int[var4.field1223];
        var4.field1230 = new class280[var4.field1223];
        var4.field1232 = new byte[var4.field1223][][];
        var4.field1227 = new int[var4.field1223];
        var4.field1225 = new class280[var4.field1223];
        var4.field1231 = new int[var4.field1223];
        for (int var5 = 0; var5 < var4.field1223; var5++) {
            try {
                int var6 = arg3.method957((byte) -126);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method907(false);
                    String var8 = arg3.method907(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method943(-110);
                    }
                    var4.field1227[var5] = var6;
                    var4.field1231[var5] = var9;
                    var4.field1225[var5] = arg0.method619(class48.method287(var7, (byte) 120), (byte) 103, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method907(false);
                    String var11 = arg3.method907(false);
                    int var12 = arg3.method957((byte) -103);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method907(false);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method943(-100);
                            var15[var16] = new byte[var17];
                            arg3.method934(8, 0, var17, var15[var16]);
                        }
                    }
                    var4.field1227[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class48.method287(var13[var19], (byte) 8);
                    }
                    var4.field1230[var5] = arg0.method610(var11, var18, class48.method287(var10, (byte) 61), (byte) -84);
                    var4.field1232[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1222[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1222[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1222[var5] = -3;
            } catch (Exception var23) {
                var4.field1222[var5] = -4;
            } catch (Throwable var24) {
                var4.field1222[var5] = -5;
            }
        }
        class621.field8441.method378(var4, 31316);
    }
}
