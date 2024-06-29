import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class27 {

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    private int field524 = 0;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    private int field528 = -1;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lth;")
    private class55 field526 = new class55();

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Z")
    public boolean field532 = false;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[[[I")
    private int[][][] field520;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lsn;")
    private class318[] field523;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lgn;")
    public static class257 field527;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "[I")
    public static int[] field530;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method220(int arg0, int arg1) {
        field521++;
        if (arg1 != 17433) {
            method223((Throwable) null, (String) null);
        }
        if (this.field519 == this.field518) {
            this.field532 = this.field523[arg0] == null;
            this.field523[arg0] = class74.field1523;
            return this.field520[arg0];
        } else if (this.field518 == 1) {
            this.field532 = this.field528 != arg0;
            this.field528 = arg0;
            return this.field520[0];
        } else {
            class318 var3 = this.field523[arg0];
            if (var3 == null) {
                this.field532 = true;
                if (this.field524 >= this.field518) {
                    class318 var4 = (class318) this.field526.method428(0);
                    var3 = new class318(arg0, var4.field4801);
                    this.field523[var4.field4800] = null;
                    var4.method278((byte) -105);
                } else {
                    var3 = new class318(arg0, this.field524);
                    this.field524++;
                }
                this.field523[arg0] = var3;
            } else {
                this.field532 = false;
            }
            this.field526.method429(var3, (byte) 127);
            return this.field520[var3.field4801];
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 72)
    public static void method221(int arg0) {
        field527 = null;
        if (arg0 != 3) {
            method221(55);
        }
        field530 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)[[[I", line = 84)
    public final int[][][] method222(int arg0) {
        field531++;
        if (this.field519 != this.field518) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field518; var2++) {
            this.field523[var2] = class74.field1523;
        }
        return this.field520;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnd;", line = 104)
    public static final class61 method223(Throwable arg0, String arg1) {
        field522++;
        class61 var2;
        if (arg0 instanceof class61) {
            var2 = (class61) arg0;
            var2.field1175 = var2.field1175 + ' ' + arg1;
        } else {
            var2 = new class61(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 121)
    public final void method224(byte arg0) {
        field529++;
        if (arg0 >= -120) {
            this.method224((byte) -97);
        }
        for (int var2 = 0; var2 < this.field518; var2++) {
            this.field520[var2][0] = null;
            this.field520[var2][1] = null;
            this.field520[var2][2] = null;
            this.field520[var2] = (int[][]) null;
        }
        this.field523 = null;
        this.field520 = (int[][][]) null;
        this.field526.method432(-115);
        this.field526 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILte;ILag;)V", line = 153)
    public static final void method225(int arg0, class124 arg1, int arg2, class202 arg3) {
        field517++;
        class46 var4 = new class46();
        var4.field944 = arg3.method1317((byte) -75);
        var4.field946 = arg3.method1346(arg0 - 4012);
        var4.field945 = new int[var4.field944];
        var4.field939 = new class107[var4.field944];
        var4.field941 = new int[var4.field944];
        var4.field938 = new byte[var4.field944][][];
        if (arg0 != 4106) {
            field530 = (int[]) null;
        }
        var4.field940 = new int[var4.field944];
        var4.field947 = new class107[var4.field944];
        for (int var5 = 0; var5 < var4.field944; var5++) {
            try {
                int var6 = arg3.method1317((byte) -107);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method1307((byte) 102);
                    String var8 = arg3.method1307((byte) 102);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1346(-8);
                    }
                    var4.field940[var5] = var6;
                    var4.field941[var5] = var9;
                    var4.field947[var5] = arg1.method814(class331.method2296(arg0, -4221), var8, class142.method922(class331.method2296(arg0, -4150), var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method1307((byte) 102);
                    String var11 = arg3.method1307((byte) 102);
                    int var12 = arg3.method1317((byte) -75);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method1307((byte) 102);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1346(-121);
                            var15[var16] = new byte[var17];
                            arg3.method1321(0, -9281, var17, var15[var16]);
                        }
                    }
                    var4.field940[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class142.method922(-54, var13[var19]);
                    }
                    var4.field939[var5] = arg1.method805(class142.method922(arg0 - 4232, var10), var18, var11, -118);
                    var4.field938[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field945[var5] = -1;
            } catch (SecurityException var26) {
                var4.field945[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field945[var5] = -3;
            } catch (Exception var28) {
                var4.field945[var5] = -4;
            } catch (Throwable var29) {
                var4.field945[var5] = -5;
            }
        }
        class328.field5020.method427((byte) 91, var4);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(III)V", line = 289)
    public class27(int arg0, int arg1, int arg2) {
        this.field519 = arg1;
        this.field518 = arg0;
        this.field520 = new int[this.field518][3][arg2];
        this.field523 = new class318[this.field519];
    }
}
