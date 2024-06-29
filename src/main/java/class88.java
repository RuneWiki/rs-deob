import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class88 extends class46 {

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field1001;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1000 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "Lph;")
    public static class114 field995 = new class114(4);

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "Lvm;")
    public static class322 field1003;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "[Llg;")
    public static class20[] field999;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method481(byte arg0, Component arg1) {
        field996++;
        if (arg0 != 55) {
            return;
        }
        Method var2 = class450.field6552;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class179.field2246);
        arg1.addFocusListener(class179.field2246);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method482(byte arg0, String arg1) {
        field998++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class53.method255(-125, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class53.method255(79, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg0 < 41) {
            method486((class369) null, (class450) null, (byte) -5, 15, (Canvas) null, 46);
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class436.method2698(67, var7)) {
                char var8 = class181.method957(var7, (byte) -87);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method215(byte arg0) {
        field991++;
        if (arg0 != -123) {
            this.method215((byte) -2);
        }
        return this.field1001;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)V")
    public static final void method483(boolean arg0, int arg1, int arg2) {
        field994++;
        if (arg0) {
            method487(-102);
        }
        class73.field814[arg2] = arg1;
        class392 var3 = (class392) class126.field1618.method308((long) arg2, (byte) -101);
        if (var3 == null) {
            class392 var4 = new class392(4611686018427387905L);
            class126.field1618.method314((long) arg2, var4, 7079);
        } else if (var3.field5638 != 4611686018427387905L) {
            var3.field5638 = class442.method2730(25207) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lwm;ILjava/lang/String;Z)V")
    public static final void method484(class298 arg0, int arg1, String arg2, boolean arg3) {
        field1002++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class383.field5461.method2529(250, (class20[]) null, arg2, 0);
        int var8 = class383.field5461.method2523(250, 4, arg2, (class20[]) null) * 13;
        field1003.method1614(var5 - var4, -var4 + var6, var7 + var4 + var4, var8 - -var4 + var4, -16777216, 0);
        field1003.method1575(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - (-var4 + -var4), -1, 0);
        arg0.method1762(var7, 0, -1, (int[]) null, true, var5, arg1, arg2, var6, var8, 0, (class20[]) null, (class175) null, 1, 1, -1);
        class136.method735(false, var4 + var8 + var4, var4 + var4 + var7, var5 - var4, -var4 + var6);
        if (arg3) {
            field1003.method1646();
        }
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)V")
    public static final void method485(int arg0) {
        class220.field2943 = null;
        class411.field5943 = null;
        class272.field3677 = null;
        class131.field1696 = null;
        class115.field1436 = null;
        class32.field319 = null;
        class211.field2865 = null;
        class270.field3662 = null;
        if (arg0 != 17802) {
            return;
        }
        field999 = null;
        class105.field1296 = null;
        class291.field3957 = null;
        class105.field1294 = null;
        class119.field1480 = null;
        class382.field5446 = null;
        class437.field6391 = null;
        class209.field2845 = null;
        field997++;
        class111.field1371 = null;
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)Z")
    public final boolean method214(int arg0) {
        if (arg0 > -72) {
            this.field1001 = null;
        }
        field992++;
        return false;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lwa;Ljava/lang/Object;)V")
    public class88(class407 arg0, Object arg1) {
        super(arg0);
        this.field1001 = arg1;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lal;Llh;BILjava/awt/Canvas;I)Lvm;")
    public static final class322 method486(class369 arg0, class450 arg1, byte arg2, int arg3, Canvas arg4, int arg5) {
        if (arg2 < 3) {
            field993 = 29;
        }
        field1004++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class168.field2127[var7]) {
                var6 = var7;
                class168.field2127[var7] = true;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("No free toolkit instances");
        } else if (arg3 == 0) {
            return class233.method1264(arg0, arg4, 2, var6);
        } else if (arg3 == 1) {
            return class422.method2629(arg1, arg4, arg5, var6, arg0, true);
        } else {
            throw new IllegalArgumentException("Unsupported mode");
        }
    }

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V")
    public static void method487(int arg0) {
        field999 = null;
        field1003 = null;
        field1000 = null;
        field995 = null;
        if (arg0 != 10012) {
            method485(30);
        }
    }
}
