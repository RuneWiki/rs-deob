import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class241 {

    @OriginalMember(owner = "client!li", name = "m", descriptor = "J")
    public long field3936 = 0L;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3941 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Z")
    public static boolean field3943 = false;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3944 = new String[500];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Luk;")
    public class104 field3940;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Ljc;")
    public static class323 field3926;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 11)
    public static final void method1690(byte arg0) {
        class276.field4398.method29(true);
        field3933++;
        int var1 = class276.field4398.method35(1, (byte) -40);
        if (var1 == 0) {
            return;
        }
        int var2 = class276.field4398.method35(2, (byte) 3);
        if (var2 == 0) {
            class146.field2641[class119.field2067++] = 2047;
        } else if (var2 == 1) {
            int var11 = class276.field4398.method35(3, (byte) -124);
            class218.field3632.method978(1, var11, -1);
            int var12 = class276.field4398.method35(1, (byte) 101);
            if (var12 == 1) {
                class146.field2641[class119.field2067++] = 2047;
            }
        } else if (var2 == 2) {
            if (class276.field4398.method35(1, (byte) -123) == 1) {
                int var8 = class276.field4398.method35(3, (byte) 90);
                class218.field3632.method978(2, var8, -1);
                int var9 = class276.field4398.method35(3, (byte) -3);
                class218.field3632.method978(2, var9, -1);
            } else {
                int var7 = class276.field4398.method35(3, (byte) 1);
                class218.field3632.method978(0, var7, -1);
            }
            int var10 = class276.field4398.method35(1, (byte) -114);
            if (var10 == 1) {
                class146.field2641[class119.field2067++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class276.field4398.method35(7, (byte) 25);
            int var4 = class276.field4398.method35(7, (byte) -116);
            class205.field3497 = class276.field4398.method35(2, (byte) -115);
            int var5 = class276.field4398.method35(1, (byte) -41);
            if (var5 == 1) {
                class146.field2641[class119.field2067++] = 2047;
            }
            int var6 = class276.field4398.method35(1, (byte) 6);
            class218.field3632.method1536(var4, var6 == 1, var3, (byte) 101);
        } else if (arg0 <= 42) {
            field3941 = (String) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1691(int arg0) {
        if (arg0 != 1) {
            field3926 = (class323) null;
        }
        class262.field4247.method470(12);
        field3935++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 112)
    public static void method1692(int arg0) {
        if (arg0 != -5) {
            field3944 = (String[]) null;
        }
        field3944 = null;
        field3926 = null;
        field3941 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lwe;ILpi;B)V", line = 126)
    public static final void method1693(class59 arg0, int arg1, class336 arg2, byte arg3) {
        field3945++;
        class291 var4 = new class291();
        var4.field4658 = arg2.method2364(arg3 - 8995);
        var4.field4665 = arg2.method2338((byte) 40);
        var4.field4656 = new int[var4.field4658];
        var4.field4662 = new class45[var4.field4658];
        var4.field4661 = new int[var4.field4658];
        if (arg3 != -74) {
            field3944 = (String[]) null;
        }
        var4.field4660 = new class45[var4.field4658];
        var4.field4663 = new byte[var4.field4658][][];
        var4.field4654 = new int[var4.field4658];
        for (int var5 = 0; var5 < var4.field4658; var5++) {
            try {
                int var6 = arg2.method2364(arg3 - 8995);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method2365(125);
                    int var8 = 0;
                    String var9 = arg2.method2365(arg3 ^ 0xFFFFFFCB);
                    if (var6 == 1) {
                        var8 = arg2.method2338((byte) 48);
                    }
                    var4.field4661[var5] = var6;
                    var4.field4654[var5] = var8;
                    var4.field4660[var5] = arg0.method548(var9, class353.method2460(var7, class289.method1969(arg3, -74)), (byte) 117);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method2365(101);
                    String var11 = arg2.method2365(105);
                    int var12 = arg2.method2364(-9069);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method2365(105);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method2338((byte) 59);
                            var15[var16] = new byte[var17];
                            arg2.method2342(var17, 0, var15[var16], false);
                        }
                    }
                    var4.field4661[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class353.method2460(var13[var19], class289.method1969(arg3, -74));
                    }
                    var4.field4662[var5] = arg0.method534(class353.method2460(var10, 0), var11, var18, (byte) 87);
                    var4.field4663[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4656[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4656[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4656[var5] = -3;
            } catch (Exception var28) {
                var4.field4656[var5] = -4;
            } catch (Throwable var29) {
                var4.field4656[var5] = -5;
            }
        }
        class110.field1865.method2303((byte) -124, var4);
    }
}
