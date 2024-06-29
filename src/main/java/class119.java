import java.awt.Component;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class119 extends class7 {

    @OriginalMember(owner = "client!p", name = "B", descriptor = "Lvh;")
    public class200 field1637;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1631 = new Rectangle[100];

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field1636 = 0;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1638;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)Z")
    public abstract boolean method858(byte arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        field1634++;
        class381.field5765 = arg0;
        if (arg1 != 0) {
            field1636 = -15;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BIZ)Z")
    public static final boolean method860(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field1635++;
        boolean var4 = true;
        class186 var5 = new class186(arg1);
        int var6 = -1;
        if (arg3) {
            method861(63);
        }
        label70: while (true) {
            int var7 = var5.method1281((byte) -61);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class127 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1299(-111);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var5.method1322(false);
                                    }
                                    int var10 = var5.method1299(-91);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method1322(arg3) >> 2;
                                    var14 = arg2 + var12;
                                    var15 = arg0 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= (class80.field1003 - 1));
                    } while (var15 >= (class380.field5751 - 1));
                    var16 = class137.method1003(var6, -30796);
                } while (var13 == 22 && !class341.field5267 && var16.field2021 == 0 && var16.field2027 != 1 && !var16.field1992);
                var9 = true;
                if (!var16.method947(-82)) {
                    var4 = false;
                    class239.field3975++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public static void method861(int arg0) {
        field1638 = null;
        field1631 = null;
        if (arg0 != 2) {
            method860(-66, (byte[]) null, 0, true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;IILap;I)Lbp;")
    public static final class216 method862(Component arg0, int arg1, int arg2, class279 arg3, int arg4) {
        if (arg1 != 29522) {
            method860(-20, (byte[]) null, 49, false);
        }
        field1633++;
        if (class413.field6106 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class216 var5 = (class216) Class.forName("pa").getDeclaredConstructor().newInstance();
                var5.field3533 = arg4;
                var5.field3519 = new int[(class29.field339 ? 2 : 1) * 256];
                var5.method1454(arg0);
                var5.field3532 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3532 > 16384) {
                    var5.field3532 = 16384;
                }
                var5.method1459(var5.field3532);
                if (class234.field3902 > 0 && class151.field2358 == null) {
                    class151.field2358 = new class322();
                    class151.field2358.field5037 = arg3;
                    arg3.method1897(class234.field3902, class151.field2358, 2);
                }
                if (class151.field2358 != null) {
                    if (class151.field2358.field5033[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class151.field2358.field5033[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class419 var6 = new class419(arg3, arg2);
                    var6.field3533 = arg4;
                    var6.field3519 = new int[(class29.field339 ? 2 : 1) * 256];
                    var6.method1454(arg0);
                    var6.field3532 = 16384;
                    var6.method1459(var6.field3532);
                    if (class234.field3902 > 0 && class151.field2358 == null) {
                        class151.field2358 = new class322();
                        class151.field2358.field5037 = arg3;
                        arg3.method1897(class234.field3902, class151.field2358, 2);
                    }
                    if (class151.field2358 != null) {
                        if (class151.field2358.field5033[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class151.field2358.field5033[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class216();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method863(byte arg0);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lvh;)V")
    public class119(class200 arg0) {
        this.field1637 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1631[var0] = new Rectangle();
        }
        field1638 = null;
    }
}
