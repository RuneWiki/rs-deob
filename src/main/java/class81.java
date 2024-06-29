import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 extends class128 {

    @OriginalMember(owner = "client!le", name = "C", descriptor = "Z")
    public boolean field2013 = false;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "[[I")
    public static int[][] field2008 = new int[104][104];

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lid;")
    public static class60 field2006 = class11.method72("(U4", (byte) -18);

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lid;")
    public static class60 field2007 = class11.method72("Spiel)2Engine wird gestartet)3)3)3", (byte) 95);

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Lid;")
    public static class60 field2015 = class11.method72("welle2:", (byte) 118);

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lid;")
    private static class60 field2024 = class11.method72("Service unavailable)3", (byte) -1);

    @OriginalMember(owner = "client!le", name = "F", descriptor = "[La;")
    public static class1[] field2016 = new class1[2048];

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lid;")
    private static class60 field2021 = class11.method72("Loading title screen )2 ", (byte) 5);

    @OriginalMember(owner = "client!le", name = "R", descriptor = "Lid;")
    public static class60 field2028 = class11.method72(" )2> ", (byte) -77);

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "Lid;")
    private static class60 field2027 = class11.method72("Close", (byte) 115);

    @OriginalMember(owner = "client!le", name = "S", descriptor = "Lid;")
    public static class60 field2029 = field2021;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Lid;")
    public static class60 field2023 = field2027;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "J")
    public static long field2019 = 0L;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Lid;")
    public static class60 field2010 = field2024;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lid;")
    private static class60 field2017 = class11.method72("Use", (byte) 103);

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Lid;")
    public static class60 field2014 = field2017;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "Ltf;")
    public static class138 field2020;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static int method682(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;Ldd;BII)Lwb;")
    public static final class155 method683(Component arg0, class26 arg1, byte arg2, int arg3, int arg4) {
        field2022++;
        if (class14.field318 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 > -78) {
                method685(null, null, true);
            }
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class155 var5 = (class155) Class.forName("f").getDeclaredConstructor().newInstance();
                var5.field3541 = arg3;
                var5.field3514 = new int[(class144.field3258 ? 2 : 1) * 256];
                var5.method276(arg0);
                var5.field3548 = (-1024 & arg3) + 1024;
                if (var5.field3548 > 16384) {
                    var5.field3548 = 16384;
                }
                var5.method272(var5.field3548);
                if (class60.field1496 > 0 && class45.field1179 == null) {
                    class45.field1179 = new class55();
                    class45.field1179.field1385 = arg1;
                    arg1.method201(class60.field1496, (byte) -57, class45.field1179);
                }
                if (class45.field1179 != null) {
                    if (class45.field1179.field1375[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class45.field1179.field1375[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class57 var6 = new class57(arg1, arg4);
                    var6.field3541 = arg3;
                    var6.field3514 = new int[(class144.field3258 ? 2 : 1) * 256];
                    var6.method276(arg0);
                    var6.field3548 = 16384;
                    var6.method272(var6.field3548);
                    if (class60.field1496 > 0 && class45.field1179 == null) {
                        class45.field1179 = new class55();
                        class45.field1179.field1385 = arg1;
                        arg1.method201(class60.field1496, (byte) -57, class45.field1179);
                    }
                    if (class45.field1179 != null) {
                        if (class45.field1179.field1375[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class45.field1179.field1375[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class155();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static final void method684(int arg0) {
        field2011++;
        class1.field35.method920((byte) 14);
        if (arg0 != 16777215) {
            method685(null, null, true);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lie;Lie;Z)V")
    public static final void method685(class61 arg0, class61 arg1, boolean arg2) {
        field2025++;
        class115.field2713 = arg0;
        class28.field662 = arg1;
        if (!arg2) {
            method683(null, null, (byte) -53, 46, 5);
        }
        class136.field3096 = class28.field662.method479(3, (byte) -98);
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public static void method686(int arg0) {
        field2016 = null;
        field2029 = null;
        field2014 = null;
        field2021 = null;
        field2024 = null;
        field2008 = null;
        field2017 = null;
        field2023 = null;
        field2027 = null;
        field2020 = null;
        field2007 = null;
        field2015 = null;
        if (arg0 != -16385) {
            field2016 = null;
        }
        field2006 = null;
        field2010 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZILid;)V")
    public static final void method687(boolean arg0, int arg1, class60 arg2) {
        field2005++;
        if (arg1 != -1024) {
            method686(111);
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class69.field1656.method948(arg2, 250);
        int var7 = class69.field1656.method957(arg2, 250) * 13;
        class130.method1015(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 - -var3, 0);
        class130.method1019(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 16777215);
        class69.field1656.method953(arg2, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class10.method65(105, var3 + var6 + var3, var5 - var3, var3 + var3 + var7, -var3 + var4);
        if (!arg0) {
            class86.method715(var5, var7, (byte) 40, var4, var6);
            return;
        }
        try {
            Graphics var8 = class9.field148.getGraphics();
            class69.field1660.method63(0, 103, 0, var8);
        } catch (Exception var9) {
            class9.field148.repaint();
        }
    }
}
