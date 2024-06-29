import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class446 extends class276 {

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public int field6663;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
    public boolean field6664;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public int field6672;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "Z")
    public static boolean field6658 = false;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "Z")
    public static boolean field6674 = true;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "Lec;")
    public static class68 field6673 = null;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "Lhn;")
    public static class284 field6659;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "Lad;")
    public static class506 field6660;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field6661;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)I")
    public static final int method2680(byte arg0, int arg1) {
        if (arg0 <= 26) {
            method2681(null, 81, null, -78);
        }
        field6668++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lia;ILnv;I)V")
    public static final void method2681(class23 arg0, int arg1, class493 arg2, int arg3) {
        field6662++;
        class3 var4 = new class3();
        var4.field32 = arg0.method126((byte) -71);
        var4.field24 = arg0.method143(arg1 ^ 0xFFFFF361);
        var4.field20 = new class169[var4.field32];
        var4.field28 = new int[var4.field32];
        var4.field26 = new class169[var4.field32];
        var4.field22 = new byte[var4.field32][][];
        var4.field19 = new int[var4.field32];
        var4.field30 = new int[var4.field32];
        for (int var5 = 0; var5 < var4.field32; var5++) {
            try {
                int var6 = arg0.method126((byte) -128);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method156((byte) -128);
                    String var8 = arg0.method156((byte) -28);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method143(-3230);
                    }
                    var4.field28[var5] = var6;
                    var4.field19[var5] = var9;
                    var4.field26[var5] = arg2.method2880(class220.method1522(true, var7), var8, class53.method369(arg1, 3));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method156((byte) -29);
                    String var11 = arg0.method156((byte) -115);
                    int var12 = arg0.method126((byte) -86);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method156((byte) -28);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method143(-3230);
                            var15[var16] = new byte[var17];
                            arg0.method128(var15[var16], 0, arg1 ^ 0xFFFFFF84, var17);
                        }
                    }
                    var4.field28[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class220.method1522(true, var13[var19]);
                    }
                    var4.field20[var5] = arg2.method2876(var18, (byte) 27, var11, class220.method1522(true, var10));
                    var4.field22[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field30[var5] = -1;
            } catch (SecurityException var21) {
                var4.field30[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field30[var5] = -3;
            } catch (Exception var23) {
                var4.field30[var5] = -4;
            } catch (Throwable var24) {
                var4.field30[var5] = -5;
            }
        }
        class116.field2068.method2541(0, var4);
        if (arg1 != 3) {
            field6660 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)Z")
    public static final boolean method2682(int arg0, int arg1, int arg2) {
        field6666++;
        if (arg0 != 0) {
            field6660 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
    public static final void method2683(byte arg0) {
        if (arg0 < 91) {
            return;
        }
        field6669++;
        class231 var1 = class302.field4836;
        synchronized (class302.field4836) {
            class302.field4836.method1598(82);
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V")
    public static void method2684(boolean arg0) {
        field6673 = null;
        field6659 = null;
        field6660 = null;
        if (!arg0) {
            field6660 = null;
        }
        field6661 = null;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIZ)V")
    public class446(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6670 = arg4;
        this.field6671 = arg0;
        this.field6663 = arg3;
        this.field6664 = arg5;
        this.field6672 = arg1;
        this.field6667 = arg2;
    }
}
