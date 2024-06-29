import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class346 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4939 = new String[200];

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4943 = 1;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field4942 = 0;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Ljt;")
    public static class290 field4947 = null;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Lpn;")
    public static class72 field4941 = new class72(57, 7);

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "[I")
    public static int[] field4948 = new int[100];

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Z")
    public static boolean field4949 = true;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Lcr;")
    public static class206 field4945;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 5)
    public static void method2095(int arg0) {
        field4948 = null;
        field4945 = null;
        field4947 = null;
        field4941 = null;
        field4939 = null;
        if (arg0 != 1) {
            field4949 = false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILkd;Lvt;I)V", line = 36)
    public static final void method2096(int arg0, class355 arg1, class179 arg2, int arg3) {
        field4946++;
        class82 var4 = new class82();
        var4.field984 = arg2.method895((byte) -121);
        var4.field981 = arg2.method939((byte) 101);
        var4.field985 = new byte[var4.field984][][];
        var4.field979 = new int[var4.field984];
        var4.field983 = new class405[var4.field984];
        var4.field976 = new class405[var4.field984];
        var4.field978 = new int[var4.field984];
        var4.field977 = new int[var4.field984];
        for (int var5 = 0; var5 < var4.field984; var5++) {
            try {
                int var6 = arg2.method895((byte) -124);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method907(-27652);
                    String var8 = arg2.method907(-27652);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method939((byte) -95);
                    }
                    var4.field979[var5] = var6;
                    var4.field977[var5] = var9;
                    var4.field983[var5] = arg1.method2163((byte) 69, class120.method581(var7, 30827), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method907(-27652);
                    String var11 = arg2.method907(-27652);
                    int var12 = arg2.method895((byte) -75);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method907(-27652);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method939((byte) -125);
                            var15[var16] = new byte[var17];
                            arg2.method919(false, var15[var16], var17, 0);
                        }
                    }
                    var4.field979[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class120.method581(var13[var19], 30827);
                    }
                    var4.field976[var5] = arg1.method2164(class120.method581(var10, 30827), (byte) 56, var11, var18);
                    var4.field985[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field978[var5] = -1;
            } catch (SecurityException var21) {
                var4.field978[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field978[var5] = -3;
            } catch (Exception var23) {
                var4.field978[var5] = -4;
            } catch (Throwable var24) {
                var4.field978[var5] = -5;
            }
        }
        if (arg3 >= -50) {
            method2098((byte) -96);
        }
        class180.field2228.method803(var4, 50);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lab;III)V", line = 153)
    public static final void method2097(class256 arg0, int arg1, int arg2, int arg3) {
        field4940++;
        if (arg1 != 0) {
            field4937 = 43;
        }
        class313 var4 = arg0.method1576(class231.field3205, arg1 + 18785);
        if (var4 == null) {
            return;
        }
        class231.field3205.method1351(arg3, arg2, arg3 + arg0.field3597, arg2 - -arg0.field3707);
        if (class73.field890 < 3) {
            class283.field4125.method2367((float) arg0.field3597 / 2.0F + (float) arg3, (float) arg0.field3707 / 2.0F + (float) arg2, 4096, ((int) (-class349.field5021) & 0x3FFF) << 2, var4, arg3, arg2);
        } else {
            class231.field3205.method1369(-16777216, var4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 179)
    public static final void method2098(byte arg0) {
        field4938++;
        if (class46.field594 != null) {
            class46.field594.method2652(-111);
        }
        if (class460.field6501 != null) {
            class460.field6501.method2652(-100);
        }
        class78.method393(2, 22050, (byte) 84, class364.field5231);
        class46.field594 = class400.method2392(0, 22050, (byte) 56, class126.field1542, class42.field512);
        class46.field594.method2653(class216.field2978, (byte) -115);
        if (arg0 != -100) {
            method2097((class256) null, -2, -127, 82);
        }
        class460.field6501 = class400.method2392(1, 2048, (byte) 77, class126.field1542, class42.field512);
        class460.field6501.method2653(class226.field3136, (byte) -108);
    }
}
